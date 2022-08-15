/**
 */
package metaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>De Fi User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.DeFi_User#getDefi_lending_pool <em>Defi lending pool</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getDeFi_User()
 * @model
 * @generated
 */
public interface DeFi_User extends Contract {
	/**
	 * Returns the value of the '<em><b>Defi lending pool</b></em>' reference list.
	 * The list contents are of type {@link metaModel.DeFi_Lending_Pool}.
	 * It is bidirectional and its opposite is '{@link metaModel.DeFi_Lending_Pool#getDefi_user <em>Defi user</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defi lending pool</em>' reference list.
	 * @see metaModel.MetaModelPackage#getDeFi_User_Defi_lending_pool()
	 * @see metaModel.DeFi_Lending_Pool#getDefi_user
	 * @model opposite="defi_user"
	 * @generated
	 */
	EList<DeFi_Lending_Pool> getDefi_lending_pool();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void loan();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deposit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void borrow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void repay();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void redeem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void swap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recieve();

} // DeFi_User
