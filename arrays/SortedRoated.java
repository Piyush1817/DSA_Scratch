// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

// There may be duplicates in the original array.

// Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

 

// Example 1:

// Input: nums = [3,4,5,1,2]
// Output: true
// Explanation: [1,2,3,4,5] is the original sorted array.
// You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].


package arrays;
import java.util.Scanner;

public class SortedRoated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean result = isSortedRotated(arr);
        if (result) {
            System.out.println("The array is sorted and rotated.");
        } else {
            System.out.println("The array is not sorted and rotated.");
        }
    }

    public static boolean isSortedRotated(int[] arr ){
        int count = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++) {

            if(arr[i] > arr[(i + 1) % n]) {
                count++;
            }

            if(count > 1) {
                return false;
            }
        }

        return true;
    }
}
//check the number of drops (arr[i] > arr[i+1]) in the array, if there are more than 1 drops then return false else return true.