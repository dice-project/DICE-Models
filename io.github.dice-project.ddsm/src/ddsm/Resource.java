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
 *   <li>{@link ddsm.Resource#getScripts <em>Scripts</em>}</li>
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
     * Returns the value of the '<em><b>Scripts</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scripts</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scripts</em>' containment reference.
     * @see #setScripts(Script)
     * @see ddsm.DdsmPackage#getResource_Scripts()
     * @model containment="true" required="true"
     * @generated
     */
    Script getScripts();

    /**
     * Sets the value of the '{@link ddsm.Resource#getScripts <em>Scripts</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scripts</em>' containment reference.
     * @see #getScripts()
     * @generated
     */
    void setScripts(Script value);

} // Resource
