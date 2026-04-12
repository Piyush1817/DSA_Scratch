package binarySearch;
import java.util.Scanner;

public class IsPerfectSqrt{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is perfect square or not ");
        int num = sc.nextInt();

        Boolean result =isPerfectSqrt(num);
        System.out.println(num + " is perfect square: " + result);
    }
    public static boolean isPerfectSqrt(int num){
        if (num<0){
            return false;
        
        }
        if(num==0 || num==1){
            return false ;
        }
        int start=1;
        int end = num;
        long ans=0;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(mid<=num/mid){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans*ans==num;
    }
}