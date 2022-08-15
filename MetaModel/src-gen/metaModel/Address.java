/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Address#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link metaModel.Address#getContract <em>Contract</em>}</li>
 *   <li>{@link metaModel.Address#getUser <em>User</em>}</li>
 *   <li>{@link metaModel.Address#getAddr <em>Addr</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.Transaction#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' reference.
	 * @see #setTransaction(Transaction)
	 * @see metaModel.MetaModelPackage#getAddress_Transaction()
	 * @see metaModel.Transaction#getAddress
	 * @model opposite="address"
	 * @generated
	 */
	Transaction getTransaction();

	/**
	 * Sets the value of the '{@link metaModel.Address#getTransaction <em>Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' reference.
	 * @see #getTransaction()
	 * @generated
	 */
	void setTransaction(Transaction value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.Contract#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' reference.
	 * @see #setContract(Contract)
	 * @see metaModel.MetaModelPackage#getAddress_Contract()
	 * @see metaModel.Contract#getAddress
	 * @model opposite="address"
	 * @generated
	 */
	Contract getContract();

	/**
	 * Sets the value of the '{@link metaModel.Address#getContract <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Contract value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.User#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see metaModel.MetaModelPackage#getAddress_User()
	 * @see metaModel.User#getAddress
	 * @model opposite="address"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link metaModel.Address#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr</em>' attribute.
	 * @see #setAddr(String)
	 * @see metaModel.MetaModelPackage#getAddress_Addr()
	 * @model
	 * @generated
	 */
	String getAddr();

	/**
	 * Sets the value of the '{@link metaModel.Address#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(String value);

} // Address
