package priorityQueue;

import java.time.LocalDate;
import java.util.*;

/**
 * Program demonstrujący zastosowanie kolejki priorytetowej
 * @author Tomek
 *
 */
public class PriorityQueueTest {

    public static void main(String[] args) {

        var pq = new PriorityQueue<LocalDate>();
        pq.add(LocalDate.of(1906,  12, 9));//G.Hopper
        pq.add(LocalDate.of(1815, 12, 10));//A.Lovelace
        pq.add(LocalDate.of(1903, 12, 3));//J.von Neumann
        pq.add(LocalDate.of(1910, 6, 22));//K.Zuse

        System.out.println("Iteracja przez elementy...");
        for(LocalDate date : pq)
            System.out.println(date);

        System.out.println("Usuwanie elementów...");
        while(!pq.isEmpty())
            System.out.println(pq.remove());
    }
}
