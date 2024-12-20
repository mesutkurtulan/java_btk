public class L15_Methods {
    public static void main(String[] args) {
        printStaticHelloWorld();
        //printHelloWorld("Mesut"); // Non-static method 'printHelloWorld(java.lang.String)' cannot be referenced from a static context

    }
    public static void printStaticHelloWorld() {
        System.out.println("Hello World");
    }

    public void printNonStaticHelloWorld() {
        System.out.println("Hello World");
    }

    // public -> Access Modifier, this method can be accessed from anywhere                 (Class, Package, Subclass, Other Project)
    // protected -> Access Modifier, this method can be accessed from inside the project    (Class, Package, Subclass)
    // default -> Access Modifier, this method can be accessed from inside the package      (Class, Subclass)
    // private -> Access Modifier, this method can be accessed from inside the class        (Class)

    // static ->
    // static methods can be called without creating an object of the class.
    // static methods can be called with using the class name. Math.sqrt(9);

    // non-static methods can be called with creating an object of the class
    // Math math = new Math(); math.sqrt(9);

    // void -> return type
    // Other return types: int, double, boolean, char, byte, short, long, float, void

}
