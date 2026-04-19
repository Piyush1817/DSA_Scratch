package strings;
import java.util.Scanner;
public class LongestPalindromicSubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        String result = longestPalindrome(s);
        System.out.println("The longest palindromic substring is: " + result);
    }
    public static String longestPalindrome(String s ){
        if(s.length() <= 1) return s;

        String longest = "";

        for(int i = 0; i < s.length(); i++){

            String odd = expand(s, i, i);
            String even = expand(s, i, i+1);

            if(odd.length() > longest.length())
                longest = odd;

            if(even.length() > longest.length())
                longest = even;
        }

        return longest;
    }
    public static String expand(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
