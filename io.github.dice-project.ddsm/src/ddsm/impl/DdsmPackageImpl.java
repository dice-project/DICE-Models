/**
 */
package ddsm.impl;

import ddsm.CassandraCluster;
import ddsm.CassandraQuorum;
import ddsm.CassandraSeed;
import ddsm.CassandraWorker;
import ddsm.ChefResource;
import ddsm.ClientNode;
import ddsm.CloudElement;
import ddsm.Component;
import ddsm.Crontab;
import ddsm.DdsmFactory;
import ddsm.DdsmPackage;
import ddsm.ExecutionBinding;
import ddsm.ExecutionPlatform;
import ddsm.ExternalComponent;
import ddsm.HDFSDataNode;
import ddsm.HDFSNameNode;
import ddsm.InternalComponent;
import ddsm.JobSubmission;
import ddsm.MasterNode;
import ddsm.MasterSlavePlatform;
import ddsm.Nimbus;
import ddsm.PeerNode;
import ddsm.PeerToPeerPlatform;
import ddsm.PeersQuorum;
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
import ddsm.SlaveNode;
import ddsm.StormCluster;
import ddsm.Supervisor;
import ddsm.VMSize;
import ddsm.YarnNodeManager;
import ddsm.YarnResourceManager;
import ddsm.ZookeeperCluster;
import ddsm.ZookeeperQuorum;
import ddsm.ZookeeperServer;

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
    private EClass supervisorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nimbusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass zookeeperServerEClass = null;

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
    private EClass chefResourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stormClusterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jobSubmissionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass masterNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass slaveNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass zookeeperQuorumEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cassandraWorkerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass zookeeperClusterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cassandraClusterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass peerNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass peersQuorumEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass peerToPeerPlatformEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass masterSlavePlatformEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cassandraQuorumEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cassandraSeedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass crontabEClass = null;

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
    public EAttribute getProperty_PropertyId() {
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
    public EAttribute getResource_DownloadCommand() {
        return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResource_CreateCommand() {
        return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResource_ConfigureCommand() {
        return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResource_InstallCommand() {
        return (EAttribute)resourceEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResource_StartCommand() {
        return (EAttribute)resourceEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResource_StopCommand() {
        return (EAttribute)resourceEClass.getEStructuralFeatures().get(6);
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
    public EReference getInternalComponent_Requiredexecutionplatform() {
        return (EReference)internalComponentEClass.getEStructuralFeatures().get(1);
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
    public EAttribute getExternalComponent_EndPoint() {
        return (EAttribute)externalComponentEClass.getEStructuralFeatures().get(6);
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
    public EAttribute getVM_GenericSize() {
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
    public EAttribute getVM_PublicPorts() {
        return (EAttribute)vmEClass.getEStructuralFeatures().get(16);
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
    public EClass getSupervisor() {
        return supervisorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSupervisor_WorkerStartTimeout() {
        return (EAttribute)supervisorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSupervisor_CpuCapacity() {
        return (EAttribute)supervisorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSupervisor_MemoryCapacity() {
        return (EAttribute)supervisorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSupervisor_HeartbeatFrequency() {
        return (EAttribute)supervisorEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNimbus() {
        return nimbusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNimbus_TaskTimeout() {
        return (EAttribute)nimbusEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNimbus_SupervisorFrequency() {
        return (EAttribute)nimbusEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNimbus_QueueSize() {
        return (EAttribute)nimbusEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNimbus_MonitorFrequency() {
        return (EAttribute)nimbusEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNimbus_RetryTimes() {
        return (EAttribute)nimbusEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNimbus_RetryInterval() {
        return (EAttribute)nimbusEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getZookeeperServer() {
        return zookeeperServerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getZookeeperServer_TickTime() {
        return (EAttribute)zookeeperServerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getZookeeperServer_SyncLimit() {
        return (EAttribute)zookeeperServerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getZookeeperServer_InitLimit() {
        return (EAttribute)zookeeperServerEClass.getEStructuralFeatures().get(2);
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
    public EReference getClientNode_Submits() {
        return (EReference)clientNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClientNode_SkipRunningJob() {
        return (EAttribute)clientNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClientNode_NumberOfSubmissions() {
        return (EAttribute)clientNodeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClientNode_HasSchedule() {
        return (EReference)clientNodeEClass.getEStructuralFeatures().get(3);
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
    public EClass getChefResource() {
        return chefResourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChefResource_CookbookId() {
        return (EAttribute)chefResourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStormCluster() {
        return stormClusterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJobSubmission() {
        return jobSubmissionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJobSubmission_ArtifactUrl() {
        return (EAttribute)jobSubmissionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJobSubmission_MainClass() {
        return (EAttribute)jobSubmissionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMasterNode() {
        return masterNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSlaveNode() {
        return slaveNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSlaveNode_HasMaster() {
        return (EReference)slaveNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getZookeeperQuorum() {
        return zookeeperQuorumEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCassandraWorker() {
        return cassandraWorkerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getZookeeperCluster() {
        return zookeeperClusterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCassandraCluster() {
        return cassandraClusterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPeerNode() {
        return peerNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPeerNode_BelongsToQuorum() {
        return (EReference)peerNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPeersQuorum() {
        return peersQuorumEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPeerToPeerPlatform() {
        return peerToPeerPlatformEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPeerToPeerPlatform_RequiresPeerVm() {
        return (EReference)peerToPeerPlatformEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMasterSlavePlatform() {
        return masterSlavePlatformEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMasterSlavePlatform_RequiresMasterVm() {
        return (EReference)masterSlavePlatformEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMasterSlavePlatform_RequiresSlaveVm() {
        return (EReference)masterSlavePlatformEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCassandraQuorum() {
        return cassandraQuorumEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCassandraQuorum_Requires_bootstrapping_seed() {
        return (EReference)cassandraQuorumEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCassandraSeed() {
        return cassandraSeedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCrontab() {
        return crontabEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCrontab_Min() {
        return (EAttribute)crontabEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCrontab_Hour() {
        return (EAttribute)crontabEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCrontab_DayOfMonth() {
        return (EAttribute)crontabEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCrontab_Month() {
        return (EAttribute)crontabEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCrontab_DayOfWeek() {
        return (EAttribute)crontabEClass.getEStructuralFeatures().get(4);
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
        createEAttribute(resourceEClass, RESOURCE__DOWNLOAD_COMMAND);
        createEAttribute(resourceEClass, RESOURCE__CREATE_COMMAND);
        createEAttribute(resourceEClass, RESOURCE__CONFIGURE_COMMAND);
        createEAttribute(resourceEClass, RESOURCE__INSTALL_COMMAND);
        createEAttribute(resourceEClass, RESOURCE__START_COMMAND);
        createEAttribute(resourceEClass, RESOURCE__STOP_COMMAND);

        componentEClass = createEClass(COMPONENT);
        createEReference(componentEClass, COMPONENT__PROVIDEDPORT);
        createEReference(componentEClass, COMPONENT__PROVIDEDEXECUTIONPLATFORM);

        internalComponentEClass = createEClass(INTERNAL_COMPONENT);
        createEReference(internalComponentEClass, INTERNAL_COMPONENT__REQUIREDPORT);
        createEReference(internalComponentEClass, INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM);

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
        createEAttribute(externalComponentEClass, EXTERNAL_COMPONENT__END_POINT);

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
        createEAttribute(vmEClass, VM__GENERIC_SIZE);
        createEAttribute(vmEClass, VM__INSTANCES);
        createEAttribute(vmEClass, VM__PUBLIC_PORTS);

        ddsmEClass = createEClass(DDSM);
        createEReference(ddsmEClass, DDSM__CLOUDELEMENT);
        createEAttribute(ddsmEClass, DDSM__MODEL_ID);
        createEAttribute(ddsmEClass, DDSM__DESCRIPTION);
        createEReference(ddsmEClass, DDSM__PROPERTIES);
        createEReference(ddsmEClass, DDSM__RESOURCES);

        supervisorEClass = createEClass(SUPERVISOR);
        createEAttribute(supervisorEClass, SUPERVISOR__WORKER_START_TIMEOUT);
        createEAttribute(supervisorEClass, SUPERVISOR__CPU_CAPACITY);
        createEAttribute(supervisorEClass, SUPERVISOR__MEMORY_CAPACITY);
        createEAttribute(supervisorEClass, SUPERVISOR__HEARTBEAT_FREQUENCY);

        nimbusEClass = createEClass(NIMBUS);
        createEAttribute(nimbusEClass, NIMBUS__TASK_TIMEOUT);
        createEAttribute(nimbusEClass, NIMBUS__SUPERVISOR_FREQUENCY);
        createEAttribute(nimbusEClass, NIMBUS__QUEUE_SIZE);
        createEAttribute(nimbusEClass, NIMBUS__MONITOR_FREQUENCY);
        createEAttribute(nimbusEClass, NIMBUS__RETRY_TIMES);
        createEAttribute(nimbusEClass, NIMBUS__RETRY_INTERVAL);

        zookeeperServerEClass = createEClass(ZOOKEEPER_SERVER);
        createEAttribute(zookeeperServerEClass, ZOOKEEPER_SERVER__TICK_TIME);
        createEAttribute(zookeeperServerEClass, ZOOKEEPER_SERVER__SYNC_LIMIT);
        createEAttribute(zookeeperServerEClass, ZOOKEEPER_SERVER__INIT_LIMIT);

        clientNodeEClass = createEClass(CLIENT_NODE);
        createEReference(clientNodeEClass, CLIENT_NODE__SUBMITS);
        createEAttribute(clientNodeEClass, CLIENT_NODE__SKIP_RUNNING_JOB);
        createEAttribute(clientNodeEClass, CLIENT_NODE__NUMBER_OF_SUBMISSIONS);
        createEReference(clientNodeEClass, CLIENT_NODE__HAS_SCHEDULE);

        yarnResourceManagerEClass = createEClass(YARN_RESOURCE_MANAGER);

        yarnNodeManagerEClass = createEClass(YARN_NODE_MANAGER);

        hdfsNameNodeEClass = createEClass(HDFS_NAME_NODE);

        hdfsDataNodeEClass = createEClass(HDFS_DATA_NODE);

        chefResourceEClass = createEClass(CHEF_RESOURCE);
        createEAttribute(chefResourceEClass, CHEF_RESOURCE__COOKBOOK_ID);

        stormClusterEClass = createEClass(STORM_CLUSTER);

        jobSubmissionEClass = createEClass(JOB_SUBMISSION);
        createEAttribute(jobSubmissionEClass, JOB_SUBMISSION__ARTIFACT_URL);
        createEAttribute(jobSubmissionEClass, JOB_SUBMISSION__MAIN_CLASS);

        masterNodeEClass = createEClass(MASTER_NODE);

        slaveNodeEClass = createEClass(SLAVE_NODE);
        createEReference(slaveNodeEClass, SLAVE_NODE__HAS_MASTER);

        zookeeperQuorumEClass = createEClass(ZOOKEEPER_QUORUM);

        cassandraWorkerEClass = createEClass(CASSANDRA_WORKER);

        zookeeperClusterEClass = createEClass(ZOOKEEPER_CLUSTER);

        cassandraClusterEClass = createEClass(CASSANDRA_CLUSTER);

        peerNodeEClass = createEClass(PEER_NODE);
        createEReference(peerNodeEClass, PEER_NODE__BELONGS_TO_QUORUM);

        peersQuorumEClass = createEClass(PEERS_QUORUM);

        peerToPeerPlatformEClass = createEClass(PEER_TO_PEER_PLATFORM);
        createEReference(peerToPeerPlatformEClass, PEER_TO_PEER_PLATFORM__REQUIRES_PEER_VM);

        masterSlavePlatformEClass = createEClass(MASTER_SLAVE_PLATFORM);
        createEReference(masterSlavePlatformEClass, MASTER_SLAVE_PLATFORM__REQUIRES_MASTER_VM);
        createEReference(masterSlavePlatformEClass, MASTER_SLAVE_PLATFORM__REQUIRES_SLAVE_VM);

        cassandraQuorumEClass = createEClass(CASSANDRA_QUORUM);
        createEReference(cassandraQuorumEClass, CASSANDRA_QUORUM__REQUIRES_BOOTSTRAPPING_SEED);

        cassandraSeedEClass = createEClass(CASSANDRA_SEED);

        crontabEClass = createEClass(CRONTAB);
        createEAttribute(crontabEClass, CRONTAB__MIN);
        createEAttribute(crontabEClass, CRONTAB__HOUR);
        createEAttribute(crontabEClass, CRONTAB__DAY_OF_MONTH);
        createEAttribute(crontabEClass, CRONTAB__MONTH);
        createEAttribute(crontabEClass, CRONTAB__DAY_OF_WEEK);

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
        supervisorEClass.getESuperTypes().add(this.getSlaveNode());
        nimbusEClass.getESuperTypes().add(this.getMasterNode());
        zookeeperServerEClass.getESuperTypes().add(this.getPeerNode());
        clientNodeEClass.getESuperTypes().add(this.getInternalComponent());
        yarnResourceManagerEClass.getESuperTypes().add(this.getMasterNode());
        yarnNodeManagerEClass.getESuperTypes().add(this.getSlaveNode());
        hdfsNameNodeEClass.getESuperTypes().add(this.getMasterNode());
        hdfsDataNodeEClass.getESuperTypes().add(this.getSlaveNode());
        chefResourceEClass.getESuperTypes().add(this.getResource());
        stormClusterEClass.getESuperTypes().add(this.getMasterSlavePlatform());
        jobSubmissionEClass.getESuperTypes().add(this.getCloudElement());
        masterNodeEClass.getESuperTypes().add(this.getInternalComponent());
        slaveNodeEClass.getESuperTypes().add(this.getInternalComponent());
        zookeeperQuorumEClass.getESuperTypes().add(this.getPeersQuorum());
        cassandraWorkerEClass.getESuperTypes().add(this.getPeerNode());
        zookeeperClusterEClass.getESuperTypes().add(this.getPeerToPeerPlatform());
        cassandraClusterEClass.getESuperTypes().add(this.getPeerToPeerPlatform());
        peerNodeEClass.getESuperTypes().add(this.getInternalComponent());
        peersQuorumEClass.getESuperTypes().add(this.getInternalComponent());
        peerToPeerPlatformEClass.getESuperTypes().add(this.getInternalComponent());
        masterSlavePlatformEClass.getESuperTypes().add(this.getInternalComponent());
        cassandraQuorumEClass.getESuperTypes().add(this.getPeersQuorum());
        cassandraSeedEClass.getESuperTypes().add(this.getInternalComponent());

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
        initEAttribute(getResource_DownloadCommand(), ecorePackage.getEString(), "downloadCommand", "", 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResource_CreateCommand(), ecorePackage.getEString(), "createCommand", "", 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResource_ConfigureCommand(), ecorePackage.getEString(), "configureCommand", "", 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResource_InstallCommand(), ecorePackage.getEString(), "installCommand", "", 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResource_StartCommand(), ecorePackage.getEString(), "startCommand", "", 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResource_StopCommand(), ecorePackage.getEString(), "stopCommand", "", 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComponent_Providedport(), this.getProvidedPort(), null, "providedport", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComponent_Providedexecutionplatform(), this.getProvidedExecutionPlatform(), null, "providedexecutionplatform", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(internalComponentEClass, InternalComponent.class, "InternalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInternalComponent_Requiredport(), this.getRequiredPort(), null, "requiredport", null, 0, -1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInternalComponent_Requiredexecutionplatform(), this.getRequiredExecutionPlatform(), null, "requiredexecutionplatform", null, 0, -1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEReference(getRelationship_Providedport(), this.getProvidedPort(), null, "providedport", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationship_Requiredport(), this.getRequiredPort(), null, "requiredport", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(executionBindingEClass, ExecutionBinding.class, "ExecutionBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExecutionBinding_Requiredexecutionplatform(), this.getRequiredExecutionPlatform(), null, "requiredexecutionplatform", null, 1, 1, ExecutionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExecutionBinding_Providedexecutionplatform(), this.getProvidedExecutionPlatform(), null, "providedexecutionplatform", null, 1, 1, ExecutionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(externalComponentEClass, ExternalComponent.class, "ExternalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExternalComponent_Provider(), this.getProvider(), null, "provider", null, 1, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExternalComponent_Location(), ecorePackage.getEString(), "location", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExternalComponent_Login(), ecorePackage.getEString(), "login", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExternalComponent_Password(), ecorePackage.getEString(), "password", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExternalComponent_Region(), ecorePackage.getEString(), "region", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExternalComponent_ServiceType(), ecorePackage.getEString(), "serviceType", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExternalComponent_EndPoint(), ecorePackage.getEString(), "endPoint", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEAttribute(getVM_GenericSize(), this.getVMSize(), "genericSize", null, 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_Instances(), ecorePackage.getEInt(), "instances", "1", 0, 1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVM_PublicPorts(), ecorePackage.getEInt(), "publicPorts", "80", 0, -1, ddsm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ddsmEClass, ddsm.DDSM.class, "DDSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDDSM_Cloudelement(), this.getCloudElement(), null, "cloudelement", null, 0, -1, ddsm.DDSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDDSM_ModelId(), ecorePackage.getEString(), "modelId", null, 0, 1, ddsm.DDSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDDSM_Description(), ecorePackage.getEString(), "description", null, 0, 1, ddsm.DDSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDDSM_Properties(), this.getProperty(), null, "properties", null, 0, -1, ddsm.DDSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDDSM_Resources(), this.getResource(), null, "resources", null, 0, -1, ddsm.DDSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(supervisorEClass, Supervisor.class, "Supervisor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSupervisor_WorkerStartTimeout(), ecorePackage.getEInt(), "workerStartTimeout", "120", 0, 1, Supervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSupervisor_CpuCapacity(), ecorePackage.getEInt(), "cpuCapacity", "400", 0, 1, Supervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSupervisor_MemoryCapacity(), ecorePackage.getEInt(), "memoryCapacity", "4096", 0, 1, Supervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSupervisor_HeartbeatFrequency(), ecorePackage.getEInt(), "heartbeatFrequency", "5", 0, 1, Supervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(nimbusEClass, Nimbus.class, "Nimbus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNimbus_TaskTimeout(), ecorePackage.getEInt(), "taskTimeout", "60", 0, 1, Nimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNimbus_SupervisorFrequency(), ecorePackage.getEInt(), "supervisorFrequency", "60", 0, 1, Nimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNimbus_QueueSize(), ecorePackage.getEInt(), "queueSize", "100000", 0, 1, Nimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNimbus_MonitorFrequency(), ecorePackage.getEInt(), "monitorFrequency", "40", 0, 1, Nimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNimbus_RetryTimes(), ecorePackage.getEInt(), "retryTimes", "5", 0, 1, Nimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNimbus_RetryInterval(), ecorePackage.getEInt(), "retryInterval", "2000", 0, 1, Nimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(zookeeperServerEClass, ZookeeperServer.class, "ZookeeperServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getZookeeperServer_TickTime(), ecorePackage.getEInt(), "tickTime", "1500", 0, 1, ZookeeperServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getZookeeperServer_SyncLimit(), ecorePackage.getEInt(), "syncLimit", "10", 0, 1, ZookeeperServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getZookeeperServer_InitLimit(), ecorePackage.getEInt(), "initLimit", "5", 0, 1, ZookeeperServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(clientNodeEClass, ClientNode.class, "ClientNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getClientNode_Submits(), this.getJobSubmission(), null, "submits", null, 1, 1, ClientNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getClientNode_SkipRunningJob(), ecorePackage.getEBoolean(), "skipRunningJob", null, 0, 1, ClientNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getClientNode_NumberOfSubmissions(), ecorePackage.getEInt(), "numberOfSubmissions", "1", 0, 1, ClientNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getClientNode_HasSchedule(), this.getCrontab(), null, "hasSchedule", null, 0, 1, ClientNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(yarnResourceManagerEClass, YarnResourceManager.class, "YarnResourceManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(yarnNodeManagerEClass, YarnNodeManager.class, "YarnNodeManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(hdfsNameNodeEClass, HDFSNameNode.class, "HDFSNameNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(hdfsDataNodeEClass, HDFSDataNode.class, "HDFSDataNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(chefResourceEClass, ChefResource.class, "ChefResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getChefResource_CookbookId(), ecorePackage.getEString(), "cookbookId", null, 1, 1, ChefResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stormClusterEClass, StormCluster.class, "StormCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(jobSubmissionEClass, JobSubmission.class, "JobSubmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJobSubmission_ArtifactUrl(), ecorePackage.getEString(), "artifactUrl", null, 0, 1, JobSubmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJobSubmission_MainClass(), ecorePackage.getEString(), "mainClass", null, 0, 1, JobSubmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(masterNodeEClass, MasterNode.class, "MasterNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(slaveNodeEClass, SlaveNode.class, "SlaveNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSlaveNode_HasMaster(), this.getMasterNode(), null, "hasMaster", null, 1, 1, SlaveNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(zookeeperQuorumEClass, ZookeeperQuorum.class, "ZookeeperQuorum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cassandraWorkerEClass, CassandraWorker.class, "CassandraWorker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(zookeeperClusterEClass, ZookeeperCluster.class, "ZookeeperCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cassandraClusterEClass, CassandraCluster.class, "CassandraCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(peerNodeEClass, PeerNode.class, "PeerNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPeerNode_BelongsToQuorum(), this.getPeersQuorum(), null, "belongsToQuorum", null, 1, 1, PeerNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(peersQuorumEClass, PeersQuorum.class, "PeersQuorum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(peerToPeerPlatformEClass, PeerToPeerPlatform.class, "PeerToPeerPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPeerToPeerPlatform_RequiresPeerVm(), this.getRequiredExecutionPlatform(), null, "requiresPeerVm", null, 1, -1, PeerToPeerPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(masterSlavePlatformEClass, MasterSlavePlatform.class, "MasterSlavePlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMasterSlavePlatform_RequiresMasterVm(), this.getRequiredExecutionPlatform(), null, "requiresMasterVm", null, 1, 1, MasterSlavePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMasterSlavePlatform_RequiresSlaveVm(), this.getRequiredExecutionPlatform(), null, "requiresSlaveVm", null, 1, -1, MasterSlavePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cassandraQuorumEClass, CassandraQuorum.class, "CassandraQuorum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCassandraQuorum_Requires_bootstrapping_seed(), this.getRequiredPort(), null, "requires_bootstrapping_seed", null, 1, 1, CassandraQuorum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cassandraSeedEClass, CassandraSeed.class, "CassandraSeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(crontabEClass, Crontab.class, "Crontab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCrontab_Min(), ecorePackage.getEInt(), "min", null, 1, 1, Crontab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCrontab_Hour(), ecorePackage.getEInt(), "hour", null, 1, 1, Crontab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCrontab_DayOfMonth(), ecorePackage.getEInt(), "dayOfMonth", null, 1, 1, Crontab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCrontab_Month(), ecorePackage.getEInt(), "month", null, 1, 1, Crontab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCrontab_DayOfWeek(), ecorePackage.getEInt(), "dayOfWeek", null, 1, 1, Crontab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
          (supervisorEClass, 
           source, 
           new String[] {
             "description", "Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of the Storm supervisor slave process."
           });	
        addAnnotation
          (nimbusEClass, 
           source, 
           new String[] {
             "description", "Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of the Storm nimbus master process."
           });	
        addAnnotation
          (zookeeperServerEClass, 
           source, 
           new String[] {
             "description", "Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of a Zookeeper cluster."
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
          (supervisorEClass, 
           source, 
           new String[] {
             "constraints", "mustHaveNimbusMaster"
           });	
        addAnnotation
          (nimbusEClass, 
           source, 
           new String[] {
             "constraints", "dependsOnZookeeper"
           });	
        addAnnotation
          (zookeeperServerEClass, 
           source, 
           new String[] {
             "constraints", "mustBelongToZookeeperQuorum"
           });	
        addAnnotation
          (stormClusterEClass, 
           source, 
           new String[] {
             "constraints", "stormClusterDependsOnZookeeper"
           });	
        addAnnotation
          (cassandraWorkerEClass, 
           source, 
           new String[] {
             "constraints", "mustBelongToCassandraQuorum"
           });	
        addAnnotation
          (peerToPeerPlatformEClass, 
           source, 
           new String[] {
             "constraints", "peerPlatformsNeedBinding"
           });	
        addAnnotation
          (masterSlavePlatformEClass, 
           source, 
           new String[] {
             "constraints", "slavePlatformsNeedBinding masterPlatformNeedBinding"
           });	
        addAnnotation
          (cassandraQuorumEClass, 
           source, 
           new String[] {
             "constraints", "cassandraNeedASeed"
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
          (supervisorEClass, 
           source, 
           new String[] {
             "mustHaveNimbusMaster", " hasMaster.oclIsTypeOf(Nimbus)"
           });	
        addAnnotation
          (nimbusEClass, 
           source, 
           new String[] {
             "dependsOnZookeeper", "Relationship.allInstances() ->\n\texists(r | \n\t\tself.requiredport -> exists(p |\n\t\t\tp.elementId = r.requiredport.elementId and\n\t\t\t(r.providedport.owner.oclIsTypeOf(ZookeeperCluster) or\n\t\t\tr.providedport.owner.oclIsTypeOf(ZookeeperQuorum))\n\t\t)\n\t)"
           });	
        addAnnotation
          (zookeeperServerEClass, 
           source, 
           new String[] {
             "mustBelongToZookeeperQuorum", " belongsToQuorum.oclIsTypeOf(ZookeeperQuorum)"
           });	
        addAnnotation
          (stormClusterEClass, 
           source, 
           new String[] {
             "stormClusterDependsOnZookeeper", "Relationship.allInstances() ->\n\texists(r | \n\t\tself.requiredport -> exists(p |\n\t\t\tp.elementId = r.requiredport.elementId and\n\t\t\t(r.providedport.owner.oclIsTypeOf(ZookeeperCluster) or\n\t\t\tr.providedport.owner.oclIsTypeOf(ZookeeperQuorum))\n\t\t)\n\t)"
           });	
        addAnnotation
          (cassandraWorkerEClass, 
           source, 
           new String[] {
             "mustBelongToCassandraQuorum", " belongsToQuorum.oclIsTypeOf(CassandraQuorum)"
           });	
        addAnnotation
          (peerToPeerPlatformEClass, 
           source, 
           new String[] {
             "peerPlatformsNeedBinding", "requiresPeerVm -> forAll(platform | ExecutionBinding.allInstances() ->\n\texists(b |\n\t\t b.requiredexecutionplatform.elementId = platform.elementId and \n\t     b.providedexecutionplatform.owner.oclIsTypeOf(VM)\n\t)\n)"
           });	
        addAnnotation
          (masterSlavePlatformEClass, 
           source, 
           new String[] {
             "slavePlatformsNeedBinding", "requiresSlaveVm -> forAll(platform | ExecutionBinding.allInstances() ->\n\texists(b |\n\t\t b.requiredexecutionplatform.elementId = platform.elementId and \n\t         b.providedexecutionplatform.owner.oclIsTypeOf(VM)\n\t)\n)",
             "masterPlatformNeedBinding", "ExecutionBinding.allInstances() ->\n\texists(b |\n\t\t b.requiredexecutionplatform.elementId = requiresMasterVm.elementId and \n\t         b.providedexecutionplatform.owner.oclIsTypeOf(VM)\n\t)\n"
           });	
        addAnnotation
          (cassandraQuorumEClass, 
           source, 
           new String[] {
             "cassandraNeedASeed", "Relationship.allInstances() ->\n\texists( r |\n\t\tr.providedport.owner.oclIsTypeOf(CassandraSeed) and\n\t\tr.requiredport.elementId = self.requires_bootstrapping_seed.elementId\n\t)\n"
           });
    }

} //DdsmPackageImpl
