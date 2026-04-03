package strings;
import java.util.*;
public class Segments {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        int result = countSegments(s);
        System.out.println("The number of segments in the string is: " + result);
            int result2 = countSegments2(s);    
        System.out.println("The number of segments in the string is: " + result2);
        int result3 = countSegments3(s);
        System.out.println("The number of segments in the string is: " + result3);  
    }

    public static int countSegments(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        String[] segments = s.trim().split("\\s+");
        return segments.length;
    }
    public static int countSegments2(String s){
        if(s==null||s.length()==0) return 0;
        int count=0;
       String[] arr = s.split(" ");
        

        for (String str : arr) {
            if (!str.equals("")) {
                count++;
            }
        }

        return count;
    }

    public static int countSegments3(String s){
      int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' ')){
                count++;
            }
        }

        return count;
    }

      

}
