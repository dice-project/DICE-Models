/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.Cluster#getHasVm <em>Has Vm</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getCluster()
 * @model
 * @generated
 */
public interface Cluster extends CloudElement {
    /**
     * Returns the value of the '<em><b>Has Vm</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Has Vm</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Has Vm</em>' reference.
     * @see #setHasVm(VM)
     * @see ddsm.DdsmPackage#getCluster_HasVm()
     * @model
     * @generated
     */
    VM getHasVm();

    /**
     * Sets the value of the '{@link ddsm.Cluster#getHasVm <em>Has Vm</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Has Vm</em>' reference.
     * @see #getHasVm()
     * @generated
     */
    void setHasVm(VM value);

} // Cluster
