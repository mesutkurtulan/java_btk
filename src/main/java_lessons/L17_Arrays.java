import java.util.Arrays;
import java.util.List;

public class L17_Arrays {
    public static void main(String[] args) {
        // Arrays
        // A collection of similar data types.
        // Arrays are Non-Primitive like Strings, Lists, Maps, Sets, etc.
        // Arrays are fixed size. length is fixed.
        // Arrays decleration: 1,
        int intArray1[] = {1, 2, 3, 4, 5};
        System.out.println(intArray1);  // Prints the array's memory location -> [I@4617c264
        System.out.println(intArray1.length); // Prints the length of the array -> 5
        System.out.println(Arrays.toString(intArray1)); // Prints the array's element as String -> [1, 2, 3, 4, 5]
        System.out.println(intArray1[0]); // Prints the first element of the array -> 1

        // Arrays decleration: 2
        int[] intArray2 = {1, 2, 3, 4, 5};

        // Arrays decleration: 3
        int[] intArray3 = new int[5]; // Creates an array with 5 elements, but elements are not initialized. default values are 0.
        System.out.println(Arrays.toString(intArray3));  // [0, 0, 0, 0, 0]
        intArray3[0] = 1;
        intArray3[1] = 2;
        intArray3[2] = 3;
        intArray3[3] = 4;
        intArray3[4] = 5;

        // Arrays decleration: 4
        int[] intArray4 = new int[]{1, 2, 3, 4, 5};

        // Convert any string to array
        String str = "Hello World";
        str = str.replace(" ", "").toLowerCase();
        char[] charArray1 = str.toCharArray();
        System.out.println(Arrays.toString(charArray1)); // Prints the array's element as String -> [h, e, l, l, o, w, o, r, l, d]
        String[] stringArray2 = str.split("");
        System.out.println(Arrays.toString(stringArray2)); // Prints the array's element as String -> [h, e, l, l, o, w, o, r, l, d]

        // Sorting
        int[] intArray6 = {5, 4, 3, 2, 1, 6, 8, 7, 9};
        Arrays.sort(intArray6); // before binary search, this array should be sorted.
        System.out.println(Arrays.toString(intArray6));             // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // Arrays.binarySearch(array, value) -> Searches for a value in a sorted array and returns its index if found; otherwise, it returns a negative value
        System.out.println(Arrays.binarySearch(intArray6, 3));  // Prints the index of the element 3 -> 2
        System.out.println(Arrays.binarySearch(intArray6, 10));  // Prints the index of the element 3 -> -10

        // Multidimensional Arrays
        // Create a 2D array with 3 rows and 3 columns.
        int[][] intArray5 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(intArray5[0])); // Prints the first row of the array -> [1, 2, 3]
        System.out.println(Arrays.toString(intArray5[1])); // Prints the second row of the array -> [4, 5, 6]
        System.out.println(Arrays.toString(intArray5[2])); // Prints the third row of the array -> [7, 8, 9]

        // 2D Arrays initilization without declaring elements
        int[][] intArray7 = new int[3][3];
        intArray7[0][0] = 1;
        intArray7[0][1] = 2;
        intArray7[0][2] = 3;
        intArray7[1][0] = 4;
        intArray7[1][1] = 5;
        intArray7[1][2] = 6;
        intArray7[2][0] = 7;
        intArray7[2][1] = 8;
        intArray7[2][2] = 9;

        // Arrays.toString(array) -> Returns a string representation of the array, which is helpful for printing arrays.

        // Arrays.equals(array1, array2)

        System.out.println(Arrays.equals(intArray1, intArray2)); // Prints true if the arrays are equal -> true

        // Arrays.fill(array, value) -> Fills all elements of the array with the specified value.
        int[] intArray8 = new int[5];
        Arrays.fill(intArray8, 10);
        System.out.println(Arrays.toString(intArray8)); // Prints the array's element as String -> [10, 10, 10, 10, 10]

        // Arrays.copyOf(array, newLength) -> Copies the original array to a new array with a specified length.
        int[] intArray9 = Arrays.copyOf(intArray1,5); // Copies the original array to a new array with a specified length. Output: [1, 2, 3, 0, 0]

        // Arrays.copyOfRange(array, from, to) -> Creates a new array containing a specified range from the original array. The from index is inclusive, and the to index is exclusive.
        int[] intArray10 = Arrays.copyOfRange(intArray1, 2, 6); // Copies the original array to a new array with a specified range. Output: [3, 4, 5]

        // Arrays.asList(array) -> Converts an array to a fixed-size List. This method is useful when you need to work with list operations on arrays.
        String[] words = {"apple", "banana", "cherry"};
        List<String> wordList = Arrays.asList(words);

        Integer[] intArray11 = {1, 2, 3, 4, 5};
        List<Integer> intList = Arrays.asList(intArray11);
        intList.size(); // 5

        // Arrays.stream(array) -> Converts an array into a Stream, which allows for powerful functional-style operations (like filter, map, forEach) on the array elements.
        int sum = Arrays.stream(intArray1).sum(); // 15

        // Arrays.deepToString(array) -> Returns a string representation of a multidimensional array, which is useful for printing arrays of arrays.
        System.out.println(Arrays.deepToString(intArray5)); // Prints the array's element as String -> [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

        // Arrays.deepEquals(array1, array2) -> Compares two multidimensional arrays for equality. It works similarly to Arrays.equals but for nested arrays.
        System.out.println(Arrays.deepEquals(intArray5, intArray7)); // Prints true if the arrays are equal -> true

        // Arrays.parallelSort(array) -> Performs parallel sorting, which can be faster on large arrays by using multiple threads. It’s available for primitive and object arrays.

        int[] intArray12 = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        Arrays.parallelSort(intArray12);
    }
}
