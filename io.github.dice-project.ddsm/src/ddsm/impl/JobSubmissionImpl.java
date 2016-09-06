/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.JobSubmission;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Submission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.JobSubmissionImpl#getArtifactUrl <em>Artifact Url</em>}</li>
 *   <li>{@link ddsm.impl.JobSubmissionImpl#getMainClass <em>Main Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobSubmissionImpl extends CloudElementImpl implements JobSubmission {
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
    protected JobSubmissionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.JOB_SUBMISSION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.JOB_SUBMISSION__ARTIFACT_URL, oldArtifactUrl, artifactUrl));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.JOB_SUBMISSION__MAIN_CLASS, oldMainClass, mainClass));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.JOB_SUBMISSION__ARTIFACT_URL:
                return getArtifactUrl();
            case DdsmPackage.JOB_SUBMISSION__MAIN_CLASS:
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
            case DdsmPackage.JOB_SUBMISSION__ARTIFACT_URL:
                setArtifactUrl((String)newValue);
                return;
            case DdsmPackage.JOB_SUBMISSION__MAIN_CLASS:
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
            case DdsmPackage.JOB_SUBMISSION__ARTIFACT_URL:
                setArtifactUrl(ARTIFACT_URL_EDEFAULT);
                return;
            case DdsmPackage.JOB_SUBMISSION__MAIN_CLASS:
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
            case DdsmPackage.JOB_SUBMISSION__ARTIFACT_URL:
                return ARTIFACT_URL_EDEFAULT == null ? artifactUrl != null : !ARTIFACT_URL_EDEFAULT.equals(artifactUrl);
            case DdsmPackage.JOB_SUBMISSION__MAIN_CLASS:
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
        result.append(" (artifactUrl: ");
        result.append(artifactUrl);
        result.append(", mainClass: ");
        result.append(mainClass);
        result.append(')');
        return result.toString();
    }

} //JobSubmissionImpl
