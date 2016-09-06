/**
 */
package ddsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.Resource#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link ddsm.Resource#getDownloadCommand <em>Download Command</em>}</li>
 *   <li>{@link ddsm.Resource#getCreateCommand <em>Create Command</em>}</li>
 *   <li>{@link ddsm.Resource#getConfigureCommand <em>Configure Command</em>}</li>
 *   <li>{@link ddsm.Resource#getInstallCommand <em>Install Command</em>}</li>
 *   <li>{@link ddsm.Resource#getStartCommand <em>Start Command</em>}</li>
 *   <li>{@link ddsm.Resource#getStopCommand <em>Stop Command</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getResource()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='Represents a resource associated to an element which might be used to support the deployment and configuration of the such element. \nFor instance a Resource may detail the deployment script of a CloudElement (e.g. an InternalComponent or an ExecutionBinding).'"
 * @generated
 */
public interface Resource extends EObject {
    /**
     * Returns the value of the '<em><b>Resource Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Id</em>' attribute.
     * @see #setResourceId(String)
     * @see ddsm.DdsmPackage#getResource_ResourceId()
     * @model id="true" required="true"
     * @generated
     */
    String getResourceId();

    /**
     * Sets the value of the '{@link ddsm.Resource#getResourceId <em>Resource Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Id</em>' attribute.
     * @see #getResourceId()
     * @generated
     */
    void setResourceId(String value);

    /**
     * Returns the value of the '<em><b>Download Command</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Download Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Download Command</em>' attribute.
     * @see #setDownloadCommand(String)
     * @see ddsm.DdsmPackage#getResource_DownloadCommand()
     * @model default=""
     * @generated
     */
    String getDownloadCommand();

    /**
     * Sets the value of the '{@link ddsm.Resource#getDownloadCommand <em>Download Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Download Command</em>' attribute.
     * @see #getDownloadCommand()
     * @generated
     */
    void setDownloadCommand(String value);

    /**
     * Returns the value of the '<em><b>Create Command</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Create Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Create Command</em>' attribute.
     * @see #setCreateCommand(String)
     * @see ddsm.DdsmPackage#getResource_CreateCommand()
     * @model default=""
     * @generated
     */
    String getCreateCommand();

    /**
     * Sets the value of the '{@link ddsm.Resource#getCreateCommand <em>Create Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Create Command</em>' attribute.
     * @see #getCreateCommand()
     * @generated
     */
    void setCreateCommand(String value);

    /**
     * Returns the value of the '<em><b>Configure Command</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configure Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configure Command</em>' attribute.
     * @see #setConfigureCommand(String)
     * @see ddsm.DdsmPackage#getResource_ConfigureCommand()
     * @model default=""
     * @generated
     */
    String getConfigureCommand();

    /**
     * Sets the value of the '{@link ddsm.Resource#getConfigureCommand <em>Configure Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Configure Command</em>' attribute.
     * @see #getConfigureCommand()
     * @generated
     */
    void setConfigureCommand(String value);

    /**
     * Returns the value of the '<em><b>Install Command</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Install Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Install Command</em>' attribute.
     * @see #setInstallCommand(String)
     * @see ddsm.DdsmPackage#getResource_InstallCommand()
     * @model default=""
     * @generated
     */
    String getInstallCommand();

    /**
     * Sets the value of the '{@link ddsm.Resource#getInstallCommand <em>Install Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Install Command</em>' attribute.
     * @see #getInstallCommand()
     * @generated
     */
    void setInstallCommand(String value);

    /**
     * Returns the value of the '<em><b>Start Command</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Command</em>' attribute.
     * @see #setStartCommand(String)
     * @see ddsm.DdsmPackage#getResource_StartCommand()
     * @model default=""
     * @generated
     */
    String getStartCommand();

    /**
     * Sets the value of the '{@link ddsm.Resource#getStartCommand <em>Start Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Command</em>' attribute.
     * @see #getStartCommand()
     * @generated
     */
    void setStartCommand(String value);

    /**
     * Returns the value of the '<em><b>Stop Command</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stop Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stop Command</em>' attribute.
     * @see #setStopCommand(String)
     * @see ddsm.DdsmPackage#getResource_StopCommand()
     * @model default=""
     * @generated
     */
    String getStopCommand();

    /**
     * Sets the value of the '{@link ddsm.Resource#getStopCommand <em>Stop Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stop Command</em>' attribute.
     * @see #getStopCommand()
     * @generated
     */
    void setStopCommand(String value);

} // Resource
