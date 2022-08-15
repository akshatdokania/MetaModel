/**
 */
package metaModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import metaModel.MetaModelPackage;
import metaModel.Signature;
import metaModel.SignatureRegistry;
import metaModel.SignatureValidator;

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
 * An implementation of the model object '<em><b>Signature Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.SignatureRegistryImpl#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link metaModel.impl.SignatureRegistryImpl#getSignaturevalidator <em>Signaturevalidator</em>}</li>
 *   <li>{@link metaModel.impl.SignatureRegistryImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatureRegistryImpl extends MinimalEObjectImpl.Container implements SignatureRegistry {
	/**
	 * The cached value of the '{@link #getSignatures() <em>Signatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> signatures;

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
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final Object SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected Object signature = SIGNATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.SIGNATURE_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signature> getSignatures() {
		if (signatures == null) {
			signatures = new EObjectContainmentEList<Signature>(Signature.class, this,
					MetaModelPackage.SIGNATURE_REGISTRY__SIGNATURES);
		}
		return signatures;
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
							MetaModelPackage.SIGNATURE_REGISTRY__SIGNATUREVALIDATOR, oldSignaturevalidator,
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
	public NotificationChain basicSetSignaturevalidator(SignatureValidator newSignaturevalidator,
			NotificationChain msgs) {
		SignatureValidator oldSignaturevalidator = signaturevalidator;
		signaturevalidator = newSignaturevalidator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.SIGNATURE_REGISTRY__SIGNATUREVALIDATOR, oldSignaturevalidator,
					newSignaturevalidator);
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
	public void setSignaturevalidator(SignatureValidator newSignaturevalidator) {
		if (newSignaturevalidator != signaturevalidator) {
			NotificationChain msgs = null;
			if (signaturevalidator != null)
				msgs = ((InternalEObject) signaturevalidator).eInverseRemove(this,
						MetaModelPackage.SIGNATURE_VALIDATOR__SIGNATUREREGISTRY, SignatureValidator.class, msgs);
			if (newSignaturevalidator != null)
				msgs = ((InternalEObject) newSignaturevalidator).eInverseAdd(this,
						MetaModelPackage.SIGNATURE_VALIDATOR__SIGNATUREREGISTRY, SignatureValidator.class, msgs);
			msgs = basicSetSignaturevalidator(newSignaturevalidator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.SIGNATURE_REGISTRY__SIGNATUREVALIDATOR, newSignaturevalidator,
					newSignaturevalidator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(Object newSignature) {
		Object oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.SIGNATURE_REGISTRY__SIGNATURE,
					oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerSignature() {
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
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATUREVALIDATOR:
			if (signaturevalidator != null)
				msgs = ((InternalEObject) signaturevalidator).eInverseRemove(this,
						MetaModelPackage.SIGNATURE_VALIDATOR__SIGNATUREREGISTRY, SignatureValidator.class, msgs);
			return basicSetSignaturevalidator((SignatureValidator) otherEnd, msgs);
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
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATURES:
			return ((InternalEList<?>) getSignatures()).basicRemove(otherEnd, msgs);
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATUREVALIDATOR:
			return basicSetSignaturevalidator(null, msgs);
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
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATURES:
			return getSignatures();
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATUREVALIDATOR:
			if (resolve)
				return getSignaturevalidator();
			return basicGetSignaturevalidator();
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATURE:
			return getSignature();
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
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATURES:
			getSignatures().clear();
			getSignatures().addAll((Collection<? extends Signature>) newValue);
			return;
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATUREVALIDATOR:
			setSignaturevalidator((SignatureValidator) newValue);
			return;
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATURE:
			setSignature(newValue);
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
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATURES:
			getSignatures().clear();
			return;
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATUREVALIDATOR:
			setSignaturevalidator((SignatureValidator) null);
			return;
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATURE:
			setSignature(SIGNATURE_EDEFAULT);
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
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATURES:
			return signatures != null && !signatures.isEmpty();
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATUREVALIDATOR:
			return signaturevalidator != null;
		case MetaModelPackage.SIGNATURE_REGISTRY__SIGNATURE:
			return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
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
		case MetaModelPackage.SIGNATURE_REGISTRY___REGISTER_SIGNATURE:
			registerSignature();
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
		result.append(" (signature: ");
		result.append(signature);
		result.append(')');
		return result.toString();
	}

} //SignatureRegistryImpl
