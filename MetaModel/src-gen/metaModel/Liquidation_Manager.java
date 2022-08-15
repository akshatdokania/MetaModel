/**
 */
package metaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Liquidation Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Liquidation_Manager#getLiquidator <em>Liquidator</em>}</li>
 *   <li>{@link metaModel.Liquidation_Manager#getToken_manager <em>Token manager</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getLiquidation_Manager()
 * @model
 * @generated
 */
public interface Liquidation_Manager extends EObject {
	/**
	 * Returns the value of the '<em><b>Liquidator</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.Liquidator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liquidator</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getLiquidation_Manager_Liquidator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Liquidator> getLiquidator();

	/**
	 * Returns the value of the '<em><b>Token manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token manager</em>' reference.
	 * @see #setToken_manager(Token_Manager)
	 * @see metaModel.MetaModelPackage#getLiquidation_Manager_Token_manager()
	 * @model
	 * @generated
	 */
	Token_Manager getToken_manager();

	/**
	 * Sets the value of the '{@link metaModel.Liquidation_Manager#getToken_manager <em>Token manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token manager</em>' reference.
	 * @see #getToken_manager()
	 * @generated
	 */
	void setToken_manager(Token_Manager value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void mint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bum();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateLiquidateFee();

} // Liquidation_Manager
