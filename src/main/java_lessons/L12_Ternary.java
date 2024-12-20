public class L12_Ternary {
    public static void main(String[] args) {
        // Ternary Operator
        // (condition)? (true) : (false)
        // We can use ternary operator to do same thing as if else statement

        int number1 = 10;
        int result1 = number1 > 10? 100 : 200;
        System.out.println(result1);

        int number2 = 10;
        String result2 = (number2%2 == 0) ? "even" : "odd";
        System.out.println(result2);

        // Nested Ternary Operator
        // (condition)? ((condition1)? (true) : (false)) : ((condition2)? (true) : (false))
    }
}
