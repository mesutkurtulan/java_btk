public class L10_SwichCases {
    public static void main(String[] args) {
        // Switch Case Statement
        // switch (variable) {
        //     case value:
        //         statement;
        //         break;
        // }
        // default:
        //     statement;
        //     break;

        // we can't use Long, Double, Float and Boolean in switch case statement
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
