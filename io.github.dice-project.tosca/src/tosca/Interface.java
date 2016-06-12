/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Interface#getInterface_name <em>Interface name</em>}</li>
 *   <li>{@link tosca.Interface#getHasOperation <em>Has Operation</em>}</li>
 *   <li>{@link tosca.Interface#getInterface_hasInput <em>Interface has Input</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends EObject {
    /**
     * Returns the value of the '<em><b>Interface name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interface name</em>' attribute.
     * @see #setInterface_name(String)
     * @see tosca.ToscaPackage#getInterface_Interface_name()
     * @model id="true"
     * @generated
     */
    String getInterface_name();

    /**
     * Sets the value of the '{@link tosca.Interface#getInterface_name <em>Interface name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface name</em>' attribute.
     * @see #getInterface_name()
     * @generated
     */
    void setInterface_name(String value);

    /**
     * Returns the value of the '<em><b>Has Operation</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Operation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Has Operation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Has Operation</em>' containment reference list.
     * @see tosca.ToscaPackage#getInterface_HasOperation()
     * @model containment="true"
     * @generated
     */
    EList<Operation> getHasOperation();

    /**
     * Returns the value of the '<em><b>Interface has Input</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Input}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface has Input</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interface has Input</em>' containment reference list.
     * @see tosca.ToscaPackage#getInterface_Interface_hasInput()
     * @model containment="true"
     * @generated
     */
    EList<Input> getInterface_hasInput();

} // Interface
