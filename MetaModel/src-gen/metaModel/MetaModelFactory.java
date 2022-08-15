/**
 */
package metaModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see metaModel.MetaModelPackage
 * @generated
 */
public interface MetaModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaModelFactory eINSTANCE = metaModel.impl.MetaModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Blockchain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blockchain</em>'.
	 * @generated
	 */
	Blockchain createBlockchain();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction</em>'.
	 * @generated
	 */
	Transaction createTransaction();

	/**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	Address createAddress();

	/**
	 * Returns a new object of class '<em>DApp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DApp</em>'.
	 * @generated
	 */
	DApp createDApp();

	/**
	 * Returns a new object of class '<em>Wallet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wallet</em>'.
	 * @generated
	 */
	Wallet createWallet();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player</em>'.
	 * @generated
	 */
	Player createPlayer();

	/**
	 * Returns a new object of class '<em>Game Player Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Player Manager</em>'.
	 * @generated
	 */
	GamePlayer_Manager createGamePlayer_Manager();

	/**
	 * Returns a new object of class '<em>Game Core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Core</em>'.
	 * @generated
	 */
	GameCore createGameCore();

	/**
	 * Returns a new object of class '<em>Game Minting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Minting</em>'.
	 * @generated
	 */
	GameMinting createGameMinting();

	/**
	 * Returns a new object of class '<em>Signature Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature Validator</em>'.
	 * @generated
	 */
	SignatureValidator createSignatureValidator();

	/**
	 * Returns a new object of class '<em>Signature Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature Registry</em>'.
	 * @generated
	 */
	SignatureRegistry createSignatureRegistry();

	/**
	 * Returns a new object of class '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature</em>'.
	 * @generated
	 */
	Signature createSignature();

	/**
	 * Returns a new object of class '<em>ECDSA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECDSA</em>'.
	 * @generated
	 */
	ECDSA createECDSA();

	/**
	 * Returns a new object of class '<em>Token Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Manager</em>'.
	 * @generated
	 */
	Token_Manager createToken_Manager();

	/**
	 * Returns a new object of class '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token</em>'.
	 * @generated
	 */
	Token createToken();

	/**
	 * Returns a new object of class '<em>Safe Math</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safe Math</em>'.
	 * @generated
	 */
	SafeMath createSafeMath();

	/**
	 * Returns a new object of class '<em>Oracle Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oracle Client</em>'.
	 * @generated
	 */
	OracleClient createOracleClient();

	/**
	 * Returns a new object of class '<em>Oracle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oracle</em>'.
	 * @generated
	 */
	Oracle createOracle();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	Request createRequest();

	/**
	 * Returns a new object of class '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer</em>'.
	 * @generated
	 */
	Buffer createBuffer();

	/**
	 * Returns a new object of class '<em>Buffer Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer Manager</em>'.
	 * @generated
	 */
	Buffer_Manager createBuffer_Manager();

	/**
	 * Returns a new object of class '<em>CBOR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CBOR</em>'.
	 * @generated
	 */
	CBOR createCBOR();

	/**
	 * Returns a new object of class '<em>Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchange</em>'.
	 * @generated
	 */
	Exchange createExchange();

	/**
	 * Returns a new object of class '<em>Currency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Currency</em>'.
	 * @generated
	 */
	Currency createCurrency();

	/**
	 * Returns a new object of class '<em>Marketplace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marketplace</em>'.
	 * @generated
	 */
	Marketplace createMarketplace();

	/**
	 * Returns a new object of class '<em>Orders</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orders</em>'.
	 * @generated
	 */
	Orders createOrders();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Auction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auction</em>'.
	 * @generated
	 */
	Auction createAuction();

	/**
	 * Returns a new object of class '<em>Liquidation Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Liquidation Manager</em>'.
	 * @generated
	 */
	Liquidation_Manager createLiquidation_Manager();

	/**
	 * Returns a new object of class '<em>Liquidator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Liquidator</em>'.
	 * @generated
	 */
	Liquidator createLiquidator();

	/**
	 * Returns a new object of class '<em>Reserves Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reserves Manager</em>'.
	 * @generated
	 */
	Reserves_Manager createReserves_Manager();

	/**
	 * Returns a new object of class '<em>De Fi Lending Core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>De Fi Lending Core</em>'.
	 * @generated
	 */
	DeFi_Lending_Core createDeFi_Lending_Core();

	/**
	 * Returns a new object of class '<em>Data Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Provider</em>'.
	 * @generated
	 */
	Data_Provider createData_Provider();

	/**
	 * Returns a new object of class '<em>De Fi Lending Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>De Fi Lending Pool</em>'.
	 * @generated
	 */
	DeFi_Lending_Pool createDeFi_Lending_Pool();

	/**
	 * Returns a new object of class '<em>De Fi User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>De Fi User</em>'.
	 * @generated
	 */
	DeFi_User createDeFi_User();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetaModelPackage getMetaModelPackage();

} //MetaModelFactory
