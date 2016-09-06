/**
 */
package ddsm.impl;

import ddsm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DdsmFactoryImpl extends EFactoryImpl implements DdsmFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DdsmFactory init() {
        try {
            DdsmFactory theDdsmFactory = (DdsmFactory)EPackage.Registry.INSTANCE.getEFactory(DdsmPackage.eNS_URI);
            if (theDdsmFactory != null) {
                return theDdsmFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DdsmFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DdsmFactoryImpl() {
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
            case DdsmPackage.PROPERTY: return createProperty();
            case DdsmPackage.RESOURCE: return createResource();
            case DdsmPackage.INTERNAL_COMPONENT: return createInternalComponent();
            case DdsmPackage.REQUIRED_PORT: return createRequiredPort();
            case DdsmPackage.PROVIDED_PORT: return createProvidedPort();
            case DdsmPackage.REQUIRED_EXECUTION_PLATFORM: return createRequiredExecutionPlatform();
            case DdsmPackage.PROVIDED_EXECUTION_PLATFORM: return createProvidedExecutionPlatform();
            case DdsmPackage.RELATIONSHIP: return createRelationship();
            case DdsmPackage.EXECUTION_BINDING: return createExecutionBinding();
            case DdsmPackage.EXTERNAL_COMPONENT: return createExternalComponent();
            case DdsmPackage.PROVIDER: return createProvider();
            case DdsmPackage.VM: return createVM();
            case DdsmPackage.DDSM: return createDDSM();
            case DdsmPackage.SUPERVISOR: return createSupervisor();
            case DdsmPackage.NIMBUS: return createNimbus();
            case DdsmPackage.ZOOKEEPER_SERVER: return createZookeeperServer();
            case DdsmPackage.CLIENT_NODE: return createClientNode();
            case DdsmPackage.YARN_RESOURCE_MANAGER: return createYarnResourceManager();
            case DdsmPackage.YARN_NODE_MANAGER: return createYarnNodeManager();
            case DdsmPackage.HDFS_NAME_NODE: return createHDFSNameNode();
            case DdsmPackage.HDFS_DATA_NODE: return createHDFSDataNode();
            case DdsmPackage.CHEF_RESOURCE: return createChefResource();
            case DdsmPackage.STORM_CLUSTER: return createStormCluster();
            case DdsmPackage.JOB_SUBMISSION: return createJobSubmission();
            case DdsmPackage.MASTER_NODE: return createMasterNode();
            case DdsmPackage.SLAVE_NODE: return createSlaveNode();
            case DdsmPackage.ZOOKEEPER_QUORUM: return createZookeeperQuorum();
            case DdsmPackage.CASSANDRA_WORKER: return createCassandraWorker();
            case DdsmPackage.ZOOKEEPER_CLUSTER: return createZookeeperCluster();
            case DdsmPackage.CASSANDRA_CLUSTER: return createCassandraCluster();
            case DdsmPackage.PEER_NODE: return createPeerNode();
            case DdsmPackage.PEERS_QUORUM: return createPeersQuorum();
            case DdsmPackage.PEER_TO_PEER_PLATFORM: return createPeerToPeerPlatform();
            case DdsmPackage.MASTER_SLAVE_PLATFORM: return createMasterSlavePlatform();
            case DdsmPackage.CASSANDRA_QUORUM: return createCassandraQuorum();
            case DdsmPackage.CASSANDRA_SEED: return createCassandraSeed();
            case DdsmPackage.CRONTAB: return createCrontab();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case DdsmPackage.VM_SIZE:
                return createVMSizeFromString(eDataType, initialValue);
            case DdsmPackage.PROVIDER_TYPE:
                return createProviderTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case DdsmPackage.VM_SIZE:
                return convertVMSizeToString(eDataType, instanceValue);
            case DdsmPackage.PROVIDER_TYPE:
                return convertProviderTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
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
    public Resource createResource() {
        ResourceImpl resource = new ResourceImpl();
        return resource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InternalComponent createInternalComponent() {
        InternalComponentImpl internalComponent = new InternalComponentImpl();
        return internalComponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RequiredPort createRequiredPort() {
        RequiredPortImpl requiredPort = new RequiredPortImpl();
        return requiredPort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProvidedPort createProvidedPort() {
        ProvidedPortImpl providedPort = new ProvidedPortImpl();
        return providedPort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RequiredExecutionPlatform createRequiredExecutionPlatform() {
        RequiredExecutionPlatformImpl requiredExecutionPlatform = new RequiredExecutionPlatformImpl();
        return requiredExecutionPlatform;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProvidedExecutionPlatform createProvidedExecutionPlatform() {
        ProvidedExecutionPlatformImpl providedExecutionPlatform = new ProvidedExecutionPlatformImpl();
        return providedExecutionPlatform;
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
    public ExecutionBinding createExecutionBinding() {
        ExecutionBindingImpl executionBinding = new ExecutionBindingImpl();
        return executionBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExternalComponent createExternalComponent() {
        ExternalComponentImpl externalComponent = new ExternalComponentImpl();
        return externalComponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Provider createProvider() {
        ProviderImpl provider = new ProviderImpl();
        return provider;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VM createVM() {
        VMImpl vm = new VMImpl();
        return vm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DDSM createDDSM() {
        DDSMImpl ddsm = new DDSMImpl();
        return ddsm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Supervisor createSupervisor() {
        SupervisorImpl supervisor = new SupervisorImpl();
        return supervisor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Nimbus createNimbus() {
        NimbusImpl nimbus = new NimbusImpl();
        return nimbus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ZookeeperServer createZookeeperServer() {
        ZookeeperServerImpl zookeeperServer = new ZookeeperServerImpl();
        return zookeeperServer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClientNode createClientNode() {
        ClientNodeImpl clientNode = new ClientNodeImpl();
        return clientNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YarnResourceManager createYarnResourceManager() {
        YarnResourceManagerImpl yarnResourceManager = new YarnResourceManagerImpl();
        return yarnResourceManager;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YarnNodeManager createYarnNodeManager() {
        YarnNodeManagerImpl yarnNodeManager = new YarnNodeManagerImpl();
        return yarnNodeManager;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HDFSNameNode createHDFSNameNode() {
        HDFSNameNodeImpl hdfsNameNode = new HDFSNameNodeImpl();
        return hdfsNameNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HDFSDataNode createHDFSDataNode() {
        HDFSDataNodeImpl hdfsDataNode = new HDFSDataNodeImpl();
        return hdfsDataNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefResource createChefResource() {
        ChefResourceImpl chefResource = new ChefResourceImpl();
        return chefResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StormCluster createStormCluster() {
        StormClusterImpl stormCluster = new StormClusterImpl();
        return stormCluster;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JobSubmission createJobSubmission() {
        JobSubmissionImpl jobSubmission = new JobSubmissionImpl();
        return jobSubmission;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MasterNode createMasterNode() {
        MasterNodeImpl masterNode = new MasterNodeImpl();
        return masterNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SlaveNode createSlaveNode() {
        SlaveNodeImpl slaveNode = new SlaveNodeImpl();
        return slaveNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ZookeeperQuorum createZookeeperQuorum() {
        ZookeeperQuorumImpl zookeeperQuorum = new ZookeeperQuorumImpl();
        return zookeeperQuorum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CassandraWorker createCassandraWorker() {
        CassandraWorkerImpl cassandraWorker = new CassandraWorkerImpl();
        return cassandraWorker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ZookeeperCluster createZookeeperCluster() {
        ZookeeperClusterImpl zookeeperCluster = new ZookeeperClusterImpl();
        return zookeeperCluster;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CassandraCluster createCassandraCluster() {
        CassandraClusterImpl cassandraCluster = new CassandraClusterImpl();
        return cassandraCluster;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeerNode createPeerNode() {
        PeerNodeImpl peerNode = new PeerNodeImpl();
        return peerNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeersQuorum createPeersQuorum() {
        PeersQuorumImpl peersQuorum = new PeersQuorumImpl();
        return peersQuorum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeerToPeerPlatform createPeerToPeerPlatform() {
        PeerToPeerPlatformImpl peerToPeerPlatform = new PeerToPeerPlatformImpl();
        return peerToPeerPlatform;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MasterSlavePlatform createMasterSlavePlatform() {
        MasterSlavePlatformImpl masterSlavePlatform = new MasterSlavePlatformImpl();
        return masterSlavePlatform;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CassandraQuorum createCassandraQuorum() {
        CassandraQuorumImpl cassandraQuorum = new CassandraQuorumImpl();
        return cassandraQuorum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CassandraSeed createCassandraSeed() {
        CassandraSeedImpl cassandraSeed = new CassandraSeedImpl();
        return cassandraSeed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Crontab createCrontab() {
        CrontabImpl crontab = new CrontabImpl();
        return crontab;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VMSize createVMSizeFromString(EDataType eDataType, String initialValue) {
        VMSize result = VMSize.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVMSizeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProviderType createProviderTypeFromString(EDataType eDataType, String initialValue) {
        ProviderType result = ProviderType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProviderTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DdsmPackage getDdsmPackage() {
        return (DdsmPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DdsmPackage getPackage() {
        return DdsmPackage.eINSTANCE;
    }

} //DdsmFactoryImpl
