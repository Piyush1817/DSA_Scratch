package strings;
import java.util.*;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        
        String[] arr = new String[n];
        
        System.out.println("Enter the strings: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLine();
        }
        
        String result = longestCommonPrefix(arr);
        System.out.println("Longest Common Prefix is: " + result);
        
        sc.close();
    }

    static String longestCommonPrefix(String[] arr) {
        
        if(arr == null || arr.length == 0)
            return "";
        
        // Find minimum length
        int minLength = arr[0].length();
        for(int i = 1; i < arr.length; i++){
            if(arr[i].length() < minLength){
                minLength = arr[i].length();
            }
        }
        
        // Vertical comparison using arr[i].charAt(j)
        for(int j = 0; j < minLength; j++){
            
            char currentChar = arr[0].charAt(j);
            
            for(int i = 1; i < arr.length; i++){
                if(arr[i].charAt(j) != currentChar){
                    return arr[0].substring(0, j);
                }
            }
        }
        
        return arr[0].substring(0, minLength);
    }
}