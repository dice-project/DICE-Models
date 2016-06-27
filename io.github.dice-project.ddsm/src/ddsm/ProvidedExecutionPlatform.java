/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Execution Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.ProvidedExecutionPlatform#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getProvidedExecutionPlatform()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='A specific type of ExecutionPlatform which requires hosting (e.g. a Big Data application requires a Big Data platform) from a Component.'"
 * @generated
 */
public interface ProvidedExecutionPlatform extends ExecutionPlatform {
    /**
     * Returns the value of the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' reference.
     * @see #setOwner(Component)
     * @see ddsm.DdsmPackage#getProvidedExecutionPlatform_Owner()
     * @model required="true"
     * @generated
     */
    Component getOwner();

    /**
     * Sets the value of the '{@link ddsm.ProvidedExecutionPlatform#getOwner <em>Owner</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' reference.
     * @see #getOwner()
     * @generated
     */
    void setOwner(Component value);

} // ProvidedExecutionPlatform
