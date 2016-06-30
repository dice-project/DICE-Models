/**
 */
package ddsm.impl;

import ddsm.ClientNode;
import ddsm.CloudElement;
import ddsm.Cluster;
import ddsm.Component;
import ddsm.DdsmFactory;
import ddsm.DdsmPackage;
import ddsm.ExecutionBinding;
import ddsm.ExecutionPlatform;
import ddsm.ExternalComponent;
import ddsm.HDFSDataNode;
import ddsm.HDFSNameNode;
import ddsm.InternalComponent;
import ddsm.Kafka;
import ddsm.LifeCycle;
import ddsm.Port;
import ddsm.Property;
import ddsm.ProvidedExecutionPlatform;
import ddsm.ProvidedPort;
import ddsm.Provider;
import ddsm.ProviderType;
import ddsm.Relationship;
import ddsm.RequiredExecutionPlatform;
import ddsm.RequiredPort;
import ddsm.Resource;
import ddsm.Script;
import ddsm.StormNimbus;
import ddsm.StormSupervisor;
import ddsm.VMSize;
import ddsm.YarnNodeManager;
import ddsm.YarnResourceManager;
import ddsm.Zookeeper;

import ddsm.util.DdsmValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
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
    private EClass stormSupervisorEClass = null;

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
    private EClass clusterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass clientNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass yarnResourceManagerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass yarnNodeManagerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hdfsNameNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hdfsDataNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum vmSizeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum providerTypeEEnum = null;

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

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theDdsmPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return DdsmValidator.INSTANCE;
                 }
             });

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
    public EAttribute getCloudElement_ElementId() {
        return (EAttribute)cloudElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCloudElement_Description() {
        return (EAttribute)cloudElementEClass.getEStructuralFeatures().get(3);
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
    public EAttribute getProperty_Value() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_PropertyId() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
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
    public EAttribute getResource_ResourceId() {
        return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getResource_Scripts() {
        return (EReference)resourceEClass.getEStructuralFeatures().get(1);
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
    public EAttribute getInternalComponent_PublicPorts() {
        return (EAttribute)internalComponentEClass.getEStructuralFeatures().get(3);
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
    public EClass getPort() {
        return portEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPort_IsLocal() {
        return (EAttribute)portEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPort_PortNumber() {
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
    public EAttribute getRequiredPort_IsMandatory() {
        return (EAttribute)requiredPortEClass.getEStructuralFeatures().get(0);
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
    public EReference getProvidedPort_Owner() {
        return (EReference)providedPortEClass.getEStructuralFeatures().get(0);
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
    public EAttribute getRequiredExecutionPlatform_IsMandatory() {
        return (EAttribute)requiredExecutionPlatformEClass.getEStructuralFeatures().get(0);
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
    public EReference getProvidedExecutionPlatform_Owner() {
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
    public EAttribute getExternalComponent_Location() {
        return (EAttribute)externalComponentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExternalComponent_Login() {
        return (EAttribute)externalComponentEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExternalComponent_Password() {
        return (EAttribute)externalComponentEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExternalComponent_Region() {
        return (EAttribute)externalComponentEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExternalComponent_ServiceType() {
        return (EAttribute)externalComponentEClass.getEStructuralFeatures().get(5);
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
    public EAttribute getProvider_Type() {
        return (EAttribute)providerEClass.getEStructuralFeatures().get(1);
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
    public EAttribute getVM_ImageId() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_MaxCores() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_MaxRam() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_MaxStorage() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_MinCores() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_MinRam() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_MinStorage() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_Os() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_PrivateKey() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_ProviderSpecificTypeName() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_SecurityGroup() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_SshKey() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_PublicAddress() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_Instances() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVM_GenericSize() {
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
    public EAttribute getDDSM_ModelId() {
        return (EAttribute)ddsmEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDDSM_Description() {
        return (EAttribute)ddsmEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDDSM_Properties() {
        return (EReference)ddsmEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDDSM_Resources() {
        return (EReference)ddsmEClass.getEStructuralFeatures().get(4);
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
    public EReference getLifeCycle_DownloadCommand() {
        return (EReference)lifeCycleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLifeCycle_InstallCommand() {
        return (EReference)lifeCycleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLifeCycle_StartCommand() {
        return (EReference)lifeCycleEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLifeCycle_StopCommand() {
        return (EReference)lifeCycleEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLifeCycle_PreconfigureCommand() {
        return (EReference)lifeCycleEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLifeCycle_CreateCommand() {
        return (EReference)lifeCycleEClass.getEStructuralFeatures().get(5);
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
    public EClass getClientNode() {
        return clientNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClientNode_Type() {
        return (EAttribute)clientNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClientNode_ArtifactUrl() {
        return (EAttribute)clientNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClientNode_MainClass() {
        return (EAttribute)clientNodeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getYarnResourceManager() {
        return yarnResourceManagerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getYarnNodeManager() {
        return yarnNodeManagerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHDFSNameNode() {
        return hdfsNameNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHDFSDataNode() {
        return hdfsDataNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScript() {
        return scriptEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScript_ScriptId() {
        return (EAttribute)scriptEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScript_ScriptUri() {
        return (EAttribute)scriptEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getVMSize() {
        return vmSizeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getProviderType() {
        return providerTypeEEnum;
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
        createEAttribute(cloudElementEClass, CLOUD_ELEMENT__ELEMENT_ID);
        createEAttribute(cloudElementEClass, CLOUD_ELEMENT__DESCRIPTION);

        propertyEClass = createEClass(PROPERTY);
        createEAttribute(propertyEClass, PROPERTY__PROPERTY_ID);
        createEAttribute(propertyEClass, PROPERTY__VALUE);

        resourceEClass = createEClass(RESOURCE);
        createEAttribute(resourceEClass, RESOURCE__RESOURCE_ID);
        createEReference(resourceEClass, RESOURCE__SCRIPTS);

        componentEClass = createEClass(COMPONENT);
        createEReference(componentEClass, COMPONENT__PROVIDEDPORT);
        createEReference(componentEClass, COMPONENT__PROVIDEDEXECUTIONPLATFORM);

        internalComponentEClass = createEClass(INTERNAL_COMPONENT);
        createEReference(internalComponentEClass, INTERNAL_COMPONENT__REQUIREDPORT);
        createEReference(internalComponentEClass, INTERNAL_COMPONENT__INTERNALCOMPONENT);
        createEReference(internalComponentEClass, INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM);
        createEAttribute(internalComponentEClass, INTERNAL_COMPONENT__PUBLIC_PORTS);

        executionPlatformEClass = createEClass(EXECUTION_PLATFORM);

        portEClass = createEClass(PORT);
        createEAttribute(portEClass, PORT__IS_LOCAL);
        createEAttribute(portEClass, PORT__PORT_NUMBER);

        requiredPortEClass = createEClass(REQUIRED_PORT);
        createEAttribute(requiredPortEClass, REQUIRED_PORT__IS_MANDATORY);

        providedPortEClass = createEClass(PROVIDED_PORT);
        createEReference(providedPortEClass, PROVIDED_PORT__OWNER);

        requiredExecutionPlatformEClass = createEClass(REQUIRED_EXECUTION_PLATFORM);
        createEAttribute(requiredExecutionPlatformEClass, REQUIRED_EXECUTION_PLATFORM__IS_MANDATORY);

        providedExecutionPlatformEClass = createEClass(PROVIDED_EXECUTION_PLATFORM);
        createEReference(providedExecutionPlatformEClass, PROVIDED_EXECUTION_PLATFORM__OWNER);

        relationshipEClass = createEClass(RELATIONSHIP);
        createEReference(relationshipEClass, RELATIONSHIP__PROVIDEDPORT);
        createEReference(relationshipEClass, RELATIONSHIP__REQUIREDPORT);

        executionBindingEClass = createEClass(EXECUTION_BINDING);
        createEReference(executionBindingEClass, EXECUTION_BINDING__REQUIREDEXECUTIONPLATFORM);
        createEReference(executionBindingEClass, EXECUTION_BINDING__PROVIDEDEXECUTIONPLATFORM);

        externalComponentEClass = createEClass(EXTERNAL_COMPONENT);
        createEReference(externalComponentEClass, EXTERNAL_COMPONENT__PROVIDER);
        createEAttribute(externalComponentEClass, EXTERNAL_COMPONENT__LOCATION);
        createEAttribute(externalComponentEClass, EXTERNAL_COMPONENT__LOGIN);
        createEAttribute(externalComponentEClass, EXTERNAL_COMPONENT__PASSWORD);
        createEAttribute(externalComponentEClass, EXTERNAL_COMPONENT__REGION);
        createEAttribute(externalComponentEClass, EXTERNAL_COMPONENT__SERVICE_TYPE);

        providerEClass = createEClass(PROVIDER);
        createEAttribute(providerEClass, PROVIDER__CREDENTIALS_PATH);
        createEAttribute(providerEClass, PROVIDER__TYPE);

        vmEClass = createEClass(VM);
        createEAttribute(vmEClass, VM__IS64OS);
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
        createEAttribute(vmEClass, VM__GENERIC_SIZE);

        ddsmEClass = createEClass(DDSM);
        createEReference(ddsmEClass, DDSM__CLOUDELEMENT);
        createEAttribute(ddsmEClass, DDSM__MODEL_ID);
        createEAttribute(ddsmEClass, DDSM__DESCRIPTION);
        createEReference(ddsmEClass, DDSM__PROPERTIES);
        createEReference(ddsmEClass, DDSM__RESOURCES);

        lifeCycleEClass = createEClass(LIFE_CYCLE);
        createEReference(lifeCycleEClass, LIFE_CYCLE__DOWNLOAD_COMMAND);
        createEReference(lifeCycleEClass, LIFE_CYCLE__INSTALL_COMMAND);
        createEReference(lifeCycleEClass, LIFE_CYCLE__START_COMMAND);
        createEReference(lifeCycleEClass, LIFE_CYCLE__STOP_COMMAND);
        createEReference(lifeCycleEClass, LIFE_CYCLE__PRECONFIGURE_COMMAND);
        createEReference(lifeCycleEClass, LIFE_CYCLE__CREATE_COMMAND);

        stormSupervisorEClass = createEClass(STORM_SUPERVISOR);

        stormNimbusEClass = createEClass(STORM_NIMBUS);

        zookeeperEClass = createEClass(ZOOKEEPER);

        kafkaEClass = createEClass(KAFKA);

        clusterEClass = createEClass(CLUSTER);
        createEReference(clusterEClass, CLUSTER__HAS_VM);

        clientNodeEClass = createEClass(CLIENT_NODE);
        createEAttribute(clientNodeEClass, CLIENT_NODE__TYPE);
        createEAttribute(clientNodeEClass, CLIENT_NODE__ARTIFACT_URL);
        createEAttribute(clientNodeEClass, CLIENT_NODE__MAIN_CLASS);

        yarnResourceManagerEClass = createEClass(YARN_RESOURCE_MANAGER);

        yarnNodeManagerEClass = createEClass(YARN_NODE_MANAGER);

        hdfsNameNodeEClass = createEClass(HDFS_NAME_NODE);

        hdfsDataNodeEClass = createEClass(HDFS_DATA_NODE);

        scriptEClass = createEClass(SCRIPT);
        createEAttribute(scriptEClass, SCRIPT__SCRIPT_ID);
        createEAttribute(scriptEClass, SCRIPT__SCRIPT_URI);

        // Create enums
        vmSizeEEnum = createEEnum(VM_SIZE);
        providerTypeEEnum = createEEnum(PROVIDER_TYPE);
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
        executionPlatformEClass.getESuperTypes().add(this.getCloudElement());
        portEClass.getESuperTypes().add(this.getCloudElement());
        requiredPortEClass.getESuperTypes().add(this.getPort());
        providedPortEClass.getESuperTypes().add(this.getPort());
        requiredExecutionPlatformEClass.getESuperTypes().add(this.getExecutionPlatform());
        providedExecutionPlatformEClass.getESuperTypes().add(this.getExecutionPlatform());
        relationshipEClass.getESuperTypes().add(this.getCloudElement());
        executionBindingEClass.getESuperTypes().add(this.getCloudElement());
        externalComponentEClass.getESuperTypes().add(this.getComponent());
        providerEClass.getESuperTypes().add(this.getCloudElement());
        vmEClass.getESuperTypes().add(this.getExternalComponent());
        lifeCycleEClass.getESuperTypes().add(this.getResource());
        stormSupervisorEClass.getESuperTypes().add(this.getInternalComponent());
        stormNimbusEClass.getESuperTypes().add(this.getInternalComponent());
        zookeeperEClass.getESuperTypes().add(this.getInternalComponent());
        kafkaEClass.getESuperTypes().add(this.getInternalComponent());
        clusterEClass.getESuperTypes().add(this.getExternalComponent());
        clientNodeEClass.getESuperTypes().add(this.getInternalComponent());
        yarnResourceManagerEClass.getESuperTypes().add(this.getInternalComponent());
        yarnNodeManagerEClass.getESuperTypes().add(this.getInternalComponent());
        hdfsNameNodeEClass.getESuperTypes().add(this.getInternalComponent());
        hdfsDataNodeEClass.getESuperTypes().add(this.getInternalComponent());

        // Initialize classes, features, and operations; add parameters
        initEClass(cloudElementEClass, CloudElement.class, "CloudElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCloudElement_Resource(), this.getResource(), null, "resource", null, 0, -1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCloudElement_Property(), this.getProperty(), null, "property", null, 0, -1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCloudElement_ElementId(), ecorePackage.getEString(), "elementId", null, 1, 1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCloudElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProperty_PropertyId(), ecorePackage.getEString(), "propertyId", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getResource_ResourceId(), ecorePackage.getEString(), "resourceId", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getResource_Scripts(), this.getScript(), null, "scripts", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComponent_Providedport(), this.getProvidedPort(), null, "providedport", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComponent_Providedexecutionplatform(), this.getProvidedExecutionPlatform(), null, "providedexecutionplatform", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(internalComponentEClass, InternalComponent.class, "InternalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInternalComponent_Requiredport(), this.getRequiredPort(), null, "requiredport", null, 0, -1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInternalComponent_Internalcomponent(), this.getInternalComponent(), null, "internalcomponent", null, 0, -1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInternalComponent_Requiredexecutionplatform(), this.getRequiredExecutionPlatform(), null, "requiredexecutionplatform", null, 0, -1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInternalComponent_PublicPorts(), ecorePackage.getEIntegerObject(), "publicPorts", "0", 0, -1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(executionPlatformEClass, ExecutionPlatform.class, "ExecutionPlatform", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPort_IsLocal(), ecorePackage.getEBoolean(), "isLocal", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPort_PortNumber(), ecorePackage.getEString(), "portNumber", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(requiredPortEClass, RequiredPort.class, "RequiredPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRequiredPort_IsMandatory(), ecorePackage.getEBoolean(), "isMandatory", null, 0, 1, RequiredPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(providedPortEClass, ProvidedPort.class, "ProvidedPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProvidedPort_Owner(), this.getComponent(), null, "owner", null, 1, 1, ProvidedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(requiredExecutionPlatformEClass, RequiredExecutionPlatform.class, "RequiredExecutionPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRequiredExecutionPlatform_IsMandatory(), ecorePackage.getEBoolean(), "isMandatory", null, 0, 1, RequiredExecutionPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(providedExecutionPlatformEClass, ProvidedExecutionPlatform.class, "ProvidedExecutionPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProvidedExecutionPlatform_Owner(), this.getComponent(), null, "owner", null, 1, 1, ProvidedExecutionPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRelationship_Providedport(), this.getProvidedPort(), null, "providedport", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationship_Requiredport(), this.getRequiredPort(), null, "requiredport", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(executionBindingEClass, ExecutionBinding.class, "ExecutionBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExecutionBinding_Requiredexecutionplatform(), this.getRequiredExecutionPlatform(), null, "requiredexecutionplatform", null, 0, 1, ExecutionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExecutionBinding_Providedexecutionplatform(), this.getProvidedExecutionPlatform(), null, "providedexecutionplatform", null, 0, 1, ExecutionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(externalComponentEClass, ExternalComponent.class, "ExternalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExternalComponent_Provider(), this.getProvider(), null, "provider", null, 1, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExternalComponent_Location(), ecorePackage.getEString(), "location", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExternalComponent_Login(), ecorePackage.getEString(), "login", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExternalComponent_Password(), ecorePackage.getEString(), "password", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExternalComponent_Region(), ecorePackage.getEString(), "region", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExternalComponent_ServiceType(), ecorePackage.getEString(), "serviceType", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProvider_CredentialsPath(), ecorePackage.getEString(), "credentialsPath", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProvider_Type(), this.getProviderType(), "type", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vmEClass, ddsm.VM.class, "VM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getVM_Is64os(), ecorePackage.getEString(), "is64os", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
        initEAttribute(getVM_Instances(), ecorePackage.getEIntegerObject(), "instances", "1", 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_GenericSize(), this.getVMSize(), "genericSize", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ddsmEClass, ddsm.DDSM.class, "DDSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDDSM_Cloudelement(), this.getCloudElement(), null, "cloudelement", null, 0, -1, ddsm.DDSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDDSM_ModelId(), ecorePackage.getEString(), "modelId", null, 0, 1, ddsm.DDSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDDSM_Description(), ecorePackage.getEString(), "description", null, 0, 1, ddsm.DDSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDDSM_Properties(), this.getProperty(), null, "properties", null, 0, -1, ddsm.DDSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDDSM_Resources(), this.getResource(), null, "resources", null, 0, -1, ddsm.DDSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(lifeCycleEClass, LifeCycle.class, "LifeCycle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLifeCycle_DownloadCommand(), this.getScript(), null, "downloadCommand", null, 0, 1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLifeCycle_InstallCommand(), this.getScript(), null, "installCommand", null, 0, 1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLifeCycle_StartCommand(), this.getScript(), null, "startCommand", null, 0, 1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLifeCycle_StopCommand(), this.getScript(), null, "stopCommand", null, 0, 1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLifeCycle_PreconfigureCommand(), this.getScript(), null, "preconfigureCommand", null, 0, 1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLifeCycle_CreateCommand(), this.getScript(), null, "createCommand", null, 0, 1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stormSupervisorEClass, StormSupervisor.class, "StormSupervisor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(stormNimbusEClass, StormNimbus.class, "StormNimbus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(zookeeperEClass, Zookeeper.class, "Zookeeper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(kafkaEClass, Kafka.class, "Kafka", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCluster_HasVm(), this.getVM(), null, "hasVm", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(clientNodeEClass, ClientNode.class, "ClientNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getClientNode_Type(), ecorePackage.getEString(), "type", null, 1, 1, ClientNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getClientNode_ArtifactUrl(), ecorePackage.getEString(), "artifactUrl", null, 0, 1, ClientNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getClientNode_MainClass(), ecorePackage.getEString(), "mainClass", null, 0, 1, ClientNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(yarnResourceManagerEClass, YarnResourceManager.class, "YarnResourceManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(yarnNodeManagerEClass, YarnNodeManager.class, "YarnNodeManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(hdfsNameNodeEClass, HDFSNameNode.class, "HDFSNameNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(hdfsDataNodeEClass, HDFSDataNode.class, "HDFSDataNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getScript_ScriptId(), ecorePackage.getEString(), "scriptId", null, 1, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScript_ScriptUri(), ecorePackage.getEString(), "scriptUri", null, 1, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(vmSizeEEnum, VMSize.class, "VMSize");
        addEEnumLiteral(vmSizeEEnum, VMSize.SMALL);
        addEEnumLiteral(vmSizeEEnum, VMSize.MEDIUM);
        addEEnumLiteral(vmSizeEEnum, VMSize.LARGE);

        initEEnum(providerTypeEEnum, ProviderType.class, "ProviderType");
        addEEnumLiteral(providerTypeEEnum, ProviderType.FLEXIANT);
        addEEnumLiteral(providerTypeEEnum, ProviderType.OPENSTACK);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://es.unizar.disco/dice/profiles/generator
        createGeneratorAnnotations();
        // http://www.eclipse.org/OCL/Import
        createImportAnnotations();
        // http://www.eclipse.org/emf/2002/Ecore
        createEcoreAnnotations();
        // http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
        createPivotAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://es.unizar.disco/dice/profiles/generator</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createGeneratorAnnotations() {
        String source = "http://es.unizar.disco/dice/profiles/generator";	
        addAnnotation
          (this, 
           source, 
           new String[] {
           });	
        addAnnotation
          (cloudElementEClass, 
           source, 
           new String[] {
             "description", "Abstract class, inherit from MODACloudsML which capture common concepts shared by \nmost of the classes specified in meta-model. For example a class extending CloudElement can have Properties and \nResouces associated."
           });	
        addAnnotation
          (propertyEClass, 
           source, 
           new String[] {
             "description", "Represents a generic properties, specified by a pair of <id,value> and owned by a CloudElement.\n"
           });	
        addAnnotation
          (resourceEClass, 
           source, 
           new String[] {
             "description", "Represents a resource associated to an element which might be used to support the deployment and configuration of the such element. \nFor instance a Resource may detail the deployment script of a CloudElement (e.g. an InternalComponent or an ExecutionBinding)."
           });	
        addAnnotation
          (componentEClass, 
           source, 
           new String[] {
             "description", "Inherit from MODACloudsML, it represents a reusable type of cloud component (e.g. a virtual machine or an application)."
           });	
        addAnnotation
          (internalComponentEClass, 
           source, 
           new String[] {
             "description", "Inherit from MODACloudsML, this represents a component that is managed by the application provider,\nor the developer (e.g. a Big Data application)."
           });	
        addAnnotation
          (executionPlatformEClass, 
           source, 
           new String[] {
             "description", "Inherited from MODACloudsML, it represents an generic hosting interface of a Component."
           });	
        addAnnotation
          (portEClass, 
           source, 
           new String[] {
             "description", "Represents an interface (provided or required) of a Component.\nIt is tipically used to link components in order to enable communication."
           });	
        addAnnotation
          (requiredPortEClass, 
           source, 
           new String[] {
             "description", "A specific type of Port which specify that a Component requires to \ncommunicate and consume a features (e.g.access to a database) provided by another Component."
           });	
        addAnnotation
          (providedPortEClass, 
           source, 
           new String[] {
             "description", "A specific type of Port which specify that a Component provides features (e.g.access to a database) which can be accessed by another Component."
           });	
        addAnnotation
          (requiredExecutionPlatformEClass, 
           source, 
           new String[] {
             "description", "A specific type of ExecutionPlatform providing hosting facilities (e.g. an execution environment, like a VM or a web server) to a Component."
           });	
        addAnnotation
          (providedExecutionPlatformEClass, 
           source, 
           new String[] {
             "description", "A specific type of ExecutionPlatform which requires hosting (e.g. a Big Data application requires a Big Data platform) from a Component."
           });	
        addAnnotation
          (relationshipEClass, 
           source, 
           new String[] {
             "description", "test generation"
           });	
        addAnnotation
          (executionBindingEClass, 
           source, 
           new String[] {
             "description", "Represents a binding between a RequiredExecutionPlatform and a ProvidedExecutionPlatform of two components, meaning that the first component will be hosted on the second one according to the specified binding."
           });	
        addAnnotation
          (externalComponentEClass, 
           source, 
           new String[] {
             "description", "Inherit from MODACloudsML, this represents a component that is managed by an external provider, for instance a AWS EC2 virtual machine."
           });	
        addAnnotation
          (providerEClass, 
           source, 
           new String[] {
             "description", "Represents a generic provider of Clouds services."
           });	
        addAnnotation
          (vmEClass, 
           source, 
           new String[] {
             "description", "It is an specific ExternalComponent representing the well know concept of virtual machine.\nIt is possible to the size of the VM in terms of RAM and CPU and Storage size ranges, \nthe preferred operating system, the enabled ports, the desired public address and the number of executing instances,\nor the replication factor. It as been customized in the context of DICE to be able to specify DICE specific type of VM."
           });	
        addAnnotation
          (ddsmEClass, 
           source, 
           new String[] {
             "description", "test generation"
           });	
        addAnnotation
          (lifeCycleEClass, 
           source, 
           new String[] {
             "description", "test generation"
           });	
        addAnnotation
          (stormSupervisorEClass, 
           source, 
           new String[] {
             "description", "Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of the Storm supervisor slave process."
           });	
        addAnnotation
          (stormNimbusEClass, 
           source, 
           new String[] {
             "description", "Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of the Storm nimbus master process."
           });	
        addAnnotation
          (zookeeperEClass, 
           source, 
           new String[] {
             "description", "Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of a Zookeeper cluster."
           });	
        addAnnotation
          (kafkaEClass, 
           source, 
           new String[] {
             "description", "Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of a Kafka cluster."
           });	
        addAnnotation
          (clusterEClass, 
           source, 
           new String[] {
             "description", "Inherited from MODACloudsML, it represents a collection of virtual machines on a particular Provider. One Provider can host several Clusters.."
           });	
        addAnnotation
          (clientNodeEClass, 
           source, 
           new String[] {
             "description", "test generation"
           });	
        addAnnotation
          (yarnResourceManagerEClass, 
           source, 
           new String[] {
             "description", "Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of a the YARN ResourceManager master process."
           });	
        addAnnotation
          (yarnNodeManagerEClass, 
           source, 
           new String[] {
             "description", "Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of a the YARN  NodeManager slave process."
           });	
        addAnnotation
          (hdfsNameNodeEClass, 
           source, 
           new String[] {
             "description", "Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of a the YARN ResourceManager master process."
           });	
        addAnnotation
          (hdfsDataNodeEClass, 
           source, 
           new String[] {
             "description", "Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of a the YARN ResourceManager master process."
           });
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createImportAnnotations() {
        String source = "http://www.eclipse.org/OCL/Import";	
        addAnnotation
          (this, 
           source, 
           new String[] {
             "ecore", "http://www.eclipse.org/emf/2002/Ecore"
           });
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createEcoreAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore";	
        addAnnotation
          (this, 
           source, 
           new String[] {
             "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
             "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
             "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
           });	
        addAnnotation
          (stormSupervisorEClass, 
           source, 
           new String[] {
             "constraints", "mustRequireZookeeperAndNimbus"
           });	
        addAnnotation
          (stormNimbusEClass, 
           source, 
           new String[] {
             "constraints", "mustRequireZookeeper mustProvideNimbusAccess"
           });	
        addAnnotation
          (zookeeperEClass, 
           source, 
           new String[] {
             "constraints", "mustProvideZookeeperAccess"
           });
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createPivotAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
        addAnnotation
          (stormSupervisorEClass, 
           source, 
           new String[] {
             "mustRequireZookeeperAndNimbus", "requiredport -> size() > 1"
           });	
        addAnnotation
          (stormNimbusEClass, 
           source, 
           new String[] {
             "mustRequireZookeeper", "requiredport -> size() > 0",
             "mustProvideNimbusAccess", "providedport -> size() > 0"
           });	
        addAnnotation
          (zookeeperEClass, 
           source, 
           new String[] {
             "mustProvideZookeeperAccess", "providedport -> size() > 0"
           });
    }

} //DdsmPackageImpl
