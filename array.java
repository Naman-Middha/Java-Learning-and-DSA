import java.util.*;
public class array {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter size of array: ");
       int n = sc.nextInt();
       //type[] arrayName = new type[size]
       int[] arr = new int[n];
       System.out.println("\nEnter array elements");
       for( int i = 0; i< arr.length; i++){
           arr[i] = sc.nextInt();
       }
       System.out.println("enter element to search its index");
       int s = sc.nextInt();
       int y = 0;
       for(int j = 0; j < arr.length; j++){
//           System.out.println(arr[j]);
           if (arr[j] == s){
               System.out.println("element "+ s + " found at index " +j);
               y++;
               //break; ---->> if you want only the first matching index  example if element is found at multiple index then least index is printed
           }
//           else if(arr[j]!=s && j==arr.length-1 )  {
//               System.err.println("element not found ");
//           } // this method prints element not found after completing the loop
       }
       if(y==0){
           System.out.println("element not found");
       }
    }
}
