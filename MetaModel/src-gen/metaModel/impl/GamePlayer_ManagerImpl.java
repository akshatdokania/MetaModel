/**
 */
package metaModel.impl;

import java.lang.reflect.InvocationTargetException;

import metaModel.GamePlayer_Manager;
import metaModel.MetaModelPackage;
import metaModel.Player;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Player Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.GamePlayer_ManagerImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link metaModel.impl.GamePlayer_ManagerImpl#getAdmin <em>Admin</em>}</li>
 *   <li>{@link metaModel.impl.GamePlayer_ManagerImpl#getPlayers <em>Players</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GamePlayer_ManagerImpl extends MinimalEObjectImpl.Container implements GamePlayer_Manager {
	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player player;

	/**
	 * The default value of the '{@link #getAdmin() <em>Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmin()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdmin() <em>Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmin()
	 * @generated
	 * @ordered
	 */
	protected String admin = ADMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayers() <em>Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected static final Object PLAYERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected Object players = PLAYERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamePlayer_ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.GAME_PLAYER_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getPlayer() {
		if (player != null && player.eIsProxy()) {
			InternalEObject oldPlayer = (InternalEObject) player;
			player = (Player) eResolveProxy(oldPlayer);
			if (player != oldPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetaModelPackage.GAME_PLAYER_MANAGER__PLAYER, oldPlayer, player));
			}
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayer(Player newPlayer, NotificationChain msgs) {
		Player oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.GAME_PLAYER_MANAGER__PLAYER, oldPlayer, newPlayer);
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
	public void setPlayer(Player newPlayer) {
		if (newPlayer != player) {
			NotificationChain msgs = null;
			if (player != null)
				msgs = ((InternalEObject) player).eInverseRemove(this, MetaModelPackage.PLAYER__GAMEPLAYER_MANAGER,
						Player.class, msgs);
			if (newPlayer != null)
				msgs = ((InternalEObject) newPlayer).eInverseAdd(this, MetaModelPackage.PLAYER__GAMEPLAYER_MANAGER,
						Player.class, msgs);
			msgs = basicSetPlayer(newPlayer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.GAME_PLAYER_MANAGER__PLAYER,
					newPlayer, newPlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdmin() {
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdmin(String newAdmin) {
		String oldAdmin = admin;
		admin = newAdmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.GAME_PLAYER_MANAGER__ADMIN, oldAdmin,
					admin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPlayers() {
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayers(Object newPlayers) {
		Object oldPlayers = players;
		players = newPlayers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.GAME_PLAYER_MANAGER__PLAYERS,
					oldPlayers, players));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPlayer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removePlayer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editPlayer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findPlayer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exist() {
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
		case MetaModelPackage.GAME_PLAYER_MANAGER__PLAYER:
			if (player != null)
				msgs = ((InternalEObject) player).eInverseRemove(this, MetaModelPackage.PLAYER__GAMEPLAYER_MANAGER,
						Player.class, msgs);
			return basicSetPlayer((Player) otherEnd, msgs);
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
		case MetaModelPackage.GAME_PLAYER_MANAGER__PLAYER:
			return basicSetPlayer(null, msgs);
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
		case MetaModelPackage.GAME_PLAYER_MANAGER__PLAYER:
			if (resolve)
				return getPlayer();
			return basicGetPlayer();
		case MetaModelPackage.GAME_PLAYER_MANAGER__ADMIN:
			return getAdmin();
		case MetaModelPackage.GAME_PLAYER_MANAGER__PLAYERS:
			return getPlayers();
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
		case MetaModelPackage.GAME_PLAYER_MANAGER__PLAYER:
			setPlayer((Player) newValue);
			return;
		case MetaModelPackage.GAME_PLAYER_MANAGER__ADMIN:
			setAdmin((String) newValue);
			return;
		case MetaModelPackage.GAME_PLAYER_MANAGER__PLAYERS:
			setPlayers(newValue);
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
		case MetaModelPackage.GAME_PLAYER_MANAGER__PLAYER:
			setPlayer((Player) null);
			return;
		case MetaModelPackage.GAME_PLAYER_MANAGER__ADMIN:
			setAdmin(ADMIN_EDEFAULT);
			return;
		case MetaModelPackage.GAME_PLAYER_MANAGER__PLAYERS:
			setPlayers(PLAYERS_EDEFAULT);
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
		case MetaModelPackage.GAME_PLAYER_MANAGER__PLAYER:
			return player != null;
		case MetaModelPackage.GAME_PLAYER_MANAGER__ADMIN:
			return ADMIN_EDEFAULT == null ? admin != null : !ADMIN_EDEFAULT.equals(admin);
		case MetaModelPackage.GAME_PLAYER_MANAGER__PLAYERS:
			return PLAYERS_EDEFAULT == null ? players != null : !PLAYERS_EDEFAULT.equals(players);
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
		case MetaModelPackage.GAME_PLAYER_MANAGER___ADD_PLAYER:
			addPlayer();
			return null;
		case MetaModelPackage.GAME_PLAYER_MANAGER___REMOVE_PLAYER:
			removePlayer();
			return null;
		case MetaModelPackage.GAME_PLAYER_MANAGER___EDIT_PLAYER:
			editPlayer();
			return null;
		case MetaModelPackage.GAME_PLAYER_MANAGER___FIND_PLAYER:
			findPlayer();
			return null;
		case MetaModelPackage.GAME_PLAYER_MANAGER___EXIST:
			exist();
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
		result.append(" (admin: ");
		result.append(admin);
		result.append(", players: ");
		result.append(players);
		result.append(')');
		return result.toString();
	}

} //GamePlayer_ManagerImpl
