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

import junit.textui.TestRunner;

import org.wso2.developerstudio.eclipse.gmf.esb.BuilderMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Builder Mediator Input Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuilderMediatorInputConnectorTest extends InputConnectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BuilderMediatorInputConnectorTest.class);
	}

	/**
	 * Constructs a new Builder Mediator Input Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderMediatorInputConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Builder Mediator Input Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BuilderMediatorInputConnector getFixture() {
		return (BuilderMediatorInputConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EsbFactory.eINSTANCE.createBuilderMediatorInputConnector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BuilderMediatorInputConnectorTest
