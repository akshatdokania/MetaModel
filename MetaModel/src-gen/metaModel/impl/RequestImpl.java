/**
 */
package metaModel.impl;

import metaModel.Buffer_Manager;
import metaModel.MetaModelPackage;
import metaModel.Request;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.RequestImpl#getBuffer_manager <em>Buffer manager</em>}</li>
 *   <li>{@link metaModel.impl.RequestImpl#getId <em>Id</em>}</li>
 *   <li>{@link metaModel.impl.RequestImpl#getCallBackAddress <em>Call Back Address</em>}</li>
 *   <li>{@link metaModel.impl.RequestImpl#getBuf <em>Buf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestImpl extends MinimalEObjectImpl.Container implements Request {
	/**
	 * The cached value of the '{@link #getBuffer_manager() <em>Buffer manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffer_manager()
	 * @generated
	 * @ordered
	 */
	protected Buffer_Manager buffer_manager;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final byte ID_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected byte id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallBackAddress() <em>Call Back Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallBackAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CALL_BACK_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallBackAddress() <em>Call Back Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallBackAddress()
	 * @generated
	 * @ordered
	 */
	protected String callBackAddress = CALL_BACK_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuf() <em>Buf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuf()
	 * @generated
	 * @ordered
	 */
	protected static final Object BUF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuf() <em>Buf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuf()
	 * @generated
	 * @ordered
	 */
	protected Object buf = BUF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer_Manager getBuffer_manager() {
		if (buffer_manager != null && buffer_manager.eIsProxy()) {
			InternalEObject oldBuffer_manager = (InternalEObject) buffer_manager;
			buffer_manager = (Buffer_Manager) eResolveProxy(oldBuffer_manager);
			if (buffer_manager != oldBuffer_manager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.REQUEST__BUFFER_MANAGER,
							oldBuffer_manager, buffer_manager));
			}
		}
		return buffer_manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer_Manager basicGetBuffer_manager() {
		return buffer_manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffer_manager(Buffer_Manager newBuffer_manager) {
		Buffer_Manager oldBuffer_manager = buffer_manager;
		buffer_manager = newBuffer_manager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.REQUEST__BUFFER_MANAGER,
					oldBuffer_manager, buffer_manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(byte newId) {
		byte oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.REQUEST__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCallBackAddress() {
		return callBackAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallBackAddress(String newCallBackAddress) {
		String oldCallBackAddress = callBackAddress;
		callBackAddress = newCallBackAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.REQUEST__CALL_BACK_ADDRESS,
					oldCallBackAddress, callBackAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBuf() {
		return buf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuf(Object newBuf) {
		Object oldBuf = buf;
		buf = newBuf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.REQUEST__BUF, oldBuf, buf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModelPackage.REQUEST__BUFFER_MANAGER:
			if (resolve)
				return getBuffer_manager();
			return basicGetBuffer_manager();
		case MetaModelPackage.REQUEST__ID:
			return getId();
		case MetaModelPackage.REQUEST__CALL_BACK_ADDRESS:
			return getCallBackAddress();
		case MetaModelPackage.REQUEST__BUF:
			return getBuf();
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
		case MetaModelPackage.REQUEST__BUFFER_MANAGER:
			setBuffer_manager((Buffer_Manager) newValue);
			return;
		case MetaModelPackage.REQUEST__ID:
			setId((Byte) newValue);
			return;
		case MetaModelPackage.REQUEST__CALL_BACK_ADDRESS:
			setCallBackAddress((String) newValue);
			return;
		case MetaModelPackage.REQUEST__BUF:
			setBuf(newValue);
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
		case MetaModelPackage.REQUEST__BUFFER_MANAGER:
			setBuffer_manager((Buffer_Manager) null);
			return;
		case MetaModelPackage.REQUEST__ID:
			setId(ID_EDEFAULT);
			return;
		case MetaModelPackage.REQUEST__CALL_BACK_ADDRESS:
			setCallBackAddress(CALL_BACK_ADDRESS_EDEFAULT);
			return;
		case MetaModelPackage.REQUEST__BUF:
			setBuf(BUF_EDEFAULT);
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
		case MetaModelPackage.REQUEST__BUFFER_MANAGER:
			return buffer_manager != null;
		case MetaModelPackage.REQUEST__ID:
			return id != ID_EDEFAULT;
		case MetaModelPackage.REQUEST__CALL_BACK_ADDRESS:
			return CALL_BACK_ADDRESS_EDEFAULT == null ? callBackAddress != null
					: !CALL_BACK_ADDRESS_EDEFAULT.equals(callBackAddress);
		case MetaModelPackage.REQUEST__BUF:
			return BUF_EDEFAULT == null ? buf != null : !BUF_EDEFAULT.equals(buf);
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
		result.append(", callBackAddress: ");
		result.append(callBackAddress);
		result.append(", buf: ");
		result.append(buf);
		result.append(')');
		return result.toString();
	}

} //RequestImpl
