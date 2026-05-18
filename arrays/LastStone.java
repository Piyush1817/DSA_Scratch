package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LastStone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        LastStone ls = new LastStone();
        int result = ls.lastStoneWeight(arr);
        System.out.println("last stone weight: " + result);
        int result2 = ls.lastStoneWeight2(arr);
        System.out.println("last stone weight (alternative method): " + result2);

        int result3 = ls.lastStoneWeight3(arr);
        System.out.println("last stone weight (using max heap): " + result3);   

    }

    public static int lastStoneWeight(int[] stones ){
        int n = stones.length;

        while (n > 1) {
            Arrays.sort(stones, 0, n);
            int x = stones[n - 1];
            int y = stones[n - 2];

            if (x == y) {
                n -= 2;
            } else {
                stones[n - 2] = x - y;
                n--;
            }
        }

        return n == 1 ? stones[0] : 0;
    }

    public static int lastStoneWeight2(int[] stones) {

        // using list to store the stones
        List<Integer> list = new ArrayList<>();

        // Put all stones into list
        for (int stone : stones) {
            list.add(stone);
        }

        // Repeat until one or no stone left
        while (list.size() > 1) {

            // Sort the list
            Collections.sort(list);

            // Take two largest elements
            int y = list.get(list.size() - 1); // largest
            int x = list.get(list.size() - 2); // second largest

            // Remove them
            list.remove(list.size() - 1);
            list.remove(list.size() - 1);

            // If not equal, insert difference
            if (x != y) {
                list.add(y - x);
            }
        }

        // Return remaining stone or 0
        return list.size() == 0 ? 0 : list.get(0);
    }

     public static int lastStoneWeight3(int[] stones) {
        // Using a max heap (priority queue) to store the stones
         PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones into heap
        for (int stone : stones) {
            pq.add(stone);
        }

        // Run until one or no stone remains
        while (pq.size() > 1) {

            int y = pq.poll(); // largest
            int x = pq.poll(); // second largest

            // If both are not equal
            if (x != y) {
                pq.add(y - x);
            }
        }

        // If heap empty return 0
        return pq.isEmpty() ? 0 : pq.poll();
     }

}