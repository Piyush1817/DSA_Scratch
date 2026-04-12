package binarySearch;
import java.util.Scanner;

public class IsPerfectSqrt{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is perfect square or not ");
        int num = sc.nextInt();

        Boolean result =isPerfectSqrt(num);
        System.out.println(num + " is perfect square: " + result);

        Boolean result2 = newtonFormula(num);
        System.out.println(num + " is perfect square (using Newton's method): " + result2);
    }
    public static boolean isPerfectSqrt(int num){
        if (num<0){
            return false;
        
        }
        if(num==0 || num==1){
            return true ;
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

    public static boolean newtonFormula(int num){
        if (num < 0) {
            return false; // Negative numbers cannot have real square roots
        }
        if (num == 0 || num == 1) {
            return true; // Both 0 and 1 are perfect squares
        }

        long x = num;
        while (x * x > num) {
            x = (x + num / x) / 2; // Update x using Newton's method
        }
        return x * x == num; // Check if the result is a perfect square
    }     
}