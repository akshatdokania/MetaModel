/**
 */
package metaModel.impl;

import metaModel.Address;
import metaModel.Contract;
import metaModel.DApp;
import metaModel.MetaModelPackage;
import metaModel.SafeMath;
import metaModel.Token_Manager;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.Token_ManagerImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link metaModel.impl.Token_ManagerImpl#getDapp <em>Dapp</em>}</li>
 *   <li>{@link metaModel.impl.Token_ManagerImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link metaModel.impl.Token_ManagerImpl#getName <em>Name</em>}</li>
 *   <li>{@link metaModel.impl.Token_ManagerImpl#getTotalSupply <em>Total Supply</em>}</li>
 *   <li>{@link metaModel.impl.Token_ManagerImpl#getSafemath <em>Safemath</em>}</li>
 *   <li>{@link metaModel.impl.Token_ManagerImpl#getBalances <em>Balances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Token_ManagerImpl extends TokenImpl implements Token_Manager {
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
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalSupply() <em>Total Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSupply()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_SUPPLY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalSupply() <em>Total Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSupply()
	 * @generated
	 * @ordered
	 */
	protected int totalSupply = TOTAL_SUPPLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSafemath() <em>Safemath</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafemath()
	 * @generated
	 * @ordered
	 */
	protected SafeMath safemath;

	/**
	 * The default value of the '{@link #getBalances() <em>Balances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalances()
	 * @generated
	 * @ordered
	 */
	protected static final Object BALANCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBalances() <em>Balances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalances()
	 * @generated
	 * @ordered
	 */
	protected Object balances = BALANCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Token_ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.TOKEN_MANAGER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.TOKEN_MANAGER__ADDRESS,
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
					MetaModelPackage.TOKEN_MANAGER__ADDRESS, oldAddress, newAddress);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.TOKEN_MANAGER__ADDRESS, newAddress,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.TOKEN_MANAGER__DAPP,
							oldDapp, dapp));
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
					MetaModelPackage.TOKEN_MANAGER__DAPP, oldDapp, newDapp);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.TOKEN_MANAGER__DAPP, newDapp,
					newDapp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.TOKEN_MANAGER__SYMBOL, oldSymbol,
					symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.TOKEN_MANAGER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalSupply() {
		return totalSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalSupply(int newTotalSupply) {
		int oldTotalSupply = totalSupply;
		totalSupply = newTotalSupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.TOKEN_MANAGER__TOTAL_SUPPLY,
					oldTotalSupply, totalSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafeMath getSafemath() {
		if (safemath != null && safemath.eIsProxy()) {
			InternalEObject oldSafemath = (InternalEObject) safemath;
			safemath = (SafeMath) eResolveProxy(oldSafemath);
			if (safemath != oldSafemath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.TOKEN_MANAGER__SAFEMATH,
							oldSafemath, safemath));
			}
		}
		return safemath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafeMath basicGetSafemath() {
		return safemath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafemath(SafeMath newSafemath) {
		SafeMath oldSafemath = safemath;
		safemath = newSafemath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.TOKEN_MANAGER__SAFEMATH, oldSafemath,
					safemath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBalances() {
		return balances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalances(Object newBalances) {
		Object oldBalances = balances;
		balances = newBalances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.TOKEN_MANAGER__BALANCES, oldBalances,
					balances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelPackage.TOKEN_MANAGER__ADDRESS:
			if (address != null)
				msgs = ((InternalEObject) address).eInverseRemove(this, MetaModelPackage.ADDRESS__CONTRACT,
						Address.class, msgs);
			return basicSetAddress((Address) otherEnd, msgs);
		case MetaModelPackage.TOKEN_MANAGER__DAPP:
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
		case MetaModelPackage.TOKEN_MANAGER__ADDRESS:
			return basicSetAddress(null, msgs);
		case MetaModelPackage.TOKEN_MANAGER__DAPP:
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
		case MetaModelPackage.TOKEN_MANAGER__ADDRESS:
			if (resolve)
				return getAddress();
			return basicGetAddress();
		case MetaModelPackage.TOKEN_MANAGER__DAPP:
			if (resolve)
				return getDapp();
			return basicGetDapp();
		case MetaModelPackage.TOKEN_MANAGER__SYMBOL:
			return getSymbol();
		case MetaModelPackage.TOKEN_MANAGER__NAME:
			return getName();
		case MetaModelPackage.TOKEN_MANAGER__TOTAL_SUPPLY:
			return getTotalSupply();
		case MetaModelPackage.TOKEN_MANAGER__SAFEMATH:
			if (resolve)
				return getSafemath();
			return basicGetSafemath();
		case MetaModelPackage.TOKEN_MANAGER__BALANCES:
			return getBalances();
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
		case MetaModelPackage.TOKEN_MANAGER__ADDRESS:
			setAddress((Address) newValue);
			return;
		case MetaModelPackage.TOKEN_MANAGER__DAPP:
			setDapp((DApp) newValue);
			return;
		case MetaModelPackage.TOKEN_MANAGER__SYMBOL:
			setSymbol((String) newValue);
			return;
		case MetaModelPackage.TOKEN_MANAGER__NAME:
			setName((String) newValue);
			return;
		case MetaModelPackage.TOKEN_MANAGER__TOTAL_SUPPLY:
			setTotalSupply((Integer) newValue);
			return;
		case MetaModelPackage.TOKEN_MANAGER__SAFEMATH:
			setSafemath((SafeMath) newValue);
			return;
		case MetaModelPackage.TOKEN_MANAGER__BALANCES:
			setBalances(newValue);
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
		case MetaModelPackage.TOKEN_MANAGER__ADDRESS:
			setAddress((Address) null);
			return;
		case MetaModelPackage.TOKEN_MANAGER__DAPP:
			setDapp((DApp) null);
			return;
		case MetaModelPackage.TOKEN_MANAGER__SYMBOL:
			setSymbol(SYMBOL_EDEFAULT);
			return;
		case MetaModelPackage.TOKEN_MANAGER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetaModelPackage.TOKEN_MANAGER__TOTAL_SUPPLY:
			setTotalSupply(TOTAL_SUPPLY_EDEFAULT);
			return;
		case MetaModelPackage.TOKEN_MANAGER__SAFEMATH:
			setSafemath((SafeMath) null);
			return;
		case MetaModelPackage.TOKEN_MANAGER__BALANCES:
			setBalances(BALANCES_EDEFAULT);
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
		case MetaModelPackage.TOKEN_MANAGER__ADDRESS:
			return address != null;
		case MetaModelPackage.TOKEN_MANAGER__DAPP:
			return dapp != null;
		case MetaModelPackage.TOKEN_MANAGER__SYMBOL:
			return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
		case MetaModelPackage.TOKEN_MANAGER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetaModelPackage.TOKEN_MANAGER__TOTAL_SUPPLY:
			return totalSupply != TOTAL_SUPPLY_EDEFAULT;
		case MetaModelPackage.TOKEN_MANAGER__SAFEMATH:
			return safemath != null;
		case MetaModelPackage.TOKEN_MANAGER__BALANCES:
			return BALANCES_EDEFAULT == null ? balances != null : !BALANCES_EDEFAULT.equals(balances);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Contract.class) {
			switch (derivedFeatureID) {
			case MetaModelPackage.TOKEN_MANAGER__ADDRESS:
				return MetaModelPackage.CONTRACT__ADDRESS;
			case MetaModelPackage.TOKEN_MANAGER__DAPP:
				return MetaModelPackage.CONTRACT__DAPP;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Contract.class) {
			switch (baseFeatureID) {
			case MetaModelPackage.CONTRACT__ADDRESS:
				return MetaModelPackage.TOKEN_MANAGER__ADDRESS;
			case MetaModelPackage.CONTRACT__DAPP:
				return MetaModelPackage.TOKEN_MANAGER__DAPP;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (symbol: ");
		result.append(symbol);
		result.append(", name: ");
		result.append(name);
		result.append(", totalSupply: ");
		result.append(totalSupply);
		result.append(", balances: ");
		result.append(balances);
		result.append(')');
		return result.toString();
	}

} //Token_ManagerImpl
