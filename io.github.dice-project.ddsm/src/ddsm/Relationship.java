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
 * </ul>
 *
 * @see ddsm.DdsmPackage#getRelationship()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='test generation'"
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
     * @model required="true"
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
     * @model required="true"
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

} // Relationship
