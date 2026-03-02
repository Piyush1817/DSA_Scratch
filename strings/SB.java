package strings;

public class SB {
    public static void main(String[] args ){
         StringBuilder sb = new StringBuilder();
         for(int i=0; i<26; i++){
             char ch = (char)('a' + i);
             sb.append(ch);
         }
         System.out.println(sb);//string builder class has a toString method which is called when we print the string builder object
         System.out.println(sb.toString());//converted string builder into string 

         sb.deleteCharAt(0);
    }
}
