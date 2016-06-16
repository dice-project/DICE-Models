/**
 */
package ddsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.CloudElement#getResource <em>Resource</em>}</li>
 *   <li>{@link ddsm.CloudElement#getProperty <em>Property</em>}</li>
 *   <li>{@link ddsm.CloudElement#getCloudElementId <em>Cloud Element Id</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getCloudElement()
 * @model
 * @generated
 */
public interface CloudElement extends EObject {
    /**
     * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
     * The list contents are of type {@link ddsm.Resource}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource</em>' containment reference list.
     * @see ddsm.DdsmPackage#getCloudElement_Resource()
     * @model containment="true"
     * @generated
     */
    EList<Resource> getResource();

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
     * @see ddsm.DdsmPackage#getCloudElement_Property()
     * @model containment="true"
     * @generated
     */
    EList<Property> getProperty();

    /**
     * Returns the value of the '<em><b>Cloud Element Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cloud Element Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cloud Element Id</em>' attribute.
     * @see #setCloudElementId(String)
     * @see ddsm.DdsmPackage#getCloudElement_CloudElementId()
     * @model id="true"
     * @generated
     */
    String getCloudElementId();

    /**
     * Sets the value of the '{@link ddsm.CloudElement#getCloudElementId <em>Cloud Element Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cloud Element Id</em>' attribute.
     * @see #getCloudElementId()
     * @generated
     */
    void setCloudElementId(String value);

} // CloudElement
