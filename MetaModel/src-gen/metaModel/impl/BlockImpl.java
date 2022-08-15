/**
 */
package metaModel.impl;

import java.util.Collection;

import metaModel.Address;
import metaModel.Block;
import metaModel.Contract;
import metaModel.MetaModelPackage;
import metaModel.Transaction;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.BlockImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link metaModel.impl.BlockImpl#getContracts <em>Contracts</em>}</li>
 *   <li>{@link metaModel.impl.BlockImpl#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block {
	/**
	 * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> transactions;

	/**
	 * The cached value of the '{@link #getContracts() <em>Contracts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracts()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> contracts;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> address;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getTransactions() {
		if (transactions == null) {
			transactions = new EObjectContainmentEList<Transaction>(Transaction.class, this,
					MetaModelPackage.BLOCK__TRANSACTIONS);
		}
		return transactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contract> getContracts() {
		if (contracts == null) {
			contracts = new EObjectContainmentEList<Contract>(Contract.class, this, MetaModelPackage.BLOCK__CONTRACTS);
		}
		return contracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<Address>(Address.class, this, MetaModelPackage.BLOCK__ADDRESS);
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelPackage.BLOCK__TRANSACTIONS:
			return ((InternalEList<?>) getTransactions()).basicRemove(otherEnd, msgs);
		case MetaModelPackage.BLOCK__CONTRACTS:
			return ((InternalEList<?>) getContracts()).basicRemove(otherEnd, msgs);
		case MetaModelPackage.BLOCK__ADDRESS:
			return ((InternalEList<?>) getAddress()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModelPackage.BLOCK__TRANSACTIONS:
			return getTransactions();
		case MetaModelPackage.BLOCK__CONTRACTS:
			return getContracts();
		case MetaModelPackage.BLOCK__ADDRESS:
			return getAddress();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetaModelPackage.BLOCK__TRANSACTIONS:
			getTransactions().clear();
			getTransactions().addAll((Collection<? extends Transaction>) newValue);
			return;
		case MetaModelPackage.BLOCK__CONTRACTS:
			getContracts().clear();
			getContracts().addAll((Collection<? extends Contract>) newValue);
			return;
		case MetaModelPackage.BLOCK__ADDRESS:
			getAddress().clear();
			getAddress().addAll((Collection<? extends Address>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetaModelPackage.BLOCK__TRANSACTIONS:
			getTransactions().clear();
			return;
		case MetaModelPackage.BLOCK__CONTRACTS:
			getContracts().clear();
			return;
		case MetaModelPackage.BLOCK__ADDRESS:
			getAddress().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetaModelPackage.BLOCK__TRANSACTIONS:
			return transactions != null && !transactions.isEmpty();
		case MetaModelPackage.BLOCK__CONTRACTS:
			return contracts != null && !contracts.isEmpty();
		case MetaModelPackage.BLOCK__ADDRESS:
			return address != null && !address.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockImpl
