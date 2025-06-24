import java.util.*;
public class array2d {
    public static void main(String[] args){
        // type[][] arrayName = new type[rows][columns]
        Scanner sc = new Scanner(System.in);
        int rNumber = sc.nextInt();
        int cNumber = sc.nextInt();
        int[][] arr2d = new int[rNumber][cNumber];

        for(int i = 0; i<rNumber; i++) {
            for( int j=0; j<cNumber; j++ ){
                System.out.println("enter element at("+i+","+j+")" );
                arr2d[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i< rNumber; i++) {
            for( int j=0; j<cNumber; j++ ){
            System.out.print(arr2d[i][j]);
            }
            System.out.println("");
        }

        System.out.println("enter number to find");
        int x = sc.nextInt();
        int y = 0;
        for(int i = 0; i< rNumber; i++) {
            for( int j=0; j<cNumber; j++ ){
               if(arr2d[i][j] == x){
                   System.out.println("number found at index ("+i+","+j+")");
                   y++;
               }
//               else if (i == rNumber-1 && j == cNumber-1 && arr2d[i][j]!=x ){
//                   System.err.println("element not found in array");
//               }
            }
        }
        if(y==0){
            System.out.println("element not found");
        }
    }
}