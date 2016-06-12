/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Service_Template#getTosca_definitions_version <em>Tosca definitions version</em>}</li>
 *   <li>{@link tosca.Service_Template#getServiceTemplate_hasImport <em>Service Template has Import</em>}</li>
 *   <li>{@link tosca.Service_Template#getServiceTemplate_hasOutput <em>Service Template has Output</em>}</li>
 *   <li>{@link tosca.Service_Template#getServiceTemplate_hasInput <em>Service Template has Input</em>}</li>
 *   <li>{@link tosca.Service_Template#getService_hasNodeTemplate <em>Service has Node Template</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getService_Template()
 * @model
 * @generated
 */
public interface Service_Template extends EObject {
    /**
     * Returns the value of the '<em><b>Tosca definitions version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tosca definitions version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tosca definitions version</em>' attribute.
     * @see #setTosca_definitions_version(String)
     * @see tosca.ToscaPackage#getService_Template_Tosca_definitions_version()
     * @model id="true"
     * @generated
     */
    String getTosca_definitions_version();

    /**
     * Sets the value of the '{@link tosca.Service_Template#getTosca_definitions_version <em>Tosca definitions version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tosca definitions version</em>' attribute.
     * @see #getTosca_definitions_version()
     * @generated
     */
    void setTosca_definitions_version(String value);

    /**
     * Returns the value of the '<em><b>Service Template has Import</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Import}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Template has Import</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Template has Import</em>' containment reference list.
     * @see tosca.ToscaPackage#getService_Template_ServiceTemplate_hasImport()
     * @model containment="true"
     * @generated
     */
    EList<Import> getServiceTemplate_hasImport();

    /**
     * Returns the value of the '<em><b>Service Template has Output</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Output}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Template has Output</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Template has Output</em>' containment reference list.
     * @see tosca.ToscaPackage#getService_Template_ServiceTemplate_hasOutput()
     * @model containment="true"
     * @generated
     */
    EList<Output> getServiceTemplate_hasOutput();

    /**
     * Returns the value of the '<em><b>Service Template has Input</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Input}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Template has Input</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Template has Input</em>' containment reference list.
     * @see tosca.ToscaPackage#getService_Template_ServiceTemplate_hasInput()
     * @model containment="true"
     * @generated
     */
    EList<Input> getServiceTemplate_hasInput();

    /**
     * Returns the value of the '<em><b>Service has Node Template</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Node_template}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service has Node Template</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service has Node Template</em>' containment reference list.
     * @see tosca.ToscaPackage#getService_Template_Service_hasNodeTemplate()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Node_template> getService_hasNodeTemplate();

} // Service_Template
