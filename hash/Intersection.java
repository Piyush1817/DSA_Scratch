// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.

package hash;
import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of first array: ");
        int n =sc.nextInt();
        int[] nums1=new int[n];
        System.out.println("enter the elements of first array: ");
            for(int i=0;i<n;i++){
                nums1[i]=sc.nextInt();
            }
            System.out.println("enter the size of second array: ");
        int m =sc.nextInt();
        int[] nums2=new int[m];
        System.out.println("enter the elements of second array: ");
            for(int i=0;i<m;i++){
                nums2[i]=sc.nextInt();
            }
            int[] result=intersection(nums1,nums2);
            System.out.println("intersection of two arrays: " + Arrays.toString(result));
            // System.out.println("intersection of two arrays: " + Arrays.toString(result));

    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }
        return result;
    }
    
}
