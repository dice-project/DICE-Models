# DICE-Models
Domain models used in the DICE Project (DPIM, DTSM, DDSM)

# Annotations

Annotations with the source `http://es.unizar.disco/dice/profiles/generator` are used to guide the generation of documentation and/or the corresponding UML profiles.

The following values should be considered when processing the model in subsequent transformations:

Key               | Description
------------------|------------
name              | Indicates that the given value should be used as the element name instead of the default one
stereotypeName    | Indicates that the given value should be used as the name of the corresponding stereotype instead of the default one (Dice + name)
extends           | Comma-separated list of classifiers fully-qualified names that are extended by this element
extendsStereotype | Comma-separated list of Stereotypes fully-qualified names that are extended by the stereotype corresponding to this element
comment           | The text defined in the entry's value should be appended as a comment
ignore*           | The annotated element should be ignored

* Note: the `ignore` tag may be substituted by an opposite `select` tag in the future, depending on the most common action.
