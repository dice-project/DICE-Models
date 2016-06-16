/**
 */
package ddsm.impl;

import ddsm.ChefRecipe;
import ddsm.CloudElement;
import ddsm.Cluster;
import ddsm.Component;
import ddsm.DdsmFactory;
import ddsm.DdsmPackage;
import ddsm.ExecutionBinding;
import ddsm.ExecutionPlatform;
import ddsm.ExternalComponent;
import ddsm.InternalComponent;
import ddsm.Kafka;
import ddsm.LargeHost;
import ddsm.LifeCycle;
import ddsm.LoadBalancer;
import ddsm.MediumHost;
import ddsm.Offer;
import ddsm.Port;
import ddsm.Property;
import ddsm.ProvidedExecutionPlatform;
import ddsm.ProvidedPort;
import ddsm.Provider;
import ddsm.Relationship;
import ddsm.RequiredExecutionPlatform;
import ddsm.RequiredPort;
import ddsm.Resource;
import ddsm.SmallHost;
import ddsm.StormNimbus;
import ddsm.StormSupervisor;
import ddsm.Zookeeper;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DdsmPackageImpl extends EPackageImpl implements DdsmPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cloudElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass componentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass internalComponentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass executionPlatformEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass portEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass requiredPortEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass providedPortEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass requiredExecutionPlatformEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass providedExecutionPlatformEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationshipEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass executionBindingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass externalComponentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass providerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vmEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ddsmEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lifeCycleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass chefRecipeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass offerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stormSupervisorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mediumHostEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smallHostEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass largeHostEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stormNimbusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass zookeeperEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass kafkaEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass loadBalancerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass clusterEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see ddsm.DdsmPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DdsmPackageImpl() {
        super(eNS_URI, DdsmFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link DdsmPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DdsmPackage init() {
        if (isInited) return (DdsmPackage)EPackage.Registry.INSTANCE.getEPackage(DdsmPackage.eNS_URI);

        // Obtain or create and register package
        DdsmPackageImpl theDdsmPackage = (DdsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DdsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DdsmPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theDdsmPackage.createPackageContents();

        // Initialize created meta-data
        theDdsmPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theDdsmPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DdsmPackage.eNS_URI, theDdsmPackage);
        return theDdsmPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCloudElement() {
        return cloudElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCloudElement_Resource() {
        return (EReference)cloudElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCloudElement_Property() {
        return (EReference)cloudElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCloudElement_CloudElementId() {
        return (EAttribute)cloudElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProperty() {
        return propertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Name() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Value() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_PropertyId() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResource() {
        return resourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResource_Name() {
        return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResource_ResourceId() {
        return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResource_Value() {
        return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComponent() {
        return componentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComponent_Providedport() {
        return (EReference)componentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComponent_Providedexecutionplatform() {
        return (EReference)componentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getComponent_Name() {
        return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInternalComponent() {
        return internalComponentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInternalComponent_Requiredport() {
        return (EReference)internalComponentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInternalComponent_Internalcomponent() {
        return (EReference)internalComponentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInternalComponent_Requiredexecutionplatform() {
        return (EReference)internalComponentEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExecutionPlatform() {
        return executionPlatformEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExecutionPlatform_Owner() {
        return (EReference)executionPlatformEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExecutionPlatform_ExecutionPlatformId() {
        return (EAttribute)executionPlatformEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPort() {
        return portEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPort_Component() {
        return (EReference)portEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPort_PortId() {
        return (EAttribute)portEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRequiredPort() {
        return requiredPortEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProvidedPort() {
        return providedPortEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRequiredExecutionPlatform() {
        return requiredExecutionPlatformEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProvidedExecutionPlatform() {
        return providedExecutionPlatformEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProvidedExecutionPlatform_Offer() {
        return (EReference)providedExecutionPlatformEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelationship() {
        return relationshipEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationship_Providedport() {
        return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationship_Requiredport() {
        return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationship_Name() {
        return (EAttribute)relationshipEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationship_RelationshipId() {
        return (EAttribute)relationshipEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExecutionBinding() {
        return executionBindingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExecutionBinding_Requiredexecutionplatform() {
        return (EReference)executionBindingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExecutionBinding_Providedexecutionplatform() {
        return (EReference)executionBindingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExecutionBinding_Name() {
        return (EAttribute)executionBindingEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExecutionBinding_BindingId() {
        return (EAttribute)executionBindingEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExternalComponent() {
        return externalComponentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExternalComponent_Provider() {
        return (EReference)externalComponentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProvider() {
        return providerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProvider_CredentialsPath() {
        return (EAttribute)providerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProvider_Name() {
        return (EAttribute)providerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProvider_Property() {
        return (EReference)providerEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProvider_ProviderId() {
        return (EAttribute)providerEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVM() {
        return vmEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_Is64os() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_Location() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_ImageId() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_MaxCores() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_MaxRam() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_MaxStorage() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_MinCores() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_MinRam() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_MinStorage() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_Os() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_PrivateKey() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_ProviderSpecificTypeName() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_SecurityGroup() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_SshKey() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_PublicAddress() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_Instances() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDDSM() {
        return ddsmEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDDSM_Cloudelement() {
        return (EReference)ddsmEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDDSM_Provider() {
        return (EReference)ddsmEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDDSM_Name() {
        return (EAttribute)ddsmEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDDSM_ModelId() {
        return (EAttribute)ddsmEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLifeCycle() {
        return lifeCycleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLifeCycle_DownloadCommand() {
        return (EAttribute)lifeCycleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLifeCycle_InstallCommand() {
        return (EAttribute)lifeCycleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLifeCycle_StartCommand() {
        return (EAttribute)lifeCycleEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLifeCycle_StopCommand() {
        return (EAttribute)lifeCycleEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getChefRecipe() {
        return chefRecipeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChefRecipe_RecipeUrl() {
        return (EAttribute)chefRecipeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChefRecipe_RecipePath() {
        return (EAttribute)chefRecipeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOffer() {
        return offerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOffer_Name() {
        return (EAttribute)offerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOffer_Value() {
        return (EAttribute)offerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStormSupervisor() {
        return stormSupervisorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMediumHost() {
        return mediumHostEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSmallHost() {
        return smallHostEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLargeHost() {
        return largeHostEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStormNimbus() {
        return stormNimbusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getZookeeper() {
        return zookeeperEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKafka() {
        return kafkaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLoadBalancer() {
        return loadBalancerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCluster() {
        return clusterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCluster_HasVm() {
        return (EReference)clusterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DdsmFactory getDdsmFactory() {
        return (DdsmFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        cloudElementEClass = createEClass(CLOUD_ELEMENT);
        createEReference(cloudElementEClass, CLOUD_ELEMENT__RESOURCE);
        createEReference(cloudElementEClass, CLOUD_ELEMENT__PROPERTY);
        createEAttribute(cloudElementEClass, CLOUD_ELEMENT__CLOUD_ELEMENT_ID);

        propertyEClass = createEClass(PROPERTY);
        createEAttribute(propertyEClass, PROPERTY__NAME);
        createEAttribute(propertyEClass, PROPERTY__VALUE);
        createEAttribute(propertyEClass, PROPERTY__PROPERTY_ID);

        resourceEClass = createEClass(RESOURCE);
        createEAttribute(resourceEClass, RESOURCE__NAME);
        createEAttribute(resourceEClass, RESOURCE__RESOURCE_ID);
        createEAttribute(resourceEClass, RESOURCE__VALUE);

        componentEClass = createEClass(COMPONENT);
        createEReference(componentEClass, COMPONENT__PROVIDEDPORT);
        createEReference(componentEClass, COMPONENT__PROVIDEDEXECUTIONPLATFORM);
        createEAttribute(componentEClass, COMPONENT__NAME);

        internalComponentEClass = createEClass(INTERNAL_COMPONENT);
        createEReference(internalComponentEClass, INTERNAL_COMPONENT__REQUIREDPORT);
        createEReference(internalComponentEClass, INTERNAL_COMPONENT__INTERNALCOMPONENT);
        createEReference(internalComponentEClass, INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM);

        executionPlatformEClass = createEClass(EXECUTION_PLATFORM);
        createEReference(executionPlatformEClass, EXECUTION_PLATFORM__OWNER);
        createEAttribute(executionPlatformEClass, EXECUTION_PLATFORM__EXECUTION_PLATFORM_ID);

        portEClass = createEClass(PORT);
        createEReference(portEClass, PORT__COMPONENT);
        createEAttribute(portEClass, PORT__PORT_ID);

        requiredPortEClass = createEClass(REQUIRED_PORT);

        providedPortEClass = createEClass(PROVIDED_PORT);

        requiredExecutionPlatformEClass = createEClass(REQUIRED_EXECUTION_PLATFORM);

        providedExecutionPlatformEClass = createEClass(PROVIDED_EXECUTION_PLATFORM);
        createEReference(providedExecutionPlatformEClass, PROVIDED_EXECUTION_PLATFORM__OFFER);

        relationshipEClass = createEClass(RELATIONSHIP);
        createEReference(relationshipEClass, RELATIONSHIP__PROVIDEDPORT);
        createEReference(relationshipEClass, RELATIONSHIP__REQUIREDPORT);
        createEAttribute(relationshipEClass, RELATIONSHIP__NAME);
        createEAttribute(relationshipEClass, RELATIONSHIP__RELATIONSHIP_ID);

        executionBindingEClass = createEClass(EXECUTION_BINDING);
        createEReference(executionBindingEClass, EXECUTION_BINDING__REQUIREDEXECUTIONPLATFORM);
        createEReference(executionBindingEClass, EXECUTION_BINDING__PROVIDEDEXECUTIONPLATFORM);
        createEAttribute(executionBindingEClass, EXECUTION_BINDING__NAME);
        createEAttribute(executionBindingEClass, EXECUTION_BINDING__BINDING_ID);

        externalComponentEClass = createEClass(EXTERNAL_COMPONENT);
        createEReference(externalComponentEClass, EXTERNAL_COMPONENT__PROVIDER);

        providerEClass = createEClass(PROVIDER);
        createEAttribute(providerEClass, PROVIDER__CREDENTIALS_PATH);
        createEAttribute(providerEClass, PROVIDER__NAME);
        createEReference(providerEClass, PROVIDER__PROPERTY);
        createEAttribute(providerEClass, PROVIDER__PROVIDER_ID);

        vmEClass = createEClass(VM);
        createEAttribute(vmEClass, VM__IS64OS);
        createEAttribute(vmEClass, VM__LOCATION);
        createEAttribute(vmEClass, VM__IMAGE_ID);
        createEAttribute(vmEClass, VM__MAX_CORES);
        createEAttribute(vmEClass, VM__MAX_RAM);
        createEAttribute(vmEClass, VM__MAX_STORAGE);
        createEAttribute(vmEClass, VM__MIN_CORES);
        createEAttribute(vmEClass, VM__MIN_RAM);
        createEAttribute(vmEClass, VM__MIN_STORAGE);
        createEAttribute(vmEClass, VM__OS);
        createEAttribute(vmEClass, VM__PRIVATE_KEY);
        createEAttribute(vmEClass, VM__PROVIDER_SPECIFIC_TYPE_NAME);
        createEAttribute(vmEClass, VM__SECURITY_GROUP);
        createEAttribute(vmEClass, VM__SSH_KEY);
        createEAttribute(vmEClass, VM__PUBLIC_ADDRESS);
        createEAttribute(vmEClass, VM__INSTANCES);

        ddsmEClass = createEClass(DDSM);
        createEReference(ddsmEClass, DDSM__CLOUDELEMENT);
        createEReference(ddsmEClass, DDSM__PROVIDER);
        createEAttribute(ddsmEClass, DDSM__NAME);
        createEAttribute(ddsmEClass, DDSM__MODEL_ID);

        lifeCycleEClass = createEClass(LIFE_CYCLE);
        createEAttribute(lifeCycleEClass, LIFE_CYCLE__DOWNLOAD_COMMAND);
        createEAttribute(lifeCycleEClass, LIFE_CYCLE__INSTALL_COMMAND);
        createEAttribute(lifeCycleEClass, LIFE_CYCLE__START_COMMAND);
        createEAttribute(lifeCycleEClass, LIFE_CYCLE__STOP_COMMAND);

        chefRecipeEClass = createEClass(CHEF_RECIPE);
        createEAttribute(chefRecipeEClass, CHEF_RECIPE__RECIPE_URL);
        createEAttribute(chefRecipeEClass, CHEF_RECIPE__RECIPE_PATH);

        offerEClass = createEClass(OFFER);
        createEAttribute(offerEClass, OFFER__NAME);
        createEAttribute(offerEClass, OFFER__VALUE);

        stormSupervisorEClass = createEClass(STORM_SUPERVISOR);

        mediumHostEClass = createEClass(MEDIUM_HOST);

        smallHostEClass = createEClass(SMALL_HOST);

        largeHostEClass = createEClass(LARGE_HOST);

        stormNimbusEClass = createEClass(STORM_NIMBUS);

        zookeeperEClass = createEClass(ZOOKEEPER);

        kafkaEClass = createEClass(KAFKA);

        loadBalancerEClass = createEClass(LOAD_BALANCER);

        clusterEClass = createEClass(CLUSTER);
        createEReference(clusterEClass, CLUSTER__HAS_VM);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        componentEClass.getESuperTypes().add(this.getCloudElement());
        internalComponentEClass.getESuperTypes().add(this.getComponent());
        requiredPortEClass.getESuperTypes().add(this.getPort());
        providedPortEClass.getESuperTypes().add(this.getPort());
        requiredExecutionPlatformEClass.getESuperTypes().add(this.getExecutionPlatform());
        providedExecutionPlatformEClass.getESuperTypes().add(this.getExecutionPlatform());
        relationshipEClass.getESuperTypes().add(this.getCloudElement());
        executionBindingEClass.getESuperTypes().add(this.getCloudElement());
        externalComponentEClass.getESuperTypes().add(this.getComponent());
        vmEClass.getESuperTypes().add(this.getExternalComponent());
        lifeCycleEClass.getESuperTypes().add(this.getResource());
        chefRecipeEClass.getESuperTypes().add(this.getResource());
        stormSupervisorEClass.getESuperTypes().add(this.getInternalComponent());
        mediumHostEClass.getESuperTypes().add(this.getVM());
        smallHostEClass.getESuperTypes().add(this.getVM());
        largeHostEClass.getESuperTypes().add(this.getVM());
        stormNimbusEClass.getESuperTypes().add(this.getInternalComponent());
        zookeeperEClass.getESuperTypes().add(this.getInternalComponent());
        kafkaEClass.getESuperTypes().add(this.getInternalComponent());
        loadBalancerEClass.getESuperTypes().add(this.getExternalComponent());
        clusterEClass.getESuperTypes().add(this.getCloudElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(cloudElementEClass, CloudElement.class, "CloudElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCloudElement_Resource(), this.getResource(), null, "resource", null, 0, -1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCloudElement_Property(), this.getProperty(), null, "property", null, 0, -1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCloudElement_CloudElementId(), ecorePackage.getEString(), "cloudElementId", null, 0, 1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_PropertyId(), ecorePackage.getEString(), "propertyId", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResource_ResourceId(), ecorePackage.getEString(), "resourceId", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResource_Value(), ecorePackage.getEString(), "value", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComponent_Providedport(), this.getProvidedPort(), null, "providedport", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComponent_Providedexecutionplatform(), this.getProvidedExecutionPlatform(), null, "providedexecutionplatform", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(internalComponentEClass, InternalComponent.class, "InternalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInternalComponent_Requiredport(), this.getRequiredPort(), null, "requiredport", null, 0, -1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInternalComponent_Internalcomponent(), this.getInternalComponent(), null, "internalcomponent", null, 0, -1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInternalComponent_Requiredexecutionplatform(), this.getRequiredExecutionPlatform(), null, "requiredexecutionplatform", null, 0, -1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(executionPlatformEClass, ExecutionPlatform.class, "ExecutionPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExecutionPlatform_Owner(), this.getComponent(), null, "owner", null, 0, 1, ExecutionPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExecutionPlatform_ExecutionPlatformId(), ecorePackage.getEString(), "executionPlatformId", null, 0, 1, ExecutionPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPort_Component(), this.getComponent(), null, "component", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPort_PortId(), ecorePackage.getEString(), "portId", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(requiredPortEClass, RequiredPort.class, "RequiredPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(providedPortEClass, ProvidedPort.class, "ProvidedPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(requiredExecutionPlatformEClass, RequiredExecutionPlatform.class, "RequiredExecutionPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(providedExecutionPlatformEClass, ProvidedExecutionPlatform.class, "ProvidedExecutionPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProvidedExecutionPlatform_Offer(), this.getOffer(), null, "offer", null, 0, -1, ProvidedExecutionPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRelationship_Providedport(), this.getProvidedPort(), null, "providedport", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationship_Requiredport(), this.getRequiredPort(), null, "requiredport", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRelationship_Name(), ecorePackage.getEString(), "name", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRelationship_RelationshipId(), ecorePackage.getEString(), "relationshipId", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(executionBindingEClass, ExecutionBinding.class, "ExecutionBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExecutionBinding_Requiredexecutionplatform(), this.getRequiredExecutionPlatform(), null, "requiredexecutionplatform", null, 0, 1, ExecutionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExecutionBinding_Providedexecutionplatform(), this.getProvidedExecutionPlatform(), null, "providedexecutionplatform", null, 0, 1, ExecutionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExecutionBinding_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExecutionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExecutionBinding_BindingId(), ecorePackage.getEString(), "bindingId", null, 0, 1, ExecutionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(externalComponentEClass, ExternalComponent.class, "ExternalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExternalComponent_Provider(), this.getProvider(), null, "provider", null, 1, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProvider_CredentialsPath(), ecorePackage.getEString(), "credentialsPath", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProvider_Name(), ecorePackage.getEString(), "name", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProvider_Property(), this.getProperty(), null, "property", null, 0, -1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProvider_ProviderId(), ecorePackage.getEString(), "providerId", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vmEClass, ddsm.VM.class, "VM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getVM_Is64os(), ecorePackage.getEString(), "is64os", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_Location(), ecorePackage.getEString(), "location", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_ImageId(), ecorePackage.getEString(), "imageId", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_MaxCores(), ecorePackage.getEString(), "maxCores", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_MaxRam(), ecorePackage.getEString(), "maxRam", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_MaxStorage(), ecorePackage.getEString(), "maxStorage", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_MinCores(), ecorePackage.getEString(), "minCores", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_MinRam(), ecorePackage.getEString(), "minRam", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_MinStorage(), ecorePackage.getEString(), "minStorage", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_Os(), ecorePackage.getEString(), "os", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_PrivateKey(), ecorePackage.getEString(), "privateKey", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_ProviderSpecificTypeName(), ecorePackage.getEString(), "providerSpecificTypeName", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_SecurityGroup(), ecorePackage.getEString(), "securityGroup", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_SshKey(), ecorePackage.getEString(), "sshKey", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_PublicAddress(), ecorePackage.getEString(), "publicAddress", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_Instances(), ecorePackage.getEString(), "instances", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ddsmEClass, ddsm.DDSM.class, "DDSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDDSM_Cloudelement(), this.getCloudElement(), null, "cloudelement", null, 0, -1, ddsm.DDSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDDSM_Provider(), this.getProvider(), null, "provider", null, 0, -1, ddsm.DDSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDDSM_Name(), ecorePackage.getEString(), "name", null, 0, 1, ddsm.DDSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDDSM_ModelId(), ecorePackage.getEString(), "modelId", null, 0, 1, ddsm.DDSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(lifeCycleEClass, LifeCycle.class, "LifeCycle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLifeCycle_DownloadCommand(), ecorePackage.getEString(), "downloadCommand", null, 0, 1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLifeCycle_InstallCommand(), ecorePackage.getEString(), "installCommand", null, 0, 1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLifeCycle_StartCommand(), ecorePackage.getEString(), "startCommand", null, 0, 1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLifeCycle_StopCommand(), ecorePackage.getEString(), "stopCommand", null, 0, 1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(chefRecipeEClass, ChefRecipe.class, "ChefRecipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getChefRecipe_RecipeUrl(), ecorePackage.getEString(), "recipeUrl", null, 0, 1, ChefRecipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChefRecipe_RecipePath(), ecorePackage.getEString(), "recipePath", null, 0, 1, ChefRecipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(offerEClass, Offer.class, "Offer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOffer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOffer_Value(), ecorePackage.getEString(), "value", null, 0, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stormSupervisorEClass, StormSupervisor.class, "StormSupervisor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(mediumHostEClass, MediumHost.class, "MediumHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(smallHostEClass, SmallHost.class, "SmallHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(largeHostEClass, LargeHost.class, "LargeHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(stormNimbusEClass, StormNimbus.class, "StormNimbus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(zookeeperEClass, Zookeeper.class, "Zookeeper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(kafkaEClass, Kafka.class, "Kafka", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(loadBalancerEClass, LoadBalancer.class, "LoadBalancer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCluster_HasVm(), this.getVM(), null, "hasVm", null, 0, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //DdsmPackageImpl
