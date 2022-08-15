/**
 */
package metaModel.provider;

import java.util.Collection;
import java.util.List;

import metaModel.MetaModelPackage;
import metaModel.Token_Manager;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link metaModel.Token_Manager} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Token_ManagerItemProvider extends TokenItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token_ManagerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAddressPropertyDescriptor(object);
			addDappPropertyDescriptor(object);
			addSymbolPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTotalSupplyPropertyDescriptor(object);
			addSafemathPropertyDescriptor(object);
			addBalancesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Contract_address_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Contract_address_feature",
								"_UI_Contract_type"),
						MetaModelPackage.Literals.CONTRACT__ADDRESS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Dapp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDappPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Contract_dapp_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Contract_dapp_feature",
								"_UI_Contract_type"),
						MetaModelPackage.Literals.CONTRACT__DAPP, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Symbol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSymbolPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Token_Manager_symbol_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Token_Manager_symbol_feature",
								"_UI_Token_Manager_type"),
						MetaModelPackage.Literals.TOKEN_MANAGER__SYMBOL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Token_Manager_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Token_Manager_name_feature",
								"_UI_Token_Manager_type"),
						MetaModelPackage.Literals.TOKEN_MANAGER__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Total Supply feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalSupplyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Token_Manager_totalSupply_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Token_Manager_totalSupply_feature",
								"_UI_Token_Manager_type"),
						MetaModelPackage.Literals.TOKEN_MANAGER__TOTAL_SUPPLY, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Safemath feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSafemathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Token_Manager_safemath_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Token_Manager_safemath_feature",
								"_UI_Token_Manager_type"),
						MetaModelPackage.Literals.TOKEN_MANAGER__SAFEMATH, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Balances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBalancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Token_Manager_balances_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Token_Manager_balances_feature",
								"_UI_Token_Manager_type"),
						MetaModelPackage.Literals.TOKEN_MANAGER__BALANCES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Token_Manager.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Token_Manager"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Token_Manager) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Token_Manager_type")
				: getString("_UI_Token_Manager_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Token_Manager.class)) {
		case MetaModelPackage.TOKEN_MANAGER__SYMBOL:
		case MetaModelPackage.TOKEN_MANAGER__NAME:
		case MetaModelPackage.TOKEN_MANAGER__TOTAL_SUPPLY:
		case MetaModelPackage.TOKEN_MANAGER__BALANCES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
