package strings ;
import java.util.Scanner;

public class MirrorDistance{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int result = mirrorDistance(n);
        System.out.println("Mirror distance of the number is :"+result);
        int result = mirrorDistance2(n);    
        System.out.println("Mirror distance of the number is :"+result);    

    }
    public static int mirrorDistance(int n){
        String str=Integer.toString(n);
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
            int reversed = Integer.parseInt(sb.toString());
       return Math.abs(n - reversed);
    }
    public static int mirrorDistance2(int n){
        int temp = n;
        int rev = 0;

        while(temp > 0){
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }

        return Math.abs(n - rev);
    }
}