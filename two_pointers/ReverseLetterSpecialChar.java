package two_pointers;
import java.util.*;
public class ReverseLetterSpecialChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String result = reverseLetterSpecialChar(str);
        System.out.println("Result: " + result);
    }
    public static String reverseLetterSpecialChar(String str){
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        int start2 = 0;
        int end2 = arr.length - 1;  

        while(start < end||start2<end2){

            while(start < end && !isLetter(arr[start])) start++;
            while(start < end && !isLetter(arr[end])) end--;  
                     if(start<end){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
               end--; 
            }
            while(start2 < end2 && isLetter(arr[start2])) start2++;
            while(start2 < end2 && isLetter(arr[end2])) end2--;   
                     if(start2<end2){
                char temp = arr[start2];
                arr[start2] = arr[end2];
                arr[end2] = temp;
                start2++;
               end2--; 
            }
        }
           
        
        return new String(arr);
    }
    public static boolean isLetter(char c){
        return (c>='a' && c<='z') || (c>='A' && c<='Z');
    }   
    
}
