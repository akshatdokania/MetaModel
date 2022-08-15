/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Player Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.GamePlayer_Manager#getPlayer <em>Player</em>}</li>
 *   <li>{@link metaModel.GamePlayer_Manager#getAdmin <em>Admin</em>}</li>
 *   <li>{@link metaModel.GamePlayer_Manager#getPlayers <em>Players</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getGamePlayer_Manager()
 * @model
 * @generated
 */
public interface GamePlayer_Manager extends EObject {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.Player#getGameplayer_manager <em>Gameplayer manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see metaModel.MetaModelPackage#getGamePlayer_Manager_Player()
	 * @see metaModel.Player#getGameplayer_manager
	 * @model opposite="gameplayer_manager"
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link metaModel.GamePlayer_Manager#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin</em>' attribute.
	 * @see #setAdmin(String)
	 * @see metaModel.MetaModelPackage#getGamePlayer_Manager_Admin()
	 * @model dataType="metaModel.AddressDType"
	 * @generated
	 */
	String getAdmin();

	/**
	 * Sets the value of the '{@link metaModel.GamePlayer_Manager#getAdmin <em>Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin</em>' attribute.
	 * @see #getAdmin()
	 * @generated
	 */
	void setAdmin(String value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' attribute.
	 * @see #setPlayers(Object)
	 * @see metaModel.MetaModelPackage#getGamePlayer_Manager_Players()
	 * @model
	 * @generated
	 */
	Object getPlayers();

	/**
	 * Sets the value of the '{@link metaModel.GamePlayer_Manager#getPlayers <em>Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Players</em>' attribute.
	 * @see #getPlayers()
	 * @generated
	 */
	void setPlayers(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPlayer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removePlayer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void editPlayer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void findPlayer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void exist();

} // GamePlayer_Manager
