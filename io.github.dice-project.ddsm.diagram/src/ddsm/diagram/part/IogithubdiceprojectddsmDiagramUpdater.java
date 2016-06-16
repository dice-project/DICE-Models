package ddsm.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import ddsm.diagram.edit.parts.ChefRecipeEditPart;

/**
 * @generated
 */
public class IogithubdiceprojectddsmDiagramUpdater {

    /**
    * @generated
    */
    public static List<IogithubdiceprojectddsmNodeDescriptor> getSemanticChildren(View view) {
        return Collections.emptyList();
    }

    /**
    * @generated
    */
    public static List<IogithubdiceprojectddsmLinkDescriptor> getContainedLinks(View view) {
        switch (IogithubdiceprojectddsmVisualIDRegistry.getVisualID(view)) {
        case ChefRecipeEditPart.VISUAL_ID:
            return getChefRecipe_1000ContainedLinks(view);
        }
        return Collections.emptyList();
    }

    /**
    * @generated
    */
    public static List<IogithubdiceprojectddsmLinkDescriptor> getIncomingLinks(View view) {
        return Collections.emptyList();
    }

    /**
    * @generated
    */
    public static List<IogithubdiceprojectddsmLinkDescriptor> getOutgoingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<IogithubdiceprojectddsmLinkDescriptor> getChefRecipe_1000ContainedLinks(View view) {
        return Collections.emptyList();
    }

    /**
    * @generated
    */
    public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
        /**
        * @generated
        */
        @Override

        public List<IogithubdiceprojectddsmNodeDescriptor> getSemanticChildren(View view) {
            return IogithubdiceprojectddsmDiagramUpdater.getSemanticChildren(view);
        }

        /**
        * @generated
        */
        @Override

        public List<IogithubdiceprojectddsmLinkDescriptor> getContainedLinks(View view) {
            return IogithubdiceprojectddsmDiagramUpdater.getContainedLinks(view);
        }

        /**
        * @generated
        */
        @Override

        public List<IogithubdiceprojectddsmLinkDescriptor> getIncomingLinks(View view) {
            return IogithubdiceprojectddsmDiagramUpdater.getIncomingLinks(view);
        }

        /**
        * @generated
        */
        @Override

        public List<IogithubdiceprojectddsmLinkDescriptor> getOutgoingLinks(View view) {
            return IogithubdiceprojectddsmDiagramUpdater.getOutgoingLinks(view);
        }
    };

}
