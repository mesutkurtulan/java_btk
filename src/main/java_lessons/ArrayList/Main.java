package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] numberArray = new int[]{1,2,3};
        // numberArray[3]=4; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        ArrayList numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add("Ankara");
        System.out.println(numbers.size());
        System.out.println(numbers.get(2)); // Ankara
        numbers.set(0,10);
        numbers.remove(0);

        // numbers.clear();

        for (Object number:numbers) {
            System.out.println(number);
        }

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Ankara");
        cities.add("İzmir");
        Collections.sort(cities);
        System.out.println(cities); // [Istanbul, Ankara, İzmir]


    }
}
