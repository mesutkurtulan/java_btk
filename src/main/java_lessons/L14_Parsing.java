public class L14_Parsing {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str);
        System.out.println(str + " is " + ((Object) str).getClass().getSimpleName());       // 123 is String
        int number = Integer.parseInt(str);
        System.out.println(number);
        System.out.println(number + " is " + ((Object) number).getClass().getSimpleName()); // 123 is Integer
    }
}
