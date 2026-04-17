package brute;

import java.util.Scanner;

public class NoofOnes{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENter a number ");
    int n= sc.nextInt();
    int count = numberOfOnes(n);
    System.out.println("Number of ones in binary of the number is :"+count);
    int count2 = withoutConvertingBinary(n);
    System.out.println("Number of ones without converting to binary :"+ count2);
}

   public static int numberOfOnes(int n){
    String binary = Integer.toBinaryString(n);
    int count=0;
    for(int i=0; i<binary.length();i++){
        if(binary.charAt(i)=='1'){
            count++;
        }
    }
    return count ;
   }

   public static int withoutConvertingBinary(int n ){
    int count = 0;
    while(n>0){
        if(n%2==1){
            count++;
        }
        n=n/2;
    }
    return count ;
   }
}
