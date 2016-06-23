/**
 */
package ddsm.impl;

import ddsm.Cluster;
import ddsm.DdsmPackage;
import ddsm.VM;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ClusterImpl#getHasVm <em>Has Vm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterImpl extends ExternalComponentImpl implements Cluster {
    /**
     * The cached value of the '{@link #getHasVm() <em>Has Vm</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHasVm()
     * @generated
     * @ordered
     */
    protected VM hasVm;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClusterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.CLUSTER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VM getHasVm() {
        if (hasVm != null && hasVm.eIsProxy()) {
            InternalEObject oldHasVm = (InternalEObject)hasVm;
            hasVm = (VM)eResolveProxy(oldHasVm);
            if (hasVm != oldHasVm) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.CLUSTER__HAS_VM, oldHasVm, hasVm));
            }
        }
        return hasVm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VM basicGetHasVm() {
        return hasVm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHasVm(VM newHasVm) {
        VM oldHasVm = hasVm;
        hasVm = newHasVm;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CLUSTER__HAS_VM, oldHasVm, hasVm));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.CLUSTER__HAS_VM:
                if (resolve) return getHasVm();
                return basicGetHasVm();
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
            case DdsmPackage.CLUSTER__HAS_VM:
                setHasVm((VM)newValue);
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
            case DdsmPackage.CLUSTER__HAS_VM:
                setHasVm((VM)null);
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
            case DdsmPackage.CLUSTER__HAS_VM:
                return hasVm != null;
        }
        return super.eIsSet(featureID);
    }

} //ClusterImpl
