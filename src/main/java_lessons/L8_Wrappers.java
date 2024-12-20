public class L8_Wrappers {
    public static void main(String[] args) {
        // Wrapper class
        // Integer          int
        // Double           double
        // Boolean          boolean
        // Character        char
        // Long             long
        // Byte             byte
        // Short            short
        // Float            float

        // We can use wrapper classes to find max and min value of this wrapper.
        Byte byteMinValue = Byte.MAX_VALUE;
        Byte byteMaxValue = Byte.MIN_VALUE;
        System.out.println("Byte.MIN_VALUE " + byteMinValue);
        System.out.println("Byte.MAX_VALUE " + byteMaxValue);
        Short shortValue = Short.MAX_VALUE;
        System.out.println("Short.MAX_VALUE " + shortValue);
        Integer integerValue = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE " + integerValue);
        Long longValue = Long.MAX_VALUE;
        System.out.println("Long.MAX_VALUE " + longValue);
        Float floatValue = Float.MAX_VALUE;
        System.out.println("Float.MAX_VALUE " + floatValue);
        Double doubleValue = Double.MAX_VALUE;
        System.out.println("Double.MAX_VALUE " + doubleValue);
        Character characterValue = Character.MAX_VALUE;
        System.out.println("Character.MAX_VALUE " + characterValue);
    }
}
