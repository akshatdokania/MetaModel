/**
 */
package metaModel.impl;

import java.lang.reflect.InvocationTargetException;

import metaModel.GameCore;
import metaModel.GameMinting;
import metaModel.GamePlayer_Manager;
import metaModel.MetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.GameCoreImpl#getGameplayer_manager <em>Gameplayer manager</em>}</li>
 *   <li>{@link metaModel.impl.GameCoreImpl#getGameminting <em>Gameminting</em>}</li>
 *   <li>{@link metaModel.impl.GameCoreImpl#getNewPlayerAddress <em>New Player Address</em>}</li>
 *   <li>{@link metaModel.impl.GameCoreImpl#getActive_players <em>Active players</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameCoreImpl extends MinimalEObjectImpl.Container implements GameCore {
	/**
	 * The cached value of the '{@link #getGameplayer_manager() <em>Gameplayer manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameplayer_manager()
	 * @generated
	 * @ordered
	 */
	protected GamePlayer_Manager gameplayer_manager;

	/**
	 * The cached value of the '{@link #getGameminting() <em>Gameminting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameminting()
	 * @generated
	 * @ordered
	 */
	protected GameMinting gameminting;

	/**
	 * The default value of the '{@link #getNewPlayerAddress() <em>New Player Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewPlayerAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_PLAYER_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewPlayerAddress() <em>New Player Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewPlayerAddress()
	 * @generated
	 * @ordered
	 */
	protected String newPlayerAddress = NEW_PLAYER_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive_players() <em>Active players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_players()
	 * @generated
	 * @ordered
	 */
	protected static final Object ACTIVE_PLAYERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActive_players() <em>Active players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_players()
	 * @generated
	 * @ordered
	 */
	protected Object active_players = ACTIVE_PLAYERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameCoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.GAME_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamePlayer_Manager getGameplayer_manager() {
		if (gameplayer_manager != null && gameplayer_manager.eIsProxy()) {
			InternalEObject oldGameplayer_manager = (InternalEObject) gameplayer_manager;
			gameplayer_manager = (GamePlayer_Manager) eResolveProxy(oldGameplayer_manager);
			if (gameplayer_manager != oldGameplayer_manager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetaModelPackage.GAME_CORE__GAMEPLAYER_MANAGER, oldGameplayer_manager, gameplayer_manager));
			}
		}
		return gameplayer_manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamePlayer_Manager basicGetGameplayer_manager() {
		return gameplayer_manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameplayer_manager(GamePlayer_Manager newGameplayer_manager) {
		GamePlayer_Manager oldGameplayer_manager = gameplayer_manager;
		gameplayer_manager = newGameplayer_manager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.GAME_CORE__GAMEPLAYER_MANAGER,
					oldGameplayer_manager, gameplayer_manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameMinting getGameminting() {
		if (gameminting != null && gameminting.eIsProxy()) {
			InternalEObject oldGameminting = (InternalEObject) gameminting;
			gameminting = (GameMinting) eResolveProxy(oldGameminting);
			if (gameminting != oldGameminting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.GAME_CORE__GAMEMINTING,
							oldGameminting, gameminting));
			}
		}
		return gameminting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameMinting basicGetGameminting() {
		return gameminting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameminting(GameMinting newGameminting) {
		GameMinting oldGameminting = gameminting;
		gameminting = newGameminting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.GAME_CORE__GAMEMINTING,
					oldGameminting, gameminting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewPlayerAddress() {
		return newPlayerAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewPlayerAddress(String newNewPlayerAddress) {
		String oldNewPlayerAddress = newPlayerAddress;
		newPlayerAddress = newNewPlayerAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.GAME_CORE__NEW_PLAYER_ADDRESS,
					oldNewPlayerAddress, newPlayerAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getActive_players() {
		return active_players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_players(Object newActive_players) {
		Object oldActive_players = active_players;
		active_players = newActive_players;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.GAME_CORE__ACTIVE_PLAYERS,
					oldActive_players, active_players));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewAddress() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getCollectible() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void withdraw() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void join() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ping() {
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
		case MetaModelPackage.GAME_CORE__GAMEPLAYER_MANAGER:
			if (resolve)
				return getGameplayer_manager();
			return basicGetGameplayer_manager();
		case MetaModelPackage.GAME_CORE__GAMEMINTING:
			if (resolve)
				return getGameminting();
			return basicGetGameminting();
		case MetaModelPackage.GAME_CORE__NEW_PLAYER_ADDRESS:
			return getNewPlayerAddress();
		case MetaModelPackage.GAME_CORE__ACTIVE_PLAYERS:
			return getActive_players();
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
		case MetaModelPackage.GAME_CORE__GAMEPLAYER_MANAGER:
			setGameplayer_manager((GamePlayer_Manager) newValue);
			return;
		case MetaModelPackage.GAME_CORE__GAMEMINTING:
			setGameminting((GameMinting) newValue);
			return;
		case MetaModelPackage.GAME_CORE__NEW_PLAYER_ADDRESS:
			setNewPlayerAddress((String) newValue);
			return;
		case MetaModelPackage.GAME_CORE__ACTIVE_PLAYERS:
			setActive_players(newValue);
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
		case MetaModelPackage.GAME_CORE__GAMEPLAYER_MANAGER:
			setGameplayer_manager((GamePlayer_Manager) null);
			return;
		case MetaModelPackage.GAME_CORE__GAMEMINTING:
			setGameminting((GameMinting) null);
			return;
		case MetaModelPackage.GAME_CORE__NEW_PLAYER_ADDRESS:
			setNewPlayerAddress(NEW_PLAYER_ADDRESS_EDEFAULT);
			return;
		case MetaModelPackage.GAME_CORE__ACTIVE_PLAYERS:
			setActive_players(ACTIVE_PLAYERS_EDEFAULT);
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
		case MetaModelPackage.GAME_CORE__GAMEPLAYER_MANAGER:
			return gameplayer_manager != null;
		case MetaModelPackage.GAME_CORE__GAMEMINTING:
			return gameminting != null;
		case MetaModelPackage.GAME_CORE__NEW_PLAYER_ADDRESS:
			return NEW_PLAYER_ADDRESS_EDEFAULT == null ? newPlayerAddress != null
					: !NEW_PLAYER_ADDRESS_EDEFAULT.equals(newPlayerAddress);
		case MetaModelPackage.GAME_CORE__ACTIVE_PLAYERS:
			return ACTIVE_PLAYERS_EDEFAULT == null ? active_players != null
					: !ACTIVE_PLAYERS_EDEFAULT.equals(active_players);
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
		case MetaModelPackage.GAME_CORE___SET_NEW_ADDRESS:
			setNewAddress();
			return null;
		case MetaModelPackage.GAME_CORE___GET_COLLECTIBLE:
			getCollectible();
			return null;
		case MetaModelPackage.GAME_CORE___WITHDRAW:
			withdraw();
			return null;
		case MetaModelPackage.GAME_CORE___JOIN:
			join();
			return null;
		case MetaModelPackage.GAME_CORE___PING:
			ping();
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
		result.append(" (newPlayerAddress: ");
		result.append(newPlayerAddress);
		result.append(", active_players: ");
		result.append(active_players);
		result.append(')');
		return result.toString();
	}

} //GameCoreImpl
