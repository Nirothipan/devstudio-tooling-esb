/**
 * Copyright 2009-2012 WSO2, Inc. (http://wso2.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.developerstudio.eclipse.gmf.esb.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>esb</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EsbTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new EsbTests("esb Tests");
		suite.addTestSuite(CallMediatorInputConnectorTest.class);
		suite.addTestSuite(CallMediatorOutputConnectorTest.class);
		suite.addTestSuite(CallMediatorEndpointOutputConnectorTest.class);
		suite.addTestSuite(ProxyOutputConnectorTest.class);
		suite.addTestSuite(ProxyInputConnectorTest.class);
		suite.addTestSuite(ProxyOutSequenceOutputConnectorTest.class);
		suite.addTestSuite(ProxyInSequenceInputConnectorTest.class);
		suite.addTestSuite(ProxyFaultInputConnectorTest.class);
		suite.addTestSuite(MessageInputConnectorTest.class);
		suite.addTestSuite(MessageOutputConnectorTest.class);
		suite.addTestSuite(DefaultEndPointInputConnectorTest.class);
		suite.addTestSuite(DefaultEndPointOutputConnectorTest.class);
		suite.addTestSuite(AddressEndPointInputConnectorTest.class);
		suite.addTestSuite(AddressEndPointOutputConnectorTest.class);
		suite.addTestSuite(TemplateEndpointInputConnectorTest.class);
		suite.addTestSuite(TemplateEndpointOutputConnectorTest.class);
		suite.addTestSuite(HTTPEndPointInputConnectorTest.class);
		suite.addTestSuite(HTTPEndPointOutputConnectorTest.class);
		suite.addTestSuite(DropMediatorInputConnectorTest.class);
		suite.addTestSuite(FilterMediatorInputConnectorTest.class);
		suite.addTestSuite(FilterMediatorOutputConnectorTest.class);
		suite.addTestSuite(FilterMediatorPassOutputConnectorTest.class);
		suite.addTestSuite(FilterMediatorFailOutputConnectorTest.class);
		suite.addTestSuite(MergeNodeFirstInputConnectorTest.class);
		suite.addTestSuite(MergeNodeSecondInputConnectorTest.class);
		suite.addTestSuite(MergeNodeOutputConnectorTest.class);
		suite.addTestSuite(LogMediatorInputConnectorTest.class);
		suite.addTestSuite(LogMediatorOutputConnectorTest.class);
		suite.addTestSuite(PublishEventMediatorInputConnectorTest.class);
		suite.addTestSuite(PublishEventMediatorOutputConnectorTest.class);
		suite.addTestSuite(BAMMediatorInputConnectorTest.class);
		suite.addTestSuite(BAMMediatorOutputConnectorTest.class);
		suite.addTestSuite(BeanMediatorInputConnectorTest.class);
		suite.addTestSuite(BeanMediatorOutputConnectorTest.class);
		suite.addTestSuite(EJBMediatorInputConnectorTest.class);
		suite.addTestSuite(EJBMediatorOutputConnectorTest.class);
		suite.addTestSuite(PropertyMediatorInputConnectorTest.class);
		suite.addTestSuite(PropertyMediatorOutputConnectorTest.class);
		suite.addTestSuite(EnrichMediatorInputConnectorTest.class);
		suite.addTestSuite(EnrichMediatorOutputConnectorTest.class);
		suite.addTestSuite(XSLTMediatorInputConnectorTest.class);
		suite.addTestSuite(XSLTMediatorOutputConnectorTest.class);
		suite.addTestSuite(SwitchCaseBranchOutputConnectorTest.class);
		suite.addTestSuite(SwitchDefaultBranchOutputConnectorTest.class);
		suite.addTestSuite(SwitchMediatorInputConnectorTest.class);
		suite.addTestSuite(SwitchMediatorOutputConnectorTest.class);
		suite.addTestSuite(EsbSequenceInputConnectorTest.class);
		suite.addTestSuite(EsbSequenceOutputConnectorTest.class);
		suite.addTestSuite(SequenceInputConnectorTest.class);
		suite.addTestSuite(SequenceOutputConnectorTest.class);
		suite.addTestSuite(EventMediatorInputConnectorTest.class);
		suite.addTestSuite(EventMediatorOutputConnectorTest.class);
		suite.addTestSuite(EntitlementMediatorInputConnectorTest.class);
		suite.addTestSuite(EntitlementMediatorOutputConnectorTest.class);
		suite.addTestSuite(EntitlementMediatorOnRejectOutputConnectorTest.class);
		suite.addTestSuite(EntitlementMediatorOnAcceptOutputConnectorTest.class);
		suite.addTestSuite(EntitlementMediatorAdviceOutputConnectorTest.class);
		suite.addTestSuite(EntitlementMediatorObligationsOutputConnectorTest.class);
		suite.addTestSuite(EnqueueMediatorInputConnectorTest.class);
		suite.addTestSuite(EnqueueMediatorOutputConnectorTest.class);
		suite.addTestSuite(ClassMediatorInputConnectorTest.class);
		suite.addTestSuite(ClassMediatorOutputConnectorTest.class);
		suite.addTestSuite(SpringMediatorInputConnectorTest.class);
		suite.addTestSuite(SpringMediatorOutputConnectorTest.class);
		suite.addTestSuite(ScriptMediatorInputConnectorTest.class);
		suite.addTestSuite(ScriptMediatorOutputConnectorTest.class);
		suite.addTestSuite(FaultMediatorInputConnectorTest.class);
		suite.addTestSuite(FaultMediatorOutputConnectorTest.class);
		suite.addTestSuite(AggregateMediatorInputConnectorTest.class);
		suite.addTestSuite(AggregateMediatorOutputConnectorTest.class);
		suite.addTestSuite(AggregateMediatorOnCompleteOutputConnectorTest.class);
		suite.addTestSuite(RouterMediatorInputConnectorTest.class);
		suite.addTestSuite(RouterMediatorOutputConnectorTest.class);
		suite.addTestSuite(RouterMediatorTargetOutputConnectorTest.class);
		suite.addTestSuite(CloneMediatorInputConnectorTest.class);
		suite.addTestSuite(CloneMediatorOutputConnectorTest.class);
		suite.addTestSuite(CloneMediatorTargetOutputConnectorTest.class);
		suite.addTestSuite(ForEachMediatorInputConnectorTest.class);
		suite.addTestSuite(ForEachMediatorOutputConnectorTest.class);
		suite.addTestSuite(ForEachMediatorTargetOutputConnectorTest.class);
		suite.addTestSuite(IterateMediatorInputConnectorTest.class);
		suite.addTestSuite(IterateMediatorOutputConnectorTest.class);
		suite.addTestSuite(IterateMediatorTargetOutputConnectorTest.class);
		suite.addTestSuite(CacheMediatorInputConnectorTest.class);
		suite.addTestSuite(CacheMediatorOutputConnectorTest.class);
		suite.addTestSuite(CacheMediatorOnHitOutputConnectorTest.class);
		suite.addTestSuite(XQueryMediatorInputConnectorTest.class);
		suite.addTestSuite(XQueryMediatorOutputConnectorTest.class);
		suite.addTestSuite(CalloutMediatorInputConnectorTest.class);
		suite.addTestSuite(CalloutMediatorOutputConnectorTest.class);
		suite.addTestSuite(RMSequenceMediatorInputConnectorTest.class);
		suite.addTestSuite(RMSequenceMediatorOutputConnectorTest.class);
		suite.addTestSuite(TransactionMediatorInputConnectorTest.class);
		suite.addTestSuite(TransactionMediatorOutputConnectorTest.class);
		suite.addTestSuite(OAuthMediatorInputConnectorTest.class);
		suite.addTestSuite(OAuthMediatorOutputConnectorTest.class);
		suite.addTestSuite(HeaderMediatorInputConnectorTest.class);
		suite.addTestSuite(HeaderMediatorOutputConnectorTest.class);
		suite.addTestSuite(ThrottleMediatorInputConnectorTest.class);
		suite.addTestSuite(ThrottleMediatorOutputConnectorTest.class);
		suite.addTestSuite(ThrottleMediatorOnAcceptOutputConnectorTest.class);
		suite.addTestSuite(ThrottleMediatorOnRejectOutputConnectorTest.class);
		suite.addTestSuite(CommandMediatorInputConnectorTest.class);
		suite.addTestSuite(CommandMediatorOutputConnectorTest.class);
		suite.addTestSuite(DBLookupMediatorInputConnectorTest.class);
		suite.addTestSuite(DBLookupMediatorOutputConnectorTest.class);
		suite.addTestSuite(DBReportMediatorInputConnectorTest.class);
		suite.addTestSuite(DBReportMediatorOutputConnectorTest.class);
		suite.addTestSuite(RuleMediatorInputConnectorTest.class);
		suite.addTestSuite(RuleMediatorOutputConnectorTest.class);
		suite.addTestSuite(RuleMediatorChildMediatorsOutputConnectorTest.class);
		suite.addTestSuite(CallTemplateMediatorInputConnectorTest.class);
		suite.addTestSuite(CallTemplateMediatorOutputConnectorTest.class);
		suite.addTestSuite(LoopBackMediatorInputConnectorTest.class);
		suite.addTestSuite(LoopBackMediatorOutputConnectorTest.class);
		suite.addTestSuite(RespondMediatorInputConnectorTest.class);
		suite.addTestSuite(RespondMediatorOutputConnectorTest.class);
		suite.addTestSuite(SmooksMediatorInputConnectorTest.class);
		suite.addTestSuite(SmooksMediatorOutputConnectorTest.class);
		suite.addTestSuite(StoreMediatorInputConnectorTest.class);
		suite.addTestSuite(StoreMediatorOutputConnectorTest.class);
		suite.addTestSuite(BuilderMediatorInputConnectorTest.class);
		suite.addTestSuite(BuilderMediatorOutputConectorTest.class);
		suite.addTestSuite(PayloadFactoryMediatorInputConnectorTest.class);
		suite.addTestSuite(PayloadFactoryMediatorOutputConnectorTest.class);
		suite.addTestSuite(ConditionalRouterMediatorInputConnectorTest.class);
		suite.addTestSuite(ConditionalRouterMediatorOutputConnectorTest.class);
		suite.addTestSuite(ConditionalRouterMediatorAdditionalOutputConnectorTest.class);
		suite.addTestSuite(SendMediatorInputConnectorTest.class);
		suite.addTestSuite(SendMediatorOutputConnectorTest.class);
		suite.addTestSuite(SendMediatorEndpointOutputConnectorTest.class);
		suite.addTestSuite(FailoverEndPointInputConnectorTest.class);
		suite.addTestSuite(FailoverEndPointOutputConnectorTest.class);
		suite.addTestSuite(FailoverEndPointWestOutputConnectorTest.class);
		suite.addTestSuite(WSDLEndPointInputConnectorTest.class);
		suite.addTestSuite(WSDLEndPointOutputConnectorTest.class);
		suite.addTestSuite(LoadBalanceEndPointTest.class);
		suite.addTestSuite(LoadBalanceEndPointInputConnectorTest.class);
		suite.addTestSuite(LoadBalanceEndPointOutputConnectorTest.class);
		suite.addTestSuite(LoadBalanceEndPointWestOutputConnectorTest.class);
		suite.addTestSuite(SequencesOutputConnectorTest.class);
		suite.addTestSuite(SequencesInputConnectorTest.class);
		suite.addTestSuite(URLRewriteMediatorInputConnectorTest.class);
		suite.addTestSuite(URLRewriteMediatorOutputConnectorTest.class);
		suite.addTestSuite(ValidateMediatorInputConnectorTest.class);
		suite.addTestSuite(ValidateMediatorOutputConnectorTest.class);
		suite.addTestSuite(ValidateMediatorOnFailOutputConnectorTest.class);
		suite.addTestSuite(NamedEndpointInputConnectorTest.class);
		suite.addTestSuite(NamedEndpointOutputConnectorTest.class);
		suite.addTestSuite(APIResourceInputConnectorTest.class);
		suite.addTestSuite(APIResourceOutputConnectorTest.class);
		suite.addTestSuite(APIResourceOutSequenceOutputConnectorTest.class);
		suite.addTestSuite(APIResourceInSequenceInputConnectorTest.class);
		suite.addTestSuite(APIResourceFaultInputConnectorTest.class);
		suite.addTestSuite(APIResourceEndpointInputConnectorTest.class);
		suite.addTestSuite(APIResourceEndpointOutputConnectorTest.class);
		suite.addTestSuite(ComplexEndpointsOutputConnectorTest.class);
		suite.addTestSuite(AddressingEndpointInputConnectorTest.class);
		suite.addTestSuite(AddressingEndpointOutputConnectorTest.class);
		suite.addTestSuite(RecipientListEndPointInputConnectorTest.class);
		suite.addTestSuite(RecipientListEndPointOutputConnectorTest.class);
		suite.addTestSuite(RecipientListEndPointWestOutputConnectorTest.class);
		suite.addTestSuite(CloudConnectorInputConnectorTest.class);
		suite.addTestSuite(CloudConnectorOutputConnectorTest.class);
		suite.addTestSuite(CloudConnectorOperationInputConnectorTest.class);
		suite.addTestSuite(CloudConnectorOperationOutputConnectorTest.class);
		suite.addTestSuite(DataMapperMediatorInputConnectorTest.class);
		suite.addTestSuite(DataMapperMediatorOutputConnectorTest.class);
		suite.addTestSuite(FastXSLTMediatorInputConnectorTest.class);
		suite.addTestSuite(FastXSLTMediatorOutputConnectorTest.class);
		suite.addTestSuite(InboundEndpointSequenceInputConnectorTest.class);
		suite.addTestSuite(InboundEndpointSequenceOutputConnectorTest.class);
		suite.addTestSuite(InboundEndpointOnErrorSequenceOutputConnectorTest.class);
		suite.addTestSuite(InboundEndpointOnErrorSequenceInputConnectorTest.class);
		suite.addTestSuite(DropMediatorOutputConnectorTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsbTests(String name) {
		super(name);
	}

} //EsbTests
