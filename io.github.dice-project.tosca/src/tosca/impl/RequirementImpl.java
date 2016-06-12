/**
 */
package tosca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import tosca.Requirement;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.RequirementImpl#getRequirement_name <em>Requirement name</em>}</li>
 *   <li>{@link tosca.impl.RequirementImpl#getNode <em>Node</em>}</li>
 *   <li>{@link tosca.impl.RequirementImpl#getCapability_Type_name <em>Capability Type name</em>}</li>
 *   <li>{@link tosca.impl.RequirementImpl#getOccurances <em>Occurances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement {
    /**
     * The default value of the '{@link #getRequirement_name() <em>Requirement name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequirement_name()
     * @generated
     * @ordered
     */
    protected static final String REQUIREMENT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRequirement_name() <em>Requirement name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequirement_name()
     * @generated
     * @ordered
     */
    protected String requirement_name = REQUIREMENT_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode()
     * @generated
     * @ordered
     */
    protected static final String NODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode()
     * @generated
     * @ordered
     */
    protected String node = NODE_EDEFAULT;

    /**
     * The default value of the '{@link #getCapability_Type_name() <em>Capability Type name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapability_Type_name()
     * @generated
     * @ordered
     */
    protected static final String CAPABILITY_TYPE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCapability_Type_name() <em>Capability Type name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapability_Type_name()
     * @generated
     * @ordered
     */
    protected String capability_Type_name = CAPABILITY_TYPE_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getOccurances() <em>Occurances</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOccurances()
     * @generated
     * @ordered
     */
    protected EList<String> occurances;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RequirementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.REQUIREMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRequirement_name() {
        return requirement_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequirement_name(String newRequirement_name) {
        String oldRequirement_name = requirement_name;
        requirement_name = newRequirement_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.REQUIREMENT__REQUIREMENT_NAME, oldRequirement_name, requirement_name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNode() {
        return node;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNode(String newNode) {
        String oldNode = node;
        node = newNode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.REQUIREMENT__NODE, oldNode, node));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCapability_Type_name() {
        return capability_Type_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCapability_Type_name(String newCapability_Type_name) {
        String oldCapability_Type_name = capability_Type_name;
        capability_Type_name = newCapability_Type_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.REQUIREMENT__CAPABILITY_TYPE_NAME, oldCapability_Type_name, capability_Type_name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getOccurances() {
        if (occurances == null) {
            occurances = new EDataTypeUniqueEList<String>(String.class, this, ToscaPackage.REQUIREMENT__OCCURANCES);
        }
        return occurances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ToscaPackage.REQUIREMENT__REQUIREMENT_NAME:
                return getRequirement_name();
            case ToscaPackage.REQUIREMENT__NODE:
                return getNode();
            case ToscaPackage.REQUIREMENT__CAPABILITY_TYPE_NAME:
                return getCapability_Type_name();
            case ToscaPackage.REQUIREMENT__OCCURANCES:
                return getOccurances();
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
            case ToscaPackage.REQUIREMENT__REQUIREMENT_NAME:
                setRequirement_name((String)newValue);
                return;
            case ToscaPackage.REQUIREMENT__NODE:
                setNode((String)newValue);
                return;
            case ToscaPackage.REQUIREMENT__CAPABILITY_TYPE_NAME:
                setCapability_Type_name((String)newValue);
                return;
            case ToscaPackage.REQUIREMENT__OCCURANCES:
                getOccurances().clear();
                getOccurances().addAll((Collection<? extends String>)newValue);
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
            case ToscaPackage.REQUIREMENT__REQUIREMENT_NAME:
                setRequirement_name(REQUIREMENT_NAME_EDEFAULT);
                return;
            case ToscaPackage.REQUIREMENT__NODE:
                setNode(NODE_EDEFAULT);
                return;
            case ToscaPackage.REQUIREMENT__CAPABILITY_TYPE_NAME:
                setCapability_Type_name(CAPABILITY_TYPE_NAME_EDEFAULT);
                return;
            case ToscaPackage.REQUIREMENT__OCCURANCES:
                getOccurances().clear();
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
            case ToscaPackage.REQUIREMENT__REQUIREMENT_NAME:
                return REQUIREMENT_NAME_EDEFAULT == null ? requirement_name != null : !REQUIREMENT_NAME_EDEFAULT.equals(requirement_name);
            case ToscaPackage.REQUIREMENT__NODE:
                return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
            case ToscaPackage.REQUIREMENT__CAPABILITY_TYPE_NAME:
                return CAPABILITY_TYPE_NAME_EDEFAULT == null ? capability_Type_name != null : !CAPABILITY_TYPE_NAME_EDEFAULT.equals(capability_Type_name);
            case ToscaPackage.REQUIREMENT__OCCURANCES:
                return occurances != null && !occurances.isEmpty();
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
        result.append(" (requirement_name: ");
        result.append(requirement_name);
        result.append(", node: ");
        result.append(node);
        result.append(", capability_Type_name: ");
        result.append(capability_Type_name);
        result.append(", occurances: ");
        result.append(occurances);
        result.append(')');
        return result.toString();
    }

} //RequirementImpl
