/**
 */
package metaModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import metaModel.Auction;
import metaModel.Marketplace;
import metaModel.MetaModelPackage;
import metaModel.Orders;
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
 * An implementation of the model object '<em><b>Marketplace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.MarketplaceImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link metaModel.impl.MarketplaceImpl#getAuctions <em>Auctions</em>}</li>
 *   <li>{@link metaModel.impl.MarketplaceImpl#getToken <em>Token</em>}</li>
 *   <li>{@link metaModel.impl.MarketplaceImpl#getPublicationFee <em>Publication Fee</em>}</li>
 *   <li>{@link metaModel.impl.MarketplaceImpl#getToken_manager <em>Token manager</em>}</li>
 *   <li>{@link metaModel.impl.MarketplaceImpl#getRegistry <em>Registry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketplaceImpl extends ContractImpl implements Marketplace {
	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Orders> orders;

	/**
	 * The cached value of the '{@link #getAuctions() <em>Auctions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Auction> auctions;

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
	 * The default value of the '{@link #getPublicationFee() <em>Publication Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationFee()
	 * @generated
	 * @ordered
	 */
	protected static final int PUBLICATION_FEE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPublicationFee() <em>Publication Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationFee()
	 * @generated
	 * @ordered
	 */
	protected int publicationFee = PUBLICATION_FEE_EDEFAULT;

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
	 * The default value of the '{@link #getRegistry() <em>Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistry()
	 * @generated
	 * @ordered
	 */
	protected static final Object REGISTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistry() <em>Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistry()
	 * @generated
	 * @ordered
	 */
	protected Object registry = REGISTRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketplaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.MARKETPLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Orders> getOrders() {
		if (orders == null) {
			orders = new EObjectContainmentEList<Orders>(Orders.class, this, MetaModelPackage.MARKETPLACE__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Auction> getAuctions() {
		if (auctions == null) {
			auctions = new EObjectContainmentEList<Auction>(Auction.class, this,
					MetaModelPackage.MARKETPLACE__AUCTIONS);
		}
		return auctions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.MARKETPLACE__TOKEN, oldToken,
					token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPublicationFee() {
		return publicationFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationFee(int newPublicationFee) {
		int oldPublicationFee = publicationFee;
		publicationFee = newPublicationFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.MARKETPLACE__PUBLICATION_FEE,
					oldPublicationFee, publicationFee));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetaModelPackage.MARKETPLACE__TOKEN_MANAGER, oldToken_manager, token_manager));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.MARKETPLACE__TOKEN_MANAGER,
					oldToken_manager, token_manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRegistry() {
		return registry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistry(Object newRegistry) {
		Object oldRegistry = registry;
		registry = newRegistry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.MARKETPLACE__REGISTRY, oldRegistry,
					registry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createAuction() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelAuction() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeOwner() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationFee() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createOrder() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelOrder() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void executeOrder() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerCut() {
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
		case MetaModelPackage.MARKETPLACE__ORDERS:
			return ((InternalEList<?>) getOrders()).basicRemove(otherEnd, msgs);
		case MetaModelPackage.MARKETPLACE__AUCTIONS:
			return ((InternalEList<?>) getAuctions()).basicRemove(otherEnd, msgs);
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
		case MetaModelPackage.MARKETPLACE__ORDERS:
			return getOrders();
		case MetaModelPackage.MARKETPLACE__AUCTIONS:
			return getAuctions();
		case MetaModelPackage.MARKETPLACE__TOKEN:
			return getToken();
		case MetaModelPackage.MARKETPLACE__PUBLICATION_FEE:
			return getPublicationFee();
		case MetaModelPackage.MARKETPLACE__TOKEN_MANAGER:
			if (resolve)
				return getToken_manager();
			return basicGetToken_manager();
		case MetaModelPackage.MARKETPLACE__REGISTRY:
			return getRegistry();
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
		case MetaModelPackage.MARKETPLACE__ORDERS:
			getOrders().clear();
			getOrders().addAll((Collection<? extends Orders>) newValue);
			return;
		case MetaModelPackage.MARKETPLACE__AUCTIONS:
			getAuctions().clear();
			getAuctions().addAll((Collection<? extends Auction>) newValue);
			return;
		case MetaModelPackage.MARKETPLACE__TOKEN:
			setToken(newValue);
			return;
		case MetaModelPackage.MARKETPLACE__PUBLICATION_FEE:
			setPublicationFee((Integer) newValue);
			return;
		case MetaModelPackage.MARKETPLACE__TOKEN_MANAGER:
			setToken_manager((Token_Manager) newValue);
			return;
		case MetaModelPackage.MARKETPLACE__REGISTRY:
			setRegistry(newValue);
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
		case MetaModelPackage.MARKETPLACE__ORDERS:
			getOrders().clear();
			return;
		case MetaModelPackage.MARKETPLACE__AUCTIONS:
			getAuctions().clear();
			return;
		case MetaModelPackage.MARKETPLACE__TOKEN:
			setToken(TOKEN_EDEFAULT);
			return;
		case MetaModelPackage.MARKETPLACE__PUBLICATION_FEE:
			setPublicationFee(PUBLICATION_FEE_EDEFAULT);
			return;
		case MetaModelPackage.MARKETPLACE__TOKEN_MANAGER:
			setToken_manager((Token_Manager) null);
			return;
		case MetaModelPackage.MARKETPLACE__REGISTRY:
			setRegistry(REGISTRY_EDEFAULT);
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
		case MetaModelPackage.MARKETPLACE__ORDERS:
			return orders != null && !orders.isEmpty();
		case MetaModelPackage.MARKETPLACE__AUCTIONS:
			return auctions != null && !auctions.isEmpty();
		case MetaModelPackage.MARKETPLACE__TOKEN:
			return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
		case MetaModelPackage.MARKETPLACE__PUBLICATION_FEE:
			return publicationFee != PUBLICATION_FEE_EDEFAULT;
		case MetaModelPackage.MARKETPLACE__TOKEN_MANAGER:
			return token_manager != null;
		case MetaModelPackage.MARKETPLACE__REGISTRY:
			return REGISTRY_EDEFAULT == null ? registry != null : !REGISTRY_EDEFAULT.equals(registry);
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
		case MetaModelPackage.MARKETPLACE___CREATE_AUCTION:
			createAuction();
			return null;
		case MetaModelPackage.MARKETPLACE___CANCEL_AUCTION:
			cancelAuction();
			return null;
		case MetaModelPackage.MARKETPLACE___CHANGE_OWNER:
			changeOwner();
			return null;
		case MetaModelPackage.MARKETPLACE___SET_PUBLICATION_FEE:
			setPublicationFee();
			return null;
		case MetaModelPackage.MARKETPLACE___CREATE_ORDER:
			createOrder();
			return null;
		case MetaModelPackage.MARKETPLACE___CANCEL_ORDER:
			cancelOrder();
			return null;
		case MetaModelPackage.MARKETPLACE___EXECUTE_ORDER:
			executeOrder();
			return null;
		case MetaModelPackage.MARKETPLACE___SET_OWNER_CUT:
			setOwnerCut();
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
		result.append(" (token: ");
		result.append(token);
		result.append(", publicationFee: ");
		result.append(publicationFee);
		result.append(", registry: ");
		result.append(registry);
		result.append(')');
		return result.toString();
	}

} //MarketplaceImpl
