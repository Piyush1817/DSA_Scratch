package twoPointers;
import java.util.*;
public class MaxWater {
     public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = sc.nextInt();
        System.out.println("Enter the heights of the lines");
        int[] height = new int[n];
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }
        int maxArea = maxArea(height);
        System.out.println("Maximum area of water that can be contained: " + maxArea);
     }
        static int maxArea(int[] height){
        //max water = max area covered between any two height 
        // max area = min(start,end) * distance between two indices 
        int start = 0;
    int end = height.length - 1;
    int maxWater = 0;

    while (start < end) {
        int h = Math.min(height[start], height[end]);
        int width = end - start;
        int area = h * width;

        maxWater = Math.max(maxWater, area);

        if (height[start] < height[end]) {
            start++;
        } else {
            end--;
        }
    }

    return maxWater;
    }
        }

