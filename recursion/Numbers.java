package recursion;
import java.util.*;
public class Numbers{

    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);   
      int n = sc.nextInt();

        printNumbers(n);
    }

    static void printNumbers(int n){

        if(n == 0){
            return;
        }

        printNumbers(n - 1);

        System.out.print(n + " ");
    }
}
    

