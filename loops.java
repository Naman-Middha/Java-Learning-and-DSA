// for loop  do while loop and while loop
import java.util.*;
public class loops {
    public static void main(String[] args){
        // i ++ = i = i +1 ;

        int sum = 0;
        int counter = 0;
        for(int i = 1; i < 101; i ++){
            if(i%2==0) {
                counter ++ ;
                System.out.println(i);
            }
            sum = sum +i;
        }
        System.out.println("total number of even numbers : "+ counter);
        System.out.println("sum of values from 1 to 100 "+ sum);

        int i = 0;
        while(i<11){
            System.out.println(i);
            i ++;
        }
        i = 0;
        do{
            System.out.println(i);
            i++;
        }while (i<11);

        // while loop checks condition first and do while first perform then checks the condition

        i = 12;
        while(i<11){
            System.out.println("i"+"hello");
            i++;
            // no output
        }
        System.out.println("\n");
        i = 12;
        // it will print first and then checks condition
        do {
            System.out.println(i + " hello");
        } while(i < 11);// this condition is always false but still it will print for once then check condition and stop
    }
}
