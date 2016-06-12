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

import tosca.Input;
import tosca.Interface;
import tosca.Operation;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.InterfaceImpl#getInterface_name <em>Interface name</em>}</li>
 *   <li>{@link tosca.impl.InterfaceImpl#getHasOperation <em>Has Operation</em>}</li>
 *   <li>{@link tosca.impl.InterfaceImpl#getInterface_hasInput <em>Interface has Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends MinimalEObjectImpl.Container implements Interface {
    /**
     * The default value of the '{@link #getInterface_name() <em>Interface name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterface_name()
     * @generated
     * @ordered
     */
    protected static final String INTERFACE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInterface_name() <em>Interface name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterface_name()
     * @generated
     * @ordered
     */
    protected String interface_name = INTERFACE_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getHasOperation() <em>Has Operation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHasOperation()
     * @generated
     * @ordered
     */
    protected EList<Operation> hasOperation;

    /**
     * The cached value of the '{@link #getInterface_hasInput() <em>Interface has Input</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterface_hasInput()
     * @generated
     * @ordered
     */
    protected EList<Input> interface_hasInput;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InterfaceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.INTERFACE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInterface_name() {
        return interface_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInterface_name(String newInterface_name) {
        String oldInterface_name = interface_name;
        interface_name = newInterface_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.INTERFACE__INTERFACE_NAME, oldInterface_name, interface_name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Operation> getHasOperation() {
        if (hasOperation == null) {
            hasOperation = new EObjectContainmentEList<Operation>(Operation.class, this, ToscaPackage.INTERFACE__HAS_OPERATION);
        }
        return hasOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Input> getInterface_hasInput() {
        if (interface_hasInput == null) {
            interface_hasInput = new EObjectContainmentEList<Input>(Input.class, this, ToscaPackage.INTERFACE__INTERFACE_HAS_INPUT);
        }
        return interface_hasInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ToscaPackage.INTERFACE__HAS_OPERATION:
                return ((InternalEList<?>)getHasOperation()).basicRemove(otherEnd, msgs);
            case ToscaPackage.INTERFACE__INTERFACE_HAS_INPUT:
                return ((InternalEList<?>)getInterface_hasInput()).basicRemove(otherEnd, msgs);
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
            case ToscaPackage.INTERFACE__INTERFACE_NAME:
                return getInterface_name();
            case ToscaPackage.INTERFACE__HAS_OPERATION:
                return getHasOperation();
            case ToscaPackage.INTERFACE__INTERFACE_HAS_INPUT:
                return getInterface_hasInput();
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
            case ToscaPackage.INTERFACE__INTERFACE_NAME:
                setInterface_name((String)newValue);
                return;
            case ToscaPackage.INTERFACE__HAS_OPERATION:
                getHasOperation().clear();
                getHasOperation().addAll((Collection<? extends Operation>)newValue);
                return;
            case ToscaPackage.INTERFACE__INTERFACE_HAS_INPUT:
                getInterface_hasInput().clear();
                getInterface_hasInput().addAll((Collection<? extends Input>)newValue);
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
            case ToscaPackage.INTERFACE__INTERFACE_NAME:
                setInterface_name(INTERFACE_NAME_EDEFAULT);
                return;
            case ToscaPackage.INTERFACE__HAS_OPERATION:
                getHasOperation().clear();
                return;
            case ToscaPackage.INTERFACE__INTERFACE_HAS_INPUT:
                getInterface_hasInput().clear();
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
            case ToscaPackage.INTERFACE__INTERFACE_NAME:
                return INTERFACE_NAME_EDEFAULT == null ? interface_name != null : !INTERFACE_NAME_EDEFAULT.equals(interface_name);
            case ToscaPackage.INTERFACE__HAS_OPERATION:
                return hasOperation != null && !hasOperation.isEmpty();
            case ToscaPackage.INTERFACE__INTERFACE_HAS_INPUT:
                return interface_hasInput != null && !interface_hasInput.isEmpty();
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
        result.append(" (interface_name: ");
        result.append(interface_name);
        result.append(')');
        return result.toString();
    }

} //InterfaceImpl
