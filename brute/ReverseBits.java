package brute;  

import java.util.Scanner;

public class ReverseBits{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int result = reverseBits(n);
        System.out.println("Number after reversing the bits of original number is :"+result);
    }
    public static int reverseBits(int n ){

        String binary = Integer.toBinaryString(n);

        // Make sure it is 32 bits
        while(binary.length() < 32){
            binary = "0" + binary;
        }

        char[] arr = binary.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        String reversedBinary = new String(arr);

        return (int)Long.parseLong(reversedBinary, 2);
    }
    
}