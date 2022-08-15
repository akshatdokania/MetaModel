/**
 */
package metaModel.impl;

import java.lang.reflect.InvocationTargetException;

import metaModel.GameMinting;
import metaModel.MetaModelPackage;
import metaModel.Token_Manager;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Minting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.GameMintingImpl#getPromold <em>Promold</em>}</li>
 *   <li>{@link metaModel.impl.GameMintingImpl#getCount <em>Count</em>}</li>
 *   <li>{@link metaModel.impl.GameMintingImpl#getAuctionId <em>Auction Id</em>}</li>
 *   <li>{@link metaModel.impl.GameMintingImpl#getToken_manager <em>Token manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameMintingImpl extends MinimalEObjectImpl.Container implements GameMinting {
	/**
	 * The default value of the '{@link #getPromold() <em>Promold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromold()
	 * @generated
	 * @ordered
	 */
	protected static final int PROMOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPromold() <em>Promold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromold()
	 * @generated
	 * @ordered
	 */
	protected int promold = PROMOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuctionId() <em>Auction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuctionId()
	 * @generated
	 * @ordered
	 */
	protected static final int AUCTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAuctionId() <em>Auction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuctionId()
	 * @generated
	 * @ordered
	 */
	protected int auctionId = AUCTION_ID_EDEFAULT;

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
	protected GameMintingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.GAME_MINTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPromold() {
		return promold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromold(int newPromold) {
		int oldPromold = promold;
		promold = newPromold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.GAME_MINTING__PROMOLD, oldPromold,
					promold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.GAME_MINTING__COUNT, oldCount,
					count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAuctionId() {
		return auctionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuctionId(int newAuctionId) {
		int oldAuctionId = auctionId;
		auctionId = newAuctionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.GAME_MINTING__AUCTION_ID,
					oldAuctionId, auctionId));
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
							MetaModelPackage.GAME_MINTING__TOKEN_MANAGER, oldToken_manager, token_manager));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.GAME_MINTING__TOKEN_MANAGER,
					oldToken_manager, token_manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void computeNetPrice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPromo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModelPackage.GAME_MINTING__PROMOLD:
			return getPromold();
		case MetaModelPackage.GAME_MINTING__COUNT:
			return getCount();
		case MetaModelPackage.GAME_MINTING__AUCTION_ID:
			return getAuctionId();
		case MetaModelPackage.GAME_MINTING__TOKEN_MANAGER:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetaModelPackage.GAME_MINTING__PROMOLD:
			setPromold((Integer) newValue);
			return;
		case MetaModelPackage.GAME_MINTING__COUNT:
			setCount((Integer) newValue);
			return;
		case MetaModelPackage.GAME_MINTING__AUCTION_ID:
			setAuctionId((Integer) newValue);
			return;
		case MetaModelPackage.GAME_MINTING__TOKEN_MANAGER:
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
		case MetaModelPackage.GAME_MINTING__PROMOLD:
			setPromold(PROMOLD_EDEFAULT);
			return;
		case MetaModelPackage.GAME_MINTING__COUNT:
			setCount(COUNT_EDEFAULT);
			return;
		case MetaModelPackage.GAME_MINTING__AUCTION_ID:
			setAuctionId(AUCTION_ID_EDEFAULT);
			return;
		case MetaModelPackage.GAME_MINTING__TOKEN_MANAGER:
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
		case MetaModelPackage.GAME_MINTING__PROMOLD:
			return promold != PROMOLD_EDEFAULT;
		case MetaModelPackage.GAME_MINTING__COUNT:
			return count != COUNT_EDEFAULT;
		case MetaModelPackage.GAME_MINTING__AUCTION_ID:
			return auctionId != AUCTION_ID_EDEFAULT;
		case MetaModelPackage.GAME_MINTING__TOKEN_MANAGER:
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
		case MetaModelPackage.GAME_MINTING___COMPUTE_NET_PRICE:
			computeNetPrice();
			return null;
		case MetaModelPackage.GAME_MINTING___CREATE_PROMO:
			createPromo();
			return null;
		case MetaModelPackage.GAME_MINTING___CREATE_AUCTION:
			createAuction();
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
		result.append(" (promold: ");
		result.append(promold);
		result.append(", count: ");
		result.append(count);
		result.append(", auctionId: ");
		result.append(auctionId);
		result.append(')');
		return result.toString();
	}

} //GameMintingImpl
