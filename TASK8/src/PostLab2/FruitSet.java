package PostLab2;

import java.util.Set;
import java.util.TreeSet;

public class FruitSet {
    public static void main(String[] args) {
        Set<String> fruits = new TreeSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Print sorted fruits
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

