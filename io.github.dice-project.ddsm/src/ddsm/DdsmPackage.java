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
     * The feature id for the '<em><b>Download Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__DOWNLOAD_COMMAND = 1;

    /**
     * The feature id for the '<em><b>Create Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__CREATE_COMMAND = 2;

    /**
     * The feature id for the '<em><b>Configure Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__CONFIGURE_COMMAND = 3;

    /**
     * The feature id for the '<em><b>Install Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__INSTALL_COMMAND = 4;

    /**
     * The feature id for the '<em><b>Start Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__START_COMMAND = 5;

    /**
     * The feature id for the '<em><b>Stop Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__STOP_COMMAND = 6;

    /**
     * The number of structural features of the '<em>Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_FEATURE_COUNT = 7;

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
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM = COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Internal Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERNAL_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

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
     * The feature id for the '<em><b>End Point</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT__END_POINT = COMPONENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>External Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 7;

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
     * The feature id for the '<em><b>End Point</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__END_POINT = EXTERNAL_COMPONENT__END_POINT;

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
     * The feature id for the '<em><b>Generic Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__GENERIC_SIZE = EXTERNAL_COMPONENT_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Instances</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__INSTANCES = EXTERNAL_COMPONENT_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Public Ports</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM__PUBLIC_PORTS = EXTERNAL_COMPONENT_FEATURE_COUNT + 16;

    /**
     * The number of structural features of the '<em>VM</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VM_FEATURE_COUNT = EXTERNAL_COMPONENT_FEATURE_COUNT + 17;

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
     * The meta object id for the '{@link ddsm.impl.SlaveNodeImpl <em>Slave Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.SlaveNodeImpl
     * @see ddsm.impl.DdsmPackageImpl#getSlaveNode()
     * @generated
     */
    int SLAVE_NODE = 29;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SLAVE_NODE__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SLAVE_NODE__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SLAVE_NODE__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SLAVE_NODE__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SLAVE_NODE__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SLAVE_NODE__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SLAVE_NODE__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SLAVE_NODE__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Has Master</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SLAVE_NODE__HAS_MASTER = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Slave Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SLAVE_NODE_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Slave Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SLAVE_NODE_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.SupervisorImpl <em>Supervisor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.SupervisorImpl
     * @see ddsm.impl.DdsmPackageImpl#getSupervisor()
     * @generated
     */
    int SUPERVISOR = 17;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__RESOURCE = SLAVE_NODE__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__PROPERTY = SLAVE_NODE__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__ELEMENT_ID = SLAVE_NODE__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__DESCRIPTION = SLAVE_NODE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__PROVIDEDPORT = SLAVE_NODE__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__PROVIDEDEXECUTIONPLATFORM = SLAVE_NODE__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__REQUIREDPORT = SLAVE_NODE__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__REQUIREDEXECUTIONPLATFORM = SLAVE_NODE__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Has Master</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__HAS_MASTER = SLAVE_NODE__HAS_MASTER;

    /**
     * The feature id for the '<em><b>Worker Start Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__WORKER_START_TIMEOUT = SLAVE_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Cpu Capacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__CPU_CAPACITY = SLAVE_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Memory Capacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__MEMORY_CAPACITY = SLAVE_NODE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Heartbeat Frequency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__HEARTBEAT_FREQUENCY = SLAVE_NODE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Supervisor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR_FEATURE_COUNT = SLAVE_NODE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Supervisor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR_OPERATION_COUNT = SLAVE_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.MasterNodeImpl <em>Master Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.MasterNodeImpl
     * @see ddsm.impl.DdsmPackageImpl#getMasterNode()
     * @generated
     */
    int MASTER_NODE = 28;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_NODE__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_NODE__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_NODE__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_NODE__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_NODE__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_NODE__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_NODE__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_NODE__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The number of structural features of the '<em>Master Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_NODE_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Master Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_NODE_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.NimbusImpl <em>Nimbus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.NimbusImpl
     * @see ddsm.impl.DdsmPackageImpl#getNimbus()
     * @generated
     */
    int NIMBUS = 18;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS__RESOURCE = MASTER_NODE__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS__PROPERTY = MASTER_NODE__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS__ELEMENT_ID = MASTER_NODE__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS__DESCRIPTION = MASTER_NODE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS__PROVIDEDPORT = MASTER_NODE__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS__PROVIDEDEXECUTIONPLATFORM = MASTER_NODE__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS__REQUIREDPORT = MASTER_NODE__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS__REQUIREDEXECUTIONPLATFORM = MASTER_NODE__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Task Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS__TASK_TIMEOUT = MASTER_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Supervisor Frequency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS__SUPERVISOR_FREQUENCY = MASTER_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Queue Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS__QUEUE_SIZE = MASTER_NODE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Monitor Frequency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS__MONITOR_FREQUENCY = MASTER_NODE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Retry Times</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS__RETRY_TIMES = MASTER_NODE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Retry Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS__RETRY_INTERVAL = MASTER_NODE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Nimbus</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS_FEATURE_COUNT = MASTER_NODE_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Nimbus</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NIMBUS_OPERATION_COUNT = MASTER_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.PeerNodeImpl <em>Peer Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.PeerNodeImpl
     * @see ddsm.impl.DdsmPackageImpl#getPeerNode()
     * @generated
     */
    int PEER_NODE = 34;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_NODE__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_NODE__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_NODE__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_NODE__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_NODE__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_NODE__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_NODE__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_NODE__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Belongs To Quorum</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_NODE__BELONGS_TO_QUORUM = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Peer Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_NODE_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Peer Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_NODE_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ZookeeperServerImpl <em>Zookeeper Server</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ZookeeperServerImpl
     * @see ddsm.impl.DdsmPackageImpl#getZookeeperServer()
     * @generated
     */
    int ZOOKEEPER_SERVER = 19;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_SERVER__RESOURCE = PEER_NODE__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_SERVER__PROPERTY = PEER_NODE__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_SERVER__ELEMENT_ID = PEER_NODE__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_SERVER__DESCRIPTION = PEER_NODE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_SERVER__PROVIDEDPORT = PEER_NODE__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_SERVER__PROVIDEDEXECUTIONPLATFORM = PEER_NODE__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_SERVER__REQUIREDPORT = PEER_NODE__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_SERVER__REQUIREDEXECUTIONPLATFORM = PEER_NODE__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Belongs To Quorum</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_SERVER__BELONGS_TO_QUORUM = PEER_NODE__BELONGS_TO_QUORUM;

    /**
     * The feature id for the '<em><b>Tick Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_SERVER__TICK_TIME = PEER_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sync Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_SERVER__SYNC_LIMIT = PEER_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Init Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_SERVER__INIT_LIMIT = PEER_NODE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Zookeeper Server</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_SERVER_FEATURE_COUNT = PEER_NODE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Zookeeper Server</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_SERVER_OPERATION_COUNT = PEER_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ClientNodeImpl <em>Client Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ClientNodeImpl
     * @see ddsm.impl.DdsmPackageImpl#getClientNode()
     * @generated
     */
    int CLIENT_NODE = 20;

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
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Submits</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__SUBMITS = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Skip Running Job</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__SKIP_RUNNING_JOB = INTERNAL_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Number Of Submissions</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__NUMBER_OF_SUBMISSIONS = INTERNAL_COMPONENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Has Schedule</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE__HAS_SCHEDULE = INTERNAL_COMPONENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Client Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_NODE_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 4;

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
    int YARN_RESOURCE_MANAGER = 21;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__RESOURCE = MASTER_NODE__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__PROPERTY = MASTER_NODE__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__ELEMENT_ID = MASTER_NODE__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__DESCRIPTION = MASTER_NODE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__PROVIDEDPORT = MASTER_NODE__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__PROVIDEDEXECUTIONPLATFORM = MASTER_NODE__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__REQUIREDPORT = MASTER_NODE__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER__REQUIREDEXECUTIONPLATFORM = MASTER_NODE__REQUIREDEXECUTIONPLATFORM;

    /**
     * The number of structural features of the '<em>Yarn Resource Manager</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER_FEATURE_COUNT = MASTER_NODE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Yarn Resource Manager</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_RESOURCE_MANAGER_OPERATION_COUNT = MASTER_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.YarnNodeManagerImpl <em>Yarn Node Manager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.YarnNodeManagerImpl
     * @see ddsm.impl.DdsmPackageImpl#getYarnNodeManager()
     * @generated
     */
    int YARN_NODE_MANAGER = 22;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__RESOURCE = SLAVE_NODE__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__PROPERTY = SLAVE_NODE__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__ELEMENT_ID = SLAVE_NODE__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__DESCRIPTION = SLAVE_NODE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__PROVIDEDPORT = SLAVE_NODE__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__PROVIDEDEXECUTIONPLATFORM = SLAVE_NODE__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__REQUIREDPORT = SLAVE_NODE__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__REQUIREDEXECUTIONPLATFORM = SLAVE_NODE__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Has Master</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER__HAS_MASTER = SLAVE_NODE__HAS_MASTER;

    /**
     * The number of structural features of the '<em>Yarn Node Manager</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER_FEATURE_COUNT = SLAVE_NODE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Yarn Node Manager</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YARN_NODE_MANAGER_OPERATION_COUNT = SLAVE_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.HDFSNameNodeImpl <em>HDFS Name Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.HDFSNameNodeImpl
     * @see ddsm.impl.DdsmPackageImpl#getHDFSNameNode()
     * @generated
     */
    int HDFS_NAME_NODE = 23;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__RESOURCE = MASTER_NODE__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__PROPERTY = MASTER_NODE__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__ELEMENT_ID = MASTER_NODE__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__DESCRIPTION = MASTER_NODE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__PROVIDEDPORT = MASTER_NODE__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__PROVIDEDEXECUTIONPLATFORM = MASTER_NODE__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__REQUIREDPORT = MASTER_NODE__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE__REQUIREDEXECUTIONPLATFORM = MASTER_NODE__REQUIREDEXECUTIONPLATFORM;

    /**
     * The number of structural features of the '<em>HDFS Name Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE_FEATURE_COUNT = MASTER_NODE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>HDFS Name Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_NAME_NODE_OPERATION_COUNT = MASTER_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.HDFSDataNodeImpl <em>HDFS Data Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.HDFSDataNodeImpl
     * @see ddsm.impl.DdsmPackageImpl#getHDFSDataNode()
     * @generated
     */
    int HDFS_DATA_NODE = 24;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__RESOURCE = SLAVE_NODE__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__PROPERTY = SLAVE_NODE__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__ELEMENT_ID = SLAVE_NODE__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__DESCRIPTION = SLAVE_NODE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__PROVIDEDPORT = SLAVE_NODE__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__PROVIDEDEXECUTIONPLATFORM = SLAVE_NODE__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__REQUIREDPORT = SLAVE_NODE__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__REQUIREDEXECUTIONPLATFORM = SLAVE_NODE__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Has Master</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE__HAS_MASTER = SLAVE_NODE__HAS_MASTER;

    /**
     * The number of structural features of the '<em>HDFS Data Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE_FEATURE_COUNT = SLAVE_NODE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>HDFS Data Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_DATA_NODE_OPERATION_COUNT = SLAVE_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ChefResourceImpl <em>Chef Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ChefResourceImpl
     * @see ddsm.impl.DdsmPackageImpl#getChefResource()
     * @generated
     */
    int CHEF_RESOURCE = 25;

    /**
     * The feature id for the '<em><b>Resource Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RESOURCE__RESOURCE_ID = RESOURCE__RESOURCE_ID;

    /**
     * The feature id for the '<em><b>Download Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RESOURCE__DOWNLOAD_COMMAND = RESOURCE__DOWNLOAD_COMMAND;

    /**
     * The feature id for the '<em><b>Create Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RESOURCE__CREATE_COMMAND = RESOURCE__CREATE_COMMAND;

    /**
     * The feature id for the '<em><b>Configure Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RESOURCE__CONFIGURE_COMMAND = RESOURCE__CONFIGURE_COMMAND;

    /**
     * The feature id for the '<em><b>Install Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RESOURCE__INSTALL_COMMAND = RESOURCE__INSTALL_COMMAND;

    /**
     * The feature id for the '<em><b>Start Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RESOURCE__START_COMMAND = RESOURCE__START_COMMAND;

    /**
     * The feature id for the '<em><b>Stop Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RESOURCE__STOP_COMMAND = RESOURCE__STOP_COMMAND;

    /**
     * The feature id for the '<em><b>Cookbook Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RESOURCE__COOKBOOK_ID = RESOURCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Chef Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Chef Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHEF_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.MasterSlavePlatformImpl <em>Master Slave Platform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.MasterSlavePlatformImpl
     * @see ddsm.impl.DdsmPackageImpl#getMasterSlavePlatform()
     * @generated
     */
    int MASTER_SLAVE_PLATFORM = 37;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_SLAVE_PLATFORM__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_SLAVE_PLATFORM__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_SLAVE_PLATFORM__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_SLAVE_PLATFORM__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_SLAVE_PLATFORM__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_SLAVE_PLATFORM__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_SLAVE_PLATFORM__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_SLAVE_PLATFORM__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requires Master Vm</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_SLAVE_PLATFORM__REQUIRES_MASTER_VM = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Requires Slave Vm</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_SLAVE_PLATFORM__REQUIRES_SLAVE_VM = INTERNAL_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Master Slave Platform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_SLAVE_PLATFORM_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Master Slave Platform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_SLAVE_PLATFORM_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.StormClusterImpl <em>Storm Cluster</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.StormClusterImpl
     * @see ddsm.impl.DdsmPackageImpl#getStormCluster()
     * @generated
     */
    int STORM_CLUSTER = 26;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_CLUSTER__RESOURCE = MASTER_SLAVE_PLATFORM__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_CLUSTER__PROPERTY = MASTER_SLAVE_PLATFORM__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_CLUSTER__ELEMENT_ID = MASTER_SLAVE_PLATFORM__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_CLUSTER__DESCRIPTION = MASTER_SLAVE_PLATFORM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_CLUSTER__PROVIDEDPORT = MASTER_SLAVE_PLATFORM__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_CLUSTER__PROVIDEDEXECUTIONPLATFORM = MASTER_SLAVE_PLATFORM__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_CLUSTER__REQUIREDPORT = MASTER_SLAVE_PLATFORM__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_CLUSTER__REQUIREDEXECUTIONPLATFORM = MASTER_SLAVE_PLATFORM__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requires Master Vm</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_CLUSTER__REQUIRES_MASTER_VM = MASTER_SLAVE_PLATFORM__REQUIRES_MASTER_VM;

    /**
     * The feature id for the '<em><b>Requires Slave Vm</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_CLUSTER__REQUIRES_SLAVE_VM = MASTER_SLAVE_PLATFORM__REQUIRES_SLAVE_VM;

    /**
     * The number of structural features of the '<em>Storm Cluster</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_CLUSTER_FEATURE_COUNT = MASTER_SLAVE_PLATFORM_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Storm Cluster</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORM_CLUSTER_OPERATION_COUNT = MASTER_SLAVE_PLATFORM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.JobSubmissionImpl <em>Job Submission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.JobSubmissionImpl
     * @see ddsm.impl.DdsmPackageImpl#getJobSubmission()
     * @generated
     */
    int JOB_SUBMISSION = 27;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB_SUBMISSION__RESOURCE = CLOUD_ELEMENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB_SUBMISSION__PROPERTY = CLOUD_ELEMENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB_SUBMISSION__ELEMENT_ID = CLOUD_ELEMENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB_SUBMISSION__DESCRIPTION = CLOUD_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Artifact Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB_SUBMISSION__ARTIFACT_URL = CLOUD_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Main Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB_SUBMISSION__MAIN_CLASS = CLOUD_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Job Submission</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB_SUBMISSION_FEATURE_COUNT = CLOUD_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Job Submission</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB_SUBMISSION_OPERATION_COUNT = CLOUD_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.PeersQuorumImpl <em>Peers Quorum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.PeersQuorumImpl
     * @see ddsm.impl.DdsmPackageImpl#getPeersQuorum()
     * @generated
     */
    int PEERS_QUORUM = 35;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEERS_QUORUM__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEERS_QUORUM__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEERS_QUORUM__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEERS_QUORUM__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEERS_QUORUM__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEERS_QUORUM__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEERS_QUORUM__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEERS_QUORUM__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The number of structural features of the '<em>Peers Quorum</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEERS_QUORUM_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Peers Quorum</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEERS_QUORUM_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ZookeeperQuorumImpl <em>Zookeeper Quorum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ZookeeperQuorumImpl
     * @see ddsm.impl.DdsmPackageImpl#getZookeeperQuorum()
     * @generated
     */
    int ZOOKEEPER_QUORUM = 30;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_QUORUM__RESOURCE = PEERS_QUORUM__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_QUORUM__PROPERTY = PEERS_QUORUM__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_QUORUM__ELEMENT_ID = PEERS_QUORUM__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_QUORUM__DESCRIPTION = PEERS_QUORUM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_QUORUM__PROVIDEDPORT = PEERS_QUORUM__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_QUORUM__PROVIDEDEXECUTIONPLATFORM = PEERS_QUORUM__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_QUORUM__REQUIREDPORT = PEERS_QUORUM__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_QUORUM__REQUIREDEXECUTIONPLATFORM = PEERS_QUORUM__REQUIREDEXECUTIONPLATFORM;

    /**
     * The number of structural features of the '<em>Zookeeper Quorum</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_QUORUM_FEATURE_COUNT = PEERS_QUORUM_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Zookeeper Quorum</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_QUORUM_OPERATION_COUNT = PEERS_QUORUM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.CassandraWorkerImpl <em>Cassandra Worker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.CassandraWorkerImpl
     * @see ddsm.impl.DdsmPackageImpl#getCassandraWorker()
     * @generated
     */
    int CASSANDRA_WORKER = 31;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_WORKER__RESOURCE = PEER_NODE__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_WORKER__PROPERTY = PEER_NODE__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_WORKER__ELEMENT_ID = PEER_NODE__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_WORKER__DESCRIPTION = PEER_NODE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_WORKER__PROVIDEDPORT = PEER_NODE__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_WORKER__PROVIDEDEXECUTIONPLATFORM = PEER_NODE__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_WORKER__REQUIREDPORT = PEER_NODE__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_WORKER__REQUIREDEXECUTIONPLATFORM = PEER_NODE__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Belongs To Quorum</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_WORKER__BELONGS_TO_QUORUM = PEER_NODE__BELONGS_TO_QUORUM;

    /**
     * The number of structural features of the '<em>Cassandra Worker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_WORKER_FEATURE_COUNT = PEER_NODE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Cassandra Worker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_WORKER_OPERATION_COUNT = PEER_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.PeerToPeerPlatformImpl <em>Peer To Peer Platform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.PeerToPeerPlatformImpl
     * @see ddsm.impl.DdsmPackageImpl#getPeerToPeerPlatform()
     * @generated
     */
    int PEER_TO_PEER_PLATFORM = 36;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_TO_PEER_PLATFORM__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_TO_PEER_PLATFORM__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_TO_PEER_PLATFORM__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_TO_PEER_PLATFORM__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_TO_PEER_PLATFORM__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_TO_PEER_PLATFORM__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_TO_PEER_PLATFORM__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_TO_PEER_PLATFORM__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requires Peer Vm</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_TO_PEER_PLATFORM__REQUIRES_PEER_VM = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Peer To Peer Platform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_TO_PEER_PLATFORM_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Peer To Peer Platform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEER_TO_PEER_PLATFORM_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.ZookeeperClusterImpl <em>Zookeeper Cluster</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.ZookeeperClusterImpl
     * @see ddsm.impl.DdsmPackageImpl#getZookeeperCluster()
     * @generated
     */
    int ZOOKEEPER_CLUSTER = 32;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_CLUSTER__RESOURCE = PEER_TO_PEER_PLATFORM__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_CLUSTER__PROPERTY = PEER_TO_PEER_PLATFORM__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_CLUSTER__ELEMENT_ID = PEER_TO_PEER_PLATFORM__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_CLUSTER__DESCRIPTION = PEER_TO_PEER_PLATFORM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_CLUSTER__PROVIDEDPORT = PEER_TO_PEER_PLATFORM__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_CLUSTER__PROVIDEDEXECUTIONPLATFORM = PEER_TO_PEER_PLATFORM__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_CLUSTER__REQUIREDPORT = PEER_TO_PEER_PLATFORM__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_CLUSTER__REQUIREDEXECUTIONPLATFORM = PEER_TO_PEER_PLATFORM__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requires Peer Vm</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_CLUSTER__REQUIRES_PEER_VM = PEER_TO_PEER_PLATFORM__REQUIRES_PEER_VM;

    /**
     * The number of structural features of the '<em>Zookeeper Cluster</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_CLUSTER_FEATURE_COUNT = PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Zookeeper Cluster</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZOOKEEPER_CLUSTER_OPERATION_COUNT = PEER_TO_PEER_PLATFORM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.CassandraClusterImpl <em>Cassandra Cluster</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.CassandraClusterImpl
     * @see ddsm.impl.DdsmPackageImpl#getCassandraCluster()
     * @generated
     */
    int CASSANDRA_CLUSTER = 33;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_CLUSTER__RESOURCE = PEER_TO_PEER_PLATFORM__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_CLUSTER__PROPERTY = PEER_TO_PEER_PLATFORM__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_CLUSTER__ELEMENT_ID = PEER_TO_PEER_PLATFORM__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_CLUSTER__DESCRIPTION = PEER_TO_PEER_PLATFORM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_CLUSTER__PROVIDEDPORT = PEER_TO_PEER_PLATFORM__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_CLUSTER__PROVIDEDEXECUTIONPLATFORM = PEER_TO_PEER_PLATFORM__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_CLUSTER__REQUIREDPORT = PEER_TO_PEER_PLATFORM__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_CLUSTER__REQUIREDEXECUTIONPLATFORM = PEER_TO_PEER_PLATFORM__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requires Peer Vm</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_CLUSTER__REQUIRES_PEER_VM = PEER_TO_PEER_PLATFORM__REQUIRES_PEER_VM;

    /**
     * The number of structural features of the '<em>Cassandra Cluster</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_CLUSTER_FEATURE_COUNT = PEER_TO_PEER_PLATFORM_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Cassandra Cluster</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_CLUSTER_OPERATION_COUNT = PEER_TO_PEER_PLATFORM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.CassandraQuorumImpl <em>Cassandra Quorum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.CassandraQuorumImpl
     * @see ddsm.impl.DdsmPackageImpl#getCassandraQuorum()
     * @generated
     */
    int CASSANDRA_QUORUM = 38;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_QUORUM__RESOURCE = PEERS_QUORUM__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_QUORUM__PROPERTY = PEERS_QUORUM__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_QUORUM__ELEMENT_ID = PEERS_QUORUM__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_QUORUM__DESCRIPTION = PEERS_QUORUM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_QUORUM__PROVIDEDPORT = PEERS_QUORUM__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_QUORUM__PROVIDEDEXECUTIONPLATFORM = PEERS_QUORUM__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_QUORUM__REQUIREDPORT = PEERS_QUORUM__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_QUORUM__REQUIREDEXECUTIONPLATFORM = PEERS_QUORUM__REQUIREDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requires bootstrapping seed</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_QUORUM__REQUIRES_BOOTSTRAPPING_SEED = PEERS_QUORUM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Cassandra Quorum</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_QUORUM_FEATURE_COUNT = PEERS_QUORUM_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Cassandra Quorum</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_QUORUM_OPERATION_COUNT = PEERS_QUORUM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.CassandraSeedImpl <em>Cassandra Seed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.CassandraSeedImpl
     * @see ddsm.impl.DdsmPackageImpl#getCassandraSeed()
     * @generated
     */
    int CASSANDRA_SEED = 39;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_SEED__RESOURCE = INTERNAL_COMPONENT__RESOURCE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_SEED__PROPERTY = INTERNAL_COMPONENT__PROPERTY;

    /**
     * The feature id for the '<em><b>Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_SEED__ELEMENT_ID = INTERNAL_COMPONENT__ELEMENT_ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_SEED__DESCRIPTION = INTERNAL_COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_SEED__PROVIDEDPORT = INTERNAL_COMPONENT__PROVIDEDPORT;

    /**
     * The feature id for the '<em><b>Providedexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_SEED__PROVIDEDEXECUTIONPLATFORM = INTERNAL_COMPONENT__PROVIDEDEXECUTIONPLATFORM;

    /**
     * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_SEED__REQUIREDPORT = INTERNAL_COMPONENT__REQUIREDPORT;

    /**
     * The feature id for the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_SEED__REQUIREDEXECUTIONPLATFORM = INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM;

    /**
     * The number of structural features of the '<em>Cassandra Seed</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_SEED_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Cassandra Seed</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSANDRA_SEED_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link ddsm.impl.CrontabImpl <em>Crontab</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.impl.CrontabImpl
     * @see ddsm.impl.DdsmPackageImpl#getCrontab()
     * @generated
     */
    int CRONTAB = 40;

    /**
     * The feature id for the '<em><b>Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRONTAB__MIN = 0;

    /**
     * The feature id for the '<em><b>Hour</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRONTAB__HOUR = 1;

    /**
     * The feature id for the '<em><b>Day Of Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRONTAB__DAY_OF_MONTH = 2;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRONTAB__MONTH = 3;

    /**
     * The feature id for the '<em><b>Day Of Week</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRONTAB__DAY_OF_WEEK = 4;

    /**
     * The number of structural features of the '<em>Crontab</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRONTAB_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Crontab</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRONTAB_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ddsm.VMSize <em>VM Size</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.VMSize
     * @see ddsm.impl.DdsmPackageImpl#getVMSize()
     * @generated
     */
    int VM_SIZE = 41;

    /**
     * The meta object id for the '{@link ddsm.ProviderType <em>Provider Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ddsm.ProviderType
     * @see ddsm.impl.DdsmPackageImpl#getProviderType()
     * @generated
     */
    int PROVIDER_TYPE = 42;


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
     * Returns the meta object for the attribute '{@link ddsm.Resource#getDownloadCommand <em>Download Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Download Command</em>'.
     * @see ddsm.Resource#getDownloadCommand()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_DownloadCommand();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Resource#getCreateCommand <em>Create Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Create Command</em>'.
     * @see ddsm.Resource#getCreateCommand()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_CreateCommand();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Resource#getConfigureCommand <em>Configure Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Configure Command</em>'.
     * @see ddsm.Resource#getConfigureCommand()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_ConfigureCommand();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Resource#getInstallCommand <em>Install Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Install Command</em>'.
     * @see ddsm.Resource#getInstallCommand()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_InstallCommand();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Resource#getStartCommand <em>Start Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start Command</em>'.
     * @see ddsm.Resource#getStartCommand()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_StartCommand();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Resource#getStopCommand <em>Stop Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stop Command</em>'.
     * @see ddsm.Resource#getStopCommand()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_StopCommand();

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
     * Returns the meta object for the attribute '{@link ddsm.ExternalComponent#getEndPoint <em>End Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>End Point</em>'.
     * @see ddsm.ExternalComponent#getEndPoint()
     * @see #getExternalComponent()
     * @generated
     */
    EAttribute getExternalComponent_EndPoint();

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
     * Returns the meta object for the attribute list '{@link ddsm.VM#getPublicPorts <em>Public Ports</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Public Ports</em>'.
     * @see ddsm.VM#getPublicPorts()
     * @see #getVM()
     * @generated
     */
    EAttribute getVM_PublicPorts();

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
     * Returns the meta object for class '{@link ddsm.Supervisor <em>Supervisor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Supervisor</em>'.
     * @see ddsm.Supervisor
     * @generated
     */
    EClass getSupervisor();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Supervisor#getWorkerStartTimeout <em>Worker Start Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Worker Start Timeout</em>'.
     * @see ddsm.Supervisor#getWorkerStartTimeout()
     * @see #getSupervisor()
     * @generated
     */
    EAttribute getSupervisor_WorkerStartTimeout();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Supervisor#getCpuCapacity <em>Cpu Capacity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cpu Capacity</em>'.
     * @see ddsm.Supervisor#getCpuCapacity()
     * @see #getSupervisor()
     * @generated
     */
    EAttribute getSupervisor_CpuCapacity();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Supervisor#getMemoryCapacity <em>Memory Capacity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Memory Capacity</em>'.
     * @see ddsm.Supervisor#getMemoryCapacity()
     * @see #getSupervisor()
     * @generated
     */
    EAttribute getSupervisor_MemoryCapacity();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Supervisor#getHeartbeatFrequency <em>Heartbeat Frequency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Heartbeat Frequency</em>'.
     * @see ddsm.Supervisor#getHeartbeatFrequency()
     * @see #getSupervisor()
     * @generated
     */
    EAttribute getSupervisor_HeartbeatFrequency();

    /**
     * Returns the meta object for class '{@link ddsm.Nimbus <em>Nimbus</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Nimbus</em>'.
     * @see ddsm.Nimbus
     * @generated
     */
    EClass getNimbus();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Nimbus#getTaskTimeout <em>Task Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Task Timeout</em>'.
     * @see ddsm.Nimbus#getTaskTimeout()
     * @see #getNimbus()
     * @generated
     */
    EAttribute getNimbus_TaskTimeout();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Nimbus#getSupervisorFrequency <em>Supervisor Frequency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Supervisor Frequency</em>'.
     * @see ddsm.Nimbus#getSupervisorFrequency()
     * @see #getNimbus()
     * @generated
     */
    EAttribute getNimbus_SupervisorFrequency();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Nimbus#getQueueSize <em>Queue Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Queue Size</em>'.
     * @see ddsm.Nimbus#getQueueSize()
     * @see #getNimbus()
     * @generated
     */
    EAttribute getNimbus_QueueSize();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Nimbus#getMonitorFrequency <em>Monitor Frequency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Monitor Frequency</em>'.
     * @see ddsm.Nimbus#getMonitorFrequency()
     * @see #getNimbus()
     * @generated
     */
    EAttribute getNimbus_MonitorFrequency();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Nimbus#getRetryTimes <em>Retry Times</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Retry Times</em>'.
     * @see ddsm.Nimbus#getRetryTimes()
     * @see #getNimbus()
     * @generated
     */
    EAttribute getNimbus_RetryTimes();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Nimbus#getRetryInterval <em>Retry Interval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Retry Interval</em>'.
     * @see ddsm.Nimbus#getRetryInterval()
     * @see #getNimbus()
     * @generated
     */
    EAttribute getNimbus_RetryInterval();

    /**
     * Returns the meta object for class '{@link ddsm.ZookeeperServer <em>Zookeeper Server</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Zookeeper Server</em>'.
     * @see ddsm.ZookeeperServer
     * @generated
     */
    EClass getZookeeperServer();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ZookeeperServer#getTickTime <em>Tick Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tick Time</em>'.
     * @see ddsm.ZookeeperServer#getTickTime()
     * @see #getZookeeperServer()
     * @generated
     */
    EAttribute getZookeeperServer_TickTime();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ZookeeperServer#getSyncLimit <em>Sync Limit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sync Limit</em>'.
     * @see ddsm.ZookeeperServer#getSyncLimit()
     * @see #getZookeeperServer()
     * @generated
     */
    EAttribute getZookeeperServer_SyncLimit();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ZookeeperServer#getInitLimit <em>Init Limit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Init Limit</em>'.
     * @see ddsm.ZookeeperServer#getInitLimit()
     * @see #getZookeeperServer()
     * @generated
     */
    EAttribute getZookeeperServer_InitLimit();

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
     * Returns the meta object for the reference '{@link ddsm.ClientNode#getSubmits <em>Submits</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Submits</em>'.
     * @see ddsm.ClientNode#getSubmits()
     * @see #getClientNode()
     * @generated
     */
    EReference getClientNode_Submits();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ClientNode#isSkipRunningJob <em>Skip Running Job</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Skip Running Job</em>'.
     * @see ddsm.ClientNode#isSkipRunningJob()
     * @see #getClientNode()
     * @generated
     */
    EAttribute getClientNode_SkipRunningJob();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ClientNode#getNumberOfSubmissions <em>Number Of Submissions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number Of Submissions</em>'.
     * @see ddsm.ClientNode#getNumberOfSubmissions()
     * @see #getClientNode()
     * @generated
     */
    EAttribute getClientNode_NumberOfSubmissions();

    /**
     * Returns the meta object for the reference '{@link ddsm.ClientNode#getHasSchedule <em>Has Schedule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Has Schedule</em>'.
     * @see ddsm.ClientNode#getHasSchedule()
     * @see #getClientNode()
     * @generated
     */
    EReference getClientNode_HasSchedule();

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
     * Returns the meta object for class '{@link ddsm.ChefResource <em>Chef Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Chef Resource</em>'.
     * @see ddsm.ChefResource
     * @generated
     */
    EClass getChefResource();

    /**
     * Returns the meta object for the attribute '{@link ddsm.ChefResource#getCookbookId <em>Cookbook Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cookbook Id</em>'.
     * @see ddsm.ChefResource#getCookbookId()
     * @see #getChefResource()
     * @generated
     */
    EAttribute getChefResource_CookbookId();

    /**
     * Returns the meta object for class '{@link ddsm.StormCluster <em>Storm Cluster</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Storm Cluster</em>'.
     * @see ddsm.StormCluster
     * @generated
     */
    EClass getStormCluster();

    /**
     * Returns the meta object for class '{@link ddsm.JobSubmission <em>Job Submission</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Job Submission</em>'.
     * @see ddsm.JobSubmission
     * @generated
     */
    EClass getJobSubmission();

    /**
     * Returns the meta object for the attribute '{@link ddsm.JobSubmission#getArtifactUrl <em>Artifact Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Artifact Url</em>'.
     * @see ddsm.JobSubmission#getArtifactUrl()
     * @see #getJobSubmission()
     * @generated
     */
    EAttribute getJobSubmission_ArtifactUrl();

    /**
     * Returns the meta object for the attribute '{@link ddsm.JobSubmission#getMainClass <em>Main Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Main Class</em>'.
     * @see ddsm.JobSubmission#getMainClass()
     * @see #getJobSubmission()
     * @generated
     */
    EAttribute getJobSubmission_MainClass();

    /**
     * Returns the meta object for class '{@link ddsm.MasterNode <em>Master Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Master Node</em>'.
     * @see ddsm.MasterNode
     * @generated
     */
    EClass getMasterNode();

    /**
     * Returns the meta object for class '{@link ddsm.SlaveNode <em>Slave Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Slave Node</em>'.
     * @see ddsm.SlaveNode
     * @generated
     */
    EClass getSlaveNode();

    /**
     * Returns the meta object for the reference '{@link ddsm.SlaveNode#getHasMaster <em>Has Master</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Has Master</em>'.
     * @see ddsm.SlaveNode#getHasMaster()
     * @see #getSlaveNode()
     * @generated
     */
    EReference getSlaveNode_HasMaster();

    /**
     * Returns the meta object for class '{@link ddsm.ZookeeperQuorum <em>Zookeeper Quorum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Zookeeper Quorum</em>'.
     * @see ddsm.ZookeeperQuorum
     * @generated
     */
    EClass getZookeeperQuorum();

    /**
     * Returns the meta object for class '{@link ddsm.CassandraWorker <em>Cassandra Worker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cassandra Worker</em>'.
     * @see ddsm.CassandraWorker
     * @generated
     */
    EClass getCassandraWorker();

    /**
     * Returns the meta object for class '{@link ddsm.ZookeeperCluster <em>Zookeeper Cluster</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Zookeeper Cluster</em>'.
     * @see ddsm.ZookeeperCluster
     * @generated
     */
    EClass getZookeeperCluster();

    /**
     * Returns the meta object for class '{@link ddsm.CassandraCluster <em>Cassandra Cluster</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cassandra Cluster</em>'.
     * @see ddsm.CassandraCluster
     * @generated
     */
    EClass getCassandraCluster();

    /**
     * Returns the meta object for class '{@link ddsm.PeerNode <em>Peer Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Peer Node</em>'.
     * @see ddsm.PeerNode
     * @generated
     */
    EClass getPeerNode();

    /**
     * Returns the meta object for the reference '{@link ddsm.PeerNode#getBelongsToQuorum <em>Belongs To Quorum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Belongs To Quorum</em>'.
     * @see ddsm.PeerNode#getBelongsToQuorum()
     * @see #getPeerNode()
     * @generated
     */
    EReference getPeerNode_BelongsToQuorum();

    /**
     * Returns the meta object for class '{@link ddsm.PeersQuorum <em>Peers Quorum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Peers Quorum</em>'.
     * @see ddsm.PeersQuorum
     * @generated
     */
    EClass getPeersQuorum();

    /**
     * Returns the meta object for class '{@link ddsm.PeerToPeerPlatform <em>Peer To Peer Platform</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Peer To Peer Platform</em>'.
     * @see ddsm.PeerToPeerPlatform
     * @generated
     */
    EClass getPeerToPeerPlatform();

    /**
     * Returns the meta object for the reference list '{@link ddsm.PeerToPeerPlatform#getRequiresPeerVm <em>Requires Peer Vm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Requires Peer Vm</em>'.
     * @see ddsm.PeerToPeerPlatform#getRequiresPeerVm()
     * @see #getPeerToPeerPlatform()
     * @generated
     */
    EReference getPeerToPeerPlatform_RequiresPeerVm();

    /**
     * Returns the meta object for class '{@link ddsm.MasterSlavePlatform <em>Master Slave Platform</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Master Slave Platform</em>'.
     * @see ddsm.MasterSlavePlatform
     * @generated
     */
    EClass getMasterSlavePlatform();

    /**
     * Returns the meta object for the reference '{@link ddsm.MasterSlavePlatform#getRequiresMasterVm <em>Requires Master Vm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Requires Master Vm</em>'.
     * @see ddsm.MasterSlavePlatform#getRequiresMasterVm()
     * @see #getMasterSlavePlatform()
     * @generated
     */
    EReference getMasterSlavePlatform_RequiresMasterVm();

    /**
     * Returns the meta object for the reference list '{@link ddsm.MasterSlavePlatform#getRequiresSlaveVm <em>Requires Slave Vm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Requires Slave Vm</em>'.
     * @see ddsm.MasterSlavePlatform#getRequiresSlaveVm()
     * @see #getMasterSlavePlatform()
     * @generated
     */
    EReference getMasterSlavePlatform_RequiresSlaveVm();

    /**
     * Returns the meta object for class '{@link ddsm.CassandraQuorum <em>Cassandra Quorum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cassandra Quorum</em>'.
     * @see ddsm.CassandraQuorum
     * @generated
     */
    EClass getCassandraQuorum();

    /**
     * Returns the meta object for the reference '{@link ddsm.CassandraQuorum#getRequires_bootstrapping_seed <em>Requires bootstrapping seed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Requires bootstrapping seed</em>'.
     * @see ddsm.CassandraQuorum#getRequires_bootstrapping_seed()
     * @see #getCassandraQuorum()
     * @generated
     */
    EReference getCassandraQuorum_Requires_bootstrapping_seed();

    /**
     * Returns the meta object for class '{@link ddsm.CassandraSeed <em>Cassandra Seed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cassandra Seed</em>'.
     * @see ddsm.CassandraSeed
     * @generated
     */
    EClass getCassandraSeed();

    /**
     * Returns the meta object for class '{@link ddsm.Crontab <em>Crontab</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Crontab</em>'.
     * @see ddsm.Crontab
     * @generated
     */
    EClass getCrontab();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Crontab#getMin <em>Min</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min</em>'.
     * @see ddsm.Crontab#getMin()
     * @see #getCrontab()
     * @generated
     */
    EAttribute getCrontab_Min();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Crontab#getHour <em>Hour</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hour</em>'.
     * @see ddsm.Crontab#getHour()
     * @see #getCrontab()
     * @generated
     */
    EAttribute getCrontab_Hour();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Crontab#getDayOfMonth <em>Day Of Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Day Of Month</em>'.
     * @see ddsm.Crontab#getDayOfMonth()
     * @see #getCrontab()
     * @generated
     */
    EAttribute getCrontab_DayOfMonth();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Crontab#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see ddsm.Crontab#getMonth()
     * @see #getCrontab()
     * @generated
     */
    EAttribute getCrontab_Month();

    /**
     * Returns the meta object for the attribute '{@link ddsm.Crontab#getDayOfWeek <em>Day Of Week</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Day Of Week</em>'.
     * @see ddsm.Crontab#getDayOfWeek()
     * @see #getCrontab()
     * @generated
     */
    EAttribute getCrontab_DayOfWeek();

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
         * The meta object literal for the '<em><b>Property Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__PROPERTY_ID = eINSTANCE.getProperty_PropertyId();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

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
         * The meta object literal for the '<em><b>Download Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__DOWNLOAD_COMMAND = eINSTANCE.getResource_DownloadCommand();

        /**
         * The meta object literal for the '<em><b>Create Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__CREATE_COMMAND = eINSTANCE.getResource_CreateCommand();

        /**
         * The meta object literal for the '<em><b>Configure Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__CONFIGURE_COMMAND = eINSTANCE.getResource_ConfigureCommand();

        /**
         * The meta object literal for the '<em><b>Install Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__INSTALL_COMMAND = eINSTANCE.getResource_InstallCommand();

        /**
         * The meta object literal for the '<em><b>Start Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__START_COMMAND = eINSTANCE.getResource_StartCommand();

        /**
         * The meta object literal for the '<em><b>Stop Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__STOP_COMMAND = eINSTANCE.getResource_StopCommand();

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
         * The meta object literal for the '<em><b>End Point</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTERNAL_COMPONENT__END_POINT = eINSTANCE.getExternalComponent_EndPoint();

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
         * The meta object literal for the '<em><b>Generic Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__GENERIC_SIZE = eINSTANCE.getVM_GenericSize();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__INSTANCES = eINSTANCE.getVM_Instances();

        /**
         * The meta object literal for the '<em><b>Public Ports</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VM__PUBLIC_PORTS = eINSTANCE.getVM_PublicPorts();

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
         * The meta object literal for the '{@link ddsm.impl.SupervisorImpl <em>Supervisor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.SupervisorImpl
         * @see ddsm.impl.DdsmPackageImpl#getSupervisor()
         * @generated
         */
        EClass SUPERVISOR = eINSTANCE.getSupervisor();

        /**
         * The meta object literal for the '<em><b>Worker Start Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUPERVISOR__WORKER_START_TIMEOUT = eINSTANCE.getSupervisor_WorkerStartTimeout();

        /**
         * The meta object literal for the '<em><b>Cpu Capacity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUPERVISOR__CPU_CAPACITY = eINSTANCE.getSupervisor_CpuCapacity();

        /**
         * The meta object literal for the '<em><b>Memory Capacity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUPERVISOR__MEMORY_CAPACITY = eINSTANCE.getSupervisor_MemoryCapacity();

        /**
         * The meta object literal for the '<em><b>Heartbeat Frequency</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUPERVISOR__HEARTBEAT_FREQUENCY = eINSTANCE.getSupervisor_HeartbeatFrequency();

        /**
         * The meta object literal for the '{@link ddsm.impl.NimbusImpl <em>Nimbus</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.NimbusImpl
         * @see ddsm.impl.DdsmPackageImpl#getNimbus()
         * @generated
         */
        EClass NIMBUS = eINSTANCE.getNimbus();

        /**
         * The meta object literal for the '<em><b>Task Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NIMBUS__TASK_TIMEOUT = eINSTANCE.getNimbus_TaskTimeout();

        /**
         * The meta object literal for the '<em><b>Supervisor Frequency</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NIMBUS__SUPERVISOR_FREQUENCY = eINSTANCE.getNimbus_SupervisorFrequency();

        /**
         * The meta object literal for the '<em><b>Queue Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NIMBUS__QUEUE_SIZE = eINSTANCE.getNimbus_QueueSize();

        /**
         * The meta object literal for the '<em><b>Monitor Frequency</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NIMBUS__MONITOR_FREQUENCY = eINSTANCE.getNimbus_MonitorFrequency();

        /**
         * The meta object literal for the '<em><b>Retry Times</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NIMBUS__RETRY_TIMES = eINSTANCE.getNimbus_RetryTimes();

        /**
         * The meta object literal for the '<em><b>Retry Interval</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NIMBUS__RETRY_INTERVAL = eINSTANCE.getNimbus_RetryInterval();

        /**
         * The meta object literal for the '{@link ddsm.impl.ZookeeperServerImpl <em>Zookeeper Server</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ZookeeperServerImpl
         * @see ddsm.impl.DdsmPackageImpl#getZookeeperServer()
         * @generated
         */
        EClass ZOOKEEPER_SERVER = eINSTANCE.getZookeeperServer();

        /**
         * The meta object literal for the '<em><b>Tick Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ZOOKEEPER_SERVER__TICK_TIME = eINSTANCE.getZookeeperServer_TickTime();

        /**
         * The meta object literal for the '<em><b>Sync Limit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ZOOKEEPER_SERVER__SYNC_LIMIT = eINSTANCE.getZookeeperServer_SyncLimit();

        /**
         * The meta object literal for the '<em><b>Init Limit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ZOOKEEPER_SERVER__INIT_LIMIT = eINSTANCE.getZookeeperServer_InitLimit();

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
         * The meta object literal for the '<em><b>Submits</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLIENT_NODE__SUBMITS = eINSTANCE.getClientNode_Submits();

        /**
         * The meta object literal for the '<em><b>Skip Running Job</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLIENT_NODE__SKIP_RUNNING_JOB = eINSTANCE.getClientNode_SkipRunningJob();

        /**
         * The meta object literal for the '<em><b>Number Of Submissions</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLIENT_NODE__NUMBER_OF_SUBMISSIONS = eINSTANCE.getClientNode_NumberOfSubmissions();

        /**
         * The meta object literal for the '<em><b>Has Schedule</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLIENT_NODE__HAS_SCHEDULE = eINSTANCE.getClientNode_HasSchedule();

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
         * The meta object literal for the '{@link ddsm.impl.ChefResourceImpl <em>Chef Resource</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ChefResourceImpl
         * @see ddsm.impl.DdsmPackageImpl#getChefResource()
         * @generated
         */
        EClass CHEF_RESOURCE = eINSTANCE.getChefResource();

        /**
         * The meta object literal for the '<em><b>Cookbook Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHEF_RESOURCE__COOKBOOK_ID = eINSTANCE.getChefResource_CookbookId();

        /**
         * The meta object literal for the '{@link ddsm.impl.StormClusterImpl <em>Storm Cluster</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.StormClusterImpl
         * @see ddsm.impl.DdsmPackageImpl#getStormCluster()
         * @generated
         */
        EClass STORM_CLUSTER = eINSTANCE.getStormCluster();

        /**
         * The meta object literal for the '{@link ddsm.impl.JobSubmissionImpl <em>Job Submission</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.JobSubmissionImpl
         * @see ddsm.impl.DdsmPackageImpl#getJobSubmission()
         * @generated
         */
        EClass JOB_SUBMISSION = eINSTANCE.getJobSubmission();

        /**
         * The meta object literal for the '<em><b>Artifact Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JOB_SUBMISSION__ARTIFACT_URL = eINSTANCE.getJobSubmission_ArtifactUrl();

        /**
         * The meta object literal for the '<em><b>Main Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JOB_SUBMISSION__MAIN_CLASS = eINSTANCE.getJobSubmission_MainClass();

        /**
         * The meta object literal for the '{@link ddsm.impl.MasterNodeImpl <em>Master Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.MasterNodeImpl
         * @see ddsm.impl.DdsmPackageImpl#getMasterNode()
         * @generated
         */
        EClass MASTER_NODE = eINSTANCE.getMasterNode();

        /**
         * The meta object literal for the '{@link ddsm.impl.SlaveNodeImpl <em>Slave Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.SlaveNodeImpl
         * @see ddsm.impl.DdsmPackageImpl#getSlaveNode()
         * @generated
         */
        EClass SLAVE_NODE = eINSTANCE.getSlaveNode();

        /**
         * The meta object literal for the '<em><b>Has Master</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SLAVE_NODE__HAS_MASTER = eINSTANCE.getSlaveNode_HasMaster();

        /**
         * The meta object literal for the '{@link ddsm.impl.ZookeeperQuorumImpl <em>Zookeeper Quorum</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ZookeeperQuorumImpl
         * @see ddsm.impl.DdsmPackageImpl#getZookeeperQuorum()
         * @generated
         */
        EClass ZOOKEEPER_QUORUM = eINSTANCE.getZookeeperQuorum();

        /**
         * The meta object literal for the '{@link ddsm.impl.CassandraWorkerImpl <em>Cassandra Worker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.CassandraWorkerImpl
         * @see ddsm.impl.DdsmPackageImpl#getCassandraWorker()
         * @generated
         */
        EClass CASSANDRA_WORKER = eINSTANCE.getCassandraWorker();

        /**
         * The meta object literal for the '{@link ddsm.impl.ZookeeperClusterImpl <em>Zookeeper Cluster</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.ZookeeperClusterImpl
         * @see ddsm.impl.DdsmPackageImpl#getZookeeperCluster()
         * @generated
         */
        EClass ZOOKEEPER_CLUSTER = eINSTANCE.getZookeeperCluster();

        /**
         * The meta object literal for the '{@link ddsm.impl.CassandraClusterImpl <em>Cassandra Cluster</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.CassandraClusterImpl
         * @see ddsm.impl.DdsmPackageImpl#getCassandraCluster()
         * @generated
         */
        EClass CASSANDRA_CLUSTER = eINSTANCE.getCassandraCluster();

        /**
         * The meta object literal for the '{@link ddsm.impl.PeerNodeImpl <em>Peer Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.PeerNodeImpl
         * @see ddsm.impl.DdsmPackageImpl#getPeerNode()
         * @generated
         */
        EClass PEER_NODE = eINSTANCE.getPeerNode();

        /**
         * The meta object literal for the '<em><b>Belongs To Quorum</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PEER_NODE__BELONGS_TO_QUORUM = eINSTANCE.getPeerNode_BelongsToQuorum();

        /**
         * The meta object literal for the '{@link ddsm.impl.PeersQuorumImpl <em>Peers Quorum</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.PeersQuorumImpl
         * @see ddsm.impl.DdsmPackageImpl#getPeersQuorum()
         * @generated
         */
        EClass PEERS_QUORUM = eINSTANCE.getPeersQuorum();

        /**
         * The meta object literal for the '{@link ddsm.impl.PeerToPeerPlatformImpl <em>Peer To Peer Platform</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.PeerToPeerPlatformImpl
         * @see ddsm.impl.DdsmPackageImpl#getPeerToPeerPlatform()
         * @generated
         */
        EClass PEER_TO_PEER_PLATFORM = eINSTANCE.getPeerToPeerPlatform();

        /**
         * The meta object literal for the '<em><b>Requires Peer Vm</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PEER_TO_PEER_PLATFORM__REQUIRES_PEER_VM = eINSTANCE.getPeerToPeerPlatform_RequiresPeerVm();

        /**
         * The meta object literal for the '{@link ddsm.impl.MasterSlavePlatformImpl <em>Master Slave Platform</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.MasterSlavePlatformImpl
         * @see ddsm.impl.DdsmPackageImpl#getMasterSlavePlatform()
         * @generated
         */
        EClass MASTER_SLAVE_PLATFORM = eINSTANCE.getMasterSlavePlatform();

        /**
         * The meta object literal for the '<em><b>Requires Master Vm</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MASTER_SLAVE_PLATFORM__REQUIRES_MASTER_VM = eINSTANCE.getMasterSlavePlatform_RequiresMasterVm();

        /**
         * The meta object literal for the '<em><b>Requires Slave Vm</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MASTER_SLAVE_PLATFORM__REQUIRES_SLAVE_VM = eINSTANCE.getMasterSlavePlatform_RequiresSlaveVm();

        /**
         * The meta object literal for the '{@link ddsm.impl.CassandraQuorumImpl <em>Cassandra Quorum</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.CassandraQuorumImpl
         * @see ddsm.impl.DdsmPackageImpl#getCassandraQuorum()
         * @generated
         */
        EClass CASSANDRA_QUORUM = eINSTANCE.getCassandraQuorum();

        /**
         * The meta object literal for the '<em><b>Requires bootstrapping seed</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CASSANDRA_QUORUM__REQUIRES_BOOTSTRAPPING_SEED = eINSTANCE.getCassandraQuorum_Requires_bootstrapping_seed();

        /**
         * The meta object literal for the '{@link ddsm.impl.CassandraSeedImpl <em>Cassandra Seed</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.CassandraSeedImpl
         * @see ddsm.impl.DdsmPackageImpl#getCassandraSeed()
         * @generated
         */
        EClass CASSANDRA_SEED = eINSTANCE.getCassandraSeed();

        /**
         * The meta object literal for the '{@link ddsm.impl.CrontabImpl <em>Crontab</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ddsm.impl.CrontabImpl
         * @see ddsm.impl.DdsmPackageImpl#getCrontab()
         * @generated
         */
        EClass CRONTAB = eINSTANCE.getCrontab();

        /**
         * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CRONTAB__MIN = eINSTANCE.getCrontab_Min();

        /**
         * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CRONTAB__HOUR = eINSTANCE.getCrontab_Hour();

        /**
         * The meta object literal for the '<em><b>Day Of Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CRONTAB__DAY_OF_MONTH = eINSTANCE.getCrontab_DayOfMonth();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CRONTAB__MONTH = eINSTANCE.getCrontab_Month();

        /**
         * The meta object literal for the '<em><b>Day Of Week</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CRONTAB__DAY_OF_WEEK = eINSTANCE.getCrontab_DayOfWeek();

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
