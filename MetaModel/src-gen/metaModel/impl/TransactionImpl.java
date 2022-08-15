/**
 */
package metaModel.impl;

import metaModel.Address;
import metaModel.MetaModelPackage;
import metaModel.SignatureValidator;
import metaModel.Transaction;
import metaModel.User;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.TransactionImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link metaModel.impl.TransactionImpl#getUser <em>User</em>}</li>
 *   <li>{@link metaModel.impl.TransactionImpl#getSignaturevalidator <em>Signaturevalidator</em>}</li>
 *   <li>{@link metaModel.impl.TransactionImpl#getTo <em>To</em>}</li>
 *   <li>{@link metaModel.impl.TransactionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link metaModel.impl.TransactionImpl#getHash <em>Hash</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends MinimalEObjectImpl.Container implements Transaction {
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
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * The cached value of the '{@link #getSignaturevalidator() <em>Signaturevalidator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignaturevalidator()
	 * @generated
	 * @ordered
	 */
	protected SignatureValidator signaturevalidator;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHash() <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected static final String HASH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHash() <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected String hash = HASH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.TRANSACTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.TRANSACTION__ADDRESS,
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
					MetaModelPackage.TRANSACTION__ADDRESS, oldAddress, newAddress);
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
				msgs = ((InternalEObject) address).eInverseRemove(this, MetaModelPackage.ADDRESS__TRANSACTION,
						Address.class, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject) newAddress).eInverseAdd(this, MetaModelPackage.ADDRESS__TRANSACTION,
						Address.class, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.TRANSACTION__ADDRESS, newAddress,
					newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject) user;
			user = (User) eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.TRANSACTION__USER,
							oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.TRANSACTION__USER, oldUser, newUser);
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
	public void setUser(User newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject) user).eInverseRemove(this, MetaModelPackage.USER__TRANSACTION, User.class,
						msgs);
			if (newUser != null)
				msgs = ((InternalEObject) newUser).eInverseAdd(this, MetaModelPackage.USER__TRANSACTION, User.class,
						msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.TRANSACTION__USER, newUser,
					newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureValidator getSignaturevalidator() {
		if (signaturevalidator != null && signaturevalidator.eIsProxy()) {
			InternalEObject oldSignaturevalidator = (InternalEObject) signaturevalidator;
			signaturevalidator = (SignatureValidator) eResolveProxy(oldSignaturevalidator);
			if (signaturevalidator != oldSignaturevalidator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetaModelPackage.TRANSACTION__SIGNATUREVALIDATOR, oldSignaturevalidator,
							signaturevalidator));
			}
		}
		return signaturevalidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureValidator basicGetSignaturevalidator() {
		return signaturevalidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignaturevalidator(SignatureValidator newSignaturevalidator) {
		SignatureValidator oldSignaturevalidator = signaturevalidator;
		signaturevalidator = newSignaturevalidator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.TRANSACTION__SIGNATUREVALIDATOR,
					oldSignaturevalidator, signaturevalidator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.TRANSACTION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(String newFrom) {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.TRANSACTION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(String newHash) {
		String oldHash = hash;
		hash = newHash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.TRANSACTION__HASH, oldHash, hash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelPackage.TRANSACTION__ADDRESS:
			if (address != null)
				msgs = ((InternalEObject) address).eInverseRemove(this, MetaModelPackage.ADDRESS__TRANSACTION,
						Address.class, msgs);
			return basicSetAddress((Address) otherEnd, msgs);
		case MetaModelPackage.TRANSACTION__USER:
			if (user != null)
				msgs = ((InternalEObject) user).eInverseRemove(this, MetaModelPackage.USER__TRANSACTION, User.class,
						msgs);
			return basicSetUser((User) otherEnd, msgs);
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
		case MetaModelPackage.TRANSACTION__ADDRESS:
			return basicSetAddress(null, msgs);
		case MetaModelPackage.TRANSACTION__USER:
			return basicSetUser(null, msgs);
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
		case MetaModelPackage.TRANSACTION__ADDRESS:
			if (resolve)
				return getAddress();
			return basicGetAddress();
		case MetaModelPackage.TRANSACTION__USER:
			if (resolve)
				return getUser();
			return basicGetUser();
		case MetaModelPackage.TRANSACTION__SIGNATUREVALIDATOR:
			if (resolve)
				return getSignaturevalidator();
			return basicGetSignaturevalidator();
		case MetaModelPackage.TRANSACTION__TO:
			return getTo();
		case MetaModelPackage.TRANSACTION__FROM:
			return getFrom();
		case MetaModelPackage.TRANSACTION__HASH:
			return getHash();
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
		case MetaModelPackage.TRANSACTION__ADDRESS:
			setAddress((Address) newValue);
			return;
		case MetaModelPackage.TRANSACTION__USER:
			setUser((User) newValue);
			return;
		case MetaModelPackage.TRANSACTION__SIGNATUREVALIDATOR:
			setSignaturevalidator((SignatureValidator) newValue);
			return;
		case MetaModelPackage.TRANSACTION__TO:
			setTo((String) newValue);
			return;
		case MetaModelPackage.TRANSACTION__FROM:
			setFrom((String) newValue);
			return;
		case MetaModelPackage.TRANSACTION__HASH:
			setHash((String) newValue);
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
		case MetaModelPackage.TRANSACTION__ADDRESS:
			setAddress((Address) null);
			return;
		case MetaModelPackage.TRANSACTION__USER:
			setUser((User) null);
			return;
		case MetaModelPackage.TRANSACTION__SIGNATUREVALIDATOR:
			setSignaturevalidator((SignatureValidator) null);
			return;
		case MetaModelPackage.TRANSACTION__TO:
			setTo(TO_EDEFAULT);
			return;
		case MetaModelPackage.TRANSACTION__FROM:
			setFrom(FROM_EDEFAULT);
			return;
		case MetaModelPackage.TRANSACTION__HASH:
			setHash(HASH_EDEFAULT);
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
		case MetaModelPackage.TRANSACTION__ADDRESS:
			return address != null;
		case MetaModelPackage.TRANSACTION__USER:
			return user != null;
		case MetaModelPackage.TRANSACTION__SIGNATUREVALIDATOR:
			return signaturevalidator != null;
		case MetaModelPackage.TRANSACTION__TO:
			return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
		case MetaModelPackage.TRANSACTION__FROM:
			return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
		case MetaModelPackage.TRANSACTION__HASH:
			return HASH_EDEFAULT == null ? hash != null : !HASH_EDEFAULT.equals(hash);
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
		result.append(" (to: ");
		result.append(to);
		result.append(", from: ");
		result.append(from);
		result.append(", hash: ");
		result.append(hash);
		result.append(')');
		return result.toString();
	}

} //TransactionImpl
