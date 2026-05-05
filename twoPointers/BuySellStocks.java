package twoPointers;
import java.util.Scanner;
public class BuySellStocks {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int n = sc.nextInt();
        System.out.println("Enter the stock prices for " + n + " days"  );
        int[] prices = new int[n];
        for(int i = 0; i < n; i++){ 
            prices[i] = sc.nextInt();
        }
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
    public static int maxProfit(int[] prices){
        int buy=0;
        int sell=1;
        int maxProfit=0;
        while(sell<prices.length){
            if(prices[buy]<prices[sell]){
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy=sell;
            }            sell++;
        }
        return maxProfit;

    }
}
