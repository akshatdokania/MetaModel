/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Currency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Currency#getToken_manager <em>Token manager</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getCurrency()
 * @model
 * @generated
 */
public interface Currency extends EObject {
	/**
	 * Returns the value of the '<em><b>Token manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token manager</em>' reference.
	 * @see #setToken_manager(Token_Manager)
	 * @see metaModel.MetaModelPackage#getCurrency_Token_manager()
	 * @model
	 * @generated
	 */
	Token_Manager getToken_manager();

	/**
	 * Sets the value of the '{@link metaModel.Currency#getToken_manager <em>Token manager</em>}' reference.
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
	 * @model kind="operation"
	 * @generated
	 */
	void getConversionRate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void convert();

} // Currency
