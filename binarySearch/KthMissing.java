package arrays;
import java.util.Scanner;
public class KthMissing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        int result = findKthMissing(arr, k);
        if (result != -1) {
            System.out.println("The " + k + "-th missing number is: " + result);
        } else {
            System.out.println("There are less than " + k + " missing numbers in the array.");
        }
    }

    public static int  findKthMissing(int[] arr, int k) {
          int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            // how many numbers are missing till arr[mid]
            int missing = arr[mid] - (mid + 1);

            if(missing < k) {
                // kth missing number is on right side
                low = mid + 1;
            } else {
                // answer lies on left side
                high = mid - 1;
            }
        }

        // final answer
        return low + k;
    }
}
