/**
 */
package ddsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Execution Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.ProvidedExecutionPlatform#getOffer <em>Offer</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getProvidedExecutionPlatform()
 * @model
 * @generated
 */
public interface ProvidedExecutionPlatform extends ExecutionPlatform {
    /**
     * Returns the value of the '<em><b>Offer</b></em>' containment reference list.
     * The list contents are of type {@link ddsm.Offer}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offer</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offer</em>' containment reference list.
     * @see ddsm.DdsmPackage#getProvidedExecutionPlatform_Offer()
     * @model containment="true"
     * @generated
     */
    EList<Offer> getOffer();

} // ProvidedExecutionPlatform
