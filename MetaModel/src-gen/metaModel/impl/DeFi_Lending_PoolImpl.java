/**
 */
package metaModel.impl;

import java.util.Collection;

import metaModel.DeFi_Lending_Core;
import metaModel.DeFi_Lending_Pool;
import metaModel.DeFi_User;
import metaModel.MetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>De Fi Lending Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.DeFi_Lending_PoolImpl#getDefi_user <em>Defi user</em>}</li>
 *   <li>{@link metaModel.impl.DeFi_Lending_PoolImpl#getDefi_lending_core <em>Defi lending core</em>}</li>
 *   <li>{@link metaModel.impl.DeFi_Lending_PoolImpl#getLendingPoolAddress <em>Lending Pool Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeFi_Lending_PoolImpl extends MinimalEObjectImpl.Container implements DeFi_Lending_Pool {
	/**
	 * The cached value of the '{@link #getDefi_user() <em>Defi user</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefi_user()
	 * @generated
	 * @ordered
	 */
	protected EList<DeFi_User> defi_user;

	/**
	 * The cached value of the '{@link #getDefi_lending_core() <em>Defi lending core</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefi_lending_core()
	 * @generated
	 * @ordered
	 */
	protected EList<DeFi_Lending_Core> defi_lending_core;

	/**
	 * The default value of the '{@link #getLendingPoolAddress() <em>Lending Pool Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLendingPoolAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String LENDING_POOL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLendingPoolAddress() <em>Lending Pool Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLendingPoolAddress()
	 * @generated
	 * @ordered
	 */
	protected String lendingPoolAddress = LENDING_POOL_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeFi_Lending_PoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.DE_FI_LENDING_POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeFi_User> getDefi_user() {
		if (defi_user == null) {
			defi_user = new EObjectWithInverseResolvingEList.ManyInverse<DeFi_User>(DeFi_User.class, this,
					MetaModelPackage.DE_FI_LENDING_POOL__DEFI_USER, MetaModelPackage.DE_FI_USER__DEFI_LENDING_POOL);
		}
		return defi_user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeFi_Lending_Core> getDefi_lending_core() {
		if (defi_lending_core == null) {
			defi_lending_core = new EObjectContainmentEList<DeFi_Lending_Core>(DeFi_Lending_Core.class, this,
					MetaModelPackage.DE_FI_LENDING_POOL__DEFI_LENDING_CORE);
		}
		return defi_lending_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLendingPoolAddress() {
		return lendingPoolAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLendingPoolAddress(String newLendingPoolAddress) {
		String oldLendingPoolAddress = lendingPoolAddress;
		lendingPoolAddress = newLendingPoolAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.DE_FI_LENDING_POOL__LENDING_POOL_ADDRESS, oldLendingPoolAddress,
					lendingPoolAddress));
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
		case MetaModelPackage.DE_FI_LENDING_POOL__DEFI_USER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDefi_user()).basicAdd(otherEnd, msgs);
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
		case MetaModelPackage.DE_FI_LENDING_POOL__DEFI_USER:
			return ((InternalEList<?>) getDefi_user()).basicRemove(otherEnd, msgs);
		case MetaModelPackage.DE_FI_LENDING_POOL__DEFI_LENDING_CORE:
			return ((InternalEList<?>) getDefi_lending_core()).basicRemove(otherEnd, msgs);
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
		case MetaModelPackage.DE_FI_LENDING_POOL__DEFI_USER:
			return getDefi_user();
		case MetaModelPackage.DE_FI_LENDING_POOL__DEFI_LENDING_CORE:
			return getDefi_lending_core();
		case MetaModelPackage.DE_FI_LENDING_POOL__LENDING_POOL_ADDRESS:
			return getLendingPoolAddress();
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
		case MetaModelPackage.DE_FI_LENDING_POOL__DEFI_USER:
			getDefi_user().clear();
			getDefi_user().addAll((Collection<? extends DeFi_User>) newValue);
			return;
		case MetaModelPackage.DE_FI_LENDING_POOL__DEFI_LENDING_CORE:
			getDefi_lending_core().clear();
			getDefi_lending_core().addAll((Collection<? extends DeFi_Lending_Core>) newValue);
			return;
		case MetaModelPackage.DE_FI_LENDING_POOL__LENDING_POOL_ADDRESS:
			setLendingPoolAddress((String) newValue);
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
		case MetaModelPackage.DE_FI_LENDING_POOL__DEFI_USER:
			getDefi_user().clear();
			return;
		case MetaModelPackage.DE_FI_LENDING_POOL__DEFI_LENDING_CORE:
			getDefi_lending_core().clear();
			return;
		case MetaModelPackage.DE_FI_LENDING_POOL__LENDING_POOL_ADDRESS:
			setLendingPoolAddress(LENDING_POOL_ADDRESS_EDEFAULT);
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
		case MetaModelPackage.DE_FI_LENDING_POOL__DEFI_USER:
			return defi_user != null && !defi_user.isEmpty();
		case MetaModelPackage.DE_FI_LENDING_POOL__DEFI_LENDING_CORE:
			return defi_lending_core != null && !defi_lending_core.isEmpty();
		case MetaModelPackage.DE_FI_LENDING_POOL__LENDING_POOL_ADDRESS:
			return LENDING_POOL_ADDRESS_EDEFAULT == null ? lendingPoolAddress != null
					: !LENDING_POOL_ADDRESS_EDEFAULT.equals(lendingPoolAddress);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (lendingPoolAddress: ");
		result.append(lendingPoolAddress);
		result.append(')');
		return result.toString();
	}

} //DeFi_Lending_PoolImpl
