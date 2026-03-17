package strings;
import java.util.*;
public class Ransom {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the ransom note: ");
        String ransomNote = sc.nextLine();   
        System.out.println("enter the magazine: ");
        String magazine = sc.nextLine();
        boolean result = canConstruct(ransomNote,magazine);
        System.out.println("can construct ransom note from magazine: " + result);
     }
    
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : magazine.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                return false; // Not enough characters in the magazine
            }
        }
        return true; // All characters are available in the magazine
    }
}  
