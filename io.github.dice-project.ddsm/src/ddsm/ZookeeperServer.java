/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zookeeper Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.ZookeeperServer#getTickTime <em>Tick Time</em>}</li>
 *   <li>{@link ddsm.ZookeeperServer#getSyncLimit <em>Sync Limit</em>}</li>
 *   <li>{@link ddsm.ZookeeperServer#getInitLimit <em>Init Limit</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getZookeeperServer()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of a Zookeeper cluster.'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBelongToZookeeperQuorum'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBelongToZookeeperQuorum=' belongsToQuorum.oclIsTypeOf(ZookeeperQuorum)'"
 * @generated
 */
public interface ZookeeperServer extends PeerNode {
    /**
     * Returns the value of the '<em><b>Tick Time</b></em>' attribute.
     * The default value is <code>"1500"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tick Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tick Time</em>' attribute.
     * @see #setTickTime(int)
     * @see ddsm.DdsmPackage#getZookeeperServer_TickTime()
     * @model default="1500"
     * @generated
     */
    int getTickTime();

    /**
     * Sets the value of the '{@link ddsm.ZookeeperServer#getTickTime <em>Tick Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tick Time</em>' attribute.
     * @see #getTickTime()
     * @generated
     */
    void setTickTime(int value);

    /**
     * Returns the value of the '<em><b>Sync Limit</b></em>' attribute.
     * The default value is <code>"10"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sync Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sync Limit</em>' attribute.
     * @see #setSyncLimit(int)
     * @see ddsm.DdsmPackage#getZookeeperServer_SyncLimit()
     * @model default="10"
     * @generated
     */
    int getSyncLimit();

    /**
     * Sets the value of the '{@link ddsm.ZookeeperServer#getSyncLimit <em>Sync Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sync Limit</em>' attribute.
     * @see #getSyncLimit()
     * @generated
     */
    void setSyncLimit(int value);

    /**
     * Returns the value of the '<em><b>Init Limit</b></em>' attribute.
     * The default value is <code>"5"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Init Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Init Limit</em>' attribute.
     * @see #setInitLimit(int)
     * @see ddsm.DdsmPackage#getZookeeperServer_InitLimit()
     * @model default="5"
     * @generated
     */
    int getInitLimit();

    /**
     * Sets the value of the '{@link ddsm.ZookeeperServer#getInitLimit <em>Init Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Init Limit</em>' attribute.
     * @see #getInitLimit()
     * @generated
     */
    void setInitLimit(int value);

} // ZookeeperServer
