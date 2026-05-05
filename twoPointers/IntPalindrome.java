package twoPointers;
import java.util.*;

public class IntPalindrome {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int x = sc.nextInt();

        boolean result = isPalindrome(x);

        System.out.println("Is Palindrome: " + result);
    }

    static boolean isPalindrome(int x){

        String s = Integer.toString(x);

        int start = 0;
        int end = s.length() - 1;

        while(start < end){

            if(s.charAt(start) != s.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}