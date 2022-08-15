/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.User#getAddress <em>Address</em>}</li>
 *   <li>{@link metaModel.User#getWallet <em>Wallet</em>}</li>
 *   <li>{@link metaModel.User#getTransaction <em>Transaction</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.Address#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(Address)
	 * @see metaModel.MetaModelPackage#getUser_Address()
	 * @see metaModel.Address#getUser
	 * @model opposite="user"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link metaModel.User#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Wallet</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.Wallet#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wallet</em>' reference.
	 * @see #setWallet(Wallet)
	 * @see metaModel.MetaModelPackage#getUser_Wallet()
	 * @see metaModel.Wallet#getUser
	 * @model opposite="user"
	 * @generated
	 */
	Wallet getWallet();

	/**
	 * Sets the value of the '{@link metaModel.User#getWallet <em>Wallet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wallet</em>' reference.
	 * @see #getWallet()
	 * @generated
	 */
	void setWallet(Wallet value);

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.Transaction#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' reference.
	 * @see #setTransaction(Transaction)
	 * @see metaModel.MetaModelPackage#getUser_Transaction()
	 * @see metaModel.Transaction#getUser
	 * @model opposite="user"
	 * @generated
	 */
	Transaction getTransaction();

	/**
	 * Sets the value of the '{@link metaModel.User#getTransaction <em>Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' reference.
	 * @see #getTransaction()
	 * @generated
	 */
	void setTransaction(Transaction value);

} // User
