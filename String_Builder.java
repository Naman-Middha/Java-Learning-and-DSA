import java.util.*;

// String is immutable (every modification creates a new object which is slower for multiple changes)
// StringBuilder is mutable (modifies same object, faster for multiple changes)
// Use StringBuilder for heavy string manipulations
public class String_Builder {
    public static void main(String[] args){

//        String s1 = "naman middha";
//        StringBuilder s2 = new StringBuilder(s1);// s1 can be taken as input from user
//        System.out.println(s2);
        StringBuilder sb = new StringBuilder("Naman");
        System.out.println(sb);

        // char at a certain index
        System.out.println(sb.charAt(2));

        // set character at any index
        sb.setCharAt(0 , 's');
        System.out.println(sb);

        // insert at some index
        sb.insert(3,'a');
        System.out.println(sb);

        // delete a character or a substring

        // sb.delete(3,6) // deletes char at 3, 4 and 5
        sb.delete(3,4); // start from 3 and ends at 4 but does not include 4 i.e. character a will be removed
        System.out.println(sb);

        // reverse a string
        sb.reverse();
        System.out.println(sb);

        // reverse manually
        for(int i = 0; i<sb.length()/2; i++){
           // sb.length/2 because we need half operation only means in one iteration we will be replacing last and first both
           // suppose we have helina  replace h with a and a with h     replace e with n and n with e   similarly i and l  for length 6 we require only 3 operations
           int front = i;
           int back = sb.length()-1-i; //length is count(6), but it works on index( up to 5 )  6-1-0 =5 (for first and last char)  6-1-2 = 4  (for 2nd and 4th char)

           char frontChar = sb.charAt(front);
           char backChar = sb.charAt(back);

           sb.setCharAt(front, backChar);
           sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);// it's not storing the reversed string whereas .reverse stores it in memory

        // append   -- join at last
        sb.append(" ");// space at end of string
        sb.append("h");// h after space
        System.out.println(sb);
        sb.append("e");// e after h
        System.out.println(sb);
        sb.append("l");// l after e
        //System.out.println(sb);
        sb.append("l");// l after l
        //System.out.println(sb);
        sb.append("o");// p after l
        System.out.println(sb);


        // length of string
        System.out.println("length of string is "+sb.length());
    }
}