/**
 */
package metaModel.impl;

import java.lang.reflect.InvocationTargetException;

import metaModel.Data_Provider;
import metaModel.DeFi_Lending_Core;
import metaModel.MetaModelPackage;
import metaModel.OracleClient;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.Data_ProviderImpl#getDefi_lending_core <em>Defi lending core</em>}</li>
 *   <li>{@link metaModel.impl.Data_ProviderImpl#getOracleclient <em>Oracleclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Data_ProviderImpl extends OracleClientImpl implements Data_Provider {
	/**
	 * The cached value of the '{@link #getDefi_lending_core() <em>Defi lending core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefi_lending_core()
	 * @generated
	 * @ordered
	 */
	protected DeFi_Lending_Core defi_lending_core;

	/**
	 * The cached value of the '{@link #getOracleclient() <em>Oracleclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOracleclient()
	 * @generated
	 * @ordered
	 */
	protected OracleClient oracleclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Data_ProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.DATA_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeFi_Lending_Core getDefi_lending_core() {
		if (defi_lending_core != null && defi_lending_core.eIsProxy()) {
			InternalEObject oldDefi_lending_core = (InternalEObject) defi_lending_core;
			defi_lending_core = (DeFi_Lending_Core) eResolveProxy(oldDefi_lending_core);
			if (defi_lending_core != oldDefi_lending_core) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetaModelPackage.DATA_PROVIDER__DEFI_LENDING_CORE, oldDefi_lending_core,
							defi_lending_core));
			}
		}
		return defi_lending_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeFi_Lending_Core basicGetDefi_lending_core() {
		return defi_lending_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefi_lending_core(DeFi_Lending_Core newDefi_lending_core, NotificationChain msgs) {
		DeFi_Lending_Core oldDefi_lending_core = defi_lending_core;
		defi_lending_core = newDefi_lending_core;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaModelPackage.DATA_PROVIDER__DEFI_LENDING_CORE, oldDefi_lending_core, newDefi_lending_core);
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
	public void setDefi_lending_core(DeFi_Lending_Core newDefi_lending_core) {
		if (newDefi_lending_core != defi_lending_core) {
			NotificationChain msgs = null;
			if (defi_lending_core != null)
				msgs = ((InternalEObject) defi_lending_core).eInverseRemove(this,
						MetaModelPackage.DE_FI_LENDING_CORE__DATA_PROVIDER, DeFi_Lending_Core.class, msgs);
			if (newDefi_lending_core != null)
				msgs = ((InternalEObject) newDefi_lending_core).eInverseAdd(this,
						MetaModelPackage.DE_FI_LENDING_CORE__DATA_PROVIDER, DeFi_Lending_Core.class, msgs);
			msgs = basicSetDefi_lending_core(newDefi_lending_core, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.DATA_PROVIDER__DEFI_LENDING_CORE,
					newDefi_lending_core, newDefi_lending_core));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleClient getOracleclient() {
		if (oracleclient != null && oracleclient.eIsProxy()) {
			InternalEObject oldOracleclient = (InternalEObject) oracleclient;
			oracleclient = (OracleClient) eResolveProxy(oldOracleclient);
			if (oracleclient != oldOracleclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetaModelPackage.DATA_PROVIDER__ORACLECLIENT, oldOracleclient, oracleclient));
			}
		}
		return oracleclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleClient basicGetOracleclient() {
		return oracleclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOracleclient(OracleClient newOracleclient) {
		OracleClient oldOracleclient = oracleclient;
		oracleclient = newOracleclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.DATA_PROVIDER__ORACLECLIENT,
					oldOracleclient, oracleclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void priceOracle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void interestRate() {
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
		case MetaModelPackage.DATA_PROVIDER__DEFI_LENDING_CORE:
			if (defi_lending_core != null)
				msgs = ((InternalEObject) defi_lending_core).eInverseRemove(this,
						MetaModelPackage.DE_FI_LENDING_CORE__DATA_PROVIDER, DeFi_Lending_Core.class, msgs);
			return basicSetDefi_lending_core((DeFi_Lending_Core) otherEnd, msgs);
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
		case MetaModelPackage.DATA_PROVIDER__DEFI_LENDING_CORE:
			return basicSetDefi_lending_core(null, msgs);
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
		case MetaModelPackage.DATA_PROVIDER__DEFI_LENDING_CORE:
			if (resolve)
				return getDefi_lending_core();
			return basicGetDefi_lending_core();
		case MetaModelPackage.DATA_PROVIDER__ORACLECLIENT:
			if (resolve)
				return getOracleclient();
			return basicGetOracleclient();
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
		case MetaModelPackage.DATA_PROVIDER__DEFI_LENDING_CORE:
			setDefi_lending_core((DeFi_Lending_Core) newValue);
			return;
		case MetaModelPackage.DATA_PROVIDER__ORACLECLIENT:
			setOracleclient((OracleClient) newValue);
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
		case MetaModelPackage.DATA_PROVIDER__DEFI_LENDING_CORE:
			setDefi_lending_core((DeFi_Lending_Core) null);
			return;
		case MetaModelPackage.DATA_PROVIDER__ORACLECLIENT:
			setOracleclient((OracleClient) null);
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
		case MetaModelPackage.DATA_PROVIDER__DEFI_LENDING_CORE:
			return defi_lending_core != null;
		case MetaModelPackage.DATA_PROVIDER__ORACLECLIENT:
			return oracleclient != null;
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
		case MetaModelPackage.DATA_PROVIDER___PRICE_ORACLE:
			priceOracle();
			return null;
		case MetaModelPackage.DATA_PROVIDER___INTEREST_RATE:
			interestRate();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Data_ProviderImpl
