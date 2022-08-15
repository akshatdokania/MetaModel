/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Signature#getId <em>Id</em>}</li>
 *   <li>{@link metaModel.Signature#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(byte[])
	 * @see metaModel.MetaModelPackage#getSignature_Id()
	 * @model
	 * @generated
	 */
	byte[] getId();

	/**
	 * Sets the value of the '{@link metaModel.Signature#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(byte[] value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(byte[])
	 * @see metaModel.MetaModelPackage#getSignature_Signature()
	 * @model
	 * @generated
	 */
	byte[] getSignature();

	/**
	 * Sets the value of the '{@link metaModel.Signature#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(byte[] value);

} // Signature
