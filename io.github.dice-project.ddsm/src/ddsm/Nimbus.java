/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nimbus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.Nimbus#getTaskTimeout <em>Task Timeout</em>}</li>
 *   <li>{@link ddsm.Nimbus#getSupervisorFrequency <em>Supervisor Frequency</em>}</li>
 *   <li>{@link ddsm.Nimbus#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link ddsm.Nimbus#getMonitorFrequency <em>Monitor Frequency</em>}</li>
 *   <li>{@link ddsm.Nimbus#getRetryTimes <em>Retry Times</em>}</li>
 *   <li>{@link ddsm.Nimbus#getRetryInterval <em>Retry Interval</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getNimbus()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of the Storm nimbus master process.'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='dependsOnZookeeper'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot dependsOnZookeeper='Relationship.allInstances() ->\n\texists(r | \n\t\tself.requiredport -> exists(p |\n\t\t\tp.elementId = r.requiredport.elementId and\n\t\t\t(r.providedport.owner.oclIsTypeOf(ZookeeperCluster) or\n\t\t\tr.providedport.owner.oclIsTypeOf(ZookeeperQuorum))\n\t\t)\n\t)'"
 * @generated
 */
public interface Nimbus extends MasterNode {
    /**
     * Returns the value of the '<em><b>Task Timeout</b></em>' attribute.
     * The default value is <code>"60"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task Timeout</em>' attribute.
     * @see #setTaskTimeout(int)
     * @see ddsm.DdsmPackage#getNimbus_TaskTimeout()
     * @model default="60"
     * @generated
     */
    int getTaskTimeout();

    /**
     * Sets the value of the '{@link ddsm.Nimbus#getTaskTimeout <em>Task Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Task Timeout</em>' attribute.
     * @see #getTaskTimeout()
     * @generated
     */
    void setTaskTimeout(int value);

    /**
     * Returns the value of the '<em><b>Supervisor Frequency</b></em>' attribute.
     * The default value is <code>"60"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supervisor Frequency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Supervisor Frequency</em>' attribute.
     * @see #setSupervisorFrequency(int)
     * @see ddsm.DdsmPackage#getNimbus_SupervisorFrequency()
     * @model default="60"
     * @generated
     */
    int getSupervisorFrequency();

    /**
     * Sets the value of the '{@link ddsm.Nimbus#getSupervisorFrequency <em>Supervisor Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Supervisor Frequency</em>' attribute.
     * @see #getSupervisorFrequency()
     * @generated
     */
    void setSupervisorFrequency(int value);

    /**
     * Returns the value of the '<em><b>Queue Size</b></em>' attribute.
     * The default value is <code>"100000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Queue Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Queue Size</em>' attribute.
     * @see #setQueueSize(int)
     * @see ddsm.DdsmPackage#getNimbus_QueueSize()
     * @model default="100000"
     * @generated
     */
    int getQueueSize();

    /**
     * Sets the value of the '{@link ddsm.Nimbus#getQueueSize <em>Queue Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Queue Size</em>' attribute.
     * @see #getQueueSize()
     * @generated
     */
    void setQueueSize(int value);

    /**
     * Returns the value of the '<em><b>Monitor Frequency</b></em>' attribute.
     * The default value is <code>"40"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Monitor Frequency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Monitor Frequency</em>' attribute.
     * @see #setMonitorFrequency(int)
     * @see ddsm.DdsmPackage#getNimbus_MonitorFrequency()
     * @model default="40"
     * @generated
     */
    int getMonitorFrequency();

    /**
     * Sets the value of the '{@link ddsm.Nimbus#getMonitorFrequency <em>Monitor Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Monitor Frequency</em>' attribute.
     * @see #getMonitorFrequency()
     * @generated
     */
    void setMonitorFrequency(int value);

    /**
     * Returns the value of the '<em><b>Retry Times</b></em>' attribute.
     * The default value is <code>"5"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Retry Times</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Retry Times</em>' attribute.
     * @see #setRetryTimes(int)
     * @see ddsm.DdsmPackage#getNimbus_RetryTimes()
     * @model default="5"
     * @generated
     */
    int getRetryTimes();

    /**
     * Sets the value of the '{@link ddsm.Nimbus#getRetryTimes <em>Retry Times</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Retry Times</em>' attribute.
     * @see #getRetryTimes()
     * @generated
     */
    void setRetryTimes(int value);

    /**
     * Returns the value of the '<em><b>Retry Interval</b></em>' attribute.
     * The default value is <code>"2000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Retry Interval</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Retry Interval</em>' attribute.
     * @see #setRetryInterval(int)
     * @see ddsm.DdsmPackage#getNimbus_RetryInterval()
     * @model default="2000"
     * @generated
     */
    int getRetryInterval();

    /**
     * Sets the value of the '{@link ddsm.Nimbus#getRetryInterval <em>Retry Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Retry Interval</em>' attribute.
     * @see #getRetryInterval()
     * @generated
     */
    void setRetryInterval(int value);

} // Nimbus
