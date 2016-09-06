/**
 */
package ddsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storm Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ddsm.DdsmPackage#getStormCluster()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='stormClusterDependsOnZookeeper'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot stormClusterDependsOnZookeeper='Relationship.allInstances() ->\n\texists(r | \n\t\tself.requiredport -> exists(p |\n\t\t\tp.elementId = r.requiredport.elementId and\n\t\t\t(r.providedport.owner.oclIsTypeOf(ZookeeperCluster) or\n\t\t\tr.providedport.owner.oclIsTypeOf(ZookeeperQuorum))\n\t\t)\n\t)'"
 * @generated
 */
public interface StormCluster extends MasterSlavePlatform {
} // StormCluster
