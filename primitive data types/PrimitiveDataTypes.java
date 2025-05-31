public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Integer Types
        byte byteVar = 127;             // 1 byte: -128 to 127
        short shortVar = 32000;         // 2 bytes: -32,768 to 32,767
        int intVar = 2147483647;        // 4 bytes: -2^31 to 2^31-1
        long longVar = 9223372036854775807L; // 8 bytes: -2^63 to 2^63-1

        // Floating-point Types
        float floatVar = 3.14f;         // 4 bytes: 6-7 decimal digits
        double doubleVar = 3.141592653589793; // 8 bytes: 15 decimal digits

        // Character Type
        char charVar = 'A';             // 2 bytes: Unicode characters

        // Boolean Type
        boolean boolVar = true;         // 1 bit (value: true or false)

        // Print values
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
    }
}
