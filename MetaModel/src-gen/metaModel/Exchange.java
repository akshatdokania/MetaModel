/**
 */
package metaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Exchange#getCurrency <em>Currency</em>}</li>
 *   <li>{@link metaModel.Exchange#getSelector <em>Selector</em>}</li>
 *   <li>{@link metaModel.Exchange#getReserves <em>Reserves</em>}</li>
 *   <li>{@link metaModel.Exchange#getBlockTimeStamp <em>Block Time Stamp</em>}</li>
 *   <li>{@link metaModel.Exchange#getMinimumLiquiduty <em>Minimum Liquiduty</em>}</li>
 *   <li>{@link metaModel.Exchange#getFactory <em>Factory</em>}</li>
 *   <li>{@link metaModel.Exchange#getToken <em>Token</em>}</li>
 *   <li>{@link metaModel.Exchange#getToken_manager <em>Token manager</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getExchange()
 * @model
 * @generated
 */
public interface Exchange extends Contract {
	/**
	 * Returns the value of the '<em><b>Currency</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.Currency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getExchange_Currency()
	 * @model containment="true"
	 * @generated
	 */
	EList<Currency> getCurrency();

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(byte)
	 * @see metaModel.MetaModelPackage#getExchange_Selector()
	 * @model
	 * @generated
	 */
	byte getSelector();

	/**
	 * Sets the value of the '{@link metaModel.Exchange#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(byte value);

	/**
	 * Returns the value of the '<em><b>Reserves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserves</em>' attribute.
	 * @see #setReserves(int)
	 * @see metaModel.MetaModelPackage#getExchange_Reserves()
	 * @model
	 * @generated
	 */
	int getReserves();

	/**
	 * Sets the value of the '{@link metaModel.Exchange#getReserves <em>Reserves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserves</em>' attribute.
	 * @see #getReserves()
	 * @generated
	 */
	void setReserves(int value);

	/**
	 * Returns the value of the '<em><b>Block Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Time Stamp</em>' attribute.
	 * @see #setBlockTimeStamp(int)
	 * @see metaModel.MetaModelPackage#getExchange_BlockTimeStamp()
	 * @model
	 * @generated
	 */
	int getBlockTimeStamp();

	/**
	 * Sets the value of the '{@link metaModel.Exchange#getBlockTimeStamp <em>Block Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Time Stamp</em>' attribute.
	 * @see #getBlockTimeStamp()
	 * @generated
	 */
	void setBlockTimeStamp(int value);

	/**
	 * Returns the value of the '<em><b>Minimum Liquiduty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Liquiduty</em>' attribute.
	 * @see #setMinimumLiquiduty(int)
	 * @see metaModel.MetaModelPackage#getExchange_MinimumLiquiduty()
	 * @model
	 * @generated
	 */
	int getMinimumLiquiduty();

	/**
	 * Sets the value of the '{@link metaModel.Exchange#getMinimumLiquiduty <em>Minimum Liquiduty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Liquiduty</em>' attribute.
	 * @see #getMinimumLiquiduty()
	 * @generated
	 */
	void setMinimumLiquiduty(int value);

	/**
	 * Returns the value of the '<em><b>Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory</em>' attribute.
	 * @see #setFactory(String)
	 * @see metaModel.MetaModelPackage#getExchange_Factory()
	 * @model dataType="metaModel.AddressDType"
	 * @generated
	 */
	String getFactory();

	/**
	 * Sets the value of the '{@link metaModel.Exchange#getFactory <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory</em>' attribute.
	 * @see #getFactory()
	 * @generated
	 */
	void setFactory(String value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(Object)
	 * @see metaModel.MetaModelPackage#getExchange_Token()
	 * @model
	 * @generated
	 */
	Object getToken();

	/**
	 * Sets the value of the '{@link metaModel.Exchange#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Object value);

	/**
	 * Returns the value of the '<em><b>Token manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token manager</em>' reference.
	 * @see #setToken_manager(Token_Manager)
	 * @see metaModel.MetaModelPackage#getExchange_Token_manager()
	 * @model
	 * @generated
	 */
	Token_Manager getToken_manager();

	/**
	 * Sets the value of the '{@link metaModel.Exchange#getToken_manager <em>Token manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token manager</em>' reference.
	 * @see #getToken_manager()
	 * @generated
	 */
	void setToken_manager(Token_Manager value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateConversonRates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void mintFee();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void mint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void burn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void swap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sync();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // Exchange
