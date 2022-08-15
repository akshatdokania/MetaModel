/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Auction#getId <em>Id</em>}</li>
 *   <li>{@link metaModel.Auction#getSeller <em>Seller</em>}</li>
 *   <li>{@link metaModel.Auction#getPrice <em>Price</em>}</li>
 *   <li>{@link metaModel.Auction#getExpiresAt <em>Expires At</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getAuction()
 * @model
 * @generated
 */
public interface Auction extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see metaModel.MetaModelPackage#getAuction_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link metaModel.Auction#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Seller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seller</em>' attribute.
	 * @see #setSeller(String)
	 * @see metaModel.MetaModelPackage#getAuction_Seller()
	 * @model dataType="metaModel.AddressDType"
	 * @generated
	 */
	String getSeller();

	/**
	 * Sets the value of the '{@link metaModel.Auction#getSeller <em>Seller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seller</em>' attribute.
	 * @see #getSeller()
	 * @generated
	 */
	void setSeller(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see metaModel.MetaModelPackage#getAuction_Price()
	 * @model
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link metaModel.Auction#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Expires At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expires At</em>' attribute.
	 * @see #setExpiresAt(int)
	 * @see metaModel.MetaModelPackage#getAuction_ExpiresAt()
	 * @model
	 * @generated
	 */
	int getExpiresAt();

	/**
	 * Sets the value of the '{@link metaModel.Auction#getExpiresAt <em>Expires At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires At</em>' attribute.
	 * @see #getExpiresAt()
	 * @generated
	 */
	void setExpiresAt(int value);

} // Auction
