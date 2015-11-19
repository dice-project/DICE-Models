# DICE-Models
Domain models used in the DICE Project (DPIM, DTSM, DDSM)

# Annotations

Annotations with the source `http://es.unizar.disco/dice/profiles/generator` are used to guide the generation of documentation and/or the corresponding UML profiles.

The following values should be considered when processing the model in subsequent transformations:

Key               | Description
------------------|------------
name              | Indicates that the given value should be used as the element name instead of the default one
profileName       | Indicates that the given value should be used as the name of the corresponding element of the profile instead of the default one (Dice + name)
extends           | Comma-separated list of classifiers fully-qualified names that are extended by this element
extendsProfile    | Comma-separated list of elements (using FQNs) that are extended by the profile element corresponding to the annotated element
comment           | The text defined in the entry's value should be appended as a comment
exclude*         | The annotated element should be ignored

* Note: the `exclude` tag may be substituted by an opposite `include` tag in the future, depending on the most common action.
