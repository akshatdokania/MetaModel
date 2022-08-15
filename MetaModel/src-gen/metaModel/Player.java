/**
 */
package metaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Player#getGameplayer_manager <em>Gameplayer manager</em>}</li>
 *   <li>{@link metaModel.Player#getId <em>Id</em>}</li>
 *   <li>{@link metaModel.Player#getName <em>Name</em>}</li>
 *   <li>{@link metaModel.Player#getAddr <em>Addr</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends Contract {
	/**
	 * Returns the value of the '<em><b>Gameplayer manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.GamePlayer_Manager#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameplayer manager</em>' reference.
	 * @see #setGameplayer_manager(GamePlayer_Manager)
	 * @see metaModel.MetaModelPackage#getPlayer_Gameplayer_manager()
	 * @see metaModel.GamePlayer_Manager#getPlayer
	 * @model opposite="player"
	 * @generated
	 */
	GamePlayer_Manager getGameplayer_manager();

	/**
	 * Sets the value of the '{@link metaModel.Player#getGameplayer_manager <em>Gameplayer manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gameplayer manager</em>' reference.
	 * @see #getGameplayer_manager()
	 * @generated
	 */
	void setGameplayer_manager(GamePlayer_Manager value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see metaModel.MetaModelPackage#getPlayer_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link metaModel.Player#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metaModel.MetaModelPackage#getPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metaModel.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr</em>' attribute.
	 * @see #setAddr(String)
	 * @see metaModel.MetaModelPackage#getPlayer_Addr()
	 * @model dataType="metaModel.AddressDType"
	 * @generated
	 */
	String getAddr();

	/**
	 * Sets the value of the '{@link metaModel.Player#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(String value);

} // Player
