package PostLab1;

import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class MaxValueInSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(40);
        numbers.add(15);

        // Find the maximum value
        int maxValue = Collections.max(numbers);
        
        System.out.println("Maximum Value: " + maxValue);
    }
}
