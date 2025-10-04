// bubble sort  time complexity O(n^2) not good    compare each element and swap
import java.util.*;
public class bubbleSort {
    public static void main(String[] args){
        // input array from user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements needs to be sorted ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements");
        for ( int i = 0 ; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int j = 0 ; j < arr.length-1; j++){
        for (int i = 0 ; i < arr.length-1; i++){   //length-i-1(logically running this much time saves time because last elements are always sorted   example 2 4 6 1       6 will move at last and does not need to be compared again
            if (arr[i] > arr[i + 1]) {
                //swap using temporary variables
//  using 2 temp variables
//                int t1;
//                int t2;
//                t1 = arr[i] ;
//                t2 = arr[i + 1] ;
//                arr[i] = t2;
//                arr[i+1] = t1;
            // using single temp variable
                int t1 = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = t1;
            }
        }
        }
        System.out.println("sorted array in ascending order ");
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

