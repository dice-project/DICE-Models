/**
 */
package ddsm.impl;

import ddsm.Crontab;
import ddsm.DdsmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crontab</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.CrontabImpl#getMin <em>Min</em>}</li>
 *   <li>{@link ddsm.impl.CrontabImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link ddsm.impl.CrontabImpl#getDayOfMonth <em>Day Of Month</em>}</li>
 *   <li>{@link ddsm.impl.CrontabImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link ddsm.impl.CrontabImpl#getDayOfWeek <em>Day Of Week</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrontabImpl extends MinimalEObjectImpl.Container implements Crontab {
    /**
     * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMin()
     * @generated
     * @ordered
     */
    protected static final int MIN_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMin()
     * @generated
     * @ordered
     */
    protected int min = MIN_EDEFAULT;

    /**
     * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHour()
     * @generated
     * @ordered
     */
    protected static final int HOUR_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHour()
     * @generated
     * @ordered
     */
    protected int hour = HOUR_EDEFAULT;

    /**
     * The default value of the '{@link #getDayOfMonth() <em>Day Of Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDayOfMonth()
     * @generated
     * @ordered
     */
    protected static final int DAY_OF_MONTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDayOfMonth() <em>Day Of Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDayOfMonth()
     * @generated
     * @ordered
     */
    protected int dayOfMonth = DAY_OF_MONTH_EDEFAULT;

    /**
     * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonth()
     * @generated
     * @ordered
     */
    protected static final int MONTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonth()
     * @generated
     * @ordered
     */
    protected int month = MONTH_EDEFAULT;

    /**
     * The default value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDayOfWeek()
     * @generated
     * @ordered
     */
    protected static final int DAY_OF_WEEK_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDayOfWeek()
     * @generated
     * @ordered
     */
    protected int dayOfWeek = DAY_OF_WEEK_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CrontabImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.CRONTAB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMin() {
        return min;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMin(int newMin) {
        int oldMin = min;
        min = newMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CRONTAB__MIN, oldMin, min));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getHour() {
        return hour;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHour(int newHour) {
        int oldHour = hour;
        hour = newHour;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CRONTAB__HOUR, oldHour, hour));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDayOfMonth(int newDayOfMonth) {
        int oldDayOfMonth = dayOfMonth;
        dayOfMonth = newDayOfMonth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CRONTAB__DAY_OF_MONTH, oldDayOfMonth, dayOfMonth));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMonth() {
        return month;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMonth(int newMonth) {
        int oldMonth = month;
        month = newMonth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CRONTAB__MONTH, oldMonth, month));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDayOfWeek(int newDayOfWeek) {
        int oldDayOfWeek = dayOfWeek;
        dayOfWeek = newDayOfWeek;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CRONTAB__DAY_OF_WEEK, oldDayOfWeek, dayOfWeek));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.CRONTAB__MIN:
                return getMin();
            case DdsmPackage.CRONTAB__HOUR:
                return getHour();
            case DdsmPackage.CRONTAB__DAY_OF_MONTH:
                return getDayOfMonth();
            case DdsmPackage.CRONTAB__MONTH:
                return getMonth();
            case DdsmPackage.CRONTAB__DAY_OF_WEEK:
                return getDayOfWeek();
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
            case DdsmPackage.CRONTAB__MIN:
                setMin((Integer)newValue);
                return;
            case DdsmPackage.CRONTAB__HOUR:
                setHour((Integer)newValue);
                return;
            case DdsmPackage.CRONTAB__DAY_OF_MONTH:
                setDayOfMonth((Integer)newValue);
                return;
            case DdsmPackage.CRONTAB__MONTH:
                setMonth((Integer)newValue);
                return;
            case DdsmPackage.CRONTAB__DAY_OF_WEEK:
                setDayOfWeek((Integer)newValue);
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
            case DdsmPackage.CRONTAB__MIN:
                setMin(MIN_EDEFAULT);
                return;
            case DdsmPackage.CRONTAB__HOUR:
                setHour(HOUR_EDEFAULT);
                return;
            case DdsmPackage.CRONTAB__DAY_OF_MONTH:
                setDayOfMonth(DAY_OF_MONTH_EDEFAULT);
                return;
            case DdsmPackage.CRONTAB__MONTH:
                setMonth(MONTH_EDEFAULT);
                return;
            case DdsmPackage.CRONTAB__DAY_OF_WEEK:
                setDayOfWeek(DAY_OF_WEEK_EDEFAULT);
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
            case DdsmPackage.CRONTAB__MIN:
                return min != MIN_EDEFAULT;
            case DdsmPackage.CRONTAB__HOUR:
                return hour != HOUR_EDEFAULT;
            case DdsmPackage.CRONTAB__DAY_OF_MONTH:
                return dayOfMonth != DAY_OF_MONTH_EDEFAULT;
            case DdsmPackage.CRONTAB__MONTH:
                return month != MONTH_EDEFAULT;
            case DdsmPackage.CRONTAB__DAY_OF_WEEK:
                return dayOfWeek != DAY_OF_WEEK_EDEFAULT;
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
        result.append(" (min: ");
        result.append(min);
        result.append(", hour: ");
        result.append(hour);
        result.append(", dayOfMonth: ");
        result.append(dayOfMonth);
        result.append(", month: ");
        result.append(month);
        result.append(", dayOfWeek: ");
        result.append(dayOfWeek);
        result.append(')');
        return result.toString();
    }

} //CrontabImpl
