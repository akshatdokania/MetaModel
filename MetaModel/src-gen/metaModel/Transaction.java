/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Transaction#getAddress <em>Address</em>}</li>
 *   <li>{@link metaModel.Transaction#getUser <em>User</em>}</li>
 *   <li>{@link metaModel.Transaction#getSignaturevalidator <em>Signaturevalidator</em>}</li>
 *   <li>{@link metaModel.Transaction#getTo <em>To</em>}</li>
 *   <li>{@link metaModel.Transaction#getFrom <em>From</em>}</li>
 *   <li>{@link metaModel.Transaction#getHash <em>Hash</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.Address#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(Address)
	 * @see metaModel.MetaModelPackage#getTransaction_Address()
	 * @see metaModel.Address#getTransaction
	 * @model opposite="transaction"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link metaModel.Transaction#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.User#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see metaModel.MetaModelPackage#getTransaction_User()
	 * @see metaModel.User#getTransaction
	 * @model opposite="transaction"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link metaModel.Transaction#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Signaturevalidator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signaturevalidator</em>' reference.
	 * @see #setSignaturevalidator(SignatureValidator)
	 * @see metaModel.MetaModelPackage#getTransaction_Signaturevalidator()
	 * @model
	 * @generated
	 */
	SignatureValidator getSignaturevalidator();

	/**
	 * Sets the value of the '{@link metaModel.Transaction#getSignaturevalidator <em>Signaturevalidator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signaturevalidator</em>' reference.
	 * @see #getSignaturevalidator()
	 * @generated
	 */
	void setSignaturevalidator(SignatureValidator value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see metaModel.MetaModelPackage#getTransaction_To()
	 * @model dataType="metaModel.AddressDType"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link metaModel.Transaction#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see metaModel.MetaModelPackage#getTransaction_From()
	 * @model dataType="metaModel.AddressDType"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link metaModel.Transaction#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash</em>' attribute.
	 * @see #setHash(String)
	 * @see metaModel.MetaModelPackage#getTransaction_Hash()
	 * @model
	 * @generated
	 */
	String getHash();

	/**
	 * Sets the value of the '{@link metaModel.Transaction#getHash <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' attribute.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(String value);

} // Transaction
