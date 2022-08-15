/**
 */
package metaModel.impl;

import java.util.Collection;

import metaModel.Buffer;
import metaModel.Buffer_Manager;
import metaModel.MetaModelPackage;
import metaModel.Token_Manager;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buffer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.BufferImpl#getBuffer_manager <em>Buffer manager</em>}</li>
 *   <li>{@link metaModel.impl.BufferImpl#getBuf <em>Buf</em>}</li>
 *   <li>{@link metaModel.impl.BufferImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link metaModel.impl.BufferImpl#getToken_manager <em>Token manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BufferImpl extends MinimalEObjectImpl.Container implements Buffer {
	/**
	 * The cached value of the '{@link #getBuffer_manager() <em>Buffer manager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffer_manager()
	 * @generated
	 * @ordered
	 */
	protected EList<Buffer_Manager> buffer_manager;

	/**
	 * The default value of the '{@link #getBuf() <em>Buf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuf()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BUF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuf() <em>Buf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuf()
	 * @generated
	 * @ordered
	 */
	protected byte[] buf = BUF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

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
	protected BufferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.BUFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Buffer_Manager> getBuffer_manager() {
		if (buffer_manager == null) {
			buffer_manager = new EObjectContainmentEList<Buffer_Manager>(Buffer_Manager.class, this,
					MetaModelPackage.BUFFER__BUFFER_MANAGER);
		}
		return buffer_manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getBuf() {
		return buf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuf(byte[] newBuf) {
		byte[] oldBuf = buf;
		buf = newBuf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.BUFFER__BUF, oldBuf, buf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.BUFFER__CAPACITY, oldCapacity,
					capacity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.BUFFER__TOKEN_MANAGER,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.BUFFER__TOKEN_MANAGER,
					oldToken_manager, token_manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelPackage.BUFFER__BUFFER_MANAGER:
			return ((InternalEList<?>) getBuffer_manager()).basicRemove(otherEnd, msgs);
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
		case MetaModelPackage.BUFFER__BUFFER_MANAGER:
			return getBuffer_manager();
		case MetaModelPackage.BUFFER__BUF:
			return getBuf();
		case MetaModelPackage.BUFFER__CAPACITY:
			return getCapacity();
		case MetaModelPackage.BUFFER__TOKEN_MANAGER:
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
		case MetaModelPackage.BUFFER__BUFFER_MANAGER:
			getBuffer_manager().clear();
			getBuffer_manager().addAll((Collection<? extends Buffer_Manager>) newValue);
			return;
		case MetaModelPackage.BUFFER__BUF:
			setBuf((byte[]) newValue);
			return;
		case MetaModelPackage.BUFFER__CAPACITY:
			setCapacity((Integer) newValue);
			return;
		case MetaModelPackage.BUFFER__TOKEN_MANAGER:
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
		case MetaModelPackage.BUFFER__BUFFER_MANAGER:
			getBuffer_manager().clear();
			return;
		case MetaModelPackage.BUFFER__BUF:
			setBuf(BUF_EDEFAULT);
			return;
		case MetaModelPackage.BUFFER__CAPACITY:
			setCapacity(CAPACITY_EDEFAULT);
			return;
		case MetaModelPackage.BUFFER__TOKEN_MANAGER:
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
		case MetaModelPackage.BUFFER__BUFFER_MANAGER:
			return buffer_manager != null && !buffer_manager.isEmpty();
		case MetaModelPackage.BUFFER__BUF:
			return BUF_EDEFAULT == null ? buf != null : !BUF_EDEFAULT.equals(buf);
		case MetaModelPackage.BUFFER__CAPACITY:
			return capacity != CAPACITY_EDEFAULT;
		case MetaModelPackage.BUFFER__TOKEN_MANAGER:
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (buf: ");
		result.append(buf);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //BufferImpl
