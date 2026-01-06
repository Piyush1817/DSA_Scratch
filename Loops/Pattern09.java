import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        Pattern(n);
    }
    static void Pattern(int n){
        for(int row=1;row<=n;row++){
            for (int space=1;space<row;space++){
                System.out.print(" ");
            }
            int numStars = 2 * (n - row) + 1;
            for (int star=1;star<=numStars;star++){
                System.out.print("*");
            }
        System.out.println();
     
    } 
} 
}

