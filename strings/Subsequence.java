package strings;
import java.util.*;

public class Subsequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string");
        String s1 = sc.nextLine();
        System.out.println("enter the second string");
        String s2 = sc.nextLine();
        boolean isSubsequence = checkSubsequence(s1, s2);
        if (isSubsequence) {
            System.out.println(s1 + " is a subsequence of " + s2);
        } else {
            System.out.println(s1 + " is not a subsequence of " + s2);
        }
    }

    public static boolean checkSubsequence(String s1, String s2) {
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s1.length();
    }
}