package ddsm.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import ddsm.diagram.edit.parts.ChefRecipeEditPart;
import ddsm.diagram.edit.parts.IogithubdiceprojectddsmEditPartFactory;
import ddsm.diagram.part.IogithubdiceprojectddsmVisualIDRegistry;

/**
 * @generated
 */
public class IogithubdiceprojectddsmEditPartProvider extends DefaultEditPartProvider {

    /**
    * @generated
    */
    public IogithubdiceprojectddsmEditPartProvider() {
        super(new IogithubdiceprojectddsmEditPartFactory(), IogithubdiceprojectddsmVisualIDRegistry.TYPED_INSTANCE,
                ChefRecipeEditPart.MODEL_ID);
    }

}
