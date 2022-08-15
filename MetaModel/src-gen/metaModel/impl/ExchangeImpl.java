/**
 */
package metaModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import metaModel.Currency;
import metaModel.Exchange;
import metaModel.MetaModelPackage;
import metaModel.Token_Manager;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.ExchangeImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link metaModel.impl.ExchangeImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link metaModel.impl.ExchangeImpl#getReserves <em>Reserves</em>}</li>
 *   <li>{@link metaModel.impl.ExchangeImpl#getBlockTimeStamp <em>Block Time Stamp</em>}</li>
 *   <li>{@link metaModel.impl.ExchangeImpl#getMinimumLiquiduty <em>Minimum Liquiduty</em>}</li>
 *   <li>{@link metaModel.impl.ExchangeImpl#getFactory <em>Factory</em>}</li>
 *   <li>{@link metaModel.impl.ExchangeImpl#getToken <em>Token</em>}</li>
 *   <li>{@link metaModel.impl.ExchangeImpl#getToken_manager <em>Token manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangeImpl extends ContractImpl implements Exchange {
	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected EList<Currency> currency;

	/**
	 * The default value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected static final byte SELECTOR_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected byte selector = SELECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserves() <em>Reserves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserves()
	 * @generated
	 * @ordered
	 */
	protected static final int RESERVES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReserves() <em>Reserves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserves()
	 * @generated
	 * @ordered
	 */
	protected int reserves = RESERVES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockTimeStamp() <em>Block Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final int BLOCK_TIME_STAMP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBlockTimeStamp() <em>Block Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected int blockTimeStamp = BLOCK_TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumLiquiduty() <em>Minimum Liquiduty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumLiquiduty()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_LIQUIDUTY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimumLiquiduty() <em>Minimum Liquiduty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumLiquiduty()
	 * @generated
	 * @ordered
	 */
	protected int minimumLiquiduty = MINIMUM_LIQUIDUTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactory() <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactory() <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactory()
	 * @generated
	 * @ordered
	 */
	protected String factory = FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final Object TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected Object token = TOKEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToken_manager() <em>Token manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken_manager()
	 * @generated
	 * @ordered
	 */
	protected Token_Manager token_manager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Currency> getCurrency() {
		if (currency == null) {
			currency = new EObjectContainmentEList<Currency>(Currency.class, this, MetaModelPackage.EXCHANGE__CURRENCY);
		}
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(byte newSelector) {
		byte oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.EXCHANGE__SELECTOR, oldSelector,
					selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReserves() {
		return reserves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserves(int newReserves) {
		int oldReserves = reserves;
		reserves = newReserves;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.EXCHANGE__RESERVES, oldReserves,
					reserves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBlockTimeStamp() {
		return blockTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockTimeStamp(int newBlockTimeStamp) {
		int oldBlockTimeStamp = blockTimeStamp;
		blockTimeStamp = newBlockTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.EXCHANGE__BLOCK_TIME_STAMP,
					oldBlockTimeStamp, blockTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinimumLiquiduty() {
		return minimumLiquiduty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumLiquiduty(int newMinimumLiquiduty) {
		int oldMinimumLiquiduty = minimumLiquiduty;
		minimumLiquiduty = newMinimumLiquiduty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.EXCHANGE__MINIMUM_LIQUIDUTY,
					oldMinimumLiquiduty, minimumLiquiduty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactory() {
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactory(String newFactory) {
		String oldFactory = factory;
		factory = newFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.EXCHANGE__FACTORY, oldFactory,
					factory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(Object newToken) {
		Object oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.EXCHANGE__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token_Manager getToken_manager() {
		if (token_manager != null && token_manager.eIsProxy()) {
			InternalEObject oldToken_manager = (InternalEObject) token_manager;
			token_manager = (Token_Manager) eResolveProxy(oldToken_manager);
			if (token_manager != oldToken_manager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.EXCHANGE__TOKEN_MANAGER,
							oldToken_manager, token_manager));
			}
		}
		return token_manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token_Manager basicGetToken_manager() {
		return token_manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken_manager(Token_Manager newToken_manager) {
		Token_Manager oldToken_manager = token_manager;
		token_manager = newToken_manager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.EXCHANGE__TOKEN_MANAGER,
					oldToken_manager, token_manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateConversonRates() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void mintFee() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void mint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void burn() {
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
	public void sync() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelPackage.EXCHANGE__CURRENCY:
			return ((InternalEList<?>) getCurrency()).basicRemove(otherEnd, msgs);
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
		case MetaModelPackage.EXCHANGE__CURRENCY:
			return getCurrency();
		case MetaModelPackage.EXCHANGE__SELECTOR:
			return getSelector();
		case MetaModelPackage.EXCHANGE__RESERVES:
			return getReserves();
		case MetaModelPackage.EXCHANGE__BLOCK_TIME_STAMP:
			return getBlockTimeStamp();
		case MetaModelPackage.EXCHANGE__MINIMUM_LIQUIDUTY:
			return getMinimumLiquiduty();
		case MetaModelPackage.EXCHANGE__FACTORY:
			return getFactory();
		case MetaModelPackage.EXCHANGE__TOKEN:
			return getToken();
		case MetaModelPackage.EXCHANGE__TOKEN_MANAGER:
			if (resolve)
				return getToken_manager();
			return basicGetToken_manager();
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
		case MetaModelPackage.EXCHANGE__CURRENCY:
			getCurrency().clear();
			getCurrency().addAll((Collection<? extends Currency>) newValue);
			return;
		case MetaModelPackage.EXCHANGE__SELECTOR:
			setSelector((Byte) newValue);
			return;
		case MetaModelPackage.EXCHANGE__RESERVES:
			setReserves((Integer) newValue);
			return;
		case MetaModelPackage.EXCHANGE__BLOCK_TIME_STAMP:
			setBlockTimeStamp((Integer) newValue);
			return;
		case MetaModelPackage.EXCHANGE__MINIMUM_LIQUIDUTY:
			setMinimumLiquiduty((Integer) newValue);
			return;
		case MetaModelPackage.EXCHANGE__FACTORY:
			setFactory((String) newValue);
			return;
		case MetaModelPackage.EXCHANGE__TOKEN:
			setToken(newValue);
			return;
		case MetaModelPackage.EXCHANGE__TOKEN_MANAGER:
			setToken_manager((Token_Manager) newValue);
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
		case MetaModelPackage.EXCHANGE__CURRENCY:
			getCurrency().clear();
			return;
		case MetaModelPackage.EXCHANGE__SELECTOR:
			setSelector(SELECTOR_EDEFAULT);
			return;
		case MetaModelPackage.EXCHANGE__RESERVES:
			setReserves(RESERVES_EDEFAULT);
			return;
		case MetaModelPackage.EXCHANGE__BLOCK_TIME_STAMP:
			setBlockTimeStamp(BLOCK_TIME_STAMP_EDEFAULT);
			return;
		case MetaModelPackage.EXCHANGE__MINIMUM_LIQUIDUTY:
			setMinimumLiquiduty(MINIMUM_LIQUIDUTY_EDEFAULT);
			return;
		case MetaModelPackage.EXCHANGE__FACTORY:
			setFactory(FACTORY_EDEFAULT);
			return;
		case MetaModelPackage.EXCHANGE__TOKEN:
			setToken(TOKEN_EDEFAULT);
			return;
		case MetaModelPackage.EXCHANGE__TOKEN_MANAGER:
			setToken_manager((Token_Manager) null);
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
		case MetaModelPackage.EXCHANGE__CURRENCY:
			return currency != null && !currency.isEmpty();
		case MetaModelPackage.EXCHANGE__SELECTOR:
			return selector != SELECTOR_EDEFAULT;
		case MetaModelPackage.EXCHANGE__RESERVES:
			return reserves != RESERVES_EDEFAULT;
		case MetaModelPackage.EXCHANGE__BLOCK_TIME_STAMP:
			return blockTimeStamp != BLOCK_TIME_STAMP_EDEFAULT;
		case MetaModelPackage.EXCHANGE__MINIMUM_LIQUIDUTY:
			return minimumLiquiduty != MINIMUM_LIQUIDUTY_EDEFAULT;
		case MetaModelPackage.EXCHANGE__FACTORY:
			return FACTORY_EDEFAULT == null ? factory != null : !FACTORY_EDEFAULT.equals(factory);
		case MetaModelPackage.EXCHANGE__TOKEN:
			return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
		case MetaModelPackage.EXCHANGE__TOKEN_MANAGER:
			return token_manager != null;
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
		case MetaModelPackage.EXCHANGE___UPDATE_CONVERSON_RATES:
			updateConversonRates();
			return null;
		case MetaModelPackage.EXCHANGE___MINT_FEE:
			mintFee();
			return null;
		case MetaModelPackage.EXCHANGE___MINT:
			mint();
			return null;
		case MetaModelPackage.EXCHANGE___BURN:
			burn();
			return null;
		case MetaModelPackage.EXCHANGE___SWAP:
			swap();
			return null;
		case MetaModelPackage.EXCHANGE___SYNC:
			sync();
			return null;
		case MetaModelPackage.EXCHANGE___INITIALIZE:
			initialize();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (selector: ");
		result.append(selector);
		result.append(", reserves: ");
		result.append(reserves);
		result.append(", blockTimeStamp: ");
		result.append(blockTimeStamp);
		result.append(", minimumLiquiduty: ");
		result.append(minimumLiquiduty);
		result.append(", factory: ");
		result.append(factory);
		result.append(", token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} //ExchangeImpl
