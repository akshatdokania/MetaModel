/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DApp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.DApp#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getDApp()
 * @model
 * @generated
 */
public interface DApp extends EObject {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.Contract#getDapp <em>Dapp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' reference.
	 * @see #setContract(Contract)
	 * @see metaModel.MetaModelPackage#getDApp_Contract()
	 * @see metaModel.Contract#getDapp
	 * @model opposite="dapp"
	 * @generated
	 */
	Contract getContract();

	/**
	 * Sets the value of the '{@link metaModel.DApp#getContract <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Contract value);

} // DApp
