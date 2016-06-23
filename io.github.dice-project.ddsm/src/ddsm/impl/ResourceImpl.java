/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.Resource;
import ddsm.Script;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ResourceImpl#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link ddsm.impl.ResourceImpl#getScripts <em>Scripts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
    /**
     * The default value of the '{@link #getResourceId() <em>Resource Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceId()
     * @generated
     * @ordered
     */
    protected static final String RESOURCE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResourceId() <em>Resource Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceId()
     * @generated
     * @ordered
     */
    protected String resourceId = RESOURCE_ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getScripts() <em>Scripts</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScripts()
     * @generated
     * @ordered
     */
    protected EList<Script> scripts;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.RESOURCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResourceId(String newResourceId) {
        String oldResourceId = resourceId;
        resourceId = newResourceId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.RESOURCE__RESOURCE_ID, oldResourceId, resourceId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Script> getScripts() {
        if (scripts == null) {
            scripts = new EObjectContainmentEList<Script>(Script.class, this, DdsmPackage.RESOURCE__SCRIPTS);
        }
        return scripts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DdsmPackage.RESOURCE__SCRIPTS:
                return ((InternalEList<?>)getScripts()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.RESOURCE__RESOURCE_ID:
                return getResourceId();
            case DdsmPackage.RESOURCE__SCRIPTS:
                return getScripts();
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
            case DdsmPackage.RESOURCE__RESOURCE_ID:
                setResourceId((String)newValue);
                return;
            case DdsmPackage.RESOURCE__SCRIPTS:
                getScripts().clear();
                getScripts().addAll((Collection<? extends Script>)newValue);
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
            case DdsmPackage.RESOURCE__RESOURCE_ID:
                setResourceId(RESOURCE_ID_EDEFAULT);
                return;
            case DdsmPackage.RESOURCE__SCRIPTS:
                getScripts().clear();
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
            case DdsmPackage.RESOURCE__RESOURCE_ID:
                return RESOURCE_ID_EDEFAULT == null ? resourceId != null : !RESOURCE_ID_EDEFAULT.equals(resourceId);
            case DdsmPackage.RESOURCE__SCRIPTS:
                return scripts != null && !scripts.isEmpty();
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
        result.append(" (resourceId: ");
        result.append(resourceId);
        result.append(')');
        return result.toString();
    }

} //ResourceImpl
