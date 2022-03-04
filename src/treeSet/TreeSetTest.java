package treeSet;

import java.util.*;

/**
 * Program sortujący obiektów typu Item przez porównanie ich opisów.
 * @author Tomek
 *
 */
public class TreeSetTest {

    public static void main(String[] args) {

        var parts = new TreeSet<Item>();
        parts.add(new Item("Toster", 1234));
        parts.add(new Item("Wihajster",4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        var sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }

}
