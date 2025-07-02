// strings are immutable: cannot be changed modified and nothing can be added or deleted in it if it's once stored in memory

import java.util.*;
public class string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        uncomment following and try running separately because the full name you will enter will not be taken and all the tokens after 1st token will be given as input to next part that is full name
//        System.out.println("try entering you full name");
//        String name = sc.next();//  stores only first token of input
//        System.out.println(name);

        //input full name
        System.out.println("enter full name (first + middle + last)");
        String fullName = sc.nextLine();// stores full line input
        System.out.println(fullName);
        // input first name and last name then connect
        System.out.println("first name: ");
        String firstName = sc.next();
        System.out.println("last name: ");
        String lastName = sc.next();
        System.out.println(firstName+" "/*to enter space between first and last name */+lastName);

        // charAt : --print all characters of string individually
        //printing characters of ful name
        for(int i = 0; i <fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        // string comparison
        // functions used is s1.compareTo(s2)  returns 0 =ve and -ve values means equal less and greater strings  comparison is done based to alphabets of string index by index  first encountered difference decides
        if(firstName.compareTo(lastName) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // to check equal strings we can also use s1.equals(s2) its output is true or false
        System.out.println(firstName.equals(lastName));

        if(firstName.equals(lastName)){
            System.out.println("strings are equal");
        }else{
            System.out.println("not equal ");
        }
        // another method could be  s1 == s2   which is not correct always
        // try entering same first name and last name   previous method will print equal this will print not equal

        if(firstName == lastName){
            System.out.println("strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // substring is just like indexing or slicing    stringName.substring(starting index; ending index+1)  end limit is not included
        System.out.println(fullName.substring(0,6));//prints items at 0 1 2 3 4 5 index i.e. first 5 letters

    }
}
