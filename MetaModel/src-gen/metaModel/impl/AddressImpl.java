/**
 */
package metaModel.impl;

import metaModel.Address;
import metaModel.Contract;
import metaModel.MetaModelPackage;
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
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.AddressImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link metaModel.impl.AddressImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link metaModel.impl.AddressImpl#getUser <em>User</em>}</li>
 *   <li>{@link metaModel.impl.AddressImpl#getAddr <em>Addr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressImpl extends MinimalEObjectImpl.Container implements Address {
	/**
	 * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaction()
	 * @generated
	 * @ordered
	 */
	protected Transaction transaction;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected Contract contract;

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
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction getTransaction() {
		if (transaction != null && transaction.eIsProxy()) {
			InternalEObject oldTransaction = (InternalEObject) transaction;
			transaction = (Transaction) eResolveProxy(oldTransaction);
			if (transaction != oldTransaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.ADDRESS__TRANSACTION,
							oldTransaction, transaction));
			}
		}
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction basicGetTransaction() {
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransaction(Transaction newTransaction, NotificationChain msgs) {
		Transaction oldTransaction = transaction;
		transaction = newTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.ADDRESS__TRANSACTION, oldTransaction, newTransaction);
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
	public void setTransaction(Transaction newTransaction) {
		if (newTransaction != transaction) {
			NotificationChain msgs = null;
			if (transaction != null)
				msgs = ((InternalEObject) transaction).eInverseRemove(this, MetaModelPackage.TRANSACTION__ADDRESS,
						Transaction.class, msgs);
			if (newTransaction != null)
				msgs = ((InternalEObject) newTransaction).eInverseAdd(this, MetaModelPackage.TRANSACTION__ADDRESS,
						Transaction.class, msgs);
			msgs = basicSetTransaction(newTransaction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.ADDRESS__TRANSACTION, newTransaction,
					newTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract getContract() {
		if (contract != null && contract.eIsProxy()) {
			InternalEObject oldContract = (InternalEObject) contract;
			contract = (Contract) eResolveProxy(oldContract);
			if (contract != oldContract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.ADDRESS__CONTRACT,
							oldContract, contract));
			}
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract basicGetContract() {
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContract(Contract newContract, NotificationChain msgs) {
		Contract oldContract = contract;
		contract = newContract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.ADDRESS__CONTRACT, oldContract, newContract);
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
	public void setContract(Contract newContract) {
		if (newContract != contract) {
			NotificationChain msgs = null;
			if (contract != null)
				msgs = ((InternalEObject) contract).eInverseRemove(this, MetaModelPackage.CONTRACT__ADDRESS,
						Contract.class, msgs);
			if (newContract != null)
				msgs = ((InternalEObject) newContract).eInverseAdd(this, MetaModelPackage.CONTRACT__ADDRESS,
						Contract.class, msgs);
			msgs = basicSetContract(newContract, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.ADDRESS__CONTRACT, newContract,
					newContract));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.ADDRESS__USER, oldUser,
							user));
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
					MetaModelPackage.ADDRESS__USER, oldUser, newUser);
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
				msgs = ((InternalEObject) user).eInverseRemove(this, MetaModelPackage.USER__ADDRESS, User.class, msgs);
			if (newUser != null)
				msgs = ((InternalEObject) newUser).eInverseAdd(this, MetaModelPackage.USER__ADDRESS, User.class, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.ADDRESS__USER, newUser, newUser));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.ADDRESS__ADDR, oldAddr, addr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelPackage.ADDRESS__TRANSACTION:
			if (transaction != null)
				msgs = ((InternalEObject) transaction).eInverseRemove(this, MetaModelPackage.TRANSACTION__ADDRESS,
						Transaction.class, msgs);
			return basicSetTransaction((Transaction) otherEnd, msgs);
		case MetaModelPackage.ADDRESS__CONTRACT:
			if (contract != null)
				msgs = ((InternalEObject) contract).eInverseRemove(this, MetaModelPackage.CONTRACT__ADDRESS,
						Contract.class, msgs);
			return basicSetContract((Contract) otherEnd, msgs);
		case MetaModelPackage.ADDRESS__USER:
			if (user != null)
				msgs = ((InternalEObject) user).eInverseRemove(this, MetaModelPackage.USER__ADDRESS, User.class, msgs);
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
		case MetaModelPackage.ADDRESS__TRANSACTION:
			return basicSetTransaction(null, msgs);
		case MetaModelPackage.ADDRESS__CONTRACT:
			return basicSetContract(null, msgs);
		case MetaModelPackage.ADDRESS__USER:
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
		case MetaModelPackage.ADDRESS__TRANSACTION:
			if (resolve)
				return getTransaction();
			return basicGetTransaction();
		case MetaModelPackage.ADDRESS__CONTRACT:
			if (resolve)
				return getContract();
			return basicGetContract();
		case MetaModelPackage.ADDRESS__USER:
			if (resolve)
				return getUser();
			return basicGetUser();
		case MetaModelPackage.ADDRESS__ADDR:
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
		case MetaModelPackage.ADDRESS__TRANSACTION:
			setTransaction((Transaction) newValue);
			return;
		case MetaModelPackage.ADDRESS__CONTRACT:
			setContract((Contract) newValue);
			return;
		case MetaModelPackage.ADDRESS__USER:
			setUser((User) newValue);
			return;
		case MetaModelPackage.ADDRESS__ADDR:
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
		case MetaModelPackage.ADDRESS__TRANSACTION:
			setTransaction((Transaction) null);
			return;
		case MetaModelPackage.ADDRESS__CONTRACT:
			setContract((Contract) null);
			return;
		case MetaModelPackage.ADDRESS__USER:
			setUser((User) null);
			return;
		case MetaModelPackage.ADDRESS__ADDR:
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
		case MetaModelPackage.ADDRESS__TRANSACTION:
			return transaction != null;
		case MetaModelPackage.ADDRESS__CONTRACT:
			return contract != null;
		case MetaModelPackage.ADDRESS__USER:
			return user != null;
		case MetaModelPackage.ADDRESS__ADDR:
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
		result.append(" (addr: ");
		result.append(addr);
		result.append(')');
		return result.toString();
	}

} //AddressImpl
