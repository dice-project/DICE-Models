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
 *   <li>{@link ddsm.LifeCycle#getPreconfigureCommand <em>Preconfigure Command</em>}</li>
 *   <li>{@link ddsm.LifeCycle#getCreateCommand <em>Create Command</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getLifeCycle()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='test generation'"
 * @generated
 */
public interface LifeCycle extends Resource {
    /**
     * Returns the value of the '<em><b>Download Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Download Command</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Download Command</em>' containment reference.
     * @see #setDownloadCommand(Script)
     * @see ddsm.DdsmPackage#getLifeCycle_DownloadCommand()
     * @model containment="true"
     * @generated
     */
    Script getDownloadCommand();

    /**
     * Sets the value of the '{@link ddsm.LifeCycle#getDownloadCommand <em>Download Command</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Download Command</em>' containment reference.
     * @see #getDownloadCommand()
     * @generated
     */
    void setDownloadCommand(Script value);

    /**
     * Returns the value of the '<em><b>Install Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Install Command</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Install Command</em>' containment reference.
     * @see #setInstallCommand(Script)
     * @see ddsm.DdsmPackage#getLifeCycle_InstallCommand()
     * @model containment="true"
     * @generated
     */
    Script getInstallCommand();

    /**
     * Sets the value of the '{@link ddsm.LifeCycle#getInstallCommand <em>Install Command</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Install Command</em>' containment reference.
     * @see #getInstallCommand()
     * @generated
     */
    void setInstallCommand(Script value);

    /**
     * Returns the value of the '<em><b>Start Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Command</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Command</em>' containment reference.
     * @see #setStartCommand(Script)
     * @see ddsm.DdsmPackage#getLifeCycle_StartCommand()
     * @model containment="true"
     * @generated
     */
    Script getStartCommand();

    /**
     * Sets the value of the '{@link ddsm.LifeCycle#getStartCommand <em>Start Command</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Command</em>' containment reference.
     * @see #getStartCommand()
     * @generated
     */
    void setStartCommand(Script value);

    /**
     * Returns the value of the '<em><b>Stop Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stop Command</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stop Command</em>' containment reference.
     * @see #setStopCommand(Script)
     * @see ddsm.DdsmPackage#getLifeCycle_StopCommand()
     * @model containment="true"
     * @generated
     */
    Script getStopCommand();

    /**
     * Sets the value of the '{@link ddsm.LifeCycle#getStopCommand <em>Stop Command</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stop Command</em>' containment reference.
     * @see #getStopCommand()
     * @generated
     */
    void setStopCommand(Script value);

    /**
     * Returns the value of the '<em><b>Preconfigure Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preconfigure Command</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Preconfigure Command</em>' containment reference.
     * @see #setPreconfigureCommand(Script)
     * @see ddsm.DdsmPackage#getLifeCycle_PreconfigureCommand()
     * @model containment="true"
     * @generated
     */
    Script getPreconfigureCommand();

    /**
     * Sets the value of the '{@link ddsm.LifeCycle#getPreconfigureCommand <em>Preconfigure Command</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Preconfigure Command</em>' containment reference.
     * @see #getPreconfigureCommand()
     * @generated
     */
    void setPreconfigureCommand(Script value);

    /**
     * Returns the value of the '<em><b>Create Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Create Command</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Create Command</em>' containment reference.
     * @see #setCreateCommand(Script)
     * @see ddsm.DdsmPackage#getLifeCycle_CreateCommand()
     * @model containment="true"
     * @generated
     */
    Script getCreateCommand();

    /**
     * Sets the value of the '{@link ddsm.LifeCycle#getCreateCommand <em>Create Command</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Create Command</em>' containment reference.
     * @see #getCreateCommand()
     * @generated
     */
    void setCreateCommand(Script value);

} // LifeCycle
