public class L6_Increment_Decrement {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(number);     // 10
        number++;                       // 11
        System.out.println(number);     // 11
        System.out.println(number++);   // 11
        System.out.println(number);     // 12
        System.out.println(++number);   // 13

        int a = 10;
        int b = a++;
        System.out.println(a);     // 11
        System.out.println(b);     // 10

        int c = 10;
        int d = ++c;
        System.out.println(c);     // 11
        System.out.println(d);     // 11
    }
}
