/**
 */
package metaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blockchain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Blockchain#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getBlockchain()
 * @model
 * @generated
 */
public interface Blockchain extends EObject {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getBlockchain_Block()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getBlock();

} // Blockchain
