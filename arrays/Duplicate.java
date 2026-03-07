package arrays;
import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Boolean hasDuplicate = checkDuplicate(arr);
       System.out.println("Does the array contain duplicates? " + hasDuplicate);
    }
    static Boolean checkDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return true; // Duplicate found
            }
            set.add(num);
        }
        return false; // No duplicates found
    }
}
