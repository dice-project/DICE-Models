/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.ExecutionBinding#getRequiredexecutionplatform <em>Requiredexecutionplatform</em>}</li>
 *   <li>{@link ddsm.ExecutionBinding#getProvidedexecutionplatform <em>Providedexecutionplatform</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getExecutionBinding()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='Represents a binding between a RequiredExecutionPlatform and a ProvidedExecutionPlatform of two components, meaning that the first component will be hosted on the second one according to the specified binding.'"
 * @generated
 */
public interface ExecutionBinding extends CloudElement {
    /**
     * Returns the value of the '<em><b>Requiredexecutionplatform</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Requiredexecutionplatform</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Requiredexecutionplatform</em>' reference.
     * @see #setRequiredexecutionplatform(RequiredExecutionPlatform)
     * @see ddsm.DdsmPackage#getExecutionBinding_Requiredexecutionplatform()
     * @model required="true"
     * @generated
     */
    RequiredExecutionPlatform getRequiredexecutionplatform();

    /**
     * Sets the value of the '{@link ddsm.ExecutionBinding#getRequiredexecutionplatform <em>Requiredexecutionplatform</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Requiredexecutionplatform</em>' reference.
     * @see #getRequiredexecutionplatform()
     * @generated
     */
    void setRequiredexecutionplatform(RequiredExecutionPlatform value);

    /**
     * Returns the value of the '<em><b>Providedexecutionplatform</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Providedexecutionplatform</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Providedexecutionplatform</em>' reference.
     * @see #setProvidedexecutionplatform(ProvidedExecutionPlatform)
     * @see ddsm.DdsmPackage#getExecutionBinding_Providedexecutionplatform()
     * @model required="true"
     * @generated
     */
    ProvidedExecutionPlatform getProvidedexecutionplatform();

    /**
     * Sets the value of the '{@link ddsm.ExecutionBinding#getProvidedexecutionplatform <em>Providedexecutionplatform</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Providedexecutionplatform</em>' reference.
     * @see #getProvidedexecutionplatform()
     * @generated
     */
    void setProvidedexecutionplatform(ProvidedExecutionPlatform value);

} // ExecutionBinding
