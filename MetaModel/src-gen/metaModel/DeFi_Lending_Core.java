/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>De Fi Lending Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.DeFi_Lending_Core#getData_provider <em>Data provider</em>}</li>
 *   <li>{@link metaModel.DeFi_Lending_Core#getReserves_manager <em>Reserves manager</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getDeFi_Lending_Core()
 * @model
 * @generated
 */
public interface DeFi_Lending_Core extends EObject {
	/**
	 * Returns the value of the '<em><b>Data provider</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.Data_Provider#getDefi_lending_core <em>Defi lending core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data provider</em>' reference.
	 * @see #setData_provider(Data_Provider)
	 * @see metaModel.MetaModelPackage#getDeFi_Lending_Core_Data_provider()
	 * @see metaModel.Data_Provider#getDefi_lending_core
	 * @model opposite="defi_lending_core"
	 * @generated
	 */
	Data_Provider getData_provider();

	/**
	 * Sets the value of the '{@link metaModel.DeFi_Lending_Core#getData_provider <em>Data provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data provider</em>' reference.
	 * @see #getData_provider()
	 * @generated
	 */
	void setData_provider(Data_Provider value);

	/**
	 * Returns the value of the '<em><b>Reserves manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.Reserves_Manager#getDefi_lending_core <em>Defi lending core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserves manager</em>' reference.
	 * @see #setReserves_manager(Reserves_Manager)
	 * @see metaModel.MetaModelPackage#getDeFi_Lending_Core_Reserves_manager()
	 * @see metaModel.Reserves_Manager#getDefi_lending_core
	 * @model opposite="defi_lending_core"
	 * @generated
	 */
	Reserves_Manager getReserves_manager();

	/**
	 * Sets the value of the '{@link metaModel.DeFi_Lending_Core#getReserves_manager <em>Reserves manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserves manager</em>' reference.
	 * @see #getReserves_manager()
	 * @generated
	 */
	void setReserves_manager(Reserves_Manager value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reservesState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void lendingPoolConfigurator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void transferToUser();

} // DeFi_Lending_Core
