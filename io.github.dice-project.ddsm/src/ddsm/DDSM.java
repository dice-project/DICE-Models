/**
 */
package ddsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DDSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.DDSM#getCloudelement <em>Cloudelement</em>}</li>
 *   <li>{@link ddsm.DDSM#getProvider <em>Provider</em>}</li>
 *   <li>{@link ddsm.DDSM#getName <em>Name</em>}</li>
 *   <li>{@link ddsm.DDSM#getModelId <em>Model Id</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getDDSM()
 * @model
 * @generated
 */
public interface DDSM extends EObject {
    /**
     * Returns the value of the '<em><b>Cloudelement</b></em>' containment reference list.
     * The list contents are of type {@link ddsm.CloudElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cloudelement</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cloudelement</em>' containment reference list.
     * @see ddsm.DdsmPackage#getDDSM_Cloudelement()
     * @model containment="true"
     * @generated
     */
    EList<CloudElement> getCloudelement();

    /**
     * Returns the value of the '<em><b>Provider</b></em>' containment reference list.
     * The list contents are of type {@link ddsm.Provider}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provider</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provider</em>' containment reference list.
     * @see ddsm.DdsmPackage#getDDSM_Provider()
     * @model containment="true"
     * @generated
     */
    EList<Provider> getProvider();

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
     * @see ddsm.DdsmPackage#getDDSM_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ddsm.DDSM#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Model Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model Id</em>' attribute.
     * @see #setModelId(String)
     * @see ddsm.DdsmPackage#getDDSM_ModelId()
     * @model id="true"
     * @generated
     */
    String getModelId();

    /**
     * Sets the value of the '{@link ddsm.DDSM#getModelId <em>Model Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Id</em>' attribute.
     * @see #getModelId()
     * @generated
     */
    void setModelId(String value);

} // DDSM
