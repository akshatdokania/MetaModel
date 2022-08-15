/**
 */
package metaModel.impl;

import java.lang.reflect.InvocationTargetException;

import metaModel.Data_Provider;
import metaModel.DeFi_Lending_Core;
import metaModel.MetaModelPackage;
import metaModel.Reserves_Manager;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>De Fi Lending Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.DeFi_Lending_CoreImpl#getData_provider <em>Data provider</em>}</li>
 *   <li>{@link metaModel.impl.DeFi_Lending_CoreImpl#getReserves_manager <em>Reserves manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeFi_Lending_CoreImpl extends MinimalEObjectImpl.Container implements DeFi_Lending_Core {
	/**
	 * The cached value of the '{@link #getData_provider() <em>Data provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_provider()
	 * @generated
	 * @ordered
	 */
	protected Data_Provider data_provider;

	/**
	 * The cached value of the '{@link #getReserves_manager() <em>Reserves manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserves_manager()
	 * @generated
	 * @ordered
	 */
	protected Reserves_Manager reserves_manager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeFi_Lending_CoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.DE_FI_LENDING_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_Provider getData_provider() {
		if (data_provider != null && data_provider.eIsProxy()) {
			InternalEObject oldData_provider = (InternalEObject) data_provider;
			data_provider = (Data_Provider) eResolveProxy(oldData_provider);
			if (data_provider != oldData_provider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetaModelPackage.DE_FI_LENDING_CORE__DATA_PROVIDER, oldData_provider, data_provider));
			}
		}
		return data_provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_Provider basicGetData_provider() {
		return data_provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData_provider(Data_Provider newData_provider, NotificationChain msgs) {
		Data_Provider oldData_provider = data_provider;
		data_provider = newData_provider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.DE_FI_LENDING_CORE__DATA_PROVIDER, oldData_provider, newData_provider);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData_provider(Data_Provider newData_provider) {
		if (newData_provider != data_provider) {
			NotificationChain msgs = null;
			if (data_provider != null)
				msgs = ((InternalEObject) data_provider).eInverseRemove(this,
						MetaModelPackage.DATA_PROVIDER__DEFI_LENDING_CORE, Data_Provider.class, msgs);
			if (newData_provider != null)
				msgs = ((InternalEObject) newData_provider).eInverseAdd(this,
						MetaModelPackage.DATA_PROVIDER__DEFI_LENDING_CORE, Data_Provider.class, msgs);
			msgs = basicSetData_provider(newData_provider, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.DE_FI_LENDING_CORE__DATA_PROVIDER,
					newData_provider, newData_provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reserves_Manager getReserves_manager() {
		if (reserves_manager != null && reserves_manager.eIsProxy()) {
			InternalEObject oldReserves_manager = (InternalEObject) reserves_manager;
			reserves_manager = (Reserves_Manager) eResolveProxy(oldReserves_manager);
			if (reserves_manager != oldReserves_manager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetaModelPackage.DE_FI_LENDING_CORE__RESERVES_MANAGER, oldReserves_manager,
							reserves_manager));
			}
		}
		return reserves_manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reserves_Manager basicGetReserves_manager() {
		return reserves_manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReserves_manager(Reserves_Manager newReserves_manager, NotificationChain msgs) {
		Reserves_Manager oldReserves_manager = reserves_manager;
		reserves_manager = newReserves_manager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.DE_FI_LENDING_CORE__RESERVES_MANAGER, oldReserves_manager, newReserves_manager);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserves_manager(Reserves_Manager newReserves_manager) {
		if (newReserves_manager != reserves_manager) {
			NotificationChain msgs = null;
			if (reserves_manager != null)
				msgs = ((InternalEObject) reserves_manager).eInverseRemove(this,
						MetaModelPackage.RESERVES_MANAGER__DEFI_LENDING_CORE, Reserves_Manager.class, msgs);
			if (newReserves_manager != null)
				msgs = ((InternalEObject) newReserves_manager).eInverseAdd(this,
						MetaModelPackage.RESERVES_MANAGER__DEFI_LENDING_CORE, Reserves_Manager.class, msgs);
			msgs = basicSetReserves_manager(newReserves_manager, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.DE_FI_LENDING_CORE__RESERVES_MANAGER,
					newReserves_manager, newReserves_manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateState() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reservesState() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void lendingPoolConfigurator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void transferToUser() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelPackage.DE_FI_LENDING_CORE__DATA_PROVIDER:
			if (data_provider != null)
				msgs = ((InternalEObject) data_provider).eInverseRemove(this,
						MetaModelPackage.DATA_PROVIDER__DEFI_LENDING_CORE, Data_Provider.class, msgs);
			return basicSetData_provider((Data_Provider) otherEnd, msgs);
		case MetaModelPackage.DE_FI_LENDING_CORE__RESERVES_MANAGER:
			if (reserves_manager != null)
				msgs = ((InternalEObject) reserves_manager).eInverseRemove(this,
						MetaModelPackage.RESERVES_MANAGER__DEFI_LENDING_CORE, Reserves_Manager.class, msgs);
			return basicSetReserves_manager((Reserves_Manager) otherEnd, msgs);
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
		case MetaModelPackage.DE_FI_LENDING_CORE__DATA_PROVIDER:
			return basicSetData_provider(null, msgs);
		case MetaModelPackage.DE_FI_LENDING_CORE__RESERVES_MANAGER:
			return basicSetReserves_manager(null, msgs);
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
		case MetaModelPackage.DE_FI_LENDING_CORE__DATA_PROVIDER:
			if (resolve)
				return getData_provider();
			return basicGetData_provider();
		case MetaModelPackage.DE_FI_LENDING_CORE__RESERVES_MANAGER:
			if (resolve)
				return getReserves_manager();
			return basicGetReserves_manager();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetaModelPackage.DE_FI_LENDING_CORE__DATA_PROVIDER:
			setData_provider((Data_Provider) newValue);
			return;
		case MetaModelPackage.DE_FI_LENDING_CORE__RESERVES_MANAGER:
			setReserves_manager((Reserves_Manager) newValue);
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
		case MetaModelPackage.DE_FI_LENDING_CORE__DATA_PROVIDER:
			setData_provider((Data_Provider) null);
			return;
		case MetaModelPackage.DE_FI_LENDING_CORE__RESERVES_MANAGER:
			setReserves_manager((Reserves_Manager) null);
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
		case MetaModelPackage.DE_FI_LENDING_CORE__DATA_PROVIDER:
			return data_provider != null;
		case MetaModelPackage.DE_FI_LENDING_CORE__RESERVES_MANAGER:
			return reserves_manager != null;
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
		case MetaModelPackage.DE_FI_LENDING_CORE___UPDATE_STATE:
			updateState();
			return null;
		case MetaModelPackage.DE_FI_LENDING_CORE___RESERVES_STATE:
			reservesState();
			return null;
		case MetaModelPackage.DE_FI_LENDING_CORE___LENDING_POOL_CONFIGURATOR:
			lendingPoolConfigurator();
			return null;
		case MetaModelPackage.DE_FI_LENDING_CORE___TRANSFER_TO_USER:
			transferToUser();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DeFi_Lending_CoreImpl
