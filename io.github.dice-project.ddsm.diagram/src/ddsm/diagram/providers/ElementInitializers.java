package ddsm.diagram.providers;

import ddsm.diagram.part.IogithubdiceprojectddsmDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

    protected ElementInitializers() {
        // use #getInstance to access cached instance
    }

    /**
    * @generated
    */
    public static ElementInitializers getInstance() {
        ElementInitializers cached = IogithubdiceprojectddsmDiagramEditorPlugin.getInstance().getElementInitializers();
        if (cached == null) {
            IogithubdiceprojectddsmDiagramEditorPlugin.getInstance()
                    .setElementInitializers(cached = new ElementInitializers());
        }
        return cached;
    }
}
