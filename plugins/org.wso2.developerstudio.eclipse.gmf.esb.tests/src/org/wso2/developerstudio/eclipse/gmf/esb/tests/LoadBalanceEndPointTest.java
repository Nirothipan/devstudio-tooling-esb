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
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Load Balance End Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#getMember() <em>Member</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class LoadBalanceEndPointTest extends ParentEndPointTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoadBalanceEndPointTest.class);
	}

	/**
	 * Constructs a new Load Balance End Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalanceEndPointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Load Balance End Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LoadBalanceEndPoint getFixture() {
		return (LoadBalanceEndPoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EsbFactory.eINSTANCE.createLoadBalanceEndPoint());
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

	/**
	 * Tests the '{@link org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#getMember() <em>Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint#getMember()
	 * @generated
	 */
	public void testGetMember() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //LoadBalanceEndPointTest
