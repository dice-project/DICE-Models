/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.ClientNode#getSubmits <em>Submits</em>}</li>
 *   <li>{@link ddsm.ClientNode#isSkipRunningJob <em>Skip Running Job</em>}</li>
 *   <li>{@link ddsm.ClientNode#getNumberOfSubmissions <em>Number Of Submissions</em>}</li>
 *   <li>{@link ddsm.ClientNode#getHasSchedule <em>Has Schedule</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getClientNode()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='test generation'"
 * @generated
 */
public interface ClientNode extends InternalComponent {
    /**
     * Returns the value of the '<em><b>Submits</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Submits</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Submits</em>' reference.
     * @see #setSubmits(JobSubmission)
     * @see ddsm.DdsmPackage#getClientNode_Submits()
     * @model required="true"
     * @generated
     */
    JobSubmission getSubmits();

    /**
     * Sets the value of the '{@link ddsm.ClientNode#getSubmits <em>Submits</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Submits</em>' reference.
     * @see #getSubmits()
     * @generated
     */
    void setSubmits(JobSubmission value);

    /**
     * Returns the value of the '<em><b>Skip Running Job</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skip Running Job</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Skip Running Job</em>' attribute.
     * @see #setSkipRunningJob(boolean)
     * @see ddsm.DdsmPackage#getClientNode_SkipRunningJob()
     * @model
     * @generated
     */
    boolean isSkipRunningJob();

    /**
     * Sets the value of the '{@link ddsm.ClientNode#isSkipRunningJob <em>Skip Running Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skip Running Job</em>' attribute.
     * @see #isSkipRunningJob()
     * @generated
     */
    void setSkipRunningJob(boolean value);

    /**
     * Returns the value of the '<em><b>Number Of Submissions</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Number Of Submissions</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Number Of Submissions</em>' attribute.
     * @see #setNumberOfSubmissions(int)
     * @see ddsm.DdsmPackage#getClientNode_NumberOfSubmissions()
     * @model default="1"
     * @generated
     */
    int getNumberOfSubmissions();

    /**
     * Sets the value of the '{@link ddsm.ClientNode#getNumberOfSubmissions <em>Number Of Submissions</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number Of Submissions</em>' attribute.
     * @see #getNumberOfSubmissions()
     * @generated
     */
    void setNumberOfSubmissions(int value);

    /**
     * Returns the value of the '<em><b>Has Schedule</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Has Schedule</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Has Schedule</em>' reference.
     * @see #setHasSchedule(Crontab)
     * @see ddsm.DdsmPackage#getClientNode_HasSchedule()
     * @model
     * @generated
     */
    Crontab getHasSchedule();

    /**
     * Sets the value of the '{@link ddsm.ClientNode#getHasSchedule <em>Has Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Has Schedule</em>' reference.
     * @see #getHasSchedule()
     * @generated
     */
    void setHasSchedule(Crontab value);

} // ClientNode
