//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//*


import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: "); 
        int n = sc.nextInt();
        sc.close();
        Pattern(n);
    }
    static void Pattern(int n){
        for(int row=1;row<2*n;row++){
            int totalColsInRow = row > n ? 2 * n - row : row;
           int  noOfSpaces = n - totalColsInRow;
            

            for(int space=0;space<noOfSpaces;space++){
                System.out.print(" ");
            }
            for(int star=0;star<totalColsInRow;star++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
            
    }
}
        