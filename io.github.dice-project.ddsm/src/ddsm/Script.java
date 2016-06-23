/**
 */
package ddsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.Script#getScriptId <em>Script Id</em>}</li>
 *   <li>{@link ddsm.Script#getScriptUri <em>Script Uri</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject {
    /**
     * Returns the value of the '<em><b>Script Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Script Id</em>' attribute.
     * @see #setScriptId(String)
     * @see ddsm.DdsmPackage#getScript_ScriptId()
     * @model id="true" required="true"
     * @generated
     */
    String getScriptId();

    /**
     * Sets the value of the '{@link ddsm.Script#getScriptId <em>Script Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Script Id</em>' attribute.
     * @see #getScriptId()
     * @generated
     */
    void setScriptId(String value);

    /**
     * Returns the value of the '<em><b>Script Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script Uri</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Script Uri</em>' attribute.
     * @see #setScriptUri(String)
     * @see ddsm.DdsmPackage#getScript_ScriptUri()
     * @model required="true"
     * @generated
     */
    String getScriptUri();

    /**
     * Sets the value of the '{@link ddsm.Script#getScriptUri <em>Script Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Script Uri</em>' attribute.
     * @see #getScriptUri()
     * @generated
     */
    void setScriptUri(String value);

} // Script
