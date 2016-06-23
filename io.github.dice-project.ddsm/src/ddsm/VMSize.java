/**
 */
package ddsm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>VM Size</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ddsm.DdsmPackage#getVMSize()
 * @model
 * @generated
 */
public enum VMSize implements Enumerator {
    /**
     * The '<em><b>Small</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SMALL_VALUE
     * @generated
     * @ordered
     */
    SMALL(0, "Small", "Small"),

    /**
     * The '<em><b>Medium</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MEDIUM_VALUE
     * @generated
     * @ordered
     */
    MEDIUM(1, "Medium", "Medium"),

    /**
     * The '<em><b>Large</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LARGE_VALUE
     * @generated
     * @ordered
     */
    LARGE(2, "Large", "Large");

    /**
     * The '<em><b>Small</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Small</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SMALL
     * @model name="Small"
     * @generated
     * @ordered
     */
    public static final int SMALL_VALUE = 0;

    /**
     * The '<em><b>Medium</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Medium</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MEDIUM
     * @model name="Medium"
     * @generated
     * @ordered
     */
    public static final int MEDIUM_VALUE = 1;

    /**
     * The '<em><b>Large</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Large</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LARGE
     * @model name="Large"
     * @generated
     * @ordered
     */
    public static final int LARGE_VALUE = 2;

    /**
     * An array of all the '<em><b>VM Size</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final VMSize[] VALUES_ARRAY =
        new VMSize[] {
            SMALL,
            MEDIUM,
            LARGE,
        };

    /**
     * A public read-only list of all the '<em><b>VM Size</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<VMSize> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>VM Size</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VMSize get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            VMSize result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>VM Size</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VMSize getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            VMSize result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>VM Size</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VMSize get(int value) {
        switch (value) {
            case SMALL_VALUE: return SMALL;
            case MEDIUM_VALUE: return MEDIUM;
            case LARGE_VALUE: return LARGE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private VMSize(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //VMSize
