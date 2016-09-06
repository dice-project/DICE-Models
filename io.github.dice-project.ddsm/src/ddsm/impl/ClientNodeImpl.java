/**
 */
package ddsm.impl;

import ddsm.ClientNode;
import ddsm.Crontab;
import ddsm.DdsmPackage;
import ddsm.JobSubmission;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ClientNodeImpl#getSubmits <em>Submits</em>}</li>
 *   <li>{@link ddsm.impl.ClientNodeImpl#isSkipRunningJob <em>Skip Running Job</em>}</li>
 *   <li>{@link ddsm.impl.ClientNodeImpl#getNumberOfSubmissions <em>Number Of Submissions</em>}</li>
 *   <li>{@link ddsm.impl.ClientNodeImpl#getHasSchedule <em>Has Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientNodeImpl extends InternalComponentImpl implements ClientNode {
    /**
     * The cached value of the '{@link #getSubmits() <em>Submits</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubmits()
     * @generated
     * @ordered
     */
    protected JobSubmission submits;

    /**
     * The default value of the '{@link #isSkipRunningJob() <em>Skip Running Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSkipRunningJob()
     * @generated
     * @ordered
     */
    protected static final boolean SKIP_RUNNING_JOB_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSkipRunningJob() <em>Skip Running Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSkipRunningJob()
     * @generated
     * @ordered
     */
    protected boolean skipRunningJob = SKIP_RUNNING_JOB_EDEFAULT;

    /**
     * The default value of the '{@link #getNumberOfSubmissions() <em>Number Of Submissions</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumberOfSubmissions()
     * @generated
     * @ordered
     */
    protected static final int NUMBER_OF_SUBMISSIONS_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getNumberOfSubmissions() <em>Number Of Submissions</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumberOfSubmissions()
     * @generated
     * @ordered
     */
    protected int numberOfSubmissions = NUMBER_OF_SUBMISSIONS_EDEFAULT;

    /**
     * The cached value of the '{@link #getHasSchedule() <em>Has Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHasSchedule()
     * @generated
     * @ordered
     */
    protected Crontab hasSchedule;

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
    public JobSubmission getSubmits() {
        if (submits != null && submits.eIsProxy()) {
            InternalEObject oldSubmits = (InternalEObject)submits;
            submits = (JobSubmission)eResolveProxy(oldSubmits);
            if (submits != oldSubmits) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.CLIENT_NODE__SUBMITS, oldSubmits, submits));
            }
        }
        return submits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JobSubmission basicGetSubmits() {
        return submits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubmits(JobSubmission newSubmits) {
        JobSubmission oldSubmits = submits;
        submits = newSubmits;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CLIENT_NODE__SUBMITS, oldSubmits, submits));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSkipRunningJob() {
        return skipRunningJob;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSkipRunningJob(boolean newSkipRunningJob) {
        boolean oldSkipRunningJob = skipRunningJob;
        skipRunningJob = newSkipRunningJob;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CLIENT_NODE__SKIP_RUNNING_JOB, oldSkipRunningJob, skipRunningJob));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getNumberOfSubmissions() {
        return numberOfSubmissions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNumberOfSubmissions(int newNumberOfSubmissions) {
        int oldNumberOfSubmissions = numberOfSubmissions;
        numberOfSubmissions = newNumberOfSubmissions;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CLIENT_NODE__NUMBER_OF_SUBMISSIONS, oldNumberOfSubmissions, numberOfSubmissions));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Crontab getHasSchedule() {
        if (hasSchedule != null && hasSchedule.eIsProxy()) {
            InternalEObject oldHasSchedule = (InternalEObject)hasSchedule;
            hasSchedule = (Crontab)eResolveProxy(oldHasSchedule);
            if (hasSchedule != oldHasSchedule) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.CLIENT_NODE__HAS_SCHEDULE, oldHasSchedule, hasSchedule));
            }
        }
        return hasSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Crontab basicGetHasSchedule() {
        return hasSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHasSchedule(Crontab newHasSchedule) {
        Crontab oldHasSchedule = hasSchedule;
        hasSchedule = newHasSchedule;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CLIENT_NODE__HAS_SCHEDULE, oldHasSchedule, hasSchedule));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.CLIENT_NODE__SUBMITS:
                if (resolve) return getSubmits();
                return basicGetSubmits();
            case DdsmPackage.CLIENT_NODE__SKIP_RUNNING_JOB:
                return isSkipRunningJob();
            case DdsmPackage.CLIENT_NODE__NUMBER_OF_SUBMISSIONS:
                return getNumberOfSubmissions();
            case DdsmPackage.CLIENT_NODE__HAS_SCHEDULE:
                if (resolve) return getHasSchedule();
                return basicGetHasSchedule();
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
            case DdsmPackage.CLIENT_NODE__SUBMITS:
                setSubmits((JobSubmission)newValue);
                return;
            case DdsmPackage.CLIENT_NODE__SKIP_RUNNING_JOB:
                setSkipRunningJob((Boolean)newValue);
                return;
            case DdsmPackage.CLIENT_NODE__NUMBER_OF_SUBMISSIONS:
                setNumberOfSubmissions((Integer)newValue);
                return;
            case DdsmPackage.CLIENT_NODE__HAS_SCHEDULE:
                setHasSchedule((Crontab)newValue);
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
            case DdsmPackage.CLIENT_NODE__SUBMITS:
                setSubmits((JobSubmission)null);
                return;
            case DdsmPackage.CLIENT_NODE__SKIP_RUNNING_JOB:
                setSkipRunningJob(SKIP_RUNNING_JOB_EDEFAULT);
                return;
            case DdsmPackage.CLIENT_NODE__NUMBER_OF_SUBMISSIONS:
                setNumberOfSubmissions(NUMBER_OF_SUBMISSIONS_EDEFAULT);
                return;
            case DdsmPackage.CLIENT_NODE__HAS_SCHEDULE:
                setHasSchedule((Crontab)null);
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
            case DdsmPackage.CLIENT_NODE__SUBMITS:
                return submits != null;
            case DdsmPackage.CLIENT_NODE__SKIP_RUNNING_JOB:
                return skipRunningJob != SKIP_RUNNING_JOB_EDEFAULT;
            case DdsmPackage.CLIENT_NODE__NUMBER_OF_SUBMISSIONS:
                return numberOfSubmissions != NUMBER_OF_SUBMISSIONS_EDEFAULT;
            case DdsmPackage.CLIENT_NODE__HAS_SCHEDULE:
                return hasSchedule != null;
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
        result.append(" (skipRunningJob: ");
        result.append(skipRunningJob);
        result.append(", numberOfSubmissions: ");
        result.append(numberOfSubmissions);
        result.append(')');
        return result.toString();
    }

} //ClientNodeImpl
