/**
 */
package ddsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.Component#getProvidedport <em>Providedport</em>}</li>
 *   <li>{@link ddsm.Component#getProvidedexecutionplatform <em>Providedexecutionplatform</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getComponent()
 * @model abstract="true"
 *        annotation="http://es.unizar.disco/dice/profiles/generator description='Inherit from MODACloudsML, it represents a reusable type of cloud component (e.g. a virtual machine or an application).'"
 * @generated
 */
public interface Component extends CloudElement {
    /**
     * Returns the value of the '<em><b>Providedport</b></em>' containment reference list.
     * The list contents are of type {@link ddsm.ProvidedPort}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Providedport</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Providedport</em>' containment reference list.
     * @see ddsm.DdsmPackage#getComponent_Providedport()
     * @model containment="true"
     * @generated
     */
    EList<ProvidedPort> getProvidedport();

    /**
     * Returns the value of the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * The list contents are of type {@link ddsm.ProvidedExecutionPlatform}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Providedexecutionplatform</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Providedexecutionplatform</em>' containment reference list.
     * @see ddsm.DdsmPackage#getComponent_Providedexecutionplatform()
     * @model containment="true"
     * @generated
     */
    EList<ProvidedExecutionPlatform> getProvidedexecutionplatform();

} // Component
