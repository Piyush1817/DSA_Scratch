package strings;
import java.util.*;
public class LongestPalindrome{
   public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the string: ");
    String s=sc.nextLine();
    int result=longestPalindrome(s);
    System.out.println("The length of the longest palindromic substring is: " + result);
    
   }
   public static int  longestPalindrome(String s) {
    if (s==null ||s.length()==0) return -1;
     int[] count = new int[128]; // ASCII
        for(char c : s.toCharArray()){
            count[c]++;
        }

        int length = 0;
        boolean oddFound = false;

        for(int c : count){
            if(c % 2 == 0){
                length += c;
            } else {
                length += c - 1;
                oddFound = true;
            }
        }

        if(oddFound) length += 1;

        return length;
    }
   

}
