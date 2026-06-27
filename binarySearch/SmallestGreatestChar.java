// You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

// Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

 

// Example 1:

// Input: letters = ["c","f","j"], target = "a"
// Output: "c"
// Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
package binarySearch;
import java.util.Scanner ;


public class SmallestGreatestChar {
    public static void main(String[] args ){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of character array ");
      int n = sc.nextInt();


      char[] characters = new char[n];
      System.out.println("Enter the characters in the array ");

      for(int i =0 ;i<n;i++){
        characters[i]=sc.next().charAt(0);
      }
      System.out.println("Enter target character :");
      char target = sc.next().charAt(0);

      char ch = nextGreatestLetter(characters,target);
      System.out.println("Smallest Letter Greater Than Target is: "+ch);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
     int low = 0;
        int high = letters.length - 1;
        char ans = letters[0];   // default answer for wrap-around

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (letters[mid] > target) {
                ans = letters[mid];
                high = mid - 1;     // search for a smaller valid answer
            } else {
                low = mid + 1;
            }
        }

        return ans;       
    }
}
