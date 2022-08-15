/**
 */
package metaModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import metaModel.Buffer;
import metaModel.CBOR;
import metaModel.MetaModelPackage;
import metaModel.Oracle;
import metaModel.OracleClient;
import metaModel.Request;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oracle Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.OracleClientImpl#getOracleRef <em>Oracle Ref</em>}</li>
 *   <li>{@link metaModel.impl.OracleClientImpl#getRequestRef <em>Request Ref</em>}</li>
 *   <li>{@link metaModel.impl.OracleClientImpl#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link metaModel.impl.OracleClientImpl#getRegistry <em>Registry</em>}</li>
 *   <li>{@link metaModel.impl.OracleClientImpl#getLink <em>Link</em>}</li>
 *   <li>{@link metaModel.impl.OracleClientImpl#getOracle <em>Oracle</em>}</li>
 *   <li>{@link metaModel.impl.OracleClientImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link metaModel.impl.OracleClientImpl#getCbor <em>Cbor</em>}</li>
 *   <li>{@link metaModel.impl.OracleClientImpl#getPendingRequests <em>Pending Requests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OracleClientImpl extends ContractImpl implements OracleClient {
	/**
	 * The cached value of the '{@link #getOracleRef() <em>Oracle Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOracleRef()
	 * @generated
	 * @ordered
	 */
	protected EList<Oracle> oracleRef;

	/**
	 * The cached value of the '{@link #getRequestRef() <em>Request Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestRef()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> requestRef;

	/**
	 * The cached value of the '{@link #getBuffer() <em>Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffer()
	 * @generated
	 * @ordered
	 */
	protected Buffer buffer;

	/**
	 * The default value of the '{@link #getRegistry() <em>Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistry()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistry() <em>Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistry()
	 * @generated
	 * @ordered
	 */
	protected String registry = REGISTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected String link = LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getOracle() <em>Oracle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOracle()
	 * @generated
	 * @ordered
	 */
	protected static final String ORACLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOracle() <em>Oracle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOracle()
	 * @generated
	 * @ordered
	 */
	protected String oracle = ORACLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequest() <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUEST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected int request = REQUEST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCbor() <em>Cbor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCbor()
	 * @generated
	 * @ordered
	 */
	protected CBOR cbor;

	/**
	 * The default value of the '{@link #getPendingRequests() <em>Pending Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPendingRequests()
	 * @generated
	 * @ordered
	 */
	protected static final Object PENDING_REQUESTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPendingRequests() <em>Pending Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPendingRequests()
	 * @generated
	 * @ordered
	 */
	protected Object pendingRequests = PENDING_REQUESTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OracleClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.ORACLE_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Oracle> getOracleRef() {
		if (oracleRef == null) {
			oracleRef = new EObjectContainmentEList<Oracle>(Oracle.class, this,
					MetaModelPackage.ORACLE_CLIENT__ORACLE_REF);
		}
		return oracleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Request> getRequestRef() {
		if (requestRef == null) {
			requestRef = new EObjectContainmentEList<Request>(Request.class, this,
					MetaModelPackage.ORACLE_CLIENT__REQUEST_REF);
		}
		return requestRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer getBuffer() {
		if (buffer != null && buffer.eIsProxy()) {
			InternalEObject oldBuffer = (InternalEObject) buffer;
			buffer = (Buffer) eResolveProxy(oldBuffer);
			if (buffer != oldBuffer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.ORACLE_CLIENT__BUFFER,
							oldBuffer, buffer));
			}
		}
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer basicGetBuffer() {
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffer(Buffer newBuffer) {
		Buffer oldBuffer = buffer;
		buffer = newBuffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.ORACLE_CLIENT__BUFFER, oldBuffer,
					buffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegistry() {
		return registry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistry(String newRegistry) {
		String oldRegistry = registry;
		registry = newRegistry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.ORACLE_CLIENT__REGISTRY, oldRegistry,
					registry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(String newLink) {
		String oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.ORACLE_CLIENT__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOracle() {
		return oracle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOracle(String newOracle) {
		String oldOracle = oracle;
		oracle = newOracle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.ORACLE_CLIENT__ORACLE, oldOracle,
					oracle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(int newRequest) {
		int oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.ORACLE_CLIENT__REQUEST, oldRequest,
					request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CBOR getCbor() {
		if (cbor != null && cbor.eIsProxy()) {
			InternalEObject oldCbor = (InternalEObject) cbor;
			cbor = (CBOR) eResolveProxy(oldCbor);
			if (cbor != oldCbor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.ORACLE_CLIENT__CBOR,
							oldCbor, cbor));
			}
		}
		return cbor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CBOR basicGetCbor() {
		return cbor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCbor(CBOR newCbor) {
		CBOR oldCbor = cbor;
		cbor = newCbor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.ORACLE_CLIENT__CBOR, oldCbor, cbor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPendingRequests() {
		return pendingRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPendingRequests(Object newPendingRequests) {
		Object oldPendingRequests = pendingRequests;
		pendingRequests = newPendingRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.ORACLE_CLIENT__PENDING_REQUESTS,
					oldPendingRequests, pendingRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void encodeRequest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void tokenAddress() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void buildRequest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendRequest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelRequest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOracle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addExternalRequest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateOracle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void validateCallback() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void recordRequestFulfilled() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelPackage.ORACLE_CLIENT__ORACLE_REF:
			return ((InternalEList<?>) getOracleRef()).basicRemove(otherEnd, msgs);
		case MetaModelPackage.ORACLE_CLIENT__REQUEST_REF:
			return ((InternalEList<?>) getRequestRef()).basicRemove(otherEnd, msgs);
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
		case MetaModelPackage.ORACLE_CLIENT__ORACLE_REF:
			return getOracleRef();
		case MetaModelPackage.ORACLE_CLIENT__REQUEST_REF:
			return getRequestRef();
		case MetaModelPackage.ORACLE_CLIENT__BUFFER:
			if (resolve)
				return getBuffer();
			return basicGetBuffer();
		case MetaModelPackage.ORACLE_CLIENT__REGISTRY:
			return getRegistry();
		case MetaModelPackage.ORACLE_CLIENT__LINK:
			return getLink();
		case MetaModelPackage.ORACLE_CLIENT__ORACLE:
			return getOracle();
		case MetaModelPackage.ORACLE_CLIENT__REQUEST:
			return getRequest();
		case MetaModelPackage.ORACLE_CLIENT__CBOR:
			if (resolve)
				return getCbor();
			return basicGetCbor();
		case MetaModelPackage.ORACLE_CLIENT__PENDING_REQUESTS:
			return getPendingRequests();
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
		case MetaModelPackage.ORACLE_CLIENT__ORACLE_REF:
			getOracleRef().clear();
			getOracleRef().addAll((Collection<? extends Oracle>) newValue);
			return;
		case MetaModelPackage.ORACLE_CLIENT__REQUEST_REF:
			getRequestRef().clear();
			getRequestRef().addAll((Collection<? extends Request>) newValue);
			return;
		case MetaModelPackage.ORACLE_CLIENT__BUFFER:
			setBuffer((Buffer) newValue);
			return;
		case MetaModelPackage.ORACLE_CLIENT__REGISTRY:
			setRegistry((String) newValue);
			return;
		case MetaModelPackage.ORACLE_CLIENT__LINK:
			setLink((String) newValue);
			return;
		case MetaModelPackage.ORACLE_CLIENT__ORACLE:
			setOracle((String) newValue);
			return;
		case MetaModelPackage.ORACLE_CLIENT__REQUEST:
			setRequest((Integer) newValue);
			return;
		case MetaModelPackage.ORACLE_CLIENT__CBOR:
			setCbor((CBOR) newValue);
			return;
		case MetaModelPackage.ORACLE_CLIENT__PENDING_REQUESTS:
			setPendingRequests(newValue);
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
		case MetaModelPackage.ORACLE_CLIENT__ORACLE_REF:
			getOracleRef().clear();
			return;
		case MetaModelPackage.ORACLE_CLIENT__REQUEST_REF:
			getRequestRef().clear();
			return;
		case MetaModelPackage.ORACLE_CLIENT__BUFFER:
			setBuffer((Buffer) null);
			return;
		case MetaModelPackage.ORACLE_CLIENT__REGISTRY:
			setRegistry(REGISTRY_EDEFAULT);
			return;
		case MetaModelPackage.ORACLE_CLIENT__LINK:
			setLink(LINK_EDEFAULT);
			return;
		case MetaModelPackage.ORACLE_CLIENT__ORACLE:
			setOracle(ORACLE_EDEFAULT);
			return;
		case MetaModelPackage.ORACLE_CLIENT__REQUEST:
			setRequest(REQUEST_EDEFAULT);
			return;
		case MetaModelPackage.ORACLE_CLIENT__CBOR:
			setCbor((CBOR) null);
			return;
		case MetaModelPackage.ORACLE_CLIENT__PENDING_REQUESTS:
			setPendingRequests(PENDING_REQUESTS_EDEFAULT);
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
		case MetaModelPackage.ORACLE_CLIENT__ORACLE_REF:
			return oracleRef != null && !oracleRef.isEmpty();
		case MetaModelPackage.ORACLE_CLIENT__REQUEST_REF:
			return requestRef != null && !requestRef.isEmpty();
		case MetaModelPackage.ORACLE_CLIENT__BUFFER:
			return buffer != null;
		case MetaModelPackage.ORACLE_CLIENT__REGISTRY:
			return REGISTRY_EDEFAULT == null ? registry != null : !REGISTRY_EDEFAULT.equals(registry);
		case MetaModelPackage.ORACLE_CLIENT__LINK:
			return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
		case MetaModelPackage.ORACLE_CLIENT__ORACLE:
			return ORACLE_EDEFAULT == null ? oracle != null : !ORACLE_EDEFAULT.equals(oracle);
		case MetaModelPackage.ORACLE_CLIENT__REQUEST:
			return request != REQUEST_EDEFAULT;
		case MetaModelPackage.ORACLE_CLIENT__CBOR:
			return cbor != null;
		case MetaModelPackage.ORACLE_CLIENT__PENDING_REQUESTS:
			return PENDING_REQUESTS_EDEFAULT == null ? pendingRequests != null
					: !PENDING_REQUESTS_EDEFAULT.equals(pendingRequests);
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
		case MetaModelPackage.ORACLE_CLIENT___ENCODE_REQUEST:
			encodeRequest();
			return null;
		case MetaModelPackage.ORACLE_CLIENT___TOKEN_ADDRESS:
			tokenAddress();
			return null;
		case MetaModelPackage.ORACLE_CLIENT___BUILD_REQUEST:
			buildRequest();
			return null;
		case MetaModelPackage.ORACLE_CLIENT___SEND_REQUEST:
			sendRequest();
			return null;
		case MetaModelPackage.ORACLE_CLIENT___CANCEL_REQUEST:
			cancelRequest();
			return null;
		case MetaModelPackage.ORACLE_CLIENT___SET_ORACLE:
			setOracle();
			return null;
		case MetaModelPackage.ORACLE_CLIENT___SET_TOKEN:
			setToken();
			return null;
		case MetaModelPackage.ORACLE_CLIENT___ADD_EXTERNAL_REQUEST:
			addExternalRequest();
			return null;
		case MetaModelPackage.ORACLE_CLIENT___UPDATE_ORACLE:
			updateOracle();
			return null;
		case MetaModelPackage.ORACLE_CLIENT___VALIDATE_CALLBACK:
			validateCallback();
			return null;
		case MetaModelPackage.ORACLE_CLIENT___RECORD_REQUEST_FULFILLED:
			recordRequestFulfilled();
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
		result.append(" (registry: ");
		result.append(registry);
		result.append(", link: ");
		result.append(link);
		result.append(", oracle: ");
		result.append(oracle);
		result.append(", request: ");
		result.append(request);
		result.append(", pendingRequests: ");
		result.append(pendingRequests);
		result.append(')');
		return result.toString();
	}

} //OracleClientImpl
