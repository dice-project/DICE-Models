/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.Resource;
import ddsm.Script;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
     * The cached value of the '{@link #getScripts() <em>Scripts</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScripts()
     * @generated
     * @ordered
     */
    protected Script scripts;

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
    public Script getScripts() {
        return scripts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetScripts(Script newScripts, NotificationChain msgs) {
        Script oldScripts = scripts;
        scripts = newScripts;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsmPackage.RESOURCE__SCRIPTS, oldScripts, newScripts);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScripts(Script newScripts) {
        if (newScripts != scripts) {
            NotificationChain msgs = null;
            if (scripts != null)
                msgs = ((InternalEObject)scripts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsmPackage.RESOURCE__SCRIPTS, null, msgs);
            if (newScripts != null)
                msgs = ((InternalEObject)newScripts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsmPackage.RESOURCE__SCRIPTS, null, msgs);
            msgs = basicSetScripts(newScripts, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.RESOURCE__SCRIPTS, newScripts, newScripts));
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
                return basicSetScripts(null, msgs);
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
                setScripts((Script)newValue);
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
                setScripts((Script)null);
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
                return scripts != null;
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
