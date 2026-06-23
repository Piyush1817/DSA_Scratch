// Write an algorithm to determine if a number n is happy.

// A happy number is a number defined by the following process:

// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.



package twoPointers;
import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber{
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number to check wether it is a happy number or not ");
          int n =sc.nextInt();

          Boolean isHappy = happyNumber(n);
          System.out.println("Number " + n + " is happy number: " + isHappy);
    }
    public static boolean happyNumber(int n){
         HashSet<Integer> set = new HashSet<>();

        while (n != 1) {
            if (set.contains(n))
                return false;

            set.add(n);

            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return true;
    }

}