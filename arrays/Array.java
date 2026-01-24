package arrays ;

import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        // types of output methods for arrays 
        System.out.println("Array elements are: ");
        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        for(int num:nums){
            System.out.print(num+" ");
        }

      System.out.println(java.util.Arrays.toString(nums));


    //arrays for object 

    System.out.println("Enter size of array: ");
    int s=sc.nextInt();
      
     String name[] = new String[s];

        System.out.println("Enter array elements: ");   
        for(int i=0;i<name.length;i++){
            name[i]=sc.next();
        }
        System.out.println("Array elements are: ");
        for(int i =0;i<name.length;i++){
            System.out.print(name[i]+" ");
        }   
        for(String nme:name){
            System.out.print(nme+" ");
        }   

        System.out.println(java.util.Arrays.toString(name));
    }
} 