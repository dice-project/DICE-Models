package ddsm.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import ddsm.DdsmPackage;
import ddsm.diagram.edit.parts.ChefRecipeEditPart;
import ddsm.diagram.part.IogithubdiceprojectddsmDiagramEditorPlugin;

/**
 * @generated
 */
public class IogithubdiceprojectddsmElementTypes {

    /**
    * @generated
    */
    private IogithubdiceprojectddsmElementTypes() {
    }

    /**
    * @generated
    */
    private static Map<IElementType, ENamedElement> elements;

    /**
    * @generated
    */
    private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
            IogithubdiceprojectddsmDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

    /**
    * @generated
    */
    private static Set<IElementType> KNOWN_ELEMENT_TYPES;

    /**
    * @generated
    */
    public static final IElementType ChefRecipe_1000 = getElementType(
            "io.github.dice-project.ddsm.diagram.ChefRecipe_1000"); //$NON-NLS-1$

    /**
    * @generated
    */
    public static ImageDescriptor getImageDescriptor(ENamedElement element) {
        return elementTypeImages.getImageDescriptor(element);
    }

    /**
    * @generated
    */
    public static Image getImage(ENamedElement element) {
        return elementTypeImages.getImage(element);
    }

    /**
    * @generated
    */
    public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
        return getImageDescriptor(getElement(hint));
    }

    /**
    * @generated
    */
    public static Image getImage(IAdaptable hint) {
        return getImage(getElement(hint));
    }

    /**
    * Returns 'type' of the ecore object associated with the hint.
    * 
    * @generated
    */
    public static ENamedElement getElement(IAdaptable hint) {
        Object type = hint.getAdapter(IElementType.class);
        if (elements == null) {
            elements = new IdentityHashMap<IElementType, ENamedElement>();

            elements.put(ChefRecipe_1000, DdsmPackage.eINSTANCE.getChefRecipe());
        }
        return (ENamedElement) elements.get(type);
    }

    /**
    * @generated
    */
    private static IElementType getElementType(String id) {
        return ElementTypeRegistry.getInstance().getType(id);
    }

    /**
    * @generated
    */
    public static boolean isKnownElementType(IElementType elementType) {
        if (KNOWN_ELEMENT_TYPES == null) {
            KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
            KNOWN_ELEMENT_TYPES.add(ChefRecipe_1000);
        }
        return KNOWN_ELEMENT_TYPES.contains(elementType);
    }

    /**
    * @generated
    */
    public static IElementType getElementType(int visualID) {
        switch (visualID) {
        case ChefRecipeEditPart.VISUAL_ID:
            return ChefRecipe_1000;
        }
        return null;
    }

    /**
    * @generated
    */
    public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

        /**
        * @generated
        */
        @Override

        public boolean isKnownElementType(IElementType elementType) {
            return ddsm.diagram.providers.IogithubdiceprojectddsmElementTypes.isKnownElementType(elementType);
        }

        /**
        * @generated
        */
        @Override

        public IElementType getElementTypeForVisualId(int visualID) {
            return ddsm.diagram.providers.IogithubdiceprojectddsmElementTypes.getElementType(visualID);
        }

        /**
        * @generated
        */
        @Override

        public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
            return ddsm.diagram.providers.IogithubdiceprojectddsmElementTypes.getElement(elementTypeAdapter);
        }
    };

}
