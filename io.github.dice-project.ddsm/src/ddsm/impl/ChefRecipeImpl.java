/**
 */
package ddsm.impl;

import ddsm.ChefRecipe;
import ddsm.DdsmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chef Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ChefRecipeImpl#getRecipeUrl <em>Recipe Url</em>}</li>
 *   <li>{@link ddsm.impl.ChefRecipeImpl#getRecipePath <em>Recipe Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChefRecipeImpl extends ResourceImpl implements ChefRecipe {
    /**
     * The default value of the '{@link #getRecipeUrl() <em>Recipe Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecipeUrl()
     * @generated
     * @ordered
     */
    protected static final String RECIPE_URL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRecipeUrl() <em>Recipe Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecipeUrl()
     * @generated
     * @ordered
     */
    protected String recipeUrl = RECIPE_URL_EDEFAULT;

    /**
     * The default value of the '{@link #getRecipePath() <em>Recipe Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecipePath()
     * @generated
     * @ordered
     */
    protected static final String RECIPE_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRecipePath() <em>Recipe Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecipePath()
     * @generated
     * @ordered
     */
    protected String recipePath = RECIPE_PATH_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChefRecipeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.CHEF_RECIPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRecipeUrl() {
        return recipeUrl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRecipeUrl(String newRecipeUrl) {
        String oldRecipeUrl = recipeUrl;
        recipeUrl = newRecipeUrl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CHEF_RECIPE__RECIPE_URL, oldRecipeUrl, recipeUrl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRecipePath() {
        return recipePath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRecipePath(String newRecipePath) {
        String oldRecipePath = recipePath;
        recipePath = newRecipePath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CHEF_RECIPE__RECIPE_PATH, oldRecipePath, recipePath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.CHEF_RECIPE__RECIPE_URL:
                return getRecipeUrl();
            case DdsmPackage.CHEF_RECIPE__RECIPE_PATH:
                return getRecipePath();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DdsmPackage.CHEF_RECIPE__RECIPE_URL:
                setRecipeUrl((String)newValue);
                return;
            case DdsmPackage.CHEF_RECIPE__RECIPE_PATH:
                setRecipePath((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case DdsmPackage.CHEF_RECIPE__RECIPE_URL:
                setRecipeUrl(RECIPE_URL_EDEFAULT);
                return;
            case DdsmPackage.CHEF_RECIPE__RECIPE_PATH:
                setRecipePath(RECIPE_PATH_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case DdsmPackage.CHEF_RECIPE__RECIPE_URL:
                return RECIPE_URL_EDEFAULT == null ? recipeUrl != null : !RECIPE_URL_EDEFAULT.equals(recipeUrl);
            case DdsmPackage.CHEF_RECIPE__RECIPE_PATH:
                return RECIPE_PATH_EDEFAULT == null ? recipePath != null : !RECIPE_PATH_EDEFAULT.equals(recipePath);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (recipeUrl: ");
        result.append(recipeUrl);
        result.append(", recipePath: ");
        result.append(recipePath);
        result.append(')');
        return result.toString();
    }

} //ChefRecipeImpl
