package hash;



import java.util.*;
public class DoubleExists{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){ 
            arr[i] = sc.nextInt();
        }
        boolean result = doubleExists(arr);
        System.out.println("Result: " + result);
    }
    public static boolean doubleExists(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num*2) || (num%2==0 && set.contains(num/2))){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}