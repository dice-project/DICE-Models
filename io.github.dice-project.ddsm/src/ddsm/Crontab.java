/**
 */
package ddsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crontab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.Crontab#getMin <em>Min</em>}</li>
 *   <li>{@link ddsm.Crontab#getHour <em>Hour</em>}</li>
 *   <li>{@link ddsm.Crontab#getDayOfMonth <em>Day Of Month</em>}</li>
 *   <li>{@link ddsm.Crontab#getMonth <em>Month</em>}</li>
 *   <li>{@link ddsm.Crontab#getDayOfWeek <em>Day Of Week</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getCrontab()
 * @model
 * @generated
 */
public interface Crontab extends EObject {
    /**
     * Returns the value of the '<em><b>Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min</em>' attribute.
     * @see #setMin(int)
     * @see ddsm.DdsmPackage#getCrontab_Min()
     * @model required="true"
     * @generated
     */
    int getMin();

    /**
     * Sets the value of the '{@link ddsm.Crontab#getMin <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min</em>' attribute.
     * @see #getMin()
     * @generated
     */
    void setMin(int value);

    /**
     * Returns the value of the '<em><b>Hour</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hour</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hour</em>' attribute.
     * @see #setHour(int)
     * @see ddsm.DdsmPackage#getCrontab_Hour()
     * @model required="true"
     * @generated
     */
    int getHour();

    /**
     * Sets the value of the '{@link ddsm.Crontab#getHour <em>Hour</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hour</em>' attribute.
     * @see #getHour()
     * @generated
     */
    void setHour(int value);

    /**
     * Returns the value of the '<em><b>Day Of Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Day Of Month</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Day Of Month</em>' attribute.
     * @see #setDayOfMonth(int)
     * @see ddsm.DdsmPackage#getCrontab_DayOfMonth()
     * @model required="true"
     * @generated
     */
    int getDayOfMonth();

    /**
     * Sets the value of the '{@link ddsm.Crontab#getDayOfMonth <em>Day Of Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Day Of Month</em>' attribute.
     * @see #getDayOfMonth()
     * @generated
     */
    void setDayOfMonth(int value);

    /**
     * Returns the value of the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Month</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Month</em>' attribute.
     * @see #setMonth(int)
     * @see ddsm.DdsmPackage#getCrontab_Month()
     * @model required="true"
     * @generated
     */
    int getMonth();

    /**
     * Sets the value of the '{@link ddsm.Crontab#getMonth <em>Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Month</em>' attribute.
     * @see #getMonth()
     * @generated
     */
    void setMonth(int value);

    /**
     * Returns the value of the '<em><b>Day Of Week</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Day Of Week</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Day Of Week</em>' attribute.
     * @see #setDayOfWeek(int)
     * @see ddsm.DdsmPackage#getCrontab_DayOfWeek()
     * @model required="true"
     * @generated
     */
    int getDayOfWeek();

    /**
     * Sets the value of the '{@link ddsm.Crontab#getDayOfWeek <em>Day Of Week</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Day Of Week</em>' attribute.
     * @see #getDayOfWeek()
     * @generated
     */
    void setDayOfWeek(int value);

} // Crontab
