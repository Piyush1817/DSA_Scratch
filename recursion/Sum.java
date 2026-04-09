package recursion;
import java.util.*;
public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("Sum of numbers from 1 to " + n + ": " + result);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
}
