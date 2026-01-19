package arrays;
import java.util.Scanner;
//binary search

public class LeetCode_3{
    public static void main(String[] args ){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter array elements in sorted order: ");   
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();}

        System.out.println("Enter target: ");
        int target=sc.nextInt();    
        int result=binarySearch(nums,target);    
    System.out.println("Result index: " + result);


    }

    static int binarySearch(int[] nums, int target){
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
        return -1;
    }
}
