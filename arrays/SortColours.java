/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2] */



package arrays;
import java.util.*;
public class SortColours {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int t =sc.nextInt();

        System.out.println("Enter the elements of the array (0 for red, 1 for white, 2 for blue): ");
        int[] nums = new int[t];
        for(int i=0; i<t; i++){
            nums[i] = sc.nextInt();

        }
        int[] sortedArray = sortColors(nums);
        System.out.println("The sorted array is: " + Arrays.toString(sortedArray));
    }
    public static int[] sortColors(int[] nums){
              int n = nums.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}

//for brute force approach you can use any type of sorting algorithm like bubble sort, selection sort, insertion sort etc. but for optimal solution you can use dutch national flag algorithm which is O(n) time complexity and O(1) space complexity.  
