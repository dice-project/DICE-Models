/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.Offer;
import ddsm.ProvidedExecutionPlatform;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Execution Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ProvidedExecutionPlatformImpl#getOffer <em>Offer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedExecutionPlatformImpl extends ExecutionPlatformImpl implements ProvidedExecutionPlatform {
    /**
     * The cached value of the '{@link #getOffer() <em>Offer</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffer()
     * @generated
     * @ordered
     */
    protected EList<Offer> offer;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProvidedExecutionPlatformImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.PROVIDED_EXECUTION_PLATFORM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Offer> getOffer() {
        if (offer == null) {
            offer = new EObjectContainmentEList<Offer>(Offer.class, this, DdsmPackage.PROVIDED_EXECUTION_PLATFORM__OFFER);
        }
        return offer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DdsmPackage.PROVIDED_EXECUTION_PLATFORM__OFFER:
                return ((InternalEList<?>)getOffer()).basicRemove(otherEnd, msgs);
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
            case DdsmPackage.PROVIDED_EXECUTION_PLATFORM__OFFER:
                return getOffer();
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
            case DdsmPackage.PROVIDED_EXECUTION_PLATFORM__OFFER:
                getOffer().clear();
                getOffer().addAll((Collection<? extends Offer>)newValue);
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
            case DdsmPackage.PROVIDED_EXECUTION_PLATFORM__OFFER:
                getOffer().clear();
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
            case DdsmPackage.PROVIDED_EXECUTION_PLATFORM__OFFER:
                return offer != null && !offer.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ProvidedExecutionPlatformImpl
