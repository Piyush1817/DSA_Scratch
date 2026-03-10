package strings;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        System.out.println("original character array: " + Arrays.toString(arr));
        reverseString(arr); 
    }
    static void reverseString(char[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed string: " + new String(arr));
        System.out.println("reversed character array: " + Arrays.toString(arr));
    }
}
