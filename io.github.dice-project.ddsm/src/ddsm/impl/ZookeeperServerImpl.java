/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.ZookeeperServer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zookeeper Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ZookeeperServerImpl#getTickTime <em>Tick Time</em>}</li>
 *   <li>{@link ddsm.impl.ZookeeperServerImpl#getSyncLimit <em>Sync Limit</em>}</li>
 *   <li>{@link ddsm.impl.ZookeeperServerImpl#getInitLimit <em>Init Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZookeeperServerImpl extends PeerNodeImpl implements ZookeeperServer {
    /**
     * The default value of the '{@link #getTickTime() <em>Tick Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTickTime()
     * @generated
     * @ordered
     */
    protected static final int TICK_TIME_EDEFAULT = 1500;

    /**
     * The cached value of the '{@link #getTickTime() <em>Tick Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTickTime()
     * @generated
     * @ordered
     */
    protected int tickTime = TICK_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getSyncLimit() <em>Sync Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSyncLimit()
     * @generated
     * @ordered
     */
    protected static final int SYNC_LIMIT_EDEFAULT = 10;

    /**
     * The cached value of the '{@link #getSyncLimit() <em>Sync Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSyncLimit()
     * @generated
     * @ordered
     */
    protected int syncLimit = SYNC_LIMIT_EDEFAULT;

    /**
     * The default value of the '{@link #getInitLimit() <em>Init Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitLimit()
     * @generated
     * @ordered
     */
    protected static final int INIT_LIMIT_EDEFAULT = 5;

    /**
     * The cached value of the '{@link #getInitLimit() <em>Init Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitLimit()
     * @generated
     * @ordered
     */
    protected int initLimit = INIT_LIMIT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ZookeeperServerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.ZOOKEEPER_SERVER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTickTime() {
        return tickTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTickTime(int newTickTime) {
        int oldTickTime = tickTime;
        tickTime = newTickTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.ZOOKEEPER_SERVER__TICK_TIME, oldTickTime, tickTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSyncLimit() {
        return syncLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSyncLimit(int newSyncLimit) {
        int oldSyncLimit = syncLimit;
        syncLimit = newSyncLimit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.ZOOKEEPER_SERVER__SYNC_LIMIT, oldSyncLimit, syncLimit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getInitLimit() {
        return initLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitLimit(int newInitLimit) {
        int oldInitLimit = initLimit;
        initLimit = newInitLimit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.ZOOKEEPER_SERVER__INIT_LIMIT, oldInitLimit, initLimit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.ZOOKEEPER_SERVER__TICK_TIME:
                return getTickTime();
            case DdsmPackage.ZOOKEEPER_SERVER__SYNC_LIMIT:
                return getSyncLimit();
            case DdsmPackage.ZOOKEEPER_SERVER__INIT_LIMIT:
                return getInitLimit();
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
            case DdsmPackage.ZOOKEEPER_SERVER__TICK_TIME:
                setTickTime((Integer)newValue);
                return;
            case DdsmPackage.ZOOKEEPER_SERVER__SYNC_LIMIT:
                setSyncLimit((Integer)newValue);
                return;
            case DdsmPackage.ZOOKEEPER_SERVER__INIT_LIMIT:
                setInitLimit((Integer)newValue);
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
            case DdsmPackage.ZOOKEEPER_SERVER__TICK_TIME:
                setTickTime(TICK_TIME_EDEFAULT);
                return;
            case DdsmPackage.ZOOKEEPER_SERVER__SYNC_LIMIT:
                setSyncLimit(SYNC_LIMIT_EDEFAULT);
                return;
            case DdsmPackage.ZOOKEEPER_SERVER__INIT_LIMIT:
                setInitLimit(INIT_LIMIT_EDEFAULT);
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
            case DdsmPackage.ZOOKEEPER_SERVER__TICK_TIME:
                return tickTime != TICK_TIME_EDEFAULT;
            case DdsmPackage.ZOOKEEPER_SERVER__SYNC_LIMIT:
                return syncLimit != SYNC_LIMIT_EDEFAULT;
            case DdsmPackage.ZOOKEEPER_SERVER__INIT_LIMIT:
                return initLimit != INIT_LIMIT_EDEFAULT;
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
        result.append(" (tickTime: ");
        result.append(tickTime);
        result.append(", syncLimit: ");
        result.append(syncLimit);
        result.append(", initLimit: ");
        result.append(initLimit);
        result.append(')');
        return result.toString();
    }

} //ZookeeperServerImpl
