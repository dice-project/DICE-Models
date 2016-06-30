/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.VM;
import ddsm.VMSize;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.VMImpl#getIs64os <em>Is64os</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getImageId <em>Image Id</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getMaxCores <em>Max Cores</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getMaxRam <em>Max Ram</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getMaxStorage <em>Max Storage</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getMinCores <em>Min Cores</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getMinRam <em>Min Ram</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getMinStorage <em>Min Storage</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getOs <em>Os</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getProviderSpecificTypeName <em>Provider Specific Type Name</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getSshKey <em>Ssh Key</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getPublicAddress <em>Public Address</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link ddsm.impl.VMImpl#getGenericSize <em>Generic Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VMImpl extends ExternalComponentImpl implements VM {
    /**
     * The default value of the '{@link #getIs64os() <em>Is64os</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIs64os()
     * @generated
     * @ordered
     */
    protected static final String IS64OS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIs64os() <em>Is64os</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIs64os()
     * @generated
     * @ordered
     */
    protected String is64os = IS64OS_EDEFAULT;

    /**
     * The default value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImageId()
     * @generated
     * @ordered
     */
    protected static final String IMAGE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImageId()
     * @generated
     * @ordered
     */
    protected String imageId = IMAGE_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxCores() <em>Max Cores</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxCores()
     * @generated
     * @ordered
     */
    protected static final String MAX_CORES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxCores() <em>Max Cores</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxCores()
     * @generated
     * @ordered
     */
    protected String maxCores = MAX_CORES_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxRam() <em>Max Ram</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxRam()
     * @generated
     * @ordered
     */
    protected static final String MAX_RAM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxRam() <em>Max Ram</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxRam()
     * @generated
     * @ordered
     */
    protected String maxRam = MAX_RAM_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxStorage() <em>Max Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxStorage()
     * @generated
     * @ordered
     */
    protected static final String MAX_STORAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxStorage() <em>Max Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxStorage()
     * @generated
     * @ordered
     */
    protected String maxStorage = MAX_STORAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getMinCores() <em>Min Cores</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinCores()
     * @generated
     * @ordered
     */
    protected static final String MIN_CORES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinCores() <em>Min Cores</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinCores()
     * @generated
     * @ordered
     */
    protected String minCores = MIN_CORES_EDEFAULT;

    /**
     * The default value of the '{@link #getMinRam() <em>Min Ram</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinRam()
     * @generated
     * @ordered
     */
    protected static final String MIN_RAM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinRam() <em>Min Ram</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinRam()
     * @generated
     * @ordered
     */
    protected String minRam = MIN_RAM_EDEFAULT;

    /**
     * The default value of the '{@link #getMinStorage() <em>Min Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinStorage()
     * @generated
     * @ordered
     */
    protected static final String MIN_STORAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinStorage() <em>Min Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinStorage()
     * @generated
     * @ordered
     */
    protected String minStorage = MIN_STORAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOs()
     * @generated
     * @ordered
     */
    protected static final String OS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOs()
     * @generated
     * @ordered
     */
    protected String os = OS_EDEFAULT;

    /**
     * The default value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivateKey()
     * @generated
     * @ordered
     */
    protected static final String PRIVATE_KEY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivateKey()
     * @generated
     * @ordered
     */
    protected String privateKey = PRIVATE_KEY_EDEFAULT;

    /**
     * The default value of the '{@link #getProviderSpecificTypeName() <em>Provider Specific Type Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProviderSpecificTypeName()
     * @generated
     * @ordered
     */
    protected static final String PROVIDER_SPECIFIC_TYPE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProviderSpecificTypeName() <em>Provider Specific Type Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProviderSpecificTypeName()
     * @generated
     * @ordered
     */
    protected String providerSpecificTypeName = PROVIDER_SPECIFIC_TYPE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getSecurityGroup() <em>Security Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityGroup()
     * @generated
     * @ordered
     */
    protected static final String SECURITY_GROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSecurityGroup() <em>Security Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityGroup()
     * @generated
     * @ordered
     */
    protected String securityGroup = SECURITY_GROUP_EDEFAULT;

    /**
     * The default value of the '{@link #getSshKey() <em>Ssh Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSshKey()
     * @generated
     * @ordered
     */
    protected static final String SSH_KEY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSshKey() <em>Ssh Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSshKey()
     * @generated
     * @ordered
     */
    protected String sshKey = SSH_KEY_EDEFAULT;

    /**
     * The default value of the '{@link #getPublicAddress() <em>Public Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublicAddress()
     * @generated
     * @ordered
     */
    protected static final String PUBLIC_ADDRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPublicAddress() <em>Public Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublicAddress()
     * @generated
     * @ordered
     */
    protected String publicAddress = PUBLIC_ADDRESS_EDEFAULT;

    /**
     * The default value of the '{@link #getInstances() <em>Instances</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstances()
     * @generated
     * @ordered
     */
    protected static final Integer INSTANCES_EDEFAULT = new Integer(1);

    /**
     * The cached value of the '{@link #getInstances() <em>Instances</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstances()
     * @generated
     * @ordered
     */
    protected Integer instances = INSTANCES_EDEFAULT;

    /**
     * The default value of the '{@link #getGenericSize() <em>Generic Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenericSize()
     * @generated
     * @ordered
     */
    protected static final VMSize GENERIC_SIZE_EDEFAULT = VMSize.SMALL;

    /**
     * The cached value of the '{@link #getGenericSize() <em>Generic Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenericSize()
     * @generated
     * @ordered
     */
    protected VMSize genericSize = GENERIC_SIZE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VMImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.VM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIs64os() {
        return is64os;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIs64os(String newIs64os) {
        String oldIs64os = is64os;
        is64os = newIs64os;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__IS64OS, oldIs64os, is64os));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImageId(String newImageId) {
        String oldImageId = imageId;
        imageId = newImageId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__IMAGE_ID, oldImageId, imageId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMaxCores() {
        return maxCores;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxCores(String newMaxCores) {
        String oldMaxCores = maxCores;
        maxCores = newMaxCores;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__MAX_CORES, oldMaxCores, maxCores));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMaxRam() {
        return maxRam;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxRam(String newMaxRam) {
        String oldMaxRam = maxRam;
        maxRam = newMaxRam;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__MAX_RAM, oldMaxRam, maxRam));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMaxStorage() {
        return maxStorage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxStorage(String newMaxStorage) {
        String oldMaxStorage = maxStorage;
        maxStorage = newMaxStorage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__MAX_STORAGE, oldMaxStorage, maxStorage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMinCores() {
        return minCores;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinCores(String newMinCores) {
        String oldMinCores = minCores;
        minCores = newMinCores;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__MIN_CORES, oldMinCores, minCores));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMinRam() {
        return minRam;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinRam(String newMinRam) {
        String oldMinRam = minRam;
        minRam = newMinRam;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__MIN_RAM, oldMinRam, minRam));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMinStorage() {
        return minStorage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinStorage(String newMinStorage) {
        String oldMinStorage = minStorage;
        minStorage = newMinStorage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__MIN_STORAGE, oldMinStorage, minStorage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOs() {
        return os;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOs(String newOs) {
        String oldOs = os;
        os = newOs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__OS, oldOs, os));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrivateKey(String newPrivateKey) {
        String oldPrivateKey = privateKey;
        privateKey = newPrivateKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__PRIVATE_KEY, oldPrivateKey, privateKey));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getProviderSpecificTypeName() {
        return providerSpecificTypeName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProviderSpecificTypeName(String newProviderSpecificTypeName) {
        String oldProviderSpecificTypeName = providerSpecificTypeName;
        providerSpecificTypeName = newProviderSpecificTypeName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__PROVIDER_SPECIFIC_TYPE_NAME, oldProviderSpecificTypeName, providerSpecificTypeName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSecurityGroup() {
        return securityGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSecurityGroup(String newSecurityGroup) {
        String oldSecurityGroup = securityGroup;
        securityGroup = newSecurityGroup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__SECURITY_GROUP, oldSecurityGroup, securityGroup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSshKey() {
        return sshKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSshKey(String newSshKey) {
        String oldSshKey = sshKey;
        sshKey = newSshKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__SSH_KEY, oldSshKey, sshKey));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPublicAddress() {
        return publicAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPublicAddress(String newPublicAddress) {
        String oldPublicAddress = publicAddress;
        publicAddress = newPublicAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__PUBLIC_ADDRESS, oldPublicAddress, publicAddress));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getInstances() {
        return instances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstances(Integer newInstances) {
        Integer oldInstances = instances;
        instances = newInstances;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__INSTANCES, oldInstances, instances));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VMSize getGenericSize() {
        return genericSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGenericSize(VMSize newGenericSize) {
        VMSize oldGenericSize = genericSize;
        genericSize = newGenericSize == null ? GENERIC_SIZE_EDEFAULT : newGenericSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.VM__GENERIC_SIZE, oldGenericSize, genericSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.VM__IS64OS:
                return getIs64os();
            case DdsmPackage.VM__IMAGE_ID:
                return getImageId();
            case DdsmPackage.VM__MAX_CORES:
                return getMaxCores();
            case DdsmPackage.VM__MAX_RAM:
                return getMaxRam();
            case DdsmPackage.VM__MAX_STORAGE:
                return getMaxStorage();
            case DdsmPackage.VM__MIN_CORES:
                return getMinCores();
            case DdsmPackage.VM__MIN_RAM:
                return getMinRam();
            case DdsmPackage.VM__MIN_STORAGE:
                return getMinStorage();
            case DdsmPackage.VM__OS:
                return getOs();
            case DdsmPackage.VM__PRIVATE_KEY:
                return getPrivateKey();
            case DdsmPackage.VM__PROVIDER_SPECIFIC_TYPE_NAME:
                return getProviderSpecificTypeName();
            case DdsmPackage.VM__SECURITY_GROUP:
                return getSecurityGroup();
            case DdsmPackage.VM__SSH_KEY:
                return getSshKey();
            case DdsmPackage.VM__PUBLIC_ADDRESS:
                return getPublicAddress();
            case DdsmPackage.VM__INSTANCES:
                return getInstances();
            case DdsmPackage.VM__GENERIC_SIZE:
                return getGenericSize();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DdsmPackage.VM__IS64OS:
                setIs64os((String)newValue);
                return;
            case DdsmPackage.VM__IMAGE_ID:
                setImageId((String)newValue);
                return;
            case DdsmPackage.VM__MAX_CORES:
                setMaxCores((String)newValue);
                return;
            case DdsmPackage.VM__MAX_RAM:
                setMaxRam((String)newValue);
                return;
            case DdsmPackage.VM__MAX_STORAGE:
                setMaxStorage((String)newValue);
                return;
            case DdsmPackage.VM__MIN_CORES:
                setMinCores((String)newValue);
                return;
            case DdsmPackage.VM__MIN_RAM:
                setMinRam((String)newValue);
                return;
            case DdsmPackage.VM__MIN_STORAGE:
                setMinStorage((String)newValue);
                return;
            case DdsmPackage.VM__OS:
                setOs((String)newValue);
                return;
            case DdsmPackage.VM__PRIVATE_KEY:
                setPrivateKey((String)newValue);
                return;
            case DdsmPackage.VM__PROVIDER_SPECIFIC_TYPE_NAME:
                setProviderSpecificTypeName((String)newValue);
                return;
            case DdsmPackage.VM__SECURITY_GROUP:
                setSecurityGroup((String)newValue);
                return;
            case DdsmPackage.VM__SSH_KEY:
                setSshKey((String)newValue);
                return;
            case DdsmPackage.VM__PUBLIC_ADDRESS:
                setPublicAddress((String)newValue);
                return;
            case DdsmPackage.VM__INSTANCES:
                setInstances((Integer)newValue);
                return;
            case DdsmPackage.VM__GENERIC_SIZE:
                setGenericSize((VMSize)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case DdsmPackage.VM__IS64OS:
                setIs64os(IS64OS_EDEFAULT);
                return;
            case DdsmPackage.VM__IMAGE_ID:
                setImageId(IMAGE_ID_EDEFAULT);
                return;
            case DdsmPackage.VM__MAX_CORES:
                setMaxCores(MAX_CORES_EDEFAULT);
                return;
            case DdsmPackage.VM__MAX_RAM:
                setMaxRam(MAX_RAM_EDEFAULT);
                return;
            case DdsmPackage.VM__MAX_STORAGE:
                setMaxStorage(MAX_STORAGE_EDEFAULT);
                return;
            case DdsmPackage.VM__MIN_CORES:
                setMinCores(MIN_CORES_EDEFAULT);
                return;
            case DdsmPackage.VM__MIN_RAM:
                setMinRam(MIN_RAM_EDEFAULT);
                return;
            case DdsmPackage.VM__MIN_STORAGE:
                setMinStorage(MIN_STORAGE_EDEFAULT);
                return;
            case DdsmPackage.VM__OS:
                setOs(OS_EDEFAULT);
                return;
            case DdsmPackage.VM__PRIVATE_KEY:
                setPrivateKey(PRIVATE_KEY_EDEFAULT);
                return;
            case DdsmPackage.VM__PROVIDER_SPECIFIC_TYPE_NAME:
                setProviderSpecificTypeName(PROVIDER_SPECIFIC_TYPE_NAME_EDEFAULT);
                return;
            case DdsmPackage.VM__SECURITY_GROUP:
                setSecurityGroup(SECURITY_GROUP_EDEFAULT);
                return;
            case DdsmPackage.VM__SSH_KEY:
                setSshKey(SSH_KEY_EDEFAULT);
                return;
            case DdsmPackage.VM__PUBLIC_ADDRESS:
                setPublicAddress(PUBLIC_ADDRESS_EDEFAULT);
                return;
            case DdsmPackage.VM__INSTANCES:
                setInstances(INSTANCES_EDEFAULT);
                return;
            case DdsmPackage.VM__GENERIC_SIZE:
                setGenericSize(GENERIC_SIZE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case DdsmPackage.VM__IS64OS:
                return IS64OS_EDEFAULT == null ? is64os != null : !IS64OS_EDEFAULT.equals(is64os);
            case DdsmPackage.VM__IMAGE_ID:
                return IMAGE_ID_EDEFAULT == null ? imageId != null : !IMAGE_ID_EDEFAULT.equals(imageId);
            case DdsmPackage.VM__MAX_CORES:
                return MAX_CORES_EDEFAULT == null ? maxCores != null : !MAX_CORES_EDEFAULT.equals(maxCores);
            case DdsmPackage.VM__MAX_RAM:
                return MAX_RAM_EDEFAULT == null ? maxRam != null : !MAX_RAM_EDEFAULT.equals(maxRam);
            case DdsmPackage.VM__MAX_STORAGE:
                return MAX_STORAGE_EDEFAULT == null ? maxStorage != null : !MAX_STORAGE_EDEFAULT.equals(maxStorage);
            case DdsmPackage.VM__MIN_CORES:
                return MIN_CORES_EDEFAULT == null ? minCores != null : !MIN_CORES_EDEFAULT.equals(minCores);
            case DdsmPackage.VM__MIN_RAM:
                return MIN_RAM_EDEFAULT == null ? minRam != null : !MIN_RAM_EDEFAULT.equals(minRam);
            case DdsmPackage.VM__MIN_STORAGE:
                return MIN_STORAGE_EDEFAULT == null ? minStorage != null : !MIN_STORAGE_EDEFAULT.equals(minStorage);
            case DdsmPackage.VM__OS:
                return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
            case DdsmPackage.VM__PRIVATE_KEY:
                return PRIVATE_KEY_EDEFAULT == null ? privateKey != null : !PRIVATE_KEY_EDEFAULT.equals(privateKey);
            case DdsmPackage.VM__PROVIDER_SPECIFIC_TYPE_NAME:
                return PROVIDER_SPECIFIC_TYPE_NAME_EDEFAULT == null ? providerSpecificTypeName != null : !PROVIDER_SPECIFIC_TYPE_NAME_EDEFAULT.equals(providerSpecificTypeName);
            case DdsmPackage.VM__SECURITY_GROUP:
                return SECURITY_GROUP_EDEFAULT == null ? securityGroup != null : !SECURITY_GROUP_EDEFAULT.equals(securityGroup);
            case DdsmPackage.VM__SSH_KEY:
                return SSH_KEY_EDEFAULT == null ? sshKey != null : !SSH_KEY_EDEFAULT.equals(sshKey);
            case DdsmPackage.VM__PUBLIC_ADDRESS:
                return PUBLIC_ADDRESS_EDEFAULT == null ? publicAddress != null : !PUBLIC_ADDRESS_EDEFAULT.equals(publicAddress);
            case DdsmPackage.VM__INSTANCES:
                return INSTANCES_EDEFAULT == null ? instances != null : !INSTANCES_EDEFAULT.equals(instances);
            case DdsmPackage.VM__GENERIC_SIZE:
                return genericSize != GENERIC_SIZE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (is64os: ");
        result.append(is64os);
        result.append(", imageId: ");
        result.append(imageId);
        result.append(", maxCores: ");
        result.append(maxCores);
        result.append(", maxRam: ");
        result.append(maxRam);
        result.append(", maxStorage: ");
        result.append(maxStorage);
        result.append(", minCores: ");
        result.append(minCores);
        result.append(", minRam: ");
        result.append(minRam);
        result.append(", minStorage: ");
        result.append(minStorage);
        result.append(", os: ");
        result.append(os);
        result.append(", privateKey: ");
        result.append(privateKey);
        result.append(", providerSpecificTypeName: ");
        result.append(providerSpecificTypeName);
        result.append(", securityGroup: ");
        result.append(securityGroup);
        result.append(", sshKey: ");
        result.append(sshKey);
        result.append(", publicAddress: ");
        result.append(publicAddress);
        result.append(", instances: ");
        result.append(instances);
        result.append(", genericSize: ");
        result.append(genericSize);
        result.append(')');
        return result.toString();
    }

} //VMImpl
