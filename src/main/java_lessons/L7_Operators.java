public class L7_Operators {
    public static void main(String[] args) {
        // process priority
        // 1st exponents; n^n
        // 2nd parentheses; ()
        // 3rd multiplication & division; */
        // 4th addition & subtraction; +-

        // Modulus
        int remainder = 15 % 4; // 3
        System.out.println(remainder);

        int number = 1984;
        int thousands = number / 1000;
        int hundreds = number / 100 % 10;
        int tens = number / 10 % 10;
        int units = number % 10;

        int a = 10;
        System.out.println(a);          // 10
        System.out.println(a / 10);     // 1
        System.out.println(a /= 10);    // 1
        System.out.println(a);          // 1
    }
}
