// if else and switch case
import java.util.*;

public class conditions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you age:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
        System.out.print("enter number to check odd or even : ");
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        System.out.println("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("equal numbers ");
        }else if(a>b) {
            System.out.println("a greater than b ");
        }
        else{
            System.out.println("a less than b ");
        }
        // switch statements
        System.out.println("Enter button number ");
        int button = sc.nextInt();
        // switch case saves us from writing long if else conditions
        switch (button){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("salam");
            break;
            case 4: System.out.println("morgan");
            break;
            default: System.out.println("hello");

            // here default and case 1 is same so we may remove case 1
        }
    }
}
