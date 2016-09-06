/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.PortImpl#isIsLocal <em>Is Local</em>}</li>
 *   <li>{@link ddsm.impl.PortImpl#getPortNumber <em>Port Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortImpl extends CloudElementImpl implements Port {
    /**
     * The default value of the '{@link #isIsLocal() <em>Is Local</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsLocal()
     * @generated
     * @ordered
     */
    protected static final boolean IS_LOCAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsLocal() <em>Is Local</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsLocal()
     * @generated
     * @ordered
     */
    protected boolean isLocal = IS_LOCAL_EDEFAULT;

    /**
     * The default value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPortNumber()
     * @generated
     * @ordered
     */
    protected static final String PORT_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPortNumber()
     * @generated
     * @ordered
     */
    protected String portNumber = PORT_NUMBER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PortImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.PORT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsLocal() {
        return isLocal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsLocal(boolean newIsLocal) {
        boolean oldIsLocal = isLocal;
        isLocal = newIsLocal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.PORT__IS_LOCAL, oldIsLocal, isLocal));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPortNumber() {
        return portNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPortNumber(String newPortNumber) {
        String oldPortNumber = portNumber;
        portNumber = newPortNumber;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.PORT__PORT_NUMBER, oldPortNumber, portNumber));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.PORT__IS_LOCAL:
                return isIsLocal();
            case DdsmPackage.PORT__PORT_NUMBER:
                return getPortNumber();
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
            case DdsmPackage.PORT__IS_LOCAL:
                setIsLocal((Boolean)newValue);
                return;
            case DdsmPackage.PORT__PORT_NUMBER:
                setPortNumber((String)newValue);
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
            case DdsmPackage.PORT__IS_LOCAL:
                setIsLocal(IS_LOCAL_EDEFAULT);
                return;
            case DdsmPackage.PORT__PORT_NUMBER:
                setPortNumber(PORT_NUMBER_EDEFAULT);
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
            case DdsmPackage.PORT__IS_LOCAL:
                return isLocal != IS_LOCAL_EDEFAULT;
            case DdsmPackage.PORT__PORT_NUMBER:
                return PORT_NUMBER_EDEFAULT == null ? portNumber != null : !PORT_NUMBER_EDEFAULT.equals(portNumber);
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
        result.append(" (isLocal: ");
        result.append(isLocal);
        result.append(", portNumber: ");
        result.append(portNumber);
        result.append(')');
        return result.toString();
    }

} //PortImpl
