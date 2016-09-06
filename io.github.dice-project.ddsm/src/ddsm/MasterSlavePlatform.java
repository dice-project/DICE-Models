/**
 */
package ddsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master Slave Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.MasterSlavePlatform#getRequiresMasterVm <em>Requires Master Vm</em>}</li>
 *   <li>{@link ddsm.MasterSlavePlatform#getRequiresSlaveVm <em>Requires Slave Vm</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getMasterSlavePlatform()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='slavePlatformsNeedBinding masterPlatformNeedBinding'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot slavePlatformsNeedBinding='requiresSlaveVm -> forAll(platform | ExecutionBinding.allInstances() ->\n\texists(b |\n\t\t b.requiredexecutionplatform.elementId = platform.elementId and \n\t         b.providedexecutionplatform.owner.oclIsTypeOf(VM)\n\t)\n)' masterPlatformNeedBinding='ExecutionBinding.allInstances() ->\n\texists(b |\n\t\t b.requiredexecutionplatform.elementId = requiresMasterVm.elementId and \n\t         b.providedexecutionplatform.owner.oclIsTypeOf(VM)\n\t)\n'"
 * @generated
 */
public interface MasterSlavePlatform extends InternalComponent {
    /**
     * Returns the value of the '<em><b>Requires Master Vm</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Requires Master Vm</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Requires Master Vm</em>' reference.
     * @see #setRequiresMasterVm(RequiredExecutionPlatform)
     * @see ddsm.DdsmPackage#getMasterSlavePlatform_RequiresMasterVm()
     * @model required="true"
     * @generated
     */
    RequiredExecutionPlatform getRequiresMasterVm();

    /**
     * Sets the value of the '{@link ddsm.MasterSlavePlatform#getRequiresMasterVm <em>Requires Master Vm</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Requires Master Vm</em>' reference.
     * @see #getRequiresMasterVm()
     * @generated
     */
    void setRequiresMasterVm(RequiredExecutionPlatform value);

    /**
     * Returns the value of the '<em><b>Requires Slave Vm</b></em>' reference list.
     * The list contents are of type {@link ddsm.RequiredExecutionPlatform}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Requires Slave Vm</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Requires Slave Vm</em>' reference list.
     * @see ddsm.DdsmPackage#getMasterSlavePlatform_RequiresSlaveVm()
     * @model required="true"
     * @generated
     */
    EList<RequiredExecutionPlatform> getRequiresSlaveVm();

} // MasterSlavePlatform
