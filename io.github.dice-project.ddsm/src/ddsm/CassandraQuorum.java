/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cassandra Quorum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.CassandraQuorum#getRequires_bootstrapping_seed <em>Requires bootstrapping seed</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getCassandraQuorum()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cassandraNeedASeed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot cassandraNeedASeed='Relationship.allInstances() ->\n\texists( r |\n\t\tr.providedport.owner.oclIsTypeOf(CassandraSeed) and\n\t\tr.requiredport.elementId = self.requires_bootstrapping_seed.elementId\n\t)\n'"
 * @generated
 */
public interface CassandraQuorum extends PeersQuorum {
    /**
     * Returns the value of the '<em><b>Requires bootstrapping seed</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Requires bootstrapping seed</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Requires bootstrapping seed</em>' reference.
     * @see #setRequires_bootstrapping_seed(RequiredPort)
     * @see ddsm.DdsmPackage#getCassandraQuorum_Requires_bootstrapping_seed()
     * @model required="true"
     * @generated
     */
    RequiredPort getRequires_bootstrapping_seed();

    /**
     * Sets the value of the '{@link ddsm.CassandraQuorum#getRequires_bootstrapping_seed <em>Requires bootstrapping seed</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Requires bootstrapping seed</em>' reference.
     * @see #getRequires_bootstrapping_seed()
     * @generated
     */
    void setRequires_bootstrapping_seed(RequiredPort value);

} // CassandraQuorum
