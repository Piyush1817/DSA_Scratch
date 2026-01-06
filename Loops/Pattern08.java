//     *
//    ***
//   *****
//  *******
// *********
import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        Pattern(n);
    }
    static void Pattern(int n){
        for(int row=1;row<=n;row++){
            for (int space=1;space<n-row+1;space++){
                System.out.print(" ");
            }
            for (int star=1;star<=2*row-1;star++){
                System.out.print("*");
            }
        System.out.println();
     
    } 
} 
}

