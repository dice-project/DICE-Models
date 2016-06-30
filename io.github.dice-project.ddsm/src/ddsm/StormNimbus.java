/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storm Nimbus</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ddsm.DdsmPackage#getStormNimbus()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='Specilization of an InternalComponent introduced in the context of DICE which captures \nthe deployment and configuration details of the Storm nimbus master process.'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustRequireZookeeper mustProvideNimbusAccess'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustRequireZookeeper='requiredport -> size() > 0' mustProvideNimbusAccess='providedport -> size() > 0'"
 * @generated
 */
public interface StormNimbus extends InternalComponent {
} // StormNimbus
