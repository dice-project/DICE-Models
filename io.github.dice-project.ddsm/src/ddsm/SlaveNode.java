/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slave Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.SlaveNode#getHasMaster <em>Has Master</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getSlaveNode()
 * @model
 * @generated
 */
public interface SlaveNode extends InternalComponent {
    /**
     * Returns the value of the '<em><b>Has Master</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Has Master</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Has Master</em>' reference.
     * @see #setHasMaster(MasterNode)
     * @see ddsm.DdsmPackage#getSlaveNode_HasMaster()
     * @model required="true"
     * @generated
     */
    MasterNode getHasMaster();

    /**
     * Sets the value of the '{@link ddsm.SlaveNode#getHasMaster <em>Has Master</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Has Master</em>' reference.
     * @see #getHasMaster()
     * @generated
     */
    void setHasMaster(MasterNode value);

} // SlaveNode
