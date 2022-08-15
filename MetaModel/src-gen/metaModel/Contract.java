/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Contract#getAddress <em>Address</em>}</li>
 *   <li>{@link metaModel.Contract#getDapp <em>Dapp</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getContract()
 * @model abstract="true"
 * @generated
 */
public interface Contract extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.Address#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(Address)
	 * @see metaModel.MetaModelPackage#getContract_Address()
	 * @see metaModel.Address#getContract
	 * @model opposite="contract"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link metaModel.Contract#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Dapp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.DApp#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dapp</em>' reference.
	 * @see #setDapp(DApp)
	 * @see metaModel.MetaModelPackage#getContract_Dapp()
	 * @see metaModel.DApp#getContract
	 * @model opposite="contract"
	 * @generated
	 */
	DApp getDapp();

	/**
	 * Sets the value of the '{@link metaModel.Contract#getDapp <em>Dapp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dapp</em>' reference.
	 * @see #getDapp()
	 * @generated
	 */
	void setDapp(DApp value);

} // Contract
