package strings;
import java.util.*;
public class ValidParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of parentheses: ");
        String s = sc.nextLine();
        boolean isValid = isValidParentheses(s);
        
        sc.close();
    }
   static boolean isValidParentheses(String s){
    Stack<Character> stack = new Stack<>();
    for(char c : s.toCharArray()){
        if(c == '(' || c == '{' || c == '['){
            stack.push(c);
        } else {
            if(stack.isEmpty()){
                System.out.println("The parentheses are not valid.");
                return false;
            }
            char top = stack.pop();
            if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')){
                System.out.println("The parentheses are not valid.");
                return false;
            }
        }
    }
    if(stack.isEmpty()){
        System.out.println("The parentheses are valid.");
        return true;
    } else {
        System.out.println("The parentheses are not valid.");
        return false;
    }
   }
    
}
