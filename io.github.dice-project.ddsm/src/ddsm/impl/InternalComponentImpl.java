/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.InternalComponent;
import ddsm.RequiredExecutionPlatform;
import ddsm.RequiredPort;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.InternalComponentImpl#getRequiredport <em>Requiredport</em>}</li>
 *   <li>{@link ddsm.impl.InternalComponentImpl#getInternalcomponent <em>Internalcomponent</em>}</li>
 *   <li>{@link ddsm.impl.InternalComponentImpl#getRequiredexecutionplatform <em>Requiredexecutionplatform</em>}</li>
 *   <li>{@link ddsm.impl.InternalComponentImpl#getPublicPorts <em>Public Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalComponentImpl extends ComponentImpl implements InternalComponent {
    /**
     * The cached value of the '{@link #getRequiredport() <em>Requiredport</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequiredport()
     * @generated
     * @ordered
     */
    protected EList<RequiredPort> requiredport;

    /**
     * The cached value of the '{@link #getInternalcomponent() <em>Internalcomponent</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInternalcomponent()
     * @generated
     * @ordered
     */
    protected EList<InternalComponent> internalcomponent;

    /**
     * The cached value of the '{@link #getRequiredexecutionplatform() <em>Requiredexecutionplatform</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequiredexecutionplatform()
     * @generated
     * @ordered
     */
    protected EList<RequiredExecutionPlatform> requiredexecutionplatform;

    /**
     * The cached value of the '{@link #getPublicPorts() <em>Public Ports</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublicPorts()
     * @generated
     * @ordered
     */
    protected EList<Integer> publicPorts;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InternalComponentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.INTERNAL_COMPONENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RequiredPort> getRequiredport() {
        if (requiredport == null) {
            requiredport = new EObjectContainmentEList<RequiredPort>(RequiredPort.class, this, DdsmPackage.INTERNAL_COMPONENT__REQUIREDPORT);
        }
        return requiredport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InternalComponent> getInternalcomponent() {
        if (internalcomponent == null) {
            internalcomponent = new EObjectContainmentEList<InternalComponent>(InternalComponent.class, this, DdsmPackage.INTERNAL_COMPONENT__INTERNALCOMPONENT);
        }
        return internalcomponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RequiredExecutionPlatform> getRequiredexecutionplatform() {
        if (requiredexecutionplatform == null) {
            requiredexecutionplatform = new EObjectContainmentEList<RequiredExecutionPlatform>(RequiredExecutionPlatform.class, this, DdsmPackage.INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM);
        }
        return requiredexecutionplatform;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Integer> getPublicPorts() {
        if (publicPorts == null) {
            publicPorts = new EDataTypeUniqueEList<Integer>(Integer.class, this, DdsmPackage.INTERNAL_COMPONENT__PUBLIC_PORTS);
        }
        return publicPorts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DdsmPackage.INTERNAL_COMPONENT__REQUIREDPORT:
                return ((InternalEList<?>)getRequiredport()).basicRemove(otherEnd, msgs);
            case DdsmPackage.INTERNAL_COMPONENT__INTERNALCOMPONENT:
                return ((InternalEList<?>)getInternalcomponent()).basicRemove(otherEnd, msgs);
            case DdsmPackage.INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM:
                return ((InternalEList<?>)getRequiredexecutionplatform()).basicRemove(otherEnd, msgs);
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
            case DdsmPackage.INTERNAL_COMPONENT__REQUIREDPORT:
                return getRequiredport();
            case DdsmPackage.INTERNAL_COMPONENT__INTERNALCOMPONENT:
                return getInternalcomponent();
            case DdsmPackage.INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM:
                return getRequiredexecutionplatform();
            case DdsmPackage.INTERNAL_COMPONENT__PUBLIC_PORTS:
                return getPublicPorts();
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
            case DdsmPackage.INTERNAL_COMPONENT__REQUIREDPORT:
                getRequiredport().clear();
                getRequiredport().addAll((Collection<? extends RequiredPort>)newValue);
                return;
            case DdsmPackage.INTERNAL_COMPONENT__INTERNALCOMPONENT:
                getInternalcomponent().clear();
                getInternalcomponent().addAll((Collection<? extends InternalComponent>)newValue);
                return;
            case DdsmPackage.INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM:
                getRequiredexecutionplatform().clear();
                getRequiredexecutionplatform().addAll((Collection<? extends RequiredExecutionPlatform>)newValue);
                return;
            case DdsmPackage.INTERNAL_COMPONENT__PUBLIC_PORTS:
                getPublicPorts().clear();
                getPublicPorts().addAll((Collection<? extends Integer>)newValue);
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
            case DdsmPackage.INTERNAL_COMPONENT__REQUIREDPORT:
                getRequiredport().clear();
                return;
            case DdsmPackage.INTERNAL_COMPONENT__INTERNALCOMPONENT:
                getInternalcomponent().clear();
                return;
            case DdsmPackage.INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM:
                getRequiredexecutionplatform().clear();
                return;
            case DdsmPackage.INTERNAL_COMPONENT__PUBLIC_PORTS:
                getPublicPorts().clear();
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
            case DdsmPackage.INTERNAL_COMPONENT__REQUIREDPORT:
                return requiredport != null && !requiredport.isEmpty();
            case DdsmPackage.INTERNAL_COMPONENT__INTERNALCOMPONENT:
                return internalcomponent != null && !internalcomponent.isEmpty();
            case DdsmPackage.INTERNAL_COMPONENT__REQUIREDEXECUTIONPLATFORM:
                return requiredexecutionplatform != null && !requiredexecutionplatform.isEmpty();
            case DdsmPackage.INTERNAL_COMPONENT__PUBLIC_PORTS:
                return publicPorts != null && !publicPorts.isEmpty();
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
        result.append(" (publicPorts: ");
        result.append(publicPorts);
        result.append(')');
        return result.toString();
    }

} //InternalComponentImpl
