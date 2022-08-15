/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wallet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Wallet#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getWallet()
 * @model
 * @generated
 */
public interface Wallet extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.User#getWallet <em>Wallet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see metaModel.MetaModelPackage#getWallet_User()
	 * @see metaModel.User#getWallet
	 * @model opposite="wallet"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link metaModel.Wallet#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

} // Wallet
