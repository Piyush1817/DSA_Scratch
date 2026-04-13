package arrays ;
import java.util.Scanner;

public class MinDistance{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the index to start from: ");
        int start = sc.nextInt();
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        int minDistance = findMinDistance(arr, target,start );
        System.out.println("The minimum distance is: " + minDistance);
    }
    public static int findMinDistance(int[] arr , int target , int start ){
          int minDist = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                minDist = Math.min(minDist, Math.abs(i - start));
            }
        }

        return minDist;
    }
}