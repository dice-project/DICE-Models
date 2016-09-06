/**
 */
package ddsm.impl;

import ddsm.CloudElement;
import ddsm.DDSM;
import ddsm.DdsmPackage;
import ddsm.Property;
import ddsm.Resource;

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
 *   <li>{@link ddsm.impl.DDSMImpl#getModelId <em>Model Id</em>}</li>
 *   <li>{@link ddsm.impl.DDSMImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ddsm.impl.DDSMImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link ddsm.impl.DDSMImpl#getResources <em>Resources</em>}</li>
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
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList<Property> properties;

    /**
     * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResources()
     * @generated
     * @ordered
     */
    protected EList<Resource> resources;

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
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.DDSM__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<Property>(Property.class, this, DdsmPackage.DDSM__PROPERTIES);
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Resource> getResources() {
        if (resources == null) {
            resources = new EObjectContainmentEList<Resource>(Resource.class, this, DdsmPackage.DDSM__RESOURCES);
        }
        return resources;
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
            case DdsmPackage.DDSM__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
            case DdsmPackage.DDSM__RESOURCES:
                return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
            case DdsmPackage.DDSM__MODEL_ID:
                return getModelId();
            case DdsmPackage.DDSM__DESCRIPTION:
                return getDescription();
            case DdsmPackage.DDSM__PROPERTIES:
                return getProperties();
            case DdsmPackage.DDSM__RESOURCES:
                return getResources();
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
            case DdsmPackage.DDSM__MODEL_ID:
                setModelId((String)newValue);
                return;
            case DdsmPackage.DDSM__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case DdsmPackage.DDSM__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends Property>)newValue);
                return;
            case DdsmPackage.DDSM__RESOURCES:
                getResources().clear();
                getResources().addAll((Collection<? extends Resource>)newValue);
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
            case DdsmPackage.DDSM__MODEL_ID:
                setModelId(MODEL_ID_EDEFAULT);
                return;
            case DdsmPackage.DDSM__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case DdsmPackage.DDSM__PROPERTIES:
                getProperties().clear();
                return;
            case DdsmPackage.DDSM__RESOURCES:
                getResources().clear();
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
            case DdsmPackage.DDSM__MODEL_ID:
                return MODEL_ID_EDEFAULT == null ? modelId != null : !MODEL_ID_EDEFAULT.equals(modelId);
            case DdsmPackage.DDSM__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case DdsmPackage.DDSM__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case DdsmPackage.DDSM__RESOURCES:
                return resources != null && !resources.isEmpty();
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
        result.append(" (modelId: ");
        result.append(modelId);
        result.append(", description: ");
        result.append(description);
        result.append(')');
        return result.toString();
    }

} //DDSMImpl
