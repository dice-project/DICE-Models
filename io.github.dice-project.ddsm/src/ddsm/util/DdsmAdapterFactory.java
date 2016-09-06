/**
 */
package ddsm.util;

import ddsm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ddsm.DdsmPackage
 * @generated
 */
public class DdsmAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DdsmPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DdsmAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DdsmPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DdsmSwitch<Adapter> modelSwitch =
        new DdsmSwitch<Adapter>() {
            @Override
            public Adapter caseCloudElement(CloudElement object) {
                return createCloudElementAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter caseResource(Resource object) {
                return createResourceAdapter();
            }
            @Override
            public Adapter caseComponent(Component object) {
                return createComponentAdapter();
            }
            @Override
            public Adapter caseInternalComponent(InternalComponent object) {
                return createInternalComponentAdapter();
            }
            @Override
            public Adapter caseExecutionPlatform(ExecutionPlatform object) {
                return createExecutionPlatformAdapter();
            }
            @Override
            public Adapter casePort(Port object) {
                return createPortAdapter();
            }
            @Override
            public Adapter caseRequiredPort(RequiredPort object) {
                return createRequiredPortAdapter();
            }
            @Override
            public Adapter caseProvidedPort(ProvidedPort object) {
                return createProvidedPortAdapter();
            }
            @Override
            public Adapter caseRequiredExecutionPlatform(RequiredExecutionPlatform object) {
                return createRequiredExecutionPlatformAdapter();
            }
            @Override
            public Adapter caseProvidedExecutionPlatform(ProvidedExecutionPlatform object) {
                return createProvidedExecutionPlatformAdapter();
            }
            @Override
            public Adapter caseRelationship(Relationship object) {
                return createRelationshipAdapter();
            }
            @Override
            public Adapter caseExecutionBinding(ExecutionBinding object) {
                return createExecutionBindingAdapter();
            }
            @Override
            public Adapter caseExternalComponent(ExternalComponent object) {
                return createExternalComponentAdapter();
            }
            @Override
            public Adapter caseProvider(Provider object) {
                return createProviderAdapter();
            }
            @Override
            public Adapter caseVM(VM object) {
                return createVMAdapter();
            }
            @Override
            public Adapter caseDDSM(DDSM object) {
                return createDDSMAdapter();
            }
            @Override
            public Adapter caseSupervisor(Supervisor object) {
                return createSupervisorAdapter();
            }
            @Override
            public Adapter caseNimbus(Nimbus object) {
                return createNimbusAdapter();
            }
            @Override
            public Adapter caseZookeeperServer(ZookeeperServer object) {
                return createZookeeperServerAdapter();
            }
            @Override
            public Adapter caseClientNode(ClientNode object) {
                return createClientNodeAdapter();
            }
            @Override
            public Adapter caseYarnResourceManager(YarnResourceManager object) {
                return createYarnResourceManagerAdapter();
            }
            @Override
            public Adapter caseYarnNodeManager(YarnNodeManager object) {
                return createYarnNodeManagerAdapter();
            }
            @Override
            public Adapter caseHDFSNameNode(HDFSNameNode object) {
                return createHDFSNameNodeAdapter();
            }
            @Override
            public Adapter caseHDFSDataNode(HDFSDataNode object) {
                return createHDFSDataNodeAdapter();
            }
            @Override
            public Adapter caseChefResource(ChefResource object) {
                return createChefResourceAdapter();
            }
            @Override
            public Adapter caseStormCluster(StormCluster object) {
                return createStormClusterAdapter();
            }
            @Override
            public Adapter caseJobSubmission(JobSubmission object) {
                return createJobSubmissionAdapter();
            }
            @Override
            public Adapter caseMasterNode(MasterNode object) {
                return createMasterNodeAdapter();
            }
            @Override
            public Adapter caseSlaveNode(SlaveNode object) {
                return createSlaveNodeAdapter();
            }
            @Override
            public Adapter caseZookeeperQuorum(ZookeeperQuorum object) {
                return createZookeeperQuorumAdapter();
            }
            @Override
            public Adapter caseCassandraWorker(CassandraWorker object) {
                return createCassandraWorkerAdapter();
            }
            @Override
            public Adapter caseZookeeperCluster(ZookeeperCluster object) {
                return createZookeeperClusterAdapter();
            }
            @Override
            public Adapter caseCassandraCluster(CassandraCluster object) {
                return createCassandraClusterAdapter();
            }
            @Override
            public Adapter casePeerNode(PeerNode object) {
                return createPeerNodeAdapter();
            }
            @Override
            public Adapter casePeersQuorum(PeersQuorum object) {
                return createPeersQuorumAdapter();
            }
            @Override
            public Adapter casePeerToPeerPlatform(PeerToPeerPlatform object) {
                return createPeerToPeerPlatformAdapter();
            }
            @Override
            public Adapter caseMasterSlavePlatform(MasterSlavePlatform object) {
                return createMasterSlavePlatformAdapter();
            }
            @Override
            public Adapter caseCassandraQuorum(CassandraQuorum object) {
                return createCassandraQuorumAdapter();
            }
            @Override
            public Adapter caseCassandraSeed(CassandraSeed object) {
                return createCassandraSeedAdapter();
            }
            @Override
            public Adapter caseCrontab(Crontab object) {
                return createCrontabAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link ddsm.CloudElement <em>Cloud Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.CloudElement
     * @generated
     */
    public Adapter createCloudElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.Resource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.Resource
     * @generated
     */
    public Adapter createResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.Component
     * @generated
     */
    public Adapter createComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.InternalComponent <em>Internal Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.InternalComponent
     * @generated
     */
    public Adapter createInternalComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.ExecutionPlatform <em>Execution Platform</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.ExecutionPlatform
     * @generated
     */
    public Adapter createExecutionPlatformAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.Port <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.Port
     * @generated
     */
    public Adapter createPortAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.RequiredPort <em>Required Port</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.RequiredPort
     * @generated
     */
    public Adapter createRequiredPortAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.ProvidedPort <em>Provided Port</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.ProvidedPort
     * @generated
     */
    public Adapter createProvidedPortAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.RequiredExecutionPlatform <em>Required Execution Platform</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.RequiredExecutionPlatform
     * @generated
     */
    public Adapter createRequiredExecutionPlatformAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.ProvidedExecutionPlatform <em>Provided Execution Platform</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.ProvidedExecutionPlatform
     * @generated
     */
    public Adapter createProvidedExecutionPlatformAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.Relationship
     * @generated
     */
    public Adapter createRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.ExecutionBinding <em>Execution Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.ExecutionBinding
     * @generated
     */
    public Adapter createExecutionBindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.ExternalComponent <em>External Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.ExternalComponent
     * @generated
     */
    public Adapter createExternalComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.Provider <em>Provider</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.Provider
     * @generated
     */
    public Adapter createProviderAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.VM <em>VM</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.VM
     * @generated
     */
    public Adapter createVMAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.DDSM <em>DDSM</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.DDSM
     * @generated
     */
    public Adapter createDDSMAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.Supervisor <em>Supervisor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.Supervisor
     * @generated
     */
    public Adapter createSupervisorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.Nimbus <em>Nimbus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.Nimbus
     * @generated
     */
    public Adapter createNimbusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.ZookeeperServer <em>Zookeeper Server</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.ZookeeperServer
     * @generated
     */
    public Adapter createZookeeperServerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.ClientNode <em>Client Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.ClientNode
     * @generated
     */
    public Adapter createClientNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.YarnResourceManager <em>Yarn Resource Manager</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.YarnResourceManager
     * @generated
     */
    public Adapter createYarnResourceManagerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.YarnNodeManager <em>Yarn Node Manager</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.YarnNodeManager
     * @generated
     */
    public Adapter createYarnNodeManagerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.HDFSNameNode <em>HDFS Name Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.HDFSNameNode
     * @generated
     */
    public Adapter createHDFSNameNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.HDFSDataNode <em>HDFS Data Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.HDFSDataNode
     * @generated
     */
    public Adapter createHDFSDataNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.ChefResource <em>Chef Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.ChefResource
     * @generated
     */
    public Adapter createChefResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.StormCluster <em>Storm Cluster</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.StormCluster
     * @generated
     */
    public Adapter createStormClusterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.JobSubmission <em>Job Submission</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.JobSubmission
     * @generated
     */
    public Adapter createJobSubmissionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.MasterNode <em>Master Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.MasterNode
     * @generated
     */
    public Adapter createMasterNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.SlaveNode <em>Slave Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.SlaveNode
     * @generated
     */
    public Adapter createSlaveNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.ZookeeperQuorum <em>Zookeeper Quorum</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.ZookeeperQuorum
     * @generated
     */
    public Adapter createZookeeperQuorumAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.CassandraWorker <em>Cassandra Worker</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.CassandraWorker
     * @generated
     */
    public Adapter createCassandraWorkerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.ZookeeperCluster <em>Zookeeper Cluster</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.ZookeeperCluster
     * @generated
     */
    public Adapter createZookeeperClusterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.CassandraCluster <em>Cassandra Cluster</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.CassandraCluster
     * @generated
     */
    public Adapter createCassandraClusterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.PeerNode <em>Peer Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.PeerNode
     * @generated
     */
    public Adapter createPeerNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.PeersQuorum <em>Peers Quorum</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.PeersQuorum
     * @generated
     */
    public Adapter createPeersQuorumAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.PeerToPeerPlatform <em>Peer To Peer Platform</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.PeerToPeerPlatform
     * @generated
     */
    public Adapter createPeerToPeerPlatformAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.MasterSlavePlatform <em>Master Slave Platform</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.MasterSlavePlatform
     * @generated
     */
    public Adapter createMasterSlavePlatformAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.CassandraQuorum <em>Cassandra Quorum</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.CassandraQuorum
     * @generated
     */
    public Adapter createCassandraQuorumAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.CassandraSeed <em>Cassandra Seed</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.CassandraSeed
     * @generated
     */
    public Adapter createCassandraSeedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.Crontab <em>Crontab</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.Crontab
     * @generated
     */
    public Adapter createCrontabAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //DdsmAdapterFactory
