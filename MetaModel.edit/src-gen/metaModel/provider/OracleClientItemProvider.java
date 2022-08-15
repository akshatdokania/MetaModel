/**
 */
package metaModel.provider;

import java.util.Collection;
import java.util.List;

import metaModel.MetaModelFactory;
import metaModel.MetaModelPackage;
import metaModel.OracleClient;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link metaModel.OracleClient} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OracleClientItemProvider extends ContractItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleClientItemProvider(AdapterFactory adapterFactory) {
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

			addBufferPropertyDescriptor(object);
			addRegistryPropertyDescriptor(object);
			addLinkPropertyDescriptor(object);
			addOraclePropertyDescriptor(object);
			addRequestPropertyDescriptor(object);
			addCborPropertyDescriptor(object);
			addPendingRequestsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Buffer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBufferPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OracleClient_buffer_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OracleClient_buffer_feature",
								"_UI_OracleClient_type"),
						MetaModelPackage.Literals.ORACLE_CLIENT__BUFFER, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Registry feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegistryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OracleClient_registry_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OracleClient_registry_feature",
								"_UI_OracleClient_type"),
						MetaModelPackage.Literals.ORACLE_CLIENT__REGISTRY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OracleClient_link_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OracleClient_link_feature",
								"_UI_OracleClient_type"),
						MetaModelPackage.Literals.ORACLE_CLIENT__LINK, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Oracle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOraclePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OracleClient_oracle_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OracleClient_oracle_feature",
								"_UI_OracleClient_type"),
						MetaModelPackage.Literals.ORACLE_CLIENT__ORACLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Request feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OracleClient_request_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OracleClient_request_feature",
								"_UI_OracleClient_type"),
						MetaModelPackage.Literals.ORACLE_CLIENT__REQUEST, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cbor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCborPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OracleClient_cbor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OracleClient_cbor_feature",
								"_UI_OracleClient_type"),
						MetaModelPackage.Literals.ORACLE_CLIENT__CBOR, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Pending Requests feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPendingRequestsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OracleClient_pendingRequests_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OracleClient_pendingRequests_feature",
								"_UI_OracleClient_type"),
						MetaModelPackage.Literals.ORACLE_CLIENT__PENDING_REQUESTS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MetaModelPackage.Literals.ORACLE_CLIENT__ORACLE_REF);
			childrenFeatures.add(MetaModelPackage.Literals.ORACLE_CLIENT__REQUEST_REF);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns OracleClient.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OracleClient"));
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
		String label = ((OracleClient) object).getRegistry();
		return label == null || label.length() == 0 ? getString("_UI_OracleClient_type")
				: getString("_UI_OracleClient_type") + " " + label;
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

		switch (notification.getFeatureID(OracleClient.class)) {
		case MetaModelPackage.ORACLE_CLIENT__REGISTRY:
		case MetaModelPackage.ORACLE_CLIENT__LINK:
		case MetaModelPackage.ORACLE_CLIENT__ORACLE:
		case MetaModelPackage.ORACLE_CLIENT__REQUEST:
		case MetaModelPackage.ORACLE_CLIENT__PENDING_REQUESTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MetaModelPackage.ORACLE_CLIENT__ORACLE_REF:
		case MetaModelPackage.ORACLE_CLIENT__REQUEST_REF:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(MetaModelPackage.Literals.ORACLE_CLIENT__ORACLE_REF,
				MetaModelFactory.eINSTANCE.createOracle()));

		newChildDescriptors.add(createChildParameter(MetaModelPackage.Literals.ORACLE_CLIENT__REQUEST_REF,
				MetaModelFactory.eINSTANCE.createRequest()));
	}

}
