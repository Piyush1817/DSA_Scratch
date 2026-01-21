package arrays;
import java.util.Scanner;

public class LeetCode_2 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();    

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }   

        System.out.print("Array entered: ");
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = TwoSum(nums, target);    

        System.out.println("Result indices:");
        System.out.println(result[0] + " " + result[1]);
    }

    static int[] TwoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
