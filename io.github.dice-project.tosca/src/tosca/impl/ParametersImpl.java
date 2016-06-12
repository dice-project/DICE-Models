/**
 */
package tosca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tosca.Parameter;
import tosca.Parameters;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.ParametersImpl#getParemeters_hasParameter <em>Paremeters has Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParametersImpl extends MinimalEObjectImpl.Container implements Parameters {
    /**
     * The cached value of the '{@link #getParemeters_hasParameter() <em>Paremeters has Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParemeters_hasParameter()
     * @generated
     * @ordered
     */
    protected EList<Parameter> paremeters_hasParameter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.PARAMETERS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Parameter> getParemeters_hasParameter() {
        if (paremeters_hasParameter == null) {
            paremeters_hasParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, ToscaPackage.PARAMETERS__PAREMETERS_HAS_PARAMETER);
        }
        return paremeters_hasParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ToscaPackage.PARAMETERS__PAREMETERS_HAS_PARAMETER:
                return ((InternalEList<?>)getParemeters_hasParameter()).basicRemove(otherEnd, msgs);
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
            case ToscaPackage.PARAMETERS__PAREMETERS_HAS_PARAMETER:
                return getParemeters_hasParameter();
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
            case ToscaPackage.PARAMETERS__PAREMETERS_HAS_PARAMETER:
                getParemeters_hasParameter().clear();
                getParemeters_hasParameter().addAll((Collection<? extends Parameter>)newValue);
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
            case ToscaPackage.PARAMETERS__PAREMETERS_HAS_PARAMETER:
                getParemeters_hasParameter().clear();
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
            case ToscaPackage.PARAMETERS__PAREMETERS_HAS_PARAMETER:
                return paremeters_hasParameter != null && !paremeters_hasParameter.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ParametersImpl
