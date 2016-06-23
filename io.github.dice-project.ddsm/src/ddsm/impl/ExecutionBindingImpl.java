/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.ExecutionBinding;
import ddsm.ProvidedExecutionPlatform;
import ddsm.RequiredExecutionPlatform;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ExecutionBindingImpl#getRequiredexecutionplatform <em>Requiredexecutionplatform</em>}</li>
 *   <li>{@link ddsm.impl.ExecutionBindingImpl#getProvidedexecutionplatform <em>Providedexecutionplatform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionBindingImpl extends CloudElementImpl implements ExecutionBinding {
    /**
     * The cached value of the '{@link #getRequiredexecutionplatform() <em>Requiredexecutionplatform</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequiredexecutionplatform()
     * @generated
     * @ordered
     */
    protected RequiredExecutionPlatform requiredexecutionplatform;

    /**
     * The cached value of the '{@link #getProvidedexecutionplatform() <em>Providedexecutionplatform</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvidedexecutionplatform()
     * @generated
     * @ordered
     */
    protected ProvidedExecutionPlatform providedexecutionplatform;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionBindingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.EXECUTION_BINDING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RequiredExecutionPlatform getRequiredexecutionplatform() {
        if (requiredexecutionplatform != null && requiredexecutionplatform.eIsProxy()) {
            InternalEObject oldRequiredexecutionplatform = (InternalEObject)requiredexecutionplatform;
            requiredexecutionplatform = (RequiredExecutionPlatform)eResolveProxy(oldRequiredexecutionplatform);
            if (requiredexecutionplatform != oldRequiredexecutionplatform) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.EXECUTION_BINDING__REQUIREDEXECUTIONPLATFORM, oldRequiredexecutionplatform, requiredexecutionplatform));
            }
        }
        return requiredexecutionplatform;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RequiredExecutionPlatform basicGetRequiredexecutionplatform() {
        return requiredexecutionplatform;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequiredexecutionplatform(RequiredExecutionPlatform newRequiredexecutionplatform) {
        RequiredExecutionPlatform oldRequiredexecutionplatform = requiredexecutionplatform;
        requiredexecutionplatform = newRequiredexecutionplatform;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.EXECUTION_BINDING__REQUIREDEXECUTIONPLATFORM, oldRequiredexecutionplatform, requiredexecutionplatform));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProvidedExecutionPlatform getProvidedexecutionplatform() {
        if (providedexecutionplatform != null && providedexecutionplatform.eIsProxy()) {
            InternalEObject oldProvidedexecutionplatform = (InternalEObject)providedexecutionplatform;
            providedexecutionplatform = (ProvidedExecutionPlatform)eResolveProxy(oldProvidedexecutionplatform);
            if (providedexecutionplatform != oldProvidedexecutionplatform) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.EXECUTION_BINDING__PROVIDEDEXECUTIONPLATFORM, oldProvidedexecutionplatform, providedexecutionplatform));
            }
        }
        return providedexecutionplatform;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProvidedExecutionPlatform basicGetProvidedexecutionplatform() {
        return providedexecutionplatform;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProvidedexecutionplatform(ProvidedExecutionPlatform newProvidedexecutionplatform) {
        ProvidedExecutionPlatform oldProvidedexecutionplatform = providedexecutionplatform;
        providedexecutionplatform = newProvidedexecutionplatform;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.EXECUTION_BINDING__PROVIDEDEXECUTIONPLATFORM, oldProvidedexecutionplatform, providedexecutionplatform));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.EXECUTION_BINDING__REQUIREDEXECUTIONPLATFORM:
                if (resolve) return getRequiredexecutionplatform();
                return basicGetRequiredexecutionplatform();
            case DdsmPackage.EXECUTION_BINDING__PROVIDEDEXECUTIONPLATFORM:
                if (resolve) return getProvidedexecutionplatform();
                return basicGetProvidedexecutionplatform();
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
            case DdsmPackage.EXECUTION_BINDING__REQUIREDEXECUTIONPLATFORM:
                setRequiredexecutionplatform((RequiredExecutionPlatform)newValue);
                return;
            case DdsmPackage.EXECUTION_BINDING__PROVIDEDEXECUTIONPLATFORM:
                setProvidedexecutionplatform((ProvidedExecutionPlatform)newValue);
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
            case DdsmPackage.EXECUTION_BINDING__REQUIREDEXECUTIONPLATFORM:
                setRequiredexecutionplatform((RequiredExecutionPlatform)null);
                return;
            case DdsmPackage.EXECUTION_BINDING__PROVIDEDEXECUTIONPLATFORM:
                setProvidedexecutionplatform((ProvidedExecutionPlatform)null);
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
            case DdsmPackage.EXECUTION_BINDING__REQUIREDEXECUTIONPLATFORM:
                return requiredexecutionplatform != null;
            case DdsmPackage.EXECUTION_BINDING__PROVIDEDEXECUTIONPLATFORM:
                return providedexecutionplatform != null;
        }
        return super.eIsSet(featureID);
    }

} //ExecutionBindingImpl
