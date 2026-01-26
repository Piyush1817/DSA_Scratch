package arrays;
public class PassingValues {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println("Before modifying array: "+java.util.Arrays.toString(arr));
        modifyArray(arr);
        System.out.println("After modifying array: "+java.util.Arrays.toString(arr));
    }    
    static void modifyArray(int[] array){
        array[0] = 99;
    }
}
