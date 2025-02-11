import java.util.Arrays;

public class L13_StringManipulation {
    public static void main(String[] args) {
        // String Manipulation

        // String.concat();
        System.out.println("Hello ".concat("World")); // Hello World

        // String.charAt();
        System.out.println("Hello World".charAt(6));        // W
        //System.out.println("Hello World".charAt(12));     // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 12

        // String.toLowerCase();
        System.out.println("Hello World".toLowerCase());    // hello world

        // String.toUpperCase();
        System.out.println("Hello World".toUpperCase());    // HELLO WORLD

        // String.equals();
        String string1 = "Hello World";
        String string2 = "Hello World";
        System.out.println(string1 == string2);         // true
        System.out.println(string1.equals(string2));    // true

        // String.equalsIgnoreCase();
        System.out.println("Hello World".equalsIgnoreCase("hello world"));      // true

        // String.length();
        System.out.println("Hello World".length());     // 11
        System.out.println("Hello World".charAt(("Hello World").length() - 1));    // d

        // String.indexOf();
        System.out.println("Hello World".indexOf('o'));                     // 4
        System.out.println("Hello World".indexOf('o', 5));      // 7

        // String.lastIndexOf();
        System.out.println("Hello World".lastIndexOf('o'));             // 7
        System.out.println("Hello World".lastIndexOf('o', 5));  // 4

        // String.contains();
        System.out.println("Hello World".contains("World")); // true

        // String.startsWith();
        System.out.println("Hello World".startsWith("Hello")); // true

        // String.endsWith();
        System.out.println("Hello World".endsWith("World")); // true

        // String.isEmpty();
        System.out.println("".isEmpty()); // true

        // String.replace(); use only one character (char
        System.out.println("Hello World ".replace(' ', '!')); // Hello!World!

        // String.replaceFirst();
        System.out.println("Hello Hello World".replaceFirst("Hello", "Hi")); // Hi Hello World

        // String.replaceAll() use multiple characters (String)
        System.out.println("Hello Hello World".replaceAll("Hello", "Hi"));  // Hi Hi World
        System.out.println("Hello World 1".replaceAll("\\s", "_"));           // Hello_World_1 -> All space is replaced with "_"
        System.out.println("Hello World 2".replaceAll("\\S", "!"));           // !!!!! !!!!! ! -> All character is replaced with "!"
        System.out.println("Hello World 3".replaceAll("\\w", "*"));           // ***** ***** * -> All word is replaced with "*"
        System.out.println("Hello World 4".replaceAll("\\W", "_"));           // Hello_World_4 -> All non-word is replaced with "_"
        System.out.println("Hello World 5".replaceAll("\\d", "_"));           // Hello World _ -> All digit is replaced with "_"
        System.out.println("Hello World 6".replaceAll("\\D", "_"));           // ____________6 -> All non-digits is replaced with "_"

        // String.substring();
        System.out.println("Hello World".substring(6)); // World
        System.out.println("Hello World".substring(6, 11)); // World

        // String.trim();
        System.out.println("Hello World ".trim()); // Hello World


        // String.split();
        System.out.println("Hello World".split("")); // [H, e, l, l, o, W, o, r, l, d]
        for (String word : "Hello World".split(" ")) {
            System.out.println(word); // Hello World
        }

        // String.valueOf();
        System.out.println(String.valueOf(100)); // 100

        // String.format();
        System.out.println(String.format("Hello %s", "World")); // Hello World

        // String.toCharArray();
        System.out.println("Hello World".toCharArray()); // [H, e, l, l, o, W, o, r, l, d]

        // String.getBytes();
        System.out.println("Hello World".getBytes()); // [72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100]

        // String.codePointAt();
        System.out.println("Hello World".codePointAt(0)); // 72

        // String.codePointBefore();
        System.out.println("Hello World".codePointBefore(5)); // 111

        // String.getChars(); -> copy the characters from a String to a char array
        char[] charArray = new char[10];
        String string = "Hello World";
        string.getChars(0, 5, charArray, 0);
        System.out.println(Arrays.toString(charArray)); // [H, e, l, l, o,  ,  ,  ,  ,  ]
    }
}
