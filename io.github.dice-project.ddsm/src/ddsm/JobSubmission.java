/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Submission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.JobSubmission#getArtifactUrl <em>Artifact Url</em>}</li>
 *   <li>{@link ddsm.JobSubmission#getMainClass <em>Main Class</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getJobSubmission()
 * @model
 * @generated
 */
public interface JobSubmission extends CloudElement {
    /**
     * Returns the value of the '<em><b>Artifact Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Artifact Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Artifact Url</em>' attribute.
     * @see #setArtifactUrl(String)
     * @see ddsm.DdsmPackage#getJobSubmission_ArtifactUrl()
     * @model
     * @generated
     */
    String getArtifactUrl();

    /**
     * Sets the value of the '{@link ddsm.JobSubmission#getArtifactUrl <em>Artifact Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Artifact Url</em>' attribute.
     * @see #getArtifactUrl()
     * @generated
     */
    void setArtifactUrl(String value);

    /**
     * Returns the value of the '<em><b>Main Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Main Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Main Class</em>' attribute.
     * @see #setMainClass(String)
     * @see ddsm.DdsmPackage#getJobSubmission_MainClass()
     * @model
     * @generated
     */
    String getMainClass();

    /**
     * Sets the value of the '{@link ddsm.JobSubmission#getMainClass <em>Main Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Main Class</em>' attribute.
     * @see #getMainClass()
     * @generated
     */
    void setMainClass(String value);

} // JobSubmission
