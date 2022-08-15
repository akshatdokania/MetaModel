/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Request#getBuffer_manager <em>Buffer manager</em>}</li>
 *   <li>{@link metaModel.Request#getId <em>Id</em>}</li>
 *   <li>{@link metaModel.Request#getCallBackAddress <em>Call Back Address</em>}</li>
 *   <li>{@link metaModel.Request#getBuf <em>Buf</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends EObject {
	/**
	 * Returns the value of the '<em><b>Buffer manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer manager</em>' reference.
	 * @see #setBuffer_manager(Buffer_Manager)
	 * @see metaModel.MetaModelPackage#getRequest_Buffer_manager()
	 * @model
	 * @generated
	 */
	Buffer_Manager getBuffer_manager();

	/**
	 * Sets the value of the '{@link metaModel.Request#getBuffer_manager <em>Buffer manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer manager</em>' reference.
	 * @see #getBuffer_manager()
	 * @generated
	 */
	void setBuffer_manager(Buffer_Manager value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(byte)
	 * @see metaModel.MetaModelPackage#getRequest_Id()
	 * @model
	 * @generated
	 */
	byte getId();

	/**
	 * Sets the value of the '{@link metaModel.Request#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(byte value);

	/**
	 * Returns the value of the '<em><b>Call Back Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Back Address</em>' attribute.
	 * @see #setCallBackAddress(String)
	 * @see metaModel.MetaModelPackage#getRequest_CallBackAddress()
	 * @model dataType="metaModel.AddressDType"
	 * @generated
	 */
	String getCallBackAddress();

	/**
	 * Sets the value of the '{@link metaModel.Request#getCallBackAddress <em>Call Back Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Back Address</em>' attribute.
	 * @see #getCallBackAddress()
	 * @generated
	 */
	void setCallBackAddress(String value);

	/**
	 * Returns the value of the '<em><b>Buf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buf</em>' attribute.
	 * @see #setBuf(Object)
	 * @see metaModel.MetaModelPackage#getRequest_Buf()
	 * @model
	 * @generated
	 */
	Object getBuf();

	/**
	 * Sets the value of the '{@link metaModel.Request#getBuf <em>Buf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buf</em>' attribute.
	 * @see #getBuf()
	 * @generated
	 */
	void setBuf(Object value);

} // Request
