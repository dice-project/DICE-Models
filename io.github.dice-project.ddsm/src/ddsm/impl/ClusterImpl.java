/**
 */
package ddsm.impl;

import ddsm.Cluster;
import ddsm.DdsmPackage;
import ddsm.VM;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.ClusterImpl#getHasVm <em>Has Vm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterImpl extends ExternalComponentImpl implements Cluster {
    /**
     * The cached value of the '{@link #getHasVm() <em>Has Vm</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHasVm()
     * @generated
     * @ordered
     */
    protected EList<VM> hasVm;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClusterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.CLUSTER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VM> getHasVm() {
        if (hasVm == null) {
            hasVm = new EObjectResolvingEList<VM>(VM.class, this, DdsmPackage.CLUSTER__HAS_VM);
        }
        return hasVm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DdsmPackage.CLUSTER__HAS_VM:
                return getHasVm();
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
            case DdsmPackage.CLUSTER__HAS_VM:
                getHasVm().clear();
                getHasVm().addAll((Collection<? extends VM>)newValue);
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
            case DdsmPackage.CLUSTER__HAS_VM:
                getHasVm().clear();
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
            case DdsmPackage.CLUSTER__HAS_VM:
                return hasVm != null && !hasVm.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ClusterImpl
