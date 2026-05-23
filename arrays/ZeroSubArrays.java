package arrays;
import java.util.*;
public class ZeroSubArrays {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = countZeroSubArrays(arr);
        System.out.println("Number of subarrays filled with zero: " + result);
    }
    public static int countZeroSubArrays(int[] arr){
        long count = 0;
        long zeroCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zeroCount++;
            } else {
                zeroCount = 0;
            }
            count += zeroCount;
        }
        return (int) count;
    }
}
