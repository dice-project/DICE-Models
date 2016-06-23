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
 *   <li>{@link ddsm.impl.CloudElementImpl#getElementId <em>Element Id</em>}</li>
 *   <li>{@link ddsm.impl.CloudElementImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CloudElementImpl extends MinimalEObjectImpl.Container implements CloudElement {
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
     * The default value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementId()
     * @generated
     * @ordered
     */
    protected static final String ELEMENT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementId()
     * @generated
     * @ordered
     */
    protected String elementId = ELEMENT_ID_EDEFAULT;

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
    public String getElementId() {
        return elementId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElementId(String newElementId) {
        String oldElementId = elementId;
        elementId = newElementId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CLOUD_ELEMENT__ELEMENT_ID, oldElementId, elementId));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DdsmPackage.CLOUD_ELEMENT__DESCRIPTION, oldDescription, description));
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
            case DdsmPackage.CLOUD_ELEMENT__ELEMENT_ID:
                return getElementId();
            case DdsmPackage.CLOUD_ELEMENT__DESCRIPTION:
                return getDescription();
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
            case DdsmPackage.CLOUD_ELEMENT__ELEMENT_ID:
                setElementId((String)newValue);
                return;
            case DdsmPackage.CLOUD_ELEMENT__DESCRIPTION:
                setDescription((String)newValue);
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
            case DdsmPackage.CLOUD_ELEMENT__ELEMENT_ID:
                setElementId(ELEMENT_ID_EDEFAULT);
                return;
            case DdsmPackage.CLOUD_ELEMENT__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
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
            case DdsmPackage.CLOUD_ELEMENT__ELEMENT_ID:
                return ELEMENT_ID_EDEFAULT == null ? elementId != null : !ELEMENT_ID_EDEFAULT.equals(elementId);
            case DdsmPackage.CLOUD_ELEMENT__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
        result.append(" (elementId: ");
        result.append(elementId);
        result.append(", description: ");
        result.append(description);
        result.append(')');
        return result.toString();
    }

} //CloudElementImpl
