package strings;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        if(isPlaindorme(str)){
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    static boolean isPlaindorme(String str){
        str= str.toLowerCase(); 
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // static boolean isPalindrome2(String str){
    //     StringBuilder sb = new StringBuilder(str);
    //     sb.reverse();
    //     return sb.toString().equalsIgnoreCase(str);
    // }

    // static boolean isPalindrome3(String str){
    //   str.toLowerCase();
    //   for(int i=0; i<str.length()/2; i++){
    //   char start=str.charAt(0);
    //     char end=str.charAt(str.length()-1-i);
    //     if(start != end){
    //         return false;
    //     }
    // }
    // return true;
    // }   
}
