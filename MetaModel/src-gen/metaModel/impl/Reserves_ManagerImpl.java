/**
 */
package metaModel.impl;

import java.lang.reflect.InvocationTargetException;

import metaModel.DeFi_Lending_Core;
import metaModel.MetaModelPackage;
import metaModel.Reserves_Manager;
import metaModel.Token_Manager;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reserves Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.Reserves_ManagerImpl#getDefi_lending_core <em>Defi lending core</em>}</li>
 *   <li>{@link metaModel.impl.Reserves_ManagerImpl#getToken_manager <em>Token manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Reserves_ManagerImpl extends MinimalEObjectImpl.Container implements Reserves_Manager {
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
	protected Reserves_ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.RESERVES_MANAGER;
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
							MetaModelPackage.RESERVES_MANAGER__DEFI_LENDING_CORE, oldDefi_lending_core,
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
					MetaModelPackage.RESERVES_MANAGER__DEFI_LENDING_CORE, oldDefi_lending_core, newDefi_lending_core);
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
						MetaModelPackage.DE_FI_LENDING_CORE__RESERVES_MANAGER, DeFi_Lending_Core.class, msgs);
			if (newDefi_lending_core != null)
				msgs = ((InternalEObject) newDefi_lending_core).eInverseAdd(this,
						MetaModelPackage.DE_FI_LENDING_CORE__RESERVES_MANAGER, DeFi_Lending_Core.class, msgs);
			msgs = basicSetDefi_lending_core(newDefi_lending_core, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.RESERVES_MANAGER__DEFI_LENDING_CORE,
					newDefi_lending_core, newDefi_lending_core));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetaModelPackage.RESERVES_MANAGER__TOKEN_MANAGER, oldToken_manager, token_manager));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.RESERVES_MANAGER__TOKEN_MANAGER,
					oldToken_manager, token_manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void activate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deactivate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void freeze() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void update() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unfreeze() {
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
		case MetaModelPackage.RESERVES_MANAGER__DEFI_LENDING_CORE:
			if (defi_lending_core != null)
				msgs = ((InternalEObject) defi_lending_core).eInverseRemove(this,
						MetaModelPackage.DE_FI_LENDING_CORE__RESERVES_MANAGER, DeFi_Lending_Core.class, msgs);
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
		case MetaModelPackage.RESERVES_MANAGER__DEFI_LENDING_CORE:
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
		case MetaModelPackage.RESERVES_MANAGER__DEFI_LENDING_CORE:
			if (resolve)
				return getDefi_lending_core();
			return basicGetDefi_lending_core();
		case MetaModelPackage.RESERVES_MANAGER__TOKEN_MANAGER:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetaModelPackage.RESERVES_MANAGER__DEFI_LENDING_CORE:
			setDefi_lending_core((DeFi_Lending_Core) newValue);
			return;
		case MetaModelPackage.RESERVES_MANAGER__TOKEN_MANAGER:
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
		case MetaModelPackage.RESERVES_MANAGER__DEFI_LENDING_CORE:
			setDefi_lending_core((DeFi_Lending_Core) null);
			return;
		case MetaModelPackage.RESERVES_MANAGER__TOKEN_MANAGER:
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
		case MetaModelPackage.RESERVES_MANAGER__DEFI_LENDING_CORE:
			return defi_lending_core != null;
		case MetaModelPackage.RESERVES_MANAGER__TOKEN_MANAGER:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetaModelPackage.RESERVES_MANAGER___ACTIVATE:
			activate();
			return null;
		case MetaModelPackage.RESERVES_MANAGER___DEACTIVATE:
			deactivate();
			return null;
		case MetaModelPackage.RESERVES_MANAGER___FREEZE:
			freeze();
			return null;
		case MetaModelPackage.RESERVES_MANAGER___UPDATE:
			update();
			return null;
		case MetaModelPackage.RESERVES_MANAGER___UNFREEZE:
			unfreeze();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Reserves_ManagerImpl
