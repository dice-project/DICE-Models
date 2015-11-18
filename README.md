# DICE-Models
Domain models used in the DICE Project (DPIM, DTSM, DDSM)

# Annotations

Annotations with the source `http://es.unizar.disco/dice/profiles/generator` are used to guide the generation of documentation and/or the corresponding UML profiles.

The following values should be considered when processing the model in subsequent transformations:

Key      | Description
---------|------------
name     | Indicates that the given value should be used as the element name instead of the default one
comment  | The text defined in the entry's value should be appended as a comment
ignore*  | The annotated element should be ignored

* Note: the `ignore` tag may be substituted by an opposite `select` tag in the future, depending on the most common action.
