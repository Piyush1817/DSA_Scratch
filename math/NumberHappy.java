// Write an algorithm to determine if a number n is happy.

// A happy number is a number defined by the following process:

// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.

//solution:-Using the Fact that Every Unhappy Number Reaches 4 

// This is a mathematical property of happy numbers:

// Every unhappy number eventually enters this cycle:

// 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4

package math;

import java.util.Scanner;

public class NumberHappy{
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number to check wether it is a happy number or not ");
          int n =sc.nextInt();

          Boolean isHappy = happyNumber(n);
          System.out.println("Number " + n + " is happy number: " + isHappy);
    }
    public static boolean happyNumber(int n){
          while (n != 1 && n != 4) {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }

}