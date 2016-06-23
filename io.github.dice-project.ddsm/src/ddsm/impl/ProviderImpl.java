/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.Provider;
import ddsm.ProviderType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ProviderImpl#getCredentialsPath <em>Credentials Path</em>}</li>
 *   <li>{@link ddsm.impl.ProviderImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProviderImpl extends CloudElementImpl implements Provider {
    /**
     * The default value of the '{@link #getCredentialsPath() <em>Credentials Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCredentialsPath()
     * @generated
     * @ordered
     */
    protected static final String CREDENTIALS_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCredentialsPath() <em>Credentials Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCredentialsPath()
     * @generated
     * @ordered
     */
    protected String credentialsPath = CREDENTIALS_PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final ProviderType TYPE_EDEFAULT = ProviderType.FLEXIANT;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ProviderType type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProviderImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.PROVIDER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCredentialsPath() {
        return credentialsPath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCredentialsPath(String newCredentialsPath) {
        String oldCredentialsPath = credentialsPath;
        credentialsPath = newCredentialsPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.PROVIDER__CREDENTIALS_PATH, oldCredentialsPath, credentialsPath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProviderType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(ProviderType newType) {
        ProviderType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.PROVIDER__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.PROVIDER__CREDENTIALS_PATH:
                return getCredentialsPath();
            case DdsmPackage.PROVIDER__TYPE:
                return getType();
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
            case DdsmPackage.PROVIDER__CREDENTIALS_PATH:
                setCredentialsPath((String)newValue);
                return;
            case DdsmPackage.PROVIDER__TYPE:
                setType((ProviderType)newValue);
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
            case DdsmPackage.PROVIDER__CREDENTIALS_PATH:
                setCredentialsPath(CREDENTIALS_PATH_EDEFAULT);
                return;
            case DdsmPackage.PROVIDER__TYPE:
                setType(TYPE_EDEFAULT);
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
            case DdsmPackage.PROVIDER__CREDENTIALS_PATH:
                return CREDENTIALS_PATH_EDEFAULT == null ? credentialsPath != null : !CREDENTIALS_PATH_EDEFAULT.equals(credentialsPath);
            case DdsmPackage.PROVIDER__TYPE:
                return type != TYPE_EDEFAULT;
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
        result.append(" (credentialsPath: ");
        result.append(credentialsPath);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //ProviderImpl
