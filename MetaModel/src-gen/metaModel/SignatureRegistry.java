/**
 */
package metaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.SignatureRegistry#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link metaModel.SignatureRegistry#getSignaturevalidator <em>Signaturevalidator</em>}</li>
 *   <li>{@link metaModel.SignatureRegistry#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getSignatureRegistry()
 * @model
 * @generated
 */
public interface SignatureRegistry extends EObject {
	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getSignatureRegistry_Signatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signature> getSignatures();

	/**
	 * Returns the value of the '<em><b>Signaturevalidator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.SignatureValidator#getSignatureregistry <em>Signatureregistry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signaturevalidator</em>' reference.
	 * @see #setSignaturevalidator(SignatureValidator)
	 * @see metaModel.MetaModelPackage#getSignatureRegistry_Signaturevalidator()
	 * @see metaModel.SignatureValidator#getSignatureregistry
	 * @model opposite="signatureregistry"
	 * @generated
	 */
	SignatureValidator getSignaturevalidator();

	/**
	 * Sets the value of the '{@link metaModel.SignatureRegistry#getSignaturevalidator <em>Signaturevalidator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signaturevalidator</em>' reference.
	 * @see #getSignaturevalidator()
	 * @generated
	 */
	void setSignaturevalidator(SignatureValidator value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(Object)
	 * @see metaModel.MetaModelPackage#getSignatureRegistry_Signature()
	 * @model
	 * @generated
	 */
	Object getSignature();

	/**
	 * Sets the value of the '{@link metaModel.SignatureRegistry#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerSignature();

} // SignatureRegistry
