/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.Relationship#getProvidedport <em>Providedport</em>}</li>
 *   <li>{@link ddsm.Relationship#getRequiredport <em>Requiredport</em>}</li>
 *   <li>{@link ddsm.Relationship#getName <em>Name</em>}</li>
 *   <li>{@link ddsm.Relationship#getRelationshipId <em>Relationship Id</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends CloudElement {
    /**
     * Returns the value of the '<em><b>Providedport</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Providedport</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Providedport</em>' reference.
     * @see #setProvidedport(ProvidedPort)
     * @see ddsm.DdsmPackage#getRelationship_Providedport()
     * @model
     * @generated
     */
    ProvidedPort getProvidedport();

    /**
     * Sets the value of the '{@link ddsm.Relationship#getProvidedport <em>Providedport</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Providedport</em>' reference.
     * @see #getProvidedport()
     * @generated
     */
    void setProvidedport(ProvidedPort value);

    /**
     * Returns the value of the '<em><b>Requiredport</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Requiredport</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Requiredport</em>' reference.
     * @see #setRequiredport(RequiredPort)
     * @see ddsm.DdsmPackage#getRelationship_Requiredport()
     * @model
     * @generated
     */
    RequiredPort getRequiredport();

    /**
     * Sets the value of the '{@link ddsm.Relationship#getRequiredport <em>Requiredport</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Requiredport</em>' reference.
     * @see #getRequiredport()
     * @generated
     */
    void setRequiredport(RequiredPort value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see ddsm.DdsmPackage#getRelationship_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ddsm.Relationship#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Relationship Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relationship Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relationship Id</em>' attribute.
     * @see #setRelationshipId(String)
     * @see ddsm.DdsmPackage#getRelationship_RelationshipId()
     * @model
     * @generated
     */
    String getRelationshipId();

    /**
     * Sets the value of the '{@link ddsm.Relationship#getRelationshipId <em>Relationship Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Relationship Id</em>' attribute.
     * @see #getRelationshipId()
     * @generated
     */
    void setRelationshipId(String value);

} // Relationship
