/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.GameCore#getGameplayer_manager <em>Gameplayer manager</em>}</li>
 *   <li>{@link metaModel.GameCore#getGameminting <em>Gameminting</em>}</li>
 *   <li>{@link metaModel.GameCore#getNewPlayerAddress <em>New Player Address</em>}</li>
 *   <li>{@link metaModel.GameCore#getActive_players <em>Active players</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getGameCore()
 * @model
 * @generated
 */
public interface GameCore extends EObject {
	/**
	 * Returns the value of the '<em><b>Gameplayer manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameplayer manager</em>' reference.
	 * @see #setGameplayer_manager(GamePlayer_Manager)
	 * @see metaModel.MetaModelPackage#getGameCore_Gameplayer_manager()
	 * @model
	 * @generated
	 */
	GamePlayer_Manager getGameplayer_manager();

	/**
	 * Sets the value of the '{@link metaModel.GameCore#getGameplayer_manager <em>Gameplayer manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gameplayer manager</em>' reference.
	 * @see #getGameplayer_manager()
	 * @generated
	 */
	void setGameplayer_manager(GamePlayer_Manager value);

	/**
	 * Returns the value of the '<em><b>Gameminting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameminting</em>' reference.
	 * @see #setGameminting(GameMinting)
	 * @see metaModel.MetaModelPackage#getGameCore_Gameminting()
	 * @model
	 * @generated
	 */
	GameMinting getGameminting();

	/**
	 * Sets the value of the '{@link metaModel.GameCore#getGameminting <em>Gameminting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gameminting</em>' reference.
	 * @see #getGameminting()
	 * @generated
	 */
	void setGameminting(GameMinting value);

	/**
	 * Returns the value of the '<em><b>New Player Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Player Address</em>' attribute.
	 * @see #setNewPlayerAddress(String)
	 * @see metaModel.MetaModelPackage#getGameCore_NewPlayerAddress()
	 * @model dataType="metaModel.AddressDType"
	 * @generated
	 */
	String getNewPlayerAddress();

	/**
	 * Sets the value of the '{@link metaModel.GameCore#getNewPlayerAddress <em>New Player Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Player Address</em>' attribute.
	 * @see #getNewPlayerAddress()
	 * @generated
	 */
	void setNewPlayerAddress(String value);

	/**
	 * Returns the value of the '<em><b>Active players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active players</em>' attribute.
	 * @see #setActive_players(Object)
	 * @see metaModel.MetaModelPackage#getGameCore_Active_players()
	 * @model
	 * @generated
	 */
	Object getActive_players();

	/**
	 * Sets the value of the '{@link metaModel.GameCore#getActive_players <em>Active players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active players</em>' attribute.
	 * @see #getActive_players()
	 * @generated
	 */
	void setActive_players(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setNewAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getCollectible();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void withdraw();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void join();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ping();

} // GameCore
