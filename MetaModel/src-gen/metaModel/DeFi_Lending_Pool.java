/**
 */
package metaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>De Fi Lending Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.DeFi_Lending_Pool#getDefi_user <em>Defi user</em>}</li>
 *   <li>{@link metaModel.DeFi_Lending_Pool#getDefi_lending_core <em>Defi lending core</em>}</li>
 *   <li>{@link metaModel.DeFi_Lending_Pool#getLendingPoolAddress <em>Lending Pool Address</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getDeFi_Lending_Pool()
 * @model
 * @generated
 */
public interface DeFi_Lending_Pool extends EObject {
	/**
	 * Returns the value of the '<em><b>Defi user</b></em>' reference list.
	 * The list contents are of type {@link metaModel.DeFi_User}.
	 * It is bidirectional and its opposite is '{@link metaModel.DeFi_User#getDefi_lending_pool <em>Defi lending pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defi user</em>' reference list.
	 * @see metaModel.MetaModelPackage#getDeFi_Lending_Pool_Defi_user()
	 * @see metaModel.DeFi_User#getDefi_lending_pool
	 * @model opposite="defi_lending_pool"
	 * @generated
	 */
	EList<DeFi_User> getDefi_user();

	/**
	 * Returns the value of the '<em><b>Defi lending core</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.DeFi_Lending_Core}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defi lending core</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getDeFi_Lending_Pool_Defi_lending_core()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeFi_Lending_Core> getDefi_lending_core();

	/**
	 * Returns the value of the '<em><b>Lending Pool Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lending Pool Address</em>' attribute.
	 * @see #setLendingPoolAddress(String)
	 * @see metaModel.MetaModelPackage#getDeFi_Lending_Pool_LendingPoolAddress()
	 * @model dataType="metaModel.AddressDType"
	 * @generated
	 */
	String getLendingPoolAddress();

	/**
	 * Sets the value of the '{@link metaModel.DeFi_Lending_Pool#getLendingPoolAddress <em>Lending Pool Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lending Pool Address</em>' attribute.
	 * @see #getLendingPoolAddress()
	 * @generated
	 */
	void setLendingPoolAddress(String value);

} // DeFi_Lending_Pool
