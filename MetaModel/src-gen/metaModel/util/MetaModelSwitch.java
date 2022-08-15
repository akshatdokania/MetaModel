/**
 */
package metaModel.util;

import metaModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see metaModel.MetaModelPackage
 * @generated
 */
public class MetaModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelSwitch() {
		if (modelPackage == null) {
			modelPackage = MetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MetaModelPackage.BLOCKCHAIN: {
			Blockchain blockchain = (Blockchain) theEObject;
			T result = caseBlockchain(blockchain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.BLOCK: {
			Block block = (Block) theEObject;
			T result = caseBlock(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.TRANSACTION: {
			Transaction transaction = (Transaction) theEObject;
			T result = caseTransaction(transaction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.ADDRESS: {
			Address address = (Address) theEObject;
			T result = caseAddress(address);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.CONTRACT: {
			Contract contract = (Contract) theEObject;
			T result = caseContract(contract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.DAPP: {
			DApp dApp = (DApp) theEObject;
			T result = caseDApp(dApp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.WALLET: {
			Wallet wallet = (Wallet) theEObject;
			T result = caseWallet(wallet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.USER: {
			User user = (User) theEObject;
			T result = caseUser(user);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.PLAYER: {
			Player player = (Player) theEObject;
			T result = casePlayer(player);
			if (result == null)
				result = caseContract(player);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.GAME_PLAYER_MANAGER: {
			GamePlayer_Manager gamePlayer_Manager = (GamePlayer_Manager) theEObject;
			T result = caseGamePlayer_Manager(gamePlayer_Manager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.GAME_CORE: {
			GameCore gameCore = (GameCore) theEObject;
			T result = caseGameCore(gameCore);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.GAME_MINTING: {
			GameMinting gameMinting = (GameMinting) theEObject;
			T result = caseGameMinting(gameMinting);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.SIGNATURE_VALIDATOR: {
			SignatureValidator signatureValidator = (SignatureValidator) theEObject;
			T result = caseSignatureValidator(signatureValidator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.SIGNATURE_REGISTRY: {
			SignatureRegistry signatureRegistry = (SignatureRegistry) theEObject;
			T result = caseSignatureRegistry(signatureRegistry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.SIGNATURE: {
			Signature signature = (Signature) theEObject;
			T result = caseSignature(signature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.ECDSA: {
			ECDSA ecdsa = (ECDSA) theEObject;
			T result = caseECDSA(ecdsa);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.TOKEN_MANAGER: {
			Token_Manager token_Manager = (Token_Manager) theEObject;
			T result = caseToken_Manager(token_Manager);
			if (result == null)
				result = caseToken(token_Manager);
			if (result == null)
				result = caseContract(token_Manager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.TOKEN: {
			Token token = (Token) theEObject;
			T result = caseToken(token);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.SAFE_MATH: {
			SafeMath safeMath = (SafeMath) theEObject;
			T result = caseSafeMath(safeMath);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.ORACLE_CLIENT: {
			OracleClient oracleClient = (OracleClient) theEObject;
			T result = caseOracleClient(oracleClient);
			if (result == null)
				result = caseContract(oracleClient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.ORACLE: {
			Oracle oracle = (Oracle) theEObject;
			T result = caseOracle(oracle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.REQUEST: {
			Request request = (Request) theEObject;
			T result = caseRequest(request);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.BUFFER: {
			Buffer buffer = (Buffer) theEObject;
			T result = caseBuffer(buffer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.BUFFER_MANAGER: {
			Buffer_Manager buffer_Manager = (Buffer_Manager) theEObject;
			T result = caseBuffer_Manager(buffer_Manager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.CBOR: {
			CBOR cbor = (CBOR) theEObject;
			T result = caseCBOR(cbor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.EXCHANGE: {
			Exchange exchange = (Exchange) theEObject;
			T result = caseExchange(exchange);
			if (result == null)
				result = caseContract(exchange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.CURRENCY: {
			Currency currency = (Currency) theEObject;
			T result = caseCurrency(currency);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.MARKETPLACE: {
			Marketplace marketplace = (Marketplace) theEObject;
			T result = caseMarketplace(marketplace);
			if (result == null)
				result = caseContract(marketplace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.ORDERS: {
			Orders orders = (Orders) theEObject;
			T result = caseOrders(orders);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.ITEM: {
			Item item = (Item) theEObject;
			T result = caseItem(item);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.AUCTION: {
			Auction auction = (Auction) theEObject;
			T result = caseAuction(auction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.LIQUIDATION_MANAGER: {
			Liquidation_Manager liquidation_Manager = (Liquidation_Manager) theEObject;
			T result = caseLiquidation_Manager(liquidation_Manager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.LIQUIDATOR: {
			Liquidator liquidator = (Liquidator) theEObject;
			T result = caseLiquidator(liquidator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.RESERVES_MANAGER: {
			Reserves_Manager reserves_Manager = (Reserves_Manager) theEObject;
			T result = caseReserves_Manager(reserves_Manager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.DE_FI_LENDING_CORE: {
			DeFi_Lending_Core deFi_Lending_Core = (DeFi_Lending_Core) theEObject;
			T result = caseDeFi_Lending_Core(deFi_Lending_Core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.DATA_PROVIDER: {
			Data_Provider data_Provider = (Data_Provider) theEObject;
			T result = caseData_Provider(data_Provider);
			if (result == null)
				result = caseOracleClient(data_Provider);
			if (result == null)
				result = caseContract(data_Provider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.DE_FI_LENDING_POOL: {
			DeFi_Lending_Pool deFi_Lending_Pool = (DeFi_Lending_Pool) theEObject;
			T result = caseDeFi_Lending_Pool(deFi_Lending_Pool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelPackage.DE_FI_USER: {
			DeFi_User deFi_User = (DeFi_User) theEObject;
			T result = caseDeFi_User(deFi_User);
			if (result == null)
				result = caseContract(deFi_User);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blockchain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blockchain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockchain(Blockchain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransaction(Transaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContract(Contract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DApp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DApp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDApp(DApp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wallet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wallet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWallet(Wallet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayer(Player object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Player Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Player Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGamePlayer_Manager(GamePlayer_Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameCore(GameCore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Minting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Minting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameMinting(GameMinting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatureValidator(SignatureValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatureRegistry(SignatureRegistry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignature(Signature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECDSA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECDSA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECDSA(ECDSA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken_Manager(Token_Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken(Token object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safe Math</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safe Math</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafeMath(SafeMath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oracle Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oracle Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOracleClient(OracleClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oracle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oracle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOracle(Oracle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequest(Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuffer(Buffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuffer_Manager(Buffer_Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CBOR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CBOR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCBOR(CBOR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchange(Exchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrency(Currency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marketplace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marketplace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketplace(Marketplace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orders</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orders</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrders(Orders object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuction(Auction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Liquidation Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Liquidation Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiquidation_Manager(Liquidation_Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Liquidator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Liquidator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiquidator(Liquidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserves Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserves Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReserves_Manager(Reserves_Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>De Fi Lending Core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>De Fi Lending Core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeFi_Lending_Core(DeFi_Lending_Core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData_Provider(Data_Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>De Fi Lending Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>De Fi Lending Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeFi_Lending_Pool(DeFi_Lending_Pool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>De Fi User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>De Fi User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeFi_User(DeFi_User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MetaModelSwitch
