/**
 */
package metaModel.impl;

import metaModel.Buffer_Manager;
import metaModel.CBOR;
import metaModel.MetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CBOR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.CBORImpl#getBuffer_manager <em>Buffer manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CBORImpl extends MinimalEObjectImpl.Container implements CBOR {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CBORImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.CBOR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.CBOR__BUFFER_MANAGER,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.CBOR__BUFFER_MANAGER,
					oldBuffer_manager, buffer_manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModelPackage.CBOR__BUFFER_MANAGER:
			if (resolve)
				return getBuffer_manager();
			return basicGetBuffer_manager();
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
		case MetaModelPackage.CBOR__BUFFER_MANAGER:
			setBuffer_manager((Buffer_Manager) newValue);
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
		case MetaModelPackage.CBOR__BUFFER_MANAGER:
			setBuffer_manager((Buffer_Manager) null);
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
		case MetaModelPackage.CBOR__BUFFER_MANAGER:
			return buffer_manager != null;
		}
		return super.eIsSet(featureID);
	}

} //CBORImpl
