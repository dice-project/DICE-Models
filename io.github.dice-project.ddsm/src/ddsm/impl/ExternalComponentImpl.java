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
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.EXTERNAL_COMPONENT__PROVIDER:
                if (resolve) return getProvider();
                return basicGetProvider();
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
        }
        return super.eIsSet(featureID);
    }

} //ExternalComponentImpl
