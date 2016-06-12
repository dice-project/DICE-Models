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
import tosca.Operation;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.OperationImpl#getOperation_name <em>Operation name</em>}</li>
 *   <li>{@link tosca.impl.OperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tosca.impl.OperationImpl#getOperation_hasInput <em>Operation has Input</em>}</li>
 *   <li>{@link tosca.impl.OperationImpl#getScript <em>Script</em>}</li>
 *   <li>{@link tosca.impl.OperationImpl#getExecutor <em>Executor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
    /**
     * The default value of the '{@link #getOperation_name() <em>Operation name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperation_name()
     * @generated
     * @ordered
     */
    protected static final String OPERATION_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOperation_name() <em>Operation name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperation_name()
     * @generated
     * @ordered
     */
    protected String operation_name = OPERATION_NAME_EDEFAULT;

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
     * The cached value of the '{@link #getOperation_hasInput() <em>Operation has Input</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperation_hasInput()
     * @generated
     * @ordered
     */
    protected EList<Input> operation_hasInput;

    /**
     * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScript()
     * @generated
     * @ordered
     */
    protected static final String SCRIPT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScript()
     * @generated
     * @ordered
     */
    protected String script = SCRIPT_EDEFAULT;

    /**
     * The default value of the '{@link #getExecutor() <em>Executor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutor()
     * @generated
     * @ordered
     */
    protected static final String EXECUTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExecutor() <em>Executor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutor()
     * @generated
     * @ordered
     */
    protected String executor = EXECUTOR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.OPERATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOperation_name() {
        return operation_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperation_name(String newOperation_name) {
        String oldOperation_name = operation_name;
        operation_name = newOperation_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.OPERATION__OPERATION_NAME, oldOperation_name, operation_name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.OPERATION__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Input> getOperation_hasInput() {
        if (operation_hasInput == null) {
            operation_hasInput = new EObjectContainmentEList<Input>(Input.class, this, ToscaPackage.OPERATION__OPERATION_HAS_INPUT);
        }
        return operation_hasInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getScript() {
        return script;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScript(String newScript) {
        String oldScript = script;
        script = newScript;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.OPERATION__SCRIPT, oldScript, script));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExecutor() {
        return executor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutor(String newExecutor) {
        String oldExecutor = executor;
        executor = newExecutor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.OPERATION__EXECUTOR, oldExecutor, executor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ToscaPackage.OPERATION__OPERATION_HAS_INPUT:
                return ((InternalEList<?>)getOperation_hasInput()).basicRemove(otherEnd, msgs);
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
            case ToscaPackage.OPERATION__OPERATION_NAME:
                return getOperation_name();
            case ToscaPackage.OPERATION__DESCRIPTION:
                return getDescription();
            case ToscaPackage.OPERATION__OPERATION_HAS_INPUT:
                return getOperation_hasInput();
            case ToscaPackage.OPERATION__SCRIPT:
                return getScript();
            case ToscaPackage.OPERATION__EXECUTOR:
                return getExecutor();
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
            case ToscaPackage.OPERATION__OPERATION_NAME:
                setOperation_name((String)newValue);
                return;
            case ToscaPackage.OPERATION__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case ToscaPackage.OPERATION__OPERATION_HAS_INPUT:
                getOperation_hasInput().clear();
                getOperation_hasInput().addAll((Collection<? extends Input>)newValue);
                return;
            case ToscaPackage.OPERATION__SCRIPT:
                setScript((String)newValue);
                return;
            case ToscaPackage.OPERATION__EXECUTOR:
                setExecutor((String)newValue);
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
            case ToscaPackage.OPERATION__OPERATION_NAME:
                setOperation_name(OPERATION_NAME_EDEFAULT);
                return;
            case ToscaPackage.OPERATION__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case ToscaPackage.OPERATION__OPERATION_HAS_INPUT:
                getOperation_hasInput().clear();
                return;
            case ToscaPackage.OPERATION__SCRIPT:
                setScript(SCRIPT_EDEFAULT);
                return;
            case ToscaPackage.OPERATION__EXECUTOR:
                setExecutor(EXECUTOR_EDEFAULT);
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
            case ToscaPackage.OPERATION__OPERATION_NAME:
                return OPERATION_NAME_EDEFAULT == null ? operation_name != null : !OPERATION_NAME_EDEFAULT.equals(operation_name);
            case ToscaPackage.OPERATION__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case ToscaPackage.OPERATION__OPERATION_HAS_INPUT:
                return operation_hasInput != null && !operation_hasInput.isEmpty();
            case ToscaPackage.OPERATION__SCRIPT:
                return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
            case ToscaPackage.OPERATION__EXECUTOR:
                return EXECUTOR_EDEFAULT == null ? executor != null : !EXECUTOR_EDEFAULT.equals(executor);
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
        result.append(" (operation_name: ");
        result.append(operation_name);
        result.append(", description: ");
        result.append(description);
        result.append(", script: ");
        result.append(script);
        result.append(", executor: ");
        result.append(executor);
        result.append(')');
        return result.toString();
    }

} //OperationImpl
