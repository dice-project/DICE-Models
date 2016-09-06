/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.PeerToPeerPlatform;
import ddsm.RequiredExecutionPlatform;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Peer To Peer Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.PeerToPeerPlatformImpl#getRequiresPeerVm <em>Requires Peer Vm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeerToPeerPlatformImpl extends InternalComponentImpl implements PeerToPeerPlatform {
    /**
     * The cached value of the '{@link #getRequiresPeerVm() <em>Requires Peer Vm</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequiresPeerVm()
     * @generated
     * @ordered
     */
    protected EList<RequiredExecutionPlatform> requiresPeerVm;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PeerToPeerPlatformImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.PEER_TO_PEER_PLATFORM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RequiredExecutionPlatform> getRequiresPeerVm() {
        if (requiresPeerVm == null) {
            requiresPeerVm = new EObjectResolvingEList<RequiredExecutionPlatform>(RequiredExecutionPlatform.class, this, DdsmPackage.PEER_TO_PEER_PLATFORM__REQUIRES_PEER_VM);
        }
        return requiresPeerVm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.PEER_TO_PEER_PLATFORM__REQUIRES_PEER_VM:
                return getRequiresPeerVm();
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
            case DdsmPackage.PEER_TO_PEER_PLATFORM__REQUIRES_PEER_VM:
                getRequiresPeerVm().clear();
                getRequiresPeerVm().addAll((Collection<? extends RequiredExecutionPlatform>)newValue);
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
            case DdsmPackage.PEER_TO_PEER_PLATFORM__REQUIRES_PEER_VM:
                getRequiresPeerVm().clear();
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
            case DdsmPackage.PEER_TO_PEER_PLATFORM__REQUIRES_PEER_VM:
                return requiresPeerVm != null && !requiresPeerVm.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PeerToPeerPlatformImpl
