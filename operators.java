import java.util.*;

// Arithmetic, Relational, Logical, and Bitwise operators.

class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking two integers as input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators (AND, OR, NOT)
        boolean x = (a > 0);
        boolean y = (b > 0);
        System.out.println("\nLogical Operators:");
        System.out.println("x && y (Logical AND): " + (x && y));
        System.out.println("x || y (Logical OR): " + (x || y));
        System.out.println("!x (Logical NOT): " + (!x));

        // Bitwise Operators (works on binary level)
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b (Bitwise AND): " + (a & b));
        System.out.println("a | b (Bitwise OR): " + (a | b));
        System.out.println("a ^ b (Bitwise XOR): " + (a ^ b));
        System.out.println("~a (Bitwise Complement of a): " + (~a));
        System.out.println("a << 1 (Left shift): " + (a << 1));
        System.out.println("a >> 1 (Right shift): " + (a >> 1));

        sc.close(); // good practice
    }
}
