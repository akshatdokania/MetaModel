/**
 */
package metaModel.impl;

import metaModel.Address;
import metaModel.Auction;
import metaModel.Block;
import metaModel.Blockchain;
import metaModel.Buffer;
import metaModel.Buffer_Manager;
import metaModel.Contract;
import metaModel.Currency;
import metaModel.DApp;
import metaModel.Data_Provider;
import metaModel.DeFi_Lending_Core;
import metaModel.DeFi_Lending_Pool;
import metaModel.DeFi_User;
import metaModel.Exchange;
import metaModel.GameCore;
import metaModel.GameMinting;
import metaModel.GamePlayer_Manager;
import metaModel.Item;
import metaModel.Liquidation_Manager;
import metaModel.Liquidator;
import metaModel.Marketplace;
import metaModel.MetaModelFactory;
import metaModel.MetaModelPackage;
import metaModel.Oracle;
import metaModel.OracleClient;
import metaModel.Orders;
import metaModel.Player;
import metaModel.Request;
import metaModel.Reserves_Manager;
import metaModel.SafeMath;
import metaModel.Signature;
import metaModel.SignatureRegistry;
import metaModel.SignatureValidator;
import metaModel.Token;
import metaModel.Token_Manager;
import metaModel.Transaction;
import metaModel.User;
import metaModel.Wallet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaModelPackageImpl extends EPackageImpl implements MetaModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockchainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass walletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gamePlayer_ManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameCoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameMintingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecdsaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass token_ManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safeMathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oracleClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oracleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buffer_ManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cborEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marketplaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liquidation_ManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liquidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reserves_ManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deFi_Lending_CoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass data_ProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deFi_Lending_PoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deFi_UserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType addressDTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see metaModel.MetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetaModelPackageImpl() {
		super(eNS_URI, MetaModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetaModelPackage init() {
		if (isInited)
			return (MetaModelPackage) EPackage.Registry.INSTANCE.getEPackage(MetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetaModelPackageImpl theMetaModelPackage = registeredMetaModelPackage instanceof MetaModelPackageImpl
				? (MetaModelPackageImpl) registeredMetaModelPackage
				: new MetaModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetaModelPackage.eNS_URI, theMetaModelPackage);
		return theMetaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockchain() {
		return blockchainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockchain_Block() {
		return (EReference) blockchainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Transactions() {
		return (EReference) blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Contracts() {
		return (EReference) blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Address() {
		return (EReference) blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransaction() {
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Address() {
		return (EReference) transactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_User() {
		return (EReference) transactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Signaturevalidator() {
		return (EReference) transactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_To() {
		return (EAttribute) transactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_From() {
		return (EAttribute) transactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Hash() {
		return (EAttribute) transactionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_Transaction() {
		return (EReference) addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_Contract() {
		return (EReference) addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_User() {
		return (EReference) addressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Addr() {
		return (EAttribute) addressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContract() {
		return contractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Address() {
		return (EReference) contractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Dapp() {
		return (EReference) contractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDApp() {
		return dAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDApp_Contract() {
		return (EReference) dAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWallet() {
		return walletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWallet_User() {
		return (EReference) walletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Address() {
		return (EReference) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Wallet() {
		return (EReference) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Transaction() {
		return (EReference) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayer() {
		return playerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer_Gameplayer_manager() {
		return (EReference) playerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_Id() {
		return (EAttribute) playerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_Name() {
		return (EAttribute) playerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_Addr() {
		return (EAttribute) playerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGamePlayer_Manager() {
		return gamePlayer_ManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamePlayer_Manager_Player() {
		return (EReference) gamePlayer_ManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGamePlayer_Manager_Admin() {
		return (EAttribute) gamePlayer_ManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGamePlayer_Manager_Players() {
		return (EAttribute) gamePlayer_ManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGamePlayer_Manager__AddPlayer() {
		return gamePlayer_ManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGamePlayer_Manager__RemovePlayer() {
		return gamePlayer_ManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGamePlayer_Manager__EditPlayer() {
		return gamePlayer_ManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGamePlayer_Manager__FindPlayer() {
		return gamePlayer_ManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGamePlayer_Manager__Exist() {
		return gamePlayer_ManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameCore() {
		return gameCoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameCore_Gameplayer_manager() {
		return (EReference) gameCoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameCore_Gameminting() {
		return (EReference) gameCoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameCore_NewPlayerAddress() {
		return (EAttribute) gameCoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameCore_Active_players() {
		return (EAttribute) gameCoreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameCore__SetNewAddress() {
		return gameCoreEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameCore__GetCollectible() {
		return gameCoreEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameCore__Withdraw() {
		return gameCoreEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameCore__Join() {
		return gameCoreEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameCore__Ping() {
		return gameCoreEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameMinting() {
		return gameMintingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameMinting_Promold() {
		return (EAttribute) gameMintingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameMinting_Count() {
		return (EAttribute) gameMintingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameMinting_AuctionId() {
		return (EAttribute) gameMintingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameMinting_Token_manager() {
		return (EReference) gameMintingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameMinting__ComputeNetPrice() {
		return gameMintingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameMinting__CreatePromo() {
		return gameMintingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameMinting__CreateAuction() {
		return gameMintingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureValidator() {
		return signatureValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureValidator_Signatureregistry() {
		return (EReference) signatureValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureValidator_Ecdsa() {
		return (EReference) signatureValidatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureValidator__RequireValidSignature() {
		return signatureValidatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureValidator__CalculateSignatureHash() {
		return signatureValidatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureValidator__ValidateSignature() {
		return signatureValidatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureRegistry() {
		return signatureRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureRegistry_Signatures() {
		return (EReference) signatureRegistryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureRegistry_Signaturevalidator() {
		return (EReference) signatureRegistryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureRegistry_Signature() {
		return (EAttribute) signatureRegistryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureRegistry__RegisterSignature() {
		return signatureRegistryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignature() {
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignature_Id() {
		return (EAttribute) signatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignature_Signature() {
		return (EAttribute) signatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECDSA() {
		return ecdsaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getECDSA__Recover() {
		return ecdsaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getECDSA__ToEthSignedMessageHash() {
		return ecdsaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken_Manager() {
		return token_ManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Manager_Symbol() {
		return (EAttribute) token_ManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Manager_Name() {
		return (EAttribute) token_ManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Manager_TotalSupply() {
		return (EAttribute) token_ManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_Manager_Safemath() {
		return (EReference) token_ManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Manager_Balances() {
		return (EAttribute) token_ManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToken__Transfer() {
		return tokenEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToken__Approval() {
		return tokenEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToken__TotalSupply() {
		return tokenEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToken__BalanceOf() {
		return tokenEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToken__TransferFrom() {
		return tokenEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToken__TransferTo() {
		return tokenEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToken__Approve() {
		return tokenEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToken__Allowance() {
		return tokenEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSafeMath() {
		return safeMathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSafeMath__SafeMul__int_int() {
		return safeMathEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSafeMath__SafeDiv__int_int() {
		return safeMathEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSafeMath__SafeAdd__int_int() {
		return safeMathEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSafeMath__SafeSub__int_int() {
		return safeMathEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOracleClient() {
		return oracleClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOracleClient_OracleRef() {
		return (EReference) oracleClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOracleClient_RequestRef() {
		return (EReference) oracleClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOracleClient_Buffer() {
		return (EReference) oracleClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOracleClient_Registry() {
		return (EAttribute) oracleClientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOracleClient_Link() {
		return (EAttribute) oracleClientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOracleClient_Oracle() {
		return (EAttribute) oracleClientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOracleClient_Request() {
		return (EAttribute) oracleClientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOracleClient_Cbor() {
		return (EReference) oracleClientEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOracleClient_PendingRequests() {
		return (EAttribute) oracleClientEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOracleClient__EncodeRequest() {
		return oracleClientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOracleClient__TokenAddress() {
		return oracleClientEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOracleClient__BuildRequest() {
		return oracleClientEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOracleClient__SendRequest() {
		return oracleClientEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOracleClient__CancelRequest() {
		return oracleClientEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOracleClient__SetOracle() {
		return oracleClientEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOracleClient__SetToken() {
		return oracleClientEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOracleClient__AddExternalRequest() {
		return oracleClientEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOracleClient__UpdateOracle() {
		return oracleClientEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOracleClient__ValidateCallback() {
		return oracleClientEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOracleClient__RecordRequestFulfilled() {
		return oracleClientEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOracle() {
		return oracleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOracle_Id() {
		return (EAttribute) oracleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOracle_Address() {
		return (EAttribute) oracleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_Buffer_manager() {
		return (EReference) requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Id() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_CallBackAddress() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Buf() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuffer() {
		return bufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuffer_Buffer_manager() {
		return (EReference) bufferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuffer_Buf() {
		return (EAttribute) bufferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuffer_Capacity() {
		return (EAttribute) bufferEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuffer_Token_manager() {
		return (EReference) bufferEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuffer_Manager() {
		return buffer_ManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBuffer_Manager__Resize() {
		return buffer_ManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBuffer_Manager__Max() {
		return buffer_ManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBuffer_Manager__Write() {
		return buffer_ManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBuffer_Manager__Truncate() {
		return buffer_ManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBuffer_Manager__Append() {
		return buffer_ManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCBOR() {
		return cborEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCBOR_Buffer_manager() {
		return (EReference) cborEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchange() {
		return exchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchange_Currency() {
		return (EReference) exchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchange_Selector() {
		return (EAttribute) exchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchange_Reserves() {
		return (EAttribute) exchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchange_BlockTimeStamp() {
		return (EAttribute) exchangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchange_MinimumLiquiduty() {
		return (EAttribute) exchangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchange_Factory() {
		return (EAttribute) exchangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchange_Token() {
		return (EAttribute) exchangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchange_Token_manager() {
		return (EReference) exchangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExchange__UpdateConversonRates() {
		return exchangeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExchange__MintFee() {
		return exchangeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExchange__Mint() {
		return exchangeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExchange__Burn() {
		return exchangeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExchange__Swap() {
		return exchangeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExchange__Sync() {
		return exchangeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExchange__Initialize() {
		return exchangeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrency() {
		return currencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrency_Token_manager() {
		return (EReference) currencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCurrency__GetConversionRate() {
		return currencyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCurrency__Convert() {
		return currencyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarketplace() {
		return marketplaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarketplace_Orders() {
		return (EReference) marketplaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarketplace_Auctions() {
		return (EReference) marketplaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarketplace_Token() {
		return (EAttribute) marketplaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarketplace_PublicationFee() {
		return (EAttribute) marketplaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarketplace_Token_manager() {
		return (EReference) marketplaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarketplace_Registry() {
		return (EAttribute) marketplaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMarketplace__CreateAuction() {
		return marketplaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMarketplace__CancelAuction() {
		return marketplaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMarketplace__ChangeOwner() {
		return marketplaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMarketplace__SetPublicationFee() {
		return marketplaceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMarketplace__CreateOrder() {
		return marketplaceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMarketplace__CancelOrder() {
		return marketplaceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMarketplace__ExecuteOrder() {
		return marketplaceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMarketplace__SetOwnerCut() {
		return marketplaceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrders() {
		return ordersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrders_Items() {
		return (EReference) ordersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrders_Id() {
		return (EAttribute) ordersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrders_Status() {
		return (EAttribute) ordersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrders_Buyer() {
		return (EAttribute) ordersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrders_Price() {
		return (EAttribute) ordersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Id() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_OrderId() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Quantity() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Price() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuction() {
		return auctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuction_Id() {
		return (EAttribute) auctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuction_Seller() {
		return (EAttribute) auctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuction_Price() {
		return (EAttribute) auctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuction_ExpiresAt() {
		return (EAttribute) auctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiquidation_Manager() {
		return liquidation_ManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiquidation_Manager_Liquidator() {
		return (EReference) liquidation_ManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiquidation_Manager_Token_manager() {
		return (EReference) liquidation_ManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiquidation_Manager__Mint() {
		return liquidation_ManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiquidation_Manager__Bum() {
		return liquidation_ManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiquidation_Manager__UpdateLiquidateFee() {
		return liquidation_ManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiquidator() {
		return liquidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiquidator__Initiate() {
		return liquidatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReserves_Manager() {
		return reserves_ManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReserves_Manager_Defi_lending_core() {
		return (EReference) reserves_ManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReserves_Manager_Token_manager() {
		return (EReference) reserves_ManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReserves_Manager__Activate() {
		return reserves_ManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReserves_Manager__Deactivate() {
		return reserves_ManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReserves_Manager__Freeze() {
		return reserves_ManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReserves_Manager__Update() {
		return reserves_ManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReserves_Manager__Unfreeze() {
		return reserves_ManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeFi_Lending_Core() {
		return deFi_Lending_CoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeFi_Lending_Core_Data_provider() {
		return (EReference) deFi_Lending_CoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeFi_Lending_Core_Reserves_manager() {
		return (EReference) deFi_Lending_CoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeFi_Lending_Core__UpdateState() {
		return deFi_Lending_CoreEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeFi_Lending_Core__ReservesState() {
		return deFi_Lending_CoreEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeFi_Lending_Core__LendingPoolConfigurator() {
		return deFi_Lending_CoreEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeFi_Lending_Core__TransferToUser() {
		return deFi_Lending_CoreEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData_Provider() {
		return data_ProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Provider_Defi_lending_core() {
		return (EReference) data_ProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Provider_Oracleclient() {
		return (EReference) data_ProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData_Provider__PriceOracle() {
		return data_ProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData_Provider__InterestRate() {
		return data_ProviderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeFi_Lending_Pool() {
		return deFi_Lending_PoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeFi_Lending_Pool_Defi_user() {
		return (EReference) deFi_Lending_PoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeFi_Lending_Pool_Defi_lending_core() {
		return (EReference) deFi_Lending_PoolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeFi_Lending_Pool_LendingPoolAddress() {
		return (EAttribute) deFi_Lending_PoolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeFi_User() {
		return deFi_UserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeFi_User_Defi_lending_pool() {
		return (EReference) deFi_UserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeFi_User__Loan() {
		return deFi_UserEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeFi_User__Deposit() {
		return deFi_UserEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeFi_User__Borrow() {
		return deFi_UserEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeFi_User__Repay() {
		return deFi_UserEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeFi_User__Redeem() {
		return deFi_UserEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeFi_User__Swap() {
		return deFi_UserEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeFi_User__Recieve() {
		return deFi_UserEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAddressDType() {
		return addressDTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelFactory getMetaModelFactory() {
		return (MetaModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		blockchainEClass = createEClass(BLOCKCHAIN);
		createEReference(blockchainEClass, BLOCKCHAIN__BLOCK);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__TRANSACTIONS);
		createEReference(blockEClass, BLOCK__CONTRACTS);
		createEReference(blockEClass, BLOCK__ADDRESS);

		transactionEClass = createEClass(TRANSACTION);
		createEReference(transactionEClass, TRANSACTION__ADDRESS);
		createEReference(transactionEClass, TRANSACTION__USER);
		createEReference(transactionEClass, TRANSACTION__SIGNATUREVALIDATOR);
		createEAttribute(transactionEClass, TRANSACTION__TO);
		createEAttribute(transactionEClass, TRANSACTION__FROM);
		createEAttribute(transactionEClass, TRANSACTION__HASH);

		addressEClass = createEClass(ADDRESS);
		createEReference(addressEClass, ADDRESS__TRANSACTION);
		createEReference(addressEClass, ADDRESS__CONTRACT);
		createEReference(addressEClass, ADDRESS__USER);
		createEAttribute(addressEClass, ADDRESS__ADDR);

		contractEClass = createEClass(CONTRACT);
		createEReference(contractEClass, CONTRACT__ADDRESS);
		createEReference(contractEClass, CONTRACT__DAPP);

		dAppEClass = createEClass(DAPP);
		createEReference(dAppEClass, DAPP__CONTRACT);

		walletEClass = createEClass(WALLET);
		createEReference(walletEClass, WALLET__USER);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__ADDRESS);
		createEReference(userEClass, USER__WALLET);
		createEReference(userEClass, USER__TRANSACTION);

		playerEClass = createEClass(PLAYER);
		createEReference(playerEClass, PLAYER__GAMEPLAYER_MANAGER);
		createEAttribute(playerEClass, PLAYER__ID);
		createEAttribute(playerEClass, PLAYER__NAME);
		createEAttribute(playerEClass, PLAYER__ADDR);

		gamePlayer_ManagerEClass = createEClass(GAME_PLAYER_MANAGER);
		createEReference(gamePlayer_ManagerEClass, GAME_PLAYER_MANAGER__PLAYER);
		createEAttribute(gamePlayer_ManagerEClass, GAME_PLAYER_MANAGER__ADMIN);
		createEAttribute(gamePlayer_ManagerEClass, GAME_PLAYER_MANAGER__PLAYERS);
		createEOperation(gamePlayer_ManagerEClass, GAME_PLAYER_MANAGER___ADD_PLAYER);
		createEOperation(gamePlayer_ManagerEClass, GAME_PLAYER_MANAGER___REMOVE_PLAYER);
		createEOperation(gamePlayer_ManagerEClass, GAME_PLAYER_MANAGER___EDIT_PLAYER);
		createEOperation(gamePlayer_ManagerEClass, GAME_PLAYER_MANAGER___FIND_PLAYER);
		createEOperation(gamePlayer_ManagerEClass, GAME_PLAYER_MANAGER___EXIST);

		gameCoreEClass = createEClass(GAME_CORE);
		createEReference(gameCoreEClass, GAME_CORE__GAMEPLAYER_MANAGER);
		createEReference(gameCoreEClass, GAME_CORE__GAMEMINTING);
		createEAttribute(gameCoreEClass, GAME_CORE__NEW_PLAYER_ADDRESS);
		createEAttribute(gameCoreEClass, GAME_CORE__ACTIVE_PLAYERS);
		createEOperation(gameCoreEClass, GAME_CORE___SET_NEW_ADDRESS);
		createEOperation(gameCoreEClass, GAME_CORE___GET_COLLECTIBLE);
		createEOperation(gameCoreEClass, GAME_CORE___WITHDRAW);
		createEOperation(gameCoreEClass, GAME_CORE___JOIN);
		createEOperation(gameCoreEClass, GAME_CORE___PING);

		gameMintingEClass = createEClass(GAME_MINTING);
		createEAttribute(gameMintingEClass, GAME_MINTING__PROMOLD);
		createEAttribute(gameMintingEClass, GAME_MINTING__COUNT);
		createEAttribute(gameMintingEClass, GAME_MINTING__AUCTION_ID);
		createEReference(gameMintingEClass, GAME_MINTING__TOKEN_MANAGER);
		createEOperation(gameMintingEClass, GAME_MINTING___COMPUTE_NET_PRICE);
		createEOperation(gameMintingEClass, GAME_MINTING___CREATE_PROMO);
		createEOperation(gameMintingEClass, GAME_MINTING___CREATE_AUCTION);

		signatureValidatorEClass = createEClass(SIGNATURE_VALIDATOR);
		createEReference(signatureValidatorEClass, SIGNATURE_VALIDATOR__SIGNATUREREGISTRY);
		createEReference(signatureValidatorEClass, SIGNATURE_VALIDATOR__ECDSA);
		createEOperation(signatureValidatorEClass, SIGNATURE_VALIDATOR___REQUIRE_VALID_SIGNATURE);
		createEOperation(signatureValidatorEClass, SIGNATURE_VALIDATOR___CALCULATE_SIGNATURE_HASH);
		createEOperation(signatureValidatorEClass, SIGNATURE_VALIDATOR___VALIDATE_SIGNATURE);

		signatureRegistryEClass = createEClass(SIGNATURE_REGISTRY);
		createEReference(signatureRegistryEClass, SIGNATURE_REGISTRY__SIGNATURES);
		createEReference(signatureRegistryEClass, SIGNATURE_REGISTRY__SIGNATUREVALIDATOR);
		createEAttribute(signatureRegistryEClass, SIGNATURE_REGISTRY__SIGNATURE);
		createEOperation(signatureRegistryEClass, SIGNATURE_REGISTRY___REGISTER_SIGNATURE);

		signatureEClass = createEClass(SIGNATURE);
		createEAttribute(signatureEClass, SIGNATURE__ID);
		createEAttribute(signatureEClass, SIGNATURE__SIGNATURE);

		ecdsaEClass = createEClass(ECDSA);
		createEOperation(ecdsaEClass, ECDSA___RECOVER);
		createEOperation(ecdsaEClass, ECDSA___TO_ETH_SIGNED_MESSAGE_HASH);

		token_ManagerEClass = createEClass(TOKEN_MANAGER);
		createEAttribute(token_ManagerEClass, TOKEN_MANAGER__SYMBOL);
		createEAttribute(token_ManagerEClass, TOKEN_MANAGER__NAME);
		createEAttribute(token_ManagerEClass, TOKEN_MANAGER__TOTAL_SUPPLY);
		createEReference(token_ManagerEClass, TOKEN_MANAGER__SAFEMATH);
		createEAttribute(token_ManagerEClass, TOKEN_MANAGER__BALANCES);

		tokenEClass = createEClass(TOKEN);
		createEOperation(tokenEClass, TOKEN___TRANSFER);
		createEOperation(tokenEClass, TOKEN___APPROVAL);
		createEOperation(tokenEClass, TOKEN___TOTAL_SUPPLY);
		createEOperation(tokenEClass, TOKEN___BALANCE_OF);
		createEOperation(tokenEClass, TOKEN___TRANSFER_FROM);
		createEOperation(tokenEClass, TOKEN___TRANSFER_TO);
		createEOperation(tokenEClass, TOKEN___APPROVE);
		createEOperation(tokenEClass, TOKEN___ALLOWANCE);

		safeMathEClass = createEClass(SAFE_MATH);
		createEOperation(safeMathEClass, SAFE_MATH___SAFE_MUL__INT_INT);
		createEOperation(safeMathEClass, SAFE_MATH___SAFE_DIV__INT_INT);
		createEOperation(safeMathEClass, SAFE_MATH___SAFE_ADD__INT_INT);
		createEOperation(safeMathEClass, SAFE_MATH___SAFE_SUB__INT_INT);

		oracleClientEClass = createEClass(ORACLE_CLIENT);
		createEReference(oracleClientEClass, ORACLE_CLIENT__ORACLE_REF);
		createEReference(oracleClientEClass, ORACLE_CLIENT__REQUEST_REF);
		createEReference(oracleClientEClass, ORACLE_CLIENT__BUFFER);
		createEAttribute(oracleClientEClass, ORACLE_CLIENT__REGISTRY);
		createEAttribute(oracleClientEClass, ORACLE_CLIENT__LINK);
		createEAttribute(oracleClientEClass, ORACLE_CLIENT__ORACLE);
		createEAttribute(oracleClientEClass, ORACLE_CLIENT__REQUEST);
		createEReference(oracleClientEClass, ORACLE_CLIENT__CBOR);
		createEAttribute(oracleClientEClass, ORACLE_CLIENT__PENDING_REQUESTS);
		createEOperation(oracleClientEClass, ORACLE_CLIENT___ENCODE_REQUEST);
		createEOperation(oracleClientEClass, ORACLE_CLIENT___TOKEN_ADDRESS);
		createEOperation(oracleClientEClass, ORACLE_CLIENT___BUILD_REQUEST);
		createEOperation(oracleClientEClass, ORACLE_CLIENT___SEND_REQUEST);
		createEOperation(oracleClientEClass, ORACLE_CLIENT___CANCEL_REQUEST);
		createEOperation(oracleClientEClass, ORACLE_CLIENT___SET_ORACLE);
		createEOperation(oracleClientEClass, ORACLE_CLIENT___SET_TOKEN);
		createEOperation(oracleClientEClass, ORACLE_CLIENT___ADD_EXTERNAL_REQUEST);
		createEOperation(oracleClientEClass, ORACLE_CLIENT___UPDATE_ORACLE);
		createEOperation(oracleClientEClass, ORACLE_CLIENT___VALIDATE_CALLBACK);
		createEOperation(oracleClientEClass, ORACLE_CLIENT___RECORD_REQUEST_FULFILLED);

		oracleEClass = createEClass(ORACLE);
		createEAttribute(oracleEClass, ORACLE__ID);
		createEAttribute(oracleEClass, ORACLE__ADDRESS);

		requestEClass = createEClass(REQUEST);
		createEReference(requestEClass, REQUEST__BUFFER_MANAGER);
		createEAttribute(requestEClass, REQUEST__ID);
		createEAttribute(requestEClass, REQUEST__CALL_BACK_ADDRESS);
		createEAttribute(requestEClass, REQUEST__BUF);

		bufferEClass = createEClass(BUFFER);
		createEReference(bufferEClass, BUFFER__BUFFER_MANAGER);
		createEAttribute(bufferEClass, BUFFER__BUF);
		createEAttribute(bufferEClass, BUFFER__CAPACITY);
		createEReference(bufferEClass, BUFFER__TOKEN_MANAGER);

		buffer_ManagerEClass = createEClass(BUFFER_MANAGER);
		createEOperation(buffer_ManagerEClass, BUFFER_MANAGER___RESIZE);
		createEOperation(buffer_ManagerEClass, BUFFER_MANAGER___MAX);
		createEOperation(buffer_ManagerEClass, BUFFER_MANAGER___WRITE);
		createEOperation(buffer_ManagerEClass, BUFFER_MANAGER___TRUNCATE);
		createEOperation(buffer_ManagerEClass, BUFFER_MANAGER___APPEND);

		cborEClass = createEClass(CBOR);
		createEReference(cborEClass, CBOR__BUFFER_MANAGER);

		exchangeEClass = createEClass(EXCHANGE);
		createEReference(exchangeEClass, EXCHANGE__CURRENCY);
		createEAttribute(exchangeEClass, EXCHANGE__SELECTOR);
		createEAttribute(exchangeEClass, EXCHANGE__RESERVES);
		createEAttribute(exchangeEClass, EXCHANGE__BLOCK_TIME_STAMP);
		createEAttribute(exchangeEClass, EXCHANGE__MINIMUM_LIQUIDUTY);
		createEAttribute(exchangeEClass, EXCHANGE__FACTORY);
		createEAttribute(exchangeEClass, EXCHANGE__TOKEN);
		createEReference(exchangeEClass, EXCHANGE__TOKEN_MANAGER);
		createEOperation(exchangeEClass, EXCHANGE___UPDATE_CONVERSON_RATES);
		createEOperation(exchangeEClass, EXCHANGE___MINT_FEE);
		createEOperation(exchangeEClass, EXCHANGE___MINT);
		createEOperation(exchangeEClass, EXCHANGE___BURN);
		createEOperation(exchangeEClass, EXCHANGE___SWAP);
		createEOperation(exchangeEClass, EXCHANGE___SYNC);
		createEOperation(exchangeEClass, EXCHANGE___INITIALIZE);

		currencyEClass = createEClass(CURRENCY);
		createEReference(currencyEClass, CURRENCY__TOKEN_MANAGER);
		createEOperation(currencyEClass, CURRENCY___GET_CONVERSION_RATE);
		createEOperation(currencyEClass, CURRENCY___CONVERT);

		marketplaceEClass = createEClass(MARKETPLACE);
		createEReference(marketplaceEClass, MARKETPLACE__ORDERS);
		createEReference(marketplaceEClass, MARKETPLACE__AUCTIONS);
		createEAttribute(marketplaceEClass, MARKETPLACE__TOKEN);
		createEAttribute(marketplaceEClass, MARKETPLACE__PUBLICATION_FEE);
		createEReference(marketplaceEClass, MARKETPLACE__TOKEN_MANAGER);
		createEAttribute(marketplaceEClass, MARKETPLACE__REGISTRY);
		createEOperation(marketplaceEClass, MARKETPLACE___CREATE_AUCTION);
		createEOperation(marketplaceEClass, MARKETPLACE___CANCEL_AUCTION);
		createEOperation(marketplaceEClass, MARKETPLACE___CHANGE_OWNER);
		createEOperation(marketplaceEClass, MARKETPLACE___SET_PUBLICATION_FEE);
		createEOperation(marketplaceEClass, MARKETPLACE___CREATE_ORDER);
		createEOperation(marketplaceEClass, MARKETPLACE___CANCEL_ORDER);
		createEOperation(marketplaceEClass, MARKETPLACE___EXECUTE_ORDER);
		createEOperation(marketplaceEClass, MARKETPLACE___SET_OWNER_CUT);

		ordersEClass = createEClass(ORDERS);
		createEReference(ordersEClass, ORDERS__ITEMS);
		createEAttribute(ordersEClass, ORDERS__ID);
		createEAttribute(ordersEClass, ORDERS__STATUS);
		createEAttribute(ordersEClass, ORDERS__BUYER);
		createEAttribute(ordersEClass, ORDERS__PRICE);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__ID);
		createEAttribute(itemEClass, ITEM__ORDER_ID);
		createEAttribute(itemEClass, ITEM__QUANTITY);
		createEAttribute(itemEClass, ITEM__PRICE);

		auctionEClass = createEClass(AUCTION);
		createEAttribute(auctionEClass, AUCTION__ID);
		createEAttribute(auctionEClass, AUCTION__SELLER);
		createEAttribute(auctionEClass, AUCTION__PRICE);
		createEAttribute(auctionEClass, AUCTION__EXPIRES_AT);

		liquidation_ManagerEClass = createEClass(LIQUIDATION_MANAGER);
		createEReference(liquidation_ManagerEClass, LIQUIDATION_MANAGER__LIQUIDATOR);
		createEReference(liquidation_ManagerEClass, LIQUIDATION_MANAGER__TOKEN_MANAGER);
		createEOperation(liquidation_ManagerEClass, LIQUIDATION_MANAGER___MINT);
		createEOperation(liquidation_ManagerEClass, LIQUIDATION_MANAGER___BUM);
		createEOperation(liquidation_ManagerEClass, LIQUIDATION_MANAGER___UPDATE_LIQUIDATE_FEE);

		liquidatorEClass = createEClass(LIQUIDATOR);
		createEOperation(liquidatorEClass, LIQUIDATOR___INITIATE);

		reserves_ManagerEClass = createEClass(RESERVES_MANAGER);
		createEReference(reserves_ManagerEClass, RESERVES_MANAGER__DEFI_LENDING_CORE);
		createEReference(reserves_ManagerEClass, RESERVES_MANAGER__TOKEN_MANAGER);
		createEOperation(reserves_ManagerEClass, RESERVES_MANAGER___ACTIVATE);
		createEOperation(reserves_ManagerEClass, RESERVES_MANAGER___DEACTIVATE);
		createEOperation(reserves_ManagerEClass, RESERVES_MANAGER___FREEZE);
		createEOperation(reserves_ManagerEClass, RESERVES_MANAGER___UPDATE);
		createEOperation(reserves_ManagerEClass, RESERVES_MANAGER___UNFREEZE);

		deFi_Lending_CoreEClass = createEClass(DE_FI_LENDING_CORE);
		createEReference(deFi_Lending_CoreEClass, DE_FI_LENDING_CORE__DATA_PROVIDER);
		createEReference(deFi_Lending_CoreEClass, DE_FI_LENDING_CORE__RESERVES_MANAGER);
		createEOperation(deFi_Lending_CoreEClass, DE_FI_LENDING_CORE___UPDATE_STATE);
		createEOperation(deFi_Lending_CoreEClass, DE_FI_LENDING_CORE___RESERVES_STATE);
		createEOperation(deFi_Lending_CoreEClass, DE_FI_LENDING_CORE___LENDING_POOL_CONFIGURATOR);
		createEOperation(deFi_Lending_CoreEClass, DE_FI_LENDING_CORE___TRANSFER_TO_USER);

		data_ProviderEClass = createEClass(DATA_PROVIDER);
		createEReference(data_ProviderEClass, DATA_PROVIDER__DEFI_LENDING_CORE);
		createEReference(data_ProviderEClass, DATA_PROVIDER__ORACLECLIENT);
		createEOperation(data_ProviderEClass, DATA_PROVIDER___PRICE_ORACLE);
		createEOperation(data_ProviderEClass, DATA_PROVIDER___INTEREST_RATE);

		deFi_Lending_PoolEClass = createEClass(DE_FI_LENDING_POOL);
		createEReference(deFi_Lending_PoolEClass, DE_FI_LENDING_POOL__DEFI_USER);
		createEReference(deFi_Lending_PoolEClass, DE_FI_LENDING_POOL__DEFI_LENDING_CORE);
		createEAttribute(deFi_Lending_PoolEClass, DE_FI_LENDING_POOL__LENDING_POOL_ADDRESS);

		deFi_UserEClass = createEClass(DE_FI_USER);
		createEReference(deFi_UserEClass, DE_FI_USER__DEFI_LENDING_POOL);
		createEOperation(deFi_UserEClass, DE_FI_USER___LOAN);
		createEOperation(deFi_UserEClass, DE_FI_USER___DEPOSIT);
		createEOperation(deFi_UserEClass, DE_FI_USER___BORROW);
		createEOperation(deFi_UserEClass, DE_FI_USER___REPAY);
		createEOperation(deFi_UserEClass, DE_FI_USER___REDEEM);
		createEOperation(deFi_UserEClass, DE_FI_USER___SWAP);
		createEOperation(deFi_UserEClass, DE_FI_USER___RECIEVE);

		// Create data types
		addressDTypeEDataType = createEDataType(ADDRESS_DTYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		playerEClass.getESuperTypes().add(this.getContract());
		token_ManagerEClass.getESuperTypes().add(this.getToken());
		token_ManagerEClass.getESuperTypes().add(this.getContract());
		oracleClientEClass.getESuperTypes().add(this.getContract());
		exchangeEClass.getESuperTypes().add(this.getContract());
		marketplaceEClass.getESuperTypes().add(this.getContract());
		data_ProviderEClass.getESuperTypes().add(this.getOracleClient());
		deFi_UserEClass.getESuperTypes().add(this.getContract());

		// Initialize classes, features, and operations; add parameters
		initEClass(blockchainEClass, Blockchain.class, "Blockchain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockchain_Block(), this.getBlock(), null, "block", null, 0, -1, Blockchain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Transactions(), this.getTransaction(), null, "transactions", null, 0, -1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Contracts(), this.getContract(), null, "contracts", null, 0, -1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Address(), this.getAddress(), null, "address", null, 0, -1, Block.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransaction_Address(), this.getAddress(), this.getAddress_Transaction(), "address", null, 0,
				1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_User(), this.getUser(), this.getUser_Transaction(), "user", null, 0, 1,
				Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Signaturevalidator(), this.getSignatureValidator(), null, "signaturevalidator",
				null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_To(), this.getAddressDType(), "to", null, 0, 1, Transaction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_From(), this.getAddressDType(), "from", null, 0, 1, Transaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_Hash(), ecorePackage.getEString(), "hash", null, 0, 1, Transaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddress_Transaction(), this.getTransaction(), this.getTransaction_Address(), "transaction",
				null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_Contract(), this.getContract(), this.getContract_Address(), "contract", null, 0, 1,
				Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_User(), this.getUser(), this.getUser_Address(), "user", null, 0, 1, Address.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, Address.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contractEClass, Contract.class, "Contract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContract_Address(), this.getAddress(), this.getAddress_Contract(), "address", null, 0, 1,
				Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_Dapp(), this.getDApp(), this.getDApp_Contract(), "dapp", null, 0, 1, Contract.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dAppEClass, DApp.class, "DApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDApp_Contract(), this.getContract(), this.getContract_Dapp(), "contract", null, 0, 1,
				DApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(walletEClass, Wallet.class, "Wallet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWallet_User(), this.getUser(), this.getUser_Wallet(), "user", null, 0, 1, Wallet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Address(), this.getAddress(), this.getAddress_User(), "address", null, 0, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Wallet(), this.getWallet(), this.getWallet_User(), "wallet", null, 0, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Transaction(), this.getTransaction(), this.getTransaction_User(), "transaction", null, 0,
				1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayer_Gameplayer_manager(), this.getGamePlayer_Manager(),
				this.getGamePlayer_Manager_Player(), "gameplayer_manager", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPlayer_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_Addr(), this.getAddressDType(), "addr", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gamePlayer_ManagerEClass, GamePlayer_Manager.class, "GamePlayer_Manager", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGamePlayer_Manager_Player(), this.getPlayer(), this.getPlayer_Gameplayer_manager(), "player",
				null, 0, 1, GamePlayer_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePlayer_Manager_Admin(), this.getAddressDType(), "admin", null, 0, 1,
				GamePlayer_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePlayer_Manager_Players(), ecorePackage.getEJavaObject(), "players", null, 0, 1,
				GamePlayer_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getGamePlayer_Manager__AddPlayer(), null, "addPlayer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGamePlayer_Manager__RemovePlayer(), null, "removePlayer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGamePlayer_Manager__EditPlayer(), null, "editPlayer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGamePlayer_Manager__FindPlayer(), null, "findPlayer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGamePlayer_Manager__Exist(), null, "exist", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gameCoreEClass, GameCore.class, "GameCore", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameCore_Gameplayer_manager(), this.getGamePlayer_Manager(), null, "gameplayer_manager", null,
				0, 1, GameCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameCore_Gameminting(), this.getGameMinting(), null, "gameminting", null, 0, 1,
				GameCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameCore_NewPlayerAddress(), this.getAddressDType(), "newPlayerAddress", null, 0, 1,
				GameCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameCore_Active_players(), ecorePackage.getEJavaObject(), "active_players", null, 0, 1,
				GameCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getGameCore__SetNewAddress(), null, "setNewAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameCore__GetCollectible(), null, "getCollectible", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameCore__Withdraw(), null, "withdraw", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameCore__Join(), null, "join", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameCore__Ping(), null, "ping", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gameMintingEClass, GameMinting.class, "GameMinting", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameMinting_Promold(), ecorePackage.getEInt(), "promold", null, 0, 1, GameMinting.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameMinting_Count(), ecorePackage.getEInt(), "count", null, 0, 1, GameMinting.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameMinting_AuctionId(), ecorePackage.getEInt(), "auctionId", null, 0, 1, GameMinting.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameMinting_Token_manager(), this.getToken_Manager(), null, "token_manager", null, 0, 1,
				GameMinting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGameMinting__ComputeNetPrice(), null, "computeNetPrice", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameMinting__CreatePromo(), null, "createPromo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameMinting__CreateAuction(), null, "createAuction", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(signatureValidatorEClass, SignatureValidator.class, "SignatureValidator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignatureValidator_Signatureregistry(), this.getSignatureRegistry(),
				this.getSignatureRegistry_Signaturevalidator(), "signatureregistry", null, 0, 1,
				SignatureValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignatureValidator_Ecdsa(), this.getECDSA(), null, "ecdsa", null, 0, 1,
				SignatureValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSignatureValidator__RequireValidSignature(), null, "requireValidSignature", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getSignatureValidator__CalculateSignatureHash(), null, "calculateSignatureHash", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getSignatureValidator__ValidateSignature(), null, "validateSignature", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(signatureRegistryEClass, SignatureRegistry.class, "SignatureRegistry", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignatureRegistry_Signatures(), this.getSignature(), null, "signatures", null, 0, -1,
				SignatureRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignatureRegistry_Signaturevalidator(), this.getSignatureValidator(),
				this.getSignatureValidator_Signatureregistry(), "signaturevalidator", null, 0, 1,
				SignatureRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignatureRegistry_Signature(), ecorePackage.getEJavaObject(), "signature", null, 0, 1,
				SignatureRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getSignatureRegistry__RegisterSignature(), null, "registerSignature", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignature_Id(), ecorePackage.getEByteArray(), "id", null, 0, 1, Signature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignature_Signature(), ecorePackage.getEByteArray(), "signature", null, 0, 1, Signature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecdsaEClass, metaModel.ECDSA.class, "ECDSA", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getECDSA__Recover(), null, "recover", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getECDSA__ToEthSignedMessageHash(), null, "toEthSignedMessageHash", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(token_ManagerEClass, Token_Manager.class, "Token_Manager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToken_Manager_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, Token_Manager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Manager_Name(), ecorePackage.getEString(), "name", null, 0, 1, Token_Manager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Manager_TotalSupply(), ecorePackage.getEInt(), "totalSupply", null, 0, 1,
				Token_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getToken_Manager_Safemath(), this.getSafeMath(), null, "safemath", null, 0, 1,
				Token_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Manager_Balances(), ecorePackage.getEJavaObject(), "balances", null, 0, 1,
				Token_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getToken__Transfer(), null, "Transfer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getToken__Approval(), null, "Approval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getToken__TotalSupply(), null, "totalSupply", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getToken__BalanceOf(), null, "balanceOf", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getToken__TransferFrom(), null, "transferFrom", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getToken__TransferTo(), null, "transferTo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getToken__Approve(), null, "approve", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getToken__Allowance(), null, "allowance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(safeMathEClass, SafeMath.class, "SafeMath", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSafeMath__SafeMul__int_int(), ecorePackage.getEInt(), "safeMul", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSafeMath__SafeDiv__int_int(), ecorePackage.getEInt(), "safeDiv", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSafeMath__SafeAdd__int_int(), ecorePackage.getEInt(), "safeAdd", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSafeMath__SafeSub__int_int(), ecorePackage.getEInt(), "safeSub", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(oracleClientEClass, OracleClient.class, "OracleClient", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOracleClient_OracleRef(), this.getOracle(), null, "oracleRef", null, 0, -1,
				OracleClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOracleClient_RequestRef(), this.getRequest(), null, "requestRef", null, 0, -1,
				OracleClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOracleClient_Buffer(), this.getBuffer(), null, "buffer", null, 0, 1, OracleClient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOracleClient_Registry(), this.getAddressDType(), "registry", null, 0, 1, OracleClient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOracleClient_Link(), this.getAddressDType(), "link", null, 0, 1, OracleClient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOracleClient_Oracle(), this.getAddressDType(), "oracle", null, 0, 1, OracleClient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOracleClient_Request(), ecorePackage.getEInt(), "request", null, 0, 1, OracleClient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOracleClient_Cbor(), this.getCBOR(), null, "cbor", null, 0, 1, OracleClient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOracleClient_PendingRequests(), ecorePackage.getEJavaObject(), "pendingRequests", null, 0, 1,
				OracleClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getOracleClient__EncodeRequest(), null, "encodeRequest", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOracleClient__TokenAddress(), null, "tokenAddress", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOracleClient__BuildRequest(), null, "buildRequest", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOracleClient__SendRequest(), null, "sendRequest", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOracleClient__CancelRequest(), null, "cancelRequest", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOracleClient__SetOracle(), null, "setOracle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOracleClient__SetToken(), null, "setToken", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOracleClient__AddExternalRequest(), null, "addExternalRequest", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOracleClient__UpdateOracle(), null, "updateOracle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOracleClient__ValidateCallback(), null, "validateCallback", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOracleClient__RecordRequestFulfilled(), null, "recordRequestFulfilled", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(oracleEClass, Oracle.class, "Oracle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOracle_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Oracle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOracle_Address(), this.getAddressDType(), "address", null, 0, 1, Oracle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequest_Buffer_manager(), this.getBuffer_Manager(), null, "buffer_manager", null, 0, 1,
				Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Id(), ecorePackage.getEByte(), "id", null, 0, 1, Request.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_CallBackAddress(), this.getAddressDType(), "callBackAddress", null, 0, 1,
				Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Buf(), ecorePackage.getEJavaObject(), "buf", null, 0, 1, Request.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bufferEClass, Buffer.class, "Buffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuffer_Buffer_manager(), this.getBuffer_Manager(), null, "buffer_manager", null, 0, -1,
				Buffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuffer_Buf(), ecorePackage.getEByteArray(), "buf", null, 0, 1, Buffer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuffer_Capacity(), ecorePackage.getEInt(), "capacity", null, 0, 1, Buffer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuffer_Token_manager(), this.getToken_Manager(), null, "token_manager", null, 0, 1,
				Buffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buffer_ManagerEClass, Buffer_Manager.class, "Buffer_Manager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getBuffer_Manager__Resize(), null, "resize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBuffer_Manager__Max(), null, "max", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBuffer_Manager__Write(), null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBuffer_Manager__Truncate(), null, "truncate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBuffer_Manager__Append(), null, "append", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cborEClass, metaModel.CBOR.class, "CBOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCBOR_Buffer_manager(), this.getBuffer_Manager(), null, "buffer_manager", null, 0, 1,
				metaModel.CBOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exchangeEClass, Exchange.class, "Exchange", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExchange_Currency(), this.getCurrency(), null, "currency", null, 0, -1, Exchange.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchange_Selector(), ecorePackage.getEByte(), "selector", null, 0, 1, Exchange.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchange_Reserves(), ecorePackage.getEInt(), "reserves", null, 0, 1, Exchange.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchange_BlockTimeStamp(), ecorePackage.getEInt(), "blockTimeStamp", null, 0, 1,
				Exchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchange_MinimumLiquiduty(), ecorePackage.getEInt(), "minimumLiquiduty", null, 0, 1,
				Exchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchange_Factory(), this.getAddressDType(), "factory", null, 0, 1, Exchange.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchange_Token(), ecorePackage.getEJavaObject(), "token", null, 0, 1, Exchange.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchange_Token_manager(), this.getToken_Manager(), null, "token_manager", null, 0, 1,
				Exchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getExchange__UpdateConversonRates(), null, "updateConversonRates", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExchange__MintFee(), null, "mintFee", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExchange__Mint(), null, "mint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExchange__Burn(), null, "burn", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExchange__Swap(), null, "swap", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExchange__Sync(), null, "sync", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExchange__Initialize(), null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(currencyEClass, Currency.class, "Currency", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrency_Token_manager(), this.getToken_Manager(), null, "token_manager", null, 0, 1,
				Currency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCurrency__GetConversionRate(), null, "getConversionRate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCurrency__Convert(), null, "convert", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(marketplaceEClass, Marketplace.class, "Marketplace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarketplace_Orders(), this.getOrders(), null, "orders", null, 0, -1, Marketplace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketplace_Auctions(), this.getAuction(), null, "auctions", null, 0, -1, Marketplace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketplace_Token(), ecorePackage.getEJavaObject(), "token", null, 0, 1, Marketplace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketplace_PublicationFee(), ecorePackage.getEInt(), "publicationFee", null, 0, 1,
				Marketplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMarketplace_Token_manager(), this.getToken_Manager(), null, "token_manager", null, 0, 1,
				Marketplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketplace_Registry(), ecorePackage.getEJavaObject(), "registry", null, 0, 1,
				Marketplace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getMarketplace__CreateAuction(), null, "createAuction", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMarketplace__CancelAuction(), null, "cancelAuction", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMarketplace__ChangeOwner(), null, "changeOwner", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMarketplace__SetPublicationFee(), null, "setPublicationFee", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMarketplace__CreateOrder(), null, "createOrder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMarketplace__CancelOrder(), null, "cancelOrder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMarketplace__ExecuteOrder(), null, "executeOrder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMarketplace__SetOwnerCut(), null, "setOwnerCut", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ordersEClass, Orders.class, "Orders", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrders_Items(), this.getItem(), null, "items", null, 0, -1, Orders.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOrders_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Orders.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrders_Status(), ecorePackage.getEString(), "status", null, 0, 1, Orders.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrders_Buyer(), this.getAddressDType(), "buyer", null, 0, 1, Orders.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrders_Price(), ecorePackage.getEInt(), "price", null, 0, 1, Orders.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_OrderId(), ecorePackage.getEInt(), "orderId", null, 0, 1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Price(), ecorePackage.getEInt(), "price", null, 0, 1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auctionEClass, Auction.class, "Auction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuction_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Auction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuction_Seller(), this.getAddressDType(), "seller", null, 0, 1, Auction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuction_Price(), ecorePackage.getEInt(), "price", null, 0, 1, Auction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuction_ExpiresAt(), ecorePackage.getEInt(), "expiresAt", null, 0, 1, Auction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liquidation_ManagerEClass, Liquidation_Manager.class, "Liquidation_Manager", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiquidation_Manager_Liquidator(), this.getLiquidator(), null, "liquidator", null, 0, -1,
				Liquidation_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiquidation_Manager_Token_manager(), this.getToken_Manager(), null, "token_manager", null, 0,
				1, Liquidation_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLiquidation_Manager__Mint(), null, "mint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLiquidation_Manager__Bum(), null, "bum", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLiquidation_Manager__UpdateLiquidateFee(), null, "updateLiquidateFee", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(liquidatorEClass, Liquidator.class, "Liquidator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLiquidator__Initiate(), null, "initiate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reserves_ManagerEClass, Reserves_Manager.class, "Reserves_Manager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReserves_Manager_Defi_lending_core(), this.getDeFi_Lending_Core(),
				this.getDeFi_Lending_Core_Reserves_manager(), "defi_lending_core", null, 0, 1, Reserves_Manager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReserves_Manager_Token_manager(), this.getToken_Manager(), null, "token_manager", null, 0, 1,
				Reserves_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReserves_Manager__Activate(), null, "activate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReserves_Manager__Deactivate(), null, "deactivate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReserves_Manager__Freeze(), null, "freeze", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReserves_Manager__Update(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReserves_Manager__Unfreeze(), null, "unfreeze", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deFi_Lending_CoreEClass, DeFi_Lending_Core.class, "DeFi_Lending_Core", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeFi_Lending_Core_Data_provider(), this.getData_Provider(),
				this.getData_Provider_Defi_lending_core(), "data_provider", null, 0, 1, DeFi_Lending_Core.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeFi_Lending_Core_Reserves_manager(), this.getReserves_Manager(),
				this.getReserves_Manager_Defi_lending_core(), "reserves_manager", null, 0, 1, DeFi_Lending_Core.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDeFi_Lending_Core__UpdateState(), null, "updateState", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeFi_Lending_Core__ReservesState(), null, "reservesState", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeFi_Lending_Core__LendingPoolConfigurator(), null, "lendingPoolConfigurator", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeFi_Lending_Core__TransferToUser(), null, "transferToUser", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(data_ProviderEClass, Data_Provider.class, "Data_Provider", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_Provider_Defi_lending_core(), this.getDeFi_Lending_Core(),
				this.getDeFi_Lending_Core_Data_provider(), "defi_lending_core", null, 0, 1, Data_Provider.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Provider_Oracleclient(), this.getOracleClient(), null, "oracleclient", null, 0, 1,
				Data_Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getData_Provider__PriceOracle(), null, "priceOracle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getData_Provider__InterestRate(), null, "interestRate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deFi_Lending_PoolEClass, DeFi_Lending_Pool.class, "DeFi_Lending_Pool", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeFi_Lending_Pool_Defi_user(), this.getDeFi_User(), this.getDeFi_User_Defi_lending_pool(),
				"defi_user", null, 0, -1, DeFi_Lending_Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeFi_Lending_Pool_Defi_lending_core(), this.getDeFi_Lending_Core(), null, "defi_lending_core",
				null, 0, -1, DeFi_Lending_Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeFi_Lending_Pool_LendingPoolAddress(), this.getAddressDType(), "lendingPoolAddress", null, 0,
				1, DeFi_Lending_Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deFi_UserEClass, DeFi_User.class, "DeFi_User", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeFi_User_Defi_lending_pool(), this.getDeFi_Lending_Pool(),
				this.getDeFi_Lending_Pool_Defi_user(), "defi_lending_pool", null, 0, -1, DeFi_User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getDeFi_User__Loan(), null, "loan", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeFi_User__Deposit(), null, "deposit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeFi_User__Borrow(), null, "borrow", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeFi_User__Repay(), null, "repay", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeFi_User__Redeem(), null, "redeem", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeFi_User__Swap(), null, "swap", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeFi_User__Recieve(), null, "recieve", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(addressDTypeEDataType, String.class, "AddressDType", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MetaModelPackageImpl
