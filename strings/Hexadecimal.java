package strings;
import java.util.Scanner;
public class Hexadecimal {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        String result = toHexadecimal(n);
        System.out.println("Hexadecimal representation of the number is :"+result);
    }
    public static String toHexadecimal(int num ){
        if(num == 0) return "0";

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();

        while(num != 0){
            int digit = num & 15; // get last 4 bits
            result.append(hex[digit]);
            num >>>= 4; // unsigned right shift
        }

        return result.reverse().toString();
    }
}
