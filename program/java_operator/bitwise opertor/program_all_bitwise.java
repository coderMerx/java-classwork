public class program_all_bitwise{
    public static void main(String[] args) {
        int a = 5;  // binary: 0101
        int b = 3;  // binary: 0011

        System.out.println("a = " + a + " (Binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (Binary: " + Integer.toBinaryString(b) + ")\n");

        // Bitwise AND
        int andResult = a & b;
        System.out.println("a & b = " + andResult + " (Binary: " + Integer.toBinaryString(andResult) + ")");

        // Bitwise OR
        int orResult = a | b;
        System.out.println("a | b = " + orResult + " (Binary: " + Integer.toBinaryString(orResult) + ")");

        // Bitwise XOR
        int xorResult = a ^ b;
        System.out.println("a ^ b = " + xorResult + " (Binary: " + Integer.toBinaryString(xorResult) + ")");

        // Bitwise Complement (NOT)
        int complementResult = ~a;
        System.out.println("~a = " + complementResult + " (Binary: " + Integer.toBinaryString(complementResult) + ")");

        // Left Shift
        int leftShift = a << 1;
        System.out.println("a << 1 = " + leftShift + " (Binary: " + Integer.toBinaryString(leftShift) + ")");

        // Right Shift (signed)
        int rightShift = a >> 1;
        System.out.println("a >> 1 = " + rightShift + " (Binary: " + Integer.toBinaryString(rightShift) + ")");

        // Unsigned Right Shift
        int unsignedRightShift = a >>> 1;
        System.out.println("a >>> 1 = " + unsignedRightShift + " (Binary: " + Integer.toBinaryString(unsignedRightShift) + ")");
    }
}
