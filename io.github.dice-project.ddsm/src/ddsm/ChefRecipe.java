/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chef Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.ChefRecipe#getRecipeUrl <em>Recipe Url</em>}</li>
 *   <li>{@link ddsm.ChefRecipe#getRecipePath <em>Recipe Path</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getChefRecipe()
 * @model
 * @generated
 */
public interface ChefRecipe extends Resource {
    /**
     * Returns the value of the '<em><b>Recipe Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recipe Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Recipe Url</em>' attribute.
     * @see #setRecipeUrl(String)
     * @see ddsm.DdsmPackage#getChefRecipe_RecipeUrl()
     * @model
     * @generated
     */
    String getRecipeUrl();

    /**
     * Sets the value of the '{@link ddsm.ChefRecipe#getRecipeUrl <em>Recipe Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Recipe Url</em>' attribute.
     * @see #getRecipeUrl()
     * @generated
     */
    void setRecipeUrl(String value);

    /**
     * Returns the value of the '<em><b>Recipe Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recipe Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Recipe Path</em>' attribute.
     * @see #setRecipePath(String)
     * @see ddsm.DdsmPackage#getChefRecipe_RecipePath()
     * @model
     * @generated
     */
    String getRecipePath();

    /**
     * Sets the value of the '{@link ddsm.ChefRecipe#getRecipePath <em>Recipe Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Recipe Path</em>' attribute.
     * @see #getRecipePath()
     * @generated
     */
    void setRecipePath(String value);

} // ChefRecipe
