package functions;
import java.util.*;

public class Overloading {
    public static void main(String[] args) {
        idk(67);
       idk("Piyush");
       idk(5,876543);
    }
    static void idk(int a){
        System.out.println("This is integer method "+a);
    }
    static void idk(String a){
        System.out.println("This is string method "+a);
    }
    static int idk(int a,int b){
        return a+b;
    }
    static void idk(int...v){
        System.out.println(Arrays.toString(v));
    }

 
}
