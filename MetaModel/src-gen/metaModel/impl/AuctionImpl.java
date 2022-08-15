/**
 */
package metaModel.impl;

import metaModel.Auction;
import metaModel.MetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.AuctionImpl#getId <em>Id</em>}</li>
 *   <li>{@link metaModel.impl.AuctionImpl#getSeller <em>Seller</em>}</li>
 *   <li>{@link metaModel.impl.AuctionImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link metaModel.impl.AuctionImpl#getExpiresAt <em>Expires At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuctionImpl extends MinimalEObjectImpl.Container implements Auction {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeller() <em>Seller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeller()
	 * @generated
	 * @ordered
	 */
	protected static final String SELLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeller() <em>Seller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeller()
	 * @generated
	 * @ordered
	 */
	protected String seller = SELLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiresAt() <em>Expires At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiresAt()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPIRES_AT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpiresAt() <em>Expires At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiresAt()
	 * @generated
	 * @ordered
	 */
	protected int expiresAt = EXPIRES_AT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.AUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.AUCTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeller() {
		return seller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeller(String newSeller) {
		String oldSeller = seller;
		seller = newSeller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.AUCTION__SELLER, oldSeller, seller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.AUCTION__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpiresAt() {
		return expiresAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiresAt(int newExpiresAt) {
		int oldExpiresAt = expiresAt;
		expiresAt = newExpiresAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.AUCTION__EXPIRES_AT, oldExpiresAt,
					expiresAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModelPackage.AUCTION__ID:
			return getId();
		case MetaModelPackage.AUCTION__SELLER:
			return getSeller();
		case MetaModelPackage.AUCTION__PRICE:
			return getPrice();
		case MetaModelPackage.AUCTION__EXPIRES_AT:
			return getExpiresAt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetaModelPackage.AUCTION__ID:
			setId((Integer) newValue);
			return;
		case MetaModelPackage.AUCTION__SELLER:
			setSeller((String) newValue);
			return;
		case MetaModelPackage.AUCTION__PRICE:
			setPrice((Integer) newValue);
			return;
		case MetaModelPackage.AUCTION__EXPIRES_AT:
			setExpiresAt((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetaModelPackage.AUCTION__ID:
			setId(ID_EDEFAULT);
			return;
		case MetaModelPackage.AUCTION__SELLER:
			setSeller(SELLER_EDEFAULT);
			return;
		case MetaModelPackage.AUCTION__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case MetaModelPackage.AUCTION__EXPIRES_AT:
			setExpiresAt(EXPIRES_AT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetaModelPackage.AUCTION__ID:
			return id != ID_EDEFAULT;
		case MetaModelPackage.AUCTION__SELLER:
			return SELLER_EDEFAULT == null ? seller != null : !SELLER_EDEFAULT.equals(seller);
		case MetaModelPackage.AUCTION__PRICE:
			return price != PRICE_EDEFAULT;
		case MetaModelPackage.AUCTION__EXPIRES_AT:
			return expiresAt != EXPIRES_AT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", seller: ");
		result.append(seller);
		result.append(", price: ");
		result.append(price);
		result.append(", expiresAt: ");
		result.append(expiresAt);
		result.append(')');
		return result.toString();
	}

} //AuctionImpl
