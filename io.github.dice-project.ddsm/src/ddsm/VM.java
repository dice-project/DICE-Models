/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.VM#getIs64os <em>Is64os</em>}</li>
 *   <li>{@link ddsm.VM#getImageId <em>Image Id</em>}</li>
 *   <li>{@link ddsm.VM#getMaxCores <em>Max Cores</em>}</li>
 *   <li>{@link ddsm.VM#getMaxRam <em>Max Ram</em>}</li>
 *   <li>{@link ddsm.VM#getMaxStorage <em>Max Storage</em>}</li>
 *   <li>{@link ddsm.VM#getMinCores <em>Min Cores</em>}</li>
 *   <li>{@link ddsm.VM#getMinRam <em>Min Ram</em>}</li>
 *   <li>{@link ddsm.VM#getMinStorage <em>Min Storage</em>}</li>
 *   <li>{@link ddsm.VM#getOs <em>Os</em>}</li>
 *   <li>{@link ddsm.VM#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link ddsm.VM#getProviderSpecificTypeName <em>Provider Specific Type Name</em>}</li>
 *   <li>{@link ddsm.VM#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link ddsm.VM#getSshKey <em>Ssh Key</em>}</li>
 *   <li>{@link ddsm.VM#getPublicAddress <em>Public Address</em>}</li>
 *   <li>{@link ddsm.VM#getInstances <em>Instances</em>}</li>
 *   <li>{@link ddsm.VM#getGenericSize <em>Generic Size</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getVM()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='It is an specific ExternalComponent representing the well know concept of virtual machine.\nIt is possible to the size of the VM in terms of RAM and CPU and Storage size ranges, \nthe preferred operating system, the enabled ports, the desired public address and the number of executing instances,\nor the replication factor. It as been customized in the context of DICE to be able to specify DICE specific type of VM.'"
 * @generated
 */
public interface VM extends ExternalComponent {
    /**
     * Returns the value of the '<em><b>Is64os</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is64os</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is64os</em>' attribute.
     * @see #setIs64os(String)
     * @see ddsm.DdsmPackage#getVM_Is64os()
     * @model
     * @generated
     */
    String getIs64os();

    /**
     * Sets the value of the '{@link ddsm.VM#getIs64os <em>Is64os</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is64os</em>' attribute.
     * @see #getIs64os()
     * @generated
     */
    void setIs64os(String value);

    /**
     * Returns the value of the '<em><b>Image Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Image Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Image Id</em>' attribute.
     * @see #setImageId(String)
     * @see ddsm.DdsmPackage#getVM_ImageId()
     * @model
     * @generated
     */
    String getImageId();

    /**
     * Sets the value of the '{@link ddsm.VM#getImageId <em>Image Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Image Id</em>' attribute.
     * @see #getImageId()
     * @generated
     */
    void setImageId(String value);

    /**
     * Returns the value of the '<em><b>Max Cores</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Cores</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Cores</em>' attribute.
     * @see #setMaxCores(String)
     * @see ddsm.DdsmPackage#getVM_MaxCores()
     * @model
     * @generated
     */
    String getMaxCores();

    /**
     * Sets the value of the '{@link ddsm.VM#getMaxCores <em>Max Cores</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Cores</em>' attribute.
     * @see #getMaxCores()
     * @generated
     */
    void setMaxCores(String value);

    /**
     * Returns the value of the '<em><b>Max Ram</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Ram</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Ram</em>' attribute.
     * @see #setMaxRam(String)
     * @see ddsm.DdsmPackage#getVM_MaxRam()
     * @model
     * @generated
     */
    String getMaxRam();

    /**
     * Sets the value of the '{@link ddsm.VM#getMaxRam <em>Max Ram</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Ram</em>' attribute.
     * @see #getMaxRam()
     * @generated
     */
    void setMaxRam(String value);

    /**
     * Returns the value of the '<em><b>Max Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Storage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Storage</em>' attribute.
     * @see #setMaxStorage(String)
     * @see ddsm.DdsmPackage#getVM_MaxStorage()
     * @model
     * @generated
     */
    String getMaxStorage();

    /**
     * Sets the value of the '{@link ddsm.VM#getMaxStorage <em>Max Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Storage</em>' attribute.
     * @see #getMaxStorage()
     * @generated
     */
    void setMaxStorage(String value);

    /**
     * Returns the value of the '<em><b>Min Cores</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Cores</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Cores</em>' attribute.
     * @see #setMinCores(String)
     * @see ddsm.DdsmPackage#getVM_MinCores()
     * @model
     * @generated
     */
    String getMinCores();

    /**
     * Sets the value of the '{@link ddsm.VM#getMinCores <em>Min Cores</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Cores</em>' attribute.
     * @see #getMinCores()
     * @generated
     */
    void setMinCores(String value);

    /**
     * Returns the value of the '<em><b>Min Ram</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Ram</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Ram</em>' attribute.
     * @see #setMinRam(String)
     * @see ddsm.DdsmPackage#getVM_MinRam()
     * @model
     * @generated
     */
    String getMinRam();

    /**
     * Sets the value of the '{@link ddsm.VM#getMinRam <em>Min Ram</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Ram</em>' attribute.
     * @see #getMinRam()
     * @generated
     */
    void setMinRam(String value);

    /**
     * Returns the value of the '<em><b>Min Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Storage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Storage</em>' attribute.
     * @see #setMinStorage(String)
     * @see ddsm.DdsmPackage#getVM_MinStorage()
     * @model
     * @generated
     */
    String getMinStorage();

    /**
     * Sets the value of the '{@link ddsm.VM#getMinStorage <em>Min Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Storage</em>' attribute.
     * @see #getMinStorage()
     * @generated
     */
    void setMinStorage(String value);

    /**
     * Returns the value of the '<em><b>Os</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Os</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Os</em>' attribute.
     * @see #setOs(String)
     * @see ddsm.DdsmPackage#getVM_Os()
     * @model
     * @generated
     */
    String getOs();

    /**
     * Sets the value of the '{@link ddsm.VM#getOs <em>Os</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Os</em>' attribute.
     * @see #getOs()
     * @generated
     */
    void setOs(String value);

    /**
     * Returns the value of the '<em><b>Private Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Private Key</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Private Key</em>' attribute.
     * @see #setPrivateKey(String)
     * @see ddsm.DdsmPackage#getVM_PrivateKey()
     * @model
     * @generated
     */
    String getPrivateKey();

    /**
     * Sets the value of the '{@link ddsm.VM#getPrivateKey <em>Private Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Private Key</em>' attribute.
     * @see #getPrivateKey()
     * @generated
     */
    void setPrivateKey(String value);

    /**
     * Returns the value of the '<em><b>Provider Specific Type Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provider Specific Type Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provider Specific Type Name</em>' attribute.
     * @see #setProviderSpecificTypeName(String)
     * @see ddsm.DdsmPackage#getVM_ProviderSpecificTypeName()
     * @model
     * @generated
     */
    String getProviderSpecificTypeName();

    /**
     * Sets the value of the '{@link ddsm.VM#getProviderSpecificTypeName <em>Provider Specific Type Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Provider Specific Type Name</em>' attribute.
     * @see #getProviderSpecificTypeName()
     * @generated
     */
    void setProviderSpecificTypeName(String value);

    /**
     * Returns the value of the '<em><b>Security Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Security Group</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Security Group</em>' attribute.
     * @see #setSecurityGroup(String)
     * @see ddsm.DdsmPackage#getVM_SecurityGroup()
     * @model
     * @generated
     */
    String getSecurityGroup();

    /**
     * Sets the value of the '{@link ddsm.VM#getSecurityGroup <em>Security Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Security Group</em>' attribute.
     * @see #getSecurityGroup()
     * @generated
     */
    void setSecurityGroup(String value);

    /**
     * Returns the value of the '<em><b>Ssh Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ssh Key</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ssh Key</em>' attribute.
     * @see #setSshKey(String)
     * @see ddsm.DdsmPackage#getVM_SshKey()
     * @model
     * @generated
     */
    String getSshKey();

    /**
     * Sets the value of the '{@link ddsm.VM#getSshKey <em>Ssh Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ssh Key</em>' attribute.
     * @see #getSshKey()
     * @generated
     */
    void setSshKey(String value);

    /**
     * Returns the value of the '<em><b>Public Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Public Address</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Public Address</em>' attribute.
     * @see #setPublicAddress(String)
     * @see ddsm.DdsmPackage#getVM_PublicAddress()
     * @model
     * @generated
     */
    String getPublicAddress();

    /**
     * Sets the value of the '{@link ddsm.VM#getPublicAddress <em>Public Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Public Address</em>' attribute.
     * @see #getPublicAddress()
     * @generated
     */
    void setPublicAddress(String value);

    /**
     * Returns the value of the '<em><b>Instances</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' attribute.
     * @see #setInstances(Integer)
     * @see ddsm.DdsmPackage#getVM_Instances()
     * @model default="1"
     * @generated
     */
    Integer getInstances();

    /**
     * Sets the value of the '{@link ddsm.VM#getInstances <em>Instances</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instances</em>' attribute.
     * @see #getInstances()
     * @generated
     */
    void setInstances(Integer value);

    /**
     * Returns the value of the '<em><b>Generic Size</b></em>' attribute.
     * The literals are from the enumeration {@link ddsm.VMSize}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generic Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generic Size</em>' attribute.
     * @see ddsm.VMSize
     * @see #setGenericSize(VMSize)
     * @see ddsm.DdsmPackage#getVM_GenericSize()
     * @model
     * @generated
     */
    VMSize getGenericSize();

    /**
     * Sets the value of the '{@link ddsm.VM#getGenericSize <em>Generic Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generic Size</em>' attribute.
     * @see ddsm.VMSize
     * @see #getGenericSize()
     * @generated
     */
    void setGenericSize(VMSize value);

} // VM
