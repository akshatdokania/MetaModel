/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.SignatureValidator#getSignatureregistry <em>Signatureregistry</em>}</li>
 *   <li>{@link metaModel.SignatureValidator#getEcdsa <em>Ecdsa</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getSignatureValidator()
 * @model
 * @generated
 */
public interface SignatureValidator extends EObject {
	/**
	 * Returns the value of the '<em><b>Signatureregistry</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.SignatureRegistry#getSignaturevalidator <em>Signaturevalidator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatureregistry</em>' reference.
	 * @see #setSignatureregistry(SignatureRegistry)
	 * @see metaModel.MetaModelPackage#getSignatureValidator_Signatureregistry()
	 * @see metaModel.SignatureRegistry#getSignaturevalidator
	 * @model opposite="signaturevalidator"
	 * @generated
	 */
	SignatureRegistry getSignatureregistry();

	/**
	 * Sets the value of the '{@link metaModel.SignatureValidator#getSignatureregistry <em>Signatureregistry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signatureregistry</em>' reference.
	 * @see #getSignatureregistry()
	 * @generated
	 */
	void setSignatureregistry(SignatureRegistry value);

	/**
	 * Returns the value of the '<em><b>Ecdsa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecdsa</em>' reference.
	 * @see #setEcdsa(ECDSA)
	 * @see metaModel.MetaModelPackage#getSignatureValidator_Ecdsa()
	 * @model
	 * @generated
	 */
	ECDSA getEcdsa();

	/**
	 * Sets the value of the '{@link metaModel.SignatureValidator#getEcdsa <em>Ecdsa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecdsa</em>' reference.
	 * @see #getEcdsa()
	 * @generated
	 */
	void setEcdsa(ECDSA value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void requireValidSignature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculateSignatureHash();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void validateSignature();

} // SignatureValidator
