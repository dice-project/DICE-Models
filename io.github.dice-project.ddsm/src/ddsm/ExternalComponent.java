/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.ExternalComponent#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getExternalComponent()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='Inherit from MODACloudsML, this represents a component that is managed by an external provider, for instance a AWS EC2 virtual machine.'"
 * @generated
 */
public interface ExternalComponent extends Component {
    /**
     * Returns the value of the '<em><b>Provider</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provider</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provider</em>' reference.
     * @see #setProvider(Provider)
     * @see ddsm.DdsmPackage#getExternalComponent_Provider()
     * @model required="true"
     * @generated
     */
    Provider getProvider();

    /**
     * Sets the value of the '{@link ddsm.ExternalComponent#getProvider <em>Provider</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Provider</em>' reference.
     * @see #getProvider()
     * @generated
     */
    void setProvider(Provider value);

} // ExternalComponent
