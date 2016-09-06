/**
 */
package ddsm.impl;

import ddsm.CassandraQuorum;
import ddsm.DdsmPackage;
import ddsm.RequiredPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cassandra Quorum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.CassandraQuorumImpl#getRequires_bootstrapping_seed <em>Requires bootstrapping seed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CassandraQuorumImpl extends PeersQuorumImpl implements CassandraQuorum {
    /**
     * The cached value of the '{@link #getRequires_bootstrapping_seed() <em>Requires bootstrapping seed</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequires_bootstrapping_seed()
     * @generated
     * @ordered
     */
    protected RequiredPort requires_bootstrapping_seed;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CassandraQuorumImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.CASSANDRA_QUORUM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RequiredPort getRequires_bootstrapping_seed() {
        if (requires_bootstrapping_seed != null && requires_bootstrapping_seed.eIsProxy()) {
            InternalEObject oldRequires_bootstrapping_seed = (InternalEObject)requires_bootstrapping_seed;
            requires_bootstrapping_seed = (RequiredPort)eResolveProxy(oldRequires_bootstrapping_seed);
            if (requires_bootstrapping_seed != oldRequires_bootstrapping_seed) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdsmPackage.CASSANDRA_QUORUM__REQUIRES_BOOTSTRAPPING_SEED, oldRequires_bootstrapping_seed, requires_bootstrapping_seed));
            }
        }
        return requires_bootstrapping_seed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RequiredPort basicGetRequires_bootstrapping_seed() {
        return requires_bootstrapping_seed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequires_bootstrapping_seed(RequiredPort newRequires_bootstrapping_seed) {
        RequiredPort oldRequires_bootstrapping_seed = requires_bootstrapping_seed;
        requires_bootstrapping_seed = newRequires_bootstrapping_seed;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CASSANDRA_QUORUM__REQUIRES_BOOTSTRAPPING_SEED, oldRequires_bootstrapping_seed, requires_bootstrapping_seed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.CASSANDRA_QUORUM__REQUIRES_BOOTSTRAPPING_SEED:
                if (resolve) return getRequires_bootstrapping_seed();
                return basicGetRequires_bootstrapping_seed();
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
            case DdsmPackage.CASSANDRA_QUORUM__REQUIRES_BOOTSTRAPPING_SEED:
                setRequires_bootstrapping_seed((RequiredPort)newValue);
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
            case DdsmPackage.CASSANDRA_QUORUM__REQUIRES_BOOTSTRAPPING_SEED:
                setRequires_bootstrapping_seed((RequiredPort)null);
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
            case DdsmPackage.CASSANDRA_QUORUM__REQUIRES_BOOTSTRAPPING_SEED:
                return requires_bootstrapping_seed != null;
        }
        return super.eIsSet(featureID);
    }

} //CassandraQuorumImpl
