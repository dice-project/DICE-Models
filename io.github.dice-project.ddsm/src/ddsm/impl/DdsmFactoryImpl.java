/**
 */
package ddsm.impl;

import ddsm.*;

import org.eclipse.emf.ecore.EClass;
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
            case DdsmPackage.CLOUD_ELEMENT: return createCloudElement();
            case DdsmPackage.PROPERTY: return createProperty();
            case DdsmPackage.RESOURCE: return createResource();
            case DdsmPackage.COMPONENT: return createComponent();
            case DdsmPackage.INTERNAL_COMPONENT: return createInternalComponent();
            case DdsmPackage.EXECUTION_PLATFORM: return createExecutionPlatform();
            case DdsmPackage.PORT: return createPort();
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
            case DdsmPackage.LIFE_CYCLE: return createLifeCycle();
            case DdsmPackage.CHEF_RECIPE: return createChefRecipe();
            case DdsmPackage.OFFER: return createOffer();
            case DdsmPackage.STORM_SUPERVISOR: return createStormSupervisor();
            case DdsmPackage.MEDIUM_HOST: return createMediumHost();
            case DdsmPackage.SMALL_HOST: return createSmallHost();
            case DdsmPackage.LARGE_HOST: return createLargeHost();
            case DdsmPackage.STORM_NIMBUS: return createStormNimbus();
            case DdsmPackage.ZOOKEEPER: return createZookeeper();
            case DdsmPackage.KAFKA: return createKafka();
            case DdsmPackage.LOAD_BALANCER: return createLoadBalancer();
            case DdsmPackage.CLUSTER: return createCluster();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CloudElement createCloudElement() {
        CloudElementImpl cloudElement = new CloudElementImpl();
        return cloudElement;
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
    public Component createComponent() {
        ComponentImpl component = new ComponentImpl();
        return component;
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
    public ExecutionPlatform createExecutionPlatform() {
        ExecutionPlatformImpl executionPlatform = new ExecutionPlatformImpl();
        return executionPlatform;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port createPort() {
        PortImpl port = new PortImpl();
        return port;
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
    public LifeCycle createLifeCycle() {
        LifeCycleImpl lifeCycle = new LifeCycleImpl();
        return lifeCycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefRecipe createChefRecipe() {
        ChefRecipeImpl chefRecipe = new ChefRecipeImpl();
        return chefRecipe;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Offer createOffer() {
        OfferImpl offer = new OfferImpl();
        return offer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StormSupervisor createStormSupervisor() {
        StormSupervisorImpl stormSupervisor = new StormSupervisorImpl();
        return stormSupervisor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MediumHost createMediumHost() {
        MediumHostImpl mediumHost = new MediumHostImpl();
        return mediumHost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmallHost createSmallHost() {
        SmallHostImpl smallHost = new SmallHostImpl();
        return smallHost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LargeHost createLargeHost() {
        LargeHostImpl largeHost = new LargeHostImpl();
        return largeHost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StormNimbus createStormNimbus() {
        StormNimbusImpl stormNimbus = new StormNimbusImpl();
        return stormNimbus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Zookeeper createZookeeper() {
        ZookeeperImpl zookeeper = new ZookeeperImpl();
        return zookeeper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Kafka createKafka() {
        KafkaImpl kafka = new KafkaImpl();
        return kafka;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoadBalancer createLoadBalancer() {
        LoadBalancerImpl loadBalancer = new LoadBalancerImpl();
        return loadBalancer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Cluster createCluster() {
        ClusterImpl cluster = new ClusterImpl();
        return cluster;
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
