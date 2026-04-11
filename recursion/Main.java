package recursion;
import java.util.*;

public class Main {

    static void subseq(int[] arr, int i, List<Integer> list, int sum, int k){

        if(i == arr.length){

            if(sum == k){
                System.out.println(list);
            }
            return;
        }

        // include element
        list.add(arr[i]);
        subseq(arr, i+1, list, sum + arr[i], k);

        // backtrack
        list.remove(list.size()-1);

        // exclude element
        subseq(arr, i+1, list, sum, k);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");  
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        } 
        System.out.println("Enter the target sum: ");
        int k = sc.nextInt();   
        subseq(arr,0,new ArrayList<>(),0,k);
    }
}