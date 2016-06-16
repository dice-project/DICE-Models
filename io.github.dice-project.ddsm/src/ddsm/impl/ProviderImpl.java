/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.Property;
import ddsm.Provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ProviderImpl#getCredentialsPath <em>Credentials Path</em>}</li>
 *   <li>{@link ddsm.impl.ProviderImpl#getName <em>Name</em>}</li>
 *   <li>{@link ddsm.impl.ProviderImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link ddsm.impl.ProviderImpl#getProviderId <em>Provider Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProviderImpl extends MinimalEObjectImpl.Container implements Provider {
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
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
    protected EList<Property> property;

    /**
     * The default value of the '{@link #getProviderId() <em>Provider Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProviderId()
     * @generated
     * @ordered
     */
    protected static final String PROVIDER_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProviderId() <em>Provider Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProviderId()
     * @generated
     * @ordered
     */
    protected String providerId = PROVIDER_ID_EDEFAULT;

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
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.PROVIDER__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperty() {
        if (property == null) {
            property = new EObjectContainmentEList<Property>(Property.class, this, DdsmPackage.PROVIDER__PROPERTY);
        }
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProviderId(String newProviderId) {
        String oldProviderId = providerId;
        providerId = newProviderId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.PROVIDER__PROVIDER_ID, oldProviderId, providerId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DdsmPackage.PROVIDER__PROPERTY:
                return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
            case DdsmPackage.PROVIDER__NAME:
                return getName();
            case DdsmPackage.PROVIDER__PROPERTY:
                return getProperty();
            case DdsmPackage.PROVIDER__PROVIDER_ID:
                return getProviderId();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DdsmPackage.PROVIDER__CREDENTIALS_PATH:
                setCredentialsPath((String)newValue);
                return;
            case DdsmPackage.PROVIDER__NAME:
                setName((String)newValue);
                return;
            case DdsmPackage.PROVIDER__PROPERTY:
                getProperty().clear();
                getProperty().addAll((Collection<? extends Property>)newValue);
                return;
            case DdsmPackage.PROVIDER__PROVIDER_ID:
                setProviderId((String)newValue);
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
            case DdsmPackage.PROVIDER__NAME:
                setName(NAME_EDEFAULT);
                return;
            case DdsmPackage.PROVIDER__PROPERTY:
                getProperty().clear();
                return;
            case DdsmPackage.PROVIDER__PROVIDER_ID:
                setProviderId(PROVIDER_ID_EDEFAULT);
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
            case DdsmPackage.PROVIDER__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case DdsmPackage.PROVIDER__PROPERTY:
                return property != null && !property.isEmpty();
            case DdsmPackage.PROVIDER__PROVIDER_ID:
                return PROVIDER_ID_EDEFAULT == null ? providerId != null : !PROVIDER_ID_EDEFAULT.equals(providerId);
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
        result.append(", name: ");
        result.append(name);
        result.append(", providerId: ");
        result.append(providerId);
        result.append(')');
        return result.toString();
    }

} //ProviderImpl
