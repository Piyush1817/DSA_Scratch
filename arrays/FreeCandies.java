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