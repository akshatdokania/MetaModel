/**
 */
package metaModel.impl;

import metaModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaModelFactoryImpl extends EFactoryImpl implements MetaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetaModelFactory init() {
		try {
			MetaModelFactory theMetaModelFactory = (MetaModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(MetaModelPackage.eNS_URI);
			if (theMetaModelFactory != null) {
				return theMetaModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MetaModelPackage.BLOCKCHAIN:
			return createBlockchain();
		case MetaModelPackage.BLOCK:
			return createBlock();
		case MetaModelPackage.TRANSACTION:
			return createTransaction();
		case MetaModelPackage.ADDRESS:
			return createAddress();
		case MetaModelPackage.DAPP:
			return createDApp();
		case MetaModelPackage.WALLET:
			return createWallet();
		case MetaModelPackage.USER:
			return createUser();
		case MetaModelPackage.PLAYER:
			return createPlayer();
		case MetaModelPackage.GAME_PLAYER_MANAGER:
			return createGamePlayer_Manager();
		case MetaModelPackage.GAME_CORE:
			return createGameCore();
		case MetaModelPackage.GAME_MINTING:
			return createGameMinting();
		case MetaModelPackage.SIGNATURE_VALIDATOR:
			return createSignatureValidator();
		case MetaModelPackage.SIGNATURE_REGISTRY:
			return createSignatureRegistry();
		case MetaModelPackage.SIGNATURE:
			return createSignature();
		case MetaModelPackage.ECDSA:
			return createECDSA();
		case MetaModelPackage.TOKEN_MANAGER:
			return createToken_Manager();
		case MetaModelPackage.TOKEN:
			return createToken();
		case MetaModelPackage.SAFE_MATH:
			return createSafeMath();
		case MetaModelPackage.ORACLE_CLIENT:
			return createOracleClient();
		case MetaModelPackage.ORACLE:
			return createOracle();
		case MetaModelPackage.REQUEST:
			return createRequest();
		case MetaModelPackage.BUFFER:
			return createBuffer();
		case MetaModelPackage.BUFFER_MANAGER:
			return createBuffer_Manager();
		case MetaModelPackage.CBOR:
			return createCBOR();
		case MetaModelPackage.EXCHANGE:
			return createExchange();
		case MetaModelPackage.CURRENCY:
			return createCurrency();
		case MetaModelPackage.MARKETPLACE:
			return createMarketplace();
		case MetaModelPackage.ORDERS:
			return createOrders();
		case MetaModelPackage.ITEM:
			return createItem();
		case MetaModelPackage.AUCTION:
			return createAuction();
		case MetaModelPackage.LIQUIDATION_MANAGER:
			return createLiquidation_Manager();
		case MetaModelPackage.LIQUIDATOR:
			return createLiquidator();
		case MetaModelPackage.RESERVES_MANAGER:
			return createReserves_Manager();
		case MetaModelPackage.DE_FI_LENDING_CORE:
			return createDeFi_Lending_Core();
		case MetaModelPackage.DATA_PROVIDER:
			return createData_Provider();
		case MetaModelPackage.DE_FI_LENDING_POOL:
			return createDeFi_Lending_Pool();
		case MetaModelPackage.DE_FI_USER:
			return createDeFi_User();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MetaModelPackage.ADDRESS_DTYPE:
			return createAddressDTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MetaModelPackage.ADDRESS_DTYPE:
			return convertAddressDTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Blockchain createBlockchain() {
		BlockchainImpl blockchain = new BlockchainImpl();
		return blockchain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction createTransaction() {
		TransactionImpl transaction = new TransactionImpl();
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DApp createDApp() {
		DAppImpl dApp = new DAppImpl();
		return dApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wallet createWallet() {
		WalletImpl wallet = new WalletImpl();
		return wallet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamePlayer_Manager createGamePlayer_Manager() {
		GamePlayer_ManagerImpl gamePlayer_Manager = new GamePlayer_ManagerImpl();
		return gamePlayer_Manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameCore createGameCore() {
		GameCoreImpl gameCore = new GameCoreImpl();
		return gameCore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameMinting createGameMinting() {
		GameMintingImpl gameMinting = new GameMintingImpl();
		return gameMinting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureValidator createSignatureValidator() {
		SignatureValidatorImpl signatureValidator = new SignatureValidatorImpl();
		return signatureValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureRegistry createSignatureRegistry() {
		SignatureRegistryImpl signatureRegistry = new SignatureRegistryImpl();
		return signatureRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECDSA createECDSA() {
		ECDSAImpl ecdsa = new ECDSAImpl();
		return ecdsa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token_Manager createToken_Manager() {
		Token_ManagerImpl token_Manager = new Token_ManagerImpl();
		return token_Manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafeMath createSafeMath() {
		SafeMathImpl safeMath = new SafeMathImpl();
		return safeMath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleClient createOracleClient() {
		OracleClientImpl oracleClient = new OracleClientImpl();
		return oracleClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oracle createOracle() {
		OracleImpl oracle = new OracleImpl();
		return oracle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer createBuffer() {
		BufferImpl buffer = new BufferImpl();
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer_Manager createBuffer_Manager() {
		Buffer_ManagerImpl buffer_Manager = new Buffer_ManagerImpl();
		return buffer_Manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CBOR createCBOR() {
		CBORImpl cbor = new CBORImpl();
		return cbor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exchange createExchange() {
		ExchangeImpl exchange = new ExchangeImpl();
		return exchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency createCurrency() {
		CurrencyImpl currency = new CurrencyImpl();
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marketplace createMarketplace() {
		MarketplaceImpl marketplace = new MarketplaceImpl();
		return marketplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orders createOrders() {
		OrdersImpl orders = new OrdersImpl();
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auction createAuction() {
		AuctionImpl auction = new AuctionImpl();
		return auction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Liquidation_Manager createLiquidation_Manager() {
		Liquidation_ManagerImpl liquidation_Manager = new Liquidation_ManagerImpl();
		return liquidation_Manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Liquidator createLiquidator() {
		LiquidatorImpl liquidator = new LiquidatorImpl();
		return liquidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reserves_Manager createReserves_Manager() {
		Reserves_ManagerImpl reserves_Manager = new Reserves_ManagerImpl();
		return reserves_Manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeFi_Lending_Core createDeFi_Lending_Core() {
		DeFi_Lending_CoreImpl deFi_Lending_Core = new DeFi_Lending_CoreImpl();
		return deFi_Lending_Core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_Provider createData_Provider() {
		Data_ProviderImpl data_Provider = new Data_ProviderImpl();
		return data_Provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeFi_Lending_Pool createDeFi_Lending_Pool() {
		DeFi_Lending_PoolImpl deFi_Lending_Pool = new DeFi_Lending_PoolImpl();
		return deFi_Lending_Pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeFi_User createDeFi_User() {
		DeFi_UserImpl deFi_User = new DeFi_UserImpl();
		return deFi_User;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAddressDTypeFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressDTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelPackage getMetaModelPackage() {
		return (MetaModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaModelPackage getPackage() {
		return MetaModelPackage.eINSTANCE;
	}

} //MetaModelFactoryImpl
