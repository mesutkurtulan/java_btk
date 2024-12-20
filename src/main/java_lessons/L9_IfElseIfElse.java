public class L9_IfElseIfElse {
    public static void main(String[] args) {
        // Find the biggest number with if else if else
        int number1 = 10;
        int number2 = 10;
        int number3 = 10;

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is the biggest");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is the biggest");
        } else {
            System.out.println(number3 + " is the biggest");
        }

    }
}
