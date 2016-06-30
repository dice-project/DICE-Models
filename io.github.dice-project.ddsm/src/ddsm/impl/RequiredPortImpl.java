/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.RequiredPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.RequiredPortImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredPortImpl extends PortImpl implements RequiredPort {
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
    protected RequiredPortImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.REQUIRED_PORT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.REQUIRED_PORT__IS_MANDATORY, oldIsMandatory, isMandatory));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.REQUIRED_PORT__IS_MANDATORY:
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
            case DdsmPackage.REQUIRED_PORT__IS_MANDATORY:
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
            case DdsmPackage.REQUIRED_PORT__IS_MANDATORY:
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
            case DdsmPackage.REQUIRED_PORT__IS_MANDATORY:
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

} //RequiredPortImpl
