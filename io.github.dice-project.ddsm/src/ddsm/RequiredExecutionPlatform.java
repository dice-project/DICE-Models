/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Execution Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.RequiredExecutionPlatform#isIsMandatory <em>Is Mandatory</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getRequiredExecutionPlatform()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='A specific type of ExecutionPlatform providing hosting facilities (e.g. an execution environment, like a VM or a web server) to a Component.'"
 * @generated
 */
public interface RequiredExecutionPlatform extends ExecutionPlatform {
    /**
     * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Mandatory</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Mandatory</em>' attribute.
     * @see #setIsMandatory(boolean)
     * @see ddsm.DdsmPackage#getRequiredExecutionPlatform_IsMandatory()
     * @model
     * @generated
     */
    boolean isIsMandatory();

    /**
     * Sets the value of the '{@link ddsm.RequiredExecutionPlatform#isIsMandatory <em>Is Mandatory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Mandatory</em>' attribute.
     * @see #isIsMandatory()
     * @generated
     */
    void setIsMandatory(boolean value);

} // RequiredExecutionPlatform
