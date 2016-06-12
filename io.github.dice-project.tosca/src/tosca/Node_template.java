/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Node_template#getNode_template_name <em>Node template name</em>}</li>
 *   <li>{@link tosca.Node_template#getType <em>Type</em>}</li>
 *   <li>{@link tosca.Node_template#getNodeTemplate_hasInterface <em>Node Template has Interface</em>}</li>
 *   <li>{@link tosca.Node_template#getDescription <em>Description</em>}</li>
 *   <li>{@link tosca.Node_template#getNodeTemplate_hasProperty <em>Node Template has Property</em>}</li>
 *   <li>{@link tosca.Node_template#getNodeTemplate_hasAttribute <em>Node Template has Attribute</em>}</li>
 *   <li>{@link tosca.Node_template#getNodeTemplate_hasRequirement <em>Node Template has Requirement</em>}</li>
 *   <li>{@link tosca.Node_template#getNodeTemplate_hasRelationship <em>Node Template has Relationship</em>}</li>
 *   <li>{@link tosca.Node_template#getNodeTemplate_hasInstances <em>Node Template has Instances</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getNode_template()
 * @model
 * @generated
 */
public interface Node_template extends EObject {
    /**
     * Returns the value of the '<em><b>Node template name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node template name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node template name</em>' attribute.
     * @see #setNode_template_name(String)
     * @see tosca.ToscaPackage#getNode_template_Node_template_name()
     * @model id="true"
     * @generated
     */
    String getNode_template_name();

    /**
     * Sets the value of the '{@link tosca.Node_template#getNode_template_name <em>Node template name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Node template name</em>' attribute.
     * @see #getNode_template_name()
     * @generated
     */
    void setNode_template_name(String value);

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
     * @see tosca.ToscaPackage#getNode_template_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link tosca.Node_template#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Node Template has Interface</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Interface}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node Template has Interface</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node Template has Interface</em>' containment reference list.
     * @see tosca.ToscaPackage#getNode_template_NodeTemplate_hasInterface()
     * @model containment="true"
     * @generated
     */
    EList<Interface> getNodeTemplate_hasInterface();

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see tosca.ToscaPackage#getNode_template_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link tosca.Node_template#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Node Template has Property</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node Template has Property</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node Template has Property</em>' containment reference list.
     * @see tosca.ToscaPackage#getNode_template_NodeTemplate_hasProperty()
     * @model containment="true"
     * @generated
     */
    EList<Property> getNodeTemplate_hasProperty();

    /**
     * Returns the value of the '<em><b>Node Template has Attribute</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Attribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node Template has Attribute</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node Template has Attribute</em>' containment reference list.
     * @see tosca.ToscaPackage#getNode_template_NodeTemplate_hasAttribute()
     * @model containment="true"
     * @generated
     */
    EList<Attribute> getNodeTemplate_hasAttribute();

    /**
     * Returns the value of the '<em><b>Node Template has Requirement</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Requirement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node Template has Requirement</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node Template has Requirement</em>' containment reference list.
     * @see tosca.ToscaPackage#getNode_template_NodeTemplate_hasRequirement()
     * @model containment="true"
     * @generated
     */
    EList<Requirement> getNodeTemplate_hasRequirement();

    /**
     * Returns the value of the '<em><b>Node Template has Relationship</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Relationship}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node Template has Relationship</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node Template has Relationship</em>' containment reference list.
     * @see tosca.ToscaPackage#getNode_template_NodeTemplate_hasRelationship()
     * @model containment="true"
     * @generated
     */
    EList<Relationship> getNodeTemplate_hasRelationship();

    /**
     * Returns the value of the '<em><b>Node Template has Instances</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node Template has Instances</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node Template has Instances</em>' containment reference.
     * @see #setNodeTemplate_hasInstances(instance)
     * @see tosca.ToscaPackage#getNode_template_NodeTemplate_hasInstances()
     * @model containment="true"
     * @generated
     */
    instance getNodeTemplate_hasInstances();

    /**
     * Sets the value of the '{@link tosca.Node_template#getNodeTemplate_hasInstances <em>Node Template has Instances</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Node Template has Instances</em>' containment reference.
     * @see #getNodeTemplate_hasInstances()
     * @generated
     */
    void setNodeTemplate_hasInstances(instance value);

} // Node_template
