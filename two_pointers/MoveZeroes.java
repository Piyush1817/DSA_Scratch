package two_pointers;
import java.util.*;
public class MoveZeroes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println(    "Enter the elements of the array: ");
        int[] arr = new int[n];         
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }       
        moveZeroes(arr);
        System.out.println("Array after moving zeroes: " + Arrays.toString(arr));   
        
    }
    static void moveZeroes(int[] arr){
        int j =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }}
            while(j<arr.length){
                arr[j]=0;
                j++;
            }
        
    }
}