import java.util.Scanner;

public class L16_Loops {
    public static void main(String[] args) {
        // For Loop
        // if the number of repetions is known, use for loop.

        for (int i = 0; i < 5; i++) { // starting point, condition, increment
            System.out.println(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
        System.out.println("");
        /*
         *
         **
         ***
         ****
         *****
         */

        // While Loop
        // if the number of repetions is unknown, use while loop.
        /*
        int i = 0; // starting point
        while (i < 5) { // condition
        System.out.println(" ");
        i++; // increment
        }
         */

        String str = "Hello World";
        char c = 'l';
        int count = 0;
        int index = 0;
        while (index < str.length()) {
            if (str.charAt(index) == c) {
                count++;
            }
            index++;
        }
        System.out.println(c + " character is used " + count + " times in the " + str);

        // Do While Loop
        // In Java, a do-while loop is a type of loop that guarantees that the loop body will be executed at least once.
        // First, the code inside the do block is executed.
        /*
        int i = 0; // starting point
        do {
        System.out.println(" "); // First, the code inside the do block is executed.
        i++; // increment
        } while (i < 5); // condition
         */
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5); // condition

        Scanner scan = new Scanner(System.in);
        int num = 11;
        do {
            System.out.println("Enter a number but less than 10");
            String input = scan.nextLine();
            try {
                num = Integer.parseInt(input);
                System.out.println("You entered: " + num);
            } catch (NumberFormatException e) {
                try {
                    Double.parseDouble(input);
                    System.out.println("You entered: " + input +" is decimal number");
                } catch (NumberFormatException ex) {
                    System.out.println("You entered: " + input +" is a not valid number");
                }
            }

        } while (num >= 10);

        // For each loop
        // if the number of repetions is unknown, use for each loop.
        // It is used to iterate over string, arrays and collections.
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.print(number);
        }

        String[] names = {"Mesut", "Ahmet", "Ali", "Ayşe", "Fatma"};
        for (String name : names) {
            System.out.println(name);
        }

    }
}
