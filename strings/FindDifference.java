package strings;
import java.util.*;
public class FindDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string: ");
        String s = sc.nextLine();   
        System.out.println("enter the second string: ");
        String t = sc.nextLine();
        char result = findTheDifference(s,t);
        System.out.println("the different character is: " + result);
        char resultXOR = findTheDifferenceXOR(s,t);
        System.out.println("the different character using XOR is: " + resultXOR);   
    }
    public static char findTheDifference(String s, String t) {

    int[] count = new int[26];

    for(char c : s.toCharArray()){
        count[c - 'a']++;
    }

    for(char c : t.toCharArray()){
        count[c - 'a']--;
    }

    for(int i = 0; i < 26; i++){
        if(count[i] != 0){
            return (char)(i + 'a');
        }
    }

    return ' ';
}

    static char findTheDifferenceXOR(String s, String t) {
        char result = 0;
        for (char c : s.toCharArray()) {
            result ^= c; // XOR with characters from the first string
        }
        for (char c : t.toCharArray()) {
            result ^= c; // XOR with characters from the second string
        }
        return result; // The remaining character is the different one
    }
}
