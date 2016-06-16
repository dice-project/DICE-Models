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
     * Returns a new object of class '<em>Cloud Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cloud Element</em>'.
     * @generated
     */
    CloudElement createCloudElement();

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
     * Returns a new object of class '<em>Component</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Component</em>'.
     * @generated
     */
    Component createComponent();

    /**
     * Returns a new object of class '<em>Internal Component</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Internal Component</em>'.
     * @generated
     */
    InternalComponent createInternalComponent();

    /**
     * Returns a new object of class '<em>Execution Platform</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Execution Platform</em>'.
     * @generated
     */
    ExecutionPlatform createExecutionPlatform();

    /**
     * Returns a new object of class '<em>Port</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Port</em>'.
     * @generated
     */
    Port createPort();

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
     * Returns a new object of class '<em>Life Cycle</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Life Cycle</em>'.
     * @generated
     */
    LifeCycle createLifeCycle();

    /**
     * Returns a new object of class '<em>Chef Recipe</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Chef Recipe</em>'.
     * @generated
     */
    ChefRecipe createChefRecipe();

    /**
     * Returns a new object of class '<em>Offer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Offer</em>'.
     * @generated
     */
    Offer createOffer();

    /**
     * Returns a new object of class '<em>Storm Supervisor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Storm Supervisor</em>'.
     * @generated
     */
    StormSupervisor createStormSupervisor();

    /**
     * Returns a new object of class '<em>Medium Host</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Medium Host</em>'.
     * @generated
     */
    MediumHost createMediumHost();

    /**
     * Returns a new object of class '<em>Small Host</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Small Host</em>'.
     * @generated
     */
    SmallHost createSmallHost();

    /**
     * Returns a new object of class '<em>Large Host</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Large Host</em>'.
     * @generated
     */
    LargeHost createLargeHost();

    /**
     * Returns a new object of class '<em>Storm Nimbus</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Storm Nimbus</em>'.
     * @generated
     */
    StormNimbus createStormNimbus();

    /**
     * Returns a new object of class '<em>Zookeeper</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Zookeeper</em>'.
     * @generated
     */
    Zookeeper createZookeeper();

    /**
     * Returns a new object of class '<em>Kafka</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Kafka</em>'.
     * @generated
     */
    Kafka createKafka();

    /**
     * Returns a new object of class '<em>Load Balancer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Balancer</em>'.
     * @generated
     */
    LoadBalancer createLoadBalancer();

    /**
     * Returns a new object of class '<em>Cluster</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cluster</em>'.
     * @generated
     */
    Cluster createCluster();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DdsmPackage getDdsmPackage();

} //DdsmFactory
