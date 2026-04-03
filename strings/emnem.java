package strings;
import java.util.*;
public class emnem {
    public static void main(String[] args) {
        String s="MY NAME IS PIYUSH ";
        String[] arr=s.split(" ");
        System.out.println(Arrays.toString(arr));
        for(String words : arr){
            StringBuilder sb=new StringBuilder(words);
            sb.reverse();
            System.out.print(sb+" ");
        }   
    }
}
