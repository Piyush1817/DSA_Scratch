package hash;
import java.util.*;
public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array in the range of 0 to n");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i] < 0 || arr[i] > n){
                System.out.println("invalid input");
                return;
            }
        }
        int missing = findMissing(arr);
        System.out.println("missing number: " + missing);
        int missingSum = findMissingSum(arr);
        System.out.println("missing number using sum method: " + missingSum);   

    }
    static int findMissing(int[] arr){
       HashSet<Integer> set = new HashSet<>();
       for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
       }
       for(int i=0;i<=arr.length;i++){
           if(!set.contains(i)){
               return i;
           }
       }
       return -1;
    }

   //most efficient method 
    static int findMissingSum(int[] arr){
        int n = arr.length;
        int sum = n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            sum -= arr[i];
        }
        return sum;
    }
}