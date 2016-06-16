/**
 */
package ddsm;

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
 * @see ddsm.DdsmFactory
 * @model kind="package"
 * @generated
 */
public interface DdsmPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "ddsm";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://ddsm/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "ddsm";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DdsmPackage eINSTANCE = ddsm.impl.DdsmPackageImpl.init();

    /**
     * The meta object id for the '{@link ddsm.impl.CloudElementImpl <em>Cloud Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.CloudElementImpl
     * @see ddsm.impl.DdsmPackageImpl#getCloudElement()
     * @generated
     */
    int CLOUD_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOUD_ELEMENT__RESOURCE = 0;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOUD_ELEMENT__PROPERTY = 1;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOUD_ELEMENT__CLOUD_ELEMENT_ID = 2;

    /**
     * The number of structural features of the '<em>Cloud Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOUD_ELEMENT_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Cloud Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOUD_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ddsm.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.PropertyImpl
     * @see ddsm.impl.DdsmPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__VALUE = 1;

    /**
     * The feature id for the '<em><b>Property Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__PROPERTY_ID = 2;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ResourceImpl
     * @see ddsm.impl.DdsmPackageImpl#getResource()
     * @generated
     */
    int RESOURCE = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__NAME = 0;

    /**
     * The feature id for the '<em><b>Resource Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__RESOURCE_ID = 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__VALUE = 2;

    /**
     * The number of structural features of the '<em>Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ComponentImpl
     * @see ddsm.impl.DdsmPackageImpl#getComponent()
     * @generated
     */
    int COMPONENT = 3;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__RESOURCE = CLOUD_ELEMENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__PROPERTY = CLOUD_ELEMENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__CLOUD_ELEMENT_ID = CLOUD_ELEMENT__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__PROVIDEDPORT = CLOUD_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__PROVIDEDEXECUTIONPLATFORM = CLOUD_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__NAME = CLOUD_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_FEATURE_COUNT = CLOUD_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_OPERATION_COUNT = CLOUD_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.InternalComponentImpl <em>Internal Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.InternalComponentImpl
     * @see ddsm.impl.DdsmPackageImpl#getInternalComponent()
     * @generated
     */
    int INTERNAL_COMPONENT = 4;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT__RESOURCE = COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT__PROPERTY = COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT__CLOUD_ELEMENT_ID = COMPONENT__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT__PROVIDEDPORT = COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM = COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT__NAME = COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT__REQUIREDPORT = COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Internalcomponent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT__INTERNALCOMPONENT = COMPONENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM = COMPONENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Internal Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Internal Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ExecutionPlatformImpl <em>Execution Platform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ExecutionPlatformImpl
     * @see ddsm.impl.DdsmPackageImpl#getExecutionPlatform()
     * @generated
     */
    int EXECUTION_PLATFORM = 5;

    /**
     * The feature id for the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PLATFORM__OWNER = 0;

    /**
     * The feature id for the '<em><b>Execution Platform Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PLATFORM__EXECUTION_PLATFORM_ID = 1;

    /**
     * The number of structural features of the '<em>Execution Platform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PLATFORM_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Execution Platform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PLATFORM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ddsm.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.PortImpl
     * @see ddsm.impl.DdsmPackageImpl#getPort()
     * @generated
     */
    int PORT = 6;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__COMPONENT = 0;

    /**
     * The feature id for the '<em><b>Port Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__PORT_ID = 1;

    /**
     * The number of structural features of the '<em>Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ddsm.impl.RequiredPortImpl <em>Required Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.RequiredPortImpl
     * @see ddsm.impl.DdsmPackageImpl#getRequiredPort()
     * @generated
     */
    int REQUIRED_PORT = 7;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_PORT__COMPONENT = PORT__COMPONENT;

    /**
     * The feature id for the '<em><b>Port Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_PORT__PORT_ID = PORT__PORT_ID;

    /**
     * The number of structural features of the '<em>Required Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Required Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ProvidedPortImpl
     * @see ddsm.impl.DdsmPackageImpl#getProvidedPort()
     * @generated
     */
    int PROVIDED_PORT = 8;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_PORT__COMPONENT = PORT__COMPONENT;

    /**
     * The feature id for the '<em><b>Port Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_PORT__PORT_ID = PORT__PORT_ID;

    /**
     * The number of structural features of the '<em>Provided Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Provided Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.RequiredExecutionPlatformImpl <em>Required Execution Platform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.RequiredExecutionPlatformImpl
     * @see ddsm.impl.DdsmPackageImpl#getRequiredExecutionPlatform()
     * @generated
     */
    int REQUIRED_EXECUTION_PLATFORM = 9;

    /**
     * The feature id for the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_EXECUTION_PLATFORM__OWNER = EXECUTION_PLATFORM__OWNER;

    /**
     * The feature id for the '<em><b>Execution Platform Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_EXECUTION_PLATFORM__EXECUTION_PLATFORM_ID = EXECUTION_PLATFORM__EXECUTION_PLATFORM_ID;

    /**
     * The number of structural features of the '<em>Required Execution Platform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_EXECUTION_PLATFORM_FEATURE_COUNT = EXECUTION_PLATFORM_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Required Execution Platform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_EXECUTION_PLATFORM_OPERATION_COUNT = EXECUTION_PLATFORM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ProvidedExecutionPlatformImpl <em>Provided Execution Platform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ProvidedExecutionPlatformImpl
     * @see ddsm.impl.DdsmPackageImpl#getProvidedExecutionPlatform()
     * @generated
     */
    int PROVIDED_EXECUTION_PLATFORM = 10;

    /**
     * The feature id for the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_EXECUTION_PLATFORM__OWNER = EXECUTION_PLATFORM__OWNER;

    /**
     * The feature id for the '<em><b>Execution Platform Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_EXECUTION_PLATFORM__EXECUTION_PLATFORM_ID = EXECUTION_PLATFORM__EXECUTION_PLATFORM_ID;

    /**
     * The feature id for the '<em><b>Offer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_EXECUTION_PLATFORM__OFFER = EXECUTION_PLATFORM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Provided Execution Platform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_EXECUTION_PLATFORM_FEATURE_COUNT = EXECUTION_PLATFORM_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Provided Execution Platform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_EXECUTION_PLATFORM_OPERATION_COUNT = EXECUTION_PLATFORM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.RelationshipImpl
     * @see ddsm.impl.DdsmPackageImpl#getRelationship()
     * @generated
     */
    int RELATIONSHIP = 11;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__RESOURCE = CLOUD_ELEMENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__PROPERTY = CLOUD_ELEMENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__CLOUD_ELEMENT_ID = CLOUD_ELEMENT__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__PROVIDEDPORT = CLOUD_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__REQUIREDPORT = CLOUD_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__NAME = CLOUD_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Relationship Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__RELATIONSHIP_ID = CLOUD_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_FEATURE_COUNT = CLOUD_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_OPERATION_COUNT = CLOUD_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ExecutionBindingImpl <em>Execution Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ExecutionBindingImpl
     * @see ddsm.impl.DdsmPackageImpl#getExecutionBinding()
     * @generated
     */
    int EXECUTION_BINDING = 12;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_BINDING__RESOURCE = CLOUD_ELEMENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_BINDING__PROPERTY = CLOUD_ELEMENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_BINDING__CLOUD_ELEMENT_ID = CLOUD_ELEMENT__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_BINDING__REQUIREDEXECUTIONPLATFORM = CLOUD_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_BINDING__PROVIDEDEXECUTIONPLATFORM = CLOUD_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_BINDING__NAME = CLOUD_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Binding Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_BINDING__BINDING_ID = CLOUD_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Execution Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_BINDING_FEATURE_COUNT = CLOUD_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Execution Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_BINDING_OPERATION_COUNT = CLOUD_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ExternalComponentImpl <em>External Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ExternalComponentImpl
     * @see ddsm.impl.DdsmPackageImpl#getExternalComponent()
     * @generated
     */
    int EXTERNAL_COMPONENT = 13;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__RESOURCE = COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__PROPERTY = COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__CLOUD_ELEMENT_ID = COMPONENT__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__PROVIDEDPORT = COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM = COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__NAME = COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Provider</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__PROVIDER = COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>External Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>External Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ProviderImpl <em>Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ProviderImpl
     * @see ddsm.impl.DdsmPackageImpl#getProvider()
     * @generated
     */
    int PROVIDER = 14;

    /**
     * The feature id for the '<em><b>Credentials Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDER__CREDENTIALS_PATH = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDER__NAME = 1;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDER__PROPERTY = 2;

    /**
     * The feature id for the '<em><b>Provider Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDER__PROVIDER_ID = 3;

    /**
     * The number of structural features of the '<em>Provider</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDER_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Provider</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ddsm.impl.VMImpl <em>VM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.VMImpl
     * @see ddsm.impl.DdsmPackageImpl#getVM()
     * @generated
     */
    int VM = 15;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__RESOURCE = EXTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__PROPERTY = EXTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__CLOUD_ELEMENT_ID = EXTERNAL_COMPONENT__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__PROVIDEDPORT = EXTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__PROVIDEDEXECUTIONPLATFORM = EXTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__NAME = EXTERNAL_COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Provider</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__PROVIDER = EXTERNAL_COMPONENT__PROVIDER;

    /**
     * The feature id for the '<em><b>Is64os</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__IS64OS = EXTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__LOCATION = EXTERNAL_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Image Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__IMAGE_ID = EXTERNAL_COMPONENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Max Cores</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__MAX_CORES = EXTERNAL_COMPONENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Max Ram</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__MAX_RAM = EXTERNAL_COMPONENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Max Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__MAX_STORAGE = EXTERNAL_COMPONENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Min Cores</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__MIN_CORES = EXTERNAL_COMPONENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Min Ram</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__MIN_RAM = EXTERNAL_COMPONENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Min Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__MIN_STORAGE = EXTERNAL_COMPONENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Os</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__OS = EXTERNAL_COMPONENT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Private Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__PRIVATE_KEY = EXTERNAL_COMPONENT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Provider Specific Type Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__PROVIDER_SPECIFIC_TYPE_NAME = EXTERNAL_COMPONENT_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Security Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__SECURITY_GROUP = EXTERNAL_COMPONENT_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Ssh Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__SSH_KEY = EXTERNAL_COMPONENT_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Public Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__PUBLIC_ADDRESS = EXTERNAL_COMPONENT_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Instances</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__INSTANCES = EXTERNAL_COMPONENT_FEATURE_COUNT + 15;

    /**
     * The number of structural features of the '<em>VM</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM_FEATURE_COUNT = EXTERNAL_COMPONENT_FEATURE_COUNT + 16;

    /**
     * The number of operations of the '<em>VM</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM_OPERATION_COUNT = EXTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.DDSMImpl <em>DDSM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.DDSMImpl
     * @see ddsm.impl.DdsmPackageImpl#getDDSM()
     * @generated
     */
    int DDSM = 16;

    /**
     * The feature id for the '<em><b>Cloudelement</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DDSM__CLOUDELEMENT = 0;

    /**
     * The feature id for the '<em><b>Provider</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DDSM__PROVIDER = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DDSM__NAME = 2;

    /**
     * The feature id for the '<em><b>Model Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DDSM__MODEL_ID = 3;

    /**
     * The number of structural features of the '<em>DDSM</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DDSM_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>DDSM</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DDSM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ddsm.impl.LifeCycleImpl <em>Life Cycle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.LifeCycleImpl
     * @see ddsm.impl.DdsmPackageImpl#getLifeCycle()
     * @generated
     */
    int LIFE_CYCLE = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__NAME = RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>Resource Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__RESOURCE_ID = RESOURCE__RESOURCE_ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__VALUE = RESOURCE__VALUE;

    /**
     * The feature id for the '<em><b>Download Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__DOWNLOAD_COMMAND = RESOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Install Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__INSTALL_COMMAND = RESOURCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Start Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__START_COMMAND = RESOURCE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Stop Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__STOP_COMMAND = RESOURCE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Life Cycle</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Life Cycle</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ChefRecipeImpl <em>Chef Recipe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ChefRecipeImpl
     * @see ddsm.impl.DdsmPackageImpl#getChefRecipe()
     * @generated
     */
    int CHEF_RECIPE = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RECIPE__NAME = RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>Resource Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RECIPE__RESOURCE_ID = RESOURCE__RESOURCE_ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RECIPE__VALUE = RESOURCE__VALUE;

    /**
     * The feature id for the '<em><b>Recipe Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RECIPE__RECIPE_URL = RESOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Recipe Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RECIPE__RECIPE_PATH = RESOURCE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Chef Recipe</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RECIPE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Chef Recipe</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RECIPE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.OfferImpl <em>Offer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.OfferImpl
     * @see ddsm.impl.DdsmPackageImpl#getOffer()
     * @generated
     */
    int OFFER = 19;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OFFER__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OFFER__VALUE = 1;

    /**
     * The number of structural features of the '<em>Offer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OFFER_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Offer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OFFER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ddsm.impl.StormSupervisorImpl <em>Storm Supervisor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.StormSupervisorImpl
     * @see ddsm.impl.DdsmPackageImpl#getStormSupervisor()
     * @generated
     */
    int STORM_SUPERVISOR = 20;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_SUPERVISOR__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_SUPERVISOR__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_SUPERVISOR__CLOUD_ELEMENT_ID = INTERNAL_COMPONENT__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_SUPERVISOR__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_SUPERVISOR__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_SUPERVISOR__NAME = INTERNAL_COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_SUPERVISOR__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Internalcomponent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_SUPERVISOR__INTERNALCOMPONENT = INTERNAL_COMPONENT__INTERNALCOMPONENT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_SUPERVISOR__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The number of structural features of the '<em>Storm Supervisor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_SUPERVISOR_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Storm Supervisor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_SUPERVISOR_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.MediumHostImpl <em>Medium Host</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.MediumHostImpl
     * @see ddsm.impl.DdsmPackageImpl#getMediumHost()
     * @generated
     */
    int MEDIUM_HOST = 21;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__RESOURCE = VM__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__PROPERTY = VM__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__CLOUD_ELEMENT_ID = VM__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__PROVIDEDPORT = VM__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__PROVIDEDEXECUTIONPLATFORM = VM__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__NAME = VM__NAME;

    /**
     * The feature id for the '<em><b>Provider</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__PROVIDER = VM__PROVIDER;

    /**
     * The feature id for the '<em><b>Is64os</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__IS64OS = VM__IS64OS;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__LOCATION = VM__LOCATION;

    /**
     * The feature id for the '<em><b>Image Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__IMAGE_ID = VM__IMAGE_ID;

    /**
     * The feature id for the '<em><b>Max Cores</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__MAX_CORES = VM__MAX_CORES;

    /**
     * The feature id for the '<em><b>Max Ram</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__MAX_RAM = VM__MAX_RAM;

    /**
     * The feature id for the '<em><b>Max Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__MAX_STORAGE = VM__MAX_STORAGE;

    /**
     * The feature id for the '<em><b>Min Cores</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__MIN_CORES = VM__MIN_CORES;

    /**
     * The feature id for the '<em><b>Min Ram</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__MIN_RAM = VM__MIN_RAM;

    /**
     * The feature id for the '<em><b>Min Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__MIN_STORAGE = VM__MIN_STORAGE;

    /**
     * The feature id for the '<em><b>Os</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__OS = VM__OS;

    /**
     * The feature id for the '<em><b>Private Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__PRIVATE_KEY = VM__PRIVATE_KEY;

    /**
     * The feature id for the '<em><b>Provider Specific Type Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__PROVIDER_SPECIFIC_TYPE_NAME = VM__PROVIDER_SPECIFIC_TYPE_NAME;

    /**
     * The feature id for the '<em><b>Security Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__SECURITY_GROUP = VM__SECURITY_GROUP;

    /**
     * The feature id for the '<em><b>Ssh Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__SSH_KEY = VM__SSH_KEY;

    /**
     * The feature id for the '<em><b>Public Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__PUBLIC_ADDRESS = VM__PUBLIC_ADDRESS;

    /**
     * The feature id for the '<em><b>Instances</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST__INSTANCES = VM__INSTANCES;

    /**
     * The number of structural features of the '<em>Medium Host</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST_FEATURE_COUNT = VM_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Medium Host</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIUM_HOST_OPERATION_COUNT = VM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.SmallHostImpl <em>Small Host</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.SmallHostImpl
     * @see ddsm.impl.DdsmPackageImpl#getSmallHost()
     * @generated
     */
    int SMALL_HOST = 22;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__RESOURCE = VM__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__PROPERTY = VM__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__CLOUD_ELEMENT_ID = VM__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__PROVIDEDPORT = VM__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__PROVIDEDEXECUTIONPLATFORM = VM__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__NAME = VM__NAME;

    /**
     * The feature id for the '<em><b>Provider</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__PROVIDER = VM__PROVIDER;

    /**
     * The feature id for the '<em><b>Is64os</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__IS64OS = VM__IS64OS;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__LOCATION = VM__LOCATION;

    /**
     * The feature id for the '<em><b>Image Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__IMAGE_ID = VM__IMAGE_ID;

    /**
     * The feature id for the '<em><b>Max Cores</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__MAX_CORES = VM__MAX_CORES;

    /**
     * The feature id for the '<em><b>Max Ram</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__MAX_RAM = VM__MAX_RAM;

    /**
     * The feature id for the '<em><b>Max Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__MAX_STORAGE = VM__MAX_STORAGE;

    /**
     * The feature id for the '<em><b>Min Cores</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__MIN_CORES = VM__MIN_CORES;

    /**
     * The feature id for the '<em><b>Min Ram</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__MIN_RAM = VM__MIN_RAM;

    /**
     * The feature id for the '<em><b>Min Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__MIN_STORAGE = VM__MIN_STORAGE;

    /**
     * The feature id for the '<em><b>Os</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__OS = VM__OS;

    /**
     * The feature id for the '<em><b>Private Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__PRIVATE_KEY = VM__PRIVATE_KEY;

    /**
     * The feature id for the '<em><b>Provider Specific Type Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__PROVIDER_SPECIFIC_TYPE_NAME = VM__PROVIDER_SPECIFIC_TYPE_NAME;

    /**
     * The feature id for the '<em><b>Security Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__SECURITY_GROUP = VM__SECURITY_GROUP;

    /**
     * The feature id for the '<em><b>Ssh Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__SSH_KEY = VM__SSH_KEY;

    /**
     * The feature id for the '<em><b>Public Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__PUBLIC_ADDRESS = VM__PUBLIC_ADDRESS;

    /**
     * The feature id for the '<em><b>Instances</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST__INSTANCES = VM__INSTANCES;

    /**
     * The number of structural features of the '<em>Small Host</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST_FEATURE_COUNT = VM_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Small Host</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMALL_HOST_OPERATION_COUNT = VM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.LargeHostImpl <em>Large Host</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.LargeHostImpl
     * @see ddsm.impl.DdsmPackageImpl#getLargeHost()
     * @generated
     */
    int LARGE_HOST = 23;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__RESOURCE = VM__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__PROPERTY = VM__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__CLOUD_ELEMENT_ID = VM__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__PROVIDEDPORT = VM__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__PROVIDEDEXECUTIONPLATFORM = VM__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__NAME = VM__NAME;

    /**
     * The feature id for the '<em><b>Provider</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__PROVIDER = VM__PROVIDER;

    /**
     * The feature id for the '<em><b>Is64os</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__IS64OS = VM__IS64OS;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__LOCATION = VM__LOCATION;

    /**
     * The feature id for the '<em><b>Image Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__IMAGE_ID = VM__IMAGE_ID;

    /**
     * The feature id for the '<em><b>Max Cores</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__MAX_CORES = VM__MAX_CORES;

    /**
     * The feature id for the '<em><b>Max Ram</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__MAX_RAM = VM__MAX_RAM;

    /**
     * The feature id for the '<em><b>Max Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__MAX_STORAGE = VM__MAX_STORAGE;

    /**
     * The feature id for the '<em><b>Min Cores</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__MIN_CORES = VM__MIN_CORES;

    /**
     * The feature id for the '<em><b>Min Ram</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__MIN_RAM = VM__MIN_RAM;

    /**
     * The feature id for the '<em><b>Min Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__MIN_STORAGE = VM__MIN_STORAGE;

    /**
     * The feature id for the '<em><b>Os</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__OS = VM__OS;

    /**
     * The feature id for the '<em><b>Private Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__PRIVATE_KEY = VM__PRIVATE_KEY;

    /**
     * The feature id for the '<em><b>Provider Specific Type Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__PROVIDER_SPECIFIC_TYPE_NAME = VM__PROVIDER_SPECIFIC_TYPE_NAME;

    /**
     * The feature id for the '<em><b>Security Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__SECURITY_GROUP = VM__SECURITY_GROUP;

    /**
     * The feature id for the '<em><b>Ssh Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__SSH_KEY = VM__SSH_KEY;

    /**
     * The feature id for the '<em><b>Public Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__PUBLIC_ADDRESS = VM__PUBLIC_ADDRESS;

    /**
     * The feature id for the '<em><b>Instances</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST__INSTANCES = VM__INSTANCES;

    /**
     * The number of structural features of the '<em>Large Host</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST_FEATURE_COUNT = VM_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Large Host</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_HOST_OPERATION_COUNT = VM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.StormNimbusImpl <em>Storm Nimbus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.StormNimbusImpl
     * @see ddsm.impl.DdsmPackageImpl#getStormNimbus()
     * @generated
     */
    int STORM_NIMBUS = 24;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_NIMBUS__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_NIMBUS__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_NIMBUS__CLOUD_ELEMENT_ID = INTERNAL_COMPONENT__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_NIMBUS__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_NIMBUS__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_NIMBUS__NAME = INTERNAL_COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_NIMBUS__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Internalcomponent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_NIMBUS__INTERNALCOMPONENT = INTERNAL_COMPONENT__INTERNALCOMPONENT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_NIMBUS__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The number of structural features of the '<em>Storm Nimbus</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_NIMBUS_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Storm Nimbus</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_NIMBUS_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ZookeeperImpl <em>Zookeeper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ZookeeperImpl
     * @see ddsm.impl.DdsmPackageImpl#getZookeeper()
     * @generated
     */
    int ZOOKEEPER = 25;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER__CLOUD_ELEMENT_ID = INTERNAL_COMPONENT__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER__NAME = INTERNAL_COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Internalcomponent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER__INTERNALCOMPONENT = INTERNAL_COMPONENT__INTERNALCOMPONENT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The number of structural features of the '<em>Zookeeper</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Zookeeper</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.KafkaImpl <em>Kafka</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.KafkaImpl
     * @see ddsm.impl.DdsmPackageImpl#getKafka()
     * @generated
     */
    int KAFKA = 26;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KAFKA__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KAFKA__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KAFKA__CLOUD_ELEMENT_ID = INTERNAL_COMPONENT__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KAFKA__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KAFKA__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KAFKA__NAME = INTERNAL_COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KAFKA__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Internalcomponent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KAFKA__INTERNALCOMPONENT = INTERNAL_COMPONENT__INTERNALCOMPONENT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KAFKA__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The number of structural features of the '<em>Kafka</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KAFKA_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Kafka</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KAFKA_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.LoadBalancerImpl <em>Load Balancer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.LoadBalancerImpl
     * @see ddsm.impl.DdsmPackageImpl#getLoadBalancer()
     * @generated
     */
    int LOAD_BALANCER = 27;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOAD_BALANCER__RESOURCE = EXTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOAD_BALANCER__PROPERTY = EXTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOAD_BALANCER__CLOUD_ELEMENT_ID = EXTERNAL_COMPONENT__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOAD_BALANCER__PROVIDEDPORT = EXTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOAD_BALANCER__PROVIDEDEXECUTIONPLATFORM = EXTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOAD_BALANCER__NAME = EXTERNAL_COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Provider</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOAD_BALANCER__PROVIDER = EXTERNAL_COMPONENT__PROVIDER;

    /**
     * The number of structural features of the '<em>Load Balancer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOAD_BALANCER_FEATURE_COUNT = EXTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Load Balancer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOAD_BALANCER_OPERATION_COUNT = EXTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ClusterImpl <em>Cluster</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ClusterImpl
     * @see ddsm.impl.DdsmPackageImpl#getCluster()
     * @generated
     */
    int CLUSTER = 28;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__RESOURCE = CLOUD_ELEMENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__PROPERTY = CLOUD_ELEMENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__CLOUD_ELEMENT_ID = CLOUD_ELEMENT__CLOUD_ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Has Vm</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__HAS_VM = CLOUD_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Cluster</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER_FEATURE_COUNT = CLOUD_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Cluster</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER_OPERATION_COUNT = CLOUD_ELEMENT_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link ddsm.CloudElement <em>Cloud Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cloud Element</em>'.
     * @see ddsm.CloudElement
     * @generated
     */
    EClass getCloudElement();

    /**
     * Returns the meta object for the containment reference list '{@link ddsm.CloudElement#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Resource</em>'.
     * @see ddsm.CloudElement#getResource()
     * @see #getCloudElement()
     * @generated
     */
    EReference getCloudElement_Resource();

    /**
     * Returns the meta object for the containment reference list '{@link ddsm.CloudElement#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see ddsm.CloudElement#getProperty()
     * @see #getCloudElement()
     * @generated
     */
    EReference getCloudElement_Property();

    /**
     * Returns the meta object for the attribute '{@link ddsm.CloudElement#getCloudElementId <em>Cloud Element Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cloud Element Id</em>'.
     * @see ddsm.CloudElement#getCloudElementId()
     * @see #getCloudElement()
     * @generated
     */
    EAttribute getCloudElement_CloudElementId();

    /**
     * Returns the meta object for class '{@link ddsm.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see ddsm.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Property#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ddsm.Property#getName()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Name();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Property#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see ddsm.Property#getValue()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Value();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Property#getPropertyId <em>Property Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Property Id</em>'.
     * @see ddsm.Property#getPropertyId()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_PropertyId();

    /**
     * Returns the meta object for class '{@link ddsm.Resource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource</em>'.
     * @see ddsm.Resource
     * @generated
     */
    EClass getResource();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Resource#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ddsm.Resource#getName()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_Name();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Resource#getResourceId <em>Resource Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource Id</em>'.
     * @see ddsm.Resource#getResourceId()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_ResourceId();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Resource#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see ddsm.Resource#getValue()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_Value();

    /**
     * Returns the meta object for class '{@link ddsm.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component</em>'.
     * @see ddsm.Component
     * @generated
     */
    EClass getComponent();

    /**
     * Returns the meta object for the containment reference list '{@link ddsm.Component#getProvidedport <em>Providedport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Providedport</em>'.
     * @see ddsm.Component#getProvidedport()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_Providedport();

    /**
     * Returns the meta object for the containment reference list '{@link ddsm.Component#getProvidedexecutionplatform <em>Providedexecutionplatform</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Providedexecutionplatform</em>'.
     * @see ddsm.Component#getProvidedexecutionplatform()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_Providedexecutionplatform();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Component#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ddsm.Component#getName()
     * @see #getComponent()
     * @generated
     */
    EAttribute getComponent_Name();

    /**
     * Returns the meta object for class '{@link ddsm.InternalComponent <em>Internal Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Internal Component</em>'.
     * @see ddsm.InternalComponent
     * @generated
     */
    EClass getInternalComponent();

    /**
     * Returns the meta object for the containment reference list '{@link ddsm.InternalComponent#getRequiredport <em>Requiredport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Requiredport</em>'.
     * @see ddsm.InternalComponent#getRequiredport()
     * @see #getInternalComponent()
     * @generated
     */
    EReference getInternalComponent_Requiredport();

    /**
     * Returns the meta object for the containment reference list '{@link ddsm.InternalComponent#getInternalcomponent <em>Internalcomponent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Internalcomponent</em>'.
     * @see ddsm.InternalComponent#getInternalcomponent()
     * @see #getInternalComponent()
     * @generated
     */
    EReference getInternalComponent_Internalcomponent();

    /**
     * Returns the meta object for the containment reference list '{@link ddsm.InternalComponent#getRequiredexecutionplatform <em>Requiredexecutionplatform</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Requiredexecutionplatform</em>'.
     * @see ddsm.InternalComponent#getRequiredexecutionplatform()
     * @see #getInternalComponent()
     * @generated
     */
    EReference getInternalComponent_Requiredexecutionplatform();

    /**
     * Returns the meta object for class '{@link ddsm.ExecutionPlatform <em>Execution Platform</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Execution Platform</em>'.
     * @see ddsm.ExecutionPlatform
     * @generated
     */
    EClass getExecutionPlatform();

    /**
     * Returns the meta object for the reference '{@link ddsm.ExecutionPlatform#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Owner</em>'.
     * @see ddsm.ExecutionPlatform#getOwner()
     * @see #getExecutionPlatform()
     * @generated
     */
    EReference getExecutionPlatform_Owner();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ExecutionPlatform#getExecutionPlatformId <em>Execution Platform Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Execution Platform Id</em>'.
     * @see ddsm.ExecutionPlatform#getExecutionPlatformId()
     * @see #getExecutionPlatform()
     * @generated
     */
    EAttribute getExecutionPlatform_ExecutionPlatformId();

    /**
     * Returns the meta object for class '{@link ddsm.Port <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Port</em>'.
     * @see ddsm.Port
     * @generated
     */
    EClass getPort();

    /**
     * Returns the meta object for the reference '{@link ddsm.Port#getComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Component</em>'.
     * @see ddsm.Port#getComponent()
     * @see #getPort()
     * @generated
     */
    EReference getPort_Component();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Port#getPortId <em>Port Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port Id</em>'.
     * @see ddsm.Port#getPortId()
     * @see #getPort()
     * @generated
     */
    EAttribute getPort_PortId();

    /**
     * Returns the meta object for class '{@link ddsm.RequiredPort <em>Required Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Required Port</em>'.
     * @see ddsm.RequiredPort
     * @generated
     */
    EClass getRequiredPort();

    /**
     * Returns the meta object for class '{@link ddsm.ProvidedPort <em>Provided Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Provided Port</em>'.
     * @see ddsm.ProvidedPort
     * @generated
     */
    EClass getProvidedPort();

    /**
     * Returns the meta object for class '{@link ddsm.RequiredExecutionPlatform <em>Required Execution Platform</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Required Execution Platform</em>'.
     * @see ddsm.RequiredExecutionPlatform
     * @generated
     */
    EClass getRequiredExecutionPlatform();

    /**
     * Returns the meta object for class '{@link ddsm.ProvidedExecutionPlatform <em>Provided Execution Platform</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Provided Execution Platform</em>'.
     * @see ddsm.ProvidedExecutionPlatform
     * @generated
     */
    EClass getProvidedExecutionPlatform();

    /**
     * Returns the meta object for the containment reference list '{@link ddsm.ProvidedExecutionPlatform#getOffer <em>Offer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Offer</em>'.
     * @see ddsm.ProvidedExecutionPlatform#getOffer()
     * @see #getProvidedExecutionPlatform()
     * @generated
     */
    EReference getProvidedExecutionPlatform_Offer();

    /**
     * Returns the meta object for class '{@link ddsm.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relationship</em>'.
     * @see ddsm.Relationship
     * @generated
     */
    EClass getRelationship();

    /**
     * Returns the meta object for the reference '{@link ddsm.Relationship#getProvidedport <em>Providedport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Providedport</em>'.
     * @see ddsm.Relationship#getProvidedport()
     * @see #getRelationship()
     * @generated
     */
    EReference getRelationship_Providedport();

    /**
     * Returns the meta object for the reference '{@link ddsm.Relationship#getRequiredport <em>Requiredport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Requiredport</em>'.
     * @see ddsm.Relationship#getRequiredport()
     * @see #getRelationship()
     * @generated
     */
    EReference getRelationship_Requiredport();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Relationship#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ddsm.Relationship#getName()
     * @see #getRelationship()
     * @generated
     */
    EAttribute getRelationship_Name();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Relationship#getRelationshipId <em>Relationship Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Relationship Id</em>'.
     * @see ddsm.Relationship#getRelationshipId()
     * @see #getRelationship()
     * @generated
     */
    EAttribute getRelationship_RelationshipId();

    /**
     * Returns the meta object for class '{@link ddsm.ExecutionBinding <em>Execution Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Execution Binding</em>'.
     * @see ddsm.ExecutionBinding
     * @generated
     */
    EClass getExecutionBinding();

    /**
     * Returns the meta object for the reference '{@link ddsm.ExecutionBinding#getRequiredexecutionplatform <em>Requiredexecutionplatform</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Requiredexecutionplatform</em>'.
     * @see ddsm.ExecutionBinding#getRequiredexecutionplatform()
     * @see #getExecutionBinding()
     * @generated
     */
    EReference getExecutionBinding_Requiredexecutionplatform();

    /**
     * Returns the meta object for the reference '{@link ddsm.ExecutionBinding#getProvidedexecutionplatform <em>Providedexecutionplatform</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Providedexecutionplatform</em>'.
     * @see ddsm.ExecutionBinding#getProvidedexecutionplatform()
     * @see #getExecutionBinding()
     * @generated
     */
    EReference getExecutionBinding_Providedexecutionplatform();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ExecutionBinding#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ddsm.ExecutionBinding#getName()
     * @see #getExecutionBinding()
     * @generated
     */
    EAttribute getExecutionBinding_Name();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ExecutionBinding#getBindingId <em>Binding Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Binding Id</em>'.
     * @see ddsm.ExecutionBinding#getBindingId()
     * @see #getExecutionBinding()
     * @generated
     */
    EAttribute getExecutionBinding_BindingId();

    /**
     * Returns the meta object for class '{@link ddsm.ExternalComponent <em>External Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>External Component</em>'.
     * @see ddsm.ExternalComponent
     * @generated
     */
    EClass getExternalComponent();

    /**
     * Returns the meta object for the reference '{@link ddsm.ExternalComponent#getProvider <em>Provider</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Provider</em>'.
     * @see ddsm.ExternalComponent#getProvider()
     * @see #getExternalComponent()
     * @generated
     */
    EReference getExternalComponent_Provider();

    /**
     * Returns the meta object for class '{@link ddsm.Provider <em>Provider</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Provider</em>'.
     * @see ddsm.Provider
     * @generated
     */
    EClass getProvider();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Provider#getCredentialsPath <em>Credentials Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Credentials Path</em>'.
     * @see ddsm.Provider#getCredentialsPath()
     * @see #getProvider()
     * @generated
     */
    EAttribute getProvider_CredentialsPath();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Provider#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ddsm.Provider#getName()
     * @see #getProvider()
     * @generated
     */
    EAttribute getProvider_Name();

    /**
     * Returns the meta object for the containment reference list '{@link ddsm.Provider#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see ddsm.Provider#getProperty()
     * @see #getProvider()
     * @generated
     */
    EReference getProvider_Property();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Provider#getProviderId <em>Provider Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Provider Id</em>'.
     * @see ddsm.Provider#getProviderId()
     * @see #getProvider()
     * @generated
     */
    EAttribute getProvider_ProviderId();

    /**
     * Returns the meta object for class '{@link ddsm.VM <em>VM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>VM</em>'.
     * @see ddsm.VM
     * @generated
     */
    EClass getVM();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getIs64os <em>Is64os</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is64os</em>'.
     * @see ddsm.VM#getIs64os()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_Is64os();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see ddsm.VM#getLocation()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_Location();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getImageId <em>Image Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Image Id</em>'.
     * @see ddsm.VM#getImageId()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_ImageId();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getMaxCores <em>Max Cores</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Cores</em>'.
     * @see ddsm.VM#getMaxCores()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_MaxCores();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getMaxRam <em>Max Ram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Ram</em>'.
     * @see ddsm.VM#getMaxRam()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_MaxRam();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getMaxStorage <em>Max Storage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Storage</em>'.
     * @see ddsm.VM#getMaxStorage()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_MaxStorage();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getMinCores <em>Min Cores</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Cores</em>'.
     * @see ddsm.VM#getMinCores()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_MinCores();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getMinRam <em>Min Ram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Ram</em>'.
     * @see ddsm.VM#getMinRam()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_MinRam();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getMinStorage <em>Min Storage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Storage</em>'.
     * @see ddsm.VM#getMinStorage()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_MinStorage();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getOs <em>Os</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Os</em>'.
     * @see ddsm.VM#getOs()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_Os();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getPrivateKey <em>Private Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Private Key</em>'.
     * @see ddsm.VM#getPrivateKey()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_PrivateKey();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getProviderSpecificTypeName <em>Provider Specific Type Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Provider Specific Type Name</em>'.
     * @see ddsm.VM#getProviderSpecificTypeName()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_ProviderSpecificTypeName();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getSecurityGroup <em>Security Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Security Group</em>'.
     * @see ddsm.VM#getSecurityGroup()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_SecurityGroup();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getSshKey <em>Ssh Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ssh Key</em>'.
     * @see ddsm.VM#getSshKey()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_SshKey();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getPublicAddress <em>Public Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Public Address</em>'.
     * @see ddsm.VM#getPublicAddress()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_PublicAddress();

    /**
     * Returns the meta object for the attribute '{@link ddsm.VM#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Instances</em>'.
     * @see ddsm.VM#getInstances()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_Instances();

    /**
     * Returns the meta object for class '{@link ddsm.DDSM <em>DDSM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>DDSM</em>'.
     * @see ddsm.DDSM
     * @generated
     */
    EClass getDDSM();

    /**
     * Returns the meta object for the containment reference list '{@link ddsm.DDSM#getCloudelement <em>Cloudelement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Cloudelement</em>'.
     * @see ddsm.DDSM#getCloudelement()
     * @see #getDDSM()
     * @generated
     */
    EReference getDDSM_Cloudelement();

    /**
     * Returns the meta object for the containment reference list '{@link ddsm.DDSM#getProvider <em>Provider</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Provider</em>'.
     * @see ddsm.DDSM#getProvider()
     * @see #getDDSM()
     * @generated
     */
    EReference getDDSM_Provider();

    /**
     * Returns the meta object for the attribute '{@link ddsm.DDSM#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ddsm.DDSM#getName()
     * @see #getDDSM()
     * @generated
     */
    EAttribute getDDSM_Name();

    /**
     * Returns the meta object for the attribute '{@link ddsm.DDSM#getModelId <em>Model Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Model Id</em>'.
     * @see ddsm.DDSM#getModelId()
     * @see #getDDSM()
     * @generated
     */
    EAttribute getDDSM_ModelId();

    /**
     * Returns the meta object for class '{@link ddsm.LifeCycle <em>Life Cycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Life Cycle</em>'.
     * @see ddsm.LifeCycle
     * @generated
     */
    EClass getLifeCycle();

    /**
     * Returns the meta object for the attribute '{@link ddsm.LifeCycle#getDownloadCommand <em>Download Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Download Command</em>'.
     * @see ddsm.LifeCycle#getDownloadCommand()
     * @see #getLifeCycle()
     * @generated
     */
    EAttribute getLifeCycle_DownloadCommand();

    /**
     * Returns the meta object for the attribute '{@link ddsm.LifeCycle#getInstallCommand <em>Install Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Install Command</em>'.
     * @see ddsm.LifeCycle#getInstallCommand()
     * @see #getLifeCycle()
     * @generated
     */
    EAttribute getLifeCycle_InstallCommand();

    /**
     * Returns the meta object for the attribute '{@link ddsm.LifeCycle#getStartCommand <em>Start Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start Command</em>'.
     * @see ddsm.LifeCycle#getStartCommand()
     * @see #getLifeCycle()
     * @generated
     */
    EAttribute getLifeCycle_StartCommand();

    /**
     * Returns the meta object for the attribute '{@link ddsm.LifeCycle#getStopCommand <em>Stop Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stop Command</em>'.
     * @see ddsm.LifeCycle#getStopCommand()
     * @see #getLifeCycle()
     * @generated
     */
    EAttribute getLifeCycle_StopCommand();

    /**
     * Returns the meta object for class '{@link ddsm.ChefRecipe <em>Chef Recipe</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Chef Recipe</em>'.
     * @see ddsm.ChefRecipe
     * @generated
     */
    EClass getChefRecipe();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ChefRecipe#getRecipeUrl <em>Recipe Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Recipe Url</em>'.
     * @see ddsm.ChefRecipe#getRecipeUrl()
     * @see #getChefRecipe()
     * @generated
     */
    EAttribute getChefRecipe_RecipeUrl();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ChefRecipe#getRecipePath <em>Recipe Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Recipe Path</em>'.
     * @see ddsm.ChefRecipe#getRecipePath()
     * @see #getChefRecipe()
     * @generated
     */
    EAttribute getChefRecipe_RecipePath();

    /**
     * Returns the meta object for class '{@link ddsm.Offer <em>Offer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Offer</em>'.
     * @see ddsm.Offer
     * @generated
     */
    EClass getOffer();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Offer#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ddsm.Offer#getName()
     * @see #getOffer()
     * @generated
     */
    EAttribute getOffer_Name();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Offer#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see ddsm.Offer#getValue()
     * @see #getOffer()
     * @generated
     */
    EAttribute getOffer_Value();

    /**
     * Returns the meta object for class '{@link ddsm.StormSupervisor <em>Storm Supervisor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Storm Supervisor</em>'.
     * @see ddsm.StormSupervisor
     * @generated
     */
    EClass getStormSupervisor();

    /**
     * Returns the meta object for class '{@link ddsm.MediumHost <em>Medium Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Medium Host</em>'.
     * @see ddsm.MediumHost
     * @generated
     */
    EClass getMediumHost();

    /**
     * Returns the meta object for class '{@link ddsm.SmallHost <em>Small Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Small Host</em>'.
     * @see ddsm.SmallHost
     * @generated
     */
    EClass getSmallHost();

    /**
     * Returns the meta object for class '{@link ddsm.LargeHost <em>Large Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Large Host</em>'.
     * @see ddsm.LargeHost
     * @generated
     */
    EClass getLargeHost();

    /**
     * Returns the meta object for class '{@link ddsm.StormNimbus <em>Storm Nimbus</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Storm Nimbus</em>'.
     * @see ddsm.StormNimbus
     * @generated
     */
    EClass getStormNimbus();

    /**
     * Returns the meta object for class '{@link ddsm.Zookeeper <em>Zookeeper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Zookeeper</em>'.
     * @see ddsm.Zookeeper
     * @generated
     */
    EClass getZookeeper();

    /**
     * Returns the meta object for class '{@link ddsm.Kafka <em>Kafka</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Kafka</em>'.
     * @see ddsm.Kafka
     * @generated
     */
    EClass getKafka();

    /**
     * Returns the meta object for class '{@link ddsm.LoadBalancer <em>Load Balancer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Load Balancer</em>'.
     * @see ddsm.LoadBalancer
     * @generated
     */
    EClass getLoadBalancer();

    /**
     * Returns the meta object for class '{@link ddsm.Cluster <em>Cluster</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cluster</em>'.
     * @see ddsm.Cluster
     * @generated
     */
    EClass getCluster();

    /**
     * Returns the meta object for the reference '{@link ddsm.Cluster#getHasVm <em>Has Vm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Has Vm</em>'.
     * @see ddsm.Cluster#getHasVm()
     * @see #getCluster()
     * @generated
     */
    EReference getCluster_HasVm();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DdsmFactory getDdsmFactory();

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
         * The meta object literal for the '{@link ddsm.impl.CloudElementImpl <em>Cloud Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.CloudElementImpl
         * @see ddsm.impl.DdsmPackageImpl#getCloudElement()
         * @generated
         */
        EClass CLOUD_ELEMENT = eINSTANCE.getCloudElement();

        /**
         * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLOUD_ELEMENT__RESOURCE = eINSTANCE.getCloudElement_Resource();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLOUD_ELEMENT__PROPERTY = eINSTANCE.getCloudElement_Property();

        /**
         * The meta object literal for the '<em><b>Cloud Element Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLOUD_ELEMENT__CLOUD_ELEMENT_ID = eINSTANCE.getCloudElement_CloudElementId();

        /**
         * The meta object literal for the '{@link ddsm.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.PropertyImpl
         * @see ddsm.impl.DdsmPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

        /**
         * The meta object literal for the '<em><b>Property Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__PROPERTY_ID = eINSTANCE.getProperty_PropertyId();

        /**
         * The meta object literal for the '{@link ddsm.impl.ResourceImpl <em>Resource</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ResourceImpl
         * @see ddsm.impl.DdsmPackageImpl#getResource()
         * @generated
         */
        EClass RESOURCE = eINSTANCE.getResource();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

        /**
         * The meta object literal for the '<em><b>Resource Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__RESOURCE_ID = eINSTANCE.getResource_ResourceId();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__VALUE = eINSTANCE.getResource_Value();

        /**
         * The meta object literal for the '{@link ddsm.impl.ComponentImpl <em>Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ComponentImpl
         * @see ddsm.impl.DdsmPackageImpl#getComponent()
         * @generated
         */
        EClass COMPONENT = eINSTANCE.getComponent();

        /**
         * The meta object literal for the '<em><b>Providedport</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__PROVIDEDPORT = eINSTANCE.getComponent_Providedport();

        /**
         * The meta object literal for the '<em><b>Providedexecutionplatform</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__PROVIDEDEXECUTIONPLATFORM = eINSTANCE.getComponent_Providedexecutionplatform();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

        /**
         * The meta object literal for the '{@link ddsm.impl.InternalComponentImpl <em>Internal Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.InternalComponentImpl
         * @see ddsm.impl.DdsmPackageImpl#getInternalComponent()
         * @generated
         */
        EClass INTERNAL_COMPONENT = eINSTANCE.getInternalComponent();

        /**
         * The meta object literal for the '<em><b>Requiredport</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERNAL_COMPONENT__REQUIREDPORT = eINSTANCE.getInternalComponent_Requiredport();

        /**
         * The meta object literal for the '<em><b>Internalcomponent</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERNAL_COMPONENT__INTERNALCOMPONENT = eINSTANCE.getInternalComponent_Internalcomponent();

        /**
         * The meta object literal for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM = eINSTANCE.getInternalComponent_Requiredexecutionplatform();

        /**
         * The meta object literal for the '{@link ddsm.impl.ExecutionPlatformImpl <em>Execution Platform</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ExecutionPlatformImpl
         * @see ddsm.impl.DdsmPackageImpl#getExecutionPlatform()
         * @generated
         */
        EClass EXECUTION_PLATFORM = eINSTANCE.getExecutionPlatform();

        /**
         * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXECUTION_PLATFORM__OWNER = eINSTANCE.getExecutionPlatform_Owner();

        /**
         * The meta object literal for the '<em><b>Execution Platform Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXECUTION_PLATFORM__EXECUTION_PLATFORM_ID = eINSTANCE.getExecutionPlatform_ExecutionPlatformId();

        /**
         * The meta object literal for the '{@link ddsm.impl.PortImpl <em>Port</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.PortImpl
         * @see ddsm.impl.DdsmPackageImpl#getPort()
         * @generated
         */
        EClass PORT = eINSTANCE.getPort();

        /**
         * The meta object literal for the '<em><b>Component</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PORT__COMPONENT = eINSTANCE.getPort_Component();

        /**
         * The meta object literal for the '<em><b>Port Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PORT__PORT_ID = eINSTANCE.getPort_PortId();

        /**
         * The meta object literal for the '{@link ddsm.impl.RequiredPortImpl <em>Required Port</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.RequiredPortImpl
         * @see ddsm.impl.DdsmPackageImpl#getRequiredPort()
         * @generated
         */
        EClass REQUIRED_PORT = eINSTANCE.getRequiredPort();

        /**
         * The meta object literal for the '{@link ddsm.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ProvidedPortImpl
         * @see ddsm.impl.DdsmPackageImpl#getProvidedPort()
         * @generated
         */
        EClass PROVIDED_PORT = eINSTANCE.getProvidedPort();

        /**
         * The meta object literal for the '{@link ddsm.impl.RequiredExecutionPlatformImpl <em>Required Execution Platform</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.RequiredExecutionPlatformImpl
         * @see ddsm.impl.DdsmPackageImpl#getRequiredExecutionPlatform()
         * @generated
         */
        EClass REQUIRED_EXECUTION_PLATFORM = eINSTANCE.getRequiredExecutionPlatform();

        /**
         * The meta object literal for the '{@link ddsm.impl.ProvidedExecutionPlatformImpl <em>Provided Execution Platform</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ProvidedExecutionPlatformImpl
         * @see ddsm.impl.DdsmPackageImpl#getProvidedExecutionPlatform()
         * @generated
         */
        EClass PROVIDED_EXECUTION_PLATFORM = eINSTANCE.getProvidedExecutionPlatform();

        /**
         * The meta object literal for the '<em><b>Offer</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROVIDED_EXECUTION_PLATFORM__OFFER = eINSTANCE.getProvidedExecutionPlatform_Offer();

        /**
         * The meta object literal for the '{@link ddsm.impl.RelationshipImpl <em>Relationship</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.RelationshipImpl
         * @see ddsm.impl.DdsmPackageImpl#getRelationship()
         * @generated
         */
        EClass RELATIONSHIP = eINSTANCE.getRelationship();

        /**
         * The meta object literal for the '<em><b>Providedport</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATIONSHIP__PROVIDEDPORT = eINSTANCE.getRelationship_Providedport();

        /**
         * The meta object literal for the '<em><b>Requiredport</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATIONSHIP__REQUIREDPORT = eINSTANCE.getRelationship_Requiredport();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATIONSHIP__NAME = eINSTANCE.getRelationship_Name();

        /**
         * The meta object literal for the '<em><b>Relationship Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATIONSHIP__RELATIONSHIP_ID = eINSTANCE.getRelationship_RelationshipId();

        /**
         * The meta object literal for the '{@link ddsm.impl.ExecutionBindingImpl <em>Execution Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ExecutionBindingImpl
         * @see ddsm.impl.DdsmPackageImpl#getExecutionBinding()
         * @generated
         */
        EClass EXECUTION_BINDING = eINSTANCE.getExecutionBinding();

        /**
         * The meta object literal for the '<em><b>Requiredexecutionplatform</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXECUTION_BINDING__REQUIREDEXECUTIONPLATFORM = eINSTANCE.getExecutionBinding_Requiredexecutionplatform();

        /**
         * The meta object literal for the '<em><b>Providedexecutionplatform</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXECUTION_BINDING__PROVIDEDEXECUTIONPLATFORM = eINSTANCE.getExecutionBinding_Providedexecutionplatform();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXECUTION_BINDING__NAME = eINSTANCE.getExecutionBinding_Name();

        /**
         * The meta object literal for the '<em><b>Binding Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXECUTION_BINDING__BINDING_ID = eINSTANCE.getExecutionBinding_BindingId();

        /**
         * The meta object literal for the '{@link ddsm.impl.ExternalComponentImpl <em>External Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ExternalComponentImpl
         * @see ddsm.impl.DdsmPackageImpl#getExternalComponent()
         * @generated
         */
        EClass EXTERNAL_COMPONENT = eINSTANCE.getExternalComponent();

        /**
         * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTERNAL_COMPONENT__PROVIDER = eINSTANCE.getExternalComponent_Provider();

        /**
         * The meta object literal for the '{@link ddsm.impl.ProviderImpl <em>Provider</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ProviderImpl
         * @see ddsm.impl.DdsmPackageImpl#getProvider()
         * @generated
         */
        EClass PROVIDER = eINSTANCE.getProvider();

        /**
         * The meta object literal for the '<em><b>Credentials Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROVIDER__CREDENTIALS_PATH = eINSTANCE.getProvider_CredentialsPath();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROVIDER__NAME = eINSTANCE.getProvider_Name();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROVIDER__PROPERTY = eINSTANCE.getProvider_Property();

        /**
         * The meta object literal for the '<em><b>Provider Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROVIDER__PROVIDER_ID = eINSTANCE.getProvider_ProviderId();

        /**
         * The meta object literal for the '{@link ddsm.impl.VMImpl <em>VM</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.VMImpl
         * @see ddsm.impl.DdsmPackageImpl#getVM()
         * @generated
         */
        EClass VM = eINSTANCE.getVM();

        /**
         * The meta object literal for the '<em><b>Is64os</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__IS64OS = eINSTANCE.getVM_Is64os();

        /**
         * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__LOCATION = eINSTANCE.getVM_Location();

        /**
         * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__IMAGE_ID = eINSTANCE.getVM_ImageId();

        /**
         * The meta object literal for the '<em><b>Max Cores</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__MAX_CORES = eINSTANCE.getVM_MaxCores();

        /**
         * The meta object literal for the '<em><b>Max Ram</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__MAX_RAM = eINSTANCE.getVM_MaxRam();

        /**
         * The meta object literal for the '<em><b>Max Storage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__MAX_STORAGE = eINSTANCE.getVM_MaxStorage();

        /**
         * The meta object literal for the '<em><b>Min Cores</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__MIN_CORES = eINSTANCE.getVM_MinCores();

        /**
         * The meta object literal for the '<em><b>Min Ram</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__MIN_RAM = eINSTANCE.getVM_MinRam();

        /**
         * The meta object literal for the '<em><b>Min Storage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__MIN_STORAGE = eINSTANCE.getVM_MinStorage();

        /**
         * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__OS = eINSTANCE.getVM_Os();

        /**
         * The meta object literal for the '<em><b>Private Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__PRIVATE_KEY = eINSTANCE.getVM_PrivateKey();

        /**
         * The meta object literal for the '<em><b>Provider Specific Type Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__PROVIDER_SPECIFIC_TYPE_NAME = eINSTANCE.getVM_ProviderSpecificTypeName();

        /**
         * The meta object literal for the '<em><b>Security Group</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__SECURITY_GROUP = eINSTANCE.getVM_SecurityGroup();

        /**
         * The meta object literal for the '<em><b>Ssh Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__SSH_KEY = eINSTANCE.getVM_SshKey();

        /**
         * The meta object literal for the '<em><b>Public Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__PUBLIC_ADDRESS = eINSTANCE.getVM_PublicAddress();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__INSTANCES = eINSTANCE.getVM_Instances();

        /**
         * The meta object literal for the '{@link ddsm.impl.DDSMImpl <em>DDSM</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.DDSMImpl
         * @see ddsm.impl.DdsmPackageImpl#getDDSM()
         * @generated
         */
        EClass DDSM = eINSTANCE.getDDSM();

        /**
         * The meta object literal for the '<em><b>Cloudelement</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DDSM__CLOUDELEMENT = eINSTANCE.getDDSM_Cloudelement();

        /**
         * The meta object literal for the '<em><b>Provider</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DDSM__PROVIDER = eINSTANCE.getDDSM_Provider();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DDSM__NAME = eINSTANCE.getDDSM_Name();

        /**
         * The meta object literal for the '<em><b>Model Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DDSM__MODEL_ID = eINSTANCE.getDDSM_ModelId();

        /**
         * The meta object literal for the '{@link ddsm.impl.LifeCycleImpl <em>Life Cycle</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.LifeCycleImpl
         * @see ddsm.impl.DdsmPackageImpl#getLifeCycle()
         * @generated
         */
        EClass LIFE_CYCLE = eINSTANCE.getLifeCycle();

        /**
         * The meta object literal for the '<em><b>Download Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIFE_CYCLE__DOWNLOAD_COMMAND = eINSTANCE.getLifeCycle_DownloadCommand();

        /**
         * The meta object literal for the '<em><b>Install Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIFE_CYCLE__INSTALL_COMMAND = eINSTANCE.getLifeCycle_InstallCommand();

        /**
         * The meta object literal for the '<em><b>Start Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIFE_CYCLE__START_COMMAND = eINSTANCE.getLifeCycle_StartCommand();

        /**
         * The meta object literal for the '<em><b>Stop Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIFE_CYCLE__STOP_COMMAND = eINSTANCE.getLifeCycle_StopCommand();

        /**
         * The meta object literal for the '{@link ddsm.impl.ChefRecipeImpl <em>Chef Recipe</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ChefRecipeImpl
         * @see ddsm.impl.DdsmPackageImpl#getChefRecipe()
         * @generated
         */
        EClass CHEF_RECIPE = eINSTANCE.getChefRecipe();

        /**
         * The meta object literal for the '<em><b>Recipe Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHEF_RECIPE__RECIPE_URL = eINSTANCE.getChefRecipe_RecipeUrl();

        /**
         * The meta object literal for the '<em><b>Recipe Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHEF_RECIPE__RECIPE_PATH = eINSTANCE.getChefRecipe_RecipePath();

        /**
         * The meta object literal for the '{@link ddsm.impl.OfferImpl <em>Offer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.OfferImpl
         * @see ddsm.impl.DdsmPackageImpl#getOffer()
         * @generated
         */
        EClass OFFER = eINSTANCE.getOffer();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OFFER__NAME = eINSTANCE.getOffer_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OFFER__VALUE = eINSTANCE.getOffer_Value();

        /**
         * The meta object literal for the '{@link ddsm.impl.StormSupervisorImpl <em>Storm Supervisor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.StormSupervisorImpl
         * @see ddsm.impl.DdsmPackageImpl#getStormSupervisor()
         * @generated
         */
        EClass STORM_SUPERVISOR = eINSTANCE.getStormSupervisor();

        /**
         * The meta object literal for the '{@link ddsm.impl.MediumHostImpl <em>Medium Host</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.MediumHostImpl
         * @see ddsm.impl.DdsmPackageImpl#getMediumHost()
         * @generated
         */
        EClass MEDIUM_HOST = eINSTANCE.getMediumHost();

        /**
         * The meta object literal for the '{@link ddsm.impl.SmallHostImpl <em>Small Host</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.SmallHostImpl
         * @see ddsm.impl.DdsmPackageImpl#getSmallHost()
         * @generated
         */
        EClass SMALL_HOST = eINSTANCE.getSmallHost();

        /**
         * The meta object literal for the '{@link ddsm.impl.LargeHostImpl <em>Large Host</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.LargeHostImpl
         * @see ddsm.impl.DdsmPackageImpl#getLargeHost()
         * @generated
         */
        EClass LARGE_HOST = eINSTANCE.getLargeHost();

        /**
         * The meta object literal for the '{@link ddsm.impl.StormNimbusImpl <em>Storm Nimbus</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.StormNimbusImpl
         * @see ddsm.impl.DdsmPackageImpl#getStormNimbus()
         * @generated
         */
        EClass STORM_NIMBUS = eINSTANCE.getStormNimbus();

        /**
         * The meta object literal for the '{@link ddsm.impl.ZookeeperImpl <em>Zookeeper</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ZookeeperImpl
         * @see ddsm.impl.DdsmPackageImpl#getZookeeper()
         * @generated
         */
        EClass ZOOKEEPER = eINSTANCE.getZookeeper();

        /**
         * The meta object literal for the '{@link ddsm.impl.KafkaImpl <em>Kafka</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.KafkaImpl
         * @see ddsm.impl.DdsmPackageImpl#getKafka()
         * @generated
         */
        EClass KAFKA = eINSTANCE.getKafka();

        /**
         * The meta object literal for the '{@link ddsm.impl.LoadBalancerImpl <em>Load Balancer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.LoadBalancerImpl
         * @see ddsm.impl.DdsmPackageImpl#getLoadBalancer()
         * @generated
         */
        EClass LOAD_BALANCER = eINSTANCE.getLoadBalancer();

        /**
         * The meta object literal for the '{@link ddsm.impl.ClusterImpl <em>Cluster</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ClusterImpl
         * @see ddsm.impl.DdsmPackageImpl#getCluster()
         * @generated
         */
        EClass CLUSTER = eINSTANCE.getCluster();

        /**
         * The meta object literal for the '<em><b>Has Vm</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLUSTER__HAS_VM = eINSTANCE.getCluster_HasVm();

    }

} //DdsmPackage
