package binarySearch;
import java.util.Scanner;
public class Sqrt {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its square root: ");
        int n = sc.nextInt();
        int result = sqrt(n);
        System.out.println("The square root of " + n + " is approximately: " + result);
    }
    public static int sqrt(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number.");
        }
        if (n == 0 || n == 1) {
            return n; // The square root of 0 is 0 and the square root of 1 is 1
        }

        int left = 1;
        int right = n;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid == n/mid) {
                return mid; // Found exact square root
            } 
            
            else if (mid< n/mid) {
                left = mid + 1; // Search in the right half
                result = mid; // Update result to the last known integer square root
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return result; // Return the integer part of the square root
    }
}
