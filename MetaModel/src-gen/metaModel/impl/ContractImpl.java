/**
 */
package metaModel.impl;

import metaModel.Address;
import metaModel.Contract;
import metaModel.DApp;
import metaModel.MetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.ContractImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link metaModel.impl.ContractImpl#getDapp <em>Dapp</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContractImpl extends MinimalEObjectImpl.Container implements Contract {
	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address;

	/**
	 * The cached value of the '{@link #getDapp() <em>Dapp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDapp()
	 * @generated
	 * @ordered
	 */
	protected DApp dapp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getAddress() {
		if (address != null && address.eIsProxy()) {
			InternalEObject oldAddress = (InternalEObject) address;
			address = (Address) eResolveProxy(oldAddress);
			if (address != oldAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.CONTRACT__ADDRESS,
							oldAddress, address));
			}
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address basicGetAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Address newAddress, NotificationChain msgs) {
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.CONTRACT__ADDRESS, oldAddress, newAddress);
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
	public void setAddress(Address newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject) address).eInverseRemove(this, MetaModelPackage.ADDRESS__CONTRACT,
						Address.class, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject) newAddress).eInverseAdd(this, MetaModelPackage.ADDRESS__CONTRACT,
						Address.class, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.CONTRACT__ADDRESS, newAddress,
					newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DApp getDapp() {
		if (dapp != null && dapp.eIsProxy()) {
			InternalEObject oldDapp = (InternalEObject) dapp;
			dapp = (DApp) eResolveProxy(oldDapp);
			if (dapp != oldDapp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.CONTRACT__DAPP, oldDapp,
							dapp));
			}
		}
		return dapp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DApp basicGetDapp() {
		return dapp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDapp(DApp newDapp, NotificationChain msgs) {
		DApp oldDapp = dapp;
		dapp = newDapp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.CONTRACT__DAPP, oldDapp, newDapp);
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
	public void setDapp(DApp newDapp) {
		if (newDapp != dapp) {
			NotificationChain msgs = null;
			if (dapp != null)
				msgs = ((InternalEObject) dapp).eInverseRemove(this, MetaModelPackage.DAPP__CONTRACT, DApp.class, msgs);
			if (newDapp != null)
				msgs = ((InternalEObject) newDapp).eInverseAdd(this, MetaModelPackage.DAPP__CONTRACT, DApp.class, msgs);
			msgs = basicSetDapp(newDapp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.CONTRACT__DAPP, newDapp, newDapp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelPackage.CONTRACT__ADDRESS:
			if (address != null)
				msgs = ((InternalEObject) address).eInverseRemove(this, MetaModelPackage.ADDRESS__CONTRACT,
						Address.class, msgs);
			return basicSetAddress((Address) otherEnd, msgs);
		case MetaModelPackage.CONTRACT__DAPP:
			if (dapp != null)
				msgs = ((InternalEObject) dapp).eInverseRemove(this, MetaModelPackage.DAPP__CONTRACT, DApp.class, msgs);
			return basicSetDapp((DApp) otherEnd, msgs);
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
		case MetaModelPackage.CONTRACT__ADDRESS:
			return basicSetAddress(null, msgs);
		case MetaModelPackage.CONTRACT__DAPP:
			return basicSetDapp(null, msgs);
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
		case MetaModelPackage.CONTRACT__ADDRESS:
			if (resolve)
				return getAddress();
			return basicGetAddress();
		case MetaModelPackage.CONTRACT__DAPP:
			if (resolve)
				return getDapp();
			return basicGetDapp();
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
		case MetaModelPackage.CONTRACT__ADDRESS:
			setAddress((Address) newValue);
			return;
		case MetaModelPackage.CONTRACT__DAPP:
			setDapp((DApp) newValue);
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
		case MetaModelPackage.CONTRACT__ADDRESS:
			setAddress((Address) null);
			return;
		case MetaModelPackage.CONTRACT__DAPP:
			setDapp((DApp) null);
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
		case MetaModelPackage.CONTRACT__ADDRESS:
			return address != null;
		case MetaModelPackage.CONTRACT__DAPP:
			return dapp != null;
		}
		return super.eIsSet(featureID);
	}

} //ContractImpl
