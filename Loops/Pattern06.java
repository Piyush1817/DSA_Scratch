//      *
//     **
//    ***
//   ****
//  *****
// ******
 import java.util.Scanner;
 public class Pattern6 {
     @SuppressWarnings("ConvertToTryWithResources")
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of rows: ");
         int n = sc.nextInt();
         Pattern(n);
         sc.close();
     }

     static void Pattern(int n) {
         for (int row = 1; row <=n; row++) {
             for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
             System.out.println();

             
     }
 }
 }