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

import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Failover End Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailoverEndPointTest extends ParentEndPointTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FailoverEndPointTest.class);
	}

	/**
	 * Constructs a new Failover End Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailoverEndPointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Failover End Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FailoverEndPoint getFixture() {
		return (FailoverEndPoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EsbFactory.eINSTANCE.createFailoverEndPoint());
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

} //FailoverEndPointTest
