/**
 */
package metaModel.util;

import metaModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see metaModel.MetaModelPackage
 * @generated
 */
public class MetaModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaModelSwitch<Adapter> modelSwitch = new MetaModelSwitch<Adapter>() {
		@Override
		public Adapter caseBlockchain(Blockchain object) {
			return createBlockchainAdapter();
		}

		@Override
		public Adapter caseBlock(Block object) {
			return createBlockAdapter();
		}

		@Override
		public Adapter caseTransaction(Transaction object) {
			return createTransactionAdapter();
		}

		@Override
		public Adapter caseAddress(Address object) {
			return createAddressAdapter();
		}

		@Override
		public Adapter caseContract(Contract object) {
			return createContractAdapter();
		}

		@Override
		public Adapter caseDApp(DApp object) {
			return createDAppAdapter();
		}

		@Override
		public Adapter caseWallet(Wallet object) {
			return createWalletAdapter();
		}

		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter casePlayer(Player object) {
			return createPlayerAdapter();
		}

		@Override
		public Adapter caseGamePlayer_Manager(GamePlayer_Manager object) {
			return createGamePlayer_ManagerAdapter();
		}

		@Override
		public Adapter caseGameCore(GameCore object) {
			return createGameCoreAdapter();
		}

		@Override
		public Adapter caseGameMinting(GameMinting object) {
			return createGameMintingAdapter();
		}

		@Override
		public Adapter caseSignatureValidator(SignatureValidator object) {
			return createSignatureValidatorAdapter();
		}

		@Override
		public Adapter caseSignatureRegistry(SignatureRegistry object) {
			return createSignatureRegistryAdapter();
		}

		@Override
		public Adapter caseSignature(Signature object) {
			return createSignatureAdapter();
		}

		@Override
		public Adapter caseECDSA(ECDSA object) {
			return createECDSAAdapter();
		}

		@Override
		public Adapter caseToken_Manager(Token_Manager object) {
			return createToken_ManagerAdapter();
		}

		@Override
		public Adapter caseToken(Token object) {
			return createTokenAdapter();
		}

		@Override
		public Adapter caseSafeMath(SafeMath object) {
			return createSafeMathAdapter();
		}

		@Override
		public Adapter caseOracleClient(OracleClient object) {
			return createOracleClientAdapter();
		}

		@Override
		public Adapter caseOracle(Oracle object) {
			return createOracleAdapter();
		}

		@Override
		public Adapter caseRequest(Request object) {
			return createRequestAdapter();
		}

		@Override
		public Adapter caseBuffer(Buffer object) {
			return createBufferAdapter();
		}

		@Override
		public Adapter caseBuffer_Manager(Buffer_Manager object) {
			return createBuffer_ManagerAdapter();
		}

		@Override
		public Adapter caseCBOR(CBOR object) {
			return createCBORAdapter();
		}

		@Override
		public Adapter caseExchange(Exchange object) {
			return createExchangeAdapter();
		}

		@Override
		public Adapter caseCurrency(Currency object) {
			return createCurrencyAdapter();
		}

		@Override
		public Adapter caseMarketplace(Marketplace object) {
			return createMarketplaceAdapter();
		}

		@Override
		public Adapter caseOrders(Orders object) {
			return createOrdersAdapter();
		}

		@Override
		public Adapter caseItem(Item object) {
			return createItemAdapter();
		}

		@Override
		public Adapter caseAuction(Auction object) {
			return createAuctionAdapter();
		}

		@Override
		public Adapter caseLiquidation_Manager(Liquidation_Manager object) {
			return createLiquidation_ManagerAdapter();
		}

		@Override
		public Adapter caseLiquidator(Liquidator object) {
			return createLiquidatorAdapter();
		}

		@Override
		public Adapter caseReserves_Manager(Reserves_Manager object) {
			return createReserves_ManagerAdapter();
		}

		@Override
		public Adapter caseDeFi_Lending_Core(DeFi_Lending_Core object) {
			return createDeFi_Lending_CoreAdapter();
		}

		@Override
		public Adapter caseData_Provider(Data_Provider object) {
			return createData_ProviderAdapter();
		}

		@Override
		public Adapter caseDeFi_Lending_Pool(DeFi_Lending_Pool object) {
			return createDeFi_Lending_PoolAdapter();
		}

		@Override
		public Adapter caseDeFi_User(DeFi_User object) {
			return createDeFi_UserAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Blockchain <em>Blockchain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Blockchain
	 * @generated
	 */
	public Adapter createBlockchainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Transaction
	 * @generated
	 */
	public Adapter createTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.DApp <em>DApp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.DApp
	 * @generated
	 */
	public Adapter createDAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Wallet <em>Wallet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Wallet
	 * @generated
	 */
	public Adapter createWalletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.GamePlayer_Manager <em>Game Player Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.GamePlayer_Manager
	 * @generated
	 */
	public Adapter createGamePlayer_ManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.GameCore <em>Game Core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.GameCore
	 * @generated
	 */
	public Adapter createGameCoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.GameMinting <em>Game Minting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.GameMinting
	 * @generated
	 */
	public Adapter createGameMintingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.SignatureValidator <em>Signature Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.SignatureValidator
	 * @generated
	 */
	public Adapter createSignatureValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.SignatureRegistry <em>Signature Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.SignatureRegistry
	 * @generated
	 */
	public Adapter createSignatureRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Signature
	 * @generated
	 */
	public Adapter createSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.ECDSA <em>ECDSA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.ECDSA
	 * @generated
	 */
	public Adapter createECDSAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Token_Manager <em>Token Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Token_Manager
	 * @generated
	 */
	public Adapter createToken_ManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.SafeMath <em>Safe Math</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.SafeMath
	 * @generated
	 */
	public Adapter createSafeMathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.OracleClient <em>Oracle Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.OracleClient
	 * @generated
	 */
	public Adapter createOracleClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Oracle <em>Oracle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Oracle
	 * @generated
	 */
	public Adapter createOracleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Buffer
	 * @generated
	 */
	public Adapter createBufferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Buffer_Manager <em>Buffer Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Buffer_Manager
	 * @generated
	 */
	public Adapter createBuffer_ManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.CBOR <em>CBOR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.CBOR
	 * @generated
	 */
	public Adapter createCBORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Exchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Exchange
	 * @generated
	 */
	public Adapter createExchangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Currency
	 * @generated
	 */
	public Adapter createCurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Marketplace <em>Marketplace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Marketplace
	 * @generated
	 */
	public Adapter createMarketplaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Orders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Orders
	 * @generated
	 */
	public Adapter createOrdersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Auction <em>Auction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Auction
	 * @generated
	 */
	public Adapter createAuctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Liquidation_Manager <em>Liquidation Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Liquidation_Manager
	 * @generated
	 */
	public Adapter createLiquidation_ManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Liquidator <em>Liquidator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Liquidator
	 * @generated
	 */
	public Adapter createLiquidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Reserves_Manager <em>Reserves Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Reserves_Manager
	 * @generated
	 */
	public Adapter createReserves_ManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.DeFi_Lending_Core <em>De Fi Lending Core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.DeFi_Lending_Core
	 * @generated
	 */
	public Adapter createDeFi_Lending_CoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Data_Provider <em>Data Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Data_Provider
	 * @generated
	 */
	public Adapter createData_ProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.DeFi_Lending_Pool <em>De Fi Lending Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.DeFi_Lending_Pool
	 * @generated
	 */
	public Adapter createDeFi_Lending_PoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.DeFi_User <em>De Fi User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.DeFi_User
	 * @generated
	 */
	public Adapter createDeFi_UserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetaModelAdapterFactory
