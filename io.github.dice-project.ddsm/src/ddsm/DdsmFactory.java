/**
 */
package ddsm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ddsm.DdsmPackage
 * @generated
 */
public interface DdsmFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DdsmFactory eINSTANCE = ddsm.impl.DdsmFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property</em>'.
     * @generated
     */
    Property createProperty();

    /**
     * Returns a new object of class '<em>Resource</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Resource</em>'.
     * @generated
     */
    Resource createResource();

    /**
     * Returns a new object of class '<em>Internal Component</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Internal Component</em>'.
     * @generated
     */
    InternalComponent createInternalComponent();

    /**
     * Returns a new object of class '<em>Required Port</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Required Port</em>'.
     * @generated
     */
    RequiredPort createRequiredPort();

    /**
     * Returns a new object of class '<em>Provided Port</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Provided Port</em>'.
     * @generated
     */
    ProvidedPort createProvidedPort();

    /**
     * Returns a new object of class '<em>Required Execution Platform</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Required Execution Platform</em>'.
     * @generated
     */
    RequiredExecutionPlatform createRequiredExecutionPlatform();

    /**
     * Returns a new object of class '<em>Provided Execution Platform</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Provided Execution Platform</em>'.
     * @generated
     */
    ProvidedExecutionPlatform createProvidedExecutionPlatform();

    /**
     * Returns a new object of class '<em>Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relationship</em>'.
     * @generated
     */
    Relationship createRelationship();

    /**
     * Returns a new object of class '<em>Execution Binding</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Execution Binding</em>'.
     * @generated
     */
    ExecutionBinding createExecutionBinding();

    /**
     * Returns a new object of class '<em>External Component</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>External Component</em>'.
     * @generated
     */
    ExternalComponent createExternalComponent();

    /**
     * Returns a new object of class '<em>Provider</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Provider</em>'.
     * @generated
     */
    Provider createProvider();

    /**
     * Returns a new object of class '<em>VM</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VM</em>'.
     * @generated
     */
    VM createVM();

    /**
     * Returns a new object of class '<em>DDSM</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DDSM</em>'.
     * @generated
     */
    DDSM createDDSM();

    /**
     * Returns a new object of class '<em>Supervisor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Supervisor</em>'.
     * @generated
     */
    Supervisor createSupervisor();

    /**
     * Returns a new object of class '<em>Nimbus</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Nimbus</em>'.
     * @generated
     */
    Nimbus createNimbus();

    /**
     * Returns a new object of class '<em>Zookeeper Server</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Zookeeper Server</em>'.
     * @generated
     */
    ZookeeperServer createZookeeperServer();

    /**
     * Returns a new object of class '<em>Client Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Client Node</em>'.
     * @generated
     */
    ClientNode createClientNode();

    /**
     * Returns a new object of class '<em>Yarn Resource Manager</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Yarn Resource Manager</em>'.
     * @generated
     */
    YarnResourceManager createYarnResourceManager();

    /**
     * Returns a new object of class '<em>Yarn Node Manager</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Yarn Node Manager</em>'.
     * @generated
     */
    YarnNodeManager createYarnNodeManager();

    /**
     * Returns a new object of class '<em>HDFS Name Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>HDFS Name Node</em>'.
     * @generated
     */
    HDFSNameNode createHDFSNameNode();

    /**
     * Returns a new object of class '<em>HDFS Data Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>HDFS Data Node</em>'.
     * @generated
     */
    HDFSDataNode createHDFSDataNode();

    /**
     * Returns a new object of class '<em>Chef Resource</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Chef Resource</em>'.
     * @generated
     */
    ChefResource createChefResource();

    /**
     * Returns a new object of class '<em>Storm Cluster</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Storm Cluster</em>'.
     * @generated
     */
    StormCluster createStormCluster();

    /**
     * Returns a new object of class '<em>Job Submission</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Job Submission</em>'.
     * @generated
     */
    JobSubmission createJobSubmission();

    /**
     * Returns a new object of class '<em>Master Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Master Node</em>'.
     * @generated
     */
    MasterNode createMasterNode();

    /**
     * Returns a new object of class '<em>Slave Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Slave Node</em>'.
     * @generated
     */
    SlaveNode createSlaveNode();

    /**
     * Returns a new object of class '<em>Zookeeper Quorum</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Zookeeper Quorum</em>'.
     * @generated
     */
    ZookeeperQuorum createZookeeperQuorum();

    /**
     * Returns a new object of class '<em>Cassandra Worker</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cassandra Worker</em>'.
     * @generated
     */
    CassandraWorker createCassandraWorker();

    /**
     * Returns a new object of class '<em>Zookeeper Cluster</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Zookeeper Cluster</em>'.
     * @generated
     */
    ZookeeperCluster createZookeeperCluster();

    /**
     * Returns a new object of class '<em>Cassandra Cluster</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cassandra Cluster</em>'.
     * @generated
     */
    CassandraCluster createCassandraCluster();

    /**
     * Returns a new object of class '<em>Peer Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Peer Node</em>'.
     * @generated
     */
    PeerNode createPeerNode();

    /**
     * Returns a new object of class '<em>Peers Quorum</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Peers Quorum</em>'.
     * @generated
     */
    PeersQuorum createPeersQuorum();

    /**
     * Returns a new object of class '<em>Peer To Peer Platform</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Peer To Peer Platform</em>'.
     * @generated
     */
    PeerToPeerPlatform createPeerToPeerPlatform();

    /**
     * Returns a new object of class '<em>Master Slave Platform</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Master Slave Platform</em>'.
     * @generated
     */
    MasterSlavePlatform createMasterSlavePlatform();

    /**
     * Returns a new object of class '<em>Cassandra Quorum</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cassandra Quorum</em>'.
     * @generated
     */
    CassandraQuorum createCassandraQuorum();

    /**
     * Returns a new object of class '<em>Cassandra Seed</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cassandra Seed</em>'.
     * @generated
     */
    CassandraSeed createCassandraSeed();

    /**
     * Returns a new object of class '<em>Crontab</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Crontab</em>'.
     * @generated
     */
    Crontab createCrontab();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DdsmPackage getDdsmPackage();

} //DdsmFactory
