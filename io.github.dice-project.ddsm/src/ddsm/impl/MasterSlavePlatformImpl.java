/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.MasterSlavePlatform;
import ddsm.RequiredExecutionPlatform;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master Slave Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.MasterSlavePlatformImpl#getRequiresMasterVm <em>Requires Master Vm</em>}</li>
 *   <li>{@link ddsm.impl.MasterSlavePlatformImpl#getRequiresSlaveVm <em>Requires Slave Vm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MasterSlavePlatformImpl extends InternalComponentImpl implements MasterSlavePlatform {
    /**
     * The cached value of the '{@link #getRequiresMasterVm() <em>Requires Master Vm</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequiresMasterVm()
     * @generated
     * @ordered
     */
    protected RequiredExecutionPlatform requiresMasterVm;

    /**
     * The cached value of the '{@link #getRequiresSlaveVm() <em>Requires Slave Vm</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequiresSlaveVm()
     * @generated
     * @ordered
     */
    protected EList<RequiredExecutionPlatform> requiresSlaveVm;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MasterSlavePlatformImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.MASTER_SLAVE_PLATFORM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RequiredExecutionPlatform getRequiresMasterVm() {
        if (requiresMasterVm != null && requiresMasterVm.eIsProxy()) {
            InternalEObject oldRequiresMasterVm = (InternalEObject)requiresMasterVm;
            requiresMasterVm = (RequiredExecutionPlatform)eResolveProxy(oldRequiresMasterVm);
            if (requiresMasterVm != oldRequiresMasterVm) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.MASTER_SLAVE_PLATFORM__REQUIRES_MASTER_VM, oldRequiresMasterVm, requiresMasterVm));
            }
        }
        return requiresMasterVm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RequiredExecutionPlatform basicGetRequiresMasterVm() {
        return requiresMasterVm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequiresMasterVm(RequiredExecutionPlatform newRequiresMasterVm) {
        RequiredExecutionPlatform oldRequiresMasterVm = requiresMasterVm;
        requiresMasterVm = newRequiresMasterVm;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.MASTER_SLAVE_PLATFORM__REQUIRES_MASTER_VM, oldRequiresMasterVm, requiresMasterVm));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RequiredExecutionPlatform> getRequiresSlaveVm() {
        if (requiresSlaveVm == null) {
            requiresSlaveVm = new EObjectResolvingEList<RequiredExecutionPlatform>(RequiredExecutionPlatform.class, this, DdsmPackage.MASTER_SLAVE_PLATFORM__REQUIRES_SLAVE_VM);
        }
        return requiresSlaveVm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.MASTER_SLAVE_PLATFORM__REQUIRES_MASTER_VM:
                if (resolve) return getRequiresMasterVm();
                return basicGetRequiresMasterVm();
            case DdsmPackage.MASTER_SLAVE_PLATFORM__REQUIRES_SLAVE_VM:
                return getRequiresSlaveVm();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DdsmPackage.MASTER_SLAVE_PLATFORM__REQUIRES_MASTER_VM:
                setRequiresMasterVm((RequiredExecutionPlatform)newValue);
                return;
            case DdsmPackage.MASTER_SLAVE_PLATFORM__REQUIRES_SLAVE_VM:
                getRequiresSlaveVm().clear();
                getRequiresSlaveVm().addAll((Collection<? extends RequiredExecutionPlatform>)newValue);
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
            case DdsmPackage.MASTER_SLAVE_PLATFORM__REQUIRES_MASTER_VM:
                setRequiresMasterVm((RequiredExecutionPlatform)null);
                return;
            case DdsmPackage.MASTER_SLAVE_PLATFORM__REQUIRES_SLAVE_VM:
                getRequiresSlaveVm().clear();
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
            case DdsmPackage.MASTER_SLAVE_PLATFORM__REQUIRES_MASTER_VM:
                return requiresMasterVm != null;
            case DdsmPackage.MASTER_SLAVE_PLATFORM__REQUIRES_SLAVE_VM:
                return requiresSlaveVm != null && !requiresSlaveVm.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //MasterSlavePlatformImpl
