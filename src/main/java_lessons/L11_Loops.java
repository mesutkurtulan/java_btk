public class L11_Loops {
    public static void main(String[] args) {
        // For loops
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }

        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        String[] names = {"Mesut", "Ahmet", "Ali", "Ayşe", "Fatma"};
        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
