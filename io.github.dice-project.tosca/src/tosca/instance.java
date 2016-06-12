/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.instance#getDeploy <em>Deploy</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getinstance()
 * @model
 * @generated
 */
public interface instance extends EObject {
    /**
     * Returns the value of the '<em><b>Deploy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deploy</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deploy</em>' attribute.
     * @see #setDeploy(int)
     * @see tosca.ToscaPackage#getinstance_Deploy()
     * @model required="true"
     * @generated
     */
    int getDeploy();

    /**
     * Sets the value of the '{@link tosca.instance#getDeploy <em>Deploy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deploy</em>' attribute.
     * @see #getDeploy()
     * @generated
     */
    void setDeploy(int value);

} // instance
