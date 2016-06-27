/**
 */
package ddsm.impl;

import ddsm.Component;
import ddsm.DdsmPackage;
import ddsm.ProvidedPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ProvidedPortImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedPortImpl extends PortImpl implements ProvidedPort {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProvidedPortImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.PROVIDED_PORT;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.PROVIDED_PORT__OWNER, oldOwner, owner));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.PROVIDED_PORT__OWNER, oldOwner, owner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.PROVIDED_PORT__OWNER:
                if (resolve) return getOwner();
                return basicGetOwner();
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
            case DdsmPackage.PROVIDED_PORT__OWNER:
                setOwner((Component)newValue);
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
            case DdsmPackage.PROVIDED_PORT__OWNER:
                setOwner((Component)null);
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
            case DdsmPackage.PROVIDED_PORT__OWNER:
                return owner != null;
        }
        return super.eIsSet(featureID);
    }

} //ProvidedPortImpl
