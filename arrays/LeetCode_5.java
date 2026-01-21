package arrays;

import java.util.Scanner;

public class LeetCode_5{
      public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of elements: ");   
        int n =sc.nextInt();
        int[] nums= new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int output[] = smallerNumbersThanCurrent(nums);
        System.out.println("Result array: "+ java.util.Arrays.toString(output));   
        
      }
      static int[] smallerNumbersThanCurrent(int[] nums){
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
      }
}