/**
 */
package ddsm.util;

import ddsm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ddsm.DdsmPackage
 * @generated
 */
public class DdsmSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DdsmPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DdsmSwitch() {
        if (modelPackage == null) {
            modelPackage = DdsmPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case DdsmPackage.CLOUD_ELEMENT: {
                CloudElement cloudElement = (CloudElement)theEObject;
                T result = caseCloudElement(cloudElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.PROPERTY: {
                Property property = (Property)theEObject;
                T result = caseProperty(property);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.RESOURCE: {
                Resource resource = (Resource)theEObject;
                T result = caseResource(resource);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.COMPONENT: {
                Component component = (Component)theEObject;
                T result = caseComponent(component);
                if (result == null) result = caseCloudElement(component);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.INTERNAL_COMPONENT: {
                InternalComponent internalComponent = (InternalComponent)theEObject;
                T result = caseInternalComponent(internalComponent);
                if (result == null) result = caseComponent(internalComponent);
                if (result == null) result = caseCloudElement(internalComponent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.EXECUTION_PLATFORM: {
                ExecutionPlatform executionPlatform = (ExecutionPlatform)theEObject;
                T result = caseExecutionPlatform(executionPlatform);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.PORT: {
                Port port = (Port)theEObject;
                T result = casePort(port);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.REQUIRED_PORT: {
                RequiredPort requiredPort = (RequiredPort)theEObject;
                T result = caseRequiredPort(requiredPort);
                if (result == null) result = casePort(requiredPort);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.PROVIDED_PORT: {
                ProvidedPort providedPort = (ProvidedPort)theEObject;
                T result = caseProvidedPort(providedPort);
                if (result == null) result = casePort(providedPort);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.REQUIRED_EXECUTION_PLATFORM: {
                RequiredExecutionPlatform requiredExecutionPlatform = (RequiredExecutionPlatform)theEObject;
                T result = caseRequiredExecutionPlatform(requiredExecutionPlatform);
                if (result == null) result = caseExecutionPlatform(requiredExecutionPlatform);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.PROVIDED_EXECUTION_PLATFORM: {
                ProvidedExecutionPlatform providedExecutionPlatform = (ProvidedExecutionPlatform)theEObject;
                T result = caseProvidedExecutionPlatform(providedExecutionPlatform);
                if (result == null) result = caseExecutionPlatform(providedExecutionPlatform);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.RELATIONSHIP: {
                Relationship relationship = (Relationship)theEObject;
                T result = caseRelationship(relationship);
                if (result == null) result = caseCloudElement(relationship);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.EXECUTION_BINDING: {
                ExecutionBinding executionBinding = (ExecutionBinding)theEObject;
                T result = caseExecutionBinding(executionBinding);
                if (result == null) result = caseCloudElement(executionBinding);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.EXTERNAL_COMPONENT: {
                ExternalComponent externalComponent = (ExternalComponent)theEObject;
                T result = caseExternalComponent(externalComponent);
                if (result == null) result = caseComponent(externalComponent);
                if (result == null) result = caseCloudElement(externalComponent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.PROVIDER: {
                Provider provider = (Provider)theEObject;
                T result = caseProvider(provider);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.VM: {
                VM vm = (VM)theEObject;
                T result = caseVM(vm);
                if (result == null) result = caseExternalComponent(vm);
                if (result == null) result = caseComponent(vm);
                if (result == null) result = caseCloudElement(vm);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.DDSM: {
                DDSM ddsm = (DDSM)theEObject;
                T result = caseDDSM(ddsm);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.LIFE_CYCLE: {
                LifeCycle lifeCycle = (LifeCycle)theEObject;
                T result = caseLifeCycle(lifeCycle);
                if (result == null) result = caseResource(lifeCycle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.CHEF_RECIPE: {
                ChefRecipe chefRecipe = (ChefRecipe)theEObject;
                T result = caseChefRecipe(chefRecipe);
                if (result == null) result = caseResource(chefRecipe);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.OFFER: {
                Offer offer = (Offer)theEObject;
                T result = caseOffer(offer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.STORM_SUPERVISOR: {
                StormSupervisor stormSupervisor = (StormSupervisor)theEObject;
                T result = caseStormSupervisor(stormSupervisor);
                if (result == null) result = caseInternalComponent(stormSupervisor);
                if (result == null) result = caseComponent(stormSupervisor);
                if (result == null) result = caseCloudElement(stormSupervisor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.MEDIUM_HOST: {
                MediumHost mediumHost = (MediumHost)theEObject;
                T result = caseMediumHost(mediumHost);
                if (result == null) result = caseVM(mediumHost);
                if (result == null) result = caseExternalComponent(mediumHost);
                if (result == null) result = caseComponent(mediumHost);
                if (result == null) result = caseCloudElement(mediumHost);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.SMALL_HOST: {
                SmallHost smallHost = (SmallHost)theEObject;
                T result = caseSmallHost(smallHost);
                if (result == null) result = caseVM(smallHost);
                if (result == null) result = caseExternalComponent(smallHost);
                if (result == null) result = caseComponent(smallHost);
                if (result == null) result = caseCloudElement(smallHost);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.LARGE_HOST: {
                LargeHost largeHost = (LargeHost)theEObject;
                T result = caseLargeHost(largeHost);
                if (result == null) result = caseVM(largeHost);
                if (result == null) result = caseExternalComponent(largeHost);
                if (result == null) result = caseComponent(largeHost);
                if (result == null) result = caseCloudElement(largeHost);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.STORM_NIMBUS: {
                StormNimbus stormNimbus = (StormNimbus)theEObject;
                T result = caseStormNimbus(stormNimbus);
                if (result == null) result = caseInternalComponent(stormNimbus);
                if (result == null) result = caseComponent(stormNimbus);
                if (result == null) result = caseCloudElement(stormNimbus);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.ZOOKEEPER: {
                Zookeeper zookeeper = (Zookeeper)theEObject;
                T result = caseZookeeper(zookeeper);
                if (result == null) result = caseInternalComponent(zookeeper);
                if (result == null) result = caseComponent(zookeeper);
                if (result == null) result = caseCloudElement(zookeeper);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.KAFKA: {
                Kafka kafka = (Kafka)theEObject;
                T result = caseKafka(kafka);
                if (result == null) result = caseInternalComponent(kafka);
                if (result == null) result = caseComponent(kafka);
                if (result == null) result = caseCloudElement(kafka);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.LOAD_BALANCER: {
                LoadBalancer loadBalancer = (LoadBalancer)theEObject;
                T result = caseLoadBalancer(loadBalancer);
                if (result == null) result = caseExternalComponent(loadBalancer);
                if (result == null) result = caseComponent(loadBalancer);
                if (result == null) result = caseCloudElement(loadBalancer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DdsmPackage.CLUSTER: {
                Cluster cluster = (Cluster)theEObject;
                T result = caseCluster(cluster);
                if (result == null) result = caseCloudElement(cluster);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cloud Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cloud Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCloudElement(CloudElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProperty(Property object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResource(Resource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComponent(Component object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Internal Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Internal Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInternalComponent(InternalComponent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Execution Platform</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Execution Platform</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExecutionPlatform(ExecutionPlatform object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Port</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePort(Port object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Required Port</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Required Port</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRequiredPort(RequiredPort object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Provided Port</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Provided Port</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProvidedPort(ProvidedPort object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Required Execution Platform</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Required Execution Platform</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRequiredExecutionPlatform(RequiredExecutionPlatform object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Provided Execution Platform</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Provided Execution Platform</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProvidedExecutionPlatform(ProvidedExecutionPlatform object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationship(Relationship object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Execution Binding</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Execution Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExecutionBinding(ExecutionBinding object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>External Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>External Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExternalComponent(ExternalComponent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProvider(Provider object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>VM</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>VM</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVM(VM object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DDSM</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DDSM</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDDSM(DDSM object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Life Cycle</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Life Cycle</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLifeCycle(LifeCycle object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Chef Recipe</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chef Recipe</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChefRecipe(ChefRecipe object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Offer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Offer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOffer(Offer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Storm Supervisor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Storm Supervisor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStormSupervisor(StormSupervisor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Medium Host</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Medium Host</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMediumHost(MediumHost object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Small Host</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Small Host</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSmallHost(SmallHost object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Large Host</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Large Host</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLargeHost(LargeHost object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Storm Nimbus</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Storm Nimbus</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStormNimbus(StormNimbus object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Zookeeper</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Zookeeper</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseZookeeper(Zookeeper object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Kafka</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Kafka</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKafka(Kafka object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Balancer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Balancer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadBalancer(LoadBalancer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cluster</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cluster</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCluster(Cluster object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //DdsmSwitch
