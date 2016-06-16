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
 *   <li>{@link ddsm.impl.ExecutionBindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link ddsm.impl.ExecutionBindingImpl#getBindingId <em>Binding Id</em>}</li>
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
     * The default value of the '{@link #getBindingId() <em>Binding Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBindingId()
     * @generated
     * @ordered
     */
    protected static final String BINDING_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBindingId() <em>Binding Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBindingId()
     * @generated
     * @ordered
     */
    protected String bindingId = BINDING_ID_EDEFAULT;

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
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.EXECUTION_BINDING__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBindingId() {
        return bindingId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingId(String newBindingId) {
        String oldBindingId = bindingId;
        bindingId = newBindingId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.EXECUTION_BINDING__BINDING_ID, oldBindingId, bindingId));
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
            case DdsmPackage.EXECUTION_BINDING__NAME:
                return getName();
            case DdsmPackage.EXECUTION_BINDING__BINDING_ID:
                return getBindingId();
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
            case DdsmPackage.EXECUTION_BINDING__NAME:
                setName((String)newValue);
                return;
            case DdsmPackage.EXECUTION_BINDING__BINDING_ID:
                setBindingId((String)newValue);
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
            case DdsmPackage.EXECUTION_BINDING__NAME:
                setName(NAME_EDEFAULT);
                return;
            case DdsmPackage.EXECUTION_BINDING__BINDING_ID:
                setBindingId(BINDING_ID_EDEFAULT);
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
            case DdsmPackage.EXECUTION_BINDING__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case DdsmPackage.EXECUTION_BINDING__BINDING_ID:
                return BINDING_ID_EDEFAULT == null ? bindingId != null : !BINDING_ID_EDEFAULT.equals(bindingId);
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
        result.append(" (name: ");
        result.append(name);
        result.append(", bindingId: ");
        result.append(bindingId);
        result.append(')');
        return result.toString();
    }

} //ExecutionBindingImpl
