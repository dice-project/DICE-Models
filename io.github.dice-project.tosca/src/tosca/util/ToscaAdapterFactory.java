/**
 */
package tosca.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tosca.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tosca.ToscaPackage
 * @generated
 */
public class ToscaAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ToscaPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ToscaAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ToscaPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ToscaSwitch<Adapter> modelSwitch =
        new ToscaSwitch<Adapter>() {
            @Override
            public Adapter caseNode_template(Node_template object) {
                return createNode_templateAdapter();
            }
            @Override
            public Adapter caseInterface(Interface object) {
                return createInterfaceAdapter();
            }
            @Override
            public Adapter caseSource_interface(Source_interface object) {
                return createSource_interfaceAdapter();
            }
            @Override
            public Adapter caseTarget_interface(Target_interface object) {
                return createTarget_interfaceAdapter();
            }
            @Override
            public Adapter caseRelationship(Relationship object) {
                return createRelationshipAdapter();
            }
            @Override
            public Adapter caseContained_in(Contained_in object) {
                return createContained_inAdapter();
            }
            @Override
            public Adapter caseConnected_to(Connected_to object) {
                return createConnected_toAdapter();
            }
            @Override
            public Adapter caseParameter(Parameter object) {
                return createParameterAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter caseAttribute(Attribute object) {
                return createAttributeAdapter();
            }
            @Override
            public Adapter caseInput(Input object) {
                return createInputAdapter();
            }
            @Override
            public Adapter caseOutput(Output object) {
                return createOutputAdapter();
            }
            @Override
            public Adapter caseRequirement(Requirement object) {
                return createRequirementAdapter();
            }
            @Override
            public Adapter caseOperation(Operation object) {
                return createOperationAdapter();
            }
            @Override
            public Adapter caseService_Template(Service_Template object) {
                return createService_TemplateAdapter();
            }
            @Override
            public Adapter caseImport(Import object) {
                return createImportAdapter();
            }
            @Override
            public Adapter caseinstance(instance object) {
                return createinstanceAdapter();
            }
            @Override
            public Adapter caseParameters(Parameters object) {
                return createParametersAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link tosca.Node_template <em>Node template</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Node_template
     * @generated
     */
    public Adapter createNode_templateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Interface
     * @generated
     */
    public Adapter createInterfaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Source_interface <em>Source interface</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Source_interface
     * @generated
     */
    public Adapter createSource_interfaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Target_interface <em>Target interface</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Target_interface
     * @generated
     */
    public Adapter createTarget_interfaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Relationship
     * @generated
     */
    public Adapter createRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Contained_in <em>Contained in</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Contained_in
     * @generated
     */
    public Adapter createContained_inAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Connected_to <em>Connected to</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Connected_to
     * @generated
     */
    public Adapter createConnected_toAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Parameter
     * @generated
     */
    public Adapter createParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Attribute
     * @generated
     */
    public Adapter createAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Input <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Input
     * @generated
     */
    public Adapter createInputAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Output <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Output
     * @generated
     */
    public Adapter createOutputAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Requirement <em>Requirement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Requirement
     * @generated
     */
    public Adapter createRequirementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Operation
     * @generated
     */
    public Adapter createOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Service_Template <em>Service Template</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Service_Template
     * @generated
     */
    public Adapter createService_TemplateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Import <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Import
     * @generated
     */
    public Adapter createImportAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.instance <em>instance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.instance
     * @generated
     */
    public Adapter createinstanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link tosca.Parameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see tosca.Parameters
     * @generated
     */
    public Adapter createParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //ToscaAdapterFactory
