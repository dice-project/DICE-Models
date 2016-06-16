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
 *   <li>{@link ddsm.ExecutionBinding#getName <em>Name</em>}</li>
 *   <li>{@link ddsm.ExecutionBinding#getBindingId <em>Binding Id</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getExecutionBinding()
 * @model
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
     * @model
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
     * @model
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

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see ddsm.DdsmPackage#getExecutionBinding_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ddsm.ExecutionBinding#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Binding Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Id</em>' attribute.
     * @see #setBindingId(String)
     * @see ddsm.DdsmPackage#getExecutionBinding_BindingId()
     * @model
     * @generated
     */
    String getBindingId();

    /**
     * Sets the value of the '{@link ddsm.ExecutionBinding#getBindingId <em>Binding Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Id</em>' attribute.
     * @see #getBindingId()
     * @generated
     */
    void setBindingId(String value);

} // ExecutionBinding
