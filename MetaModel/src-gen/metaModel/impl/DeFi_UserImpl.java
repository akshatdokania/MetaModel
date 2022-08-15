/**
 */
package metaModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import metaModel.DeFi_Lending_Pool;
import metaModel.DeFi_User;
import metaModel.MetaModelPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>De Fi User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.DeFi_UserImpl#getDefi_lending_pool <em>Defi lending pool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeFi_UserImpl extends ContractImpl implements DeFi_User {
	/**
	 * The cached value of the '{@link #getDefi_lending_pool() <em>Defi lending pool</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefi_lending_pool()
	 * @generated
	 * @ordered
	 */
	protected EList<DeFi_Lending_Pool> defi_lending_pool;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeFi_UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.DE_FI_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeFi_Lending_Pool> getDefi_lending_pool() {
		if (defi_lending_pool == null) {
			defi_lending_pool = new EObjectWithInverseResolvingEList.ManyInverse<DeFi_Lending_Pool>(
					DeFi_Lending_Pool.class, this, MetaModelPackage.DE_FI_USER__DEFI_LENDING_POOL,
					MetaModelPackage.DE_FI_LENDING_POOL__DEFI_USER);
		}
		return defi_lending_pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loan() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deposit() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void borrow() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void repay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void redeem() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void swap() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void recieve() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelPackage.DE_FI_USER__DEFI_LENDING_POOL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDefi_lending_pool()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelPackage.DE_FI_USER__DEFI_LENDING_POOL:
			return ((InternalEList<?>) getDefi_lending_pool()).basicRemove(otherEnd, msgs);
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
		case MetaModelPackage.DE_FI_USER__DEFI_LENDING_POOL:
			return getDefi_lending_pool();
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
		case MetaModelPackage.DE_FI_USER__DEFI_LENDING_POOL:
			getDefi_lending_pool().clear();
			getDefi_lending_pool().addAll((Collection<? extends DeFi_Lending_Pool>) newValue);
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
		case MetaModelPackage.DE_FI_USER__DEFI_LENDING_POOL:
			getDefi_lending_pool().clear();
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
		case MetaModelPackage.DE_FI_USER__DEFI_LENDING_POOL:
			return defi_lending_pool != null && !defi_lending_pool.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetaModelPackage.DE_FI_USER___LOAN:
			loan();
			return null;
		case MetaModelPackage.DE_FI_USER___DEPOSIT:
			deposit();
			return null;
		case MetaModelPackage.DE_FI_USER___BORROW:
			borrow();
			return null;
		case MetaModelPackage.DE_FI_USER___REPAY:
			repay();
			return null;
		case MetaModelPackage.DE_FI_USER___REDEEM:
			redeem();
			return null;
		case MetaModelPackage.DE_FI_USER___SWAP:
			swap();
			return null;
		case MetaModelPackage.DE_FI_USER___RECIEVE:
			recieve();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DeFi_UserImpl
