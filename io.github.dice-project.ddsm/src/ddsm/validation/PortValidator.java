/**
 *
 * $Id$
 */
package ddsm.validation;

import ddsm.Component;

/**
 * A sample validator interface for {@link ddsm.Port}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PortValidator {
    boolean validate();

    boolean validateComponent(Component value);
    boolean validatePortId(String value);
}