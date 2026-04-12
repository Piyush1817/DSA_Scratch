package binarySearch;

import java.util.Scanner;

public class ArrangeCoins{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coins: ");
        int n = sc.nextInt();

        int stairs= arrangeCoins(n);
        System.out.println("Number of complete stairs: " + stairs);
    }
    public static int arrangeCoins(int n){
        int start = 0;
        int end = n;

        while(start <= end){
            long mid = start + (end - start) / 2;
            long coinsRequired = mid * (mid + 1) / 2;

            if(coinsRequired == n){
                return (int) mid; // Found exact number of coins
            } else if(coinsRequired < n){
                start = (int) mid + 1; // Search in the right half
            } else {
                end = (int) mid - 1; // Search in the left half
            }
        }

        return end; // 'end' will be the largest complete stair count
    }
}