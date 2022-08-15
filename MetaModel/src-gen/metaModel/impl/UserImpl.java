/**
 */
package metaModel.impl;

import metaModel.Address;
import metaModel.MetaModelPackage;
import metaModel.Transaction;
import metaModel.User;
import metaModel.Wallet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.UserImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link metaModel.impl.UserImpl#getWallet <em>Wallet</em>}</li>
 *   <li>{@link metaModel.impl.UserImpl#getTransaction <em>Transaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
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
	 * The cached value of the '{@link #getWallet() <em>Wallet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallet()
	 * @generated
	 * @ordered
	 */
	protected Wallet wallet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.USER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.USER__ADDRESS,
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
					MetaModelPackage.USER__ADDRESS, oldAddress, newAddress);
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
				msgs = ((InternalEObject) address).eInverseRemove(this, MetaModelPackage.ADDRESS__USER, Address.class,
						msgs);
			if (newAddress != null)
				msgs = ((InternalEObject) newAddress).eInverseAdd(this, MetaModelPackage.ADDRESS__USER, Address.class,
						msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.USER__ADDRESS, newAddress,
					newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wallet getWallet() {
		if (wallet != null && wallet.eIsProxy()) {
			InternalEObject oldWallet = (InternalEObject) wallet;
			wallet = (Wallet) eResolveProxy(oldWallet);
			if (wallet != oldWallet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.USER__WALLET, oldWallet,
							wallet));
			}
		}
		return wallet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wallet basicGetWallet() {
		return wallet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWallet(Wallet newWallet, NotificationChain msgs) {
		Wallet oldWallet = wallet;
		wallet = newWallet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.USER__WALLET, oldWallet, newWallet);
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
	public void setWallet(Wallet newWallet) {
		if (newWallet != wallet) {
			NotificationChain msgs = null;
			if (wallet != null)
				msgs = ((InternalEObject) wallet).eInverseRemove(this, MetaModelPackage.WALLET__USER, Wallet.class,
						msgs);
			if (newWallet != null)
				msgs = ((InternalEObject) newWallet).eInverseAdd(this, MetaModelPackage.WALLET__USER, Wallet.class,
						msgs);
			msgs = basicSetWallet(newWallet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.USER__WALLET, newWallet, newWallet));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.USER__TRANSACTION,
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
					MetaModelPackage.USER__TRANSACTION, oldTransaction, newTransaction);
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
				msgs = ((InternalEObject) transaction).eInverseRemove(this, MetaModelPackage.TRANSACTION__USER,
						Transaction.class, msgs);
			if (newTransaction != null)
				msgs = ((InternalEObject) newTransaction).eInverseAdd(this, MetaModelPackage.TRANSACTION__USER,
						Transaction.class, msgs);
			msgs = basicSetTransaction(newTransaction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.USER__TRANSACTION, newTransaction,
					newTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelPackage.USER__ADDRESS:
			if (address != null)
				msgs = ((InternalEObject) address).eInverseRemove(this, MetaModelPackage.ADDRESS__USER, Address.class,
						msgs);
			return basicSetAddress((Address) otherEnd, msgs);
		case MetaModelPackage.USER__WALLET:
			if (wallet != null)
				msgs = ((InternalEObject) wallet).eInverseRemove(this, MetaModelPackage.WALLET__USER, Wallet.class,
						msgs);
			return basicSetWallet((Wallet) otherEnd, msgs);
		case MetaModelPackage.USER__TRANSACTION:
			if (transaction != null)
				msgs = ((InternalEObject) transaction).eInverseRemove(this, MetaModelPackage.TRANSACTION__USER,
						Transaction.class, msgs);
			return basicSetTransaction((Transaction) otherEnd, msgs);
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
		case MetaModelPackage.USER__ADDRESS:
			return basicSetAddress(null, msgs);
		case MetaModelPackage.USER__WALLET:
			return basicSetWallet(null, msgs);
		case MetaModelPackage.USER__TRANSACTION:
			return basicSetTransaction(null, msgs);
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
		case MetaModelPackage.USER__ADDRESS:
			if (resolve)
				return getAddress();
			return basicGetAddress();
		case MetaModelPackage.USER__WALLET:
			if (resolve)
				return getWallet();
			return basicGetWallet();
		case MetaModelPackage.USER__TRANSACTION:
			if (resolve)
				return getTransaction();
			return basicGetTransaction();
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
		case MetaModelPackage.USER__ADDRESS:
			setAddress((Address) newValue);
			return;
		case MetaModelPackage.USER__WALLET:
			setWallet((Wallet) newValue);
			return;
		case MetaModelPackage.USER__TRANSACTION:
			setTransaction((Transaction) newValue);
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
		case MetaModelPackage.USER__ADDRESS:
			setAddress((Address) null);
			return;
		case MetaModelPackage.USER__WALLET:
			setWallet((Wallet) null);
			return;
		case MetaModelPackage.USER__TRANSACTION:
			setTransaction((Transaction) null);
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
		case MetaModelPackage.USER__ADDRESS:
			return address != null;
		case MetaModelPackage.USER__WALLET:
			return wallet != null;
		case MetaModelPackage.USER__TRANSACTION:
			return transaction != null;
		}
		return super.eIsSet(featureID);
	}

} //UserImpl
