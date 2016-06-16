/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Cycle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.LifeCycle#getDownloadCommand <em>Download Command</em>}</li>
 *   <li>{@link ddsm.LifeCycle#getInstallCommand <em>Install Command</em>}</li>
 *   <li>{@link ddsm.LifeCycle#getStartCommand <em>Start Command</em>}</li>
 *   <li>{@link ddsm.LifeCycle#getStopCommand <em>Stop Command</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getLifeCycle()
 * @model
 * @generated
 */
public interface LifeCycle extends Resource {
    /**
     * Returns the value of the '<em><b>Download Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Download Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Download Command</em>' attribute.
     * @see #setDownloadCommand(String)
     * @see ddsm.DdsmPackage#getLifeCycle_DownloadCommand()
     * @model
     * @generated
     */
    String getDownloadCommand();

    /**
     * Sets the value of the '{@link ddsm.LifeCycle#getDownloadCommand <em>Download Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Download Command</em>' attribute.
     * @see #getDownloadCommand()
     * @generated
     */
    void setDownloadCommand(String value);

    /**
     * Returns the value of the '<em><b>Install Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Install Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Install Command</em>' attribute.
     * @see #setInstallCommand(String)
     * @see ddsm.DdsmPackage#getLifeCycle_InstallCommand()
     * @model
     * @generated
     */
    String getInstallCommand();

    /**
     * Sets the value of the '{@link ddsm.LifeCycle#getInstallCommand <em>Install Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Install Command</em>' attribute.
     * @see #getInstallCommand()
     * @generated
     */
    void setInstallCommand(String value);

    /**
     * Returns the value of the '<em><b>Start Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Command</em>' attribute.
     * @see #setStartCommand(String)
     * @see ddsm.DdsmPackage#getLifeCycle_StartCommand()
     * @model
     * @generated
     */
    String getStartCommand();

    /**
     * Sets the value of the '{@link ddsm.LifeCycle#getStartCommand <em>Start Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Command</em>' attribute.
     * @see #getStartCommand()
     * @generated
     */
    void setStartCommand(String value);

    /**
     * Returns the value of the '<em><b>Stop Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stop Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stop Command</em>' attribute.
     * @see #setStopCommand(String)
     * @see ddsm.DdsmPackage#getLifeCycle_StopCommand()
     * @model
     * @generated
     */
    String getStopCommand();

    /**
     * Sets the value of the '{@link ddsm.LifeCycle#getStopCommand <em>Stop Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stop Command</em>' attribute.
     * @see #getStopCommand()
     * @generated
     */
    void setStopCommand(String value);

} // LifeCycle
