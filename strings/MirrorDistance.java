package strings ;
import java.util.Scanner;

public class MirrorDistance{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int result = mirrorDistance(n);
        System.out.println("Mirror distance of the number is :"+result);

    }
    public static int mirrorDistance(int n){
        String str=Integer.toString(n);
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
            int reversed = Integer.parseInt(sb.toString());
       return Math.abs(n - reversed);
    }
}