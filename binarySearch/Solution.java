
package binarySearch;
class GuessGame {

    // Hidden number (simulate LeetCode pick)
    int pick = 73;

    // Simulated API
    public int guess(int num) {
        if (num > pick) return -1;
        if (num < pick) return 1;
        return 0;
    }
}

public class Solution extends GuessGame {

    public int guessNumber(int n) {

        int start = 1;
        int end = n;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int result = guess(mid);

            if (result == 0) {
                return mid;
            } 
            else if (result == -1) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int n = 100;

        int result = sol.guessNumber(n);

        System.out.println("Picked number is: " + result);
    }
}