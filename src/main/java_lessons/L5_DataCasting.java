public class L5_DataCasting {
    public static void main(String[] args) {
        // Auto Widening
        // byte -> short -> int -> long -> float -> double
        byte b = 34;
        System.out.println(b);
        System.out.println("The type of b is: " + ((Object) b).getClass().getSimpleName());
        short s = b;
        System.out.println(s);
        System.out.println("The type of s is: " + ((Object) s).getClass().getSimpleName());
        int i = s;
        System.out.println(i);
        System.out.println("The type of i is: " + ((Object) i).getClass().getSimpleName());
        long l = i;
        System.out.println(l);
        System.out.println("The type of l is: " + ((Object) l).getClass().getSimpleName());
        float f = l;
        System.out.println(f);
        System.out.println("The type of f is: " + ((Object) f).getClass().getSimpleName());
        double d = f;
        System.out.println(d);
        System.out.println("The type of d is: " + ((Object) d).getClass().getSimpleName());

        // Explicit Narrowing
        double d1 = 10;
        System.out.println(d1);
        System.out.println("The type of d1 is: " + ((Object) d1).getClass().getSimpleName());
        float f1 = (float) d1;
        System.out.println(f1);
        System.out.println("The type of f1 is: " + ((Object) f1).getClass().getSimpleName());

        double d2 = 128.8;
        System.out.println(d2);
        System.out.println("The type of d2 is: " + ((Object) d2).getClass().getSimpleName());
        byte b1 = (byte) d2;
        System.out.println(b1);
        System.out.println("The type of b1 is: " + ((Object) b1).getClass().getSimpleName());

    }
}
