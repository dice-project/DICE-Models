/**
 */
package tosca;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tosca.ToscaFactory
 * @model kind="package"
 * @generated
 */
public interface ToscaPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "tosca";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://tosca/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "tosca";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ToscaPackage eINSTANCE = tosca.impl.ToscaPackageImpl.init();

    /**
     * The meta object id for the '{@link tosca.impl.Node_templateImpl <em>Node template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.Node_templateImpl
     * @see tosca.impl.ToscaPackageImpl#getNode_template()
     * @generated
     */
    int NODE_TEMPLATE = 0;

    /**
     * The feature id for the '<em><b>Node template name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TEMPLATE__NODE_TEMPLATE_NAME = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TEMPLATE__TYPE = 1;

    /**
     * The feature id for the '<em><b>Node Template has Interface</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TEMPLATE__NODE_TEMPLATE_HAS_INTERFACE = 2;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TEMPLATE__DESCRIPTION = 3;

    /**
     * The feature id for the '<em><b>Node Template has Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TEMPLATE__NODE_TEMPLATE_HAS_PROPERTY = 4;

    /**
     * The feature id for the '<em><b>Node Template has Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TEMPLATE__NODE_TEMPLATE_HAS_ATTRIBUTE = 5;

    /**
     * The feature id for the '<em><b>Node Template has Requirement</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TEMPLATE__NODE_TEMPLATE_HAS_REQUIREMENT = 6;

    /**
     * The feature id for the '<em><b>Node Template has Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TEMPLATE__NODE_TEMPLATE_HAS_RELATIONSHIP = 7;

    /**
     * The feature id for the '<em><b>Node Template has Instances</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TEMPLATE__NODE_TEMPLATE_HAS_INSTANCES = 8;

    /**
     * The number of structural features of the '<em>Node template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TEMPLATE_FEATURE_COUNT = 9;

    /**
     * The number of operations of the '<em>Node template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TEMPLATE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link tosca.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.InterfaceImpl
     * @see tosca.impl.ToscaPackageImpl#getInterface()
     * @generated
     */
    int INTERFACE = 1;

    /**
     * The feature id for the '<em><b>Interface name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__INTERFACE_NAME = 0;

    /**
     * The feature id for the '<em><b>Has Operation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__HAS_OPERATION = 1;

    /**
     * The feature id for the '<em><b>Interface has Input</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__INTERFACE_HAS_INPUT = 2;

    /**
     * The number of structural features of the '<em>Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link tosca.impl.Source_interfaceImpl <em>Source interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.Source_interfaceImpl
     * @see tosca.impl.ToscaPackageImpl#getSource_interface()
     * @generated
     */
    int SOURCE_INTERFACE = 2;

    /**
     * The feature id for the '<em><b>Interface name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_INTERFACE__INTERFACE_NAME = INTERFACE__INTERFACE_NAME;

    /**
     * The feature id for the '<em><b>Has Operation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_INTERFACE__HAS_OPERATION = INTERFACE__HAS_OPERATION;

    /**
     * The feature id for the '<em><b>Interface has Input</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_INTERFACE__INTERFACE_HAS_INPUT = INTERFACE__INTERFACE_HAS_INPUT;

    /**
     * The number of structural features of the '<em>Source interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Source interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link tosca.impl.Target_interfaceImpl <em>Target interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.Target_interfaceImpl
     * @see tosca.impl.ToscaPackageImpl#getTarget_interface()
     * @generated
     */
    int TARGET_INTERFACE = 3;

    /**
     * The feature id for the '<em><b>Interface name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_INTERFACE__INTERFACE_NAME = INTERFACE__INTERFACE_NAME;

    /**
     * The feature id for the '<em><b>Has Operation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_INTERFACE__HAS_OPERATION = INTERFACE__HAS_OPERATION;

    /**
     * The feature id for the '<em><b>Interface has Input</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_INTERFACE__INTERFACE_HAS_INPUT = INTERFACE__INTERFACE_HAS_INPUT;

    /**
     * The number of structural features of the '<em>Target interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Target interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link tosca.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.RelationshipImpl
     * @see tosca.impl.ToscaPackageImpl#getRelationship()
     * @generated
     */
    int RELATIONSHIP = 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__TYPE = 0;

    /**
     * The feature id for the '<em><b>Valid Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__VALID_SOURCE = 1;

    /**
     * The feature id for the '<em><b>Valid Target</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__VALID_TARGET = 2;

    /**
     * The feature id for the '<em><b>Relation ha Source Interface</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__RELATION_HA_SOURCE_INTERFACE = 3;

    /**
     * The feature id for the '<em><b>Relation has Target Interface</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__RELATION_HAS_TARGET_INTERFACE = 4;

    /**
     * The number of structural features of the '<em>Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link tosca.impl.Contained_inImpl <em>Contained in</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.Contained_inImpl
     * @see tosca.impl.ToscaPackageImpl#getContained_in()
     * @generated
     */
    int CONTAINED_IN = 5;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINED_IN__TYPE = RELATIONSHIP__TYPE;

    /**
     * The feature id for the '<em><b>Valid Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINED_IN__VALID_SOURCE = RELATIONSHIP__VALID_SOURCE;

    /**
     * The feature id for the '<em><b>Valid Target</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINED_IN__VALID_TARGET = RELATIONSHIP__VALID_TARGET;

    /**
     * The feature id for the '<em><b>Relation ha Source Interface</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINED_IN__RELATION_HA_SOURCE_INTERFACE = RELATIONSHIP__RELATION_HA_SOURCE_INTERFACE;

    /**
     * The feature id for the '<em><b>Relation has Target Interface</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINED_IN__RELATION_HAS_TARGET_INTERFACE = RELATIONSHIP__RELATION_HAS_TARGET_INTERFACE;

    /**
     * The number of structural features of the '<em>Contained in</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINED_IN_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Contained in</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINED_IN_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link tosca.impl.Connected_toImpl <em>Connected to</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.Connected_toImpl
     * @see tosca.impl.ToscaPackageImpl#getConnected_to()
     * @generated
     */
    int CONNECTED_TO = 6;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_TO__TYPE = RELATIONSHIP__TYPE;

    /**
     * The feature id for the '<em><b>Valid Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_TO__VALID_SOURCE = RELATIONSHIP__VALID_SOURCE;

    /**
     * The feature id for the '<em><b>Valid Target</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_TO__VALID_TARGET = RELATIONSHIP__VALID_TARGET;

    /**
     * The feature id for the '<em><b>Relation ha Source Interface</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_TO__RELATION_HA_SOURCE_INTERFACE = RELATIONSHIP__RELATION_HA_SOURCE_INTERFACE;

    /**
     * The feature id for the '<em><b>Relation has Target Interface</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_TO__RELATION_HAS_TARGET_INTERFACE = RELATIONSHIP__RELATION_HAS_TARGET_INTERFACE;

    /**
     * The number of structural features of the '<em>Connected to</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_TO_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Connected to</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_TO_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link tosca.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.ParameterImpl
     * @see tosca.impl.ToscaPackageImpl#getParameter()
     * @generated
     */
    int PARAMETER = 7;

    /**
     * The feature id for the '<em><b>Parameter name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__PARAMETER_NAME = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__TYPE = 1;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__DESCRIPTION = 2;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__VALUE = 3;

    /**
     * The feature id for the '<em><b>Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__REQUIRED = 4;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__DEFAULT = 5;

    /**
     * The feature id for the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__STATUS = 6;

    /**
     * The number of structural features of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FEATURE_COUNT = 7;

    /**
     * The number of operations of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link tosca.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.PropertyImpl
     * @see tosca.impl.ToscaPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 8;

    /**
     * The feature id for the '<em><b>Property name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__PROPERTY_NAME = 0;

    /**
     * The feature id for the '<em><b>Property has Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__PROPERTY_HAS_PARAMETERS = 1;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link tosca.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.AttributeImpl
     * @see tosca.impl.ToscaPackageImpl#getAttribute()
     * @generated
     */
    int ATTRIBUTE = 9;

    /**
     * The feature id for the '<em><b>Parameter name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__PARAMETER_NAME = PARAMETER__PARAMETER_NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__TYPE = PARAMETER__TYPE;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DESCRIPTION = PARAMETER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__VALUE = PARAMETER__VALUE;

    /**
     * The feature id for the '<em><b>Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__REQUIRED = PARAMETER__REQUIRED;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DEFAULT = PARAMETER__DEFAULT;

    /**
     * The feature id for the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__STATUS = PARAMETER__STATUS;

    /**
     * The number of structural features of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link tosca.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.InputImpl
     * @see tosca.impl.ToscaPackageImpl#getInput()
     * @generated
     */
    int INPUT = 10;

    /**
     * The feature id for the '<em><b>Parameter name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT__PARAMETER_NAME = PARAMETER__PARAMETER_NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT__TYPE = PARAMETER__TYPE;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT__DESCRIPTION = PARAMETER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT__VALUE = PARAMETER__VALUE;

    /**
     * The feature id for the '<em><b>Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT__REQUIRED = PARAMETER__REQUIRED;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT__DEFAULT = PARAMETER__DEFAULT;

    /**
     * The feature id for the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT__STATUS = PARAMETER__STATUS;

    /**
     * The number of structural features of the '<em>Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link tosca.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.OutputImpl
     * @see tosca.impl.ToscaPackageImpl#getOutput()
     * @generated
     */
    int OUTPUT = 11;

    /**
     * The feature id for the '<em><b>Parameter name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT__PARAMETER_NAME = PARAMETER__PARAMETER_NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT__TYPE = PARAMETER__TYPE;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT__DESCRIPTION = PARAMETER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT__VALUE = PARAMETER__VALUE;

    /**
     * The feature id for the '<em><b>Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT__REQUIRED = PARAMETER__REQUIRED;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT__DEFAULT = PARAMETER__DEFAULT;

    /**
     * The feature id for the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT__STATUS = PARAMETER__STATUS;

    /**
     * The number of structural features of the '<em>Output</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Output</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link tosca.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.RequirementImpl
     * @see tosca.impl.ToscaPackageImpl#getRequirement()
     * @generated
     */
    int REQUIREMENT = 12;

    /**
     * The feature id for the '<em><b>Requirement name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIREMENT__REQUIREMENT_NAME = 0;

    /**
     * The feature id for the '<em><b>Node</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIREMENT__NODE = 1;

    /**
     * The feature id for the '<em><b>Capability Type name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIREMENT__CAPABILITY_TYPE_NAME = 2;

    /**
     * The feature id for the '<em><b>Occurances</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIREMENT__OCCURANCES = 3;

    /**
     * The number of structural features of the '<em>Requirement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIREMENT_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Requirement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIREMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link tosca.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.OperationImpl
     * @see tosca.impl.ToscaPackageImpl#getOperation()
     * @generated
     */
    int OPERATION = 13;

    /**
     * The feature id for the '<em><b>Operation name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__OPERATION_NAME = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__DESCRIPTION = 1;

    /**
     * The feature id for the '<em><b>Operation has Input</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__OPERATION_HAS_INPUT = 2;

    /**
     * The feature id for the '<em><b>Script</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__SCRIPT = 3;

    /**
     * The feature id for the '<em><b>Executor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__EXECUTOR = 4;

    /**
     * The number of structural features of the '<em>Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link tosca.impl.Service_TemplateImpl <em>Service Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.Service_TemplateImpl
     * @see tosca.impl.ToscaPackageImpl#getService_Template()
     * @generated
     */
    int SERVICE_TEMPLATE = 14;

    /**
     * The feature id for the '<em><b>Tosca definitions version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TEMPLATE__TOSCA_DEFINITIONS_VERSION = 0;

    /**
     * The feature id for the '<em><b>Service Template has Import</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_IMPORT = 1;

    /**
     * The feature id for the '<em><b>Service Template has Output</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_OUTPUT = 2;

    /**
     * The feature id for the '<em><b>Service Template has Input</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_INPUT = 3;

    /**
     * The feature id for the '<em><b>Service has Node Template</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TEMPLATE__SERVICE_HAS_NODE_TEMPLATE = 4;

    /**
     * The number of structural features of the '<em>Service Template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TEMPLATE_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Service Template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TEMPLATE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link tosca.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.ImportImpl
     * @see tosca.impl.ToscaPackageImpl#getImport()
     * @generated
     */
    int IMPORT = 15;

    /**
     * The feature id for the '<em><b>Import name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT__IMPORT_NAME = 0;

    /**
     * The feature id for the '<em><b>File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT__FILE = 1;

    /**
     * The feature id for the '<em><b>Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT__REPOSITORY = 2;

    /**
     * The feature id for the '<em><b>Namespace uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT__NAMESPACE_URI = 3;

    /**
     * The feature id for the '<em><b>Namespace prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT__NAMESPACE_PREFIX = 4;

    /**
     * The number of structural features of the '<em>Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link tosca.impl.instanceImpl <em>instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.instanceImpl
     * @see tosca.impl.ToscaPackageImpl#getinstance()
     * @generated
     */
    int INSTANCE = 16;

    /**
     * The feature id for the '<em><b>Deploy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE__DEPLOY = 0;

    /**
     * The number of structural features of the '<em>instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link tosca.impl.ParametersImpl <em>Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tosca.impl.ParametersImpl
     * @see tosca.impl.ToscaPackageImpl#getParameters()
     * @generated
     */
    int PARAMETERS = 17;

    /**
     * The feature id for the '<em><b>Paremeters has Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETERS__PAREMETERS_HAS_PARAMETER = 0;

    /**
     * The number of structural features of the '<em>Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETERS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETERS_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link tosca.Node_template <em>Node template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node template</em>'.
     * @see tosca.Node_template
     * @generated
     */
    EClass getNode_template();

    /**
     * Returns the meta object for the attribute '{@link tosca.Node_template#getNode_template_name <em>Node template name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Node template name</em>'.
     * @see tosca.Node_template#getNode_template_name()
     * @see #getNode_template()
     * @generated
     */
    EAttribute getNode_template_Node_template_name();

    /**
     * Returns the meta object for the attribute '{@link tosca.Node_template#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see tosca.Node_template#getType()
     * @see #getNode_template()
     * @generated
     */
    EAttribute getNode_template_Type();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Node_template#getNodeTemplate_hasInterface <em>Node Template has Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Node Template has Interface</em>'.
     * @see tosca.Node_template#getNodeTemplate_hasInterface()
     * @see #getNode_template()
     * @generated
     */
    EReference getNode_template_NodeTemplate_hasInterface();

    /**
     * Returns the meta object for the attribute '{@link tosca.Node_template#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see tosca.Node_template#getDescription()
     * @see #getNode_template()
     * @generated
     */
    EAttribute getNode_template_Description();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Node_template#getNodeTemplate_hasProperty <em>Node Template has Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Node Template has Property</em>'.
     * @see tosca.Node_template#getNodeTemplate_hasProperty()
     * @see #getNode_template()
     * @generated
     */
    EReference getNode_template_NodeTemplate_hasProperty();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Node_template#getNodeTemplate_hasAttribute <em>Node Template has Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Node Template has Attribute</em>'.
     * @see tosca.Node_template#getNodeTemplate_hasAttribute()
     * @see #getNode_template()
     * @generated
     */
    EReference getNode_template_NodeTemplate_hasAttribute();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Node_template#getNodeTemplate_hasRequirement <em>Node Template has Requirement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Node Template has Requirement</em>'.
     * @see tosca.Node_template#getNodeTemplate_hasRequirement()
     * @see #getNode_template()
     * @generated
     */
    EReference getNode_template_NodeTemplate_hasRequirement();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Node_template#getNodeTemplate_hasRelationship <em>Node Template has Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Node Template has Relationship</em>'.
     * @see tosca.Node_template#getNodeTemplate_hasRelationship()
     * @see #getNode_template()
     * @generated
     */
    EReference getNode_template_NodeTemplate_hasRelationship();

    /**
     * Returns the meta object for the containment reference '{@link tosca.Node_template#getNodeTemplate_hasInstances <em>Node Template has Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Node Template has Instances</em>'.
     * @see tosca.Node_template#getNodeTemplate_hasInstances()
     * @see #getNode_template()
     * @generated
     */
    EReference getNode_template_NodeTemplate_hasInstances();

    /**
     * Returns the meta object for class '{@link tosca.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface</em>'.
     * @see tosca.Interface
     * @generated
     */
    EClass getInterface();

    /**
     * Returns the meta object for the attribute '{@link tosca.Interface#getInterface_name <em>Interface name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Interface name</em>'.
     * @see tosca.Interface#getInterface_name()
     * @see #getInterface()
     * @generated
     */
    EAttribute getInterface_Interface_name();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Interface#getHasOperation <em>Has Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Has Operation</em>'.
     * @see tosca.Interface#getHasOperation()
     * @see #getInterface()
     * @generated
     */
    EReference getInterface_HasOperation();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Interface#getInterface_hasInput <em>Interface has Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Interface has Input</em>'.
     * @see tosca.Interface#getInterface_hasInput()
     * @see #getInterface()
     * @generated
     */
    EReference getInterface_Interface_hasInput();

    /**
     * Returns the meta object for class '{@link tosca.Source_interface <em>Source interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Source interface</em>'.
     * @see tosca.Source_interface
     * @generated
     */
    EClass getSource_interface();

    /**
     * Returns the meta object for class '{@link tosca.Target_interface <em>Target interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Target interface</em>'.
     * @see tosca.Target_interface
     * @generated
     */
    EClass getTarget_interface();

    /**
     * Returns the meta object for class '{@link tosca.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relationship</em>'.
     * @see tosca.Relationship
     * @generated
     */
    EClass getRelationship();

    /**
     * Returns the meta object for the attribute '{@link tosca.Relationship#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see tosca.Relationship#getType()
     * @see #getRelationship()
     * @generated
     */
    EAttribute getRelationship_Type();

    /**
     * Returns the meta object for the attribute '{@link tosca.Relationship#getValidSource <em>Valid Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Valid Source</em>'.
     * @see tosca.Relationship#getValidSource()
     * @see #getRelationship()
     * @generated
     */
    EAttribute getRelationship_ValidSource();

    /**
     * Returns the meta object for the attribute '{@link tosca.Relationship#getValidTarget <em>Valid Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Valid Target</em>'.
     * @see tosca.Relationship#getValidTarget()
     * @see #getRelationship()
     * @generated
     */
    EAttribute getRelationship_ValidTarget();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Relationship#getRelation_haSourceInterface <em>Relation ha Source Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Relation ha Source Interface</em>'.
     * @see tosca.Relationship#getRelation_haSourceInterface()
     * @see #getRelationship()
     * @generated
     */
    EReference getRelationship_Relation_haSourceInterface();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Relationship#getRelation_hasTargetInterface <em>Relation has Target Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Relation has Target Interface</em>'.
     * @see tosca.Relationship#getRelation_hasTargetInterface()
     * @see #getRelationship()
     * @generated
     */
    EReference getRelationship_Relation_hasTargetInterface();

    /**
     * Returns the meta object for class '{@link tosca.Contained_in <em>Contained in</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Contained in</em>'.
     * @see tosca.Contained_in
     * @generated
     */
    EClass getContained_in();

    /**
     * Returns the meta object for class '{@link tosca.Connected_to <em>Connected to</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connected to</em>'.
     * @see tosca.Connected_to
     * @generated
     */
    EClass getConnected_to();

    /**
     * Returns the meta object for class '{@link tosca.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter</em>'.
     * @see tosca.Parameter
     * @generated
     */
    EClass getParameter();

    /**
     * Returns the meta object for the attribute '{@link tosca.Parameter#getParameter_name <em>Parameter name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Parameter name</em>'.
     * @see tosca.Parameter#getParameter_name()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_Parameter_name();

    /**
     * Returns the meta object for the attribute '{@link tosca.Parameter#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see tosca.Parameter#getType()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_Type();

    /**
     * Returns the meta object for the attribute '{@link tosca.Parameter#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see tosca.Parameter#getDescription()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_Description();

    /**
     * Returns the meta object for the attribute '{@link tosca.Parameter#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see tosca.Parameter#getValue()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_Value();

    /**
     * Returns the meta object for the attribute '{@link tosca.Parameter#getRequired <em>Required</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Required</em>'.
     * @see tosca.Parameter#getRequired()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_Required();

    /**
     * Returns the meta object for the attribute '{@link tosca.Parameter#getDefault <em>Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default</em>'.
     * @see tosca.Parameter#getDefault()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_Default();

    /**
     * Returns the meta object for the attribute '{@link tosca.Parameter#getStatus <em>Status</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Status</em>'.
     * @see tosca.Parameter#getStatus()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_Status();

    /**
     * Returns the meta object for class '{@link tosca.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see tosca.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the attribute '{@link tosca.Property#getProperty_name <em>Property name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Property name</em>'.
     * @see tosca.Property#getProperty_name()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Property_name();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Property#getProperty_hasParameters <em>Property has Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property has Parameters</em>'.
     * @see tosca.Property#getProperty_hasParameters()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_Property_hasParameters();

    /**
     * Returns the meta object for class '{@link tosca.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute</em>'.
     * @see tosca.Attribute
     * @generated
     */
    EClass getAttribute();

    /**
     * Returns the meta object for class '{@link tosca.Input <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input</em>'.
     * @see tosca.Input
     * @generated
     */
    EClass getInput();

    /**
     * Returns the meta object for class '{@link tosca.Output <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output</em>'.
     * @see tosca.Output
     * @generated
     */
    EClass getOutput();

    /**
     * Returns the meta object for class '{@link tosca.Requirement <em>Requirement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Requirement</em>'.
     * @see tosca.Requirement
     * @generated
     */
    EClass getRequirement();

    /**
     * Returns the meta object for the attribute '{@link tosca.Requirement#getRequirement_name <em>Requirement name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Requirement name</em>'.
     * @see tosca.Requirement#getRequirement_name()
     * @see #getRequirement()
     * @generated
     */
    EAttribute getRequirement_Requirement_name();

    /**
     * Returns the meta object for the attribute '{@link tosca.Requirement#getNode <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Node</em>'.
     * @see tosca.Requirement#getNode()
     * @see #getRequirement()
     * @generated
     */
    EAttribute getRequirement_Node();

    /**
     * Returns the meta object for the attribute '{@link tosca.Requirement#getCapability_Type_name <em>Capability Type name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Capability Type name</em>'.
     * @see tosca.Requirement#getCapability_Type_name()
     * @see #getRequirement()
     * @generated
     */
    EAttribute getRequirement_Capability_Type_name();

    /**
     * Returns the meta object for the attribute list '{@link tosca.Requirement#getOccurances <em>Occurances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Occurances</em>'.
     * @see tosca.Requirement#getOccurances()
     * @see #getRequirement()
     * @generated
     */
    EAttribute getRequirement_Occurances();

    /**
     * Returns the meta object for class '{@link tosca.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation</em>'.
     * @see tosca.Operation
     * @generated
     */
    EClass getOperation();

    /**
     * Returns the meta object for the attribute '{@link tosca.Operation#getOperation_name <em>Operation name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation name</em>'.
     * @see tosca.Operation#getOperation_name()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_Operation_name();

    /**
     * Returns the meta object for the attribute '{@link tosca.Operation#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see tosca.Operation#getDescription()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_Description();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Operation#getOperation_hasInput <em>Operation has Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operation has Input</em>'.
     * @see tosca.Operation#getOperation_hasInput()
     * @see #getOperation()
     * @generated
     */
    EReference getOperation_Operation_hasInput();

    /**
     * Returns the meta object for the attribute '{@link tosca.Operation#getScript <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Script</em>'.
     * @see tosca.Operation#getScript()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_Script();

    /**
     * Returns the meta object for the attribute '{@link tosca.Operation#getExecutor <em>Executor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Executor</em>'.
     * @see tosca.Operation#getExecutor()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_Executor();

    /**
     * Returns the meta object for class '{@link tosca.Service_Template <em>Service Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Template</em>'.
     * @see tosca.Service_Template
     * @generated
     */
    EClass getService_Template();

    /**
     * Returns the meta object for the attribute '{@link tosca.Service_Template#getTosca_definitions_version <em>Tosca definitions version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tosca definitions version</em>'.
     * @see tosca.Service_Template#getTosca_definitions_version()
     * @see #getService_Template()
     * @generated
     */
    EAttribute getService_Template_Tosca_definitions_version();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Service_Template#getServiceTemplate_hasImport <em>Service Template has Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Template has Import</em>'.
     * @see tosca.Service_Template#getServiceTemplate_hasImport()
     * @see #getService_Template()
     * @generated
     */
    EReference getService_Template_ServiceTemplate_hasImport();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Service_Template#getServiceTemplate_hasOutput <em>Service Template has Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Template has Output</em>'.
     * @see tosca.Service_Template#getServiceTemplate_hasOutput()
     * @see #getService_Template()
     * @generated
     */
    EReference getService_Template_ServiceTemplate_hasOutput();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Service_Template#getServiceTemplate_hasInput <em>Service Template has Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Template has Input</em>'.
     * @see tosca.Service_Template#getServiceTemplate_hasInput()
     * @see #getService_Template()
     * @generated
     */
    EReference getService_Template_ServiceTemplate_hasInput();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Service_Template#getService_hasNodeTemplate <em>Service has Node Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service has Node Template</em>'.
     * @see tosca.Service_Template#getService_hasNodeTemplate()
     * @see #getService_Template()
     * @generated
     */
    EReference getService_Template_Service_hasNodeTemplate();

    /**
     * Returns the meta object for class '{@link tosca.Import <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Import</em>'.
     * @see tosca.Import
     * @generated
     */
    EClass getImport();

    /**
     * Returns the meta object for the attribute '{@link tosca.Import#getImport_name <em>Import name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Import name</em>'.
     * @see tosca.Import#getImport_name()
     * @see #getImport()
     * @generated
     */
    EAttribute getImport_Import_name();

    /**
     * Returns the meta object for the attribute '{@link tosca.Import#getFile <em>File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File</em>'.
     * @see tosca.Import#getFile()
     * @see #getImport()
     * @generated
     */
    EAttribute getImport_File();

    /**
     * Returns the meta object for the attribute '{@link tosca.Import#getRepository <em>Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Repository</em>'.
     * @see tosca.Import#getRepository()
     * @see #getImport()
     * @generated
     */
    EAttribute getImport_Repository();

    /**
     * Returns the meta object for the attribute '{@link tosca.Import#getNamespace_uri <em>Namespace uri</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace uri</em>'.
     * @see tosca.Import#getNamespace_uri()
     * @see #getImport()
     * @generated
     */
    EAttribute getImport_Namespace_uri();

    /**
     * Returns the meta object for the attribute '{@link tosca.Import#getNamespace_prefix <em>Namespace prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace prefix</em>'.
     * @see tosca.Import#getNamespace_prefix()
     * @see #getImport()
     * @generated
     */
    EAttribute getImport_Namespace_prefix();

    /**
     * Returns the meta object for class '{@link tosca.instance <em>instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>instance</em>'.
     * @see tosca.instance
     * @generated
     */
    EClass getinstance();

    /**
     * Returns the meta object for the attribute '{@link tosca.instance#getDeploy <em>Deploy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Deploy</em>'.
     * @see tosca.instance#getDeploy()
     * @see #getinstance()
     * @generated
     */
    EAttribute getinstance_Deploy();

    /**
     * Returns the meta object for class '{@link tosca.Parameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameters</em>'.
     * @see tosca.Parameters
     * @generated
     */
    EClass getParameters();

    /**
     * Returns the meta object for the containment reference list '{@link tosca.Parameters#getParemeters_hasParameter <em>Paremeters has Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Paremeters has Parameter</em>'.
     * @see tosca.Parameters#getParemeters_hasParameter()
     * @see #getParameters()
     * @generated
     */
    EReference getParameters_Paremeters_hasParameter();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ToscaFactory getToscaFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link tosca.impl.Node_templateImpl <em>Node template</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.Node_templateImpl
         * @see tosca.impl.ToscaPackageImpl#getNode_template()
         * @generated
         */
        EClass NODE_TEMPLATE = eINSTANCE.getNode_template();

        /**
         * The meta object literal for the '<em><b>Node template name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TEMPLATE__NODE_TEMPLATE_NAME = eINSTANCE.getNode_template_Node_template_name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TEMPLATE__TYPE = eINSTANCE.getNode_template_Type();

        /**
         * The meta object literal for the '<em><b>Node Template has Interface</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_TEMPLATE__NODE_TEMPLATE_HAS_INTERFACE = eINSTANCE.getNode_template_NodeTemplate_hasInterface();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TEMPLATE__DESCRIPTION = eINSTANCE.getNode_template_Description();

        /**
         * The meta object literal for the '<em><b>Node Template has Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_TEMPLATE__NODE_TEMPLATE_HAS_PROPERTY = eINSTANCE.getNode_template_NodeTemplate_hasProperty();

        /**
         * The meta object literal for the '<em><b>Node Template has Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_TEMPLATE__NODE_TEMPLATE_HAS_ATTRIBUTE = eINSTANCE.getNode_template_NodeTemplate_hasAttribute();

        /**
         * The meta object literal for the '<em><b>Node Template has Requirement</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_TEMPLATE__NODE_TEMPLATE_HAS_REQUIREMENT = eINSTANCE.getNode_template_NodeTemplate_hasRequirement();

        /**
         * The meta object literal for the '<em><b>Node Template has Relationship</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_TEMPLATE__NODE_TEMPLATE_HAS_RELATIONSHIP = eINSTANCE.getNode_template_NodeTemplate_hasRelationship();

        /**
         * The meta object literal for the '<em><b>Node Template has Instances</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_TEMPLATE__NODE_TEMPLATE_HAS_INSTANCES = eINSTANCE.getNode_template_NodeTemplate_hasInstances();

        /**
         * The meta object literal for the '{@link tosca.impl.InterfaceImpl <em>Interface</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.InterfaceImpl
         * @see tosca.impl.ToscaPackageImpl#getInterface()
         * @generated
         */
        EClass INTERFACE = eINSTANCE.getInterface();

        /**
         * The meta object literal for the '<em><b>Interface name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERFACE__INTERFACE_NAME = eINSTANCE.getInterface_Interface_name();

        /**
         * The meta object literal for the '<em><b>Has Operation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE__HAS_OPERATION = eINSTANCE.getInterface_HasOperation();

        /**
         * The meta object literal for the '<em><b>Interface has Input</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE__INTERFACE_HAS_INPUT = eINSTANCE.getInterface_Interface_hasInput();

        /**
         * The meta object literal for the '{@link tosca.impl.Source_interfaceImpl <em>Source interface</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.Source_interfaceImpl
         * @see tosca.impl.ToscaPackageImpl#getSource_interface()
         * @generated
         */
        EClass SOURCE_INTERFACE = eINSTANCE.getSource_interface();

        /**
         * The meta object literal for the '{@link tosca.impl.Target_interfaceImpl <em>Target interface</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.Target_interfaceImpl
         * @see tosca.impl.ToscaPackageImpl#getTarget_interface()
         * @generated
         */
        EClass TARGET_INTERFACE = eINSTANCE.getTarget_interface();

        /**
         * The meta object literal for the '{@link tosca.impl.RelationshipImpl <em>Relationship</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.RelationshipImpl
         * @see tosca.impl.ToscaPackageImpl#getRelationship()
         * @generated
         */
        EClass RELATIONSHIP = eINSTANCE.getRelationship();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

        /**
         * The meta object literal for the '<em><b>Valid Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATIONSHIP__VALID_SOURCE = eINSTANCE.getRelationship_ValidSource();

        /**
         * The meta object literal for the '<em><b>Valid Target</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATIONSHIP__VALID_TARGET = eINSTANCE.getRelationship_ValidTarget();

        /**
         * The meta object literal for the '<em><b>Relation ha Source Interface</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATIONSHIP__RELATION_HA_SOURCE_INTERFACE = eINSTANCE.getRelationship_Relation_haSourceInterface();

        /**
         * The meta object literal for the '<em><b>Relation has Target Interface</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATIONSHIP__RELATION_HAS_TARGET_INTERFACE = eINSTANCE.getRelationship_Relation_hasTargetInterface();

        /**
         * The meta object literal for the '{@link tosca.impl.Contained_inImpl <em>Contained in</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.Contained_inImpl
         * @see tosca.impl.ToscaPackageImpl#getContained_in()
         * @generated
         */
        EClass CONTAINED_IN = eINSTANCE.getContained_in();

        /**
         * The meta object literal for the '{@link tosca.impl.Connected_toImpl <em>Connected to</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.Connected_toImpl
         * @see tosca.impl.ToscaPackageImpl#getConnected_to()
         * @generated
         */
        EClass CONNECTED_TO = eINSTANCE.getConnected_to();

        /**
         * The meta object literal for the '{@link tosca.impl.ParameterImpl <em>Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.ParameterImpl
         * @see tosca.impl.ToscaPackageImpl#getParameter()
         * @generated
         */
        EClass PARAMETER = eINSTANCE.getParameter();

        /**
         * The meta object literal for the '<em><b>Parameter name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER__PARAMETER_NAME = eINSTANCE.getParameter_Parameter_name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

        /**
         * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER__REQUIRED = eINSTANCE.getParameter_Required();

        /**
         * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER__DEFAULT = eINSTANCE.getParameter_Default();

        /**
         * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER__STATUS = eINSTANCE.getParameter_Status();

        /**
         * The meta object literal for the '{@link tosca.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.PropertyImpl
         * @see tosca.impl.ToscaPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Property name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__PROPERTY_NAME = eINSTANCE.getProperty_Property_name();

        /**
         * The meta object literal for the '<em><b>Property has Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__PROPERTY_HAS_PARAMETERS = eINSTANCE.getProperty_Property_hasParameters();

        /**
         * The meta object literal for the '{@link tosca.impl.AttributeImpl <em>Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.AttributeImpl
         * @see tosca.impl.ToscaPackageImpl#getAttribute()
         * @generated
         */
        EClass ATTRIBUTE = eINSTANCE.getAttribute();

        /**
         * The meta object literal for the '{@link tosca.impl.InputImpl <em>Input</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.InputImpl
         * @see tosca.impl.ToscaPackageImpl#getInput()
         * @generated
         */
        EClass INPUT = eINSTANCE.getInput();

        /**
         * The meta object literal for the '{@link tosca.impl.OutputImpl <em>Output</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.OutputImpl
         * @see tosca.impl.ToscaPackageImpl#getOutput()
         * @generated
         */
        EClass OUTPUT = eINSTANCE.getOutput();

        /**
         * The meta object literal for the '{@link tosca.impl.RequirementImpl <em>Requirement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.RequirementImpl
         * @see tosca.impl.ToscaPackageImpl#getRequirement()
         * @generated
         */
        EClass REQUIREMENT = eINSTANCE.getRequirement();

        /**
         * The meta object literal for the '<em><b>Requirement name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REQUIREMENT__REQUIREMENT_NAME = eINSTANCE.getRequirement_Requirement_name();

        /**
         * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REQUIREMENT__NODE = eINSTANCE.getRequirement_Node();

        /**
         * The meta object literal for the '<em><b>Capability Type name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REQUIREMENT__CAPABILITY_TYPE_NAME = eINSTANCE.getRequirement_Capability_Type_name();

        /**
         * The meta object literal for the '<em><b>Occurances</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REQUIREMENT__OCCURANCES = eINSTANCE.getRequirement_Occurances();

        /**
         * The meta object literal for the '{@link tosca.impl.OperationImpl <em>Operation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.OperationImpl
         * @see tosca.impl.ToscaPackageImpl#getOperation()
         * @generated
         */
        EClass OPERATION = eINSTANCE.getOperation();

        /**
         * The meta object literal for the '<em><b>Operation name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__OPERATION_NAME = eINSTANCE.getOperation_Operation_name();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__DESCRIPTION = eINSTANCE.getOperation_Description();

        /**
         * The meta object literal for the '<em><b>Operation has Input</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION__OPERATION_HAS_INPUT = eINSTANCE.getOperation_Operation_hasInput();

        /**
         * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__SCRIPT = eINSTANCE.getOperation_Script();

        /**
         * The meta object literal for the '<em><b>Executor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__EXECUTOR = eINSTANCE.getOperation_Executor();

        /**
         * The meta object literal for the '{@link tosca.impl.Service_TemplateImpl <em>Service Template</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.Service_TemplateImpl
         * @see tosca.impl.ToscaPackageImpl#getService_Template()
         * @generated
         */
        EClass SERVICE_TEMPLATE = eINSTANCE.getService_Template();

        /**
         * The meta object literal for the '<em><b>Tosca definitions version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_TEMPLATE__TOSCA_DEFINITIONS_VERSION = eINSTANCE.getService_Template_Tosca_definitions_version();

        /**
         * The meta object literal for the '<em><b>Service Template has Import</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_IMPORT = eINSTANCE.getService_Template_ServiceTemplate_hasImport();

        /**
         * The meta object literal for the '<em><b>Service Template has Output</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_OUTPUT = eINSTANCE.getService_Template_ServiceTemplate_hasOutput();

        /**
         * The meta object literal for the '<em><b>Service Template has Input</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_INPUT = eINSTANCE.getService_Template_ServiceTemplate_hasInput();

        /**
         * The meta object literal for the '<em><b>Service has Node Template</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_TEMPLATE__SERVICE_HAS_NODE_TEMPLATE = eINSTANCE.getService_Template_Service_hasNodeTemplate();

        /**
         * The meta object literal for the '{@link tosca.impl.ImportImpl <em>Import</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.ImportImpl
         * @see tosca.impl.ToscaPackageImpl#getImport()
         * @generated
         */
        EClass IMPORT = eINSTANCE.getImport();

        /**
         * The meta object literal for the '<em><b>Import name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT__IMPORT_NAME = eINSTANCE.getImport_Import_name();

        /**
         * The meta object literal for the '<em><b>File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT__FILE = eINSTANCE.getImport_File();

        /**
         * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT__REPOSITORY = eINSTANCE.getImport_Repository();

        /**
         * The meta object literal for the '<em><b>Namespace uri</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT__NAMESPACE_URI = eINSTANCE.getImport_Namespace_uri();

        /**
         * The meta object literal for the '<em><b>Namespace prefix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT__NAMESPACE_PREFIX = eINSTANCE.getImport_Namespace_prefix();

        /**
         * The meta object literal for the '{@link tosca.impl.instanceImpl <em>instance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.instanceImpl
         * @see tosca.impl.ToscaPackageImpl#getinstance()
         * @generated
         */
        EClass INSTANCE = eINSTANCE.getinstance();

        /**
         * The meta object literal for the '<em><b>Deploy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INSTANCE__DEPLOY = eINSTANCE.getinstance_Deploy();

        /**
         * The meta object literal for the '{@link tosca.impl.ParametersImpl <em>Parameters</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see tosca.impl.ParametersImpl
         * @see tosca.impl.ToscaPackageImpl#getParameters()
         * @generated
         */
        EClass PARAMETERS = eINSTANCE.getParameters();

        /**
         * The meta object literal for the '<em><b>Paremeters has Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETERS__PAREMETERS_HAS_PARAMETER = eINSTANCE.getParameters_Paremeters_hasParameter();

    }

} //ToscaPackage
