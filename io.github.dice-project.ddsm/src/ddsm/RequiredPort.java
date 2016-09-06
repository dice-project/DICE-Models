/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.RequiredPort#isIsMandatory <em>Is Mandatory</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getRequiredPort()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='A specific type of Port which specify that a Component requires to \ncommunicate and consume a features (e.g.access to a database) provided by another Component.'"
 * @generated
 */
public interface RequiredPort extends Port {
    /**
     * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Mandatory</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Mandatory</em>' attribute.
     * @see #setIsMandatory(boolean)
     * @see ddsm.DdsmPackage#getRequiredPort_IsMandatory()
     * @model
     * @generated
     */
    boolean isIsMandatory();

    /**
     * Sets the value of the '{@link ddsm.RequiredPort#isIsMandatory <em>Is Mandatory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Mandatory</em>' attribute.
     * @see #isIsMandatory()
     * @generated
     */
    void setIsMandatory(boolean value);

} // RequiredPort
