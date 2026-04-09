package recursion;
import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial: " + result);
    }

    static int factorial(int n) {
       if (n==0){
        return 1;
       }
       return n*factorial(n-1);
    }

}
