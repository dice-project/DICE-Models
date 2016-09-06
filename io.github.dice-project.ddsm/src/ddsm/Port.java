/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.Port#isIsLocal <em>Is Local</em>}</li>
 *   <li>{@link ddsm.Port#getPortNumber <em>Port Number</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getPort()
 * @model abstract="true"
 *        annotation="http://es.unizar.disco/dice/profiles/generator description='Represents an interface (provided or required) of a Component.\nIt is tipically used to link components in order to enable communication.'"
 * @generated
 */
public interface Port extends CloudElement {
    /**
     * Returns the value of the '<em><b>Is Local</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Local</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Local</em>' attribute.
     * @see #setIsLocal(boolean)
     * @see ddsm.DdsmPackage#getPort_IsLocal()
     * @model
     * @generated
     */
    boolean isIsLocal();

    /**
     * Sets the value of the '{@link ddsm.Port#isIsLocal <em>Is Local</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Local</em>' attribute.
     * @see #isIsLocal()
     * @generated
     */
    void setIsLocal(boolean value);

    /**
     * Returns the value of the '<em><b>Port Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port Number</em>' attribute.
     * @see #setPortNumber(String)
     * @see ddsm.DdsmPackage#getPort_PortNumber()
     * @model
     * @generated
     */
    String getPortNumber();

    /**
     * Sets the value of the '{@link ddsm.Port#getPortNumber <em>Port Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port Number</em>' attribute.
     * @see #getPortNumber()
     * @generated
     */
    void setPortNumber(String value);

} // Port
