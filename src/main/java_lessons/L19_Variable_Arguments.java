public class L19_Variable_Arguments {
    public static void main(String[] args) {
        // Variable arguments
        // VarArgs
        // Method can accept any number of arguments
        //... -> variable arguments

        addition(10, 20);              // 30
        addition(10, 20, 30);          // 60
        addition(10, 20, 30, 40);      // 100
        addition(10, 20, 30, 40, 50);  // 150
    }

    public static void addition(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
