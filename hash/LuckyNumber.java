package hash;
import java.util.*;
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n = sc.nextInt();   
        System.out.println("enter the elements in array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int luckyNumber = findLucky(arr);
        System.out.println("the lucky number is: " + luckyNumber);
        int luckyNumber2 = findLucky2(arr); 
        System.out.println("the lucky number using second method is: " + luckyNumber2); 
    }
    static int findLucky(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int luckyNumber = -1;

        // Check for lucky numbers
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (num == count) {
                luckyNumber = Math.max(luckyNumber, num);
            }
        }

        return luckyNumber;
    }
    static int findLucky2(int[] arr) {
          int[] freq = new int[501]; // constraint: values ≤ 500

        // Step 1: count frequency
        for (int num : arr) {
            freq[num]++;
        }

        int maxLucky = -1;

        // Step 2: check lucky numbers
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == i) {
                maxLucky = i; // keep updating to get largest
            }
        }

        return maxLucky;
    }
}
