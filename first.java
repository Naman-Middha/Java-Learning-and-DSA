import java.util.*;  
// The java.util package contains classes like Scanner, ArrayList, HashMap, HashSet, Random, Date, Time, etc.
// If only one class is needed, we can write: import java.util.Scanner;

class First {
    // Every Java program must have a class. The file name and class name should be the same.
    // The main() method is the entry point where the program starts running.
    public static void main(String[] args) {

        System.out.println("hello world!");
        // Using Scanner class for user input
        Scanner sc = new Scanner(System.in);  // 'new' is used to create a new object
        int i = sc.nextInt();  // taking integer input
        System.out.println(i); // printing the input value
        //println is used to move to next line after printing   \n can also be use to move to next line 
        // Printing a simple pattern
        System.out.print("*\n**\n***\n****\n");
        // print only  does not jumps to next line    here \n is used  
        // Variable declarations and assignments
        String name = "NAMAN MIDDHA";
        System.out.println(name);

        int age = 48;
        double price = 25.25;
        int a = 25;
        int b = 10;

        System.out.println(b);
        // Updating the value of int b
        b = 20;
        // Updating the value of name
        name = "charlie";
        System.out.println(a);
        System.out.println(b);

        // Primitive data types in Java (with examples in comments):
        // byte (1 byte i.e. 8 bits): small integers → byte a = 100;
        // short (2 bytes): medium integers → short b = 30000;
        // int (4 bytes): normal integers → int c = 100000;
        // long (8 bytes): large integers → long d = 1000000000L;
        // float (4 bytes): decimal number (less precise) → float e = 5.75f;
        // double (8 bytes): decimal number (more precise) → double f = 19.99;
        // char (2 bytes): single character → char g = 'A';
        // boolean (1 bit): true or false → boolean h = true;

        sc.close(); // closing the Scanner object (good practice)
    }
}
