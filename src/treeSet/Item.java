package treeSet;

import java.util.*;
/**
 * Element z opisem i numerem częsci.
 * @author Tomek
 *
 */
public class Item implements Comparable<Item>{

    private String description;
    private int partNumber;

    /**
     * Tworzy element
     *
     * @param aDescription
     * 			opis elementu
     * @param aPartNumber
     * 			numer częsci elementu
     */
    public Item(String aDescription, int aPartNumber) {
        description = aDescription;
        partNumber = aPartNumber;
    }

    /**
     * Pobiera opis elementu
     *
     * @return opis
     */
    public String getDescription() {
        return description;
    }

    public String toString() {
        return "[description=" + description + ", partNumber=" + partNumber + "]";
    }

    public boolean equals(Object otherObject) {
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if(getClass() != otherObject.getClass()) return false;
        var other = (Item) otherObject;
        return Objects.equals(description, other.description)&& partNumber == other.partNumber;
    }

    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    public int compareTo(Item other) {
        int diff = Integer.compare(partNumber, other.partNumber);
        return diff != 0 ? diff : description.compareTo(other.description);
    }

}
