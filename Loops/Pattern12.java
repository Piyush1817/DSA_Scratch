import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args ){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        sc.close();
        Pattern(n);
    }
    static void Pattern(int n){
        for(int row=1;row<=2*n;row++){
               int c=row > n ? 2 * n - row : row;
               int space=n-c;
            for(int spaces =1;spaces<=space;spaces++){
                System.out.print(" ");
              }
              for(int col=c;col>=1;col--){
                  System.out.print(col);
              }
              for(int col=2;col<=c;col++){
                  System.out.print(col);
                }


                System.out.println();
        }
    }
}


