package Bit_Manipulation;
import java.util.Scanner ;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        boolean result = isPowerOfTwo(n);
    System.out.println(n + " is a power of two: " + result);
    }
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Power of two must be positive
        }
        return (n & (n - 1)) == 0; // Check if n has only one bit set
    }
}
