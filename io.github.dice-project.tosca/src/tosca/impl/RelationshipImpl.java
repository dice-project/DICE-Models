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

import tosca.Relationship;
import tosca.Source_interface;
import tosca.Target_interface;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.RelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link tosca.impl.RelationshipImpl#getValidSource <em>Valid Source</em>}</li>
 *   <li>{@link tosca.impl.RelationshipImpl#getValidTarget <em>Valid Target</em>}</li>
 *   <li>{@link tosca.impl.RelationshipImpl#getRelation_haSourceInterface <em>Relation ha Source Interface</em>}</li>
 *   <li>{@link tosca.impl.RelationshipImpl#getRelation_hasTargetInterface <em>Relation has Target Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship {
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
     * The default value of the '{@link #getValidSource() <em>Valid Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValidSource()
     * @generated
     * @ordered
     */
    protected static final String VALID_SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValidSource() <em>Valid Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValidSource()
     * @generated
     * @ordered
     */
    protected String validSource = VALID_SOURCE_EDEFAULT;

    /**
     * The default value of the '{@link #getValidTarget() <em>Valid Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValidTarget()
     * @generated
     * @ordered
     */
    protected static final String VALID_TARGET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValidTarget() <em>Valid Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValidTarget()
     * @generated
     * @ordered
     */
    protected String validTarget = VALID_TARGET_EDEFAULT;

    /**
     * The cached value of the '{@link #getRelation_haSourceInterface() <em>Relation ha Source Interface</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelation_haSourceInterface()
     * @generated
     * @ordered
     */
    protected EList<Source_interface> relation_haSourceInterface;

    /**
     * The cached value of the '{@link #getRelation_hasTargetInterface() <em>Relation has Target Interface</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelation_hasTargetInterface()
     * @generated
     * @ordered
     */
    protected EList<Target_interface> relation_hasTargetInterface;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationshipImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.RELATIONSHIP;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.RELATIONSHIP__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValidSource() {
        return validSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValidSource(String newValidSource) {
        String oldValidSource = validSource;
        validSource = newValidSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.RELATIONSHIP__VALID_SOURCE, oldValidSource, validSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValidTarget() {
        return validTarget;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValidTarget(String newValidTarget) {
        String oldValidTarget = validTarget;
        validTarget = newValidTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.RELATIONSHIP__VALID_TARGET, oldValidTarget, validTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Source_interface> getRelation_haSourceInterface() {
        if (relation_haSourceInterface == null) {
            relation_haSourceInterface = new EObjectContainmentEList<Source_interface>(Source_interface.class, this, ToscaPackage.RELATIONSHIP__RELATION_HA_SOURCE_INTERFACE);
        }
        return relation_haSourceInterface;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Target_interface> getRelation_hasTargetInterface() {
        if (relation_hasTargetInterface == null) {
            relation_hasTargetInterface = new EObjectContainmentEList<Target_interface>(Target_interface.class, this, ToscaPackage.RELATIONSHIP__RELATION_HAS_TARGET_INTERFACE);
        }
        return relation_hasTargetInterface;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ToscaPackage.RELATIONSHIP__RELATION_HA_SOURCE_INTERFACE:
                return ((InternalEList<?>)getRelation_haSourceInterface()).basicRemove(otherEnd, msgs);
            case ToscaPackage.RELATIONSHIP__RELATION_HAS_TARGET_INTERFACE:
                return ((InternalEList<?>)getRelation_hasTargetInterface()).basicRemove(otherEnd, msgs);
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
            case ToscaPackage.RELATIONSHIP__TYPE:
                return getType();
            case ToscaPackage.RELATIONSHIP__VALID_SOURCE:
                return getValidSource();
            case ToscaPackage.RELATIONSHIP__VALID_TARGET:
                return getValidTarget();
            case ToscaPackage.RELATIONSHIP__RELATION_HA_SOURCE_INTERFACE:
                return getRelation_haSourceInterface();
            case ToscaPackage.RELATIONSHIP__RELATION_HAS_TARGET_INTERFACE:
                return getRelation_hasTargetInterface();
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
            case ToscaPackage.RELATIONSHIP__TYPE:
                setType((String)newValue);
                return;
            case ToscaPackage.RELATIONSHIP__VALID_SOURCE:
                setValidSource((String)newValue);
                return;
            case ToscaPackage.RELATIONSHIP__VALID_TARGET:
                setValidTarget((String)newValue);
                return;
            case ToscaPackage.RELATIONSHIP__RELATION_HA_SOURCE_INTERFACE:
                getRelation_haSourceInterface().clear();
                getRelation_haSourceInterface().addAll((Collection<? extends Source_interface>)newValue);
                return;
            case ToscaPackage.RELATIONSHIP__RELATION_HAS_TARGET_INTERFACE:
                getRelation_hasTargetInterface().clear();
                getRelation_hasTargetInterface().addAll((Collection<? extends Target_interface>)newValue);
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
            case ToscaPackage.RELATIONSHIP__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case ToscaPackage.RELATIONSHIP__VALID_SOURCE:
                setValidSource(VALID_SOURCE_EDEFAULT);
                return;
            case ToscaPackage.RELATIONSHIP__VALID_TARGET:
                setValidTarget(VALID_TARGET_EDEFAULT);
                return;
            case ToscaPackage.RELATIONSHIP__RELATION_HA_SOURCE_INTERFACE:
                getRelation_haSourceInterface().clear();
                return;
            case ToscaPackage.RELATIONSHIP__RELATION_HAS_TARGET_INTERFACE:
                getRelation_hasTargetInterface().clear();
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
            case ToscaPackage.RELATIONSHIP__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case ToscaPackage.RELATIONSHIP__VALID_SOURCE:
                return VALID_SOURCE_EDEFAULT == null ? validSource != null : !VALID_SOURCE_EDEFAULT.equals(validSource);
            case ToscaPackage.RELATIONSHIP__VALID_TARGET:
                return VALID_TARGET_EDEFAULT == null ? validTarget != null : !VALID_TARGET_EDEFAULT.equals(validTarget);
            case ToscaPackage.RELATIONSHIP__RELATION_HA_SOURCE_INTERFACE:
                return relation_haSourceInterface != null && !relation_haSourceInterface.isEmpty();
            case ToscaPackage.RELATIONSHIP__RELATION_HAS_TARGET_INTERFACE:
                return relation_hasTargetInterface != null && !relation_hasTargetInterface.isEmpty();
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
        result.append(" (type: ");
        result.append(type);
        result.append(", validSource: ");
        result.append(validSource);
        result.append(", validTarget: ");
        result.append(validTarget);
        result.append(')');
        return result.toString();
    }

} //RelationshipImpl
