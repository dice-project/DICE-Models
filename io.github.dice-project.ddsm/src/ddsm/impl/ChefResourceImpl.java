/**
 */
package ddsm.impl;

import ddsm.ChefResource;
import ddsm.DdsmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chef Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ChefResourceImpl#getCookbookId <em>Cookbook Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChefResourceImpl extends ResourceImpl implements ChefResource {
    /**
     * The default value of the '{@link #getCookbookId() <em>Cookbook Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCookbookId()
     * @generated
     * @ordered
     */
    protected static final String COOKBOOK_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCookbookId() <em>Cookbook Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCookbookId()
     * @generated
     * @ordered
     */
    protected String cookbookId = COOKBOOK_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChefResourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.CHEF_RESOURCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCookbookId() {
        return cookbookId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCookbookId(String newCookbookId) {
        String oldCookbookId = cookbookId;
        cookbookId = newCookbookId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CHEF_RESOURCE__COOKBOOK_ID, oldCookbookId, cookbookId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.CHEF_RESOURCE__COOKBOOK_ID:
                return getCookbookId();
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
            case DdsmPackage.CHEF_RESOURCE__COOKBOOK_ID:
                setCookbookId((String)newValue);
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
            case DdsmPackage.CHEF_RESOURCE__COOKBOOK_ID:
                setCookbookId(COOKBOOK_ID_EDEFAULT);
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
            case DdsmPackage.CHEF_RESOURCE__COOKBOOK_ID:
                return COOKBOOK_ID_EDEFAULT == null ? cookbookId != null : !COOKBOOK_ID_EDEFAULT.equals(cookbookId);
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
        result.append(" (cookbookId: ");
        result.append(cookbookId);
        result.append(')');
        return result.toString();
    }

} //ChefResourceImpl
