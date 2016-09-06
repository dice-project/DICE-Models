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
 *   <li>{@link ddsm.ExternalComponent#getLocation <em>Location</em>}</li>
 *   <li>{@link ddsm.ExternalComponent#getLogin <em>Login</em>}</li>
 *   <li>{@link ddsm.ExternalComponent#getPassword <em>Password</em>}</li>
 *   <li>{@link ddsm.ExternalComponent#getRegion <em>Region</em>}</li>
 *   <li>{@link ddsm.ExternalComponent#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link ddsm.ExternalComponent#getEndPoint <em>End Point</em>}</li>
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

    /**
     * Returns the value of the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' attribute.
     * @see #setLocation(String)
     * @see ddsm.DdsmPackage#getExternalComponent_Location()
     * @model
     * @generated
     */
    String getLocation();

    /**
     * Sets the value of the '{@link ddsm.ExternalComponent#getLocation <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' attribute.
     * @see #getLocation()
     * @generated
     */
    void setLocation(String value);

    /**
     * Returns the value of the '<em><b>Login</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Login</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Login</em>' attribute.
     * @see #setLogin(String)
     * @see ddsm.DdsmPackage#getExternalComponent_Login()
     * @model
     * @generated
     */
    String getLogin();

    /**
     * Sets the value of the '{@link ddsm.ExternalComponent#getLogin <em>Login</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Login</em>' attribute.
     * @see #getLogin()
     * @generated
     */
    void setLogin(String value);

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Password</em>' attribute.
     * @see #setPassword(String)
     * @see ddsm.DdsmPackage#getExternalComponent_Password()
     * @model
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link ddsm.ExternalComponent#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

    /**
     * Returns the value of the '<em><b>Region</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Region</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Region</em>' attribute.
     * @see #setRegion(String)
     * @see ddsm.DdsmPackage#getExternalComponent_Region()
     * @model
     * @generated
     */
    String getRegion();

    /**
     * Sets the value of the '{@link ddsm.ExternalComponent#getRegion <em>Region</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Region</em>' attribute.
     * @see #getRegion()
     * @generated
     */
    void setRegion(String value);

    /**
     * Returns the value of the '<em><b>Service Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Type</em>' attribute.
     * @see #setServiceType(String)
     * @see ddsm.DdsmPackage#getExternalComponent_ServiceType()
     * @model
     * @generated
     */
    String getServiceType();

    /**
     * Sets the value of the '{@link ddsm.ExternalComponent#getServiceType <em>Service Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Type</em>' attribute.
     * @see #getServiceType()
     * @generated
     */
    void setServiceType(String value);

    /**
     * Returns the value of the '<em><b>End Point</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Point</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Point</em>' attribute.
     * @see #setEndPoint(String)
     * @see ddsm.DdsmPackage#getExternalComponent_EndPoint()
     * @model
     * @generated
     */
    String getEndPoint();

    /**
     * Sets the value of the '{@link ddsm.ExternalComponent#getEndPoint <em>End Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Point</em>' attribute.
     * @see #getEndPoint()
     * @generated
     */
    void setEndPoint(String value);

} // ExternalComponent
