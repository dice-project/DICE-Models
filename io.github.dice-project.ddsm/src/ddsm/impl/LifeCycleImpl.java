/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.LifeCycle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Life Cycle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.LifeCycleImpl#getDownloadCommand <em>Download Command</em>}</li>
 *   <li>{@link ddsm.impl.LifeCycleImpl#getInstallCommand <em>Install Command</em>}</li>
 *   <li>{@link ddsm.impl.LifeCycleImpl#getStartCommand <em>Start Command</em>}</li>
 *   <li>{@link ddsm.impl.LifeCycleImpl#getStopCommand <em>Stop Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifeCycleImpl extends ResourceImpl implements LifeCycle {
    /**
     * The default value of the '{@link #getDownloadCommand() <em>Download Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDownloadCommand()
     * @generated
     * @ordered
     */
    protected static final String DOWNLOAD_COMMAND_EDEFAULT = null;

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
     * The default value of the '{@link #getInstallCommand() <em>Install Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstallCommand()
     * @generated
     * @ordered
     */
    protected static final String INSTALL_COMMAND_EDEFAULT = null;

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
    protected static final String START_COMMAND_EDEFAULT = null;

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
    protected static final String STOP_COMMAND_EDEFAULT = null;

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
    protected LifeCycleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.LIFE_CYCLE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__DOWNLOAD_COMMAND, oldDownloadCommand, downloadCommand));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND, oldInstallCommand, installCommand));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__START_COMMAND, oldStartCommand, startCommand));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__STOP_COMMAND, oldStopCommand, stopCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.LIFE_CYCLE__DOWNLOAD_COMMAND:
                return getDownloadCommand();
            case DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND:
                return getInstallCommand();
            case DdsmPackage.LIFE_CYCLE__START_COMMAND:
                return getStartCommand();
            case DdsmPackage.LIFE_CYCLE__STOP_COMMAND:
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
            case DdsmPackage.LIFE_CYCLE__DOWNLOAD_COMMAND:
                setDownloadCommand((String)newValue);
                return;
            case DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND:
                setInstallCommand((String)newValue);
                return;
            case DdsmPackage.LIFE_CYCLE__START_COMMAND:
                setStartCommand((String)newValue);
                return;
            case DdsmPackage.LIFE_CYCLE__STOP_COMMAND:
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
            case DdsmPackage.LIFE_CYCLE__DOWNLOAD_COMMAND:
                setDownloadCommand(DOWNLOAD_COMMAND_EDEFAULT);
                return;
            case DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND:
                setInstallCommand(INSTALL_COMMAND_EDEFAULT);
                return;
            case DdsmPackage.LIFE_CYCLE__START_COMMAND:
                setStartCommand(START_COMMAND_EDEFAULT);
                return;
            case DdsmPackage.LIFE_CYCLE__STOP_COMMAND:
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
            case DdsmPackage.LIFE_CYCLE__DOWNLOAD_COMMAND:
                return DOWNLOAD_COMMAND_EDEFAULT == null ? downloadCommand != null : !DOWNLOAD_COMMAND_EDEFAULT.equals(downloadCommand);
            case DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND:
                return INSTALL_COMMAND_EDEFAULT == null ? installCommand != null : !INSTALL_COMMAND_EDEFAULT.equals(installCommand);
            case DdsmPackage.LIFE_CYCLE__START_COMMAND:
                return START_COMMAND_EDEFAULT == null ? startCommand != null : !START_COMMAND_EDEFAULT.equals(startCommand);
            case DdsmPackage.LIFE_CYCLE__STOP_COMMAND:
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
        result.append(" (downloadCommand: ");
        result.append(downloadCommand);
        result.append(", installCommand: ");
        result.append(installCommand);
        result.append(", startCommand: ");
        result.append(startCommand);
        result.append(", stopCommand: ");
        result.append(stopCommand);
        result.append(')');
        return result.toString();
    }

} //LifeCycleImpl
