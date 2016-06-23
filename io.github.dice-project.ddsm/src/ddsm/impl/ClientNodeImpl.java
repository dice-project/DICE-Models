/**
 */
package ddsm.impl;

import ddsm.ClientNode;
import ddsm.DdsmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ClientNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link ddsm.impl.ClientNodeImpl#getArtifactUrl <em>Artifact Url</em>}</li>
 *   <li>{@link ddsm.impl.ClientNodeImpl#getMainClass <em>Main Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientNodeImpl extends InternalComponentImpl implements ClientNode {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getArtifactUrl() <em>Artifact Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArtifactUrl()
     * @generated
     * @ordered
     */
    protected static final String ARTIFACT_URL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getArtifactUrl() <em>Artifact Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArtifactUrl()
     * @generated
     * @ordered
     */
    protected String artifactUrl = ARTIFACT_URL_EDEFAULT;

    /**
     * The default value of the '{@link #getMainClass() <em>Main Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMainClass()
     * @generated
     * @ordered
     */
    protected static final String MAIN_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMainClass() <em>Main Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMainClass()
     * @generated
     * @ordered
     */
    protected String mainClass = MAIN_CLASS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClientNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.CLIENT_NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CLIENT_NODE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getArtifactUrl() {
        return artifactUrl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setArtifactUrl(String newArtifactUrl) {
        String oldArtifactUrl = artifactUrl;
        artifactUrl = newArtifactUrl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CLIENT_NODE__ARTIFACT_URL, oldArtifactUrl, artifactUrl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMainClass() {
        return mainClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMainClass(String newMainClass) {
        String oldMainClass = mainClass;
        mainClass = newMainClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CLIENT_NODE__MAIN_CLASS, oldMainClass, mainClass));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.CLIENT_NODE__TYPE:
                return getType();
            case DdsmPackage.CLIENT_NODE__ARTIFACT_URL:
                return getArtifactUrl();
            case DdsmPackage.CLIENT_NODE__MAIN_CLASS:
                return getMainClass();
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
            case DdsmPackage.CLIENT_NODE__TYPE:
                setType((String)newValue);
                return;
            case DdsmPackage.CLIENT_NODE__ARTIFACT_URL:
                setArtifactUrl((String)newValue);
                return;
            case DdsmPackage.CLIENT_NODE__MAIN_CLASS:
                setMainClass((String)newValue);
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
            case DdsmPackage.CLIENT_NODE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case DdsmPackage.CLIENT_NODE__ARTIFACT_URL:
                setArtifactUrl(ARTIFACT_URL_EDEFAULT);
                return;
            case DdsmPackage.CLIENT_NODE__MAIN_CLASS:
                setMainClass(MAIN_CLASS_EDEFAULT);
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
            case DdsmPackage.CLIENT_NODE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case DdsmPackage.CLIENT_NODE__ARTIFACT_URL:
                return ARTIFACT_URL_EDEFAULT == null ? artifactUrl != null : !ARTIFACT_URL_EDEFAULT.equals(artifactUrl);
            case DdsmPackage.CLIENT_NODE__MAIN_CLASS:
                return MAIN_CLASS_EDEFAULT == null ? mainClass != null : !MAIN_CLASS_EDEFAULT.equals(mainClass);
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
        result.append(" (type: ");
        result.append(type);
        result.append(", artifactUrl: ");
        result.append(artifactUrl);
        result.append(", mainClass: ");
        result.append(mainClass);
        result.append(')');
        return result.toString();
    }

} //ClientNodeImpl
