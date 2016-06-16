/**
 */
package ddsm.impl;

import ddsm.CloudElement;
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
 * An implementation of the model object '<em><b>Cloud Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsm.impl.CloudElementImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link ddsm.impl.CloudElementImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link ddsm.impl.CloudElementImpl#getCloudElementId <em>Cloud Element Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudElementImpl extends MinimalEObjectImpl.Container implements CloudElement {
    /**
     * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResource()
     * @generated
     * @ordered
     */
    protected EList<Resource> resource;

    /**
     * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
    protected EList<Property> property;

    /**
     * The default value of the '{@link #getCloudElementId() <em>Cloud Element Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCloudElementId()
     * @generated
     * @ordered
     */
    protected static final String CLOUD_ELEMENT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCloudElementId() <em>Cloud Element Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCloudElementId()
     * @generated
     * @ordered
     */
    protected String cloudElementId = CLOUD_ELEMENT_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CloudElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DdsmPackage.Literals.CLOUD_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Resource> getResource() {
        if (resource == null) {
            resource = new EObjectContainmentEList<Resource>(Resource.class, this, DdsmPackage.CLOUD_ELEMENT__RESOURCE);
        }
        return resource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperty() {
        if (property == null) {
            property = new EObjectContainmentEList<Property>(Property.class, this, DdsmPackage.CLOUD_ELEMENT__PROPERTY);
        }
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCloudElementId() {
        return cloudElementId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCloudElementId(String newCloudElementId) {
        String oldCloudElementId = cloudElementId;
        cloudElementId = newCloudElementId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_ID, oldCloudElementId, cloudElementId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DdsmPackage.CLOUD_ELEMENT__RESOURCE:
                return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
            case DdsmPackage.CLOUD_ELEMENT__PROPERTY:
                return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
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
            case DdsmPackage.CLOUD_ELEMENT__RESOURCE:
                return getResource();
            case DdsmPackage.CLOUD_ELEMENT__PROPERTY:
                return getProperty();
            case DdsmPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_ID:
                return getCloudElementId();
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
            case DdsmPackage.CLOUD_ELEMENT__RESOURCE:
                getResource().clear();
                getResource().addAll((Collection<? extends Resource>)newValue);
                return;
            case DdsmPackage.CLOUD_ELEMENT__PROPERTY:
                getProperty().clear();
                getProperty().addAll((Collection<? extends Property>)newValue);
                return;
            case DdsmPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_ID:
                setCloudElementId((String)newValue);
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
            case DdsmPackage.CLOUD_ELEMENT__RESOURCE:
                getResource().clear();
                return;
            case DdsmPackage.CLOUD_ELEMENT__PROPERTY:
                getProperty().clear();
                return;
            case DdsmPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_ID:
                setCloudElementId(CLOUD_ELEMENT_ID_EDEFAULT);
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
            case DdsmPackage.CLOUD_ELEMENT__RESOURCE:
                return resource != null && !resource.isEmpty();
            case DdsmPackage.CLOUD_ELEMENT__PROPERTY:
                return property != null && !property.isEmpty();
            case DdsmPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_ID:
                return CLOUD_ELEMENT_ID_EDEFAULT == null ? cloudElementId != null : !CLOUD_ELEMENT_ID_EDEFAULT.equals(cloudElementId);
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
        result.append(" (cloudElementId: ");
        result.append(cloudElementId);
        result.append(')');
        return result.toString();
    }

} //CloudElementImpl
