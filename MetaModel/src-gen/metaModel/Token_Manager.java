/**
 */
package metaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Token_Manager#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link metaModel.Token_Manager#getName <em>Name</em>}</li>
 *   <li>{@link metaModel.Token_Manager#getTotalSupply <em>Total Supply</em>}</li>
 *   <li>{@link metaModel.Token_Manager#getSafemath <em>Safemath</em>}</li>
 *   <li>{@link metaModel.Token_Manager#getBalances <em>Balances</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getToken_Manager()
 * @model
 * @generated
 */
public interface Token_Manager extends Token, Contract {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see metaModel.MetaModelPackage#getToken_Manager_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link metaModel.Token_Manager#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metaModel.MetaModelPackage#getToken_Manager_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metaModel.Token_Manager#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Total Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Supply</em>' attribute.
	 * @see #setTotalSupply(int)
	 * @see metaModel.MetaModelPackage#getToken_Manager_TotalSupply()
	 * @model
	 * @generated
	 */
	int getTotalSupply();

	/**
	 * Sets the value of the '{@link metaModel.Token_Manager#getTotalSupply <em>Total Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Supply</em>' attribute.
	 * @see #getTotalSupply()
	 * @generated
	 */
	void setTotalSupply(int value);

	/**
	 * Returns the value of the '<em><b>Safemath</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safemath</em>' reference.
	 * @see #setSafemath(SafeMath)
	 * @see metaModel.MetaModelPackage#getToken_Manager_Safemath()
	 * @model
	 * @generated
	 */
	SafeMath getSafemath();

	/**
	 * Sets the value of the '{@link metaModel.Token_Manager#getSafemath <em>Safemath</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safemath</em>' reference.
	 * @see #getSafemath()
	 * @generated
	 */
	void setSafemath(SafeMath value);

	/**
	 * Returns the value of the '<em><b>Balances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balances</em>' attribute.
	 * @see #setBalances(Object)
	 * @see metaModel.MetaModelPackage#getToken_Manager_Balances()
	 * @model
	 * @generated
	 */
	Object getBalances();

	/**
	 * Sets the value of the '{@link metaModel.Token_Manager#getBalances <em>Balances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balances</em>' attribute.
	 * @see #getBalances()
	 * @generated
	 */
	void setBalances(Object value);

} // Token_Manager
