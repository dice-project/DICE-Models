/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.Provider#getCredentialsPath <em>Credentials Path</em>}</li>
 *   <li>{@link ddsm.Provider#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getProvider()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='Represents a generic provider of Clouds services.'"
 * @generated
 */
public interface Provider extends CloudElement {
    /**
     * Returns the value of the '<em><b>Credentials Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Credentials Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Credentials Path</em>' attribute.
     * @see #setCredentialsPath(String)
     * @see ddsm.DdsmPackage#getProvider_CredentialsPath()
     * @model
     * @generated
     */
    String getCredentialsPath();

    /**
     * Sets the value of the '{@link ddsm.Provider#getCredentialsPath <em>Credentials Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Credentials Path</em>' attribute.
     * @see #getCredentialsPath()
     * @generated
     */
    void setCredentialsPath(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link ddsm.ProviderType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see ddsm.ProviderType
     * @see #setType(ProviderType)
     * @see ddsm.DdsmPackage#getProvider_Type()
     * @model
     * @generated
     */
    ProviderType getType();

    /**
     * Sets the value of the '{@link ddsm.Provider#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see ddsm.ProviderType
     * @see #getType()
     * @generated
     */
    void setType(ProviderType value);

} // Provider
