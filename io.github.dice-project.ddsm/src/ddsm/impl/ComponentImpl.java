/**
 */
package ddsm.impl;

import ddsm.Component;
import ddsm.DdsmPackage;
import ddsm.ProvidedExecutionPlatform;
import ddsm.ProvidedPort;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ComponentImpl#getProvidedport <em>Providedport</em>}</li>
 *   <li>{@link ddsm.impl.ComponentImpl#getProvidedexecutionplatform <em>Providedexecutionplatform</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends CloudElementImpl implements Component {
    /**
     * The cached value of the '{@link #getProvidedport() <em>Providedport</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvidedport()
     * @generated
     * @ordered
     */
    protected EList<ProvidedPort> providedport;

    /**
     * The cached value of the '{@link #getProvidedexecutionplatform() <em>Providedexecutionplatform</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvidedexecutionplatform()
     * @generated
     * @ordered
     */
    protected EList<ProvidedExecutionPlatform> providedexecutionplatform;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComponentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.COMPONENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ProvidedPort> getProvidedport() {
        if (providedport == null) {
            providedport = new EObjectContainmentEList<ProvidedPort>(ProvidedPort.class, this, DdsmPackage.COMPONENT__PROVIDEDPORT);
        }
        return providedport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ProvidedExecutionPlatform> getProvidedexecutionplatform() {
        if (providedexecutionplatform == null) {
            providedexecutionplatform = new EObjectContainmentEList<ProvidedExecutionPlatform>(ProvidedExecutionPlatform.class, this, DdsmPackage.COMPONENT__PROVIDEDEXECUTIONPLATFORM);
        }
        return providedexecutionplatform;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DdsmPackage.COMPONENT__PROVIDEDPORT:
                return ((InternalEList<?>)getProvidedport()).basicRemove(otherEnd, msgs);
            case DdsmPackage.COMPONENT__PROVIDEDEXECUTIONPLATFORM:
                return ((InternalEList<?>)getProvidedexecutionplatform()).basicRemove(otherEnd, msgs);
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
            case DdsmPackage.COMPONENT__PROVIDEDPORT:
                return getProvidedport();
            case DdsmPackage.COMPONENT__PROVIDEDEXECUTIONPLATFORM:
                return getProvidedexecutionplatform();
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
            case DdsmPackage.COMPONENT__PROVIDEDPORT:
                getProvidedport().clear();
                getProvidedport().addAll((Collection<? extends ProvidedPort>)newValue);
                return;
            case DdsmPackage.COMPONENT__PROVIDEDEXECUTIONPLATFORM:
                getProvidedexecutionplatform().clear();
                getProvidedexecutionplatform().addAll((Collection<? extends ProvidedExecutionPlatform>)newValue);
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
            case DdsmPackage.COMPONENT__PROVIDEDPORT:
                getProvidedport().clear();
                return;
            case DdsmPackage.COMPONENT__PROVIDEDEXECUTIONPLATFORM:
                getProvidedexecutionplatform().clear();
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
            case DdsmPackage.COMPONENT__PROVIDEDPORT:
                return providedport != null && !providedport.isEmpty();
            case DdsmPackage.COMPONENT__PROVIDEDEXECUTIONPLATFORM:
                return providedexecutionplatform != null && !providedexecutionplatform.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ComponentImpl
