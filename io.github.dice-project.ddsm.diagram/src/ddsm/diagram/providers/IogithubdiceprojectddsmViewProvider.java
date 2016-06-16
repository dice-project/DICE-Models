package ddsm.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;

import ddsm.diagram.edit.parts.ChefRecipeEditPart;
import ddsm.diagram.part.IogithubdiceprojectddsmVisualIDRegistry;

/**
 * @generated
 */
public class IogithubdiceprojectddsmViewProvider extends AbstractProvider implements IViewProvider {

    /**
    * @generated
    */
    public final boolean provides(IOperation operation) {
        if (operation instanceof CreateViewForKindOperation) {
            return provides((CreateViewForKindOperation) operation);
        }
        assert operation instanceof CreateViewOperation;
        if (operation instanceof CreateDiagramViewOperation) {
            return provides((CreateDiagramViewOperation) operation);
        } else if (operation instanceof CreateEdgeViewOperation) {
            return provides((CreateEdgeViewOperation) operation);
        } else if (operation instanceof CreateNodeViewOperation) {
            return provides((CreateNodeViewOperation) operation);
        }
        return false;
    }

    /**
    * @generated
    */
    protected boolean provides(CreateViewForKindOperation op) {
        /*
            if (op.getViewKind() == Node.class)
              return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
            if (op.getViewKind() == Edge.class)
              return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
        */
        return true;
    }

    /**
    * @generated
    */
    protected boolean provides(CreateDiagramViewOperation op) {
        return ChefRecipeEditPart.MODEL_ID.equals(op.getSemanticHint()) && IogithubdiceprojectddsmVisualIDRegistry
                .getDiagramVisualID(getSemanticElement(op.getSemanticAdapter())) != -1;
    }

    /**
    * @generated
    */
    protected boolean provides(CreateNodeViewOperation op) {
        if (op.getContainerView() == null) {
            return false;
        }
        IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
        EObject domainElement = getSemanticElement(op.getSemanticAdapter());
        int visualID;
        if (op.getSemanticHint() == null) {
            // Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
            // In this situation there should be NO elementType, visualID will be determined
            // by VisualIDRegistry.getNodeVisualID() for domainElement.
            if (elementType != null || domainElement == null) {
                return false;
            }
            visualID = IogithubdiceprojectddsmVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement);
        } else {
            visualID = IogithubdiceprojectddsmVisualIDRegistry.getVisualID(op.getSemanticHint());
            if (elementType != null) {
                if (!IogithubdiceprojectddsmElementTypes.isKnownElementType(elementType)
                        || (!(elementType instanceof IHintedType))) {
                    return false; // foreign element type
                }
                String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
                if (!op.getSemanticHint().equals(elementTypeHint)) {
                    return false; // if semantic hint is specified it should be the same as in element type
                }
                if (domainElement != null && visualID != IogithubdiceprojectddsmVisualIDRegistry
                        .getNodeVisualID(op.getContainerView(), domainElement)) {
                    return false; // visual id for node EClass should match visual id from element type
                }
            } else {
                if (!ChefRecipeEditPart.MODEL_ID
                        .equals(IogithubdiceprojectddsmVisualIDRegistry.getModelID(op.getContainerView()))) {
                    return false; // foreign diagram
                }
                switch (visualID) {
                default:
                    return false;
                }
            }
        }
        return false;
    }

    /**
    * @generated
    */
    protected boolean provides(CreateEdgeViewOperation op) {
        IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
        if (!IogithubdiceprojectddsmElementTypes.isKnownElementType(elementType)
                || (!(elementType instanceof IHintedType))) {
            return false; // foreign element type
        }
        String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
        if (elementTypeHint == null
                || (op.getSemanticHint() != null && !elementTypeHint.equals(op.getSemanticHint()))) {
            return false; // our hint is visual id and must be specified, and it should be the same as in element type
        }
        int visualID = IogithubdiceprojectddsmVisualIDRegistry.getVisualID(elementTypeHint);
        EObject domainElement = getSemanticElement(op.getSemanticAdapter());
        if (domainElement != null
                && visualID != IogithubdiceprojectddsmVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
            return false; // visual id for link EClass should match visual id from element type
        }
        return true;
    }

    /**
    * @generated
    */
    public Diagram createDiagram(IAdaptable semanticAdapter, String diagramKind, PreferencesHint preferencesHint) {
        Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
        diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
        diagram.setType(ChefRecipeEditPart.MODEL_ID);
        diagram.setElement(getSemanticElement(semanticAdapter));
        diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
        return diagram;
    }

    /**
    * @generated
    */
    public Node createNode(IAdaptable semanticAdapter, View containerView, String semanticHint, int index,
            boolean persisted, PreferencesHint preferencesHint) {
        final EObject domainElement = getSemanticElement(semanticAdapter);
        final int visualID;
        if (semanticHint == null) {
            visualID = IogithubdiceprojectddsmVisualIDRegistry.getNodeVisualID(containerView, domainElement);
        } else {
            visualID = IogithubdiceprojectddsmVisualIDRegistry.getVisualID(semanticHint);
        }
        switch (visualID) {
        }
        // can't happen, provided #provides(CreateNodeViewOperation) is correct
        return null;
    }

    /**
    * @generated
    */
    public Edge createEdge(IAdaptable semanticAdapter, View containerView, String semanticHint, int index,
            boolean persisted, PreferencesHint preferencesHint) {
        IElementType elementType = getSemanticElementType(semanticAdapter);
        String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
        switch (IogithubdiceprojectddsmVisualIDRegistry.getVisualID(elementTypeHint)) {
        }
        // can never happen, provided #provides(CreateEdgeViewOperation) is correct
        return null;
    }

    /**
    * @generated
    */
    private EObject getSemanticElement(IAdaptable semanticAdapter) {
        if (semanticAdapter == null) {
            return null;
        }
        EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
        if (eObject != null) {
            return EMFCoreUtil.resolve(TransactionUtil.getEditingDomain(eObject), eObject);
        }
        return null;
    }

    /**
     * @generated
     */
    private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
        if (semanticAdapter == null) {
            return null;
        }
        return (IElementType) semanticAdapter.getAdapter(IElementType.class);
    }
}
