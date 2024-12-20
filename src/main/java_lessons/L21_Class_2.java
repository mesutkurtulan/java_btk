import java.util.Arrays;

public class L21_Class_2 {
    public static void main(String[] args) {
        L20_Class_1 obj1 = new L20_Class_1(); // obj1 is deleted from Heap Memory -> Because we have two references pointing to the same object in Heap Memory.
        L20_Class_1 obj2 = new L20_Class_1();
        obj1 = obj2;
        obj1.add();      // Customer added to database
        obj1.delete();   // Customer deleted from database
        obj1.update();   // Customer updated in database
        obj1.get();      // Customer data retrieved from database

        obj2.add();      // Customer added to database
        obj2.delete();   // Customer deleted from database
        obj2.update();   // Customer updated in database
        obj2.get();      // Customer data retrieved from database

        // Value Type
        int num1 = 10;
        System.out.println(num1); // 10
        int num2 = 20;
        System.out.println(num2); // 20
        num2 = num1;
        num1 = 30;
        System.out.println(num1); // 30
        System.out.println(num2); // 20

        // Reference Type
        int[] numArray1 = new int[]{1, 2, 3};
        //System.out.println(Arrays.toString(numArray1)); // [1, 2, 3]
        int[] numArray2 = new int[]{4, 5, 6};
        //System.out.println(Arrays.toString(numArray2)); // [4, 5, 6]
        numArray2 = numArray1;
        numArray1[0] = 7;
        numArray1[1] = 8;
        numArray1[2] = 9;

        System.out.println(Arrays.toString(numArray1)); // [7, 8, 9]
        System.out.println(Arrays.toString(numArray2)); // [7, 8, 9]

        System.out.println(obj1.add(10,5));         // 15
        System.out.println(obj1.subtract(10,5));    // 5
        System.out.println(obj1.multiply(10,5));    // 50
        System.out.println(obj1.divide(10,5));      // 2


    }
}

// Stack Memory   // Heap Memory
///////////////   ////////////////////////////////////////
//   obj1    //   // add(), delete(), update(), get()   //
//   obj2    //   // add(), delete(), update(), get()   //
//           //   //                                    //
///////////////   ////////////////////////////////////////


// Stack Memory   // Heap Memory
// Value Type     // Reference Type
///////////////   ////////////////////////////////////////
// int num=1 //   //                                    //
// int num=2 //   // add(), delete(), update(), get()   //
// numArray1 //   // [1, 2, 3]                          //
// numArray2 //   // [4, 5, 6]                          //
///////////////   ////////////////////////////////////////


