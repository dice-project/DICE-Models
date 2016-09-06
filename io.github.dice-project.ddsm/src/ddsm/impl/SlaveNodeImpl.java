/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.MasterNode;
import ddsm.SlaveNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slave Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.SlaveNodeImpl#getHasMaster <em>Has Master</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlaveNodeImpl extends InternalComponentImpl implements SlaveNode {
    /**
     * The cached value of the '{@link #getHasMaster() <em>Has Master</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHasMaster()
     * @generated
     * @ordered
     */
    protected MasterNode hasMaster;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SlaveNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.SLAVE_NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MasterNode getHasMaster() {
        if (hasMaster != null && hasMaster.eIsProxy()) {
            InternalEObject oldHasMaster = (InternalEObject)hasMaster;
            hasMaster = (MasterNode)eResolveProxy(oldHasMaster);
            if (hasMaster != oldHasMaster) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.SLAVE_NODE__HAS_MASTER, oldHasMaster, hasMaster));
            }
        }
        return hasMaster;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MasterNode basicGetHasMaster() {
        return hasMaster;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHasMaster(MasterNode newHasMaster) {
        MasterNode oldHasMaster = hasMaster;
        hasMaster = newHasMaster;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.SLAVE_NODE__HAS_MASTER, oldHasMaster, hasMaster));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.SLAVE_NODE__HAS_MASTER:
                if (resolve) return getHasMaster();
                return basicGetHasMaster();
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
            case DdsmPackage.SLAVE_NODE__HAS_MASTER:
                setHasMaster((MasterNode)newValue);
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
            case DdsmPackage.SLAVE_NODE__HAS_MASTER:
                setHasMaster((MasterNode)null);
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
            case DdsmPackage.SLAVE_NODE__HAS_MASTER:
                return hasMaster != null;
        }
        return super.eIsSet(featureID);
    }

} //SlaveNodeImpl
