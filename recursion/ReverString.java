package recursion;
import java.util.Scanner;
public class ReverString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        String result = reverseString(str);
        System.out.println("Reversed string: " + result);
            System.out.println("Reversed string using method 2: ");
     
        System.out.println(reverseString2(str, str.length() - 1));
           
    }
     public  static String reverseString(String str){
        if(str.length() == 0){
            return str; // base case
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static String reverseString2(String str , int index){
        if (index<0){
            return "";
        }
       
        return str.charAt(index) + reverseString2(str,index-1);
    }
    
}
