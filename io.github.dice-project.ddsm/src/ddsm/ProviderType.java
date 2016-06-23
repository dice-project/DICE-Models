/**
 */
package ddsm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Provider Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ddsm.DdsmPackage#getProviderType()
 * @model
 * @generated
 */
public enum ProviderType implements Enumerator {
    /**
     * The '<em><b>Flexiant</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FLEXIANT_VALUE
     * @generated
     * @ordered
     */
    FLEXIANT(0, "Flexiant", "Flexiant"),

    /**
     * The '<em><b>Openstack</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OPENSTACK_VALUE
     * @generated
     * @ordered
     */
    OPENSTACK(1, "Openstack", "Openstack");

    /**
     * The '<em><b>Flexiant</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Flexiant</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FLEXIANT
     * @model name="Flexiant"
     * @generated
     * @ordered
     */
    public static final int FLEXIANT_VALUE = 0;

    /**
     * The '<em><b>Openstack</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Openstack</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OPENSTACK
     * @model name="Openstack"
     * @generated
     * @ordered
     */
    public static final int OPENSTACK_VALUE = 1;

    /**
     * An array of all the '<em><b>Provider Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ProviderType[] VALUES_ARRAY =
        new ProviderType[] {
            FLEXIANT,
            OPENSTACK,
        };

    /**
     * A public read-only list of all the '<em><b>Provider Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ProviderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Provider Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ProviderType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ProviderType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Provider Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ProviderType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ProviderType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Provider Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ProviderType get(int value) {
        switch (value) {
            case FLEXIANT_VALUE: return FLEXIANT;
            case OPENSTACK_VALUE: return OPENSTACK;
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
    private ProviderType(int value, String name, String literal) {
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
    
} //ProviderType
