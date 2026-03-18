package strings;
import java.util.*;
public class Base7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        String base7 = convertToBase7(num);
        System.out.println("the base 7 representation of " + num + " is: " + base7);
    }
    public static String convertToBase7(int num) {
        if (num == 0) return "0";
        boolean isNegative = num < 0;
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (isNegative) sb.append("-");
        return sb.reverse().toString();
    }   
}
