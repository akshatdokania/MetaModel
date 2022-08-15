/**
 */
package metaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Buffer#getBuffer_manager <em>Buffer manager</em>}</li>
 *   <li>{@link metaModel.Buffer#getBuf <em>Buf</em>}</li>
 *   <li>{@link metaModel.Buffer#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link metaModel.Buffer#getToken_manager <em>Token manager</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getBuffer()
 * @model
 * @generated
 */
public interface Buffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Buffer manager</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.Buffer_Manager}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer manager</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getBuffer_Buffer_manager()
	 * @model containment="true"
	 * @generated
	 */
	EList<Buffer_Manager> getBuffer_manager();

	/**
	 * Returns the value of the '<em><b>Buf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buf</em>' attribute.
	 * @see #setBuf(byte[])
	 * @see metaModel.MetaModelPackage#getBuffer_Buf()
	 * @model
	 * @generated
	 */
	byte[] getBuf();

	/**
	 * Sets the value of the '{@link metaModel.Buffer#getBuf <em>Buf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buf</em>' attribute.
	 * @see #getBuf()
	 * @generated
	 */
	void setBuf(byte[] value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see metaModel.MetaModelPackage#getBuffer_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link metaModel.Buffer#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Token manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token manager</em>' reference.
	 * @see #setToken_manager(Token_Manager)
	 * @see metaModel.MetaModelPackage#getBuffer_Token_manager()
	 * @model
	 * @generated
	 */
	Token_Manager getToken_manager();

	/**
	 * Sets the value of the '{@link metaModel.Buffer#getToken_manager <em>Token manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token manager</em>' reference.
	 * @see #getToken_manager()
	 * @generated
	 */
	void setToken_manager(Token_Manager value);

} // Buffer
