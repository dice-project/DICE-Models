/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ResourceImpl#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link ddsm.impl.ResourceImpl#getDownloadCommand <em>Download Command</em>}</li>
 *   <li>{@link ddsm.impl.ResourceImpl#getCreateCommand <em>Create Command</em>}</li>
 *   <li>{@link ddsm.impl.ResourceImpl#getConfigureCommand <em>Configure Command</em>}</li>
 *   <li>{@link ddsm.impl.ResourceImpl#getInstallCommand <em>Install Command</em>}</li>
 *   <li>{@link ddsm.impl.ResourceImpl#getStartCommand <em>Start Command</em>}</li>
 *   <li>{@link ddsm.impl.ResourceImpl#getStopCommand <em>Stop Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
    /**
     * The default value of the '{@link #getResourceId() <em>Resource Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceId()
     * @generated
     * @ordered
     */
    protected static final String RESOURCE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResourceId() <em>Resource Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceId()
     * @generated
     * @ordered
     */
    protected String resourceId = RESOURCE_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getDownloadCommand() <em>Download Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDownloadCommand()
     * @generated
     * @ordered
     */
    protected static final String DOWNLOAD_COMMAND_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getDownloadCommand() <em>Download Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDownloadCommand()
     * @generated
     * @ordered
     */
    protected String downloadCommand = DOWNLOAD_COMMAND_EDEFAULT;

    /**
     * The default value of the '{@link #getCreateCommand() <em>Create Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreateCommand()
     * @generated
     * @ordered
     */
    protected static final String CREATE_COMMAND_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getCreateCommand() <em>Create Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreateCommand()
     * @generated
     * @ordered
     */
    protected String createCommand = CREATE_COMMAND_EDEFAULT;

    /**
     * The default value of the '{@link #getConfigureCommand() <em>Configure Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigureCommand()
     * @generated
     * @ordered
     */
    protected static final String CONFIGURE_COMMAND_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getConfigureCommand() <em>Configure Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigureCommand()
     * @generated
     * @ordered
     */
    protected String configureCommand = CONFIGURE_COMMAND_EDEFAULT;

    /**
     * The default value of the '{@link #getInstallCommand() <em>Install Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstallCommand()
     * @generated
     * @ordered
     */
    protected static final String INSTALL_COMMAND_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getInstallCommand() <em>Install Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstallCommand()
     * @generated
     * @ordered
     */
    protected String installCommand = INSTALL_COMMAND_EDEFAULT;

    /**
     * The default value of the '{@link #getStartCommand() <em>Start Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartCommand()
     * @generated
     * @ordered
     */
    protected static final String START_COMMAND_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getStartCommand() <em>Start Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartCommand()
     * @generated
     * @ordered
     */
    protected String startCommand = START_COMMAND_EDEFAULT;

    /**
     * The default value of the '{@link #getStopCommand() <em>Stop Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStopCommand()
     * @generated
     * @ordered
     */
    protected static final String STOP_COMMAND_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getStopCommand() <em>Stop Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStopCommand()
     * @generated
     * @ordered
     */
    protected String stopCommand = STOP_COMMAND_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.RESOURCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResourceId(String newResourceId) {
        String oldResourceId = resourceId;
        resourceId = newResourceId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.RESOURCE__RESOURCE_ID, oldResourceId, resourceId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDownloadCommand() {
        return downloadCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDownloadCommand(String newDownloadCommand) {
        String oldDownloadCommand = downloadCommand;
        downloadCommand = newDownloadCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.RESOURCE__DOWNLOAD_COMMAND, oldDownloadCommand, downloadCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCreateCommand() {
        return createCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCreateCommand(String newCreateCommand) {
        String oldCreateCommand = createCommand;
        createCommand = newCreateCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.RESOURCE__CREATE_COMMAND, oldCreateCommand, createCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConfigureCommand() {
        return configureCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfigureCommand(String newConfigureCommand) {
        String oldConfigureCommand = configureCommand;
        configureCommand = newConfigureCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.RESOURCE__CONFIGURE_COMMAND, oldConfigureCommand, configureCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInstallCommand() {
        return installCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstallCommand(String newInstallCommand) {
        String oldInstallCommand = installCommand;
        installCommand = newInstallCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.RESOURCE__INSTALL_COMMAND, oldInstallCommand, installCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStartCommand() {
        return startCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartCommand(String newStartCommand) {
        String oldStartCommand = startCommand;
        startCommand = newStartCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.RESOURCE__START_COMMAND, oldStartCommand, startCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStopCommand() {
        return stopCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStopCommand(String newStopCommand) {
        String oldStopCommand = stopCommand;
        stopCommand = newStopCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.RESOURCE__STOP_COMMAND, oldStopCommand, stopCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.RESOURCE__RESOURCE_ID:
                return getResourceId();
            case DdsmPackage.RESOURCE__DOWNLOAD_COMMAND:
                return getDownloadCommand();
            case DdsmPackage.RESOURCE__CREATE_COMMAND:
                return getCreateCommand();
            case DdsmPackage.RESOURCE__CONFIGURE_COMMAND:
                return getConfigureCommand();
            case DdsmPackage.RESOURCE__INSTALL_COMMAND:
                return getInstallCommand();
            case DdsmPackage.RESOURCE__START_COMMAND:
                return getStartCommand();
            case DdsmPackage.RESOURCE__STOP_COMMAND:
                return getStopCommand();
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
            case DdsmPackage.RESOURCE__RESOURCE_ID:
                setResourceId((String)newValue);
                return;
            case DdsmPackage.RESOURCE__DOWNLOAD_COMMAND:
                setDownloadCommand((String)newValue);
                return;
            case DdsmPackage.RESOURCE__CREATE_COMMAND:
                setCreateCommand((String)newValue);
                return;
            case DdsmPackage.RESOURCE__CONFIGURE_COMMAND:
                setConfigureCommand((String)newValue);
                return;
            case DdsmPackage.RESOURCE__INSTALL_COMMAND:
                setInstallCommand((String)newValue);
                return;
            case DdsmPackage.RESOURCE__START_COMMAND:
                setStartCommand((String)newValue);
                return;
            case DdsmPackage.RESOURCE__STOP_COMMAND:
                setStopCommand((String)newValue);
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
            case DdsmPackage.RESOURCE__RESOURCE_ID:
                setResourceId(RESOURCE_ID_EDEFAULT);
                return;
            case DdsmPackage.RESOURCE__DOWNLOAD_COMMAND:
                setDownloadCommand(DOWNLOAD_COMMAND_EDEFAULT);
                return;
            case DdsmPackage.RESOURCE__CREATE_COMMAND:
                setCreateCommand(CREATE_COMMAND_EDEFAULT);
                return;
            case DdsmPackage.RESOURCE__CONFIGURE_COMMAND:
                setConfigureCommand(CONFIGURE_COMMAND_EDEFAULT);
                return;
            case DdsmPackage.RESOURCE__INSTALL_COMMAND:
                setInstallCommand(INSTALL_COMMAND_EDEFAULT);
                return;
            case DdsmPackage.RESOURCE__START_COMMAND:
                setStartCommand(START_COMMAND_EDEFAULT);
                return;
            case DdsmPackage.RESOURCE__STOP_COMMAND:
                setStopCommand(STOP_COMMAND_EDEFAULT);
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
            case DdsmPackage.RESOURCE__RESOURCE_ID:
                return RESOURCE_ID_EDEFAULT == null ? resourceId != null : !RESOURCE_ID_EDEFAULT.equals(resourceId);
            case DdsmPackage.RESOURCE__DOWNLOAD_COMMAND:
                return DOWNLOAD_COMMAND_EDEFAULT == null ? downloadCommand != null : !DOWNLOAD_COMMAND_EDEFAULT.equals(downloadCommand);
            case DdsmPackage.RESOURCE__CREATE_COMMAND:
                return CREATE_COMMAND_EDEFAULT == null ? createCommand != null : !CREATE_COMMAND_EDEFAULT.equals(createCommand);
            case DdsmPackage.RESOURCE__CONFIGURE_COMMAND:
                return CONFIGURE_COMMAND_EDEFAULT == null ? configureCommand != null : !CONFIGURE_COMMAND_EDEFAULT.equals(configureCommand);
            case DdsmPackage.RESOURCE__INSTALL_COMMAND:
                return INSTALL_COMMAND_EDEFAULT == null ? installCommand != null : !INSTALL_COMMAND_EDEFAULT.equals(installCommand);
            case DdsmPackage.RESOURCE__START_COMMAND:
                return START_COMMAND_EDEFAULT == null ? startCommand != null : !START_COMMAND_EDEFAULT.equals(startCommand);
            case DdsmPackage.RESOURCE__STOP_COMMAND:
                return STOP_COMMAND_EDEFAULT == null ? stopCommand != null : !STOP_COMMAND_EDEFAULT.equals(stopCommand);
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
        result.append(" (resourceId: ");
        result.append(resourceId);
        result.append(", downloadCommand: ");
        result.append(downloadCommand);
        result.append(", createCommand: ");
        result.append(createCommand);
        result.append(", configureCommand: ");
        result.append(configureCommand);
        result.append(", installCommand: ");
        result.append(installCommand);
        result.append(", startCommand: ");
        result.append(startCommand);
        result.append(", stopCommand: ");
        result.append(stopCommand);
        result.append(')');
        return result.toString();
    }

} //ResourceImpl
