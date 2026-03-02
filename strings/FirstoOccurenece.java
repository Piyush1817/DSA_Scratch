package strings;
import java.util.*;
public class FirstoOccurenece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main  string: ");   
        String mainString = sc.nextLine();
        System.out.println("Enter the substring to find: ");        
        String subString = sc.nextLine();
        int index = firstOccurenceDirectly(mainString, subString);
        System.out.println("The first occurrence of \"" + subString + "\" in \"" + mainString + "\" is at index: " + index  );
        
    }
    static int firstOccurenceDirectly(String mainString,String subString){    
            return    mainString.indexOf(subString);
    }
}
