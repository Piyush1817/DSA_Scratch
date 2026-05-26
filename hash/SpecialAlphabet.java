package hash ;
import java.util.*;

public class SpecialAlphabet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        int result = countSpecialAlphabets(s);
        System.out.println("Total number of special alphabets are : " + result);
    }
    public static int countSpecialAlphabets(String s){
        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();
        for(char c :s.toCharArray()){
            if(c>='a'&& c<='z'){
                lower.add(c);
            }
            else if(c>='A'&& c<='Z'){
                upper.add(c);
            }
        }
        int count =0;
        for(char c='a'; c<='z';c++){
            char upperChar= (char)(c-32);
            if(lower.contains(c) && upper.contains(upperChar)){
                count++;
            }
        }
        return count;
    }
}

