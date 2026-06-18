package arrays;

import java.util.*;

class MinCommonValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of first array: ");
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of second array: ");
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }
        int result = minCommonValue(arr1, arr2);
        if(result != -1){
            System.out.println("Minimum common value: " + result);
        } else {
            System.out.println("No common value found.");
        }

        int res = minCommonValue2(arr1, arr2);
        if(res != -1){
            System.out.println("Minimum common value (using HashSet): " + res);
        } else {
            System.out.println("No common value found (using HashSet).");
        }
    }
    public static int minCommonValue(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                return arr1[i];
            } else if(arr1[i] < arr2[j]){
                i++;
            } else {
                j++;
            }
        }
        return -1;
    }
    public static int minCommonValue2(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        // Store all elements of nums1
        for (int num : arr1) {
            set.add(num);
        }

        // Check nums2 elements
        for (int num : arr2) {

            if (set.contains(num)) {
                return num;
            }
        }

        return -1;
    }
}