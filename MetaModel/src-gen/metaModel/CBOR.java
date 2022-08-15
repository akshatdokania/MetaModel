/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CBOR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.CBOR#getBuffer_manager <em>Buffer manager</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getCBOR()
 * @model
 * @generated
 */
public interface CBOR extends EObject {
	/**
	 * Returns the value of the '<em><b>Buffer manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer manager</em>' reference.
	 * @see #setBuffer_manager(Buffer_Manager)
	 * @see metaModel.MetaModelPackage#getCBOR_Buffer_manager()
	 * @model
	 * @generated
	 */
	Buffer_Manager getBuffer_manager();

	/**
	 * Sets the value of the '{@link metaModel.CBOR#getBuffer_manager <em>Buffer manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer manager</em>' reference.
	 * @see #getBuffer_manager()
	 * @generated
	 */
	void setBuffer_manager(Buffer_Manager value);

} // CBOR
