        package strings;
import java.util.*; 
public class SameChar{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first string: ");
    String s = sc.nextLine();
    System.out.println("Enter the second string: ");
    String t = sc.nextLine();
    Boolean isSameChar = checkSameChar(s,t);
    System.out.println("Do the strings have the same characters: " + isSameChar);
}
static boolean checkSameChar(String s,String t){
    if(s.length()!=t.length()){
        return false;
    }
    char[] a=s.toCharArray();
    char[] b=t.toCharArray();
    Arrays.sort(a); 
    Arrays.sort(b);
    return Arrays.equals(a,b); // this will return true if the sorted character arrays are equal, which means that the two strings have the same characters, regardless of their order. If the sorted character arrays are not equal, it will return false, indicating that the two strings do not have the same characters.

}
}