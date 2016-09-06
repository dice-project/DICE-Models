/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chef Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.ChefResource#getCookbookId <em>Cookbook Id</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getChefResource()
 * @model
 * @generated
 */
public interface ChefResource extends Resource {
    /**
     * Returns the value of the '<em><b>Cookbook Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cookbook Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cookbook Id</em>' attribute.
     * @see #setCookbookId(String)
     * @see ddsm.DdsmPackage#getChefResource_CookbookId()
     * @model required="true"
     * @generated
     */
    String getCookbookId();

    /**
     * Sets the value of the '{@link ddsm.ChefResource#getCookbookId <em>Cookbook Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cookbook Id</em>' attribute.
     * @see #getCookbookId()
     * @generated
     */
    void setCookbookId(String value);

} // ChefResource
