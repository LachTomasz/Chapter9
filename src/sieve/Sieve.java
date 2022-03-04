package sieve;

import java.util.*;

/**
 * Program wykonujący test porównawczy na bazie algorytmu sita Eratostenesa.
 * Oblicza wszystkie pierwsze d0 2 000 000.
 * @author Tomek
 *
 */
public class Sieve {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 2000000000;
        long start = System.currentTimeMillis();
        var bitSet = new BitSet(n+1);
        int count = 0;
        int i;
        for(i = 2; i <= n; i++)
            bitSet.set(i);
        i = 2;
        while(i * i <= n) {
            if(bitSet.get(i)) {
                count++;
                int k = 2 * i;
                while(k <= n) {
                    bitSet.clear(k);
                    k += i;
                }
            }
            i++;
        }
        while (i <= n) {
            if (bitSet.get(i)) count++;
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.println(count + "liczb pierwszych");
        System.out.println((end - start) + " milisekund");
    }

}
