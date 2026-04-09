package recursion;
import java.util.Scanner;
public class ReverString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        String result = reverseString(str);
        System.out.println("Reversed string: " + result);
    }
     public  static String reverseString(String str){
        if(str.length() == 0){
            return str; // base case
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    
}
