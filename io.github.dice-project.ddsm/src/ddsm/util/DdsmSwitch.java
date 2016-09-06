/**
 */
package ddsm.util;

import ddsm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ddsm.DdsmPackage
 * @generated
 */
public class DdsmSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DdsmPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DdsmSwitch() {
        if (modelPackage == null) {
            modelPackage = DdsmPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case DdsmPackage.CLOUD_ELEMENT: {
                CloudElement cloudElement = (CloudElement)theEObject;
                T result = caseCloudElement(cloudElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.PROPERTY: {
                Property property = (Property)theEObject;
                T result = caseProperty(property);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.RESOURCE: {
                Resource resource = (Resource)theEObject;
                T result = caseResource(resource);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.COMPONENT: {
                Component component = (Component)theEObject;
                T result = caseComponent(component);
                if (result == null) result = caseCloudElement(component);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.INTERNAL_COMPONENT: {
                InternalComponent internalComponent = (InternalComponent)theEObject;
                T result = caseInternalComponent(internalComponent);
                if (result == null) result = caseComponent(internalComponent);
                if (result == null) result = caseCloudElement(internalComponent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.EXECUTION_PLATFORM: {
                ExecutionPlatform executionPlatform = (ExecutionPlatform)theEObject;
                T result = caseExecutionPlatform(executionPlatform);
                if (result == null) result = caseCloudElement(executionPlatform);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.PORT: {
                Port port = (Port)theEObject;
                T result = casePort(port);
                if (result == null) result = caseCloudElement(port);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.REQUIRED_PORT: {
                RequiredPort requiredPort = (RequiredPort)theEObject;
                T result = caseRequiredPort(requiredPort);
                if (result == null) result = casePort(requiredPort);
                if (result == null) result = caseCloudElement(requiredPort);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.PROVIDED_PORT: {
                ProvidedPort providedPort = (ProvidedPort)theEObject;
                T result = caseProvidedPort(providedPort);
                if (result == null) result = casePort(providedPort);
                if (result == null) result = caseCloudElement(providedPort);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.REQUIRED_EXECUTION_PLATFORM: {
                RequiredExecutionPlatform requiredExecutionPlatform = (RequiredExecutionPlatform)theEObject;
                T result = caseRequiredExecutionPlatform(requiredExecutionPlatform);
                if (result == null) result = caseExecutionPlatform(requiredExecutionPlatform);
                if (result == null) result = caseCloudElement(requiredExecutionPlatform);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.PROVIDED_EXECUTION_PLATFORM: {
                ProvidedExecutionPlatform providedExecutionPlatform = (ProvidedExecutionPlatform)theEObject;
                T result = caseProvidedExecutionPlatform(providedExecutionPlatform);
                if (result == null) result = caseExecutionPlatform(providedExecutionPlatform);
                if (result == null) result = caseCloudElement(providedExecutionPlatform);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.RELATIONSHIP: {
                Relationship relationship = (Relationship)theEObject;
                T result = caseRelationship(relationship);
                if (result == null) result = caseCloudElement(relationship);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.EXECUTION_BINDING: {
                ExecutionBinding executionBinding = (ExecutionBinding)theEObject;
                T result = caseExecutionBinding(executionBinding);
                if (result == null) result = caseCloudElement(executionBinding);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.EXTERNAL_COMPONENT: {
                ExternalComponent externalComponent = (ExternalComponent)theEObject;
                T result = caseExternalComponent(externalComponent);
                if (result == null) result = caseComponent(externalComponent);
                if (result == null) result = caseCloudElement(externalComponent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.PROVIDER: {
                Provider provider = (Provider)theEObject;
                T result = caseProvider(provider);
                if (result == null) result = caseCloudElement(provider);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.VM: {
                VM vm = (VM)theEObject;
                T result = caseVM(vm);
                if (result == null) result = caseExternalComponent(vm);
                if (result == null) result = caseComponent(vm);
                if (result == null) result = caseCloudElement(vm);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.DDSM: {
                DDSM ddsm = (DDSM)theEObject;
                T result = caseDDSM(ddsm);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.SUPERVISOR: {
                Supervisor supervisor = (Supervisor)theEObject;
                T result = caseSupervisor(supervisor);
                if (result == null) result = caseSlaveNode(supervisor);
                if (result == null) result = caseInternalComponent(supervisor);
                if (result == null) result = caseComponent(supervisor);
                if (result == null) result = caseCloudElement(supervisor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.NIMBUS: {
                Nimbus nimbus = (Nimbus)theEObject;
                T result = caseNimbus(nimbus);
                if (result == null) result = caseMasterNode(nimbus);
                if (result == null) result = caseInternalComponent(nimbus);
                if (result == null) result = caseComponent(nimbus);
                if (result == null) result = caseCloudElement(nimbus);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.ZOOKEEPER_SERVER: {
                ZookeeperServer zookeeperServer = (ZookeeperServer)theEObject;
                T result = caseZookeeperServer(zookeeperServer);
                if (result == null) result = casePeerNode(zookeeperServer);
                if (result == null) result = caseInternalComponent(zookeeperServer);
                if (result == null) result = caseComponent(zookeeperServer);
                if (result == null) result = caseCloudElement(zookeeperServer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.CLIENT_NODE: {
                ClientNode clientNode = (ClientNode)theEObject;
                T result = caseClientNode(clientNode);
                if (result == null) result = caseInternalComponent(clientNode);
                if (result == null) result = caseComponent(clientNode);
                if (result == null) result = caseCloudElement(clientNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.YARN_RESOURCE_MANAGER: {
                YarnResourceManager yarnResourceManager = (YarnResourceManager)theEObject;
                T result = caseYarnResourceManager(yarnResourceManager);
                if (result == null) result = caseMasterNode(yarnResourceManager);
                if (result == null) result = caseInternalComponent(yarnResourceManager);
                if (result == null) result = caseComponent(yarnResourceManager);
                if (result == null) result = caseCloudElement(yarnResourceManager);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.YARN_NODE_MANAGER: {
                YarnNodeManager yarnNodeManager = (YarnNodeManager)theEObject;
                T result = caseYarnNodeManager(yarnNodeManager);
                if (result == null) result = caseSlaveNode(yarnNodeManager);
                if (result == null) result = caseInternalComponent(yarnNodeManager);
                if (result == null) result = caseComponent(yarnNodeManager);
                if (result == null) result = caseCloudElement(yarnNodeManager);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.HDFS_NAME_NODE: {
                HDFSNameNode hdfsNameNode = (HDFSNameNode)theEObject;
                T result = caseHDFSNameNode(hdfsNameNode);
                if (result == null) result = caseMasterNode(hdfsNameNode);
                if (result == null) result = caseInternalComponent(hdfsNameNode);
                if (result == null) result = caseComponent(hdfsNameNode);
                if (result == null) result = caseCloudElement(hdfsNameNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.HDFS_DATA_NODE: {
                HDFSDataNode hdfsDataNode = (HDFSDataNode)theEObject;
                T result = caseHDFSDataNode(hdfsDataNode);
                if (result == null) result = caseSlaveNode(hdfsDataNode);
                if (result == null) result = caseInternalComponent(hdfsDataNode);
                if (result == null) result = caseComponent(hdfsDataNode);
                if (result == null) result = caseCloudElement(hdfsDataNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.CHEF_RESOURCE: {
                ChefResource chefResource = (ChefResource)theEObject;
                T result = caseChefResource(chefResource);
                if (result == null) result = caseResource(chefResource);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.STORM_CLUSTER: {
                StormCluster stormCluster = (StormCluster)theEObject;
                T result = caseStormCluster(stormCluster);
                if (result == null) result = caseMasterSlavePlatform(stormCluster);
                if (result == null) result = caseInternalComponent(stormCluster);
                if (result == null) result = caseComponent(stormCluster);
                if (result == null) result = caseCloudElement(stormCluster);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.JOB_SUBMISSION: {
                JobSubmission jobSubmission = (JobSubmission)theEObject;
                T result = caseJobSubmission(jobSubmission);
                if (result == null) result = caseCloudElement(jobSubmission);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.MASTER_NODE: {
                MasterNode masterNode = (MasterNode)theEObject;
                T result = caseMasterNode(masterNode);
                if (result == null) result = caseInternalComponent(masterNode);
                if (result == null) result = caseComponent(masterNode);
                if (result == null) result = caseCloudElement(masterNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.SLAVE_NODE: {
                SlaveNode slaveNode = (SlaveNode)theEObject;
                T result = caseSlaveNode(slaveNode);
                if (result == null) result = caseInternalComponent(slaveNode);
                if (result == null) result = caseComponent(slaveNode);
                if (result == null) result = caseCloudElement(slaveNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.ZOOKEEPER_QUORUM: {
                ZookeeperQuorum zookeeperQuorum = (ZookeeperQuorum)theEObject;
                T result = caseZookeeperQuorum(zookeeperQuorum);
                if (result == null) result = casePeersQuorum(zookeeperQuorum);
                if (result == null) result = caseInternalComponent(zookeeperQuorum);
                if (result == null) result = caseComponent(zookeeperQuorum);
                if (result == null) result = caseCloudElement(zookeeperQuorum);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.CASSANDRA_WORKER: {
                CassandraWorker cassandraWorker = (CassandraWorker)theEObject;
                T result = caseCassandraWorker(cassandraWorker);
                if (result == null) result = casePeerNode(cassandraWorker);
                if (result == null) result = caseInternalComponent(cassandraWorker);
                if (result == null) result = caseComponent(cassandraWorker);
                if (result == null) result = caseCloudElement(cassandraWorker);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.ZOOKEEPER_CLUSTER: {
                ZookeeperCluster zookeeperCluster = (ZookeeperCluster)theEObject;
                T result = caseZookeeperCluster(zookeeperCluster);
                if (result == null) result = casePeerToPeerPlatform(zookeeperCluster);
                if (result == null) result = caseInternalComponent(zookeeperCluster);
                if (result == null) result = caseComponent(zookeeperCluster);
                if (result == null) result = caseCloudElement(zookeeperCluster);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.CASSANDRA_CLUSTER: {
                CassandraCluster cassandraCluster = (CassandraCluster)theEObject;
                T result = caseCassandraCluster(cassandraCluster);
                if (result == null) result = casePeerToPeerPlatform(cassandraCluster);
                if (result == null) result = caseInternalComponent(cassandraCluster);
                if (result == null) result = caseComponent(cassandraCluster);
                if (result == null) result = caseCloudElement(cassandraCluster);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.PEER_NODE: {
                PeerNode peerNode = (PeerNode)theEObject;
                T result = casePeerNode(peerNode);
                if (result == null) result = caseInternalComponent(peerNode);
                if (result == null) result = caseComponent(peerNode);
                if (result == null) result = caseCloudElement(peerNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.PEERS_QUORUM: {
                PeersQuorum peersQuorum = (PeersQuorum)theEObject;
                T result = casePeersQuorum(peersQuorum);
                if (result == null) result = caseInternalComponent(peersQuorum);
                if (result == null) result = caseComponent(peersQuorum);
                if (result == null) result = caseCloudElement(peersQuorum);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.PEER_TO_PEER_PLATFORM: {
                PeerToPeerPlatform peerToPeerPlatform = (PeerToPeerPlatform)theEObject;
                T result = casePeerToPeerPlatform(peerToPeerPlatform);
                if (result == null) result = caseInternalComponent(peerToPeerPlatform);
                if (result == null) result = caseComponent(peerToPeerPlatform);
                if (result == null) result = caseCloudElement(peerToPeerPlatform);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.MASTER_SLAVE_PLATFORM: {
                MasterSlavePlatform masterSlavePlatform = (MasterSlavePlatform)theEObject;
                T result = caseMasterSlavePlatform(masterSlavePlatform);
                if (result == null) result = caseInternalComponent(masterSlavePlatform);
                if (result == null) result = caseComponent(masterSlavePlatform);
                if (result == null) result = caseCloudElement(masterSlavePlatform);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.CASSANDRA_QUORUM: {
                CassandraQuorum cassandraQuorum = (CassandraQuorum)theEObject;
                T result = caseCassandraQuorum(cassandraQuorum);
                if (result == null) result = casePeersQuorum(cassandraQuorum);
                if (result == null) result = caseInternalComponent(cassandraQuorum);
                if (result == null) result = caseComponent(cassandraQuorum);
                if (result == null) result = caseCloudElement(cassandraQuorum);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.CASSANDRA_SEED: {
                CassandraSeed cassandraSeed = (CassandraSeed)theEObject;
                T result = caseCassandraSeed(cassandraSeed);
                if (result == null) result = caseInternalComponent(cassandraSeed);
                if (result == null) result = caseComponent(cassandraSeed);
                if (result == null) result = caseCloudElement(cassandraSeed);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.CRONTAB: {
                Crontab crontab = (Crontab)theEObject;
                T result = caseCrontab(crontab);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cloud Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cloud Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCloudElement(CloudElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProperty(Property object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResource(Resource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComponent(Component object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Internal Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Internal Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInternalComponent(InternalComponent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Execution Platform</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Execution Platform</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExecutionPlatform(ExecutionPlatform object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Port</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePort(Port object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Required Port</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Required Port</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRequiredPort(RequiredPort object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Provided Port</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Provided Port</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProvidedPort(ProvidedPort object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Required Execution Platform</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Required Execution Platform</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRequiredExecutionPlatform(RequiredExecutionPlatform object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Provided Execution Platform</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Provided Execution Platform</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProvidedExecutionPlatform(ProvidedExecutionPlatform object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationship(Relationship object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Execution Binding</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Execution Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExecutionBinding(ExecutionBinding object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>External Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>External Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExternalComponent(ExternalComponent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProvider(Provider object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>VM</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>VM</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVM(VM object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DDSM</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DDSM</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDDSM(DDSM object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Supervisor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Supervisor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSupervisor(Supervisor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Nimbus</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nimbus</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNimbus(Nimbus object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Zookeeper Server</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Zookeeper Server</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseZookeeperServer(ZookeeperServer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Client Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Client Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClientNode(ClientNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Yarn Resource Manager</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Yarn Resource Manager</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseYarnResourceManager(YarnResourceManager object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Yarn Node Manager</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Yarn Node Manager</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseYarnNodeManager(YarnNodeManager object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>HDFS Name Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>HDFS Name Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHDFSNameNode(HDFSNameNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>HDFS Data Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>HDFS Data Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHDFSDataNode(HDFSDataNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Chef Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chef Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChefResource(ChefResource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Storm Cluster</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Storm Cluster</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStormCluster(StormCluster object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Job Submission</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Job Submission</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJobSubmission(JobSubmission object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Master Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Master Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMasterNode(MasterNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Slave Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Slave Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSlaveNode(SlaveNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Zookeeper Quorum</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Zookeeper Quorum</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseZookeeperQuorum(ZookeeperQuorum object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cassandra Worker</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cassandra Worker</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCassandraWorker(CassandraWorker object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Zookeeper Cluster</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Zookeeper Cluster</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseZookeeperCluster(ZookeeperCluster object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cassandra Cluster</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cassandra Cluster</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCassandraCluster(CassandraCluster object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Peer Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Peer Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePeerNode(PeerNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Peers Quorum</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Peers Quorum</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePeersQuorum(PeersQuorum object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Peer To Peer Platform</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Peer To Peer Platform</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePeerToPeerPlatform(PeerToPeerPlatform object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Master Slave Platform</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Master Slave Platform</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMasterSlavePlatform(MasterSlavePlatform object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cassandra Quorum</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cassandra Quorum</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCassandraQuorum(CassandraQuorum object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cassandra Seed</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cassandra Seed</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCassandraSeed(CassandraSeed object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Crontab</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Crontab</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCrontab(Crontab object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //DdsmSwitch
