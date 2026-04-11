package recursion;
import java.util.Scanner;
public class Subsequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Subsequences of the string: ");
        generateSubsequences(str, 0, "");
    }

        public static void generateSubsequences(String str, int index, String current) {
        if (index == str.length()) {
            System.out.println(current);
            return;


        }  
    
        // Include the current character
        generateSubsequences(str, index + 1, current + str.charAt(index));      
        // Exclude the current character
        generateSubsequences(str, index + 1, current);
    }}
    
            
    
    
    
    
