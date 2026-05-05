package slidingWindow;
import java.util.HashSet;
import java.util.Scanner;
public class LongestSubStringNonRepeating {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int maxLength = longestSubString(str);
        System.out.println("The length of the longest substring without repeating characters is: " + maxLength);
    }
    public static int longestSubString(String s){
       
   HashSet<Character> set = new HashSet<>();
        int left = 0; 
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }}
