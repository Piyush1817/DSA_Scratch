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
         int current = 1;
        int i = 0;

        while(k > 0) {

            if(i < arr.length && arr[i] == current) {
                i++;
            } else {
                k--;
                
                if(k == 0) {
                    return current;
                }
            }

            current++;
        }

        return -1;
    }
}
