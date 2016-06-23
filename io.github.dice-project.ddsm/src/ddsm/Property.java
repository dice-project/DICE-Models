/**
 */
package ddsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.Property#getValue <em>Value</em>}</li>
 *   <li>{@link ddsm.Property#getPropertyId <em>Property Id</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getProperty()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='Represents a generic properties, specified by a pair of <id,value> and owned by a CloudElement.\n'"
 * @generated
 */
public interface Property extends EObject {
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
     * @see ddsm.DdsmPackage#getProperty_Value()
     * @model
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link ddsm.Property#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Property Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Id</em>' attribute.
     * @see #setPropertyId(String)
     * @see ddsm.DdsmPackage#getProperty_PropertyId()
     * @model id="true" required="true"
     * @generated
     */
    String getPropertyId();

    /**
     * Sets the value of the '{@link ddsm.Property#getPropertyId <em>Property Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Id</em>' attribute.
     * @see #getPropertyId()
     * @generated
     */
    void setPropertyId(String value);

} // Property
