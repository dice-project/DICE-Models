/**
 */
package ddsm.impl;

import ddsm.Component;
import ddsm.DdsmPackage;
import ddsm.ExecutionPlatform;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ExecutionPlatformImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link ddsm.impl.ExecutionPlatformImpl#getExecutionPlatformId <em>Execution Platform Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionPlatformImpl extends MinimalEObjectImpl.Container implements ExecutionPlatform {
    /**
     * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected Component owner;

    /**
     * The default value of the '{@link #getExecutionPlatformId() <em>Execution Platform Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionPlatformId()
     * @generated
     * @ordered
     */
    protected static final String EXECUTION_PLATFORM_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExecutionPlatformId() <em>Execution Platform Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionPlatformId()
     * @generated
     * @ordered
     */
    protected String executionPlatformId = EXECUTION_PLATFORM_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionPlatformImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.EXECUTION_PLATFORM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component getOwner() {
        if (owner != null && owner.eIsProxy()) {
            InternalEObject oldOwner = (InternalEObject)owner;
            owner = (Component)eResolveProxy(oldOwner);
            if (owner != oldOwner) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.EXECUTION_PLATFORM__OWNER, oldOwner, owner));
            }
        }
        return owner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component basicGetOwner() {
        return owner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwner(Component newOwner) {
        Component oldOwner = owner;
        owner = newOwner;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.EXECUTION_PLATFORM__OWNER, oldOwner, owner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExecutionPlatformId() {
        return executionPlatformId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionPlatformId(String newExecutionPlatformId) {
        String oldExecutionPlatformId = executionPlatformId;
        executionPlatformId = newExecutionPlatformId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.EXECUTION_PLATFORM__EXECUTION_PLATFORM_ID, oldExecutionPlatformId, executionPlatformId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.EXECUTION_PLATFORM__OWNER:
                if (resolve) return getOwner();
                return basicGetOwner();
            case DdsmPackage.EXECUTION_PLATFORM__EXECUTION_PLATFORM_ID:
                return getExecutionPlatformId();
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
            case DdsmPackage.EXECUTION_PLATFORM__OWNER:
                setOwner((Component)newValue);
                return;
            case DdsmPackage.EXECUTION_PLATFORM__EXECUTION_PLATFORM_ID:
                setExecutionPlatformId((String)newValue);
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
            case DdsmPackage.EXECUTION_PLATFORM__OWNER:
                setOwner((Component)null);
                return;
            case DdsmPackage.EXECUTION_PLATFORM__EXECUTION_PLATFORM_ID:
                setExecutionPlatformId(EXECUTION_PLATFORM_ID_EDEFAULT);
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
            case DdsmPackage.EXECUTION_PLATFORM__OWNER:
                return owner != null;
            case DdsmPackage.EXECUTION_PLATFORM__EXECUTION_PLATFORM_ID:
                return EXECUTION_PLATFORM_ID_EDEFAULT == null ? executionPlatformId != null : !EXECUTION_PLATFORM_ID_EDEFAULT.equals(executionPlatformId);
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
        result.append(" (executionPlatformId: ");
        result.append(executionPlatformId);
        result.append(')');
        return result.toString();
    }

} //ExecutionPlatformImpl
