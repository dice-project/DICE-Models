/**
 */
package ddsm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOUD_ELEMENT__ELEMENT_ID = 2;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOUD_ELEMENT__DESCRIPTION = 3;

    /**
     * The number of structural features of the '<em>Cloud Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOUD_ELEMENT_FEATURE_COUNT = 4;

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
     * The feature id for the '<em><b>Property Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__PROPERTY_ID = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__VALUE = 1;

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
     * The meta object id for the '{@link ddsm.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ResourceImpl
     * @see ddsm.impl.DdsmPackageImpl#getResource()
     * @generated
     */
    int RESOURCE = 2;

    /**
     * The feature id for the '<em><b>Resource Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__RESOURCE_ID = 0;

    /**
     * The feature id for the '<em><b>Scripts</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__SCRIPTS = 1;

    /**
     * The number of structural features of the '<em>Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_FEATURE_COUNT = 2;

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
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__ELEMENT_ID = CLOUD_ELEMENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__DESCRIPTION = CLOUD_ELEMENT__DESCRIPTION;

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
     * The number of structural features of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_FEATURE_COUNT = CLOUD_ELEMENT_FEATURE_COUNT + 2;

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
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT__ELEMENT_ID = COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT__DESCRIPTION = COMPONENT__DESCRIPTION;

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
     * The feature id for the '<em><b>Public Ports</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT__PUBLIC_PORTS = COMPONENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Internal Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

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
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PLATFORM__RESOURCE = CLOUD_ELEMENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PLATFORM__PROPERTY = CLOUD_ELEMENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PLATFORM__ELEMENT_ID = CLOUD_ELEMENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PLATFORM__DESCRIPTION = CLOUD_ELEMENT__DESCRIPTION;

    /**
     * The number of structural features of the '<em>Execution Platform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PLATFORM_FEATURE_COUNT = CLOUD_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Execution Platform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PLATFORM_OPERATION_COUNT = CLOUD_ELEMENT_OPERATION_COUNT + 0;

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
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__RESOURCE = CLOUD_ELEMENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__PROPERTY = CLOUD_ELEMENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__ELEMENT_ID = CLOUD_ELEMENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__DESCRIPTION = CLOUD_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Is Local</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__IS_LOCAL = CLOUD_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Port Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__PORT_NUMBER = CLOUD_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_FEATURE_COUNT = CLOUD_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_OPERATION_COUNT = CLOUD_ELEMENT_OPERATION_COUNT + 0;

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
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_PORT__RESOURCE = PORT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_PORT__PROPERTY = PORT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_PORT__ELEMENT_ID = PORT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_PORT__DESCRIPTION = PORT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Is Local</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_PORT__IS_LOCAL = PORT__IS_LOCAL;

    /**
     * The feature id for the '<em><b>Port Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_PORT__PORT_NUMBER = PORT__PORT_NUMBER;

    /**
     * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_PORT__IS_MANDATORY = PORT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Required Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

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
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_PORT__RESOURCE = PORT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_PORT__PROPERTY = PORT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_PORT__ELEMENT_ID = PORT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_PORT__DESCRIPTION = PORT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Is Local</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_PORT__IS_LOCAL = PORT__IS_LOCAL;

    /**
     * The feature id for the '<em><b>Port Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_PORT__PORT_NUMBER = PORT__PORT_NUMBER;

    /**
     * The feature id for the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_PORT__OWNER = PORT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Provided Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

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
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_EXECUTION_PLATFORM__RESOURCE = EXECUTION_PLATFORM__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_EXECUTION_PLATFORM__PROPERTY = EXECUTION_PLATFORM__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_EXECUTION_PLATFORM__ELEMENT_ID = EXECUTION_PLATFORM__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_EXECUTION_PLATFORM__DESCRIPTION = EXECUTION_PLATFORM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_EXECUTION_PLATFORM__IS_MANDATORY = EXECUTION_PLATFORM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Required Execution Platform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_EXECUTION_PLATFORM_FEATURE_COUNT = EXECUTION_PLATFORM_FEATURE_COUNT + 1;

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
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_EXECUTION_PLATFORM__RESOURCE = EXECUTION_PLATFORM__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_EXECUTION_PLATFORM__PROPERTY = EXECUTION_PLATFORM__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_EXECUTION_PLATFORM__ELEMENT_ID = EXECUTION_PLATFORM__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_EXECUTION_PLATFORM__DESCRIPTION = EXECUTION_PLATFORM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDED_EXECUTION_PLATFORM__OWNER = EXECUTION_PLATFORM_FEATURE_COUNT + 0;

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
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__ELEMENT_ID = CLOUD_ELEMENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__DESCRIPTION = CLOUD_ELEMENT__DESCRIPTION;

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
     * The number of structural features of the '<em>Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_FEATURE_COUNT = CLOUD_ELEMENT_FEATURE_COUNT + 2;

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
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_BINDING__ELEMENT_ID = CLOUD_ELEMENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_BINDING__DESCRIPTION = CLOUD_ELEMENT__DESCRIPTION;

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
     * The number of structural features of the '<em>Execution Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_BINDING_FEATURE_COUNT = CLOUD_ELEMENT_FEATURE_COUNT + 2;

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
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__ELEMENT_ID = COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__DESCRIPTION = COMPONENT__DESCRIPTION;

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
     * The feature id for the '<em><b>Provider</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__PROVIDER = COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__LOCATION = COMPONENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Login</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__LOGIN = COMPONENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__PASSWORD = COMPONENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Region</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__REGION = COMPONENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Service Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__SERVICE_TYPE = COMPONENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>External Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 6;

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
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDER__RESOURCE = CLOUD_ELEMENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDER__PROPERTY = CLOUD_ELEMENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDER__ELEMENT_ID = CLOUD_ELEMENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDER__DESCRIPTION = CLOUD_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Credentials Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDER__CREDENTIALS_PATH = CLOUD_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDER__TYPE = CLOUD_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Provider</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDER_FEATURE_COUNT = CLOUD_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Provider</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDER_OPERATION_COUNT = CLOUD_ELEMENT_OPERATION_COUNT + 0;

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
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__ELEMENT_ID = EXTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__DESCRIPTION = EXTERNAL_COMPONENT__DESCRIPTION;

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
     * The feature id for the '<em><b>Provider</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__PROVIDER = EXTERNAL_COMPONENT__PROVIDER;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__LOCATION = EXTERNAL_COMPONENT__LOCATION;

    /**
     * The feature id for the '<em><b>Login</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__LOGIN = EXTERNAL_COMPONENT__LOGIN;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__PASSWORD = EXTERNAL_COMPONENT__PASSWORD;

    /**
     * The feature id for the '<em><b>Region</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__REGION = EXTERNAL_COMPONENT__REGION;

    /**
     * The feature id for the '<em><b>Service Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__SERVICE_TYPE = EXTERNAL_COMPONENT__SERVICE_TYPE;

    /**
     * The feature id for the '<em><b>Is64os</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__IS64OS = EXTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Image Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__IMAGE_ID = EXTERNAL_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Max Cores</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__MAX_CORES = EXTERNAL_COMPONENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Max Ram</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__MAX_RAM = EXTERNAL_COMPONENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Max Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__MAX_STORAGE = EXTERNAL_COMPONENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Min Cores</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__MIN_CORES = EXTERNAL_COMPONENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Min Ram</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__MIN_RAM = EXTERNAL_COMPONENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Min Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__MIN_STORAGE = EXTERNAL_COMPONENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Os</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__OS = EXTERNAL_COMPONENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Private Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__PRIVATE_KEY = EXTERNAL_COMPONENT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Provider Specific Type Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__PROVIDER_SPECIFIC_TYPE_NAME = EXTERNAL_COMPONENT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Security Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__SECURITY_GROUP = EXTERNAL_COMPONENT_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Ssh Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__SSH_KEY = EXTERNAL_COMPONENT_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Public Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__PUBLIC_ADDRESS = EXTERNAL_COMPONENT_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Instances</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__INSTANCES = EXTERNAL_COMPONENT_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Generic Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__GENERIC_SIZE = EXTERNAL_COMPONENT_FEATURE_COUNT + 15;

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
     * The feature id for the '<em><b>Model Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DDSM__MODEL_ID = 1;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DDSM__DESCRIPTION = 2;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DDSM__PROPERTIES = 3;

    /**
     * The feature id for the '<em><b>Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DDSM__RESOURCES = 4;

    /**
     * The number of structural features of the '<em>DDSM</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DDSM_FEATURE_COUNT = 5;

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
     * The feature id for the '<em><b>Resource Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__RESOURCE_ID = RESOURCE__RESOURCE_ID;

    /**
     * The feature id for the '<em><b>Scripts</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__SCRIPTS = RESOURCE__SCRIPTS;

    /**
     * The feature id for the '<em><b>Download Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__DOWNLOAD_COMMAND = RESOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Install Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__INSTALL_COMMAND = RESOURCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Start Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__START_COMMAND = RESOURCE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Stop Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__STOP_COMMAND = RESOURCE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Preconfigure Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__PRECONFIGURE_COMMAND = RESOURCE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Create Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE__CREATE_COMMAND = RESOURCE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Life Cycle</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Life Cycle</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFE_CYCLE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.StormSupervisorImpl <em>Storm Supervisor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.StormSupervisorImpl
     * @see ddsm.impl.DdsmPackageImpl#getStormSupervisor()
     * @generated
     */
    int STORM_SUPERVISOR = 18;

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
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_SUPERVISOR__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_SUPERVISOR__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

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
     * The feature id for the '<em><b>Public Ports</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_SUPERVISOR__PUBLIC_PORTS = INTERNAL_COMPONENT__PUBLIC_PORTS;

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
     * The meta object id for the '{@link ddsm.impl.StormNimbusImpl <em>Storm Nimbus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.StormNimbusImpl
     * @see ddsm.impl.DdsmPackageImpl#getStormNimbus()
     * @generated
     */
    int STORM_NIMBUS = 19;

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
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_NIMBUS__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_NIMBUS__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

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
     * The feature id for the '<em><b>Public Ports</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_NIMBUS__PUBLIC_PORTS = INTERNAL_COMPONENT__PUBLIC_PORTS;

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
    int ZOOKEEPER = 20;

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
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

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
     * The feature id for the '<em><b>Public Ports</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER__PUBLIC_PORTS = INTERNAL_COMPONENT__PUBLIC_PORTS;

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
    int KAFKA = 21;

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
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KAFKA__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KAFKA__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

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
     * The feature id for the '<em><b>Public Ports</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KAFKA__PUBLIC_PORTS = INTERNAL_COMPONENT__PUBLIC_PORTS;

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
     * The meta object id for the '{@link ddsm.impl.ClusterImpl <em>Cluster</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ClusterImpl
     * @see ddsm.impl.DdsmPackageImpl#getCluster()
     * @generated
     */
    int CLUSTER = 22;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__RESOURCE = EXTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__PROPERTY = EXTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__ELEMENT_ID = EXTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__DESCRIPTION = EXTERNAL_COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__PROVIDEDPORT = EXTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__PROVIDEDEXECUTIONPLATFORM = EXTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Provider</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__PROVIDER = EXTERNAL_COMPONENT__PROVIDER;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__LOCATION = EXTERNAL_COMPONENT__LOCATION;

    /**
     * The feature id for the '<em><b>Login</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__LOGIN = EXTERNAL_COMPONENT__LOGIN;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__PASSWORD = EXTERNAL_COMPONENT__PASSWORD;

    /**
     * The feature id for the '<em><b>Region</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__REGION = EXTERNAL_COMPONENT__REGION;

    /**
     * The feature id for the '<em><b>Service Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__SERVICE_TYPE = EXTERNAL_COMPONENT__SERVICE_TYPE;

    /**
     * The feature id for the '<em><b>Has Vm</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER__HAS_VM = EXTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Cluster</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER_FEATURE_COUNT = EXTERNAL_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Cluster</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLUSTER_OPERATION_COUNT = EXTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ClientNodeImpl <em>Client Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ClientNodeImpl
     * @see ddsm.impl.DdsmPackageImpl#getClientNode()
     * @generated
     */
    int CLIENT_NODE = 23;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Internalcomponent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__INTERNALCOMPONENT = INTERNAL_COMPONENT__INTERNALCOMPONENT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Public Ports</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__PUBLIC_PORTS = INTERNAL_COMPONENT__PUBLIC_PORTS;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__TYPE = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Artifact Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__ARTIFACT_URL = INTERNAL_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Main Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__MAIN_CLASS = INTERNAL_COMPONENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Client Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Client Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.YarnResourceManagerImpl <em>Yarn Resource Manager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.YarnResourceManagerImpl
     * @see ddsm.impl.DdsmPackageImpl#getYarnResourceManager()
     * @generated
     */
    int YARN_RESOURCE_MANAGER = 24;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Internalcomponent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__INTERNALCOMPONENT = INTERNAL_COMPONENT__INTERNALCOMPONENT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Public Ports</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__PUBLIC_PORTS = INTERNAL_COMPONENT__PUBLIC_PORTS;

    /**
     * The number of structural features of the '<em>Yarn Resource Manager</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Yarn Resource Manager</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.YarnNodeManagerImpl <em>Yarn Node Manager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.YarnNodeManagerImpl
     * @see ddsm.impl.DdsmPackageImpl#getYarnNodeManager()
     * @generated
     */
    int YARN_NODE_MANAGER = 25;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Internalcomponent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__INTERNALCOMPONENT = INTERNAL_COMPONENT__INTERNALCOMPONENT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Public Ports</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__PUBLIC_PORTS = INTERNAL_COMPONENT__PUBLIC_PORTS;

    /**
     * The number of structural features of the '<em>Yarn Node Manager</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Yarn Node Manager</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.HDFSNameNodeImpl <em>HDFS Name Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.HDFSNameNodeImpl
     * @see ddsm.impl.DdsmPackageImpl#getHDFSNameNode()
     * @generated
     */
    int HDFS_NAME_NODE = 26;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Internalcomponent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__INTERNALCOMPONENT = INTERNAL_COMPONENT__INTERNALCOMPONENT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Public Ports</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__PUBLIC_PORTS = INTERNAL_COMPONENT__PUBLIC_PORTS;

    /**
     * The number of structural features of the '<em>HDFS Name Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>HDFS Name Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.HDFSDataNodeImpl <em>HDFS Data Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.HDFSDataNodeImpl
     * @see ddsm.impl.DdsmPackageImpl#getHDFSDataNode()
     * @generated
     */
    int HDFS_DATA_NODE = 27;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Internalcomponent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__INTERNALCOMPONENT = INTERNAL_COMPONENT__INTERNALCOMPONENT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Public Ports</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__PUBLIC_PORTS = INTERNAL_COMPONENT__PUBLIC_PORTS;

    /**
     * The number of structural features of the '<em>HDFS Data Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>HDFS Data Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ScriptImpl
     * @see ddsm.impl.DdsmPackageImpl#getScript()
     * @generated
     */
    int SCRIPT = 28;

    /**
     * The feature id for the '<em><b>Script Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT__SCRIPT_ID = 0;

    /**
     * The feature id for the '<em><b>Script Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT__SCRIPT_URI = 1;

    /**
     * The number of structural features of the '<em>Script</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Script</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ddsm.VMSize <em>VM Size</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.VMSize
     * @see ddsm.impl.DdsmPackageImpl#getVMSize()
     * @generated
     */
    int VM_SIZE = 29;

    /**
     * The meta object id for the '{@link ddsm.ProviderType <em>Provider Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.ProviderType
     * @see ddsm.impl.DdsmPackageImpl#getProviderType()
     * @generated
     */
    int PROVIDER_TYPE = 30;


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
     * Returns the meta object for the attribute '{@link ddsm.CloudElement#getElementId <em>Element Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Element Id</em>'.
     * @see ddsm.CloudElement#getElementId()
     * @see #getCloudElement()
     * @generated
     */
    EAttribute getCloudElement_ElementId();

    /**
     * Returns the meta object for the attribute '{@link ddsm.CloudElement#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see ddsm.CloudElement#getDescription()
     * @see #getCloudElement()
     * @generated
     */
    EAttribute getCloudElement_Description();

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
     * Returns the meta object for the containment reference '{@link ddsm.Resource#getScripts <em>Scripts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Scripts</em>'.
     * @see ddsm.Resource#getScripts()
     * @see #getResource()
     * @generated
     */
    EReference getResource_Scripts();

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
     * Returns the meta object for the attribute list '{@link ddsm.InternalComponent#getPublicPorts <em>Public Ports</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Public Ports</em>'.
     * @see ddsm.InternalComponent#getPublicPorts()
     * @see #getInternalComponent()
     * @generated
     */
    EAttribute getInternalComponent_PublicPorts();

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
     * Returns the meta object for class '{@link ddsm.Port <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Port</em>'.
     * @see ddsm.Port
     * @generated
     */
    EClass getPort();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Port#isIsLocal <em>Is Local</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Local</em>'.
     * @see ddsm.Port#isIsLocal()
     * @see #getPort()
     * @generated
     */
    EAttribute getPort_IsLocal();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Port#getPortNumber <em>Port Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port Number</em>'.
     * @see ddsm.Port#getPortNumber()
     * @see #getPort()
     * @generated
     */
    EAttribute getPort_PortNumber();

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
     * Returns the meta object for the attribute '{@link ddsm.RequiredPort#isIsMandatory <em>Is Mandatory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Mandatory</em>'.
     * @see ddsm.RequiredPort#isIsMandatory()
     * @see #getRequiredPort()
     * @generated
     */
    EAttribute getRequiredPort_IsMandatory();

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
     * Returns the meta object for the reference '{@link ddsm.ProvidedPort#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Owner</em>'.
     * @see ddsm.ProvidedPort#getOwner()
     * @see #getProvidedPort()
     * @generated
     */
    EReference getProvidedPort_Owner();

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
     * Returns the meta object for the attribute '{@link ddsm.RequiredExecutionPlatform#isIsMandatory <em>Is Mandatory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Mandatory</em>'.
     * @see ddsm.RequiredExecutionPlatform#isIsMandatory()
     * @see #getRequiredExecutionPlatform()
     * @generated
     */
    EAttribute getRequiredExecutionPlatform_IsMandatory();

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
     * Returns the meta object for the reference '{@link ddsm.ProvidedExecutionPlatform#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Owner</em>'.
     * @see ddsm.ProvidedExecutionPlatform#getOwner()
     * @see #getProvidedExecutionPlatform()
     * @generated
     */
    EReference getProvidedExecutionPlatform_Owner();

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
     * Returns the meta object for the attribute '{@link ddsm.ExternalComponent#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see ddsm.ExternalComponent#getLocation()
     * @see #getExternalComponent()
     * @generated
     */
    EAttribute getExternalComponent_Location();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ExternalComponent#getLogin <em>Login</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Login</em>'.
     * @see ddsm.ExternalComponent#getLogin()
     * @see #getExternalComponent()
     * @generated
     */
    EAttribute getExternalComponent_Login();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ExternalComponent#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see ddsm.ExternalComponent#getPassword()
     * @see #getExternalComponent()
     * @generated
     */
    EAttribute getExternalComponent_Password();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ExternalComponent#getRegion <em>Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Region</em>'.
     * @see ddsm.ExternalComponent#getRegion()
     * @see #getExternalComponent()
     * @generated
     */
    EAttribute getExternalComponent_Region();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ExternalComponent#getServiceType <em>Service Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service Type</em>'.
     * @see ddsm.ExternalComponent#getServiceType()
     * @see #getExternalComponent()
     * @generated
     */
    EAttribute getExternalComponent_ServiceType();

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
     * Returns the meta object for the attribute '{@link ddsm.Provider#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see ddsm.Provider#getType()
     * @see #getProvider()
     * @generated
     */
    EAttribute getProvider_Type();

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
     * Returns the meta object for the attribute '{@link ddsm.VM#getGenericSize <em>Generic Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Generic Size</em>'.
     * @see ddsm.VM#getGenericSize()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_GenericSize();

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
     * Returns the meta object for the attribute '{@link ddsm.DDSM#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see ddsm.DDSM#getDescription()
     * @see #getDDSM()
     * @generated
     */
    EAttribute getDDSM_Description();

    /**
     * Returns the meta object for the containment reference list '{@link ddsm.DDSM#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see ddsm.DDSM#getProperties()
     * @see #getDDSM()
     * @generated
     */
    EReference getDDSM_Properties();

    /**
     * Returns the meta object for the containment reference list '{@link ddsm.DDSM#getResources <em>Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Resources</em>'.
     * @see ddsm.DDSM#getResources()
     * @see #getDDSM()
     * @generated
     */
    EReference getDDSM_Resources();

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
     * Returns the meta object for the containment reference '{@link ddsm.LifeCycle#getDownloadCommand <em>Download Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Download Command</em>'.
     * @see ddsm.LifeCycle#getDownloadCommand()
     * @see #getLifeCycle()
     * @generated
     */
    EReference getLifeCycle_DownloadCommand();

    /**
     * Returns the meta object for the containment reference '{@link ddsm.LifeCycle#getInstallCommand <em>Install Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Install Command</em>'.
     * @see ddsm.LifeCycle#getInstallCommand()
     * @see #getLifeCycle()
     * @generated
     */
    EReference getLifeCycle_InstallCommand();

    /**
     * Returns the meta object for the containment reference '{@link ddsm.LifeCycle#getStartCommand <em>Start Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Start Command</em>'.
     * @see ddsm.LifeCycle#getStartCommand()
     * @see #getLifeCycle()
     * @generated
     */
    EReference getLifeCycle_StartCommand();

    /**
     * Returns the meta object for the containment reference '{@link ddsm.LifeCycle#getStopCommand <em>Stop Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Stop Command</em>'.
     * @see ddsm.LifeCycle#getStopCommand()
     * @see #getLifeCycle()
     * @generated
     */
    EReference getLifeCycle_StopCommand();

    /**
     * Returns the meta object for the containment reference '{@link ddsm.LifeCycle#getPreconfigureCommand <em>Preconfigure Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Preconfigure Command</em>'.
     * @see ddsm.LifeCycle#getPreconfigureCommand()
     * @see #getLifeCycle()
     * @generated
     */
    EReference getLifeCycle_PreconfigureCommand();

    /**
     * Returns the meta object for the containment reference '{@link ddsm.LifeCycle#getCreateCommand <em>Create Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Create Command</em>'.
     * @see ddsm.LifeCycle#getCreateCommand()
     * @see #getLifeCycle()
     * @generated
     */
    EReference getLifeCycle_CreateCommand();

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
     * Returns the meta object for class '{@link ddsm.Cluster <em>Cluster</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cluster</em>'.
     * @see ddsm.Cluster
     * @generated
     */
    EClass getCluster();

    /**
     * Returns the meta object for the reference list '{@link ddsm.Cluster#getHasVm <em>Has Vm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Has Vm</em>'.
     * @see ddsm.Cluster#getHasVm()
     * @see #getCluster()
     * @generated
     */
    EReference getCluster_HasVm();

    /**
     * Returns the meta object for class '{@link ddsm.ClientNode <em>Client Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Client Node</em>'.
     * @see ddsm.ClientNode
     * @generated
     */
    EClass getClientNode();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ClientNode#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see ddsm.ClientNode#getType()
     * @see #getClientNode()
     * @generated
     */
    EAttribute getClientNode_Type();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ClientNode#getArtifactUrl <em>Artifact Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Artifact Url</em>'.
     * @see ddsm.ClientNode#getArtifactUrl()
     * @see #getClientNode()
     * @generated
     */
    EAttribute getClientNode_ArtifactUrl();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ClientNode#getMainClass <em>Main Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Main Class</em>'.
     * @see ddsm.ClientNode#getMainClass()
     * @see #getClientNode()
     * @generated
     */
    EAttribute getClientNode_MainClass();

    /**
     * Returns the meta object for class '{@link ddsm.YarnResourceManager <em>Yarn Resource Manager</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Yarn Resource Manager</em>'.
     * @see ddsm.YarnResourceManager
     * @generated
     */
    EClass getYarnResourceManager();

    /**
     * Returns the meta object for class '{@link ddsm.YarnNodeManager <em>Yarn Node Manager</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Yarn Node Manager</em>'.
     * @see ddsm.YarnNodeManager
     * @generated
     */
    EClass getYarnNodeManager();

    /**
     * Returns the meta object for class '{@link ddsm.HDFSNameNode <em>HDFS Name Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>HDFS Name Node</em>'.
     * @see ddsm.HDFSNameNode
     * @generated
     */
    EClass getHDFSNameNode();

    /**
     * Returns the meta object for class '{@link ddsm.HDFSDataNode <em>HDFS Data Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>HDFS Data Node</em>'.
     * @see ddsm.HDFSDataNode
     * @generated
     */
    EClass getHDFSDataNode();

    /**
     * Returns the meta object for class '{@link ddsm.Script <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script</em>'.
     * @see ddsm.Script
     * @generated
     */
    EClass getScript();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Script#getScriptId <em>Script Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Script Id</em>'.
     * @see ddsm.Script#getScriptId()
     * @see #getScript()
     * @generated
     */
    EAttribute getScript_ScriptId();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Script#getScriptUri <em>Script Uri</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Script Uri</em>'.
     * @see ddsm.Script#getScriptUri()
     * @see #getScript()
     * @generated
     */
    EAttribute getScript_ScriptUri();

    /**
     * Returns the meta object for enum '{@link ddsm.VMSize <em>VM Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>VM Size</em>'.
     * @see ddsm.VMSize
     * @generated
     */
    EEnum getVMSize();

    /**
     * Returns the meta object for enum '{@link ddsm.ProviderType <em>Provider Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Provider Type</em>'.
     * @see ddsm.ProviderType
     * @generated
     */
    EEnum getProviderType();

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
         * The meta object literal for the '<em><b>Element Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLOUD_ELEMENT__ELEMENT_ID = eINSTANCE.getCloudElement_ElementId();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLOUD_ELEMENT__DESCRIPTION = eINSTANCE.getCloudElement_Description();

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
         * The meta object literal for the '<em><b>Resource Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__RESOURCE_ID = eINSTANCE.getResource_ResourceId();

        /**
         * The meta object literal for the '<em><b>Scripts</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESOURCE__SCRIPTS = eINSTANCE.getResource_Scripts();

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
         * The meta object literal for the '<em><b>Public Ports</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERNAL_COMPONENT__PUBLIC_PORTS = eINSTANCE.getInternalComponent_PublicPorts();

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
         * The meta object literal for the '{@link ddsm.impl.PortImpl <em>Port</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.PortImpl
         * @see ddsm.impl.DdsmPackageImpl#getPort()
         * @generated
         */
        EClass PORT = eINSTANCE.getPort();

        /**
         * The meta object literal for the '<em><b>Is Local</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PORT__IS_LOCAL = eINSTANCE.getPort_IsLocal();

        /**
         * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PORT__PORT_NUMBER = eINSTANCE.getPort_PortNumber();

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
         * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REQUIRED_PORT__IS_MANDATORY = eINSTANCE.getRequiredPort_IsMandatory();

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
         * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROVIDED_PORT__OWNER = eINSTANCE.getProvidedPort_Owner();

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
         * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REQUIRED_EXECUTION_PLATFORM__IS_MANDATORY = eINSTANCE.getRequiredExecutionPlatform_IsMandatory();

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
         * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROVIDED_EXECUTION_PLATFORM__OWNER = eINSTANCE.getProvidedExecutionPlatform_Owner();

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
         * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTERNAL_COMPONENT__LOCATION = eINSTANCE.getExternalComponent_Location();

        /**
         * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTERNAL_COMPONENT__LOGIN = eINSTANCE.getExternalComponent_Login();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTERNAL_COMPONENT__PASSWORD = eINSTANCE.getExternalComponent_Password();

        /**
         * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTERNAL_COMPONENT__REGION = eINSTANCE.getExternalComponent_Region();

        /**
         * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTERNAL_COMPONENT__SERVICE_TYPE = eINSTANCE.getExternalComponent_ServiceType();

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
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROVIDER__TYPE = eINSTANCE.getProvider_Type();

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
         * The meta object literal for the '<em><b>Generic Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__GENERIC_SIZE = eINSTANCE.getVM_GenericSize();

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
         * The meta object literal for the '<em><b>Model Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DDSM__MODEL_ID = eINSTANCE.getDDSM_ModelId();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DDSM__DESCRIPTION = eINSTANCE.getDDSM_Description();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DDSM__PROPERTIES = eINSTANCE.getDDSM_Properties();

        /**
         * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DDSM__RESOURCES = eINSTANCE.getDDSM_Resources();

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
         * The meta object literal for the '<em><b>Download Command</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIFE_CYCLE__DOWNLOAD_COMMAND = eINSTANCE.getLifeCycle_DownloadCommand();

        /**
         * The meta object literal for the '<em><b>Install Command</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIFE_CYCLE__INSTALL_COMMAND = eINSTANCE.getLifeCycle_InstallCommand();

        /**
         * The meta object literal for the '<em><b>Start Command</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIFE_CYCLE__START_COMMAND = eINSTANCE.getLifeCycle_StartCommand();

        /**
         * The meta object literal for the '<em><b>Stop Command</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIFE_CYCLE__STOP_COMMAND = eINSTANCE.getLifeCycle_StopCommand();

        /**
         * The meta object literal for the '<em><b>Preconfigure Command</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIFE_CYCLE__PRECONFIGURE_COMMAND = eINSTANCE.getLifeCycle_PreconfigureCommand();

        /**
         * The meta object literal for the '<em><b>Create Command</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIFE_CYCLE__CREATE_COMMAND = eINSTANCE.getLifeCycle_CreateCommand();

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
         * The meta object literal for the '{@link ddsm.impl.ClusterImpl <em>Cluster</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ClusterImpl
         * @see ddsm.impl.DdsmPackageImpl#getCluster()
         * @generated
         */
        EClass CLUSTER = eINSTANCE.getCluster();

        /**
         * The meta object literal for the '<em><b>Has Vm</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLUSTER__HAS_VM = eINSTANCE.getCluster_HasVm();

        /**
         * The meta object literal for the '{@link ddsm.impl.ClientNodeImpl <em>Client Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ClientNodeImpl
         * @see ddsm.impl.DdsmPackageImpl#getClientNode()
         * @generated
         */
        EClass CLIENT_NODE = eINSTANCE.getClientNode();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLIENT_NODE__TYPE = eINSTANCE.getClientNode_Type();

        /**
         * The meta object literal for the '<em><b>Artifact Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLIENT_NODE__ARTIFACT_URL = eINSTANCE.getClientNode_ArtifactUrl();

        /**
         * The meta object literal for the '<em><b>Main Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLIENT_NODE__MAIN_CLASS = eINSTANCE.getClientNode_MainClass();

        /**
         * The meta object literal for the '{@link ddsm.impl.YarnResourceManagerImpl <em>Yarn Resource Manager</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.YarnResourceManagerImpl
         * @see ddsm.impl.DdsmPackageImpl#getYarnResourceManager()
         * @generated
         */
        EClass YARN_RESOURCE_MANAGER = eINSTANCE.getYarnResourceManager();

        /**
         * The meta object literal for the '{@link ddsm.impl.YarnNodeManagerImpl <em>Yarn Node Manager</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.YarnNodeManagerImpl
         * @see ddsm.impl.DdsmPackageImpl#getYarnNodeManager()
         * @generated
         */
        EClass YARN_NODE_MANAGER = eINSTANCE.getYarnNodeManager();

        /**
         * The meta object literal for the '{@link ddsm.impl.HDFSNameNodeImpl <em>HDFS Name Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.HDFSNameNodeImpl
         * @see ddsm.impl.DdsmPackageImpl#getHDFSNameNode()
         * @generated
         */
        EClass HDFS_NAME_NODE = eINSTANCE.getHDFSNameNode();

        /**
         * The meta object literal for the '{@link ddsm.impl.HDFSDataNodeImpl <em>HDFS Data Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.HDFSDataNodeImpl
         * @see ddsm.impl.DdsmPackageImpl#getHDFSDataNode()
         * @generated
         */
        EClass HDFS_DATA_NODE = eINSTANCE.getHDFSDataNode();

        /**
         * The meta object literal for the '{@link ddsm.impl.ScriptImpl <em>Script</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ScriptImpl
         * @see ddsm.impl.DdsmPackageImpl#getScript()
         * @generated
         */
        EClass SCRIPT = eINSTANCE.getScript();

        /**
         * The meta object literal for the '<em><b>Script Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT__SCRIPT_ID = eINSTANCE.getScript_ScriptId();

        /**
         * The meta object literal for the '<em><b>Script Uri</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT__SCRIPT_URI = eINSTANCE.getScript_ScriptUri();

        /**
         * The meta object literal for the '{@link ddsm.VMSize <em>VM Size</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.VMSize
         * @see ddsm.impl.DdsmPackageImpl#getVMSize()
         * @generated
         */
        EEnum VM_SIZE = eINSTANCE.getVMSize();

        /**
         * The meta object literal for the '{@link ddsm.ProviderType <em>Provider Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.ProviderType
         * @see ddsm.impl.DdsmPackageImpl#getProviderType()
         * @generated
         */
        EEnum PROVIDER_TYPE = eINSTANCE.getProviderType();

    }

} //DdsmPackage
