/**
 */
package metaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metaModel.MetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface MetaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metaModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaModelPackage eINSTANCE = metaModel.impl.MetaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModel.impl.BlockchainImpl <em>Blockchain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.BlockchainImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getBlockchain()
	 * @generated
	 */
	int BLOCKCHAIN = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN__BLOCK = 0;

	/**
	 * The number of structural features of the '<em>Blockchain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Blockchain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.BlockImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TRANSACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Contracts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTRACTS = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.TransactionImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__USER = 1;

	/**
	 * The feature id for the '<em><b>Signaturevalidator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__SIGNATUREVALIDATOR = 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TO = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__FROM = 4;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__HASH = 5;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.AddressImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TRANSACTION = 0;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CONTRACT = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__USER = 2;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ADDR = 3;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.ContractImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Dapp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__DAPP = 1;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.DAppImpl <em>DApp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.DAppImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getDApp()
	 * @generated
	 */
	int DAPP = 5;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPP__CONTRACT = 0;

	/**
	 * The number of structural features of the '<em>DApp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DApp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.WalletImpl <em>Wallet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.WalletImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getWallet()
	 * @generated
	 */
	int WALLET = 6;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__USER = 0;

	/**
	 * The number of structural features of the '<em>Wallet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Wallet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.UserImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 7;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Wallet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__WALLET = 1;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TRANSACTION = 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.PlayerImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 8;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ADDRESS = CONTRACT__ADDRESS;

	/**
	 * The feature id for the '<em><b>Dapp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__DAPP = CONTRACT__DAPP;

	/**
	 * The feature id for the '<em><b>Gameplayer manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__GAMEPLAYER_MANAGER = CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ID = CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = CONTRACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ADDR = CONTRACT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.GamePlayer_ManagerImpl <em>Game Player Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.GamePlayer_ManagerImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getGamePlayer_Manager()
	 * @generated
	 */
	int GAME_PLAYER_MANAGER = 9;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_MANAGER__PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_MANAGER__ADMIN = 1;

	/**
	 * The feature id for the '<em><b>Players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_MANAGER__PLAYERS = 2;

	/**
	 * The number of structural features of the '<em>Game Player Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_MANAGER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Add Player</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_MANAGER___ADD_PLAYER = 0;

	/**
	 * The operation id for the '<em>Remove Player</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_MANAGER___REMOVE_PLAYER = 1;

	/**
	 * The operation id for the '<em>Edit Player</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_MANAGER___EDIT_PLAYER = 2;

	/**
	 * The operation id for the '<em>Find Player</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_MANAGER___FIND_PLAYER = 3;

	/**
	 * The operation id for the '<em>Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_MANAGER___EXIST = 4;

	/**
	 * The number of operations of the '<em>Game Player Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_MANAGER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link metaModel.impl.GameCoreImpl <em>Game Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.GameCoreImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getGameCore()
	 * @generated
	 */
	int GAME_CORE = 10;

	/**
	 * The feature id for the '<em><b>Gameplayer manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CORE__GAMEPLAYER_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Gameminting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CORE__GAMEMINTING = 1;

	/**
	 * The feature id for the '<em><b>New Player Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CORE__NEW_PLAYER_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Active players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CORE__ACTIVE_PLAYERS = 3;

	/**
	 * The number of structural features of the '<em>Game Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CORE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Set New Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CORE___SET_NEW_ADDRESS = 0;

	/**
	 * The operation id for the '<em>Get Collectible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CORE___GET_COLLECTIBLE = 1;

	/**
	 * The operation id for the '<em>Withdraw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CORE___WITHDRAW = 2;

	/**
	 * The operation id for the '<em>Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CORE___JOIN = 3;

	/**
	 * The operation id for the '<em>Ping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CORE___PING = 4;

	/**
	 * The number of operations of the '<em>Game Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CORE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link metaModel.impl.GameMintingImpl <em>Game Minting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.GameMintingImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getGameMinting()
	 * @generated
	 */
	int GAME_MINTING = 11;

	/**
	 * The feature id for the '<em><b>Promold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MINTING__PROMOLD = 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MINTING__COUNT = 1;

	/**
	 * The feature id for the '<em><b>Auction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MINTING__AUCTION_ID = 2;

	/**
	 * The feature id for the '<em><b>Token manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MINTING__TOKEN_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Game Minting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MINTING_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Compute Net Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MINTING___COMPUTE_NET_PRICE = 0;

	/**
	 * The operation id for the '<em>Create Promo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MINTING___CREATE_PROMO = 1;

	/**
	 * The operation id for the '<em>Create Auction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MINTING___CREATE_AUCTION = 2;

	/**
	 * The number of operations of the '<em>Game Minting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MINTING_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link metaModel.impl.SignatureValidatorImpl <em>Signature Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.SignatureValidatorImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getSignatureValidator()
	 * @generated
	 */
	int SIGNATURE_VALIDATOR = 12;

	/**
	 * The feature id for the '<em><b>Signatureregistry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_VALIDATOR__SIGNATUREREGISTRY = 0;

	/**
	 * The feature id for the '<em><b>Ecdsa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_VALIDATOR__ECDSA = 1;

	/**
	 * The number of structural features of the '<em>Signature Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_VALIDATOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Require Valid Signature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_VALIDATOR___REQUIRE_VALID_SIGNATURE = 0;

	/**
	 * The operation id for the '<em>Calculate Signature Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_VALIDATOR___CALCULATE_SIGNATURE_HASH = 1;

	/**
	 * The operation id for the '<em>Validate Signature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_VALIDATOR___VALIDATE_SIGNATURE = 2;

	/**
	 * The number of operations of the '<em>Signature Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_VALIDATOR_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link metaModel.impl.SignatureRegistryImpl <em>Signature Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.SignatureRegistryImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getSignatureRegistry()
	 * @generated
	 */
	int SIGNATURE_REGISTRY = 13;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_REGISTRY__SIGNATURES = 0;

	/**
	 * The feature id for the '<em><b>Signaturevalidator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_REGISTRY__SIGNATUREVALIDATOR = 1;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_REGISTRY__SIGNATURE = 2;

	/**
	 * The number of structural features of the '<em>Signature Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_REGISTRY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Register Signature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_REGISTRY___REGISTER_SIGNATURE = 0;

	/**
	 * The number of operations of the '<em>Signature Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_REGISTRY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link metaModel.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.SignatureImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__SIGNATURE = 1;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.ECDSAImpl <em>ECDSA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.ECDSAImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getECDSA()
	 * @generated
	 */
	int ECDSA = 15;

	/**
	 * The number of structural features of the '<em>ECDSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECDSA_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Recover</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECDSA___RECOVER = 0;

	/**
	 * The operation id for the '<em>To Eth Signed Message Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECDSA___TO_ETH_SIGNED_MESSAGE_HASH = 1;

	/**
	 * The number of operations of the '<em>ECDSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECDSA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link metaModel.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.TokenImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 17;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___TRANSFER = 0;

	/**
	 * The operation id for the '<em>Approval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___APPROVAL = 1;

	/**
	 * The operation id for the '<em>Total Supply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___TOTAL_SUPPLY = 2;

	/**
	 * The operation id for the '<em>Balance Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___BALANCE_OF = 3;

	/**
	 * The operation id for the '<em>Transfer From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___TRANSFER_FROM = 4;

	/**
	 * The operation id for the '<em>Transfer To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___TRANSFER_TO = 5;

	/**
	 * The operation id for the '<em>Approve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___APPROVE = 6;

	/**
	 * The operation id for the '<em>Allowance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___ALLOWANCE = 7;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link metaModel.impl.Token_ManagerImpl <em>Token Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.Token_ManagerImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getToken_Manager()
	 * @generated
	 */
	int TOKEN_MANAGER = 16;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER__ADDRESS = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dapp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER__DAPP = TOKEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER__SYMBOL = TOKEN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER__NAME = TOKEN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Total Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER__TOTAL_SUPPLY = TOKEN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Safemath</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER__SAFEMATH = TOKEN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Balances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER__BALANCES = TOKEN_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Token Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER___TRANSFER = TOKEN___TRANSFER;

	/**
	 * The operation id for the '<em>Approval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER___APPROVAL = TOKEN___APPROVAL;

	/**
	 * The operation id for the '<em>Total Supply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER___TOTAL_SUPPLY = TOKEN___TOTAL_SUPPLY;

	/**
	 * The operation id for the '<em>Balance Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER___BALANCE_OF = TOKEN___BALANCE_OF;

	/**
	 * The operation id for the '<em>Transfer From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER___TRANSFER_FROM = TOKEN___TRANSFER_FROM;

	/**
	 * The operation id for the '<em>Transfer To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER___TRANSFER_TO = TOKEN___TRANSFER_TO;

	/**
	 * The operation id for the '<em>Approve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER___APPROVE = TOKEN___APPROVE;

	/**
	 * The operation id for the '<em>Allowance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER___ALLOWANCE = TOKEN___ALLOWANCE;

	/**
	 * The number of operations of the '<em>Token Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MANAGER_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.SafeMathImpl <em>Safe Math</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.SafeMathImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getSafeMath()
	 * @generated
	 */
	int SAFE_MATH = 18;

	/**
	 * The number of structural features of the '<em>Safe Math</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_MATH_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Safe Mul</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_MATH___SAFE_MUL__INT_INT = 0;

	/**
	 * The operation id for the '<em>Safe Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_MATH___SAFE_DIV__INT_INT = 1;

	/**
	 * The operation id for the '<em>Safe Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_MATH___SAFE_ADD__INT_INT = 2;

	/**
	 * The operation id for the '<em>Safe Sub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_MATH___SAFE_SUB__INT_INT = 3;

	/**
	 * The number of operations of the '<em>Safe Math</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_MATH_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link metaModel.impl.OracleClientImpl <em>Oracle Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.OracleClientImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getOracleClient()
	 * @generated
	 */
	int ORACLE_CLIENT = 19;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT__ADDRESS = CONTRACT__ADDRESS;

	/**
	 * The feature id for the '<em><b>Dapp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT__DAPP = CONTRACT__DAPP;

	/**
	 * The feature id for the '<em><b>Oracle Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT__ORACLE_REF = CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Request Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT__REQUEST_REF = CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT__BUFFER = CONTRACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT__REGISTRY = CONTRACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT__LINK = CONTRACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Oracle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT__ORACLE = CONTRACT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT__REQUEST = CONTRACT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cbor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT__CBOR = CONTRACT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pending Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT__PENDING_REQUESTS = CONTRACT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Oracle Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Encode Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT___ENCODE_REQUEST = CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Token Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT___TOKEN_ADDRESS = CONTRACT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Build Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT___BUILD_REQUEST = CONTRACT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT___SEND_REQUEST = CONTRACT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Cancel Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT___CANCEL_REQUEST = CONTRACT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Oracle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT___SET_ORACLE = CONTRACT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Set Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT___SET_TOKEN = CONTRACT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Add External Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT___ADD_EXTERNAL_REQUEST = CONTRACT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Update Oracle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT___UPDATE_ORACLE = CONTRACT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Validate Callback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT___VALIDATE_CALLBACK = CONTRACT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Record Request Fulfilled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT___RECORD_REQUEST_FULFILLED = CONTRACT_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Oracle Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_CLIENT_OPERATION_COUNT = CONTRACT_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link metaModel.impl.OracleImpl <em>Oracle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.OracleImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getOracle()
	 * @generated
	 */
	int ORACLE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE__ADDRESS = 1;

	/**
	 * The number of structural features of the '<em>Oracle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Oracle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.RequestImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 21;

	/**
	 * The feature id for the '<em><b>Buffer manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__BUFFER_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ID = 1;

	/**
	 * The feature id for the '<em><b>Call Back Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__CALL_BACK_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Buf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__BUF = 3;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.BufferImpl <em>Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.BufferImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getBuffer()
	 * @generated
	 */
	int BUFFER = 22;

	/**
	 * The feature id for the '<em><b>Buffer manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__BUFFER_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Buf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__BUF = 1;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__CAPACITY = 2;

	/**
	 * The feature id for the '<em><b>Token manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__TOKEN_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.Buffer_ManagerImpl <em>Buffer Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.Buffer_ManagerImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getBuffer_Manager()
	 * @generated
	 */
	int BUFFER_MANAGER = 23;

	/**
	 * The number of structural features of the '<em>Buffer Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MANAGER___RESIZE = 0;

	/**
	 * The operation id for the '<em>Max</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MANAGER___MAX = 1;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MANAGER___WRITE = 2;

	/**
	 * The operation id for the '<em>Truncate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MANAGER___TRUNCATE = 3;

	/**
	 * The operation id for the '<em>Append</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MANAGER___APPEND = 4;

	/**
	 * The number of operations of the '<em>Buffer Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MANAGER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link metaModel.impl.CBORImpl <em>CBOR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.CBORImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getCBOR()
	 * @generated
	 */
	int CBOR = 24;

	/**
	 * The feature id for the '<em><b>Buffer manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBOR__BUFFER_MANAGER = 0;

	/**
	 * The number of structural features of the '<em>CBOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CBOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.ExchangeImpl <em>Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.ExchangeImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getExchange()
	 * @generated
	 */
	int EXCHANGE = 25;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__ADDRESS = CONTRACT__ADDRESS;

	/**
	 * The feature id for the '<em><b>Dapp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__DAPP = CONTRACT__DAPP;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__CURRENCY = CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__SELECTOR = CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reserves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__RESERVES = CONTRACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Block Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__BLOCK_TIME_STAMP = CONTRACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minimum Liquiduty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__MINIMUM_LIQUIDUTY = CONTRACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__FACTORY = CONTRACT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__TOKEN = CONTRACT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Token manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__TOKEN_MANAGER = CONTRACT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Update Converson Rates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE___UPDATE_CONVERSON_RATES = CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Mint Fee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE___MINT_FEE = CONTRACT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Mint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE___MINT = CONTRACT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Burn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE___BURN = CONTRACT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Swap</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE___SWAP = CONTRACT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Sync</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE___SYNC = CONTRACT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE___INITIALIZE = CONTRACT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_OPERATION_COUNT = CONTRACT_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link metaModel.impl.CurrencyImpl <em>Currency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.CurrencyImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 26;

	/**
	 * The feature id for the '<em><b>Token manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY__TOKEN_MANAGER = 0;

	/**
	 * The number of structural features of the '<em>Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Conversion Rate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY___GET_CONVERSION_RATE = 0;

	/**
	 * The operation id for the '<em>Convert</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY___CONVERT = 1;

	/**
	 * The number of operations of the '<em>Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link metaModel.impl.MarketplaceImpl <em>Marketplace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.MarketplaceImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getMarketplace()
	 * @generated
	 */
	int MARKETPLACE = 27;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__ADDRESS = CONTRACT__ADDRESS;

	/**
	 * The feature id for the '<em><b>Dapp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__DAPP = CONTRACT__DAPP;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__ORDERS = CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__AUCTIONS = CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__TOKEN = CONTRACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Publication Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__PUBLICATION_FEE = CONTRACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Token manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__TOKEN_MANAGER = CONTRACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__REGISTRY = CONTRACT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Marketplace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Create Auction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE___CREATE_AUCTION = CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Cancel Auction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE___CANCEL_AUCTION = CONTRACT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Change Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE___CHANGE_OWNER = CONTRACT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Publication Fee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE___SET_PUBLICATION_FEE = CONTRACT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Create Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE___CREATE_ORDER = CONTRACT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Cancel Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE___CANCEL_ORDER = CONTRACT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Execute Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE___EXECUTE_ORDER = CONTRACT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Owner Cut</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE___SET_OWNER_CUT = CONTRACT_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Marketplace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE_OPERATION_COUNT = CONTRACT_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link metaModel.impl.OrdersImpl <em>Orders</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.OrdersImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getOrders()
	 * @generated
	 */
	int ORDERS = 28;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS__ID = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Buyer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS__BUYER = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS__PRICE = 4;

	/**
	 * The number of structural features of the '<em>Orders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Orders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.ItemImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ORDER_ID = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PRICE = 3;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.AuctionImpl <em>Auction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.AuctionImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getAuction()
	 * @generated
	 */
	int AUCTION = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUCTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Seller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUCTION__SELLER = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUCTION__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Expires At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUCTION__EXPIRES_AT = 3;

	/**
	 * The number of structural features of the '<em>Auction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUCTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Auction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.Liquidation_ManagerImpl <em>Liquidation Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.Liquidation_ManagerImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getLiquidation_Manager()
	 * @generated
	 */
	int LIQUIDATION_MANAGER = 31;

	/**
	 * The feature id for the '<em><b>Liquidator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDATION_MANAGER__LIQUIDATOR = 0;

	/**
	 * The feature id for the '<em><b>Token manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDATION_MANAGER__TOKEN_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>Liquidation Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDATION_MANAGER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Mint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDATION_MANAGER___MINT = 0;

	/**
	 * The operation id for the '<em>Bum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDATION_MANAGER___BUM = 1;

	/**
	 * The operation id for the '<em>Update Liquidate Fee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDATION_MANAGER___UPDATE_LIQUIDATE_FEE = 2;

	/**
	 * The number of operations of the '<em>Liquidation Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDATION_MANAGER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link metaModel.impl.LiquidatorImpl <em>Liquidator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.LiquidatorImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getLiquidator()
	 * @generated
	 */
	int LIQUIDATOR = 32;

	/**
	 * The number of structural features of the '<em>Liquidator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDATOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Initiate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDATOR___INITIATE = 0;

	/**
	 * The number of operations of the '<em>Liquidator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDATOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link metaModel.impl.Reserves_ManagerImpl <em>Reserves Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.Reserves_ManagerImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getReserves_Manager()
	 * @generated
	 */
	int RESERVES_MANAGER = 33;

	/**
	 * The feature id for the '<em><b>Defi lending core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVES_MANAGER__DEFI_LENDING_CORE = 0;

	/**
	 * The feature id for the '<em><b>Token manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVES_MANAGER__TOKEN_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>Reserves Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVES_MANAGER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Activate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVES_MANAGER___ACTIVATE = 0;

	/**
	 * The operation id for the '<em>Deactivate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVES_MANAGER___DEACTIVATE = 1;

	/**
	 * The operation id for the '<em>Freeze</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVES_MANAGER___FREEZE = 2;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVES_MANAGER___UPDATE = 3;

	/**
	 * The operation id for the '<em>Unfreeze</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVES_MANAGER___UNFREEZE = 4;

	/**
	 * The number of operations of the '<em>Reserves Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVES_MANAGER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link metaModel.impl.DeFi_Lending_CoreImpl <em>De Fi Lending Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.DeFi_Lending_CoreImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getDeFi_Lending_Core()
	 * @generated
	 */
	int DE_FI_LENDING_CORE = 34;

	/**
	 * The feature id for the '<em><b>Data provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_LENDING_CORE__DATA_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Reserves manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_LENDING_CORE__RESERVES_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>De Fi Lending Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_LENDING_CORE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Update State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_LENDING_CORE___UPDATE_STATE = 0;

	/**
	 * The operation id for the '<em>Reserves State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_LENDING_CORE___RESERVES_STATE = 1;

	/**
	 * The operation id for the '<em>Lending Pool Configurator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_LENDING_CORE___LENDING_POOL_CONFIGURATOR = 2;

	/**
	 * The operation id for the '<em>Transfer To User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_LENDING_CORE___TRANSFER_TO_USER = 3;

	/**
	 * The number of operations of the '<em>De Fi Lending Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_LENDING_CORE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link metaModel.impl.Data_ProviderImpl <em>Data Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.Data_ProviderImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getData_Provider()
	 * @generated
	 */
	int DATA_PROVIDER = 35;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__ADDRESS = ORACLE_CLIENT__ADDRESS;

	/**
	 * The feature id for the '<em><b>Dapp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__DAPP = ORACLE_CLIENT__DAPP;

	/**
	 * The feature id for the '<em><b>Oracle Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__ORACLE_REF = ORACLE_CLIENT__ORACLE_REF;

	/**
	 * The feature id for the '<em><b>Request Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__REQUEST_REF = ORACLE_CLIENT__REQUEST_REF;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__BUFFER = ORACLE_CLIENT__BUFFER;

	/**
	 * The feature id for the '<em><b>Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__REGISTRY = ORACLE_CLIENT__REGISTRY;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__LINK = ORACLE_CLIENT__LINK;

	/**
	 * The feature id for the '<em><b>Oracle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__ORACLE = ORACLE_CLIENT__ORACLE;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__REQUEST = ORACLE_CLIENT__REQUEST;

	/**
	 * The feature id for the '<em><b>Cbor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__CBOR = ORACLE_CLIENT__CBOR;

	/**
	 * The feature id for the '<em><b>Pending Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__PENDING_REQUESTS = ORACLE_CLIENT__PENDING_REQUESTS;

	/**
	 * The feature id for the '<em><b>Defi lending core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__DEFI_LENDING_CORE = ORACLE_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Oracleclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__ORACLECLIENT = ORACLE_CLIENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER_FEATURE_COUNT = ORACLE_CLIENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Encode Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER___ENCODE_REQUEST = ORACLE_CLIENT___ENCODE_REQUEST;

	/**
	 * The operation id for the '<em>Token Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER___TOKEN_ADDRESS = ORACLE_CLIENT___TOKEN_ADDRESS;

	/**
	 * The operation id for the '<em>Build Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER___BUILD_REQUEST = ORACLE_CLIENT___BUILD_REQUEST;

	/**
	 * The operation id for the '<em>Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER___SEND_REQUEST = ORACLE_CLIENT___SEND_REQUEST;

	/**
	 * The operation id for the '<em>Cancel Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER___CANCEL_REQUEST = ORACLE_CLIENT___CANCEL_REQUEST;

	/**
	 * The operation id for the '<em>Set Oracle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER___SET_ORACLE = ORACLE_CLIENT___SET_ORACLE;

	/**
	 * The operation id for the '<em>Set Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER___SET_TOKEN = ORACLE_CLIENT___SET_TOKEN;

	/**
	 * The operation id for the '<em>Add External Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER___ADD_EXTERNAL_REQUEST = ORACLE_CLIENT___ADD_EXTERNAL_REQUEST;

	/**
	 * The operation id for the '<em>Update Oracle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER___UPDATE_ORACLE = ORACLE_CLIENT___UPDATE_ORACLE;

	/**
	 * The operation id for the '<em>Validate Callback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER___VALIDATE_CALLBACK = ORACLE_CLIENT___VALIDATE_CALLBACK;

	/**
	 * The operation id for the '<em>Record Request Fulfilled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER___RECORD_REQUEST_FULFILLED = ORACLE_CLIENT___RECORD_REQUEST_FULFILLED;

	/**
	 * The operation id for the '<em>Price Oracle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER___PRICE_ORACLE = ORACLE_CLIENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Interest Rate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER___INTEREST_RATE = ORACLE_CLIENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER_OPERATION_COUNT = ORACLE_CLIENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link metaModel.impl.DeFi_Lending_PoolImpl <em>De Fi Lending Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.DeFi_Lending_PoolImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getDeFi_Lending_Pool()
	 * @generated
	 */
	int DE_FI_LENDING_POOL = 36;

	/**
	 * The feature id for the '<em><b>Defi user</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_LENDING_POOL__DEFI_USER = 0;

	/**
	 * The feature id for the '<em><b>Defi lending core</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_LENDING_POOL__DEFI_LENDING_CORE = 1;

	/**
	 * The feature id for the '<em><b>Lending Pool Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_LENDING_POOL__LENDING_POOL_ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>De Fi Lending Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_LENDING_POOL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>De Fi Lending Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_LENDING_POOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.DeFi_UserImpl <em>De Fi User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.DeFi_UserImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getDeFi_User()
	 * @generated
	 */
	int DE_FI_USER = 37;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_USER__ADDRESS = CONTRACT__ADDRESS;

	/**
	 * The feature id for the '<em><b>Dapp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_USER__DAPP = CONTRACT__DAPP;

	/**
	 * The feature id for the '<em><b>Defi lending pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_USER__DEFI_LENDING_POOL = CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>De Fi User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_USER_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Loan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_USER___LOAN = CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Deposit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_USER___DEPOSIT = CONTRACT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Borrow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_USER___BORROW = CONTRACT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Repay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_USER___REPAY = CONTRACT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Redeem</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_USER___REDEEM = CONTRACT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Swap</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_USER___SWAP = CONTRACT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Recieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_USER___RECIEVE = CONTRACT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>De Fi User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_FI_USER_OPERATION_COUNT = CONTRACT_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '<em>Address DType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see metaModel.impl.MetaModelPackageImpl#getAddressDType()
	 * @generated
	 */
	int ADDRESS_DTYPE = 38;

	/**
	 * Returns the meta object for class '{@link metaModel.Blockchain <em>Blockchain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blockchain</em>'.
	 * @see metaModel.Blockchain
	 * @generated
	 */
	EClass getBlockchain();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Blockchain#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see metaModel.Blockchain#getBlock()
	 * @see #getBlockchain()
	 * @generated
	 */
	EReference getBlockchain_Block();

	/**
	 * Returns the meta object for class '{@link metaModel.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see metaModel.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Block#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transactions</em>'.
	 * @see metaModel.Block#getTransactions()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Transactions();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Block#getContracts <em>Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contracts</em>'.
	 * @see metaModel.Block#getContracts()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Contracts();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Block#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see metaModel.Block#getAddress()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Address();

	/**
	 * Returns the meta object for class '{@link metaModel.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see metaModel.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Transaction#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see metaModel.Transaction#getAddress()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Address();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Transaction#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see metaModel.Transaction#getUser()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_User();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Transaction#getSignaturevalidator <em>Signaturevalidator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signaturevalidator</em>'.
	 * @see metaModel.Transaction#getSignaturevalidator()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Signaturevalidator();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Transaction#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see metaModel.Transaction#getTo()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_To();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Transaction#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see metaModel.Transaction#getFrom()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_From();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Transaction#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see metaModel.Transaction#getHash()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Hash();

	/**
	 * Returns the meta object for class '{@link metaModel.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see metaModel.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Address#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transaction</em>'.
	 * @see metaModel.Address#getTransaction()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Transaction();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Address#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contract</em>'.
	 * @see metaModel.Address#getContract()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Contract();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Address#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see metaModel.Address#getUser()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_User();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Address#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see metaModel.Address#getAddr()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Addr();

	/**
	 * Returns the meta object for class '{@link metaModel.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see metaModel.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Contract#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see metaModel.Contract#getAddress()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Address();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Contract#getDapp <em>Dapp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dapp</em>'.
	 * @see metaModel.Contract#getDapp()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Dapp();

	/**
	 * Returns the meta object for class '{@link metaModel.DApp <em>DApp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DApp</em>'.
	 * @see metaModel.DApp
	 * @generated
	 */
	EClass getDApp();

	/**
	 * Returns the meta object for the reference '{@link metaModel.DApp#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contract</em>'.
	 * @see metaModel.DApp#getContract()
	 * @see #getDApp()
	 * @generated
	 */
	EReference getDApp_Contract();

	/**
	 * Returns the meta object for class '{@link metaModel.Wallet <em>Wallet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wallet</em>'.
	 * @see metaModel.Wallet
	 * @generated
	 */
	EClass getWallet();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Wallet#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see metaModel.Wallet#getUser()
	 * @see #getWallet()
	 * @generated
	 */
	EReference getWallet_User();

	/**
	 * Returns the meta object for class '{@link metaModel.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see metaModel.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference '{@link metaModel.User#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see metaModel.User#getAddress()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Address();

	/**
	 * Returns the meta object for the reference '{@link metaModel.User#getWallet <em>Wallet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wallet</em>'.
	 * @see metaModel.User#getWallet()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Wallet();

	/**
	 * Returns the meta object for the reference '{@link metaModel.User#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transaction</em>'.
	 * @see metaModel.User#getTransaction()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Transaction();

	/**
	 * Returns the meta object for class '{@link metaModel.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see metaModel.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Player#getGameplayer_manager <em>Gameplayer manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gameplayer manager</em>'.
	 * @see metaModel.Player#getGameplayer_manager()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Gameplayer_manager();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Player#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metaModel.Player#getId()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Id();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaModel.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Player#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see metaModel.Player#getAddr()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Addr();

	/**
	 * Returns the meta object for class '{@link metaModel.GamePlayer_Manager <em>Game Player Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Player Manager</em>'.
	 * @see metaModel.GamePlayer_Manager
	 * @generated
	 */
	EClass getGamePlayer_Manager();

	/**
	 * Returns the meta object for the reference '{@link metaModel.GamePlayer_Manager#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see metaModel.GamePlayer_Manager#getPlayer()
	 * @see #getGamePlayer_Manager()
	 * @generated
	 */
	EReference getGamePlayer_Manager_Player();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.GamePlayer_Manager#getAdmin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin</em>'.
	 * @see metaModel.GamePlayer_Manager#getAdmin()
	 * @see #getGamePlayer_Manager()
	 * @generated
	 */
	EAttribute getGamePlayer_Manager_Admin();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.GamePlayer_Manager#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Players</em>'.
	 * @see metaModel.GamePlayer_Manager#getPlayers()
	 * @see #getGamePlayer_Manager()
	 * @generated
	 */
	EAttribute getGamePlayer_Manager_Players();

	/**
	 * Returns the meta object for the '{@link metaModel.GamePlayer_Manager#addPlayer() <em>Add Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Player</em>' operation.
	 * @see metaModel.GamePlayer_Manager#addPlayer()
	 * @generated
	 */
	EOperation getGamePlayer_Manager__AddPlayer();

	/**
	 * Returns the meta object for the '{@link metaModel.GamePlayer_Manager#removePlayer() <em>Remove Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Player</em>' operation.
	 * @see metaModel.GamePlayer_Manager#removePlayer()
	 * @generated
	 */
	EOperation getGamePlayer_Manager__RemovePlayer();

	/**
	 * Returns the meta object for the '{@link metaModel.GamePlayer_Manager#editPlayer() <em>Edit Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Player</em>' operation.
	 * @see metaModel.GamePlayer_Manager#editPlayer()
	 * @generated
	 */
	EOperation getGamePlayer_Manager__EditPlayer();

	/**
	 * Returns the meta object for the '{@link metaModel.GamePlayer_Manager#findPlayer() <em>Find Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Player</em>' operation.
	 * @see metaModel.GamePlayer_Manager#findPlayer()
	 * @generated
	 */
	EOperation getGamePlayer_Manager__FindPlayer();

	/**
	 * Returns the meta object for the '{@link metaModel.GamePlayer_Manager#exist() <em>Exist</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exist</em>' operation.
	 * @see metaModel.GamePlayer_Manager#exist()
	 * @generated
	 */
	EOperation getGamePlayer_Manager__Exist();

	/**
	 * Returns the meta object for class '{@link metaModel.GameCore <em>Game Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Core</em>'.
	 * @see metaModel.GameCore
	 * @generated
	 */
	EClass getGameCore();

	/**
	 * Returns the meta object for the reference '{@link metaModel.GameCore#getGameplayer_manager <em>Gameplayer manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gameplayer manager</em>'.
	 * @see metaModel.GameCore#getGameplayer_manager()
	 * @see #getGameCore()
	 * @generated
	 */
	EReference getGameCore_Gameplayer_manager();

	/**
	 * Returns the meta object for the reference '{@link metaModel.GameCore#getGameminting <em>Gameminting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gameminting</em>'.
	 * @see metaModel.GameCore#getGameminting()
	 * @see #getGameCore()
	 * @generated
	 */
	EReference getGameCore_Gameminting();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.GameCore#getNewPlayerAddress <em>New Player Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Player Address</em>'.
	 * @see metaModel.GameCore#getNewPlayerAddress()
	 * @see #getGameCore()
	 * @generated
	 */
	EAttribute getGameCore_NewPlayerAddress();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.GameCore#getActive_players <em>Active players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active players</em>'.
	 * @see metaModel.GameCore#getActive_players()
	 * @see #getGameCore()
	 * @generated
	 */
	EAttribute getGameCore_Active_players();

	/**
	 * Returns the meta object for the '{@link metaModel.GameCore#setNewAddress() <em>Set New Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set New Address</em>' operation.
	 * @see metaModel.GameCore#setNewAddress()
	 * @generated
	 */
	EOperation getGameCore__SetNewAddress();

	/**
	 * Returns the meta object for the '{@link metaModel.GameCore#getCollectible() <em>Get Collectible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Collectible</em>' operation.
	 * @see metaModel.GameCore#getCollectible()
	 * @generated
	 */
	EOperation getGameCore__GetCollectible();

	/**
	 * Returns the meta object for the '{@link metaModel.GameCore#withdraw() <em>Withdraw</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Withdraw</em>' operation.
	 * @see metaModel.GameCore#withdraw()
	 * @generated
	 */
	EOperation getGameCore__Withdraw();

	/**
	 * Returns the meta object for the '{@link metaModel.GameCore#join() <em>Join</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Join</em>' operation.
	 * @see metaModel.GameCore#join()
	 * @generated
	 */
	EOperation getGameCore__Join();

	/**
	 * Returns the meta object for the '{@link metaModel.GameCore#ping() <em>Ping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ping</em>' operation.
	 * @see metaModel.GameCore#ping()
	 * @generated
	 */
	EOperation getGameCore__Ping();

	/**
	 * Returns the meta object for class '{@link metaModel.GameMinting <em>Game Minting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Minting</em>'.
	 * @see metaModel.GameMinting
	 * @generated
	 */
	EClass getGameMinting();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.GameMinting#getPromold <em>Promold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Promold</em>'.
	 * @see metaModel.GameMinting#getPromold()
	 * @see #getGameMinting()
	 * @generated
	 */
	EAttribute getGameMinting_Promold();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.GameMinting#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see metaModel.GameMinting#getCount()
	 * @see #getGameMinting()
	 * @generated
	 */
	EAttribute getGameMinting_Count();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.GameMinting#getAuctionId <em>Auction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auction Id</em>'.
	 * @see metaModel.GameMinting#getAuctionId()
	 * @see #getGameMinting()
	 * @generated
	 */
	EAttribute getGameMinting_AuctionId();

	/**
	 * Returns the meta object for the reference '{@link metaModel.GameMinting#getToken_manager <em>Token manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token manager</em>'.
	 * @see metaModel.GameMinting#getToken_manager()
	 * @see #getGameMinting()
	 * @generated
	 */
	EReference getGameMinting_Token_manager();

	/**
	 * Returns the meta object for the '{@link metaModel.GameMinting#computeNetPrice() <em>Compute Net Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Net Price</em>' operation.
	 * @see metaModel.GameMinting#computeNetPrice()
	 * @generated
	 */
	EOperation getGameMinting__ComputeNetPrice();

	/**
	 * Returns the meta object for the '{@link metaModel.GameMinting#createPromo() <em>Create Promo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Promo</em>' operation.
	 * @see metaModel.GameMinting#createPromo()
	 * @generated
	 */
	EOperation getGameMinting__CreatePromo();

	/**
	 * Returns the meta object for the '{@link metaModel.GameMinting#createAuction() <em>Create Auction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Auction</em>' operation.
	 * @see metaModel.GameMinting#createAuction()
	 * @generated
	 */
	EOperation getGameMinting__CreateAuction();

	/**
	 * Returns the meta object for class '{@link metaModel.SignatureValidator <em>Signature Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Validator</em>'.
	 * @see metaModel.SignatureValidator
	 * @generated
	 */
	EClass getSignatureValidator();

	/**
	 * Returns the meta object for the reference '{@link metaModel.SignatureValidator#getSignatureregistry <em>Signatureregistry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signatureregistry</em>'.
	 * @see metaModel.SignatureValidator#getSignatureregistry()
	 * @see #getSignatureValidator()
	 * @generated
	 */
	EReference getSignatureValidator_Signatureregistry();

	/**
	 * Returns the meta object for the reference '{@link metaModel.SignatureValidator#getEcdsa <em>Ecdsa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecdsa</em>'.
	 * @see metaModel.SignatureValidator#getEcdsa()
	 * @see #getSignatureValidator()
	 * @generated
	 */
	EReference getSignatureValidator_Ecdsa();

	/**
	 * Returns the meta object for the '{@link metaModel.SignatureValidator#requireValidSignature() <em>Require Valid Signature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Require Valid Signature</em>' operation.
	 * @see metaModel.SignatureValidator#requireValidSignature()
	 * @generated
	 */
	EOperation getSignatureValidator__RequireValidSignature();

	/**
	 * Returns the meta object for the '{@link metaModel.SignatureValidator#calculateSignatureHash() <em>Calculate Signature Hash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Signature Hash</em>' operation.
	 * @see metaModel.SignatureValidator#calculateSignatureHash()
	 * @generated
	 */
	EOperation getSignatureValidator__CalculateSignatureHash();

	/**
	 * Returns the meta object for the '{@link metaModel.SignatureValidator#validateSignature() <em>Validate Signature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Signature</em>' operation.
	 * @see metaModel.SignatureValidator#validateSignature()
	 * @generated
	 */
	EOperation getSignatureValidator__ValidateSignature();

	/**
	 * Returns the meta object for class '{@link metaModel.SignatureRegistry <em>Signature Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Registry</em>'.
	 * @see metaModel.SignatureRegistry
	 * @generated
	 */
	EClass getSignatureRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.SignatureRegistry#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures</em>'.
	 * @see metaModel.SignatureRegistry#getSignatures()
	 * @see #getSignatureRegistry()
	 * @generated
	 */
	EReference getSignatureRegistry_Signatures();

	/**
	 * Returns the meta object for the reference '{@link metaModel.SignatureRegistry#getSignaturevalidator <em>Signaturevalidator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signaturevalidator</em>'.
	 * @see metaModel.SignatureRegistry#getSignaturevalidator()
	 * @see #getSignatureRegistry()
	 * @generated
	 */
	EReference getSignatureRegistry_Signaturevalidator();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.SignatureRegistry#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see metaModel.SignatureRegistry#getSignature()
	 * @see #getSignatureRegistry()
	 * @generated
	 */
	EAttribute getSignatureRegistry_Signature();

	/**
	 * Returns the meta object for the '{@link metaModel.SignatureRegistry#registerSignature() <em>Register Signature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Signature</em>' operation.
	 * @see metaModel.SignatureRegistry#registerSignature()
	 * @generated
	 */
	EOperation getSignatureRegistry__RegisterSignature();

	/**
	 * Returns the meta object for class '{@link metaModel.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see metaModel.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Signature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metaModel.Signature#getId()
	 * @see #getSignature()
	 * @generated
	 */
	EAttribute getSignature_Id();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Signature#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see metaModel.Signature#getSignature()
	 * @see #getSignature()
	 * @generated
	 */
	EAttribute getSignature_Signature();

	/**
	 * Returns the meta object for class '{@link metaModel.ECDSA <em>ECDSA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECDSA</em>'.
	 * @see metaModel.ECDSA
	 * @generated
	 */
	EClass getECDSA();

	/**
	 * Returns the meta object for the '{@link metaModel.ECDSA#recover() <em>Recover</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Recover</em>' operation.
	 * @see metaModel.ECDSA#recover()
	 * @generated
	 */
	EOperation getECDSA__Recover();

	/**
	 * Returns the meta object for the '{@link metaModel.ECDSA#toEthSignedMessageHash() <em>To Eth Signed Message Hash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Eth Signed Message Hash</em>' operation.
	 * @see metaModel.ECDSA#toEthSignedMessageHash()
	 * @generated
	 */
	EOperation getECDSA__ToEthSignedMessageHash();

	/**
	 * Returns the meta object for class '{@link metaModel.Token_Manager <em>Token Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Manager</em>'.
	 * @see metaModel.Token_Manager
	 * @generated
	 */
	EClass getToken_Manager();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Token_Manager#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see metaModel.Token_Manager#getSymbol()
	 * @see #getToken_Manager()
	 * @generated
	 */
	EAttribute getToken_Manager_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Token_Manager#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaModel.Token_Manager#getName()
	 * @see #getToken_Manager()
	 * @generated
	 */
	EAttribute getToken_Manager_Name();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Token_Manager#getTotalSupply <em>Total Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Supply</em>'.
	 * @see metaModel.Token_Manager#getTotalSupply()
	 * @see #getToken_Manager()
	 * @generated
	 */
	EAttribute getToken_Manager_TotalSupply();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Token_Manager#getSafemath <em>Safemath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Safemath</em>'.
	 * @see metaModel.Token_Manager#getSafemath()
	 * @see #getToken_Manager()
	 * @generated
	 */
	EReference getToken_Manager_Safemath();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Token_Manager#getBalances <em>Balances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balances</em>'.
	 * @see metaModel.Token_Manager#getBalances()
	 * @see #getToken_Manager()
	 * @generated
	 */
	EAttribute getToken_Manager_Balances();

	/**
	 * Returns the meta object for class '{@link metaModel.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see metaModel.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the '{@link metaModel.Token#Transfer() <em>Transfer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfer</em>' operation.
	 * @see metaModel.Token#Transfer()
	 * @generated
	 */
	EOperation getToken__Transfer();

	/**
	 * Returns the meta object for the '{@link metaModel.Token#Approval() <em>Approval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Approval</em>' operation.
	 * @see metaModel.Token#Approval()
	 * @generated
	 */
	EOperation getToken__Approval();

	/**
	 * Returns the meta object for the '{@link metaModel.Token#totalSupply() <em>Total Supply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Total Supply</em>' operation.
	 * @see metaModel.Token#totalSupply()
	 * @generated
	 */
	EOperation getToken__TotalSupply();

	/**
	 * Returns the meta object for the '{@link metaModel.Token#balanceOf() <em>Balance Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Balance Of</em>' operation.
	 * @see metaModel.Token#balanceOf()
	 * @generated
	 */
	EOperation getToken__BalanceOf();

	/**
	 * Returns the meta object for the '{@link metaModel.Token#transferFrom() <em>Transfer From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfer From</em>' operation.
	 * @see metaModel.Token#transferFrom()
	 * @generated
	 */
	EOperation getToken__TransferFrom();

	/**
	 * Returns the meta object for the '{@link metaModel.Token#transferTo() <em>Transfer To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfer To</em>' operation.
	 * @see metaModel.Token#transferTo()
	 * @generated
	 */
	EOperation getToken__TransferTo();

	/**
	 * Returns the meta object for the '{@link metaModel.Token#approve() <em>Approve</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Approve</em>' operation.
	 * @see metaModel.Token#approve()
	 * @generated
	 */
	EOperation getToken__Approve();

	/**
	 * Returns the meta object for the '{@link metaModel.Token#allowance() <em>Allowance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Allowance</em>' operation.
	 * @see metaModel.Token#allowance()
	 * @generated
	 */
	EOperation getToken__Allowance();

	/**
	 * Returns the meta object for class '{@link metaModel.SafeMath <em>Safe Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safe Math</em>'.
	 * @see metaModel.SafeMath
	 * @generated
	 */
	EClass getSafeMath();

	/**
	 * Returns the meta object for the '{@link metaModel.SafeMath#safeMul(int, int) <em>Safe Mul</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Safe Mul</em>' operation.
	 * @see metaModel.SafeMath#safeMul(int, int)
	 * @generated
	 */
	EOperation getSafeMath__SafeMul__int_int();

	/**
	 * Returns the meta object for the '{@link metaModel.SafeMath#safeDiv(int, int) <em>Safe Div</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Safe Div</em>' operation.
	 * @see metaModel.SafeMath#safeDiv(int, int)
	 * @generated
	 */
	EOperation getSafeMath__SafeDiv__int_int();

	/**
	 * Returns the meta object for the '{@link metaModel.SafeMath#safeAdd(int, int) <em>Safe Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Safe Add</em>' operation.
	 * @see metaModel.SafeMath#safeAdd(int, int)
	 * @generated
	 */
	EOperation getSafeMath__SafeAdd__int_int();

	/**
	 * Returns the meta object for the '{@link metaModel.SafeMath#safeSub(int, int) <em>Safe Sub</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Safe Sub</em>' operation.
	 * @see metaModel.SafeMath#safeSub(int, int)
	 * @generated
	 */
	EOperation getSafeMath__SafeSub__int_int();

	/**
	 * Returns the meta object for class '{@link metaModel.OracleClient <em>Oracle Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oracle Client</em>'.
	 * @see metaModel.OracleClient
	 * @generated
	 */
	EClass getOracleClient();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.OracleClient#getOracleRef <em>Oracle Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Oracle Ref</em>'.
	 * @see metaModel.OracleClient#getOracleRef()
	 * @see #getOracleClient()
	 * @generated
	 */
	EReference getOracleClient_OracleRef();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.OracleClient#getRequestRef <em>Request Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request Ref</em>'.
	 * @see metaModel.OracleClient#getRequestRef()
	 * @see #getOracleClient()
	 * @generated
	 */
	EReference getOracleClient_RequestRef();

	/**
	 * Returns the meta object for the reference '{@link metaModel.OracleClient#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Buffer</em>'.
	 * @see metaModel.OracleClient#getBuffer()
	 * @see #getOracleClient()
	 * @generated
	 */
	EReference getOracleClient_Buffer();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.OracleClient#getRegistry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry</em>'.
	 * @see metaModel.OracleClient#getRegistry()
	 * @see #getOracleClient()
	 * @generated
	 */
	EAttribute getOracleClient_Registry();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.OracleClient#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see metaModel.OracleClient#getLink()
	 * @see #getOracleClient()
	 * @generated
	 */
	EAttribute getOracleClient_Link();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.OracleClient#getOracle <em>Oracle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oracle</em>'.
	 * @see metaModel.OracleClient#getOracle()
	 * @see #getOracleClient()
	 * @generated
	 */
	EAttribute getOracleClient_Oracle();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.OracleClient#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request</em>'.
	 * @see metaModel.OracleClient#getRequest()
	 * @see #getOracleClient()
	 * @generated
	 */
	EAttribute getOracleClient_Request();

	/**
	 * Returns the meta object for the reference '{@link metaModel.OracleClient#getCbor <em>Cbor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cbor</em>'.
	 * @see metaModel.OracleClient#getCbor()
	 * @see #getOracleClient()
	 * @generated
	 */
	EReference getOracleClient_Cbor();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.OracleClient#getPendingRequests <em>Pending Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pending Requests</em>'.
	 * @see metaModel.OracleClient#getPendingRequests()
	 * @see #getOracleClient()
	 * @generated
	 */
	EAttribute getOracleClient_PendingRequests();

	/**
	 * Returns the meta object for the '{@link metaModel.OracleClient#encodeRequest() <em>Encode Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Encode Request</em>' operation.
	 * @see metaModel.OracleClient#encodeRequest()
	 * @generated
	 */
	EOperation getOracleClient__EncodeRequest();

	/**
	 * Returns the meta object for the '{@link metaModel.OracleClient#tokenAddress() <em>Token Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Token Address</em>' operation.
	 * @see metaModel.OracleClient#tokenAddress()
	 * @generated
	 */
	EOperation getOracleClient__TokenAddress();

	/**
	 * Returns the meta object for the '{@link metaModel.OracleClient#buildRequest() <em>Build Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Request</em>' operation.
	 * @see metaModel.OracleClient#buildRequest()
	 * @generated
	 */
	EOperation getOracleClient__BuildRequest();

	/**
	 * Returns the meta object for the '{@link metaModel.OracleClient#sendRequest() <em>Send Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Request</em>' operation.
	 * @see metaModel.OracleClient#sendRequest()
	 * @generated
	 */
	EOperation getOracleClient__SendRequest();

	/**
	 * Returns the meta object for the '{@link metaModel.OracleClient#cancelRequest() <em>Cancel Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Request</em>' operation.
	 * @see metaModel.OracleClient#cancelRequest()
	 * @generated
	 */
	EOperation getOracleClient__CancelRequest();

	/**
	 * Returns the meta object for the '{@link metaModel.OracleClient#setOracle() <em>Set Oracle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Oracle</em>' operation.
	 * @see metaModel.OracleClient#setOracle()
	 * @generated
	 */
	EOperation getOracleClient__SetOracle();

	/**
	 * Returns the meta object for the '{@link metaModel.OracleClient#setToken() <em>Set Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Token</em>' operation.
	 * @see metaModel.OracleClient#setToken()
	 * @generated
	 */
	EOperation getOracleClient__SetToken();

	/**
	 * Returns the meta object for the '{@link metaModel.OracleClient#addExternalRequest() <em>Add External Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add External Request</em>' operation.
	 * @see metaModel.OracleClient#addExternalRequest()
	 * @generated
	 */
	EOperation getOracleClient__AddExternalRequest();

	/**
	 * Returns the meta object for the '{@link metaModel.OracleClient#updateOracle() <em>Update Oracle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Oracle</em>' operation.
	 * @see metaModel.OracleClient#updateOracle()
	 * @generated
	 */
	EOperation getOracleClient__UpdateOracle();

	/**
	 * Returns the meta object for the '{@link metaModel.OracleClient#validateCallback() <em>Validate Callback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Callback</em>' operation.
	 * @see metaModel.OracleClient#validateCallback()
	 * @generated
	 */
	EOperation getOracleClient__ValidateCallback();

	/**
	 * Returns the meta object for the '{@link metaModel.OracleClient#recordRequestFulfilled() <em>Record Request Fulfilled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Record Request Fulfilled</em>' operation.
	 * @see metaModel.OracleClient#recordRequestFulfilled()
	 * @generated
	 */
	EOperation getOracleClient__RecordRequestFulfilled();

	/**
	 * Returns the meta object for class '{@link metaModel.Oracle <em>Oracle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oracle</em>'.
	 * @see metaModel.Oracle
	 * @generated
	 */
	EClass getOracle();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Oracle#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metaModel.Oracle#getId()
	 * @see #getOracle()
	 * @generated
	 */
	EAttribute getOracle_Id();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Oracle#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see metaModel.Oracle#getAddress()
	 * @see #getOracle()
	 * @generated
	 */
	EAttribute getOracle_Address();

	/**
	 * Returns the meta object for class '{@link metaModel.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see metaModel.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Request#getBuffer_manager <em>Buffer manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Buffer manager</em>'.
	 * @see metaModel.Request#getBuffer_manager()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Buffer_manager();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Request#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metaModel.Request#getId()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Request#getCallBackAddress <em>Call Back Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Back Address</em>'.
	 * @see metaModel.Request#getCallBackAddress()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_CallBackAddress();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Request#getBuf <em>Buf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buf</em>'.
	 * @see metaModel.Request#getBuf()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Buf();

	/**
	 * Returns the meta object for class '{@link metaModel.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer</em>'.
	 * @see metaModel.Buffer
	 * @generated
	 */
	EClass getBuffer();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Buffer#getBuffer_manager <em>Buffer manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buffer manager</em>'.
	 * @see metaModel.Buffer#getBuffer_manager()
	 * @see #getBuffer()
	 * @generated
	 */
	EReference getBuffer_Buffer_manager();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Buffer#getBuf <em>Buf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buf</em>'.
	 * @see metaModel.Buffer#getBuf()
	 * @see #getBuffer()
	 * @generated
	 */
	EAttribute getBuffer_Buf();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Buffer#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see metaModel.Buffer#getCapacity()
	 * @see #getBuffer()
	 * @generated
	 */
	EAttribute getBuffer_Capacity();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Buffer#getToken_manager <em>Token manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token manager</em>'.
	 * @see metaModel.Buffer#getToken_manager()
	 * @see #getBuffer()
	 * @generated
	 */
	EReference getBuffer_Token_manager();

	/**
	 * Returns the meta object for class '{@link metaModel.Buffer_Manager <em>Buffer Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer Manager</em>'.
	 * @see metaModel.Buffer_Manager
	 * @generated
	 */
	EClass getBuffer_Manager();

	/**
	 * Returns the meta object for the '{@link metaModel.Buffer_Manager#resize() <em>Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resize</em>' operation.
	 * @see metaModel.Buffer_Manager#resize()
	 * @generated
	 */
	EOperation getBuffer_Manager__Resize();

	/**
	 * Returns the meta object for the '{@link metaModel.Buffer_Manager#max() <em>Max</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max</em>' operation.
	 * @see metaModel.Buffer_Manager#max()
	 * @generated
	 */
	EOperation getBuffer_Manager__Max();

	/**
	 * Returns the meta object for the '{@link metaModel.Buffer_Manager#write() <em>Write</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write</em>' operation.
	 * @see metaModel.Buffer_Manager#write()
	 * @generated
	 */
	EOperation getBuffer_Manager__Write();

	/**
	 * Returns the meta object for the '{@link metaModel.Buffer_Manager#truncate() <em>Truncate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Truncate</em>' operation.
	 * @see metaModel.Buffer_Manager#truncate()
	 * @generated
	 */
	EOperation getBuffer_Manager__Truncate();

	/**
	 * Returns the meta object for the '{@link metaModel.Buffer_Manager#append() <em>Append</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Append</em>' operation.
	 * @see metaModel.Buffer_Manager#append()
	 * @generated
	 */
	EOperation getBuffer_Manager__Append();

	/**
	 * Returns the meta object for class '{@link metaModel.CBOR <em>CBOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CBOR</em>'.
	 * @see metaModel.CBOR
	 * @generated
	 */
	EClass getCBOR();

	/**
	 * Returns the meta object for the reference '{@link metaModel.CBOR#getBuffer_manager <em>Buffer manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Buffer manager</em>'.
	 * @see metaModel.CBOR#getBuffer_manager()
	 * @see #getCBOR()
	 * @generated
	 */
	EReference getCBOR_Buffer_manager();

	/**
	 * Returns the meta object for class '{@link metaModel.Exchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange</em>'.
	 * @see metaModel.Exchange
	 * @generated
	 */
	EClass getExchange();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Exchange#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency</em>'.
	 * @see metaModel.Exchange#getCurrency()
	 * @see #getExchange()
	 * @generated
	 */
	EReference getExchange_Currency();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Exchange#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see metaModel.Exchange#getSelector()
	 * @see #getExchange()
	 * @generated
	 */
	EAttribute getExchange_Selector();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Exchange#getReserves <em>Reserves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserves</em>'.
	 * @see metaModel.Exchange#getReserves()
	 * @see #getExchange()
	 * @generated
	 */
	EAttribute getExchange_Reserves();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Exchange#getBlockTimeStamp <em>Block Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Time Stamp</em>'.
	 * @see metaModel.Exchange#getBlockTimeStamp()
	 * @see #getExchange()
	 * @generated
	 */
	EAttribute getExchange_BlockTimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Exchange#getMinimumLiquiduty <em>Minimum Liquiduty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Liquiduty</em>'.
	 * @see metaModel.Exchange#getMinimumLiquiduty()
	 * @see #getExchange()
	 * @generated
	 */
	EAttribute getExchange_MinimumLiquiduty();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Exchange#getFactory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory</em>'.
	 * @see metaModel.Exchange#getFactory()
	 * @see #getExchange()
	 * @generated
	 */
	EAttribute getExchange_Factory();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Exchange#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see metaModel.Exchange#getToken()
	 * @see #getExchange()
	 * @generated
	 */
	EAttribute getExchange_Token();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Exchange#getToken_manager <em>Token manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token manager</em>'.
	 * @see metaModel.Exchange#getToken_manager()
	 * @see #getExchange()
	 * @generated
	 */
	EReference getExchange_Token_manager();

	/**
	 * Returns the meta object for the '{@link metaModel.Exchange#updateConversonRates() <em>Update Converson Rates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Converson Rates</em>' operation.
	 * @see metaModel.Exchange#updateConversonRates()
	 * @generated
	 */
	EOperation getExchange__UpdateConversonRates();

	/**
	 * Returns the meta object for the '{@link metaModel.Exchange#mintFee() <em>Mint Fee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mint Fee</em>' operation.
	 * @see metaModel.Exchange#mintFee()
	 * @generated
	 */
	EOperation getExchange__MintFee();

	/**
	 * Returns the meta object for the '{@link metaModel.Exchange#mint() <em>Mint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mint</em>' operation.
	 * @see metaModel.Exchange#mint()
	 * @generated
	 */
	EOperation getExchange__Mint();

	/**
	 * Returns the meta object for the '{@link metaModel.Exchange#burn() <em>Burn</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Burn</em>' operation.
	 * @see metaModel.Exchange#burn()
	 * @generated
	 */
	EOperation getExchange__Burn();

	/**
	 * Returns the meta object for the '{@link metaModel.Exchange#swap() <em>Swap</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Swap</em>' operation.
	 * @see metaModel.Exchange#swap()
	 * @generated
	 */
	EOperation getExchange__Swap();

	/**
	 * Returns the meta object for the '{@link metaModel.Exchange#sync() <em>Sync</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sync</em>' operation.
	 * @see metaModel.Exchange#sync()
	 * @generated
	 */
	EOperation getExchange__Sync();

	/**
	 * Returns the meta object for the '{@link metaModel.Exchange#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see metaModel.Exchange#initialize()
	 * @generated
	 */
	EOperation getExchange__Initialize();

	/**
	 * Returns the meta object for class '{@link metaModel.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency</em>'.
	 * @see metaModel.Currency
	 * @generated
	 */
	EClass getCurrency();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Currency#getToken_manager <em>Token manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token manager</em>'.
	 * @see metaModel.Currency#getToken_manager()
	 * @see #getCurrency()
	 * @generated
	 */
	EReference getCurrency_Token_manager();

	/**
	 * Returns the meta object for the '{@link metaModel.Currency#getConversionRate() <em>Get Conversion Rate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Conversion Rate</em>' operation.
	 * @see metaModel.Currency#getConversionRate()
	 * @generated
	 */
	EOperation getCurrency__GetConversionRate();

	/**
	 * Returns the meta object for the '{@link metaModel.Currency#convert() <em>Convert</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert</em>' operation.
	 * @see metaModel.Currency#convert()
	 * @generated
	 */
	EOperation getCurrency__Convert();

	/**
	 * Returns the meta object for class '{@link metaModel.Marketplace <em>Marketplace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketplace</em>'.
	 * @see metaModel.Marketplace
	 * @generated
	 */
	EClass getMarketplace();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Marketplace#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see metaModel.Marketplace#getOrders()
	 * @see #getMarketplace()
	 * @generated
	 */
	EReference getMarketplace_Orders();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Marketplace#getAuctions <em>Auctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auctions</em>'.
	 * @see metaModel.Marketplace#getAuctions()
	 * @see #getMarketplace()
	 * @generated
	 */
	EReference getMarketplace_Auctions();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Marketplace#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see metaModel.Marketplace#getToken()
	 * @see #getMarketplace()
	 * @generated
	 */
	EAttribute getMarketplace_Token();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Marketplace#getPublicationFee <em>Publication Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Fee</em>'.
	 * @see metaModel.Marketplace#getPublicationFee()
	 * @see #getMarketplace()
	 * @generated
	 */
	EAttribute getMarketplace_PublicationFee();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Marketplace#getToken_manager <em>Token manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token manager</em>'.
	 * @see metaModel.Marketplace#getToken_manager()
	 * @see #getMarketplace()
	 * @generated
	 */
	EReference getMarketplace_Token_manager();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Marketplace#getRegistry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry</em>'.
	 * @see metaModel.Marketplace#getRegistry()
	 * @see #getMarketplace()
	 * @generated
	 */
	EAttribute getMarketplace_Registry();

	/**
	 * Returns the meta object for the '{@link metaModel.Marketplace#createAuction() <em>Create Auction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Auction</em>' operation.
	 * @see metaModel.Marketplace#createAuction()
	 * @generated
	 */
	EOperation getMarketplace__CreateAuction();

	/**
	 * Returns the meta object for the '{@link metaModel.Marketplace#cancelAuction() <em>Cancel Auction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Auction</em>' operation.
	 * @see metaModel.Marketplace#cancelAuction()
	 * @generated
	 */
	EOperation getMarketplace__CancelAuction();

	/**
	 * Returns the meta object for the '{@link metaModel.Marketplace#changeOwner() <em>Change Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Owner</em>' operation.
	 * @see metaModel.Marketplace#changeOwner()
	 * @generated
	 */
	EOperation getMarketplace__ChangeOwner();

	/**
	 * Returns the meta object for the '{@link metaModel.Marketplace#setPublicationFee() <em>Set Publication Fee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Publication Fee</em>' operation.
	 * @see metaModel.Marketplace#setPublicationFee()
	 * @generated
	 */
	EOperation getMarketplace__SetPublicationFee();

	/**
	 * Returns the meta object for the '{@link metaModel.Marketplace#createOrder() <em>Create Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Order</em>' operation.
	 * @see metaModel.Marketplace#createOrder()
	 * @generated
	 */
	EOperation getMarketplace__CreateOrder();

	/**
	 * Returns the meta object for the '{@link metaModel.Marketplace#cancelOrder() <em>Cancel Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Order</em>' operation.
	 * @see metaModel.Marketplace#cancelOrder()
	 * @generated
	 */
	EOperation getMarketplace__CancelOrder();

	/**
	 * Returns the meta object for the '{@link metaModel.Marketplace#executeOrder() <em>Execute Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute Order</em>' operation.
	 * @see metaModel.Marketplace#executeOrder()
	 * @generated
	 */
	EOperation getMarketplace__ExecuteOrder();

	/**
	 * Returns the meta object for the '{@link metaModel.Marketplace#setOwnerCut() <em>Set Owner Cut</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Owner Cut</em>' operation.
	 * @see metaModel.Marketplace#setOwnerCut()
	 * @generated
	 */
	EOperation getMarketplace__SetOwnerCut();

	/**
	 * Returns the meta object for class '{@link metaModel.Orders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orders</em>'.
	 * @see metaModel.Orders
	 * @generated
	 */
	EClass getOrders();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Orders#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see metaModel.Orders#getItems()
	 * @see #getOrders()
	 * @generated
	 */
	EReference getOrders_Items();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Orders#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metaModel.Orders#getId()
	 * @see #getOrders()
	 * @generated
	 */
	EAttribute getOrders_Id();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Orders#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see metaModel.Orders#getStatus()
	 * @see #getOrders()
	 * @generated
	 */
	EAttribute getOrders_Status();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Orders#getBuyer <em>Buyer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buyer</em>'.
	 * @see metaModel.Orders#getBuyer()
	 * @see #getOrders()
	 * @generated
	 */
	EAttribute getOrders_Buyer();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Orders#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see metaModel.Orders#getPrice()
	 * @see #getOrders()
	 * @generated
	 */
	EAttribute getOrders_Price();

	/**
	 * Returns the meta object for class '{@link metaModel.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see metaModel.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Item#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metaModel.Item#getId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Item#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see metaModel.Item#getOrderId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Item#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see metaModel.Item#getQuantity()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Item#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see metaModel.Item#getPrice()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Price();

	/**
	 * Returns the meta object for class '{@link metaModel.Auction <em>Auction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auction</em>'.
	 * @see metaModel.Auction
	 * @generated
	 */
	EClass getAuction();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Auction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metaModel.Auction#getId()
	 * @see #getAuction()
	 * @generated
	 */
	EAttribute getAuction_Id();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Auction#getSeller <em>Seller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seller</em>'.
	 * @see metaModel.Auction#getSeller()
	 * @see #getAuction()
	 * @generated
	 */
	EAttribute getAuction_Seller();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Auction#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see metaModel.Auction#getPrice()
	 * @see #getAuction()
	 * @generated
	 */
	EAttribute getAuction_Price();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Auction#getExpiresAt <em>Expires At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expires At</em>'.
	 * @see metaModel.Auction#getExpiresAt()
	 * @see #getAuction()
	 * @generated
	 */
	EAttribute getAuction_ExpiresAt();

	/**
	 * Returns the meta object for class '{@link metaModel.Liquidation_Manager <em>Liquidation Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Liquidation Manager</em>'.
	 * @see metaModel.Liquidation_Manager
	 * @generated
	 */
	EClass getLiquidation_Manager();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Liquidation_Manager#getLiquidator <em>Liquidator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Liquidator</em>'.
	 * @see metaModel.Liquidation_Manager#getLiquidator()
	 * @see #getLiquidation_Manager()
	 * @generated
	 */
	EReference getLiquidation_Manager_Liquidator();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Liquidation_Manager#getToken_manager <em>Token manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token manager</em>'.
	 * @see metaModel.Liquidation_Manager#getToken_manager()
	 * @see #getLiquidation_Manager()
	 * @generated
	 */
	EReference getLiquidation_Manager_Token_manager();

	/**
	 * Returns the meta object for the '{@link metaModel.Liquidation_Manager#mint() <em>Mint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mint</em>' operation.
	 * @see metaModel.Liquidation_Manager#mint()
	 * @generated
	 */
	EOperation getLiquidation_Manager__Mint();

	/**
	 * Returns the meta object for the '{@link metaModel.Liquidation_Manager#bum() <em>Bum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bum</em>' operation.
	 * @see metaModel.Liquidation_Manager#bum()
	 * @generated
	 */
	EOperation getLiquidation_Manager__Bum();

	/**
	 * Returns the meta object for the '{@link metaModel.Liquidation_Manager#updateLiquidateFee() <em>Update Liquidate Fee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Liquidate Fee</em>' operation.
	 * @see metaModel.Liquidation_Manager#updateLiquidateFee()
	 * @generated
	 */
	EOperation getLiquidation_Manager__UpdateLiquidateFee();

	/**
	 * Returns the meta object for class '{@link metaModel.Liquidator <em>Liquidator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Liquidator</em>'.
	 * @see metaModel.Liquidator
	 * @generated
	 */
	EClass getLiquidator();

	/**
	 * Returns the meta object for the '{@link metaModel.Liquidator#initiate() <em>Initiate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initiate</em>' operation.
	 * @see metaModel.Liquidator#initiate()
	 * @generated
	 */
	EOperation getLiquidator__Initiate();

	/**
	 * Returns the meta object for class '{@link metaModel.Reserves_Manager <em>Reserves Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserves Manager</em>'.
	 * @see metaModel.Reserves_Manager
	 * @generated
	 */
	EClass getReserves_Manager();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Reserves_Manager#getDefi_lending_core <em>Defi lending core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defi lending core</em>'.
	 * @see metaModel.Reserves_Manager#getDefi_lending_core()
	 * @see #getReserves_Manager()
	 * @generated
	 */
	EReference getReserves_Manager_Defi_lending_core();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Reserves_Manager#getToken_manager <em>Token manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token manager</em>'.
	 * @see metaModel.Reserves_Manager#getToken_manager()
	 * @see #getReserves_Manager()
	 * @generated
	 */
	EReference getReserves_Manager_Token_manager();

	/**
	 * Returns the meta object for the '{@link metaModel.Reserves_Manager#activate() <em>Activate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Activate</em>' operation.
	 * @see metaModel.Reserves_Manager#activate()
	 * @generated
	 */
	EOperation getReserves_Manager__Activate();

	/**
	 * Returns the meta object for the '{@link metaModel.Reserves_Manager#deactivate() <em>Deactivate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deactivate</em>' operation.
	 * @see metaModel.Reserves_Manager#deactivate()
	 * @generated
	 */
	EOperation getReserves_Manager__Deactivate();

	/**
	 * Returns the meta object for the '{@link metaModel.Reserves_Manager#freeze() <em>Freeze</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Freeze</em>' operation.
	 * @see metaModel.Reserves_Manager#freeze()
	 * @generated
	 */
	EOperation getReserves_Manager__Freeze();

	/**
	 * Returns the meta object for the '{@link metaModel.Reserves_Manager#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see metaModel.Reserves_Manager#update()
	 * @generated
	 */
	EOperation getReserves_Manager__Update();

	/**
	 * Returns the meta object for the '{@link metaModel.Reserves_Manager#unfreeze() <em>Unfreeze</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unfreeze</em>' operation.
	 * @see metaModel.Reserves_Manager#unfreeze()
	 * @generated
	 */
	EOperation getReserves_Manager__Unfreeze();

	/**
	 * Returns the meta object for class '{@link metaModel.DeFi_Lending_Core <em>De Fi Lending Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>De Fi Lending Core</em>'.
	 * @see metaModel.DeFi_Lending_Core
	 * @generated
	 */
	EClass getDeFi_Lending_Core();

	/**
	 * Returns the meta object for the reference '{@link metaModel.DeFi_Lending_Core#getData_provider <em>Data provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data provider</em>'.
	 * @see metaModel.DeFi_Lending_Core#getData_provider()
	 * @see #getDeFi_Lending_Core()
	 * @generated
	 */
	EReference getDeFi_Lending_Core_Data_provider();

	/**
	 * Returns the meta object for the reference '{@link metaModel.DeFi_Lending_Core#getReserves_manager <em>Reserves manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reserves manager</em>'.
	 * @see metaModel.DeFi_Lending_Core#getReserves_manager()
	 * @see #getDeFi_Lending_Core()
	 * @generated
	 */
	EReference getDeFi_Lending_Core_Reserves_manager();

	/**
	 * Returns the meta object for the '{@link metaModel.DeFi_Lending_Core#updateState() <em>Update State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update State</em>' operation.
	 * @see metaModel.DeFi_Lending_Core#updateState()
	 * @generated
	 */
	EOperation getDeFi_Lending_Core__UpdateState();

	/**
	 * Returns the meta object for the '{@link metaModel.DeFi_Lending_Core#reservesState() <em>Reserves State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reserves State</em>' operation.
	 * @see metaModel.DeFi_Lending_Core#reservesState()
	 * @generated
	 */
	EOperation getDeFi_Lending_Core__ReservesState();

	/**
	 * Returns the meta object for the '{@link metaModel.DeFi_Lending_Core#lendingPoolConfigurator() <em>Lending Pool Configurator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lending Pool Configurator</em>' operation.
	 * @see metaModel.DeFi_Lending_Core#lendingPoolConfigurator()
	 * @generated
	 */
	EOperation getDeFi_Lending_Core__LendingPoolConfigurator();

	/**
	 * Returns the meta object for the '{@link metaModel.DeFi_Lending_Core#transferToUser() <em>Transfer To User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfer To User</em>' operation.
	 * @see metaModel.DeFi_Lending_Core#transferToUser()
	 * @generated
	 */
	EOperation getDeFi_Lending_Core__TransferToUser();

	/**
	 * Returns the meta object for class '{@link metaModel.Data_Provider <em>Data Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Provider</em>'.
	 * @see metaModel.Data_Provider
	 * @generated
	 */
	EClass getData_Provider();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Data_Provider#getDefi_lending_core <em>Defi lending core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defi lending core</em>'.
	 * @see metaModel.Data_Provider#getDefi_lending_core()
	 * @see #getData_Provider()
	 * @generated
	 */
	EReference getData_Provider_Defi_lending_core();

	/**
	 * Returns the meta object for the reference '{@link metaModel.Data_Provider#getOracleclient <em>Oracleclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Oracleclient</em>'.
	 * @see metaModel.Data_Provider#getOracleclient()
	 * @see #getData_Provider()
	 * @generated
	 */
	EReference getData_Provider_Oracleclient();

	/**
	 * Returns the meta object for the '{@link metaModel.Data_Provider#priceOracle() <em>Price Oracle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Price Oracle</em>' operation.
	 * @see metaModel.Data_Provider#priceOracle()
	 * @generated
	 */
	EOperation getData_Provider__PriceOracle();

	/**
	 * Returns the meta object for the '{@link metaModel.Data_Provider#interestRate() <em>Interest Rate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Interest Rate</em>' operation.
	 * @see metaModel.Data_Provider#interestRate()
	 * @generated
	 */
	EOperation getData_Provider__InterestRate();

	/**
	 * Returns the meta object for class '{@link metaModel.DeFi_Lending_Pool <em>De Fi Lending Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>De Fi Lending Pool</em>'.
	 * @see metaModel.DeFi_Lending_Pool
	 * @generated
	 */
	EClass getDeFi_Lending_Pool();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.DeFi_Lending_Pool#getDefi_user <em>Defi user</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Defi user</em>'.
	 * @see metaModel.DeFi_Lending_Pool#getDefi_user()
	 * @see #getDeFi_Lending_Pool()
	 * @generated
	 */
	EReference getDeFi_Lending_Pool_Defi_user();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.DeFi_Lending_Pool#getDefi_lending_core <em>Defi lending core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defi lending core</em>'.
	 * @see metaModel.DeFi_Lending_Pool#getDefi_lending_core()
	 * @see #getDeFi_Lending_Pool()
	 * @generated
	 */
	EReference getDeFi_Lending_Pool_Defi_lending_core();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.DeFi_Lending_Pool#getLendingPoolAddress <em>Lending Pool Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lending Pool Address</em>'.
	 * @see metaModel.DeFi_Lending_Pool#getLendingPoolAddress()
	 * @see #getDeFi_Lending_Pool()
	 * @generated
	 */
	EAttribute getDeFi_Lending_Pool_LendingPoolAddress();

	/**
	 * Returns the meta object for class '{@link metaModel.DeFi_User <em>De Fi User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>De Fi User</em>'.
	 * @see metaModel.DeFi_User
	 * @generated
	 */
	EClass getDeFi_User();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.DeFi_User#getDefi_lending_pool <em>Defi lending pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Defi lending pool</em>'.
	 * @see metaModel.DeFi_User#getDefi_lending_pool()
	 * @see #getDeFi_User()
	 * @generated
	 */
	EReference getDeFi_User_Defi_lending_pool();

	/**
	 * Returns the meta object for the '{@link metaModel.DeFi_User#loan() <em>Loan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Loan</em>' operation.
	 * @see metaModel.DeFi_User#loan()
	 * @generated
	 */
	EOperation getDeFi_User__Loan();

	/**
	 * Returns the meta object for the '{@link metaModel.DeFi_User#deposit() <em>Deposit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deposit</em>' operation.
	 * @see metaModel.DeFi_User#deposit()
	 * @generated
	 */
	EOperation getDeFi_User__Deposit();

	/**
	 * Returns the meta object for the '{@link metaModel.DeFi_User#borrow() <em>Borrow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Borrow</em>' operation.
	 * @see metaModel.DeFi_User#borrow()
	 * @generated
	 */
	EOperation getDeFi_User__Borrow();

	/**
	 * Returns the meta object for the '{@link metaModel.DeFi_User#repay() <em>Repay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repay</em>' operation.
	 * @see metaModel.DeFi_User#repay()
	 * @generated
	 */
	EOperation getDeFi_User__Repay();

	/**
	 * Returns the meta object for the '{@link metaModel.DeFi_User#redeem() <em>Redeem</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redeem</em>' operation.
	 * @see metaModel.DeFi_User#redeem()
	 * @generated
	 */
	EOperation getDeFi_User__Redeem();

	/**
	 * Returns the meta object for the '{@link metaModel.DeFi_User#swap() <em>Swap</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Swap</em>' operation.
	 * @see metaModel.DeFi_User#swap()
	 * @generated
	 */
	EOperation getDeFi_User__Swap();

	/**
	 * Returns the meta object for the '{@link metaModel.DeFi_User#recieve() <em>Recieve</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Recieve</em>' operation.
	 * @see metaModel.DeFi_User#recieve()
	 * @generated
	 */
	EOperation getDeFi_User__Recieve();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Address DType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Address DType</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getAddressDType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaModelFactory getMetaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metaModel.impl.BlockchainImpl <em>Blockchain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.BlockchainImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getBlockchain()
		 * @generated
		 */
		EClass BLOCKCHAIN = eINSTANCE.getBlockchain();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCKCHAIN__BLOCK = eINSTANCE.getBlockchain_Block();

		/**
		 * The meta object literal for the '{@link metaModel.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.BlockImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__TRANSACTIONS = eINSTANCE.getBlock_Transactions();

		/**
		 * The meta object literal for the '<em><b>Contracts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__CONTRACTS = eINSTANCE.getBlock_Contracts();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__ADDRESS = eINSTANCE.getBlock_Address();

		/**
		 * The meta object literal for the '{@link metaModel.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.TransactionImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__ADDRESS = eINSTANCE.getTransaction_Address();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__USER = eINSTANCE.getTransaction_User();

		/**
		 * The meta object literal for the '<em><b>Signaturevalidator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__SIGNATUREVALIDATOR = eINSTANCE.getTransaction_Signaturevalidator();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__TO = eINSTANCE.getTransaction_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__FROM = eINSTANCE.getTransaction_From();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__HASH = eINSTANCE.getTransaction_Hash();

		/**
		 * The meta object literal for the '{@link metaModel.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.AddressImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__TRANSACTION = eINSTANCE.getAddress_Transaction();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__CONTRACT = eINSTANCE.getAddress_Contract();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__USER = eINSTANCE.getAddress_User();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ADDR = eINSTANCE.getAddress_Addr();

		/**
		 * The meta object literal for the '{@link metaModel.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.ContractImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__ADDRESS = eINSTANCE.getContract_Address();

		/**
		 * The meta object literal for the '<em><b>Dapp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__DAPP = eINSTANCE.getContract_Dapp();

		/**
		 * The meta object literal for the '{@link metaModel.impl.DAppImpl <em>DApp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.DAppImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getDApp()
		 * @generated
		 */
		EClass DAPP = eINSTANCE.getDApp();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAPP__CONTRACT = eINSTANCE.getDApp_Contract();

		/**
		 * The meta object literal for the '{@link metaModel.impl.WalletImpl <em>Wallet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.WalletImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getWallet()
		 * @generated
		 */
		EClass WALLET = eINSTANCE.getWallet();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALLET__USER = eINSTANCE.getWallet_User();

		/**
		 * The meta object literal for the '{@link metaModel.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.UserImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ADDRESS = eINSTANCE.getUser_Address();

		/**
		 * The meta object literal for the '<em><b>Wallet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__WALLET = eINSTANCE.getUser_Wallet();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__TRANSACTION = eINSTANCE.getUser_Transaction();

		/**
		 * The meta object literal for the '{@link metaModel.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.PlayerImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Gameplayer manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__GAMEPLAYER_MANAGER = eINSTANCE.getPlayer_Gameplayer_manager();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__ID = eINSTANCE.getPlayer_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__ADDR = eINSTANCE.getPlayer_Addr();

		/**
		 * The meta object literal for the '{@link metaModel.impl.GamePlayer_ManagerImpl <em>Game Player Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.GamePlayer_ManagerImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getGamePlayer_Manager()
		 * @generated
		 */
		EClass GAME_PLAYER_MANAGER = eINSTANCE.getGamePlayer_Manager();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_PLAYER_MANAGER__PLAYER = eINSTANCE.getGamePlayer_Manager_Player();

		/**
		 * The meta object literal for the '<em><b>Admin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PLAYER_MANAGER__ADMIN = eINSTANCE.getGamePlayer_Manager_Admin();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PLAYER_MANAGER__PLAYERS = eINSTANCE.getGamePlayer_Manager_Players();

		/**
		 * The meta object literal for the '<em><b>Add Player</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_PLAYER_MANAGER___ADD_PLAYER = eINSTANCE.getGamePlayer_Manager__AddPlayer();

		/**
		 * The meta object literal for the '<em><b>Remove Player</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_PLAYER_MANAGER___REMOVE_PLAYER = eINSTANCE.getGamePlayer_Manager__RemovePlayer();

		/**
		 * The meta object literal for the '<em><b>Edit Player</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_PLAYER_MANAGER___EDIT_PLAYER = eINSTANCE.getGamePlayer_Manager__EditPlayer();

		/**
		 * The meta object literal for the '<em><b>Find Player</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_PLAYER_MANAGER___FIND_PLAYER = eINSTANCE.getGamePlayer_Manager__FindPlayer();

		/**
		 * The meta object literal for the '<em><b>Exist</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_PLAYER_MANAGER___EXIST = eINSTANCE.getGamePlayer_Manager__Exist();

		/**
		 * The meta object literal for the '{@link metaModel.impl.GameCoreImpl <em>Game Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.GameCoreImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getGameCore()
		 * @generated
		 */
		EClass GAME_CORE = eINSTANCE.getGameCore();

		/**
		 * The meta object literal for the '<em><b>Gameplayer manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_CORE__GAMEPLAYER_MANAGER = eINSTANCE.getGameCore_Gameplayer_manager();

		/**
		 * The meta object literal for the '<em><b>Gameminting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_CORE__GAMEMINTING = eINSTANCE.getGameCore_Gameminting();

		/**
		 * The meta object literal for the '<em><b>New Player Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_CORE__NEW_PLAYER_ADDRESS = eINSTANCE.getGameCore_NewPlayerAddress();

		/**
		 * The meta object literal for the '<em><b>Active players</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_CORE__ACTIVE_PLAYERS = eINSTANCE.getGameCore_Active_players();

		/**
		 * The meta object literal for the '<em><b>Set New Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_CORE___SET_NEW_ADDRESS = eINSTANCE.getGameCore__SetNewAddress();

		/**
		 * The meta object literal for the '<em><b>Get Collectible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_CORE___GET_COLLECTIBLE = eINSTANCE.getGameCore__GetCollectible();

		/**
		 * The meta object literal for the '<em><b>Withdraw</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_CORE___WITHDRAW = eINSTANCE.getGameCore__Withdraw();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_CORE___JOIN = eINSTANCE.getGameCore__Join();

		/**
		 * The meta object literal for the '<em><b>Ping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_CORE___PING = eINSTANCE.getGameCore__Ping();

		/**
		 * The meta object literal for the '{@link metaModel.impl.GameMintingImpl <em>Game Minting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.GameMintingImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getGameMinting()
		 * @generated
		 */
		EClass GAME_MINTING = eINSTANCE.getGameMinting();

		/**
		 * The meta object literal for the '<em><b>Promold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_MINTING__PROMOLD = eINSTANCE.getGameMinting_Promold();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_MINTING__COUNT = eINSTANCE.getGameMinting_Count();

		/**
		 * The meta object literal for the '<em><b>Auction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_MINTING__AUCTION_ID = eINSTANCE.getGameMinting_AuctionId();

		/**
		 * The meta object literal for the '<em><b>Token manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MINTING__TOKEN_MANAGER = eINSTANCE.getGameMinting_Token_manager();

		/**
		 * The meta object literal for the '<em><b>Compute Net Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_MINTING___COMPUTE_NET_PRICE = eINSTANCE.getGameMinting__ComputeNetPrice();

		/**
		 * The meta object literal for the '<em><b>Create Promo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_MINTING___CREATE_PROMO = eINSTANCE.getGameMinting__CreatePromo();

		/**
		 * The meta object literal for the '<em><b>Create Auction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_MINTING___CREATE_AUCTION = eINSTANCE.getGameMinting__CreateAuction();

		/**
		 * The meta object literal for the '{@link metaModel.impl.SignatureValidatorImpl <em>Signature Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.SignatureValidatorImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getSignatureValidator()
		 * @generated
		 */
		EClass SIGNATURE_VALIDATOR = eINSTANCE.getSignatureValidator();

		/**
		 * The meta object literal for the '<em><b>Signatureregistry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_VALIDATOR__SIGNATUREREGISTRY = eINSTANCE.getSignatureValidator_Signatureregistry();

		/**
		 * The meta object literal for the '<em><b>Ecdsa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_VALIDATOR__ECDSA = eINSTANCE.getSignatureValidator_Ecdsa();

		/**
		 * The meta object literal for the '<em><b>Require Valid Signature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIGNATURE_VALIDATOR___REQUIRE_VALID_SIGNATURE = eINSTANCE
				.getSignatureValidator__RequireValidSignature();

		/**
		 * The meta object literal for the '<em><b>Calculate Signature Hash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIGNATURE_VALIDATOR___CALCULATE_SIGNATURE_HASH = eINSTANCE
				.getSignatureValidator__CalculateSignatureHash();

		/**
		 * The meta object literal for the '<em><b>Validate Signature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIGNATURE_VALIDATOR___VALIDATE_SIGNATURE = eINSTANCE.getSignatureValidator__ValidateSignature();

		/**
		 * The meta object literal for the '{@link metaModel.impl.SignatureRegistryImpl <em>Signature Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.SignatureRegistryImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getSignatureRegistry()
		 * @generated
		 */
		EClass SIGNATURE_REGISTRY = eINSTANCE.getSignatureRegistry();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_REGISTRY__SIGNATURES = eINSTANCE.getSignatureRegistry_Signatures();

		/**
		 * The meta object literal for the '<em><b>Signaturevalidator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_REGISTRY__SIGNATUREVALIDATOR = eINSTANCE.getSignatureRegistry_Signaturevalidator();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_REGISTRY__SIGNATURE = eINSTANCE.getSignatureRegistry_Signature();

		/**
		 * The meta object literal for the '<em><b>Register Signature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIGNATURE_REGISTRY___REGISTER_SIGNATURE = eINSTANCE.getSignatureRegistry__RegisterSignature();

		/**
		 * The meta object literal for the '{@link metaModel.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.SignatureImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE__ID = eINSTANCE.getSignature_Id();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE__SIGNATURE = eINSTANCE.getSignature_Signature();

		/**
		 * The meta object literal for the '{@link metaModel.impl.ECDSAImpl <em>ECDSA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.ECDSAImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getECDSA()
		 * @generated
		 */
		EClass ECDSA = eINSTANCE.getECDSA();

		/**
		 * The meta object literal for the '<em><b>Recover</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECDSA___RECOVER = eINSTANCE.getECDSA__Recover();

		/**
		 * The meta object literal for the '<em><b>To Eth Signed Message Hash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECDSA___TO_ETH_SIGNED_MESSAGE_HASH = eINSTANCE.getECDSA__ToEthSignedMessageHash();

		/**
		 * The meta object literal for the '{@link metaModel.impl.Token_ManagerImpl <em>Token Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.Token_ManagerImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getToken_Manager()
		 * @generated
		 */
		EClass TOKEN_MANAGER = eINSTANCE.getToken_Manager();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_MANAGER__SYMBOL = eINSTANCE.getToken_Manager_Symbol();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_MANAGER__NAME = eINSTANCE.getToken_Manager_Name();

		/**
		 * The meta object literal for the '<em><b>Total Supply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_MANAGER__TOTAL_SUPPLY = eINSTANCE.getToken_Manager_TotalSupply();

		/**
		 * The meta object literal for the '<em><b>Safemath</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_MANAGER__SAFEMATH = eINSTANCE.getToken_Manager_Safemath();

		/**
		 * The meta object literal for the '<em><b>Balances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_MANAGER__BALANCES = eINSTANCE.getToken_Manager_Balances();

		/**
		 * The meta object literal for the '{@link metaModel.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.TokenImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Transfer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___TRANSFER = eINSTANCE.getToken__Transfer();

		/**
		 * The meta object literal for the '<em><b>Approval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___APPROVAL = eINSTANCE.getToken__Approval();

		/**
		 * The meta object literal for the '<em><b>Total Supply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___TOTAL_SUPPLY = eINSTANCE.getToken__TotalSupply();

		/**
		 * The meta object literal for the '<em><b>Balance Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___BALANCE_OF = eINSTANCE.getToken__BalanceOf();

		/**
		 * The meta object literal for the '<em><b>Transfer From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___TRANSFER_FROM = eINSTANCE.getToken__TransferFrom();

		/**
		 * The meta object literal for the '<em><b>Transfer To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___TRANSFER_TO = eINSTANCE.getToken__TransferTo();

		/**
		 * The meta object literal for the '<em><b>Approve</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___APPROVE = eINSTANCE.getToken__Approve();

		/**
		 * The meta object literal for the '<em><b>Allowance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___ALLOWANCE = eINSTANCE.getToken__Allowance();

		/**
		 * The meta object literal for the '{@link metaModel.impl.SafeMathImpl <em>Safe Math</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.SafeMathImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getSafeMath()
		 * @generated
		 */
		EClass SAFE_MATH = eINSTANCE.getSafeMath();

		/**
		 * The meta object literal for the '<em><b>Safe Mul</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SAFE_MATH___SAFE_MUL__INT_INT = eINSTANCE.getSafeMath__SafeMul__int_int();

		/**
		 * The meta object literal for the '<em><b>Safe Div</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SAFE_MATH___SAFE_DIV__INT_INT = eINSTANCE.getSafeMath__SafeDiv__int_int();

		/**
		 * The meta object literal for the '<em><b>Safe Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SAFE_MATH___SAFE_ADD__INT_INT = eINSTANCE.getSafeMath__SafeAdd__int_int();

		/**
		 * The meta object literal for the '<em><b>Safe Sub</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SAFE_MATH___SAFE_SUB__INT_INT = eINSTANCE.getSafeMath__SafeSub__int_int();

		/**
		 * The meta object literal for the '{@link metaModel.impl.OracleClientImpl <em>Oracle Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.OracleClientImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getOracleClient()
		 * @generated
		 */
		EClass ORACLE_CLIENT = eINSTANCE.getOracleClient();

		/**
		 * The meta object literal for the '<em><b>Oracle Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORACLE_CLIENT__ORACLE_REF = eINSTANCE.getOracleClient_OracleRef();

		/**
		 * The meta object literal for the '<em><b>Request Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORACLE_CLIENT__REQUEST_REF = eINSTANCE.getOracleClient_RequestRef();

		/**
		 * The meta object literal for the '<em><b>Buffer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORACLE_CLIENT__BUFFER = eINSTANCE.getOracleClient_Buffer();

		/**
		 * The meta object literal for the '<em><b>Registry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORACLE_CLIENT__REGISTRY = eINSTANCE.getOracleClient_Registry();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORACLE_CLIENT__LINK = eINSTANCE.getOracleClient_Link();

		/**
		 * The meta object literal for the '<em><b>Oracle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORACLE_CLIENT__ORACLE = eINSTANCE.getOracleClient_Oracle();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORACLE_CLIENT__REQUEST = eINSTANCE.getOracleClient_Request();

		/**
		 * The meta object literal for the '<em><b>Cbor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORACLE_CLIENT__CBOR = eINSTANCE.getOracleClient_Cbor();

		/**
		 * The meta object literal for the '<em><b>Pending Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORACLE_CLIENT__PENDING_REQUESTS = eINSTANCE.getOracleClient_PendingRequests();

		/**
		 * The meta object literal for the '<em><b>Encode Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORACLE_CLIENT___ENCODE_REQUEST = eINSTANCE.getOracleClient__EncodeRequest();

		/**
		 * The meta object literal for the '<em><b>Token Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORACLE_CLIENT___TOKEN_ADDRESS = eINSTANCE.getOracleClient__TokenAddress();

		/**
		 * The meta object literal for the '<em><b>Build Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORACLE_CLIENT___BUILD_REQUEST = eINSTANCE.getOracleClient__BuildRequest();

		/**
		 * The meta object literal for the '<em><b>Send Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORACLE_CLIENT___SEND_REQUEST = eINSTANCE.getOracleClient__SendRequest();

		/**
		 * The meta object literal for the '<em><b>Cancel Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORACLE_CLIENT___CANCEL_REQUEST = eINSTANCE.getOracleClient__CancelRequest();

		/**
		 * The meta object literal for the '<em><b>Set Oracle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORACLE_CLIENT___SET_ORACLE = eINSTANCE.getOracleClient__SetOracle();

		/**
		 * The meta object literal for the '<em><b>Set Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORACLE_CLIENT___SET_TOKEN = eINSTANCE.getOracleClient__SetToken();

		/**
		 * The meta object literal for the '<em><b>Add External Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORACLE_CLIENT___ADD_EXTERNAL_REQUEST = eINSTANCE.getOracleClient__AddExternalRequest();

		/**
		 * The meta object literal for the '<em><b>Update Oracle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORACLE_CLIENT___UPDATE_ORACLE = eINSTANCE.getOracleClient__UpdateOracle();

		/**
		 * The meta object literal for the '<em><b>Validate Callback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORACLE_CLIENT___VALIDATE_CALLBACK = eINSTANCE.getOracleClient__ValidateCallback();

		/**
		 * The meta object literal for the '<em><b>Record Request Fulfilled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORACLE_CLIENT___RECORD_REQUEST_FULFILLED = eINSTANCE.getOracleClient__RecordRequestFulfilled();

		/**
		 * The meta object literal for the '{@link metaModel.impl.OracleImpl <em>Oracle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.OracleImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getOracle()
		 * @generated
		 */
		EClass ORACLE = eINSTANCE.getOracle();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORACLE__ID = eINSTANCE.getOracle_Id();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORACLE__ADDRESS = eINSTANCE.getOracle_Address();

		/**
		 * The meta object literal for the '{@link metaModel.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.RequestImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Buffer manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__BUFFER_MANAGER = eINSTANCE.getRequest_Buffer_manager();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__ID = eINSTANCE.getRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Call Back Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__CALL_BACK_ADDRESS = eINSTANCE.getRequest_CallBackAddress();

		/**
		 * The meta object literal for the '<em><b>Buf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__BUF = eINSTANCE.getRequest_Buf();

		/**
		 * The meta object literal for the '{@link metaModel.impl.BufferImpl <em>Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.BufferImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getBuffer()
		 * @generated
		 */
		EClass BUFFER = eINSTANCE.getBuffer();

		/**
		 * The meta object literal for the '<em><b>Buffer manager</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER__BUFFER_MANAGER = eINSTANCE.getBuffer_Buffer_manager();

		/**
		 * The meta object literal for the '<em><b>Buf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER__BUF = eINSTANCE.getBuffer_Buf();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER__CAPACITY = eINSTANCE.getBuffer_Capacity();

		/**
		 * The meta object literal for the '<em><b>Token manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER__TOKEN_MANAGER = eINSTANCE.getBuffer_Token_manager();

		/**
		 * The meta object literal for the '{@link metaModel.impl.Buffer_ManagerImpl <em>Buffer Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.Buffer_ManagerImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getBuffer_Manager()
		 * @generated
		 */
		EClass BUFFER_MANAGER = eINSTANCE.getBuffer_Manager();

		/**
		 * The meta object literal for the '<em><b>Resize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUFFER_MANAGER___RESIZE = eINSTANCE.getBuffer_Manager__Resize();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUFFER_MANAGER___MAX = eINSTANCE.getBuffer_Manager__Max();

		/**
		 * The meta object literal for the '<em><b>Write</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUFFER_MANAGER___WRITE = eINSTANCE.getBuffer_Manager__Write();

		/**
		 * The meta object literal for the '<em><b>Truncate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUFFER_MANAGER___TRUNCATE = eINSTANCE.getBuffer_Manager__Truncate();

		/**
		 * The meta object literal for the '<em><b>Append</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUFFER_MANAGER___APPEND = eINSTANCE.getBuffer_Manager__Append();

		/**
		 * The meta object literal for the '{@link metaModel.impl.CBORImpl <em>CBOR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.CBORImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getCBOR()
		 * @generated
		 */
		EClass CBOR = eINSTANCE.getCBOR();

		/**
		 * The meta object literal for the '<em><b>Buffer manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CBOR__BUFFER_MANAGER = eINSTANCE.getCBOR_Buffer_manager();

		/**
		 * The meta object literal for the '{@link metaModel.impl.ExchangeImpl <em>Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.ExchangeImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getExchange()
		 * @generated
		 */
		EClass EXCHANGE = eINSTANCE.getExchange();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE__CURRENCY = eINSTANCE.getExchange_Currency();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE__SELECTOR = eINSTANCE.getExchange_Selector();

		/**
		 * The meta object literal for the '<em><b>Reserves</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE__RESERVES = eINSTANCE.getExchange_Reserves();

		/**
		 * The meta object literal for the '<em><b>Block Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE__BLOCK_TIME_STAMP = eINSTANCE.getExchange_BlockTimeStamp();

		/**
		 * The meta object literal for the '<em><b>Minimum Liquiduty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE__MINIMUM_LIQUIDUTY = eINSTANCE.getExchange_MinimumLiquiduty();

		/**
		 * The meta object literal for the '<em><b>Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE__FACTORY = eINSTANCE.getExchange_Factory();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE__TOKEN = eINSTANCE.getExchange_Token();

		/**
		 * The meta object literal for the '<em><b>Token manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE__TOKEN_MANAGER = eINSTANCE.getExchange_Token_manager();

		/**
		 * The meta object literal for the '<em><b>Update Converson Rates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCHANGE___UPDATE_CONVERSON_RATES = eINSTANCE.getExchange__UpdateConversonRates();

		/**
		 * The meta object literal for the '<em><b>Mint Fee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCHANGE___MINT_FEE = eINSTANCE.getExchange__MintFee();

		/**
		 * The meta object literal for the '<em><b>Mint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCHANGE___MINT = eINSTANCE.getExchange__Mint();

		/**
		 * The meta object literal for the '<em><b>Burn</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCHANGE___BURN = eINSTANCE.getExchange__Burn();

		/**
		 * The meta object literal for the '<em><b>Swap</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCHANGE___SWAP = eINSTANCE.getExchange__Swap();

		/**
		 * The meta object literal for the '<em><b>Sync</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCHANGE___SYNC = eINSTANCE.getExchange__Sync();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCHANGE___INITIALIZE = eINSTANCE.getExchange__Initialize();

		/**
		 * The meta object literal for the '{@link metaModel.impl.CurrencyImpl <em>Currency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.CurrencyImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getCurrency()
		 * @generated
		 */
		EClass CURRENCY = eINSTANCE.getCurrency();

		/**
		 * The meta object literal for the '<em><b>Token manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY__TOKEN_MANAGER = eINSTANCE.getCurrency_Token_manager();

		/**
		 * The meta object literal for the '<em><b>Get Conversion Rate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CURRENCY___GET_CONVERSION_RATE = eINSTANCE.getCurrency__GetConversionRate();

		/**
		 * The meta object literal for the '<em><b>Convert</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CURRENCY___CONVERT = eINSTANCE.getCurrency__Convert();

		/**
		 * The meta object literal for the '{@link metaModel.impl.MarketplaceImpl <em>Marketplace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.MarketplaceImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getMarketplace()
		 * @generated
		 */
		EClass MARKETPLACE = eINSTANCE.getMarketplace();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETPLACE__ORDERS = eINSTANCE.getMarketplace_Orders();

		/**
		 * The meta object literal for the '<em><b>Auctions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETPLACE__AUCTIONS = eINSTANCE.getMarketplace_Auctions();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETPLACE__TOKEN = eINSTANCE.getMarketplace_Token();

		/**
		 * The meta object literal for the '<em><b>Publication Fee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETPLACE__PUBLICATION_FEE = eINSTANCE.getMarketplace_PublicationFee();

		/**
		 * The meta object literal for the '<em><b>Token manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETPLACE__TOKEN_MANAGER = eINSTANCE.getMarketplace_Token_manager();

		/**
		 * The meta object literal for the '<em><b>Registry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETPLACE__REGISTRY = eINSTANCE.getMarketplace_Registry();

		/**
		 * The meta object literal for the '<em><b>Create Auction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MARKETPLACE___CREATE_AUCTION = eINSTANCE.getMarketplace__CreateAuction();

		/**
		 * The meta object literal for the '<em><b>Cancel Auction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MARKETPLACE___CANCEL_AUCTION = eINSTANCE.getMarketplace__CancelAuction();

		/**
		 * The meta object literal for the '<em><b>Change Owner</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MARKETPLACE___CHANGE_OWNER = eINSTANCE.getMarketplace__ChangeOwner();

		/**
		 * The meta object literal for the '<em><b>Set Publication Fee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MARKETPLACE___SET_PUBLICATION_FEE = eINSTANCE.getMarketplace__SetPublicationFee();

		/**
		 * The meta object literal for the '<em><b>Create Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MARKETPLACE___CREATE_ORDER = eINSTANCE.getMarketplace__CreateOrder();

		/**
		 * The meta object literal for the '<em><b>Cancel Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MARKETPLACE___CANCEL_ORDER = eINSTANCE.getMarketplace__CancelOrder();

		/**
		 * The meta object literal for the '<em><b>Execute Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MARKETPLACE___EXECUTE_ORDER = eINSTANCE.getMarketplace__ExecuteOrder();

		/**
		 * The meta object literal for the '<em><b>Set Owner Cut</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MARKETPLACE___SET_OWNER_CUT = eINSTANCE.getMarketplace__SetOwnerCut();

		/**
		 * The meta object literal for the '{@link metaModel.impl.OrdersImpl <em>Orders</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.OrdersImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getOrders()
		 * @generated
		 */
		EClass ORDERS = eINSTANCE.getOrders();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERS__ITEMS = eINSTANCE.getOrders_Items();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERS__ID = eINSTANCE.getOrders_Id();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERS__STATUS = eINSTANCE.getOrders_Status();

		/**
		 * The meta object literal for the '<em><b>Buyer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERS__BUYER = eINSTANCE.getOrders_Buyer();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERS__PRICE = eINSTANCE.getOrders_Price();

		/**
		 * The meta object literal for the '{@link metaModel.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.ItemImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ID = eINSTANCE.getItem_Id();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ORDER_ID = eINSTANCE.getItem_OrderId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__QUANTITY = eINSTANCE.getItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__PRICE = eINSTANCE.getItem_Price();

		/**
		 * The meta object literal for the '{@link metaModel.impl.AuctionImpl <em>Auction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.AuctionImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getAuction()
		 * @generated
		 */
		EClass AUCTION = eINSTANCE.getAuction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUCTION__ID = eINSTANCE.getAuction_Id();

		/**
		 * The meta object literal for the '<em><b>Seller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUCTION__SELLER = eINSTANCE.getAuction_Seller();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUCTION__PRICE = eINSTANCE.getAuction_Price();

		/**
		 * The meta object literal for the '<em><b>Expires At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUCTION__EXPIRES_AT = eINSTANCE.getAuction_ExpiresAt();

		/**
		 * The meta object literal for the '{@link metaModel.impl.Liquidation_ManagerImpl <em>Liquidation Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.Liquidation_ManagerImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getLiquidation_Manager()
		 * @generated
		 */
		EClass LIQUIDATION_MANAGER = eINSTANCE.getLiquidation_Manager();

		/**
		 * The meta object literal for the '<em><b>Liquidator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIQUIDATION_MANAGER__LIQUIDATOR = eINSTANCE.getLiquidation_Manager_Liquidator();

		/**
		 * The meta object literal for the '<em><b>Token manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIQUIDATION_MANAGER__TOKEN_MANAGER = eINSTANCE.getLiquidation_Manager_Token_manager();

		/**
		 * The meta object literal for the '<em><b>Mint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIQUIDATION_MANAGER___MINT = eINSTANCE.getLiquidation_Manager__Mint();

		/**
		 * The meta object literal for the '<em><b>Bum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIQUIDATION_MANAGER___BUM = eINSTANCE.getLiquidation_Manager__Bum();

		/**
		 * The meta object literal for the '<em><b>Update Liquidate Fee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIQUIDATION_MANAGER___UPDATE_LIQUIDATE_FEE = eINSTANCE.getLiquidation_Manager__UpdateLiquidateFee();

		/**
		 * The meta object literal for the '{@link metaModel.impl.LiquidatorImpl <em>Liquidator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.LiquidatorImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getLiquidator()
		 * @generated
		 */
		EClass LIQUIDATOR = eINSTANCE.getLiquidator();

		/**
		 * The meta object literal for the '<em><b>Initiate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIQUIDATOR___INITIATE = eINSTANCE.getLiquidator__Initiate();

		/**
		 * The meta object literal for the '{@link metaModel.impl.Reserves_ManagerImpl <em>Reserves Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.Reserves_ManagerImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getReserves_Manager()
		 * @generated
		 */
		EClass RESERVES_MANAGER = eINSTANCE.getReserves_Manager();

		/**
		 * The meta object literal for the '<em><b>Defi lending core</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVES_MANAGER__DEFI_LENDING_CORE = eINSTANCE.getReserves_Manager_Defi_lending_core();

		/**
		 * The meta object literal for the '<em><b>Token manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVES_MANAGER__TOKEN_MANAGER = eINSTANCE.getReserves_Manager_Token_manager();

		/**
		 * The meta object literal for the '<em><b>Activate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVES_MANAGER___ACTIVATE = eINSTANCE.getReserves_Manager__Activate();

		/**
		 * The meta object literal for the '<em><b>Deactivate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVES_MANAGER___DEACTIVATE = eINSTANCE.getReserves_Manager__Deactivate();

		/**
		 * The meta object literal for the '<em><b>Freeze</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVES_MANAGER___FREEZE = eINSTANCE.getReserves_Manager__Freeze();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVES_MANAGER___UPDATE = eINSTANCE.getReserves_Manager__Update();

		/**
		 * The meta object literal for the '<em><b>Unfreeze</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVES_MANAGER___UNFREEZE = eINSTANCE.getReserves_Manager__Unfreeze();

		/**
		 * The meta object literal for the '{@link metaModel.impl.DeFi_Lending_CoreImpl <em>De Fi Lending Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.DeFi_Lending_CoreImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getDeFi_Lending_Core()
		 * @generated
		 */
		EClass DE_FI_LENDING_CORE = eINSTANCE.getDeFi_Lending_Core();

		/**
		 * The meta object literal for the '<em><b>Data provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DE_FI_LENDING_CORE__DATA_PROVIDER = eINSTANCE.getDeFi_Lending_Core_Data_provider();

		/**
		 * The meta object literal for the '<em><b>Reserves manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DE_FI_LENDING_CORE__RESERVES_MANAGER = eINSTANCE.getDeFi_Lending_Core_Reserves_manager();

		/**
		 * The meta object literal for the '<em><b>Update State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DE_FI_LENDING_CORE___UPDATE_STATE = eINSTANCE.getDeFi_Lending_Core__UpdateState();

		/**
		 * The meta object literal for the '<em><b>Reserves State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DE_FI_LENDING_CORE___RESERVES_STATE = eINSTANCE.getDeFi_Lending_Core__ReservesState();

		/**
		 * The meta object literal for the '<em><b>Lending Pool Configurator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DE_FI_LENDING_CORE___LENDING_POOL_CONFIGURATOR = eINSTANCE
				.getDeFi_Lending_Core__LendingPoolConfigurator();

		/**
		 * The meta object literal for the '<em><b>Transfer To User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DE_FI_LENDING_CORE___TRANSFER_TO_USER = eINSTANCE.getDeFi_Lending_Core__TransferToUser();

		/**
		 * The meta object literal for the '{@link metaModel.impl.Data_ProviderImpl <em>Data Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.Data_ProviderImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getData_Provider()
		 * @generated
		 */
		EClass DATA_PROVIDER = eINSTANCE.getData_Provider();

		/**
		 * The meta object literal for the '<em><b>Defi lending core</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROVIDER__DEFI_LENDING_CORE = eINSTANCE.getData_Provider_Defi_lending_core();

		/**
		 * The meta object literal for the '<em><b>Oracleclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROVIDER__ORACLECLIENT = eINSTANCE.getData_Provider_Oracleclient();

		/**
		 * The meta object literal for the '<em><b>Price Oracle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PROVIDER___PRICE_ORACLE = eINSTANCE.getData_Provider__PriceOracle();

		/**
		 * The meta object literal for the '<em><b>Interest Rate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PROVIDER___INTEREST_RATE = eINSTANCE.getData_Provider__InterestRate();

		/**
		 * The meta object literal for the '{@link metaModel.impl.DeFi_Lending_PoolImpl <em>De Fi Lending Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.DeFi_Lending_PoolImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getDeFi_Lending_Pool()
		 * @generated
		 */
		EClass DE_FI_LENDING_POOL = eINSTANCE.getDeFi_Lending_Pool();

		/**
		 * The meta object literal for the '<em><b>Defi user</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DE_FI_LENDING_POOL__DEFI_USER = eINSTANCE.getDeFi_Lending_Pool_Defi_user();

		/**
		 * The meta object literal for the '<em><b>Defi lending core</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DE_FI_LENDING_POOL__DEFI_LENDING_CORE = eINSTANCE.getDeFi_Lending_Pool_Defi_lending_core();

		/**
		 * The meta object literal for the '<em><b>Lending Pool Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DE_FI_LENDING_POOL__LENDING_POOL_ADDRESS = eINSTANCE.getDeFi_Lending_Pool_LendingPoolAddress();

		/**
		 * The meta object literal for the '{@link metaModel.impl.DeFi_UserImpl <em>De Fi User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.DeFi_UserImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getDeFi_User()
		 * @generated
		 */
		EClass DE_FI_USER = eINSTANCE.getDeFi_User();

		/**
		 * The meta object literal for the '<em><b>Defi lending pool</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DE_FI_USER__DEFI_LENDING_POOL = eINSTANCE.getDeFi_User_Defi_lending_pool();

		/**
		 * The meta object literal for the '<em><b>Loan</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DE_FI_USER___LOAN = eINSTANCE.getDeFi_User__Loan();

		/**
		 * The meta object literal for the '<em><b>Deposit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DE_FI_USER___DEPOSIT = eINSTANCE.getDeFi_User__Deposit();

		/**
		 * The meta object literal for the '<em><b>Borrow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DE_FI_USER___BORROW = eINSTANCE.getDeFi_User__Borrow();

		/**
		 * The meta object literal for the '<em><b>Repay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DE_FI_USER___REPAY = eINSTANCE.getDeFi_User__Repay();

		/**
		 * The meta object literal for the '<em><b>Redeem</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DE_FI_USER___REDEEM = eINSTANCE.getDeFi_User__Redeem();

		/**
		 * The meta object literal for the '<em><b>Swap</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DE_FI_USER___SWAP = eINSTANCE.getDeFi_User__Swap();

		/**
		 * The meta object literal for the '<em><b>Recieve</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DE_FI_USER___RECIEVE = eINSTANCE.getDeFi_User__Recieve();

		/**
		 * The meta object literal for the '<em>Address DType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see metaModel.impl.MetaModelPackageImpl#getAddressDType()
		 * @generated
		 */
		EDataType ADDRESS_DTYPE = eINSTANCE.getAddressDType();

	}

} //MetaModelPackage
