/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.RequiredExecutionPlatform;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Execution Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.RequiredExecutionPlatformImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredExecutionPlatformImpl extends ExecutionPlatformImpl implements RequiredExecutionPlatform {
    /**
     * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsMandatory()
     * @generated
     * @ordered
     */
    protected static final boolean IS_MANDATORY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsMandatory()
     * @generated
     * @ordered
     */
    protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RequiredExecutionPlatformImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.REQUIRED_EXECUTION_PLATFORM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsMandatory() {
        return isMandatory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsMandatory(boolean newIsMandatory) {
        boolean oldIsMandatory = isMandatory;
        isMandatory = newIsMandatory;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.REQUIRED_EXECUTION_PLATFORM__IS_MANDATORY, oldIsMandatory, isMandatory));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.REQUIRED_EXECUTION_PLATFORM__IS_MANDATORY:
                return isIsMandatory();
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
            case DdsmPackage.REQUIRED_EXECUTION_PLATFORM__IS_MANDATORY:
                setIsMandatory((Boolean)newValue);
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
            case DdsmPackage.REQUIRED_EXECUTION_PLATFORM__IS_MANDATORY:
                setIsMandatory(IS_MANDATORY_EDEFAULT);
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
            case DdsmPackage.REQUIRED_EXECUTION_PLATFORM__IS_MANDATORY:
                return isMandatory != IS_MANDATORY_EDEFAULT;
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
        result.append(" (isMandatory: ");
        result.append(isMandatory);
        result.append(')');
        return result.toString();
    }

} //RequiredExecutionPlatformImpl
