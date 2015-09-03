/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.fhim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.fhim.FHIMPackage
 * @generated
 */
public interface FHIMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FHIMFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.fhim.impl.FHIMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>My Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Document</em>'.
	 * @generated
	 */
	MyDocument createMyDocument();

	/**
	 * Returns a new object of class '<em>My Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Activity</em>'.
	 * @generated
	 */
	MyActivity createMyActivity();

	/**
	 * Returns a new object of class '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Section</em>'.
	 * @generated
	 */
	MySection createMySection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FHIMPackage getFHIMPackage();

} //FHIMFactory
