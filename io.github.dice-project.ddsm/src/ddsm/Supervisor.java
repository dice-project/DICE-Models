/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supervisor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.Supervisor#getWorkerStartTimeout <em>Worker Start Timeout</em>}</li>
 *   <li>{@link ddsm.Supervisor#getCpuCapacity <em>Cpu Capacity</em>}</li>
 *   <li>{@link ddsm.Supervisor#getMemoryCapacity <em>Memory Capacity</em>}</li>
 *   <li>{@link ddsm.Supervisor#getHeartbeatFrequency <em>Heartbeat Frequency</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getSupervisor()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of the Storm supervisor slave process.'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveNimbusMaster'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveNimbusMaster=' hasMaster.oclIsTypeOf(Nimbus)'"
 * @generated
 */
public interface Supervisor extends SlaveNode {
    /**
     * Returns the value of the '<em><b>Worker Start Timeout</b></em>' attribute.
     * The default value is <code>"120"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Worker Start Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Worker Start Timeout</em>' attribute.
     * @see #setWorkerStartTimeout(int)
     * @see ddsm.DdsmPackage#getSupervisor_WorkerStartTimeout()
     * @model default="120"
     * @generated
     */
    int getWorkerStartTimeout();

    /**
     * Sets the value of the '{@link ddsm.Supervisor#getWorkerStartTimeout <em>Worker Start Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Worker Start Timeout</em>' attribute.
     * @see #getWorkerStartTimeout()
     * @generated
     */
    void setWorkerStartTimeout(int value);

    /**
     * Returns the value of the '<em><b>Cpu Capacity</b></em>' attribute.
     * The default value is <code>"400"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cpu Capacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cpu Capacity</em>' attribute.
     * @see #setCpuCapacity(int)
     * @see ddsm.DdsmPackage#getSupervisor_CpuCapacity()
     * @model default="400"
     * @generated
     */
    int getCpuCapacity();

    /**
     * Sets the value of the '{@link ddsm.Supervisor#getCpuCapacity <em>Cpu Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cpu Capacity</em>' attribute.
     * @see #getCpuCapacity()
     * @generated
     */
    void setCpuCapacity(int value);

    /**
     * Returns the value of the '<em><b>Memory Capacity</b></em>' attribute.
     * The default value is <code>"4096"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Memory Capacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Memory Capacity</em>' attribute.
     * @see #setMemoryCapacity(int)
     * @see ddsm.DdsmPackage#getSupervisor_MemoryCapacity()
     * @model default="4096"
     * @generated
     */
    int getMemoryCapacity();

    /**
     * Sets the value of the '{@link ddsm.Supervisor#getMemoryCapacity <em>Memory Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Memory Capacity</em>' attribute.
     * @see #getMemoryCapacity()
     * @generated
     */
    void setMemoryCapacity(int value);

    /**
     * Returns the value of the '<em><b>Heartbeat Frequency</b></em>' attribute.
     * The default value is <code>"5"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Heartbeat Frequency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Heartbeat Frequency</em>' attribute.
     * @see #setHeartbeatFrequency(int)
     * @see ddsm.DdsmPackage#getSupervisor_HeartbeatFrequency()
     * @model default="5"
     * @generated
     */
    int getHeartbeatFrequency();

    /**
     * Sets the value of the '{@link ddsm.Supervisor#getHeartbeatFrequency <em>Heartbeat Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Heartbeat Frequency</em>' attribute.
     * @see #getHeartbeatFrequency()
     * @generated
     */
    void setHeartbeatFrequency(int value);

} // Supervisor
