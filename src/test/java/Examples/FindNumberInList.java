package Examples;

import java.util.Arrays;

public class FindNumberInList {
    public static void main(String[] args) {
        // Find the number inside the ArrayList
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int number = 70;
        Boolean isExist = false;

        // For loo
        for (int num : numbers) {
            if (num == number) {
                System.out.println("Number " + number + " is in the array");
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("Number " + number + " is not in the array");
        }

        // Arrays.binarySearch method
        int index = Arrays.binarySearch(numbers, number);
        if (index >= 0) {
            System.out.println("Number " + number + " is in the array and on the index " + index);
        } else {
            System.out.println("Number " + number + " is not in the array");
        }
    }
}
