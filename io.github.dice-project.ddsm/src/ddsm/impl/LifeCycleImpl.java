/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.LifeCycle;
import ddsm.Script;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
     * The cached value of the '{@link #getDownloadCommand() <em>Download Command</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDownloadCommand()
     * @generated
     * @ordered
     */
    protected Script downloadCommand;

    /**
     * The cached value of the '{@link #getInstallCommand() <em>Install Command</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstallCommand()
     * @generated
     * @ordered
     */
    protected Script installCommand;

    /**
     * The cached value of the '{@link #getStartCommand() <em>Start Command</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartCommand()
     * @generated
     * @ordered
     */
    protected Script startCommand;

    /**
     * The cached value of the '{@link #getStopCommand() <em>Stop Command</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStopCommand()
     * @generated
     * @ordered
     */
    protected Script stopCommand;

    /**
     * The cached value of the '{@link #getPreconfigureCommand() <em>Preconfigure Command</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreconfigureCommand()
     * @generated
     * @ordered
     */
    protected Script preconfigureCommand;

    /**
     * The cached value of the '{@link #getCreateCommand() <em>Create Command</em>}' containment reference.
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
        return downloadCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDownloadCommand(Script newDownloadCommand, NotificationChain msgs) {
        Script oldDownloadCommand = downloadCommand;
        downloadCommand = newDownloadCommand;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__DOWNLOAD_COMMAND, oldDownloadCommand, newDownloadCommand);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDownloadCommand(Script newDownloadCommand) {
        if (newDownloadCommand != downloadCommand) {
            NotificationChain msgs = null;
            if (downloadCommand != null)
                msgs = ((InternalEObject)downloadCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsmPackage.LIFE_CYCLE__DOWNLOAD_COMMAND, null, msgs);
            if (newDownloadCommand != null)
                msgs = ((InternalEObject)newDownloadCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsmPackage.LIFE_CYCLE__DOWNLOAD_COMMAND, null, msgs);
            msgs = basicSetDownloadCommand(newDownloadCommand, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__DOWNLOAD_COMMAND, newDownloadCommand, newDownloadCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script getInstallCommand() {
        return installCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInstallCommand(Script newInstallCommand, NotificationChain msgs) {
        Script oldInstallCommand = installCommand;
        installCommand = newInstallCommand;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND, oldInstallCommand, newInstallCommand);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstallCommand(Script newInstallCommand) {
        if (newInstallCommand != installCommand) {
            NotificationChain msgs = null;
            if (installCommand != null)
                msgs = ((InternalEObject)installCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND, null, msgs);
            if (newInstallCommand != null)
                msgs = ((InternalEObject)newInstallCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND, null, msgs);
            msgs = basicSetInstallCommand(newInstallCommand, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND, newInstallCommand, newInstallCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script getStartCommand() {
        return startCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStartCommand(Script newStartCommand, NotificationChain msgs) {
        Script oldStartCommand = startCommand;
        startCommand = newStartCommand;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__START_COMMAND, oldStartCommand, newStartCommand);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartCommand(Script newStartCommand) {
        if (newStartCommand != startCommand) {
            NotificationChain msgs = null;
            if (startCommand != null)
                msgs = ((InternalEObject)startCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsmPackage.LIFE_CYCLE__START_COMMAND, null, msgs);
            if (newStartCommand != null)
                msgs = ((InternalEObject)newStartCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsmPackage.LIFE_CYCLE__START_COMMAND, null, msgs);
            msgs = basicSetStartCommand(newStartCommand, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__START_COMMAND, newStartCommand, newStartCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script getStopCommand() {
        return stopCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStopCommand(Script newStopCommand, NotificationChain msgs) {
        Script oldStopCommand = stopCommand;
        stopCommand = newStopCommand;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__STOP_COMMAND, oldStopCommand, newStopCommand);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStopCommand(Script newStopCommand) {
        if (newStopCommand != stopCommand) {
            NotificationChain msgs = null;
            if (stopCommand != null)
                msgs = ((InternalEObject)stopCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsmPackage.LIFE_CYCLE__STOP_COMMAND, null, msgs);
            if (newStopCommand != null)
                msgs = ((InternalEObject)newStopCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsmPackage.LIFE_CYCLE__STOP_COMMAND, null, msgs);
            msgs = basicSetStopCommand(newStopCommand, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__STOP_COMMAND, newStopCommand, newStopCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script getPreconfigureCommand() {
        return preconfigureCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPreconfigureCommand(Script newPreconfigureCommand, NotificationChain msgs) {
        Script oldPreconfigureCommand = preconfigureCommand;
        preconfigureCommand = newPreconfigureCommand;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__PRECONFIGURE_COMMAND, oldPreconfigureCommand, newPreconfigureCommand);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreconfigureCommand(Script newPreconfigureCommand) {
        if (newPreconfigureCommand != preconfigureCommand) {
            NotificationChain msgs = null;
            if (preconfigureCommand != null)
                msgs = ((InternalEObject)preconfigureCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsmPackage.LIFE_CYCLE__PRECONFIGURE_COMMAND, null, msgs);
            if (newPreconfigureCommand != null)
                msgs = ((InternalEObject)newPreconfigureCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsmPackage.LIFE_CYCLE__PRECONFIGURE_COMMAND, null, msgs);
            msgs = basicSetPreconfigureCommand(newPreconfigureCommand, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__PRECONFIGURE_COMMAND, newPreconfigureCommand, newPreconfigureCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script getCreateCommand() {
        return createCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCreateCommand(Script newCreateCommand, NotificationChain msgs) {
        Script oldCreateCommand = createCommand;
        createCommand = newCreateCommand;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__CREATE_COMMAND, oldCreateCommand, newCreateCommand);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCreateCommand(Script newCreateCommand) {
        if (newCreateCommand != createCommand) {
            NotificationChain msgs = null;
            if (createCommand != null)
                msgs = ((InternalEObject)createCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsmPackage.LIFE_CYCLE__CREATE_COMMAND, null, msgs);
            if (newCreateCommand != null)
                msgs = ((InternalEObject)newCreateCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsmPackage.LIFE_CYCLE__CREATE_COMMAND, null, msgs);
            msgs = basicSetCreateCommand(newCreateCommand, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.LIFE_CYCLE__CREATE_COMMAND, newCreateCommand, newCreateCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DdsmPackage.LIFE_CYCLE__DOWNLOAD_COMMAND:
                return basicSetDownloadCommand(null, msgs);
            case DdsmPackage.LIFE_CYCLE__INSTALL_COMMAND:
                return basicSetInstallCommand(null, msgs);
            case DdsmPackage.LIFE_CYCLE__START_COMMAND:
                return basicSetStartCommand(null, msgs);
            case DdsmPackage.LIFE_CYCLE__STOP_COMMAND:
                return basicSetStopCommand(null, msgs);
            case DdsmPackage.LIFE_CYCLE__PRECONFIGURE_COMMAND:
                return basicSetPreconfigureCommand(null, msgs);
            case DdsmPackage.LIFE_CYCLE__CREATE_COMMAND:
                return basicSetCreateCommand(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
            case DdsmPackage.LIFE_CYCLE__PRECONFIGURE_COMMAND:
                return getPreconfigureCommand();
            case DdsmPackage.LIFE_CYCLE__CREATE_COMMAND:
                return getCreateCommand();
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
