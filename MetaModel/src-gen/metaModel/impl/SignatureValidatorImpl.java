/**
 */
package metaModel.impl;

import java.lang.reflect.InvocationTargetException;

import metaModel.ECDSA;
import metaModel.MetaModelPackage;
import metaModel.SignatureRegistry;
import metaModel.SignatureValidator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.SignatureValidatorImpl#getSignatureregistry <em>Signatureregistry</em>}</li>
 *   <li>{@link metaModel.impl.SignatureValidatorImpl#getEcdsa <em>Ecdsa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatureValidatorImpl extends MinimalEObjectImpl.Container implements SignatureValidator {
	/**
	 * The cached value of the '{@link #getSignatureregistry() <em>Signatureregistry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureregistry()
	 * @generated
	 * @ordered
	 */
	protected SignatureRegistry signatureregistry;

	/**
	 * The cached value of the '{@link #getEcdsa() <em>Ecdsa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcdsa()
	 * @generated
	 * @ordered
	 */
	protected ECDSA ecdsa;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureValidatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.SIGNATURE_VALIDATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureRegistry getSignatureregistry() {
		if (signatureregistry != null && signatureregistry.eIsProxy()) {
			InternalEObject oldSignatureregistry = (InternalEObject) signatureregistry;
			signatureregistry = (SignatureRegistry) eResolveProxy(oldSignatureregistry);
			if (signatureregistry != oldSignatureregistry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetaModelPackage.SIGNATURE_VALIDATOR__SIGNATUREREGISTRY, oldSignatureregistry,
							signatureregistry));
			}
		}
		return signatureregistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureRegistry basicGetSignatureregistry() {
		return signatureregistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatureregistry(SignatureRegistry newSignatureregistry, NotificationChain msgs) {
		SignatureRegistry oldSignatureregistry = signatureregistry;
		signatureregistry = newSignatureregistry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.SIGNATURE_VALIDATOR__SIGNATUREREGISTRY, oldSignatureregistry,
					newSignatureregistry);
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
	public void setSignatureregistry(SignatureRegistry newSignatureregistry) {
		if (newSignatureregistry != signatureregistry) {
			NotificationChain msgs = null;
			if (signatureregistry != null)
				msgs = ((InternalEObject) signatureregistry).eInverseRemove(this,
						MetaModelPackage.SIGNATURE_REGISTRY__SIGNATUREVALIDATOR, SignatureRegistry.class, msgs);
			if (newSignatureregistry != null)
				msgs = ((InternalEObject) newSignatureregistry).eInverseAdd(this,
						MetaModelPackage.SIGNATURE_REGISTRY__SIGNATUREVALIDATOR, SignatureRegistry.class, msgs);
			msgs = basicSetSignatureregistry(newSignatureregistry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.SIGNATURE_VALIDATOR__SIGNATUREREGISTRY, newSignatureregistry,
					newSignatureregistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECDSA getEcdsa() {
		if (ecdsa != null && ecdsa.eIsProxy()) {
			InternalEObject oldEcdsa = (InternalEObject) ecdsa;
			ecdsa = (ECDSA) eResolveProxy(oldEcdsa);
			if (ecdsa != oldEcdsa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetaModelPackage.SIGNATURE_VALIDATOR__ECDSA, oldEcdsa, ecdsa));
			}
		}
		return ecdsa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECDSA basicGetEcdsa() {
		return ecdsa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcdsa(ECDSA newEcdsa) {
		ECDSA oldEcdsa = ecdsa;
		ecdsa = newEcdsa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.SIGNATURE_VALIDATOR__ECDSA, oldEcdsa,
					ecdsa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void requireValidSignature() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void calculateSignatureHash() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void validateSignature() {
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
		case MetaModelPackage.SIGNATURE_VALIDATOR__SIGNATUREREGISTRY:
			if (signatureregistry != null)
				msgs = ((InternalEObject) signatureregistry).eInverseRemove(this,
						MetaModelPackage.SIGNATURE_REGISTRY__SIGNATUREVALIDATOR, SignatureRegistry.class, msgs);
			return basicSetSignatureregistry((SignatureRegistry) otherEnd, msgs);
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
		case MetaModelPackage.SIGNATURE_VALIDATOR__SIGNATUREREGISTRY:
			return basicSetSignatureregistry(null, msgs);
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
		case MetaModelPackage.SIGNATURE_VALIDATOR__SIGNATUREREGISTRY:
			if (resolve)
				return getSignatureregistry();
			return basicGetSignatureregistry();
		case MetaModelPackage.SIGNATURE_VALIDATOR__ECDSA:
			if (resolve)
				return getEcdsa();
			return basicGetEcdsa();
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
		case MetaModelPackage.SIGNATURE_VALIDATOR__SIGNATUREREGISTRY:
			setSignatureregistry((SignatureRegistry) newValue);
			return;
		case MetaModelPackage.SIGNATURE_VALIDATOR__ECDSA:
			setEcdsa((ECDSA) newValue);
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
		case MetaModelPackage.SIGNATURE_VALIDATOR__SIGNATUREREGISTRY:
			setSignatureregistry((SignatureRegistry) null);
			return;
		case MetaModelPackage.SIGNATURE_VALIDATOR__ECDSA:
			setEcdsa((ECDSA) null);
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
		case MetaModelPackage.SIGNATURE_VALIDATOR__SIGNATUREREGISTRY:
			return signatureregistry != null;
		case MetaModelPackage.SIGNATURE_VALIDATOR__ECDSA:
			return ecdsa != null;
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
		case MetaModelPackage.SIGNATURE_VALIDATOR___REQUIRE_VALID_SIGNATURE:
			requireValidSignature();
			return null;
		case MetaModelPackage.SIGNATURE_VALIDATOR___CALCULATE_SIGNATURE_HASH:
			calculateSignatureHash();
			return null;
		case MetaModelPackage.SIGNATURE_VALIDATOR___VALIDATE_SIGNATURE:
			validateSignature();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SignatureValidatorImpl
