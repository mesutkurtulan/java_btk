package ExceptionHandling;

public class Exceptions {
    public static void main(String[] args) {
        String sehir = "Ankara";
        //sehir = 1; compile olmayan kod

        int[] numbers = new int[]{1,2,3};
        // System.out.println(numbers[5]); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage()); // Error: Index 5 out of bounds for length 3
            System.out.println("Error: " + e.getCause()); // Error: null
            System.out.println("Error: " + e); // Error: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        finally {
            System.out.println("Finally block executed");
            // This block will be executed after the try/catch statement
        }
    }
}
