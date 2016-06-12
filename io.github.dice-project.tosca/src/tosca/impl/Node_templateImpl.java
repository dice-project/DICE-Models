/**
 */
package tosca.impl;

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

import tosca.Attribute;
import tosca.Interface;
import tosca.Node_template;
import tosca.Property;
import tosca.Relationship;
import tosca.Requirement;
import tosca.ToscaPackage;
import tosca.instance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.Node_templateImpl#getNode_template_name <em>Node template name</em>}</li>
 *   <li>{@link tosca.impl.Node_templateImpl#getType <em>Type</em>}</li>
 *   <li>{@link tosca.impl.Node_templateImpl#getNodeTemplate_hasInterface <em>Node Template has Interface</em>}</li>
 *   <li>{@link tosca.impl.Node_templateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tosca.impl.Node_templateImpl#getNodeTemplate_hasProperty <em>Node Template has Property</em>}</li>
 *   <li>{@link tosca.impl.Node_templateImpl#getNodeTemplate_hasAttribute <em>Node Template has Attribute</em>}</li>
 *   <li>{@link tosca.impl.Node_templateImpl#getNodeTemplate_hasRequirement <em>Node Template has Requirement</em>}</li>
 *   <li>{@link tosca.impl.Node_templateImpl#getNodeTemplate_hasRelationship <em>Node Template has Relationship</em>}</li>
 *   <li>{@link tosca.impl.Node_templateImpl#getNodeTemplate_hasInstances <em>Node Template has Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Node_templateImpl extends MinimalEObjectImpl.Container implements Node_template {
    /**
     * The default value of the '{@link #getNode_template_name() <em>Node template name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode_template_name()
     * @generated
     * @ordered
     */
    protected static final String NODE_TEMPLATE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNode_template_name() <em>Node template name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode_template_name()
     * @generated
     * @ordered
     */
    protected String node_template_name = NODE_TEMPLATE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getNodeTemplate_hasInterface() <em>Node Template has Interface</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNodeTemplate_hasInterface()
     * @generated
     * @ordered
     */
    protected EList<Interface> nodeTemplate_hasInterface;

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
     * The cached value of the '{@link #getNodeTemplate_hasProperty() <em>Node Template has Property</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNodeTemplate_hasProperty()
     * @generated
     * @ordered
     */
    protected EList<Property> nodeTemplate_hasProperty;

    /**
     * The cached value of the '{@link #getNodeTemplate_hasAttribute() <em>Node Template has Attribute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNodeTemplate_hasAttribute()
     * @generated
     * @ordered
     */
    protected EList<Attribute> nodeTemplate_hasAttribute;

    /**
     * The cached value of the '{@link #getNodeTemplate_hasRequirement() <em>Node Template has Requirement</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNodeTemplate_hasRequirement()
     * @generated
     * @ordered
     */
    protected EList<Requirement> nodeTemplate_hasRequirement;

    /**
     * The cached value of the '{@link #getNodeTemplate_hasRelationship() <em>Node Template has Relationship</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNodeTemplate_hasRelationship()
     * @generated
     * @ordered
     */
    protected EList<Relationship> nodeTemplate_hasRelationship;

    /**
     * The cached value of the '{@link #getNodeTemplate_hasInstances() <em>Node Template has Instances</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNodeTemplate_hasInstances()
     * @generated
     * @ordered
     */
    protected instance nodeTemplate_hasInstances;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Node_templateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.NODE_TEMPLATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNode_template_name() {
        return node_template_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNode_template_name(String newNode_template_name) {
        String oldNode_template_name = node_template_name;
        node_template_name = newNode_template_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_NAME, oldNode_template_name, node_template_name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.NODE_TEMPLATE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Interface> getNodeTemplate_hasInterface() {
        if (nodeTemplate_hasInterface == null) {
            nodeTemplate_hasInterface = new EObjectContainmentEList<Interface>(Interface.class, this, ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INTERFACE);
        }
        return nodeTemplate_hasInterface;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.NODE_TEMPLATE__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getNodeTemplate_hasProperty() {
        if (nodeTemplate_hasProperty == null) {
            nodeTemplate_hasProperty = new EObjectContainmentEList<Property>(Property.class, this, ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_PROPERTY);
        }
        return nodeTemplate_hasProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Attribute> getNodeTemplate_hasAttribute() {
        if (nodeTemplate_hasAttribute == null) {
            nodeTemplate_hasAttribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_ATTRIBUTE);
        }
        return nodeTemplate_hasAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Requirement> getNodeTemplate_hasRequirement() {
        if (nodeTemplate_hasRequirement == null) {
            nodeTemplate_hasRequirement = new EObjectContainmentEList<Requirement>(Requirement.class, this, ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_REQUIREMENT);
        }
        return nodeTemplate_hasRequirement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Relationship> getNodeTemplate_hasRelationship() {
        if (nodeTemplate_hasRelationship == null) {
            nodeTemplate_hasRelationship = new EObjectContainmentEList<Relationship>(Relationship.class, this, ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_RELATIONSHIP);
        }
        return nodeTemplate_hasRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public instance getNodeTemplate_hasInstances() {
        return nodeTemplate_hasInstances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNodeTemplate_hasInstances(instance newNodeTemplate_hasInstances, NotificationChain msgs) {
        instance oldNodeTemplate_hasInstances = nodeTemplate_hasInstances;
        nodeTemplate_hasInstances = newNodeTemplate_hasInstances;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INSTANCES, oldNodeTemplate_hasInstances, newNodeTemplate_hasInstances);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNodeTemplate_hasInstances(instance newNodeTemplate_hasInstances) {
        if (newNodeTemplate_hasInstances != nodeTemplate_hasInstances) {
            NotificationChain msgs = null;
            if (nodeTemplate_hasInstances != null)
                msgs = ((InternalEObject)nodeTemplate_hasInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INSTANCES, null, msgs);
            if (newNodeTemplate_hasInstances != null)
                msgs = ((InternalEObject)newNodeTemplate_hasInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INSTANCES, null, msgs);
            msgs = basicSetNodeTemplate_hasInstances(newNodeTemplate_hasInstances, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INSTANCES, newNodeTemplate_hasInstances, newNodeTemplate_hasInstances));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INTERFACE:
                return ((InternalEList<?>)getNodeTemplate_hasInterface()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_PROPERTY:
                return ((InternalEList<?>)getNodeTemplate_hasProperty()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_ATTRIBUTE:
                return ((InternalEList<?>)getNodeTemplate_hasAttribute()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_REQUIREMENT:
                return ((InternalEList<?>)getNodeTemplate_hasRequirement()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_RELATIONSHIP:
                return ((InternalEList<?>)getNodeTemplate_hasRelationship()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INSTANCES:
                return basicSetNodeTemplate_hasInstances(null, msgs);
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
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_NAME:
                return getNode_template_name();
            case ToscaPackage.NODE_TEMPLATE__TYPE:
                return getType();
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INTERFACE:
                return getNodeTemplate_hasInterface();
            case ToscaPackage.NODE_TEMPLATE__DESCRIPTION:
                return getDescription();
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_PROPERTY:
                return getNodeTemplate_hasProperty();
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_ATTRIBUTE:
                return getNodeTemplate_hasAttribute();
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_REQUIREMENT:
                return getNodeTemplate_hasRequirement();
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_RELATIONSHIP:
                return getNodeTemplate_hasRelationship();
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INSTANCES:
                return getNodeTemplate_hasInstances();
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
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_NAME:
                setNode_template_name((String)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__TYPE:
                setType((String)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INTERFACE:
                getNodeTemplate_hasInterface().clear();
                getNodeTemplate_hasInterface().addAll((Collection<? extends Interface>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_PROPERTY:
                getNodeTemplate_hasProperty().clear();
                getNodeTemplate_hasProperty().addAll((Collection<? extends Property>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_ATTRIBUTE:
                getNodeTemplate_hasAttribute().clear();
                getNodeTemplate_hasAttribute().addAll((Collection<? extends Attribute>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_REQUIREMENT:
                getNodeTemplate_hasRequirement().clear();
                getNodeTemplate_hasRequirement().addAll((Collection<? extends Requirement>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_RELATIONSHIP:
                getNodeTemplate_hasRelationship().clear();
                getNodeTemplate_hasRelationship().addAll((Collection<? extends Relationship>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INSTANCES:
                setNodeTemplate_hasInstances((instance)newValue);
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
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_NAME:
                setNode_template_name(NODE_TEMPLATE_NAME_EDEFAULT);
                return;
            case ToscaPackage.NODE_TEMPLATE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INTERFACE:
                getNodeTemplate_hasInterface().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_PROPERTY:
                getNodeTemplate_hasProperty().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_ATTRIBUTE:
                getNodeTemplate_hasAttribute().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_REQUIREMENT:
                getNodeTemplate_hasRequirement().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_RELATIONSHIP:
                getNodeTemplate_hasRelationship().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INSTANCES:
                setNodeTemplate_hasInstances((instance)null);
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
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_NAME:
                return NODE_TEMPLATE_NAME_EDEFAULT == null ? node_template_name != null : !NODE_TEMPLATE_NAME_EDEFAULT.equals(node_template_name);
            case ToscaPackage.NODE_TEMPLATE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INTERFACE:
                return nodeTemplate_hasInterface != null && !nodeTemplate_hasInterface.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_PROPERTY:
                return nodeTemplate_hasProperty != null && !nodeTemplate_hasProperty.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_ATTRIBUTE:
                return nodeTemplate_hasAttribute != null && !nodeTemplate_hasAttribute.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_REQUIREMENT:
                return nodeTemplate_hasRequirement != null && !nodeTemplate_hasRequirement.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_RELATIONSHIP:
                return nodeTemplate_hasRelationship != null && !nodeTemplate_hasRelationship.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_HAS_INSTANCES:
                return nodeTemplate_hasInstances != null;
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
        result.append(" (node_template_name: ");
        result.append(node_template_name);
        result.append(", type: ");
        result.append(type);
        result.append(", description: ");
        result.append(description);
        result.append(')');
        return result.toString();
    }

} //Node_templateImpl
