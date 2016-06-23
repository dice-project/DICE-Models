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
            public Adapter caseLifeCycle(LifeCycle object) {
                return createLifeCycleAdapter();
            }
            @Override
            public Adapter caseStormSupervisor(StormSupervisor object) {
                return createStormSupervisorAdapter();
            }
            @Override
            public Adapter caseStormNimbus(StormNimbus object) {
                return createStormNimbusAdapter();
            }
            @Override
            public Adapter caseZookeeper(Zookeeper object) {
                return createZookeeperAdapter();
            }
            @Override
            public Adapter caseKafka(Kafka object) {
                return createKafkaAdapter();
            }
            @Override
            public Adapter caseCluster(Cluster object) {
                return createClusterAdapter();
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
            public Adapter caseScript(Script object) {
                return createScriptAdapter();
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
     * Creates a new adapter for an object of class '{@link ddsm.LifeCycle <em>Life Cycle</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.LifeCycle
     * @generated
     */
    public Adapter createLifeCycleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.StormSupervisor <em>Storm Supervisor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.StormSupervisor
     * @generated
     */
    public Adapter createStormSupervisorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.StormNimbus <em>Storm Nimbus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.StormNimbus
     * @generated
     */
    public Adapter createStormNimbusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.Zookeeper <em>Zookeeper</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.Zookeeper
     * @generated
     */
    public Adapter createZookeeperAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.Kafka <em>Kafka</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.Kafka
     * @generated
     */
    public Adapter createKafkaAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ddsm.Cluster <em>Cluster</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.Cluster
     * @generated
     */
    public Adapter createClusterAdapter() {
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
     * Creates a new adapter for an object of class '{@link ddsm.Script <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ddsm.Script
     * @generated
     */
    public Adapter createScriptAdapter() {
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
