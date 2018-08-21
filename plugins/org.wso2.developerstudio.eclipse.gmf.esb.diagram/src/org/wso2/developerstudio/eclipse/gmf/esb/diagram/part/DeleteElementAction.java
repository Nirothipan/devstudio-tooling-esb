package org.wso2.developerstudio.eclipse.gmf.esb.diagram.part;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.tooling.runtime.actions.DefaultDeleteElementAction;
import org.eclipse.ui.IWorkbenchPart;
import org.wso2.developerstudio.eclipse.gmf.esb.ArtifactType;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbServer;
import org.wso2.developerstudio.eclipse.gmf.esb.LocalEntry;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyService;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequences;
import org.wso2.developerstudio.eclipse.gmf.esb.Task;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.Activator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditorUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.debugger.exception.ESBDebuggerException;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.debugger.utils.ESBDebuggerUtil;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

/**
 * @generated
 */
public class DeleteElementAction extends DefaultDeleteElementAction {
	
	private static boolean deleteTriggrred = false;

	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	/**
	 * @generated
	 */
	public DeleteElementAction(IWorkbenchPart part) {
		super(part);
	}

	/**
	 * @generated NOT
	 */
	protected Command getCommand(Request request) {
		List operationSet = getOperationSet();
		if(request instanceof EditCommandRequestWrapper){
			IEditCommandRequest editCommandReq = ((EditCommandRequestWrapper)request).getEditCommandRequest();
			if((editCommandReq) instanceof DestroyElementRequest){
				DestroyElementRequest destroyElementReq = (DestroyElementRequest) editCommandReq;
				if(destroyElementReq.getElementToDestroy()!=null){
					if (ESBDebuggerUtil.isDeleteOperationPerformed()) {
						try {
							ESBDebuggerUtil.modifyBreakpointsAfterMediatorDeletion(false);
						} catch (CoreException | ESBDebuggerException e) {
							//
						}
					} else {
						ESBDebuggerUtil.updateModifiedDebugPoints(false);
					}
					ESBDebuggerUtil.setDeleteOperationPerformed(true);
				}
			}
		}
		if (operationSet.isEmpty()) {
			return UnexecutableCommand.INSTANCE;
		}
		Iterator editParts = operationSet.iterator();
		CompositeTransactionalCommand command = new CompositeTransactionalCommand(getEditingDomain(), getCommandLabel());
		while (editParts.hasNext()) {
			EditPart editPart = (EditPart) editParts.next();
			Command curCommand = editPart.getCommand(request);
			if (curCommand != null) {
				updateConnectedConnectors(editPart);
				command.compose(new CommandProxy(curCommand));
			}
			if (!canDelete(editPart)) {
				//request.
				return UnexecutableCommand.INSTANCE;
			}
		}
		if (command.isEmpty() || command.size() != operationSet.size()) {
			return UnexecutableCommand.INSTANCE;
		}
		return new ICommandProxy(command);
	}

	private void updateConnectedConnectors(EditPart editPart) {
		if (editPart instanceof AbstractMediator) {
			if (ESBDebuggerUtil.isDeleteOperationPerformed()) {
				ESBDebuggerUtil.setDeletedMediator((AbstractMediator) editPart);
				try {
					setDeleteTriggrred(true);
					ESBDebuggerUtil.modifyBreakpointsAfterMediatorDeletion(true);					
				} catch (CoreException | ESBDebuggerException e) {
					log.error(
							"Error while modifing debug points after mediator deletion : "
									+ e.getMessage(), e);
				}
			}
			AbstractInputConnectorEditPart currentInputConnector = EditorUtils
					.getInputConnector((ShapeNodeEditPart) editPart);
			AbstractOutputConnectorEditPart currentOutputConnector = EditorUtils
					.getOutputConnector((ShapeNodeEditPart) editPart);
			if ((currentOutputConnector != null) && (currentOutputConnector.getSourceConnections().size() != 0)) {
				((AbstractMediator) editPart)
						.setConnectedInputConnector((AbstractInputConnectorEditPart) ((EsbLinkEditPart) currentOutputConnector
								.getSourceConnections().get(0)).getTarget());
			}
			if (currentInputConnector.getTargetConnections().size() != 0) {
				((AbstractMediator) editPart)
						.setConnectedOutputConnector((AbstractOutputConnectorEditPart) ((EsbLinkEditPart) currentInputConnector
								.getTargetConnections().get(0)).getSource());
			}
		}
	}

	/**
	 * Determines whether a file can be deleted according to diagram type 
	 * @param editPart
	 * @return
	 */
	private boolean canDelete(EditPart editPart) {
		Object model = editPart.getModel();
		if (model instanceof Shape) {
			return true;
		} else if (model instanceof Node) {
			Node node = (Node) model;
			EObject element = node.getElement();
			if (element == null) {
				return true;
			}
			EObject eContainer = element.eContainer();
			if (eContainer instanceof EsbServer) {
				EsbServer server = (EsbServer) eContainer;
				server.getType();
				if (server.getType() != ArtifactType.SYNAPSE_CONFIG) {
					if (element instanceof ProxyService) {
						return false;
					} else if (element instanceof Sequences) {
						return false;
					} else if (element instanceof Task) {
						return false;
					} else if (element instanceof LocalEntry) {
						return false;
					}
				}
			}
		}

		return true;
	}

	public static boolean isDeleteTriggrred() {
		return deleteTriggrred;
	}

	public static void setDeleteTriggrred(boolean deleteTriggrred) {
		DeleteElementAction.deleteTriggrred = deleteTriggrred;
	}
}
