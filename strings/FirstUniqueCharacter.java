package strings ;
import java.util.Scanner;
public class FirstUniqueCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int result = firstUniqChar(str);
        if(result != -1){   
            System.out.println("First unique character is: " + str.charAt(result)+" at index " + result );
        } else {
            System.out.println("No unique character found.");
        }
    }
    public static int firstUniqChar(String s) {
        int[] freq= new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}