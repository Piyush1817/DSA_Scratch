package hash;
import java.util.*;
public class IsomorphicString {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s =sc.nextLine();
        System.out.println("Enter the second string: ");
        String t=sc.nextLine();
        Boolean isIsomorphic = checkIsomorphism(s,t);
        System.out.println("Are the strings isomorphic? " + isIsomorphic);
    }
    static boolean  checkIsomorphism(String s, String t){
        if(s.length() !=t.length()){
            return false ;
        }
      
         HashMap<Character,Character> map = new HashMap<>();
          for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map.containsKey(c1)){
                if(map.get(c1) != c2){
                    return false;
                }
            }else{
                if(map.containsValue(c2)){
                    return false;
                }
                map.put(c1, c2);
            }
      
  return true;
    } return true;      }
}           
       

