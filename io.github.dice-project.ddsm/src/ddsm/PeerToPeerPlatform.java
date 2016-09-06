/**
 */
package ddsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Peer To Peer Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.PeerToPeerPlatform#getRequiresPeerVm <em>Requires Peer Vm</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getPeerToPeerPlatform()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='peerPlatformsNeedBinding'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot peerPlatformsNeedBinding='requiresPeerVm -> forAll(platform | ExecutionBinding.allInstances() ->\n\texists(b |\n\t\t b.requiredexecutionplatform.elementId = platform.elementId and \n\t     b.providedexecutionplatform.owner.oclIsTypeOf(VM)\n\t)\n)'"
 * @generated
 */
public interface PeerToPeerPlatform extends InternalComponent {
    /**
     * Returns the value of the '<em><b>Requires Peer Vm</b></em>' reference list.
     * The list contents are of type {@link ddsm.RequiredExecutionPlatform}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Requires Peer Vm</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Requires Peer Vm</em>' reference list.
     * @see ddsm.DdsmPackage#getPeerToPeerPlatform_RequiresPeerVm()
     * @model required="true"
     * @generated
     */
    EList<RequiredExecutionPlatform> getRequiresPeerVm();

} // PeerToPeerPlatform
