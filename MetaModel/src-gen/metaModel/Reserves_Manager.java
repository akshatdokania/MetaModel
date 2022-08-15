/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reserves Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Reserves_Manager#getDefi_lending_core <em>Defi lending core</em>}</li>
 *   <li>{@link metaModel.Reserves_Manager#getToken_manager <em>Token manager</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getReserves_Manager()
 * @model
 * @generated
 */
public interface Reserves_Manager extends EObject {
	/**
	 * Returns the value of the '<em><b>Defi lending core</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.DeFi_Lending_Core#getReserves_manager <em>Reserves manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defi lending core</em>' reference.
	 * @see #setDefi_lending_core(DeFi_Lending_Core)
	 * @see metaModel.MetaModelPackage#getReserves_Manager_Defi_lending_core()
	 * @see metaModel.DeFi_Lending_Core#getReserves_manager
	 * @model opposite="reserves_manager"
	 * @generated
	 */
	DeFi_Lending_Core getDefi_lending_core();

	/**
	 * Sets the value of the '{@link metaModel.Reserves_Manager#getDefi_lending_core <em>Defi lending core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defi lending core</em>' reference.
	 * @see #getDefi_lending_core()
	 * @generated
	 */
	void setDefi_lending_core(DeFi_Lending_Core value);

	/**
	 * Returns the value of the '<em><b>Token manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token manager</em>' reference.
	 * @see #setToken_manager(Token_Manager)
	 * @see metaModel.MetaModelPackage#getReserves_Manager_Token_manager()
	 * @model
	 * @generated
	 */
	Token_Manager getToken_manager();

	/**
	 * Sets the value of the '{@link metaModel.Reserves_Manager#getToken_manager <em>Token manager</em>}' reference.
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
	void activate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deactivate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void freeze();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unfreeze();

} // Reserves_Manager
