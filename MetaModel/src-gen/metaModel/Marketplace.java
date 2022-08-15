/**
 */
package metaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marketplace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Marketplace#getOrders <em>Orders</em>}</li>
 *   <li>{@link metaModel.Marketplace#getAuctions <em>Auctions</em>}</li>
 *   <li>{@link metaModel.Marketplace#getToken <em>Token</em>}</li>
 *   <li>{@link metaModel.Marketplace#getPublicationFee <em>Publication Fee</em>}</li>
 *   <li>{@link metaModel.Marketplace#getToken_manager <em>Token manager</em>}</li>
 *   <li>{@link metaModel.Marketplace#getRegistry <em>Registry</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getMarketplace()
 * @model
 * @generated
 */
public interface Marketplace extends Contract {
	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.Orders}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getMarketplace_Orders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Orders> getOrders();

	/**
	 * Returns the value of the '<em><b>Auctions</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.Auction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auctions</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getMarketplace_Auctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Auction> getAuctions();

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(Object)
	 * @see metaModel.MetaModelPackage#getMarketplace_Token()
	 * @model
	 * @generated
	 */
	Object getToken();

	/**
	 * Sets the value of the '{@link metaModel.Marketplace#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Object value);

	/**
	 * Returns the value of the '<em><b>Publication Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Fee</em>' attribute.
	 * @see #setPublicationFee(int)
	 * @see metaModel.MetaModelPackage#getMarketplace_PublicationFee()
	 * @model
	 * @generated
	 */
	int getPublicationFee();

	/**
	 * Sets the value of the '{@link metaModel.Marketplace#getPublicationFee <em>Publication Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Fee</em>' attribute.
	 * @see #getPublicationFee()
	 * @generated
	 */
	void setPublicationFee(int value);

	/**
	 * Returns the value of the '<em><b>Token manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token manager</em>' reference.
	 * @see #setToken_manager(Token_Manager)
	 * @see metaModel.MetaModelPackage#getMarketplace_Token_manager()
	 * @model
	 * @generated
	 */
	Token_Manager getToken_manager();

	/**
	 * Sets the value of the '{@link metaModel.Marketplace#getToken_manager <em>Token manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token manager</em>' reference.
	 * @see #getToken_manager()
	 * @generated
	 */
	void setToken_manager(Token_Manager value);

	/**
	 * Returns the value of the '<em><b>Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry</em>' attribute.
	 * @see #setRegistry(Object)
	 * @see metaModel.MetaModelPackage#getMarketplace_Registry()
	 * @model
	 * @generated
	 */
	Object getRegistry();

	/**
	 * Sets the value of the '{@link metaModel.Marketplace#getRegistry <em>Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry</em>' attribute.
	 * @see #getRegistry()
	 * @generated
	 */
	void setRegistry(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createAuction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancelAuction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeOwner();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setPublicationFee();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createOrder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancelOrder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void executeOrder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setOwnerCut();

} // Marketplace
