/**
 */
package ddsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.ExecutionPlatform#getOwner <em>Owner</em>}</li>
 *   <li>{@link ddsm.ExecutionPlatform#getExecutionPlatformId <em>Execution Platform Id</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getExecutionPlatform()
 * @model
 * @generated
 */
public interface ExecutionPlatform extends EObject {
    /**
     * Returns the value of the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' reference.
     * @see #setOwner(Component)
     * @see ddsm.DdsmPackage#getExecutionPlatform_Owner()
     * @model
     * @generated
     */
    Component getOwner();

    /**
     * Sets the value of the '{@link ddsm.ExecutionPlatform#getOwner <em>Owner</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' reference.
     * @see #getOwner()
     * @generated
     */
    void setOwner(Component value);

    /**
     * Returns the value of the '<em><b>Execution Platform Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execution Platform Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Platform Id</em>' attribute.
     * @see #setExecutionPlatformId(String)
     * @see ddsm.DdsmPackage#getExecutionPlatform_ExecutionPlatformId()
     * @model
     * @generated
     */
    String getExecutionPlatformId();

    /**
     * Sets the value of the '{@link ddsm.ExecutionPlatform#getExecutionPlatformId <em>Execution Platform Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Platform Id</em>' attribute.
     * @see #getExecutionPlatformId()
     * @generated
     */
    void setExecutionPlatformId(String value);

} // ExecutionPlatform
