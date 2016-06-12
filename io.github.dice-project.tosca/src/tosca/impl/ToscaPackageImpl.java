/**
 */
package tosca.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tosca.Attribute;
import tosca.Connected_to;
import tosca.Contained_in;
import tosca.Import;
import tosca.Input;
import tosca.Interface;
import tosca.Node_template;
import tosca.Operation;
import tosca.Output;
import tosca.Parameter;
import tosca.Parameters;
import tosca.Property;
import tosca.Relationship;
import tosca.Requirement;
import tosca.Service_Template;
import tosca.Source_interface;
import tosca.Target_interface;
import tosca.ToscaFactory;
import tosca.ToscaPackage;
import tosca.instance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToscaPackageImpl extends EPackageImpl implements ToscaPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass node_templateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interfaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass source_interfaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass target_interfaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationshipEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contained_inEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connected_toEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inputEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass outputEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass requirementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass service_TemplateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass importEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass instanceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parametersEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see tosca.ToscaPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ToscaPackageImpl() {
        super(eNS_URI, ToscaFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ToscaPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ToscaPackage init() {
        if (isInited) return (ToscaPackage)EPackage.Registry.INSTANCE.getEPackage(ToscaPackage.eNS_URI);

        // Obtain or create and register package
        ToscaPackageImpl theToscaPackage = (ToscaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToscaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToscaPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theToscaPackage.createPackageContents();

        // Initialize created meta-data
        theToscaPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theToscaPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ToscaPackage.eNS_URI, theToscaPackage);
        return theToscaPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNode_template() {
        return node_templateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNode_template_Node_template_name() {
        return (EAttribute)node_templateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNode_template_Type() {
        return (EAttribute)node_templateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNode_template_NodeTemplate_hasInterface() {
        return (EReference)node_templateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNode_template_Description() {
        return (EAttribute)node_templateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNode_template_NodeTemplate_hasProperty() {
        return (EReference)node_templateEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNode_template_NodeTemplate_hasAttribute() {
        return (EReference)node_templateEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNode_template_NodeTemplate_hasRequirement() {
        return (EReference)node_templateEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNode_template_NodeTemplate_hasRelationship() {
        return (EReference)node_templateEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNode_template_NodeTemplate_hasInstances() {
        return (EReference)node_templateEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterface() {
        return interfaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInterface_Interface_name() {
        return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterface_HasOperation() {
        return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterface_Interface_hasInput() {
        return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSource_interface() {
        return source_interfaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTarget_interface() {
        return target_interfaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelationship() {
        return relationshipEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationship_Type() {
        return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationship_ValidSource() {
        return (EAttribute)relationshipEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationship_ValidTarget() {
        return (EAttribute)relationshipEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationship_Relation_haSourceInterface() {
        return (EReference)relationshipEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationship_Relation_hasTargetInterface() {
        return (EReference)relationshipEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContained_in() {
        return contained_inEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnected_to() {
        return connected_toEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameter() {
        return parameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameter_Parameter_name() {
        return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameter_Type() {
        return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameter_Description() {
        return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameter_Value() {
        return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameter_Required() {
        return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameter_Default() {
        return (EAttribute)parameterEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameter_Status() {
        return (EAttribute)parameterEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProperty() {
        return propertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Property_name() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProperty_Property_hasParameters() {
        return (EReference)propertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttribute() {
        return attributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInput() {
        return inputEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOutput() {
        return outputEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRequirement() {
        return requirementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRequirement_Requirement_name() {
        return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRequirement_Node() {
        return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRequirement_Capability_Type_name() {
        return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRequirement_Occurances() {
        return (EAttribute)requirementEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperation() {
        return operationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_Operation_name() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_Description() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperation_Operation_hasInput() {
        return (EReference)operationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_Script() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_Executor() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getService_Template() {
        return service_TemplateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getService_Template_Tosca_definitions_version() {
        return (EAttribute)service_TemplateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getService_Template_ServiceTemplate_hasImport() {
        return (EReference)service_TemplateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getService_Template_ServiceTemplate_hasOutput() {
        return (EReference)service_TemplateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getService_Template_ServiceTemplate_hasInput() {
        return (EReference)service_TemplateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getService_Template_Service_hasNodeTemplate() {
        return (EReference)service_TemplateEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getImport() {
        return importEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImport_Import_name() {
        return (EAttribute)importEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImport_File() {
        return (EAttribute)importEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImport_Repository() {
        return (EAttribute)importEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImport_Namespace_uri() {
        return (EAttribute)importEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImport_Namespace_prefix() {
        return (EAttribute)importEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getinstance() {
        return instanceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getinstance_Deploy() {
        return (EAttribute)instanceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameters() {
        return parametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameters_Paremeters_hasParameter() {
        return (EReference)parametersEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ToscaFactory getToscaFactory() {
        return (ToscaFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        node_templateEClass = createEClass(NODE_TEMPLATE);
        createEAttribute(node_templateEClass, NODE_TEMPLATE__NODE_TEMPLATE_NAME);
        createEAttribute(node_templateEClass, NODE_TEMPLATE__TYPE);
        createEReference(node_templateEClass, NODE_TEMPLATE__NODE_TEMPLATE_HAS_INTERFACE);
        createEAttribute(node_templateEClass, NODE_TEMPLATE__DESCRIPTION);
        createEReference(node_templateEClass, NODE_TEMPLATE__NODE_TEMPLATE_HAS_PROPERTY);
        createEReference(node_templateEClass, NODE_TEMPLATE__NODE_TEMPLATE_HAS_ATTRIBUTE);
        createEReference(node_templateEClass, NODE_TEMPLATE__NODE_TEMPLATE_HAS_REQUIREMENT);
        createEReference(node_templateEClass, NODE_TEMPLATE__NODE_TEMPLATE_HAS_RELATIONSHIP);
        createEReference(node_templateEClass, NODE_TEMPLATE__NODE_TEMPLATE_HAS_INSTANCES);

        interfaceEClass = createEClass(INTERFACE);
        createEAttribute(interfaceEClass, INTERFACE__INTERFACE_NAME);
        createEReference(interfaceEClass, INTERFACE__HAS_OPERATION);
        createEReference(interfaceEClass, INTERFACE__INTERFACE_HAS_INPUT);

        source_interfaceEClass = createEClass(SOURCE_INTERFACE);

        target_interfaceEClass = createEClass(TARGET_INTERFACE);

        relationshipEClass = createEClass(RELATIONSHIP);
        createEAttribute(relationshipEClass, RELATIONSHIP__TYPE);
        createEAttribute(relationshipEClass, RELATIONSHIP__VALID_SOURCE);
        createEAttribute(relationshipEClass, RELATIONSHIP__VALID_TARGET);
        createEReference(relationshipEClass, RELATIONSHIP__RELATION_HA_SOURCE_INTERFACE);
        createEReference(relationshipEClass, RELATIONSHIP__RELATION_HAS_TARGET_INTERFACE);

        contained_inEClass = createEClass(CONTAINED_IN);

        connected_toEClass = createEClass(CONNECTED_TO);

        parameterEClass = createEClass(PARAMETER);
        createEAttribute(parameterEClass, PARAMETER__PARAMETER_NAME);
        createEAttribute(parameterEClass, PARAMETER__TYPE);
        createEAttribute(parameterEClass, PARAMETER__DESCRIPTION);
        createEAttribute(parameterEClass, PARAMETER__VALUE);
        createEAttribute(parameterEClass, PARAMETER__REQUIRED);
        createEAttribute(parameterEClass, PARAMETER__DEFAULT);
        createEAttribute(parameterEClass, PARAMETER__STATUS);

        propertyEClass = createEClass(PROPERTY);
        createEAttribute(propertyEClass, PROPERTY__PROPERTY_NAME);
        createEReference(propertyEClass, PROPERTY__PROPERTY_HAS_PARAMETERS);

        attributeEClass = createEClass(ATTRIBUTE);

        inputEClass = createEClass(INPUT);

        outputEClass = createEClass(OUTPUT);

        requirementEClass = createEClass(REQUIREMENT);
        createEAttribute(requirementEClass, REQUIREMENT__REQUIREMENT_NAME);
        createEAttribute(requirementEClass, REQUIREMENT__NODE);
        createEAttribute(requirementEClass, REQUIREMENT__CAPABILITY_TYPE_NAME);
        createEAttribute(requirementEClass, REQUIREMENT__OCCURANCES);

        operationEClass = createEClass(OPERATION);
        createEAttribute(operationEClass, OPERATION__OPERATION_NAME);
        createEAttribute(operationEClass, OPERATION__DESCRIPTION);
        createEReference(operationEClass, OPERATION__OPERATION_HAS_INPUT);
        createEAttribute(operationEClass, OPERATION__SCRIPT);
        createEAttribute(operationEClass, OPERATION__EXECUTOR);

        service_TemplateEClass = createEClass(SERVICE_TEMPLATE);
        createEAttribute(service_TemplateEClass, SERVICE_TEMPLATE__TOSCA_DEFINITIONS_VERSION);
        createEReference(service_TemplateEClass, SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_IMPORT);
        createEReference(service_TemplateEClass, SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_OUTPUT);
        createEReference(service_TemplateEClass, SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_INPUT);
        createEReference(service_TemplateEClass, SERVICE_TEMPLATE__SERVICE_HAS_NODE_TEMPLATE);

        importEClass = createEClass(IMPORT);
        createEAttribute(importEClass, IMPORT__IMPORT_NAME);
        createEAttribute(importEClass, IMPORT__FILE);
        createEAttribute(importEClass, IMPORT__REPOSITORY);
        createEAttribute(importEClass, IMPORT__NAMESPACE_URI);
        createEAttribute(importEClass, IMPORT__NAMESPACE_PREFIX);

        instanceEClass = createEClass(INSTANCE);
        createEAttribute(instanceEClass, INSTANCE__DEPLOY);

        parametersEClass = createEClass(PARAMETERS);
        createEReference(parametersEClass, PARAMETERS__PAREMETERS_HAS_PARAMETER);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        source_interfaceEClass.getESuperTypes().add(this.getInterface());
        target_interfaceEClass.getESuperTypes().add(this.getInterface());
        contained_inEClass.getESuperTypes().add(this.getRelationship());
        connected_toEClass.getESuperTypes().add(this.getRelationship());
        attributeEClass.getESuperTypes().add(this.getParameter());
        inputEClass.getESuperTypes().add(this.getParameter());
        outputEClass.getESuperTypes().add(this.getParameter());

        // Initialize classes, features, and operations; add parameters
        initEClass(node_templateEClass, Node_template.class, "Node_template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNode_template_Node_template_name(), ecorePackage.getEString(), "node_template_name", null, 0, 1, Node_template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNode_template_Type(), ecorePackage.getEString(), "type", null, 0, 1, Node_template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNode_template_NodeTemplate_hasInterface(), this.getInterface(), null, "nodeTemplate_hasInterface", null, 0, -1, Node_template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNode_template_Description(), ecorePackage.getEString(), "description", null, 0, 1, Node_template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNode_template_NodeTemplate_hasProperty(), this.getProperty(), null, "nodeTemplate_hasProperty", null, 0, -1, Node_template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNode_template_NodeTemplate_hasAttribute(), this.getAttribute(), null, "nodeTemplate_hasAttribute", null, 0, -1, Node_template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNode_template_NodeTemplate_hasRequirement(), this.getRequirement(), null, "nodeTemplate_hasRequirement", null, 0, -1, Node_template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNode_template_NodeTemplate_hasRelationship(), this.getRelationship(), null, "NodeTemplate_hasRelationship", null, 0, -1, Node_template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNode_template_NodeTemplate_hasInstances(), this.getinstance(), null, "nodeTemplate_hasInstances", null, 0, 1, Node_template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInterface_Interface_name(), ecorePackage.getEString(), "interface_name", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInterface_HasOperation(), this.getOperation(), null, "hasOperation", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInterface_Interface_hasInput(), this.getInput(), null, "interface_hasInput", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(source_interfaceEClass, Source_interface.class, "Source_interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(target_interfaceEClass, Target_interface.class, "Target_interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRelationship_Type(), ecorePackage.getEString(), "type", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRelationship_ValidSource(), ecorePackage.getEString(), "validSource", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRelationship_ValidTarget(), ecorePackage.getEString(), "validTarget", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationship_Relation_haSourceInterface(), this.getSource_interface(), null, "relation_haSourceInterface", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationship_Relation_hasTargetInterface(), this.getTarget_interface(), null, "relation_hasTargetInterface", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contained_inEClass, Contained_in.class, "Contained_in", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(connected_toEClass, Connected_to.class, "Connected_to", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getParameter_Parameter_name(), ecorePackage.getEString(), "parameter_name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameter_Required(), ecorePackage.getEString(), "required", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameter_Default(), ecorePackage.getEString(), "default", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameter_Status(), ecorePackage.getEString(), "status", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProperty_Property_name(), ecorePackage.getEString(), "property_name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProperty_Property_hasParameters(), this.getParameters(), null, "property_hasParameters", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRequirement_Requirement_name(), ecorePackage.getEString(), "requirement_name", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRequirement_Node(), ecorePackage.getEString(), "node", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRequirement_Capability_Type_name(), ecorePackage.getEString(), "capability_Type_name", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRequirement_Occurances(), ecorePackage.getEString(), "occurances", null, 0, 2, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOperation_Operation_name(), ecorePackage.getEString(), "operation_name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperation_Operation_hasInput(), this.getInput(), null, "operation_hasInput", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperation_Script(), ecorePackage.getEString(), "script", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperation_Executor(), ecorePackage.getEString(), "executor", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(service_TemplateEClass, Service_Template.class, "Service_Template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getService_Template_Tosca_definitions_version(), ecorePackage.getEString(), "tosca_definitions_version", null, 0, 1, Service_Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getService_Template_ServiceTemplate_hasImport(), this.getImport(), null, "serviceTemplate_hasImport", null, 0, -1, Service_Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getService_Template_ServiceTemplate_hasOutput(), this.getOutput(), null, "serviceTemplate_hasOutput", null, 0, -1, Service_Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getService_Template_ServiceTemplate_hasInput(), this.getInput(), null, "serviceTemplate_hasInput", null, 0, -1, Service_Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getService_Template_Service_hasNodeTemplate(), this.getNode_template(), null, "service_hasNodeTemplate", null, 1, -1, Service_Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getImport_Import_name(), ecorePackage.getEString(), "import_name", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getImport_File(), ecorePackage.getEString(), "file", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getImport_Repository(), ecorePackage.getEString(), "repository", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getImport_Namespace_uri(), ecorePackage.getEString(), "namespace_uri", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getImport_Namespace_prefix(), ecorePackage.getEString(), "namespace_prefix", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(instanceEClass, instance.class, "instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getinstance_Deploy(), ecorePackage.getEInt(), "deploy", null, 1, 1, instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parametersEClass, Parameters.class, "Parameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getParameters_Paremeters_hasParameter(), this.getParameter(), null, "Paremeters_hasParameter", null, 0, -1, Parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //ToscaPackageImpl
