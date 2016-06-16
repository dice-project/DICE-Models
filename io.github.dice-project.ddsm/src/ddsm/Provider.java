/**
 */
package ddsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link ddsm.Provider#getName <em>Name</em>}</li>
 *   <li>{@link ddsm.Provider#getProperty <em>Property</em>}</li>
 *   <li>{@link ddsm.Provider#getProviderId <em>Provider Id</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends EObject {
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
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see ddsm.DdsmPackage#getProvider_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ddsm.Provider#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Property</b></em>' containment reference list.
     * The list contents are of type {@link ddsm.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference list.
     * @see ddsm.DdsmPackage#getProvider_Property()
     * @model containment="true"
     * @generated
     */
    EList<Property> getProperty();

    /**
     * Returns the value of the '<em><b>Provider Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provider Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provider Id</em>' attribute.
     * @see #setProviderId(String)
     * @see ddsm.DdsmPackage#getProvider_ProviderId()
     * @model id="true"
     * @generated
     */
    String getProviderId();

    /**
     * Sets the value of the '{@link ddsm.Provider#getProviderId <em>Provider Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Provider Id</em>' attribute.
     * @see #getProviderId()
     * @generated
     */
    void setProviderId(String value);

} // Provider
