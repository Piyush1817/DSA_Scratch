package two_pointers;
import java.util.*;
public class Backspace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();
        boolean result = backspaceCompare(s1, s2);
        System.out.println("The strings are equal after processing backspaces: " + result);
    }
    static boolean backspaceCompare(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int backspaceCount1 = 0;
        int backspaceCount2 = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s1.charAt(i) == '#') {
                    backspaceCount1++;
                    i--;
                } else if (backspaceCount1 > 0) {
                    backspaceCount1--;
                    i--;
                } else {
                    break;
                }
            }

            while (j >= 0) {
                if (s2.charAt(j) == '#') {
                    backspaceCount2++;
                    j--;
                } else if (backspaceCount2 > 0) {
                    backspaceCount2--;
                    j--;
                } else {
                    break;
                }
            }

            char char1 = (i >= 0) ? s1.charAt(i) : '\0';
            char char2 = (j >= 0) ? s2.charAt(j) : '\0';

            if (char1 != char2) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}