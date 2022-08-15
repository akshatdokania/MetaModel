/**
 */
package metaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Data_Provider#getDefi_lending_core <em>Defi lending core</em>}</li>
 *   <li>{@link metaModel.Data_Provider#getOracleclient <em>Oracleclient</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getData_Provider()
 * @model
 * @generated
 */
public interface Data_Provider extends OracleClient {
	/**
	 * Returns the value of the '<em><b>Defi lending core</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.DeFi_Lending_Core#getData_provider <em>Data provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defi lending core</em>' reference.
	 * @see #setDefi_lending_core(DeFi_Lending_Core)
	 * @see metaModel.MetaModelPackage#getData_Provider_Defi_lending_core()
	 * @see metaModel.DeFi_Lending_Core#getData_provider
	 * @model opposite="data_provider"
	 * @generated
	 */
	DeFi_Lending_Core getDefi_lending_core();

	/**
	 * Sets the value of the '{@link metaModel.Data_Provider#getDefi_lending_core <em>Defi lending core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defi lending core</em>' reference.
	 * @see #getDefi_lending_core()
	 * @generated
	 */
	void setDefi_lending_core(DeFi_Lending_Core value);

	/**
	 * Returns the value of the '<em><b>Oracleclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oracleclient</em>' reference.
	 * @see #setOracleclient(OracleClient)
	 * @see metaModel.MetaModelPackage#getData_Provider_Oracleclient()
	 * @model
	 * @generated
	 */
	OracleClient getOracleclient();

	/**
	 * Sets the value of the '{@link metaModel.Data_Provider#getOracleclient <em>Oracleclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oracleclient</em>' reference.
	 * @see #getOracleclient()
	 * @generated
	 */
	void setOracleclient(OracleClient value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void priceOracle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void interestRate();

} // Data_Provider
