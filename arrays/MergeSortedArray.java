package arrays;
import java.util.*;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array");
        int m = sc.nextInt();

        System.out.println("Enter size of second array");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];   
        int[] nums2 = new int[n];

        System.out.println("Enter first array elements (sorted)");
        for(int i = 0; i < m; i++){
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter second array elements (sorted)");
        for(int i = 0; i < n; i++){
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println("After merging:");
        for(int i = 0; i < nums1.length; i++){
            System.out.print(nums1[i] + " ");
        }

        sc.close();
    }

    static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i = 0; i < n; i++){
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);

        return nums1;
    }

    static int merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for merged array

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--; // Move the pointer for merged array
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
        
        k--; }

        return 0; // Return type can be void as we are modifying nums1 in place
    }
}