package linkedList;

import java.util.*;

/**
 * Program demonstrujący działania na listach powiązanych
 * @author Tomek
 *
 */
public class LinkedListTest {

    public static void main(String[] args) {

        var a = new LinkedList<String>();
        a.add("Ania");
        a.add("Karol");
        a.add("Eryk");

        var b = new LinkedList<String>();
        b.add("Bartek");
        b.add("Daniel");
        b.add("Franek");
        b.add("Gosia");

        //scalenie list a i b

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while(bIter.hasNext()) {
            if(aIter.hasNext())	aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println(a);

        //Usunięcie co drugiego słowa z listy b
        bIter = b.iterator();
        while(bIter.hasNext()) {
            bIter.next();	//Opuszczenie jednego elementu
            if(bIter.hasNext()) {
                bIter.next();	//Opuszczenie następnego elementu
                bIter.remove();//Usunięcie elementu
            }
        }

        System.out.println(b);

        //Usunięcie wszystkich słów znajdujących się w liście b z listy a

        a.removeAll(b);

        System.out.println(a);
    }
}
