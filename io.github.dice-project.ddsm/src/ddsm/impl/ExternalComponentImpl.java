/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.ExternalComponent;
import ddsm.Provider;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ExternalComponentImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link ddsm.impl.ExternalComponentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link ddsm.impl.ExternalComponentImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link ddsm.impl.ExternalComponentImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link ddsm.impl.ExternalComponentImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link ddsm.impl.ExternalComponentImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link ddsm.impl.ExternalComponentImpl#getEndPoint <em>End Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalComponentImpl extends ComponentImpl implements ExternalComponent {
    /**
     * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvider()
     * @generated
     * @ordered
     */
    protected Provider provider;

    /**
     * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected static final String LOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected String location = LOCATION_EDEFAULT;

    /**
     * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogin()
     * @generated
     * @ordered
     */
    protected static final String LOGIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLogin() <em>Login</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogin()
     * @generated
     * @ordered
     */
    protected String login = LOGIN_EDEFAULT;

    /**
     * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected static final String PASSWORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected String password = PASSWORD_EDEFAULT;

    /**
     * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegion()
     * @generated
     * @ordered
     */
    protected static final String REGION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegion()
     * @generated
     * @ordered
     */
    protected String region = REGION_EDEFAULT;

    /**
     * The default value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceType()
     * @generated
     * @ordered
     */
    protected static final String SERVICE_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceType()
     * @generated
     * @ordered
     */
    protected String serviceType = SERVICE_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getEndPoint() <em>End Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndPoint()
     * @generated
     * @ordered
     */
    protected static final String END_POINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndPoint() <em>End Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndPoint()
     * @generated
     * @ordered
     */
    protected String endPoint = END_POINT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExternalComponentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.EXTERNAL_COMPONENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Provider getProvider() {
        if (provider != null && provider.eIsProxy()) {
            InternalEObject oldProvider = (InternalEObject)provider;
            provider = (Provider)eResolveProxy(oldProvider);
            if (provider != oldProvider) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.EXTERNAL_COMPONENT__PROVIDER, oldProvider, provider));
            }
        }
        return provider;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Provider basicGetProvider() {
        return provider;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProvider(Provider newProvider) {
        Provider oldProvider = provider;
        provider = newProvider;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.EXTERNAL_COMPONENT__PROVIDER, oldProvider, provider));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocation(String newLocation) {
        String oldLocation = location;
        location = newLocation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.EXTERNAL_COMPONENT__LOCATION, oldLocation, location));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLogin() {
        return login;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLogin(String newLogin) {
        String oldLogin = login;
        login = newLogin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.EXTERNAL_COMPONENT__LOGIN, oldLogin, login));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPassword(String newPassword) {
        String oldPassword = password;
        password = newPassword;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.EXTERNAL_COMPONENT__PASSWORD, oldPassword, password));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRegion() {
        return region;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRegion(String newRegion) {
        String oldRegion = region;
        region = newRegion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.EXTERNAL_COMPONENT__REGION, oldRegion, region));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServiceType(String newServiceType) {
        String oldServiceType = serviceType;
        serviceType = newServiceType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.EXTERNAL_COMPONENT__SERVICE_TYPE, oldServiceType, serviceType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndPoint(String newEndPoint) {
        String oldEndPoint = endPoint;
        endPoint = newEndPoint;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.EXTERNAL_COMPONENT__END_POINT, oldEndPoint, endPoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.EXTERNAL_COMPONENT__PROVIDER:
                if (resolve) return getProvider();
                return basicGetProvider();
            case DdsmPackage.EXTERNAL_COMPONENT__LOCATION:
                return getLocation();
            case DdsmPackage.EXTERNAL_COMPONENT__LOGIN:
                return getLogin();
            case DdsmPackage.EXTERNAL_COMPONENT__PASSWORD:
                return getPassword();
            case DdsmPackage.EXTERNAL_COMPONENT__REGION:
                return getRegion();
            case DdsmPackage.EXTERNAL_COMPONENT__SERVICE_TYPE:
                return getServiceType();
            case DdsmPackage.EXTERNAL_COMPONENT__END_POINT:
                return getEndPoint();
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
            case DdsmPackage.EXTERNAL_COMPONENT__PROVIDER:
                setProvider((Provider)newValue);
                return;
            case DdsmPackage.EXTERNAL_COMPONENT__LOCATION:
                setLocation((String)newValue);
                return;
            case DdsmPackage.EXTERNAL_COMPONENT__LOGIN:
                setLogin((String)newValue);
                return;
            case DdsmPackage.EXTERNAL_COMPONENT__PASSWORD:
                setPassword((String)newValue);
                return;
            case DdsmPackage.EXTERNAL_COMPONENT__REGION:
                setRegion((String)newValue);
                return;
            case DdsmPackage.EXTERNAL_COMPONENT__SERVICE_TYPE:
                setServiceType((String)newValue);
                return;
            case DdsmPackage.EXTERNAL_COMPONENT__END_POINT:
                setEndPoint((String)newValue);
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
            case DdsmPackage.EXTERNAL_COMPONENT__PROVIDER:
                setProvider((Provider)null);
                return;
            case DdsmPackage.EXTERNAL_COMPONENT__LOCATION:
                setLocation(LOCATION_EDEFAULT);
                return;
            case DdsmPackage.EXTERNAL_COMPONENT__LOGIN:
                setLogin(LOGIN_EDEFAULT);
                return;
            case DdsmPackage.EXTERNAL_COMPONENT__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
                return;
            case DdsmPackage.EXTERNAL_COMPONENT__REGION:
                setRegion(REGION_EDEFAULT);
                return;
            case DdsmPackage.EXTERNAL_COMPONENT__SERVICE_TYPE:
                setServiceType(SERVICE_TYPE_EDEFAULT);
                return;
            case DdsmPackage.EXTERNAL_COMPONENT__END_POINT:
                setEndPoint(END_POINT_EDEFAULT);
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
            case DdsmPackage.EXTERNAL_COMPONENT__PROVIDER:
                return provider != null;
            case DdsmPackage.EXTERNAL_COMPONENT__LOCATION:
                return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
            case DdsmPackage.EXTERNAL_COMPONENT__LOGIN:
                return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
            case DdsmPackage.EXTERNAL_COMPONENT__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
            case DdsmPackage.EXTERNAL_COMPONENT__REGION:
                return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
            case DdsmPackage.EXTERNAL_COMPONENT__SERVICE_TYPE:
                return SERVICE_TYPE_EDEFAULT == null ? serviceType != null : !SERVICE_TYPE_EDEFAULT.equals(serviceType);
            case DdsmPackage.EXTERNAL_COMPONENT__END_POINT:
                return END_POINT_EDEFAULT == null ? endPoint != null : !END_POINT_EDEFAULT.equals(endPoint);
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
        result.append(" (location: ");
        result.append(location);
        result.append(", login: ");
        result.append(login);
        result.append(", password: ");
        result.append(password);
        result.append(", region: ");
        result.append(region);
        result.append(", serviceType: ");
        result.append(serviceType);
        result.append(", endPoint: ");
        result.append(endPoint);
        result.append(')');
        return result.toString();
    }

} //ExternalComponentImpl
