/**
 */
package ddsm.util;

import ddsm.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ddsm.DdsmPackage
 * @generated
 */
public class DdsmValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final DdsmValidator INSTANCE = new DdsmValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "ddsm";

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DdsmValidator() {
        super();
    }

    /**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
      return DdsmPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
        switch (classifierID) {
            case DdsmPackage.CLOUD_ELEMENT:
                return validateCloudElement((CloudElement)value, diagnostics, context);
            case DdsmPackage.PROPERTY:
                return validateProperty((Property)value, diagnostics, context);
            case DdsmPackage.RESOURCE:
                return validateResource((Resource)value, diagnostics, context);
            case DdsmPackage.COMPONENT:
                return validateComponent((Component)value, diagnostics, context);
            case DdsmPackage.INTERNAL_COMPONENT:
                return validateInternalComponent((InternalComponent)value, diagnostics, context);
            case DdsmPackage.EXECUTION_PLATFORM:
                return validateExecutionPlatform((ExecutionPlatform)value, diagnostics, context);
            case DdsmPackage.PORT:
                return validatePort((Port)value, diagnostics, context);
            case DdsmPackage.REQUIRED_PORT:
                return validateRequiredPort((RequiredPort)value, diagnostics, context);
            case DdsmPackage.PROVIDED_PORT:
                return validateProvidedPort((ProvidedPort)value, diagnostics, context);
            case DdsmPackage.REQUIRED_EXECUTION_PLATFORM:
                return validateRequiredExecutionPlatform((RequiredExecutionPlatform)value, diagnostics, context);
            case DdsmPackage.PROVIDED_EXECUTION_PLATFORM:
                return validateProvidedExecutionPlatform((ProvidedExecutionPlatform)value, diagnostics, context);
            case DdsmPackage.RELATIONSHIP:
                return validateRelationship((Relationship)value, diagnostics, context);
            case DdsmPackage.EXECUTION_BINDING:
                return validateExecutionBinding((ExecutionBinding)value, diagnostics, context);
            case DdsmPackage.EXTERNAL_COMPONENT:
                return validateExternalComponent((ExternalComponent)value, diagnostics, context);
            case DdsmPackage.PROVIDER:
                return validateProvider((Provider)value, diagnostics, context);
            case DdsmPackage.VM:
                return validateVM((VM)value, diagnostics, context);
            case DdsmPackage.DDSM:
                return validateDDSM((DDSM)value, diagnostics, context);
            case DdsmPackage.LIFE_CYCLE:
                return validateLifeCycle((LifeCycle)value, diagnostics, context);
            case DdsmPackage.STORM_SUPERVISOR:
                return validateStormSupervisor((StormSupervisor)value, diagnostics, context);
            case DdsmPackage.STORM_NIMBUS:
                return validateStormNimbus((StormNimbus)value, diagnostics, context);
            case DdsmPackage.ZOOKEEPER:
                return validateZookeeper((Zookeeper)value, diagnostics, context);
            case DdsmPackage.KAFKA:
                return validateKafka((Kafka)value, diagnostics, context);
            case DdsmPackage.CLUSTER:
                return validateCluster((Cluster)value, diagnostics, context);
            case DdsmPackage.CLIENT_NODE:
                return validateClientNode((ClientNode)value, diagnostics, context);
            case DdsmPackage.YARN_RESOURCE_MANAGER:
                return validateYarnResourceManager((YarnResourceManager)value, diagnostics, context);
            case DdsmPackage.YARN_NODE_MANAGER:
                return validateYarnNodeManager((YarnNodeManager)value, diagnostics, context);
            case DdsmPackage.HDFS_NAME_NODE:
                return validateHDFSNameNode((HDFSNameNode)value, diagnostics, context);
            case DdsmPackage.HDFS_DATA_NODE:
                return validateHDFSDataNode((HDFSDataNode)value, diagnostics, context);
            case DdsmPackage.SCRIPT:
                return validateScript((Script)value, diagnostics, context);
            case DdsmPackage.VM_SIZE:
                return validateVMSize((VMSize)value, diagnostics, context);
            case DdsmPackage.PROVIDER_TYPE:
                return validateProviderType((ProviderType)value, diagnostics, context);
            default:
                return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCloudElement(CloudElement cloudElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(cloudElement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(property, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(resource, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(component, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateInternalComponent(InternalComponent internalComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(internalComponent, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateExecutionPlatform(ExecutionPlatform executionPlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(executionPlatform, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(port, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRequiredPort(RequiredPort requiredPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(requiredPort, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateProvidedPort(ProvidedPort providedPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(providedPort, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRequiredExecutionPlatform(RequiredExecutionPlatform requiredExecutionPlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(requiredExecutionPlatform, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateProvidedExecutionPlatform(ProvidedExecutionPlatform providedExecutionPlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(providedExecutionPlatform, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(relationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateExecutionBinding(ExecutionBinding executionBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(executionBinding, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateExternalComponent(ExternalComponent externalComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(externalComponent, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateProvider(Provider provider, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(provider, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateVM(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(vm, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDDSM(DDSM ddsm, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(ddsm, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLifeCycle(LifeCycle lifeCycle, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(lifeCycle, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStormSupervisor(StormSupervisor stormSupervisor, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(stormSupervisor, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(stormSupervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stormSupervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stormSupervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stormSupervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(stormSupervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(stormSupervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(stormSupervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stormSupervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validateStormSupervisor_mustRequireZookeeperAndNimbus(stormSupervisor, diagnostics, context);
        return result;
    }

    /**
     * The cached validation expression for the mustRequireZookeeperAndNimbus constraint of '<em>Storm Supervisor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String STORM_SUPERVISOR__MUST_REQUIRE_ZOOKEEPER_AND_NIMBUS__EEXPRESSION = "requiredport -> size() > 1";

    /**
     * Validates the mustRequireZookeeperAndNimbus constraint of '<em>Storm Supervisor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStormSupervisor_mustRequireZookeeperAndNimbus(StormSupervisor stormSupervisor, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (DdsmPackage.Literals.STORM_SUPERVISOR,
                 stormSupervisor,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                 "mustRequireZookeeperAndNimbus",
                 STORM_SUPERVISOR__MUST_REQUIRE_ZOOKEEPER_AND_NIMBUS__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStormNimbus(StormNimbus stormNimbus, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(stormNimbus, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(stormNimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stormNimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stormNimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stormNimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(stormNimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(stormNimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(stormNimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stormNimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validateStormNimbus_mustRequireZookeeper(stormNimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validateStormNimbus_mustProvideNimbusAccess(stormNimbus, diagnostics, context);
        return result;
    }

    /**
     * The cached validation expression for the mustRequireZookeeper constraint of '<em>Storm Nimbus</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String STORM_NIMBUS__MUST_REQUIRE_ZOOKEEPER__EEXPRESSION = "requiredport -> size() > 0";

    /**
     * Validates the mustRequireZookeeper constraint of '<em>Storm Nimbus</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStormNimbus_mustRequireZookeeper(StormNimbus stormNimbus, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (DdsmPackage.Literals.STORM_NIMBUS,
                 stormNimbus,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                 "mustRequireZookeeper",
                 STORM_NIMBUS__MUST_REQUIRE_ZOOKEEPER__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * The cached validation expression for the mustProvideNimbusAccess constraint of '<em>Storm Nimbus</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String STORM_NIMBUS__MUST_PROVIDE_NIMBUS_ACCESS__EEXPRESSION = "providedport -> size() > 0";

    /**
     * Validates the mustProvideNimbusAccess constraint of '<em>Storm Nimbus</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStormNimbus_mustProvideNimbusAccess(StormNimbus stormNimbus, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (DdsmPackage.Literals.STORM_NIMBUS,
                 stormNimbus,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                 "mustProvideNimbusAccess",
                 STORM_NIMBUS__MUST_PROVIDE_NIMBUS_ACCESS__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateZookeeper(Zookeeper zookeeper, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(zookeeper, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(zookeeper, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zookeeper, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zookeeper, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zookeeper, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(zookeeper, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(zookeeper, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(zookeeper, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zookeeper, diagnostics, context);
        if (result || diagnostics != null) result &= validateZookeeper_mustProvideZookeeperAccess(zookeeper, diagnostics, context);
        return result;
    }

    /**
     * The cached validation expression for the mustProvideZookeeperAccess constraint of '<em>Zookeeper</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String ZOOKEEPER__MUST_PROVIDE_ZOOKEEPER_ACCESS__EEXPRESSION = "providedport -> size() > 0";

    /**
     * Validates the mustProvideZookeeperAccess constraint of '<em>Zookeeper</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateZookeeper_mustProvideZookeeperAccess(Zookeeper zookeeper, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (DdsmPackage.Literals.ZOOKEEPER,
                 zookeeper,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                 "mustProvideZookeeperAccess",
                 ZOOKEEPER__MUST_PROVIDE_ZOOKEEPER_ACCESS__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateKafka(Kafka kafka, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(kafka, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCluster(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(cluster, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateClientNode(ClientNode clientNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(clientNode, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateYarnResourceManager(YarnResourceManager yarnResourceManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(yarnResourceManager, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateYarnNodeManager(YarnNodeManager yarnNodeManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(yarnNodeManager, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateHDFSNameNode(HDFSNameNode hdfsNameNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(hdfsNameNode, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateHDFSDataNode(HDFSDataNode hdfsDataNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(hdfsDataNode, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateScript(Script script, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(script, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateVMSize(VMSize vmSize, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateProviderType(ProviderType providerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} //DdsmValidator
