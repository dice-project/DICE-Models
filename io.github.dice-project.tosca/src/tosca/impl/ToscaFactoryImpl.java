/**
 */
package tosca.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tosca.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToscaFactoryImpl extends EFactoryImpl implements ToscaFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ToscaFactory init() {
        try {
            ToscaFactory theToscaFactory = (ToscaFactory)EPackage.Registry.INSTANCE.getEFactory(ToscaPackage.eNS_URI);
            if (theToscaFactory != null) {
                return theToscaFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ToscaFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ToscaFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ToscaPackage.NODE_TEMPLATE: return createNode_template();
            case ToscaPackage.INTERFACE: return createInterface();
            case ToscaPackage.SOURCE_INTERFACE: return createSource_interface();
            case ToscaPackage.TARGET_INTERFACE: return createTarget_interface();
            case ToscaPackage.RELATIONSHIP: return createRelationship();
            case ToscaPackage.CONTAINED_IN: return createContained_in();
            case ToscaPackage.CONNECTED_TO: return createConnected_to();
            case ToscaPackage.PARAMETER: return createParameter();
            case ToscaPackage.PROPERTY: return createProperty();
            case ToscaPackage.ATTRIBUTE: return createAttribute();
            case ToscaPackage.INPUT: return createInput();
            case ToscaPackage.OUTPUT: return createOutput();
            case ToscaPackage.REQUIREMENT: return createRequirement();
            case ToscaPackage.OPERATION: return createOperation();
            case ToscaPackage.SERVICE_TEMPLATE: return createService_Template();
            case ToscaPackage.IMPORT: return createImport();
            case ToscaPackage.INSTANCE: return createinstance();
            case ToscaPackage.PARAMETERS: return createParameters();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node_template createNode_template() {
        Node_templateImpl node_template = new Node_templateImpl();
        return node_template;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interface createInterface() {
        InterfaceImpl interface_ = new InterfaceImpl();
        return interface_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Source_interface createSource_interface() {
        Source_interfaceImpl source_interface = new Source_interfaceImpl();
        return source_interface;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Target_interface createTarget_interface() {
        Target_interfaceImpl target_interface = new Target_interfaceImpl();
        return target_interface;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Relationship createRelationship() {
        RelationshipImpl relationship = new RelationshipImpl();
        return relationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Contained_in createContained_in() {
        Contained_inImpl contained_in = new Contained_inImpl();
        return contained_in;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Connected_to createConnected_to() {
        Connected_toImpl connected_to = new Connected_toImpl();
        return connected_to;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Parameter createParameter() {
        ParameterImpl parameter = new ParameterImpl();
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property createProperty() {
        PropertyImpl property = new PropertyImpl();
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attribute createAttribute() {
        AttributeImpl attribute = new AttributeImpl();
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Input createInput() {
        InputImpl input = new InputImpl();
        return input;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Output createOutput() {
        OutputImpl output = new OutputImpl();
        return output;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Requirement createRequirement() {
        RequirementImpl requirement = new RequirementImpl();
        return requirement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation createOperation() {
        OperationImpl operation = new OperationImpl();
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Service_Template createService_Template() {
        Service_TemplateImpl service_Template = new Service_TemplateImpl();
        return service_Template;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Import createImport() {
        ImportImpl import_ = new ImportImpl();
        return import_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public instance createinstance() {
        instanceImpl instance = new instanceImpl();
        return instance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Parameters createParameters() {
        ParametersImpl parameters = new ParametersImpl();
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ToscaPackage getToscaPackage() {
        return (ToscaPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ToscaPackage getPackage() {
        return ToscaPackage.eINSTANCE;
    }

} //ToscaFactoryImpl
