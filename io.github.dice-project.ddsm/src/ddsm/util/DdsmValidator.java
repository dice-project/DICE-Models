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
            case DdsmPackage.SUPERVISOR:
                return validateSupervisor((Supervisor)value, diagnostics, context);
            case DdsmPackage.NIMBUS:
                return validateNimbus((Nimbus)value, diagnostics, context);
            case DdsmPackage.ZOOKEEPER_SERVER:
                return validateZookeeperServer((ZookeeperServer)value, diagnostics, context);
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
            case DdsmPackage.CHEF_RESOURCE:
                return validateChefResource((ChefResource)value, diagnostics, context);
            case DdsmPackage.STORM_CLUSTER:
                return validateStormCluster((StormCluster)value, diagnostics, context);
            case DdsmPackage.JOB_SUBMISSION:
                return validateJobSubmission((JobSubmission)value, diagnostics, context);
            case DdsmPackage.MASTER_NODE:
                return validateMasterNode((MasterNode)value, diagnostics, context);
            case DdsmPackage.SLAVE_NODE:
                return validateSlaveNode((SlaveNode)value, diagnostics, context);
            case DdsmPackage.ZOOKEEPER_QUORUM:
                return validateZookeeperQuorum((ZookeeperQuorum)value, diagnostics, context);
            case DdsmPackage.CASSANDRA_WORKER:
                return validateCassandraWorker((CassandraWorker)value, diagnostics, context);
            case DdsmPackage.ZOOKEEPER_CLUSTER:
                return validateZookeeperCluster((ZookeeperCluster)value, diagnostics, context);
            case DdsmPackage.CASSANDRA_CLUSTER:
                return validateCassandraCluster((CassandraCluster)value, diagnostics, context);
            case DdsmPackage.PEER_NODE:
                return validatePeerNode((PeerNode)value, diagnostics, context);
            case DdsmPackage.PEERS_QUORUM:
                return validatePeersQuorum((PeersQuorum)value, diagnostics, context);
            case DdsmPackage.PEER_TO_PEER_PLATFORM:
                return validatePeerToPeerPlatform((PeerToPeerPlatform)value, diagnostics, context);
            case DdsmPackage.MASTER_SLAVE_PLATFORM:
                return validateMasterSlavePlatform((MasterSlavePlatform)value, diagnostics, context);
            case DdsmPackage.CASSANDRA_QUORUM:
                return validateCassandraQuorum((CassandraQuorum)value, diagnostics, context);
            case DdsmPackage.CASSANDRA_SEED:
                return validateCassandraSeed((CassandraSeed)value, diagnostics, context);
            case DdsmPackage.CRONTAB:
                return validateCrontab((Crontab)value, diagnostics, context);
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
    public boolean validateSupervisor(Supervisor supervisor, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(supervisor, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(supervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(supervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(supervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(supervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(supervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supervisor, diagnostics, context);
        if (result || diagnostics != null) result &= validateSupervisor_mustHaveNimbusMaster(supervisor, diagnostics, context);
        return result;
    }

    /**
     * The cached validation expression for the mustHaveNimbusMaster constraint of '<em>Supervisor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String SUPERVISOR__MUST_HAVE_NIMBUS_MASTER__EEXPRESSION = " hasMaster.oclIsTypeOf(Nimbus)";

    /**
     * Validates the mustHaveNimbusMaster constraint of '<em>Supervisor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSupervisor_mustHaveNimbusMaster(Supervisor supervisor, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (DdsmPackage.Literals.SUPERVISOR,
                 supervisor,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                 "mustHaveNimbusMaster",
                 SUPERVISOR__MUST_HAVE_NIMBUS_MASTER__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNimbus(Nimbus nimbus, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(nimbus, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(nimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(nimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(nimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(nimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nimbus, diagnostics, context);
        if (result || diagnostics != null) result &= validateNimbus_dependsOnZookeeper(nimbus, diagnostics, context);
        return result;
    }

    /**
     * The cached validation expression for the dependsOnZookeeper constraint of '<em>Nimbus</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String NIMBUS__DEPENDS_ON_ZOOKEEPER__EEXPRESSION = "Relationship.allInstances() ->\n" +
        "\texists(r | \n" +
        "\t\tself.requiredport -> exists(p |\n" +
        "\t\t\tp.elementId = r.requiredport.elementId and\n" +
        "\t\t\t(r.providedport.owner.oclIsTypeOf(ZookeeperCluster) or\n" +
        "\t\t\tr.providedport.owner.oclIsTypeOf(ZookeeperQuorum))\n" +
        "\t\t)\n" +
        "\t)";

    /**
     * Validates the dependsOnZookeeper constraint of '<em>Nimbus</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNimbus_dependsOnZookeeper(Nimbus nimbus, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (DdsmPackage.Literals.NIMBUS,
                 nimbus,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                 "dependsOnZookeeper",
                 NIMBUS__DEPENDS_ON_ZOOKEEPER__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateZookeeperServer(ZookeeperServer zookeeperServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(zookeeperServer, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(zookeeperServer, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zookeeperServer, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zookeeperServer, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zookeeperServer, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(zookeeperServer, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(zookeeperServer, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(zookeeperServer, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zookeeperServer, diagnostics, context);
        if (result || diagnostics != null) result &= validateZookeeperServer_mustBelongToZookeeperQuorum(zookeeperServer, diagnostics, context);
        return result;
    }

    /**
     * The cached validation expression for the mustBelongToZookeeperQuorum constraint of '<em>Zookeeper Server</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String ZOOKEEPER_SERVER__MUST_BELONG_TO_ZOOKEEPER_QUORUM__EEXPRESSION = " belongsToQuorum.oclIsTypeOf(ZookeeperQuorum)";

    /**
     * Validates the mustBelongToZookeeperQuorum constraint of '<em>Zookeeper Server</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateZookeeperServer_mustBelongToZookeeperQuorum(ZookeeperServer zookeeperServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (DdsmPackage.Literals.ZOOKEEPER_SERVER,
                 zookeeperServer,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                 "mustBelongToZookeeperQuorum",
                 ZOOKEEPER_SERVER__MUST_BELONG_TO_ZOOKEEPER_QUORUM__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
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
    public boolean validateChefResource(ChefResource chefResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(chefResource, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStormCluster(StormCluster stormCluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(stormCluster, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(stormCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stormCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stormCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stormCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(stormCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(stormCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(stormCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stormCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validateMasterSlavePlatform_slavePlatformsNeedBinding(stormCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validateMasterSlavePlatform_masterPlatformNeedBinding(stormCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validateStormCluster_stormClusterDependsOnZookeeper(stormCluster, diagnostics, context);
        return result;
    }

    /**
     * The cached validation expression for the stormClusterDependsOnZookeeper constraint of '<em>Storm Cluster</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String STORM_CLUSTER__STORM_CLUSTER_DEPENDS_ON_ZOOKEEPER__EEXPRESSION = "Relationship.allInstances() ->\n" +
        "\texists(r | \n" +
        "\t\tself.requiredport -> exists(p |\n" +
        "\t\t\tp.elementId = r.requiredport.elementId and\n" +
        "\t\t\t(r.providedport.owner.oclIsTypeOf(ZookeeperCluster) or\n" +
        "\t\t\tr.providedport.owner.oclIsTypeOf(ZookeeperQuorum))\n" +
        "\t\t)\n" +
        "\t)";

    /**
     * Validates the stormClusterDependsOnZookeeper constraint of '<em>Storm Cluster</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStormCluster_stormClusterDependsOnZookeeper(StormCluster stormCluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (DdsmPackage.Literals.STORM_CLUSTER,
                 stormCluster,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                 "stormClusterDependsOnZookeeper",
                 STORM_CLUSTER__STORM_CLUSTER_DEPENDS_ON_ZOOKEEPER__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateJobSubmission(JobSubmission jobSubmission, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(jobSubmission, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMasterNode(MasterNode masterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(masterNode, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSlaveNode(SlaveNode slaveNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(slaveNode, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateZookeeperQuorum(ZookeeperQuorum zookeeperQuorum, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(zookeeperQuorum, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCassandraWorker(CassandraWorker cassandraWorker, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(cassandraWorker, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(cassandraWorker, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cassandraWorker, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cassandraWorker, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cassandraWorker, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(cassandraWorker, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(cassandraWorker, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(cassandraWorker, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cassandraWorker, diagnostics, context);
        if (result || diagnostics != null) result &= validateCassandraWorker_mustBelongToCassandraQuorum(cassandraWorker, diagnostics, context);
        return result;
    }

    /**
     * The cached validation expression for the mustBelongToCassandraQuorum constraint of '<em>Cassandra Worker</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String CASSANDRA_WORKER__MUST_BELONG_TO_CASSANDRA_QUORUM__EEXPRESSION = " belongsToQuorum.oclIsTypeOf(CassandraQuorum)";

    /**
     * Validates the mustBelongToCassandraQuorum constraint of '<em>Cassandra Worker</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCassandraWorker_mustBelongToCassandraQuorum(CassandraWorker cassandraWorker, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (DdsmPackage.Literals.CASSANDRA_WORKER,
                 cassandraWorker,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                 "mustBelongToCassandraQuorum",
                 CASSANDRA_WORKER__MUST_BELONG_TO_CASSANDRA_QUORUM__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateZookeeperCluster(ZookeeperCluster zookeeperCluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(zookeeperCluster, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(zookeeperCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zookeeperCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zookeeperCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zookeeperCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(zookeeperCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(zookeeperCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(zookeeperCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zookeeperCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validatePeerToPeerPlatform_peerPlatformsNeedBinding(zookeeperCluster, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCassandraCluster(CassandraCluster cassandraCluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(cassandraCluster, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(cassandraCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cassandraCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cassandraCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cassandraCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(cassandraCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(cassandraCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(cassandraCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cassandraCluster, diagnostics, context);
        if (result || diagnostics != null) result &= validatePeerToPeerPlatform_peerPlatformsNeedBinding(cassandraCluster, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePeerNode(PeerNode peerNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(peerNode, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePeersQuorum(PeersQuorum peersQuorum, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(peersQuorum, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePeerToPeerPlatform(PeerToPeerPlatform peerToPeerPlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(peerToPeerPlatform, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(peerToPeerPlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(peerToPeerPlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(peerToPeerPlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(peerToPeerPlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(peerToPeerPlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(peerToPeerPlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(peerToPeerPlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(peerToPeerPlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validatePeerToPeerPlatform_peerPlatformsNeedBinding(peerToPeerPlatform, diagnostics, context);
        return result;
    }

    /**
     * The cached validation expression for the peerPlatformsNeedBinding constraint of '<em>Peer To Peer Platform</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String PEER_TO_PEER_PLATFORM__PEER_PLATFORMS_NEED_BINDING__EEXPRESSION = "requiresPeerVm -> forAll(platform | ExecutionBinding.allInstances() ->\n" +
        "\texists(b |\n" +
        "\t\t b.requiredexecutionplatform.elementId = platform.elementId and \n" +
        "\t     b.providedexecutionplatform.owner.oclIsTypeOf(VM)\n" +
        "\t)\n" +
        ")";

    /**
     * Validates the peerPlatformsNeedBinding constraint of '<em>Peer To Peer Platform</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePeerToPeerPlatform_peerPlatformsNeedBinding(PeerToPeerPlatform peerToPeerPlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (DdsmPackage.Literals.PEER_TO_PEER_PLATFORM,
                 peerToPeerPlatform,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                 "peerPlatformsNeedBinding",
                 PEER_TO_PEER_PLATFORM__PEER_PLATFORMS_NEED_BINDING__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMasterSlavePlatform(MasterSlavePlatform masterSlavePlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(masterSlavePlatform, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(masterSlavePlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(masterSlavePlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(masterSlavePlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(masterSlavePlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(masterSlavePlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(masterSlavePlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(masterSlavePlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(masterSlavePlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validateMasterSlavePlatform_slavePlatformsNeedBinding(masterSlavePlatform, diagnostics, context);
        if (result || diagnostics != null) result &= validateMasterSlavePlatform_masterPlatformNeedBinding(masterSlavePlatform, diagnostics, context);
        return result;
    }

    /**
     * The cached validation expression for the slavePlatformsNeedBinding constraint of '<em>Master Slave Platform</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String MASTER_SLAVE_PLATFORM__SLAVE_PLATFORMS_NEED_BINDING__EEXPRESSION = "requiresSlaveVm -> forAll(platform | ExecutionBinding.allInstances() ->\n" +
        "\texists(b |\n" +
        "\t\t b.requiredexecutionplatform.elementId = platform.elementId and \n" +
        "\t         b.providedexecutionplatform.owner.oclIsTypeOf(VM)\n" +
        "\t)\n" +
        ")";

    /**
     * Validates the slavePlatformsNeedBinding constraint of '<em>Master Slave Platform</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMasterSlavePlatform_slavePlatformsNeedBinding(MasterSlavePlatform masterSlavePlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (DdsmPackage.Literals.MASTER_SLAVE_PLATFORM,
                 masterSlavePlatform,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                 "slavePlatformsNeedBinding",
                 MASTER_SLAVE_PLATFORM__SLAVE_PLATFORMS_NEED_BINDING__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * The cached validation expression for the masterPlatformNeedBinding constraint of '<em>Master Slave Platform</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String MASTER_SLAVE_PLATFORM__MASTER_PLATFORM_NEED_BINDING__EEXPRESSION = "ExecutionBinding.allInstances() ->\n" +
        "\texists(b |\n" +
        "\t\t b.requiredexecutionplatform.elementId = requiresMasterVm.elementId and \n" +
        "\t         b.providedexecutionplatform.owner.oclIsTypeOf(VM)\n" +
        "\t)\n" +
        "";

    /**
     * Validates the masterPlatformNeedBinding constraint of '<em>Master Slave Platform</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMasterSlavePlatform_masterPlatformNeedBinding(MasterSlavePlatform masterSlavePlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (DdsmPackage.Literals.MASTER_SLAVE_PLATFORM,
                 masterSlavePlatform,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                 "masterPlatformNeedBinding",
                 MASTER_SLAVE_PLATFORM__MASTER_PLATFORM_NEED_BINDING__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCassandraQuorum(CassandraQuorum cassandraQuorum, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(cassandraQuorum, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(cassandraQuorum, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cassandraQuorum, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cassandraQuorum, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cassandraQuorum, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(cassandraQuorum, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(cassandraQuorum, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(cassandraQuorum, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cassandraQuorum, diagnostics, context);
        if (result || diagnostics != null) result &= validateCassandraQuorum_cassandraNeedASeed(cassandraQuorum, diagnostics, context);
        return result;
    }

    /**
     * The cached validation expression for the cassandraNeedASeed constraint of '<em>Cassandra Quorum</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String CASSANDRA_QUORUM__CASSANDRA_NEED_ASEED__EEXPRESSION = "Relationship.allInstances() ->\n" +
        "\texists( r |\n" +
        "\t\tr.providedport.owner.oclIsTypeOf(CassandraSeed) and\n" +
        "\t\tr.requiredport.elementId = self.requires_bootstrapping_seed.elementId\n" +
        "\t)\n" +
        "";

    /**
     * Validates the cassandraNeedASeed constraint of '<em>Cassandra Quorum</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCassandraQuorum_cassandraNeedASeed(CassandraQuorum cassandraQuorum, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (DdsmPackage.Literals.CASSANDRA_QUORUM,
                 cassandraQuorum,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                 "cassandraNeedASeed",
                 CASSANDRA_QUORUM__CASSANDRA_NEED_ASEED__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCassandraSeed(CassandraSeed cassandraSeed, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(cassandraSeed, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCrontab(Crontab crontab, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(crontab, diagnostics, context);
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
