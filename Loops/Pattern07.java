

// ******
//  *****
//   ****
//    ***
//     **
//      *
import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc7.nextInt();   
        Pattern(n);
        sc7.close(); 
    }
    static void Pattern(int n ){
        for(int row=1;row<=n;row++){
         
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }

  
            for (int star = 1; star <= n - row + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
    }
}
}