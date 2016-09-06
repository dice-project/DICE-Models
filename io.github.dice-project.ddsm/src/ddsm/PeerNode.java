/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Peer Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.PeerNode#getBelongsToQuorum <em>Belongs To Quorum</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getPeerNode()
 * @model
 * @generated
 */
public interface PeerNode extends InternalComponent {
    /**
     * Returns the value of the '<em><b>Belongs To Quorum</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Belongs To Quorum</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Belongs To Quorum</em>' reference.
     * @see #setBelongsToQuorum(PeersQuorum)
     * @see ddsm.DdsmPackage#getPeerNode_BelongsToQuorum()
     * @model required="true"
     * @generated
     */
    PeersQuorum getBelongsToQuorum();

    /**
     * Sets the value of the '{@link ddsm.PeerNode#getBelongsToQuorum <em>Belongs To Quorum</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Belongs To Quorum</em>' reference.
     * @see #getBelongsToQuorum()
     * @generated
     */
    void setBelongsToQuorum(PeersQuorum value);

} // PeerNode
