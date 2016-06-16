package ddsm.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import ddsm.diagram.part.IogithubdiceprojectddsmVisualIDRegistry;

/**
 * @generated
 */
public class IogithubdiceprojectddsmNavigatorSorter extends ViewerSorter {

    /**
    * @generated
    */
    private static final int GROUP_CATEGORY = 1002;

    /**
    * @generated
    */
    public int category(Object element) {
        if (element instanceof IogithubdiceprojectddsmNavigatorItem) {
            IogithubdiceprojectddsmNavigatorItem item = (IogithubdiceprojectddsmNavigatorItem) element;
            return IogithubdiceprojectddsmVisualIDRegistry.getVisualID(item.getView());
        }
        return GROUP_CATEGORY;
    }

}
