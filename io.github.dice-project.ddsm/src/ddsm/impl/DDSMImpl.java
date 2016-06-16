/**
 */
package ddsm.impl;

import ddsm.CloudElement;
import ddsm.DDSM;
import ddsm.DdsmPackage;
import ddsm.Provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DDSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.DDSMImpl#getCloudelement <em>Cloudelement</em>}</li>
 *   <li>{@link ddsm.impl.DDSMImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link ddsm.impl.DDSMImpl#getName <em>Name</em>}</li>
 *   <li>{@link ddsm.impl.DDSMImpl#getModelId <em>Model Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DDSMImpl extends MinimalEObjectImpl.Container implements DDSM {
    /**
     * The cached value of the '{@link #getCloudelement() <em>Cloudelement</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCloudelement()
     * @generated
     * @ordered
     */
    protected EList<CloudElement> cloudelement;

    /**
     * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvider()
     * @generated
     * @ordered
     */
    protected EList<Provider> provider;

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
     * The default value of the '{@link #getModelId() <em>Model Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelId()
     * @generated
     * @ordered
     */
    protected static final String MODEL_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModelId() <em>Model Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelId()
     * @generated
     * @ordered
     */
    protected String modelId = MODEL_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DDSMImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.DDSM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CloudElement> getCloudelement() {
        if (cloudelement == null) {
            cloudelement = new EObjectContainmentEList<CloudElement>(CloudElement.class, this, DdsmPackage.DDSM__CLOUDELEMENT);
        }
        return cloudelement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Provider> getProvider() {
        if (provider == null) {
            provider = new EObjectContainmentEList<Provider>(Provider.class, this, DdsmPackage.DDSM__PROVIDER);
        }
        return provider;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.DDSM__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModelId(String newModelId) {
        String oldModelId = modelId;
        modelId = newModelId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.DDSM__MODEL_ID, oldModelId, modelId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DdsmPackage.DDSM__CLOUDELEMENT:
                return ((InternalEList<?>)getCloudelement()).basicRemove(otherEnd, msgs);
            case DdsmPackage.DDSM__PROVIDER:
                return ((InternalEList<?>)getProvider()).basicRemove(otherEnd, msgs);
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
            case DdsmPackage.DDSM__CLOUDELEMENT:
                return getCloudelement();
            case DdsmPackage.DDSM__PROVIDER:
                return getProvider();
            case DdsmPackage.DDSM__NAME:
                return getName();
            case DdsmPackage.DDSM__MODEL_ID:
                return getModelId();
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
            case DdsmPackage.DDSM__CLOUDELEMENT:
                getCloudelement().clear();
                getCloudelement().addAll((Collection<? extends CloudElement>)newValue);
                return;
            case DdsmPackage.DDSM__PROVIDER:
                getProvider().clear();
                getProvider().addAll((Collection<? extends Provider>)newValue);
                return;
            case DdsmPackage.DDSM__NAME:
                setName((String)newValue);
                return;
            case DdsmPackage.DDSM__MODEL_ID:
                setModelId((String)newValue);
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
            case DdsmPackage.DDSM__CLOUDELEMENT:
                getCloudelement().clear();
                return;
            case DdsmPackage.DDSM__PROVIDER:
                getProvider().clear();
                return;
            case DdsmPackage.DDSM__NAME:
                setName(NAME_EDEFAULT);
                return;
            case DdsmPackage.DDSM__MODEL_ID:
                setModelId(MODEL_ID_EDEFAULT);
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
            case DdsmPackage.DDSM__CLOUDELEMENT:
                return cloudelement != null && !cloudelement.isEmpty();
            case DdsmPackage.DDSM__PROVIDER:
                return provider != null && !provider.isEmpty();
            case DdsmPackage.DDSM__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case DdsmPackage.DDSM__MODEL_ID:
                return MODEL_ID_EDEFAULT == null ? modelId != null : !MODEL_ID_EDEFAULT.equals(modelId);
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
        result.append(", modelId: ");
        result.append(modelId);
        result.append(')');
        return result.toString();
    }

} //DDSMImpl
