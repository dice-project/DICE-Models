/**
 */
package tosca.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tosca.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tosca.ToscaPackage
 * @generated
 */
public class ToscaSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ToscaPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ToscaSwitch() {
        if (modelPackage == null) {
            modelPackage = ToscaPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case ToscaPackage.NODE_TEMPLATE: {
                Node_template node_template = (Node_template)theEObject;
                T result = caseNode_template(node_template);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.INTERFACE: {
                Interface interface_ = (Interface)theEObject;
                T result = caseInterface(interface_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.SOURCE_INTERFACE: {
                Source_interface source_interface = (Source_interface)theEObject;
                T result = caseSource_interface(source_interface);
                if (result == null) result = caseInterface(source_interface);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.TARGET_INTERFACE: {
                Target_interface target_interface = (Target_interface)theEObject;
                T result = caseTarget_interface(target_interface);
                if (result == null) result = caseInterface(target_interface);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.RELATIONSHIP: {
                Relationship relationship = (Relationship)theEObject;
                T result = caseRelationship(relationship);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.CONTAINED_IN: {
                Contained_in contained_in = (Contained_in)theEObject;
                T result = caseContained_in(contained_in);
                if (result == null) result = caseRelationship(contained_in);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.CONNECTED_TO: {
                Connected_to connected_to = (Connected_to)theEObject;
                T result = caseConnected_to(connected_to);
                if (result == null) result = caseRelationship(connected_to);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.PARAMETER: {
                Parameter parameter = (Parameter)theEObject;
                T result = caseParameter(parameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.PROPERTY: {
                Property property = (Property)theEObject;
                T result = caseProperty(property);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.ATTRIBUTE: {
                Attribute attribute = (Attribute)theEObject;
                T result = caseAttribute(attribute);
                if (result == null) result = caseParameter(attribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.INPUT: {
                Input input = (Input)theEObject;
                T result = caseInput(input);
                if (result == null) result = caseParameter(input);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.OUTPUT: {
                Output output = (Output)theEObject;
                T result = caseOutput(output);
                if (result == null) result = caseParameter(output);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.REQUIREMENT: {
                Requirement requirement = (Requirement)theEObject;
                T result = caseRequirement(requirement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.OPERATION: {
                Operation operation = (Operation)theEObject;
                T result = caseOperation(operation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.SERVICE_TEMPLATE: {
                Service_Template service_Template = (Service_Template)theEObject;
                T result = caseService_Template(service_Template);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.IMPORT: {
                Import import_ = (Import)theEObject;
                T result = caseImport(import_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.INSTANCE: {
                instance instance = (instance)theEObject;
                T result = caseinstance(instance);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ToscaPackage.PARAMETERS: {
                Parameters parameters = (Parameters)theEObject;
                T result = caseParameters(parameters);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node template</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node template</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNode_template(Node_template object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterface(Interface object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Source interface</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Source interface</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSource_interface(Source_interface object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Target interface</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Target interface</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTarget_interface(Target_interface object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationship(Relationship object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Contained in</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Contained in</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContained_in(Contained_in object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connected to</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connected to</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnected_to(Connected_to object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParameter(Parameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProperty(Property object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttribute(Attribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInput(Input object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutput(Output object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRequirement(Requirement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperation(Operation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Template</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Template</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseService_Template(Service_Template object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Import</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImport(Import object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>instance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseinstance(instance object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParameters(Parameters object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //ToscaSwitch
