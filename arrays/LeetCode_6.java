package arrays; 
import java.util.Scanner;

public class LeetCode_6 {

    // Function to check if array is sorted (non-decreasing)
    public static boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Function to remove duplicates (only works for sorted array)
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // 🔹 Check if array is sorted
        if (!isSorted(nums)) {
            System.out.println("Array is NOT sorted.");
            System.out.print("Original array: ");
            for (int num : nums) {
                System.out.print(num + " ");
            }
            sc.close();
            return;
        }

        // 🔹 Remove duplicates if sorted
        int k = removeDuplicates(nums);

        System.out.println("Array is sorted.");
        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
