/**
 */
package metaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oracle Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.OracleClient#getOracleRef <em>Oracle Ref</em>}</li>
 *   <li>{@link metaModel.OracleClient#getRequestRef <em>Request Ref</em>}</li>
 *   <li>{@link metaModel.OracleClient#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link metaModel.OracleClient#getRegistry <em>Registry</em>}</li>
 *   <li>{@link metaModel.OracleClient#getLink <em>Link</em>}</li>
 *   <li>{@link metaModel.OracleClient#getOracle <em>Oracle</em>}</li>
 *   <li>{@link metaModel.OracleClient#getRequest <em>Request</em>}</li>
 *   <li>{@link metaModel.OracleClient#getCbor <em>Cbor</em>}</li>
 *   <li>{@link metaModel.OracleClient#getPendingRequests <em>Pending Requests</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getOracleClient()
 * @model
 * @generated
 */
public interface OracleClient extends Contract {
	/**
	 * Returns the value of the '<em><b>Oracle Ref</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.Oracle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oracle Ref</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getOracleClient_OracleRef()
	 * @model containment="true"
	 * @generated
	 */
	EList<Oracle> getOracleRef();

	/**
	 * Returns the value of the '<em><b>Request Ref</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.Request}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Ref</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getOracleClient_RequestRef()
	 * @model containment="true"
	 * @generated
	 */
	EList<Request> getRequestRef();

	/**
	 * Returns the value of the '<em><b>Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer</em>' reference.
	 * @see #setBuffer(Buffer)
	 * @see metaModel.MetaModelPackage#getOracleClient_Buffer()
	 * @model
	 * @generated
	 */
	Buffer getBuffer();

	/**
	 * Sets the value of the '{@link metaModel.OracleClient#getBuffer <em>Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer</em>' reference.
	 * @see #getBuffer()
	 * @generated
	 */
	void setBuffer(Buffer value);

	/**
	 * Returns the value of the '<em><b>Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry</em>' attribute.
	 * @see #setRegistry(String)
	 * @see metaModel.MetaModelPackage#getOracleClient_Registry()
	 * @model dataType="metaModel.AddressDType"
	 * @generated
	 */
	String getRegistry();

	/**
	 * Sets the value of the '{@link metaModel.OracleClient#getRegistry <em>Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry</em>' attribute.
	 * @see #getRegistry()
	 * @generated
	 */
	void setRegistry(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see metaModel.MetaModelPackage#getOracleClient_Link()
	 * @model dataType="metaModel.AddressDType"
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link metaModel.OracleClient#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

	/**
	 * Returns the value of the '<em><b>Oracle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oracle</em>' attribute.
	 * @see #setOracle(String)
	 * @see metaModel.MetaModelPackage#getOracleClient_Oracle()
	 * @model dataType="metaModel.AddressDType"
	 * @generated
	 */
	String getOracle();

	/**
	 * Sets the value of the '{@link metaModel.OracleClient#getOracle <em>Oracle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oracle</em>' attribute.
	 * @see #getOracle()
	 * @generated
	 */
	void setOracle(String value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' attribute.
	 * @see #setRequest(int)
	 * @see metaModel.MetaModelPackage#getOracleClient_Request()
	 * @model
	 * @generated
	 */
	int getRequest();

	/**
	 * Sets the value of the '{@link metaModel.OracleClient#getRequest <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' attribute.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(int value);

	/**
	 * Returns the value of the '<em><b>Cbor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cbor</em>' reference.
	 * @see #setCbor(CBOR)
	 * @see metaModel.MetaModelPackage#getOracleClient_Cbor()
	 * @model
	 * @generated
	 */
	CBOR getCbor();

	/**
	 * Sets the value of the '{@link metaModel.OracleClient#getCbor <em>Cbor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cbor</em>' reference.
	 * @see #getCbor()
	 * @generated
	 */
	void setCbor(CBOR value);

	/**
	 * Returns the value of the '<em><b>Pending Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending Requests</em>' attribute.
	 * @see #setPendingRequests(Object)
	 * @see metaModel.MetaModelPackage#getOracleClient_PendingRequests()
	 * @model
	 * @generated
	 */
	Object getPendingRequests();

	/**
	 * Sets the value of the '{@link metaModel.OracleClient#getPendingRequests <em>Pending Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pending Requests</em>' attribute.
	 * @see #getPendingRequests()
	 * @generated
	 */
	void setPendingRequests(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void encodeRequest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void tokenAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void buildRequest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sendRequest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancelRequest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setOracle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setToken();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addExternalRequest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateOracle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void validateCallback();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recordRequestFulfilled();

} // OracleClient
