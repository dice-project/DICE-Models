/**
 */
package ddsm;

import org.eclipse.emf.common.util.EList;


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
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='Inherited from MODACloudsML, it represents a collection of virtual machines on a particular Provider. One Provider can host several Clusters..'"
 * @generated
 */
public interface Cluster extends ExternalComponent {
    /**
     * Returns the value of the '<em><b>Has Vm</b></em>' reference list.
     * The list contents are of type {@link ddsm.VM}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Has Vm</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Has Vm</em>' reference list.
     * @see ddsm.DdsmPackage#getCluster_HasVm()
     * @model
     * @generated
     */
    EList<VM> getHasVm();

} // Cluster
