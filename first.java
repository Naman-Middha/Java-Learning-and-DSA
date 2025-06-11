import java.util.*;
// above package contains classes like   scanner arrayList hashmap hashset random date time  etc.
// if need only one class it can be written as import java.util.Scanner;
class first{
    // every java program must have a class   the file name and class name should be the same.
    //the main() method is the entry point where the program starts running
    public static void main(String[] args){
        // use of scanner class
        Scanner sc = new Scanner(System.in);  // new is used to input new item
        int i = sc.nextInt();
        // print statement
        System.out.println(i);
        System.out.print("*\n**\n***\n****\n");

        String name = " NAMAN MIDDHA ";
        System.out.println(name);
        int age = 48;
        double price = 25.25;
        int a = 25;
        int b = 10;
        System.out.println(b);
        //update int b
        b = 20;
        //update name
        name = "charlie";
        System.out.println(a);
        System.out.println(b);


        // primitive data types in java
//        byte(1 byte i.e. 8 bits)  small integers a =100
//                short(2 bytes)  medium integers  b = 30000
//                        int(4 bytes)   normal integers c = 100000
//                                long(8 bytes)          large integers  d = 1000000000L
//                                        float(4 bytes)   decimal number (less precise) e = 5.75f
//                                                double(8 bytes)  decimal number (more precise)  f = 19.99
//                                                        char(2 bytes)   single character  g = "A"
//                                                                boolean(1 bit)   true or false h = true
    }
}