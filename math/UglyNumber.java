// An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.

// Given an integer n, return true if n is an ugly number.

 

// Example 1:

// Input: n = 6
// Output: true
// Explanation: 6 = 2 × 3

package math ;
import java.util.Scanner;

public class UglyNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether is ugly or not  ");

        int n = sc.nextInt();

        boolean isUgly = isUglyNumber(n);
       System.out.println("Number is ugly:"+isUgly);
        
    }
   public static boolean  isUglyNumber( int n) {
       if (n <= 0)
            return false;

        while (n % 2 == 0)
            n /= 2;

        while (n % 3 == 0)
            n /= 3;

        while (n % 5 == 0)
            n /= 5;

        return n == 1;
   }
}
