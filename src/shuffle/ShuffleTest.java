package shuffle;

import java.util.*;
/**
 * Program demonstrujący algorytmy tasowania i sortowania
 * @author Tomek
 *
 */
public class ShuffleTest {

    public static void main(String[]args) {
        var numbers = new ArrayList<Integer>();
        for(int i = 0; i <= 49; i++) numbers.add(i);
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }
}
