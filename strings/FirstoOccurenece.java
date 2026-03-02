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
        
        int index2 = firstOccurenceManually(mainString, subString);
        System.out.println("The first occurrence of \"" + subString + "\" in \"" + mainString + "\" using manual method is at index: " + index2  );
        sc.close();
    }
    static int firstOccurenceDirectly(String mainString,String subString){    
            return    mainString.indexOf(subString);
    }

    static int firstOccurenceManually(String mainString,String subString){
        int mainLength = mainString.length();
        int subLength = subString.length();
        
        for(int i=0; i<=mainLength - subLength; i++){
            int j;
            for(j=0; j<subLength; j++){
                if(mainString.charAt(i+j) != subString.charAt(j)){
                    break;
                }
            }
            if(j == subLength){
                return i; // Found the substring at index i
            }
        }
        return -1; // Substring not found
    }
}
