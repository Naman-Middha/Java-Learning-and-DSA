import java.util.*;
public class ProgrammingWithArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        // input n and store n elements in array
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        // sum of all elements of array
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            sum+= arr[i];
        }
        System.out.println("sum of all elements is "+ sum);
        // min max
        int min = arr[0];
        for(int i = 0 ; i<n ; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("minimum elements is "+ min);

        int max = arr[0];
        for(int i = 0 ; i<n ; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("maximum elements is "+ max);

        // search given element in array
        System.out.println("Enter element to search");
        int x = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            if (arr[i] == x){
                System.out.println("element "+x+" found at index "+i);
            }
        }

        // number of even and odd in array

        int even = 0 ;
        int odd = 0 ;
        for(int i = 0 ; i<n ; i++){
            if (arr[i]%2==0){
                even++;
            }else{
               odd++;
            }
        }
        System.out.println("number of even and odd elements are "+even+" and "+odd);
    }
}
