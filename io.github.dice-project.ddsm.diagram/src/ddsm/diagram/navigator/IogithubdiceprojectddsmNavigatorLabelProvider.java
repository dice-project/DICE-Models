package ddsm.diagram.navigator;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import ddsm.ChefRecipe;
import ddsm.diagram.edit.parts.ChefRecipeEditPart;
import ddsm.diagram.part.IogithubdiceprojectddsmDiagramEditorPlugin;
import ddsm.diagram.part.IogithubdiceprojectddsmVisualIDRegistry;
import ddsm.diagram.providers.IogithubdiceprojectddsmElementTypes;

/**
 * @generated
 */
public class IogithubdiceprojectddsmNavigatorLabelProvider extends LabelProvider
        implements ICommonLabelProvider, ITreePathLabelProvider {

    /**
    * @generated
    */
    static {
        IogithubdiceprojectddsmDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
                ImageDescriptor.getMissingImageDescriptor());
        IogithubdiceprojectddsmDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
                ImageDescriptor.getMissingImageDescriptor());
    }

    /**
    * @generated
    */
    public void updateLabel(ViewerLabel label, TreePath elementPath) {
        Object element = elementPath.getLastSegment();
        if (element instanceof IogithubdiceprojectddsmNavigatorItem
                && !isOwnView(((IogithubdiceprojectddsmNavigatorItem) element).getView())) {
            return;
        }
        label.setText(getText(element));
        label.setImage(getImage(element));
    }

    /**
    * @generated
    */
    public Image getImage(Object element) {
        if (element instanceof IogithubdiceprojectddsmNavigatorGroup) {
            IogithubdiceprojectddsmNavigatorGroup group = (IogithubdiceprojectddsmNavigatorGroup) element;
            return IogithubdiceprojectddsmDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
        }

        if (element instanceof IogithubdiceprojectddsmNavigatorItem) {
            IogithubdiceprojectddsmNavigatorItem navigatorItem = (IogithubdiceprojectddsmNavigatorItem) element;
            if (!isOwnView(navigatorItem.getView())) {
                return super.getImage(element);
            }
            return getImage(navigatorItem.getView());
        }

        return super.getImage(element);
    }

    /**
    * @generated
    */
    public Image getImage(View view) {
        switch (IogithubdiceprojectddsmVisualIDRegistry.getVisualID(view)) {
        case ChefRecipeEditPart.VISUAL_ID:
            return getImage("Navigator?Diagram?http://ddsm/1.0?ChefRecipe", //$NON-NLS-1$
                    IogithubdiceprojectddsmElementTypes.ChefRecipe_1000);
        }
        return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
    }

    /**
    * @generated
    */
    private Image getImage(String key, IElementType elementType) {
        ImageRegistry imageRegistry = IogithubdiceprojectddsmDiagramEditorPlugin.getInstance().getImageRegistry();
        Image image = imageRegistry.get(key);
        if (image == null && elementType != null
                && IogithubdiceprojectddsmElementTypes.isKnownElementType(elementType)) {
            image = IogithubdiceprojectddsmElementTypes.getImage(elementType);
            imageRegistry.put(key, image);
        }

        if (image == null) {
            image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
            imageRegistry.put(key, image);
        }
        return image;
    }

    /**
    * @generated
    */
    public String getText(Object element) {
        if (element instanceof IogithubdiceprojectddsmNavigatorGroup) {
            IogithubdiceprojectddsmNavigatorGroup group = (IogithubdiceprojectddsmNavigatorGroup) element;
            return group.getGroupName();
        }

        if (element instanceof IogithubdiceprojectddsmNavigatorItem) {
            IogithubdiceprojectddsmNavigatorItem navigatorItem = (IogithubdiceprojectddsmNavigatorItem) element;
            if (!isOwnView(navigatorItem.getView())) {
                return null;
            }
            return getText(navigatorItem.getView());
        }

        return super.getText(element);
    }

    /**
    * @generated
    */
    public String getText(View view) {
        if (view.getElement() != null && view.getElement().eIsProxy()) {
            return getUnresolvedDomainElementProxyText(view);
        }
        switch (IogithubdiceprojectddsmVisualIDRegistry.getVisualID(view)) {
        case ChefRecipeEditPart.VISUAL_ID:
            return getChefRecipe_1000Text(view);
        }
        return getUnknownElementText(view);
    }

    /**
    * @generated
    */
    private String getChefRecipe_1000Text(View view) {
        ChefRecipe domainModelElement = (ChefRecipe) view.getElement();
        if (domainModelElement != null) {
            return domainModelElement.getName();
        } else {
            IogithubdiceprojectddsmDiagramEditorPlugin.getInstance()
                    .logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
    * @generated
    */
    private String getUnknownElementText(View view) {
        return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
    }

    /**
    * @generated
    */
    private String getUnresolvedDomainElementProxyText(View view) {
        return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
    }

    /**
    * @generated
    */
    public void init(ICommonContentExtensionSite aConfig) {
    }

    /**
    * @generated
    */
    public void restoreState(IMemento aMemento) {
    }

    /**
    * @generated
    */
    public void saveState(IMemento aMemento) {
    }

    /**
    * @generated
    */
    public String getDescription(Object anElement) {
        return null;
    }

    /**
    * @generated
    */
    private boolean isOwnView(View view) {
        return ChefRecipeEditPart.MODEL_ID.equals(IogithubdiceprojectddsmVisualIDRegistry.getModelID(view));
    }

}
