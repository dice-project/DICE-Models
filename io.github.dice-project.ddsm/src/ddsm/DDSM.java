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
 *   <li>{@link ddsm.DDSM#getModelId <em>Model Id</em>}</li>
 *   <li>{@link ddsm.DDSM#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getDDSM()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='test generation'"
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

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see ddsm.DdsmPackage#getDDSM_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link ddsm.DDSM#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

} // DDSM
