package brute;

import java.util.Scanner;

public class NoofOnes{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENter a number ");
    int n= sc.nextInt();
    int count = numberOfOnes(n);
    System.out.println("Number of ones in binary of the number is :"+count);
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
}
