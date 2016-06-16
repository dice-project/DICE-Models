/**
 */
package ddsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.Port#getComponent <em>Component</em>}</li>
 *   <li>{@link ddsm.Port#getPortId <em>Port Id</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
    /**
     * Returns the value of the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Component</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component</em>' reference.
     * @see #setComponent(Component)
     * @see ddsm.DdsmPackage#getPort_Component()
     * @model
     * @generated
     */
    Component getComponent();

    /**
     * Sets the value of the '{@link ddsm.Port#getComponent <em>Component</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Component</em>' reference.
     * @see #getComponent()
     * @generated
     */
    void setComponent(Component value);

    /**
     * Returns the value of the '<em><b>Port Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port Id</em>' attribute.
     * @see #setPortId(String)
     * @see ddsm.DdsmPackage#getPort_PortId()
     * @model id="true"
     * @generated
     */
    String getPortId();

    /**
     * Sets the value of the '{@link ddsm.Port#getPortId <em>Port Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port Id</em>' attribute.
     * @see #getPortId()
     * @generated
     */
    void setPortId(String value);

} // Port
