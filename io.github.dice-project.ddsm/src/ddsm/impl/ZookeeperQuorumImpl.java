/**
 */
package ddsm.impl;

import ddsm.DdsmPackage;
import ddsm.ZookeeperQuorum;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zookeeper Quorum</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ZookeeperQuorumImpl extends PeersQuorumImpl implements ZookeeperQuorum {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ZookeeperQuorumImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.ZOOKEEPER_QUORUM;
    }

} //ZookeeperQuorumImpl
