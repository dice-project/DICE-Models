package ddsm.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import ddsm.diagram.edit.policies.ChefRecipeItemSemanticEditPolicy;
import ddsm.diagram.part.IogithubdiceprojectddsmVisualIDRegistry;

/**
 * @generated
 */
public class ChefRecipeEditPart extends DiagramEditPart {

    /**
    * @generated
    */
    public final static String MODEL_ID = "io.github.dice-project.ddsm"; //$NON-NLS-1$

    /**
    * @generated
    */
    public static final int VISUAL_ID = 1000;

    /**
    * @generated
    */
    public ChefRecipeEditPart(View view) {
        super(view);
    }

    /**
    * @generated
    */
    protected void createDefaultEditPolicies() {
        super.createDefaultEditPolicies();
        installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ChefRecipeItemSemanticEditPolicy());
        installEditPolicy(EditPolicyRoles.CREATION_ROLE,
                new CreationEditPolicyWithCustomReparent(IogithubdiceprojectddsmVisualIDRegistry.TYPED_INSTANCE));
        // removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
    }

}
