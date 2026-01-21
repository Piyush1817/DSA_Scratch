// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4

package arrays ;
import java.util.Scanner;

public class LeetCode_4 {
    public static void main(String[] args ){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter array elements in sorted order: ");   
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }     
        
        System.out.println("Enter target: ");
        int target=sc.nextInt();   
        int result=searchInsert(nums,target);    
        System.out.println("Result index: " + result);               
    }
    static int  searchInsert(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return start;
    }
}

        
