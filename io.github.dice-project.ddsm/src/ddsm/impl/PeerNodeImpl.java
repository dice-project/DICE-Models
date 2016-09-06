/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.PeerNode;
import ddsm.PeersQuorum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Peer Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.PeerNodeImpl#getBelongsToQuorum <em>Belongs To Quorum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeerNodeImpl extends InternalComponentImpl implements PeerNode {
    /**
     * The cached value of the '{@link #getBelongsToQuorum() <em>Belongs To Quorum</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBelongsToQuorum()
     * @generated
     * @ordered
     */
    protected PeersQuorum belongsToQuorum;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PeerNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.PEER_NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeersQuorum getBelongsToQuorum() {
        if (belongsToQuorum != null && belongsToQuorum.eIsProxy()) {
            InternalEObject oldBelongsToQuorum = (InternalEObject)belongsToQuorum;
            belongsToQuorum = (PeersQuorum)eResolveProxy(oldBelongsToQuorum);
            if (belongsToQuorum != oldBelongsToQuorum) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.PEER_NODE__BELONGS_TO_QUORUM, oldBelongsToQuorum, belongsToQuorum));
            }
        }
        return belongsToQuorum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeersQuorum basicGetBelongsToQuorum() {
        return belongsToQuorum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBelongsToQuorum(PeersQuorum newBelongsToQuorum) {
        PeersQuorum oldBelongsToQuorum = belongsToQuorum;
        belongsToQuorum = newBelongsToQuorum;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.PEER_NODE__BELONGS_TO_QUORUM, oldBelongsToQuorum, belongsToQuorum));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.PEER_NODE__BELONGS_TO_QUORUM:
                if (resolve) return getBelongsToQuorum();
                return basicGetBelongsToQuorum();
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
            case DdsmPackage.PEER_NODE__BELONGS_TO_QUORUM:
                setBelongsToQuorum((PeersQuorum)newValue);
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
            case DdsmPackage.PEER_NODE__BELONGS_TO_QUORUM:
                setBelongsToQuorum((PeersQuorum)null);
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
            case DdsmPackage.PEER_NODE__BELONGS_TO_QUORUM:
                return belongsToQuorum != null;
        }
        return super.eIsSet(featureID);
    }

} //PeerNodeImpl
