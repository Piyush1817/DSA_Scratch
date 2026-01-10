
import java.util.Arrays;

class changeValue{
    public static void main(String[] args){
int[] arr={1,2,3,4,5};
        change(arr);
        
    //    System.out.println("After changing the array:");
    //    for(int i:arr){
    //         System.out.print(i+" ");
    //     }
    System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99;  //if you make a change via this reference variable,same object will be changed 

    }
}