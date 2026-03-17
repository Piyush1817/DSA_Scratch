package strings;
import java.util.*;
public class Keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the words in array");
        String[] words = sc.nextLine().split(" ");
        String[] result = findWords(words);
       System.out.println("the words that can be typed using letters of the alphabet on only one row of a standard QWERTY keyboard are: " + Arrays.toString(result));                                   
    }
    
    static String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        int[] map = new int[26];

        // Assign row numbers
        for (char c : row1.toCharArray()) map[c - 'a'] = 1;
        for (char c : row2.toCharArray()) map[c - 'a'] = 2;
        for (char c : row3.toCharArray()) map[c - 'a'] = 3;

        List<String> result = new ArrayList<>();

        for (String word : words) {
            int row = map[Character.toLowerCase(word.charAt(0)) - 'a'];
            boolean valid = true;

            for (char c : word.toCharArray()) {
                if (map[Character.toLowerCase(c) - 'a'] != row) {
                    valid = false;
                    break;
                }
            }

            if (valid) result.add(word);
        }

        return result.toArray(new String[0]);
    }
}

