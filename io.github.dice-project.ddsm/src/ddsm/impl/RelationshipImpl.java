/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.ProvidedPort;
import ddsm.Relationship;
import ddsm.RequiredPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.RelationshipImpl#getProvidedport <em>Providedport</em>}</li>
 *   <li>{@link ddsm.impl.RelationshipImpl#getRequiredport <em>Requiredport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends CloudElementImpl implements Relationship {
    /**
     * The cached value of the '{@link #getProvidedport() <em>Providedport</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvidedport()
     * @generated
     * @ordered
     */
    protected ProvidedPort providedport;

    /**
     * The cached value of the '{@link #getRequiredport() <em>Requiredport</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequiredport()
     * @generated
     * @ordered
     */
    protected RequiredPort requiredport;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationshipImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.RELATIONSHIP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProvidedPort getProvidedport() {
        if (providedport != null && providedport.eIsProxy()) {
            InternalEObject oldProvidedport = (InternalEObject)providedport;
            providedport = (ProvidedPort)eResolveProxy(oldProvidedport);
            if (providedport != oldProvidedport) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.RELATIONSHIP__PROVIDEDPORT, oldProvidedport, providedport));
            }
        }
        return providedport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProvidedPort basicGetProvidedport() {
        return providedport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProvidedport(ProvidedPort newProvidedport) {
        ProvidedPort oldProvidedport = providedport;
        providedport = newProvidedport;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.RELATIONSHIP__PROVIDEDPORT, oldProvidedport, providedport));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RequiredPort getRequiredport() {
        if (requiredport != null && requiredport.eIsProxy()) {
            InternalEObject oldRequiredport = (InternalEObject)requiredport;
            requiredport = (RequiredPort)eResolveProxy(oldRequiredport);
            if (requiredport != oldRequiredport) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.RELATIONSHIP__REQUIREDPORT, oldRequiredport, requiredport));
            }
        }
        return requiredport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RequiredPort basicGetRequiredport() {
        return requiredport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequiredport(RequiredPort newRequiredport) {
        RequiredPort oldRequiredport = requiredport;
        requiredport = newRequiredport;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.RELATIONSHIP__REQUIREDPORT, oldRequiredport, requiredport));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.RELATIONSHIP__PROVIDEDPORT:
                if (resolve) return getProvidedport();
                return basicGetProvidedport();
            case DdsmPackage.RELATIONSHIP__REQUIREDPORT:
                if (resolve) return getRequiredport();
                return basicGetRequiredport();
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
            case DdsmPackage.RELATIONSHIP__PROVIDEDPORT:
                setProvidedport((ProvidedPort)newValue);
                return;
            case DdsmPackage.RELATIONSHIP__REQUIREDPORT:
                setRequiredport((RequiredPort)newValue);
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
            case DdsmPackage.RELATIONSHIP__PROVIDEDPORT:
                setProvidedport((ProvidedPort)null);
                return;
            case DdsmPackage.RELATIONSHIP__REQUIREDPORT:
                setRequiredport((RequiredPort)null);
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
            case DdsmPackage.RELATIONSHIP__PROVIDEDPORT:
                return providedport != null;
            case DdsmPackage.RELATIONSHIP__REQUIREDPORT:
                return requiredport != null;
        }
        return super.eIsSet(featureID);
    }

} //RelationshipImpl
