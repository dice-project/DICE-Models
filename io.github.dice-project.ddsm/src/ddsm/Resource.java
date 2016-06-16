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
 *   <li>{@link ddsm.Resource#getName <em>Name</em>}</li>
 *   <li>{@link ddsm.Resource#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link ddsm.Resource#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
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
     * @see ddsm.DdsmPackage#getResource_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ddsm.Resource#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

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
     * @model
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
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see ddsm.DdsmPackage#getResource_Value()
     * @model
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link ddsm.Resource#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // Resource
