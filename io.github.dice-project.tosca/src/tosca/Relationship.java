/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Relationship#getType <em>Type</em>}</li>
 *   <li>{@link tosca.Relationship#getValidSource <em>Valid Source</em>}</li>
 *   <li>{@link tosca.Relationship#getValidTarget <em>Valid Target</em>}</li>
 *   <li>{@link tosca.Relationship#getRelation_haSourceInterface <em>Relation ha Source Interface</em>}</li>
 *   <li>{@link tosca.Relationship#getRelation_hasTargetInterface <em>Relation has Target Interface</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see tosca.ToscaPackage#getRelationship_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link tosca.Relationship#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Valid Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valid Source</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Valid Source</em>' attribute.
     * @see #setValidSource(String)
     * @see tosca.ToscaPackage#getRelationship_ValidSource()
     * @model
     * @generated
     */
    String getValidSource();

    /**
     * Sets the value of the '{@link tosca.Relationship#getValidSource <em>Valid Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valid Source</em>' attribute.
     * @see #getValidSource()
     * @generated
     */
    void setValidSource(String value);

    /**
     * Returns the value of the '<em><b>Valid Target</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valid Target</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Valid Target</em>' attribute.
     * @see #setValidTarget(String)
     * @see tosca.ToscaPackage#getRelationship_ValidTarget()
     * @model
     * @generated
     */
    String getValidTarget();

    /**
     * Sets the value of the '{@link tosca.Relationship#getValidTarget <em>Valid Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valid Target</em>' attribute.
     * @see #getValidTarget()
     * @generated
     */
    void setValidTarget(String value);

    /**
     * Returns the value of the '<em><b>Relation ha Source Interface</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Source_interface}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relation ha Source Interface</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relation ha Source Interface</em>' containment reference list.
     * @see tosca.ToscaPackage#getRelationship_Relation_haSourceInterface()
     * @model containment="true"
     * @generated
     */
    EList<Source_interface> getRelation_haSourceInterface();

    /**
     * Returns the value of the '<em><b>Relation has Target Interface</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Target_interface}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relation has Target Interface</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relation has Target Interface</em>' containment reference list.
     * @see tosca.ToscaPackage#getRelationship_Relation_hasTargetInterface()
     * @model containment="true"
     * @generated
     */
    EList<Target_interface> getRelation_hasTargetInterface();

} // Relationship
