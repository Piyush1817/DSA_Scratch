// A shop is selling candies at a discount. For every two candies sold, the shop gives a third candy for free.

// The customer can choose any candy to take away for free as long as the cost of the chosen candy is less than or equal to the minimum cost of the two candies bought.

// For example, if there are 4 candies with costs 1, 2, 3, and 4, and the customer buys candies with costs 2 and 3, they can take the candy with cost 1 for free, but not the candy with cost 4.
// Given a 0-indexed integer array cost, where cost[i] denotes the cost of the ith candy, return the minimum cost of buying all the candies.

 

// Example 1:

// Input: cost = [1,2,3]
// Output: 5
// Explanation: We buy the candies with costs 2 and 3, and take the candy with cost 1 for free.
// The total cost of buying all candies is 2 + 3 = 5. This is the only way we can buy the candies.
// Note that we cannot buy candies with costs 1 and 3, and then take the candy with cost 2 for free.
// The cost of the free candy has to be less than or equal to the minimum cost of the purchased candies.
// Example 2:

// Input: cost = [6,5,7,9,2,2]
// Output: 23
// Explanation: The way in which we can get the minimum cost is described below:
// - Buy candies with costs 9 and 7
// - Take the candy with cost 6 for free
// - We buy candies with costs 5 and 2
// - Take the last remaining candy with cost 2 for free
// Hence, the minimum cost to buy all candies is 9 + 7 + 5 + 2 = 23.

package arrays ;
import java.util.*;

public class FreeCandies{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of candies: ");
        int t =sc.nextInt();
        int[] candies = new int[t];
        System.out.println("Enter the price of each candy: ");
        for(int i=0; i<t; i++){
            candies[i] = sc.nextInt();
        }
        int cost = freeCandies(candies);
        System.out.println("The totalcost of the candies to get free candies is: " + cost);
    }
    public static int freeCandies(int[] candies){

        Arrays.sort(candies);

        int ans = 0;
        int count = 0;

        // traverse from largest to smallest
        for (int i = candies.length - 1; i >= 0; i--) {

            count++;

            // every 3rd candy is free
            if (count == 3) {
                count = 0;
                continue;
            }

            ans += candies[i];
        }

        return ans;
    }
}