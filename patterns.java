import java.util.*;

public class patterns {
    public static void main(String[] args){
        System.out.println("1.solid rectangle ");
        // solid rectangle using nested loops
        for(int i = 0 ; i<4; i++){
            for (int j = 0; j<5; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("2.Hollow rectangle");

        // hollow rectangle  at i =1 or j=1  and i = n or j = n  boundary point are *
        for (int i = 0 ; i<4; i++){
            for (int j = 0 ; j<5 ; j++){
                if ( i == 0 || j == 0 || i == 3 || j == 4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("3.half Pyramid");
        //half pyramid
        for (int i = 0 ; i < 5 ; i++){
            for ( int j = 0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("4.inverted half pyramid");
        //inverted half pyramid
        for (int i = 0 ; i < 5 ; i++){
            for ( int j = 5 ; j>i ; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        // method 2
        for (int i = 5; i>=1 ; i--){
            for ( int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("5.Inverted pyramid rotated 180 degree");
// inverted  half pyramid rotated 180 degrees
        for (int i = 0 ; i<=4 ; i++){
            for (int j=0 ; j<=4-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        // half pyramid with numbers
        System.out.println("6. half pyramid with numbers");

        for (int i = 1 ; i<6; i++){
            for ( int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        // inverted half pyramid with numbers
        System.out.println("7. inverted half pyramid with numbers");
        for (int i = 1; i<=6; i++){
            for(int j = 1; j<=6-i+1 ;j++ ){
                    System.out.print(j);
            }
            System.out.println("");
        }
        // floyd's triangle
        System.out.println("8. floyd's triangle");
        int number = 1;
        for (int i =0 ; i<5 ; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(number+" ");
                number ++;
            }
            System.out.println("");
        }
        System.out.println("");
        // 0-1 triangle  at even coordinate-sum 1 and rest its 0
        System.out.println("9. 0-1 triangle ");

        for (int i = 0 ; i < 5; i ++){
            for ( int j = 0 ; j<= i ; j++){
                if( (i+j)%2==0 ){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }
}
