import java.util.Arrays;

public class VarArgs {
   public static void main(String[] args) {
        numbers(1,2,3,4,5,6,78,8,7,6,4);
        multiple(1,3,"piyush","raj","kush");
    }
    static void numbers(int... nums){
        System.out.println(Arrays.toString(nums));
    }
    static void  multiple(int a,int b,String...v)//var args must be the last parameter
    {
        System.out.println(a+" "+b+" "+Arrays.toString(v));
        
    }
}
 