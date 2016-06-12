/**
 */
package tosca;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tosca.ToscaPackage
 * @generated
 */
public interface ToscaFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ToscaFactory eINSTANCE = tosca.impl.ToscaFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Node template</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Node template</em>'.
     * @generated
     */
    Node_template createNode_template();

    /**
     * Returns a new object of class '<em>Interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interface</em>'.
     * @generated
     */
    Interface createInterface();

    /**
     * Returns a new object of class '<em>Source interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Source interface</em>'.
     * @generated
     */
    Source_interface createSource_interface();

    /**
     * Returns a new object of class '<em>Target interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Target interface</em>'.
     * @generated
     */
    Target_interface createTarget_interface();

    /**
     * Returns a new object of class '<em>Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relationship</em>'.
     * @generated
     */
    Relationship createRelationship();

    /**
     * Returns a new object of class '<em>Contained in</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Contained in</em>'.
     * @generated
     */
    Contained_in createContained_in();

    /**
     * Returns a new object of class '<em>Connected to</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connected to</em>'.
     * @generated
     */
    Connected_to createConnected_to();

    /**
     * Returns a new object of class '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter</em>'.
     * @generated
     */
    Parameter createParameter();

    /**
     * Returns a new object of class '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property</em>'.
     * @generated
     */
    Property createProperty();

    /**
     * Returns a new object of class '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute</em>'.
     * @generated
     */
    Attribute createAttribute();

    /**
     * Returns a new object of class '<em>Input</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Input</em>'.
     * @generated
     */
    Input createInput();

    /**
     * Returns a new object of class '<em>Output</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Output</em>'.
     * @generated
     */
    Output createOutput();

    /**
     * Returns a new object of class '<em>Requirement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Requirement</em>'.
     * @generated
     */
    Requirement createRequirement();

    /**
     * Returns a new object of class '<em>Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operation</em>'.
     * @generated
     */
    Operation createOperation();

    /**
     * Returns a new object of class '<em>Service Template</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Template</em>'.
     * @generated
     */
    Service_Template createService_Template();

    /**
     * Returns a new object of class '<em>Import</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Import</em>'.
     * @generated
     */
    Import createImport();

    /**
     * Returns a new object of class '<em>instance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>instance</em>'.
     * @generated
     */
    instance createinstance();

    /**
     * Returns a new object of class '<em>Parameters</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameters</em>'.
     * @generated
     */
    Parameters createParameters();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ToscaPackage getToscaPackage();

} //ToscaFactory
