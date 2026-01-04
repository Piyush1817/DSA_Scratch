
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 

import java.util.Scanner;
class Pattern2{
    public static void main(String[] args){
       Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        Pattern(n); 
        
    }
    static void Pattern(int n){
 
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}