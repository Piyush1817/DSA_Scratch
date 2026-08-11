package arrays;

import java.util.HashSet;
import java.util.Scanner;


public class SmallestMissingSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(smallestMissing(arr));

        sc.close();
    }

    public static int smallestMissing(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                sum += arr[i];
            } else {
                break;
            }
        }

        // Store all numbers for O(1) lookup
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        // Find smallest missing number >= sum
        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}