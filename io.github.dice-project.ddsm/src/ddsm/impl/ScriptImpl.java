/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.Script;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ScriptImpl#getScriptId <em>Script Id</em>}</li>
 *   <li>{@link ddsm.impl.ScriptImpl#getScriptUri <em>Script Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script {
    /**
     * The default value of the '{@link #getScriptId() <em>Script Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScriptId()
     * @generated
     * @ordered
     */
    protected static final String SCRIPT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScriptId() <em>Script Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScriptId()
     * @generated
     * @ordered
     */
    protected String scriptId = SCRIPT_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getScriptUri() <em>Script Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScriptUri()
     * @generated
     * @ordered
     */
    protected static final String SCRIPT_URI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScriptUri() <em>Script Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScriptUri()
     * @generated
     * @ordered
     */
    protected String scriptUri = SCRIPT_URI_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScriptImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.SCRIPT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getScriptId() {
        return scriptId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScriptId(String newScriptId) {
        String oldScriptId = scriptId;
        scriptId = newScriptId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.SCRIPT__SCRIPT_ID, oldScriptId, scriptId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getScriptUri() {
        return scriptUri;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScriptUri(String newScriptUri) {
        String oldScriptUri = scriptUri;
        scriptUri = newScriptUri;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.SCRIPT__SCRIPT_URI, oldScriptUri, scriptUri));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.SCRIPT__SCRIPT_ID:
                return getScriptId();
            case DdsmPackage.SCRIPT__SCRIPT_URI:
                return getScriptUri();
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
            case DdsmPackage.SCRIPT__SCRIPT_ID:
                setScriptId((String)newValue);
                return;
            case DdsmPackage.SCRIPT__SCRIPT_URI:
                setScriptUri((String)newValue);
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
            case DdsmPackage.SCRIPT__SCRIPT_ID:
                setScriptId(SCRIPT_ID_EDEFAULT);
                return;
            case DdsmPackage.SCRIPT__SCRIPT_URI:
                setScriptUri(SCRIPT_URI_EDEFAULT);
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
            case DdsmPackage.SCRIPT__SCRIPT_ID:
                return SCRIPT_ID_EDEFAULT == null ? scriptId != null : !SCRIPT_ID_EDEFAULT.equals(scriptId);
            case DdsmPackage.SCRIPT__SCRIPT_URI:
                return SCRIPT_URI_EDEFAULT == null ? scriptUri != null : !SCRIPT_URI_EDEFAULT.equals(scriptUri);
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
        result.append(" (scriptId: ");
        result.append(scriptId);
        result.append(", scriptUri: ");
        result.append(scriptUri);
        result.append(')');
        return result.toString();
    }

} //ScriptImpl
