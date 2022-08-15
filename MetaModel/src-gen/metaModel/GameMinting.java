/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Minting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.GameMinting#getPromold <em>Promold</em>}</li>
 *   <li>{@link metaModel.GameMinting#getCount <em>Count</em>}</li>
 *   <li>{@link metaModel.GameMinting#getAuctionId <em>Auction Id</em>}</li>
 *   <li>{@link metaModel.GameMinting#getToken_manager <em>Token manager</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getGameMinting()
 * @model
 * @generated
 */
public interface GameMinting extends EObject {
	/**
	 * Returns the value of the '<em><b>Promold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promold</em>' attribute.
	 * @see #setPromold(int)
	 * @see metaModel.MetaModelPackage#getGameMinting_Promold()
	 * @model
	 * @generated
	 */
	int getPromold();

	/**
	 * Sets the value of the '{@link metaModel.GameMinting#getPromold <em>Promold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promold</em>' attribute.
	 * @see #getPromold()
	 * @generated
	 */
	void setPromold(int value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see metaModel.MetaModelPackage#getGameMinting_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link metaModel.GameMinting#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Auction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auction Id</em>' attribute.
	 * @see #setAuctionId(int)
	 * @see metaModel.MetaModelPackage#getGameMinting_AuctionId()
	 * @model
	 * @generated
	 */
	int getAuctionId();

	/**
	 * Sets the value of the '{@link metaModel.GameMinting#getAuctionId <em>Auction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auction Id</em>' attribute.
	 * @see #getAuctionId()
	 * @generated
	 */
	void setAuctionId(int value);

	/**
	 * Returns the value of the '<em><b>Token manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token manager</em>' reference.
	 * @see #setToken_manager(Token_Manager)
	 * @see metaModel.MetaModelPackage#getGameMinting_Token_manager()
	 * @model
	 * @generated
	 */
	Token_Manager getToken_manager();

	/**
	 * Sets the value of the '{@link metaModel.GameMinting#getToken_manager <em>Token manager</em>}' reference.
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
	void computeNetPrice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createPromo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createAuction();

} // GameMinting
