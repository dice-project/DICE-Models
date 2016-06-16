/**
 */
package ddsm.impl;

import ddsm.Component;
import ddsm.DdsmPackage;
import ddsm.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.PortImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link ddsm.impl.PortImpl#getPortId <em>Port Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends MinimalEObjectImpl.Container implements Port {
    /**
     * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponent()
     * @generated
     * @ordered
     */
    protected Component component;

    /**
     * The default value of the '{@link #getPortId() <em>Port Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPortId()
     * @generated
     * @ordered
     */
    protected static final String PORT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPortId() <em>Port Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPortId()
     * @generated
     * @ordered
     */
    protected String portId = PORT_ID_EDEFAULT;

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
    public Component getComponent() {
        if (component != null && component.eIsProxy()) {
            InternalEObject oldComponent = (InternalEObject)component;
            component = (Component)eResolveProxy(oldComponent);
            if (component != oldComponent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.PORT__COMPONENT, oldComponent, component));
            }
        }
        return component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component basicGetComponent() {
        return component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComponent(Component newComponent) {
        Component oldComponent = component;
        component = newComponent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.PORT__COMPONENT, oldComponent, component));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPortId() {
        return portId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPortId(String newPortId) {
        String oldPortId = portId;
        portId = newPortId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.PORT__PORT_ID, oldPortId, portId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.PORT__COMPONENT:
                if (resolve) return getComponent();
                return basicGetComponent();
            case DdsmPackage.PORT__PORT_ID:
                return getPortId();
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
            case DdsmPackage.PORT__COMPONENT:
                setComponent((Component)newValue);
                return;
            case DdsmPackage.PORT__PORT_ID:
                setPortId((String)newValue);
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
            case DdsmPackage.PORT__COMPONENT:
                setComponent((Component)null);
                return;
            case DdsmPackage.PORT__PORT_ID:
                setPortId(PORT_ID_EDEFAULT);
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
            case DdsmPackage.PORT__COMPONENT:
                return component != null;
            case DdsmPackage.PORT__PORT_ID:
                return PORT_ID_EDEFAULT == null ? portId != null : !PORT_ID_EDEFAULT.equals(portId);
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
        result.append(" (portId: ");
        result.append(portId);
        result.append(')');
        return result.toString();
    }

} //PortImpl
