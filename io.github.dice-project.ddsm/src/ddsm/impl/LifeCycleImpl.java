/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.LifeCycle;
import ddsm.Script;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link ddsm.impl.LifeCycleImpl#getPreconfigureCommand <em>Preconfigure Command</em>}</li>
 *   <li>{@link ddsm.impl.LifeCycleImpl#getCreateCommand <em>Create Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifeCycleImpl extends ResourceImpl implements LifeCycle {
    /**
     * The cached value of the '{@link #getDownloadCommand() <em>Download Command</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDownloadCommand()
     * @generated
     * @ordered
     */
    protected Script downloadCommand;

    /**
     * The cached value of the '{@link #getInstallCommand() <em>Install Command</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstallCommand()
     * @generated
     * @ordered
     */
    protected Script installCommand;

    /**
     * The cached value of the '{@link #getStartCommand() <em>Start Command</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartCommand()
     * @generated
     * @ordered
     */
    protected Script startCommand;

    /**
     * The cached value of the '{@link #getStopCommand() <em>Stop Command</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStopCommand()
     * @generated
     * @ordered
     */
    protected Script stopCommand;

    /**
     * The cached value of the '{@link #getPreconfigureCommand() <em>Preconfigure Command</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreconfigureCommand()
     * @generated
     * @ordered
     */
    protected Script preconfigureCommand;

    /**
     * The cached value of the '{@link #getCreateCommand() <em>Create Command</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreateCommand()
     * @generated
     * @ordered
     */
    protected Script createCommand;

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
    public Script getDownloadCommand() {
        if (downloadCommand != null && downloadCommand.eIsProxy()) {
            InternalEObject oldDownloadCommand = (InternalEObject)downloadCommand;
            downloadCommand = (Script)eResolveProxy(oldDownloadCommand);
            if (downloadCommand != oldDownloadCommand) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.LIFE_CYCLE__DOWNLOAD_COMMAND, oldDownloadCommand, downloadCommand));
            }
        }
        return downloadCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script basicGetDownloadCommand() {
        return downloadCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDownloadCommand(Script newDownloadCommand) {
        Script oldDownloadCommand = downloadCommand;
        downloadCommand = newDownloadCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__DOWNLOAD_COMMAND, oldDownloadCommand, downloadCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script getInstallCommand() {
        if (installCommand != null && installCommand.eIsProxy()) {
            InternalEObject oldInstallCommand = (InternalEObject)installCommand;
            installCommand = (Script)eResolveProxy(oldInstallCommand);
            if (installCommand != oldInstallCommand) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND, oldInstallCommand, installCommand));
            }
        }
        return installCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script basicGetInstallCommand() {
        return installCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstallCommand(Script newInstallCommand) {
        Script oldInstallCommand = installCommand;
        installCommand = newInstallCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND, oldInstallCommand, installCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script getStartCommand() {
        if (startCommand != null && startCommand.eIsProxy()) {
            InternalEObject oldStartCommand = (InternalEObject)startCommand;
            startCommand = (Script)eResolveProxy(oldStartCommand);
            if (startCommand != oldStartCommand) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.LIFE_CYCLE__START_COMMAND, oldStartCommand, startCommand));
            }
        }
        return startCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script basicGetStartCommand() {
        return startCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartCommand(Script newStartCommand) {
        Script oldStartCommand = startCommand;
        startCommand = newStartCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__START_COMMAND, oldStartCommand, startCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script getStopCommand() {
        if (stopCommand != null && stopCommand.eIsProxy()) {
            InternalEObject oldStopCommand = (InternalEObject)stopCommand;
            stopCommand = (Script)eResolveProxy(oldStopCommand);
            if (stopCommand != oldStopCommand) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.LIFE_CYCLE__STOP_COMMAND, oldStopCommand, stopCommand));
            }
        }
        return stopCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script basicGetStopCommand() {
        return stopCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStopCommand(Script newStopCommand) {
        Script oldStopCommand = stopCommand;
        stopCommand = newStopCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__STOP_COMMAND, oldStopCommand, stopCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script getPreconfigureCommand() {
        if (preconfigureCommand != null && preconfigureCommand.eIsProxy()) {
            InternalEObject oldPreconfigureCommand = (InternalEObject)preconfigureCommand;
            preconfigureCommand = (Script)eResolveProxy(oldPreconfigureCommand);
            if (preconfigureCommand != oldPreconfigureCommand) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.LIFE_CYCLE__PRECONFIGURE_COMMAND, oldPreconfigureCommand, preconfigureCommand));
            }
        }
        return preconfigureCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script basicGetPreconfigureCommand() {
        return preconfigureCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreconfigureCommand(Script newPreconfigureCommand) {
        Script oldPreconfigureCommand = preconfigureCommand;
        preconfigureCommand = newPreconfigureCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__PRECONFIGURE_COMMAND, oldPreconfigureCommand, preconfigureCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script getCreateCommand() {
        if (createCommand != null && createCommand.eIsProxy()) {
            InternalEObject oldCreateCommand = (InternalEObject)createCommand;
            createCommand = (Script)eResolveProxy(oldCreateCommand);
            if (createCommand != oldCreateCommand) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.LIFE_CYCLE__CREATE_COMMAND, oldCreateCommand, createCommand));
            }
        }
        return createCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script basicGetCreateCommand() {
        return createCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCreateCommand(Script newCreateCommand) {
        Script oldCreateCommand = createCommand;
        createCommand = newCreateCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__CREATE_COMMAND, oldCreateCommand, createCommand));
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
                if (resolve) return getDownloadCommand();
                return basicGetDownloadCommand();
            case DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND:
                if (resolve) return getInstallCommand();
                return basicGetInstallCommand();
            case DdsmPackage.LIFE_CYCLE__START_COMMAND:
                if (resolve) return getStartCommand();
                return basicGetStartCommand();
            case DdsmPackage.LIFE_CYCLE__STOP_COMMAND:
                if (resolve) return getStopCommand();
                return basicGetStopCommand();
            case DdsmPackage.LIFE_CYCLE__PRECONFIGURE_COMMAND:
                if (resolve) return getPreconfigureCommand();
                return basicGetPreconfigureCommand();
            case DdsmPackage.LIFE_CYCLE__CREATE_COMMAND:
                if (resolve) return getCreateCommand();
                return basicGetCreateCommand();
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
                setDownloadCommand((Script)newValue);
                return;
            case DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND:
                setInstallCommand((Script)newValue);
                return;
            case DdsmPackage.LIFE_CYCLE__START_COMMAND:
                setStartCommand((Script)newValue);
                return;
            case DdsmPackage.LIFE_CYCLE__STOP_COMMAND:
                setStopCommand((Script)newValue);
                return;
            case DdsmPackage.LIFE_CYCLE__PRECONFIGURE_COMMAND:
                setPreconfigureCommand((Script)newValue);
                return;
            case DdsmPackage.LIFE_CYCLE__CREATE_COMMAND:
                setCreateCommand((Script)newValue);
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
                setDownloadCommand((Script)null);
                return;
            case DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND:
                setInstallCommand((Script)null);
                return;
            case DdsmPackage.LIFE_CYCLE__START_COMMAND:
                setStartCommand((Script)null);
                return;
            case DdsmPackage.LIFE_CYCLE__STOP_COMMAND:
                setStopCommand((Script)null);
                return;
            case DdsmPackage.LIFE_CYCLE__PRECONFIGURE_COMMAND:
                setPreconfigureCommand((Script)null);
                return;
            case DdsmPackage.LIFE_CYCLE__CREATE_COMMAND:
                setCreateCommand((Script)null);
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
                return downloadCommand != null;
            case DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND:
                return installCommand != null;
            case DdsmPackage.LIFE_CYCLE__START_COMMAND:
                return startCommand != null;
            case DdsmPackage.LIFE_CYCLE__STOP_COMMAND:
                return stopCommand != null;
            case DdsmPackage.LIFE_CYCLE__PRECONFIGURE_COMMAND:
                return preconfigureCommand != null;
            case DdsmPackage.LIFE_CYCLE__CREATE_COMMAND:
                return createCommand != null;
        }
        return super.eIsSet(featureID);
    }

} //LifeCycleImpl
