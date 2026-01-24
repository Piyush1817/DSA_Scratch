package arrays;
import java.util.*; 
public class TwoDArrays {
    public static void main(String[] args ){
    Scanner sc =new Scanner(System.in);
   System.out.println("Enter number of rows: ");
   int r=sc.nextInt();  
    System.out.println("Enter number of columns: ");    
    int c=sc.nextInt();
    int[][] matrix = new int[r][c];
    System.out.println("Enter array elements: ");   

    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();

}
}
}
