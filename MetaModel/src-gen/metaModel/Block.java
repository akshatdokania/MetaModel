/**
 */
package metaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Block#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link metaModel.Block#getContracts <em>Contracts</em>}</li>
 *   <li>{@link metaModel.Block#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.Transaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getBlock_Transactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transaction> getTransactions();

	/**
	 * Returns the value of the '<em><b>Contracts</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.Contract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contracts</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getBlock_Contracts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contract> getContracts();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getBlock_Address()
	 * @model containment="true"
	 * @generated
	 */
	EList<Address> getAddress();

} // Block
