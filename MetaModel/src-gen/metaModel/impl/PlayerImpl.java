/**
 */
package metaModel.impl;

import metaModel.GamePlayer_Manager;
import metaModel.MetaModelPackage;
import metaModel.Player;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.PlayerImpl#getGameplayer_manager <em>Gameplayer manager</em>}</li>
 *   <li>{@link metaModel.impl.PlayerImpl#getId <em>Id</em>}</li>
 *   <li>{@link metaModel.impl.PlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link metaModel.impl.PlayerImpl#getAddr <em>Addr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends ContractImpl implements Player {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected String addr = ADDR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.PLAYER;
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
							MetaModelPackage.PLAYER__GAMEPLAYER_MANAGER, oldGameplayer_manager, gameplayer_manager));
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
	public NotificationChain basicSetGameplayer_manager(GamePlayer_Manager newGameplayer_manager,
			NotificationChain msgs) {
		GamePlayer_Manager oldGameplayer_manager = gameplayer_manager;
		gameplayer_manager = newGameplayer_manager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.PLAYER__GAMEPLAYER_MANAGER, oldGameplayer_manager, newGameplayer_manager);
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
	public void setGameplayer_manager(GamePlayer_Manager newGameplayer_manager) {
		if (newGameplayer_manager != gameplayer_manager) {
			NotificationChain msgs = null;
			if (gameplayer_manager != null)
				msgs = ((InternalEObject) gameplayer_manager).eInverseRemove(this,
						MetaModelPackage.GAME_PLAYER_MANAGER__PLAYER, GamePlayer_Manager.class, msgs);
			if (newGameplayer_manager != null)
				msgs = ((InternalEObject) newGameplayer_manager).eInverseAdd(this,
						MetaModelPackage.GAME_PLAYER_MANAGER__PLAYER, GamePlayer_Manager.class, msgs);
			msgs = basicSetGameplayer_manager(newGameplayer_manager, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.PLAYER__GAMEPLAYER_MANAGER,
					newGameplayer_manager, newGameplayer_manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.PLAYER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.PLAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(String newAddr) {
		String oldAddr = addr;
		addr = newAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.PLAYER__ADDR, oldAddr, addr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelPackage.PLAYER__GAMEPLAYER_MANAGER:
			if (gameplayer_manager != null)
				msgs = ((InternalEObject) gameplayer_manager).eInverseRemove(this,
						MetaModelPackage.GAME_PLAYER_MANAGER__PLAYER, GamePlayer_Manager.class, msgs);
			return basicSetGameplayer_manager((GamePlayer_Manager) otherEnd, msgs);
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
		case MetaModelPackage.PLAYER__GAMEPLAYER_MANAGER:
			return basicSetGameplayer_manager(null, msgs);
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
		case MetaModelPackage.PLAYER__GAMEPLAYER_MANAGER:
			if (resolve)
				return getGameplayer_manager();
			return basicGetGameplayer_manager();
		case MetaModelPackage.PLAYER__ID:
			return getId();
		case MetaModelPackage.PLAYER__NAME:
			return getName();
		case MetaModelPackage.PLAYER__ADDR:
			return getAddr();
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
		case MetaModelPackage.PLAYER__GAMEPLAYER_MANAGER:
			setGameplayer_manager((GamePlayer_Manager) newValue);
			return;
		case MetaModelPackage.PLAYER__ID:
			setId((Integer) newValue);
			return;
		case MetaModelPackage.PLAYER__NAME:
			setName((String) newValue);
			return;
		case MetaModelPackage.PLAYER__ADDR:
			setAddr((String) newValue);
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
		case MetaModelPackage.PLAYER__GAMEPLAYER_MANAGER:
			setGameplayer_manager((GamePlayer_Manager) null);
			return;
		case MetaModelPackage.PLAYER__ID:
			setId(ID_EDEFAULT);
			return;
		case MetaModelPackage.PLAYER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetaModelPackage.PLAYER__ADDR:
			setAddr(ADDR_EDEFAULT);
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
		case MetaModelPackage.PLAYER__GAMEPLAYER_MANAGER:
			return gameplayer_manager != null;
		case MetaModelPackage.PLAYER__ID:
			return id != ID_EDEFAULT;
		case MetaModelPackage.PLAYER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetaModelPackage.PLAYER__ADDR:
			return ADDR_EDEFAULT == null ? addr != null : !ADDR_EDEFAULT.equals(addr);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", addr: ");
		result.append(addr);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
