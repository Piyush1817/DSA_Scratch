package strings;
 import java.util.*;


 class WordPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern: ");
        String pattern = sc.nextLine();
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        Boolean isMatch = checkWordPattern(pattern,s);
        System.out.println("Does the string follow the pattern: " + isMatch);
    }
    static boolean checkWordPattern(String pattern,String s){
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
          for(int i=0;i<pattern.length();i++){
             char c = pattern.charAt(i);
            String word = words[i];

            if(map.containsKey(c)){
                if(!map.get(c).equals(word))
                    return false;
            } 
            else{
                if(map.containsValue(word))
                    return false;

                map.put(c, word);
            }
          }return true;
        }
 }