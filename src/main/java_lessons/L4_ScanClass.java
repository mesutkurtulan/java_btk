import java.util.Scanner;

public class L4_ScanClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Scanner is Class
        // scan is Object from Class Scanner
        // new is operator
        // Scanner() is Method

        System.out.println("Please enter your name: ");
        String name = scan.nextLine(); // nextline() is used to read the whole line
        System.out.println("Your name is: " + name);
        System.out.println("Please enter your last name: ");
        String lastName = scan.next(); // next() is used to read the next token of the input as a String.
        System.out.println("Your name and last name is: " + name + " " +lastName);

        // scan is Object from Class Scanner
        // next() is method of Scanner Object from Class Scanner

        scan.close(); // to close the scanner object
    }
}
