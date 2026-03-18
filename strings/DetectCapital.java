package strings;
import java.util.*;
public class DetectCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String word = sc.nextLine();
        boolean isCapital = detectCapitalUse(word);
        System.out.println("the word " + word + " uses capital letters correctly: " + isCapital);
    }
    public static boolean detectCapitalUse(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        if(count==word.length()) return true;
              
        if(count==0) return true;

        if(count==1 && Character.isUpperCase(word.charAt(0))) return true;

        return false;
    }
}
