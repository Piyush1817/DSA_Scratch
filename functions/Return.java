package functions;
import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = product(sc);
        sc.close();
    
        System.out.println("The product is: " + result);
        System.out.println(getGreeting());
    }

     static int product(Scanner sc   ){
        System.out.println("Enter two numbers for multiplication:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        return a*b;
    }
    static String getGreeting(){
        return "Hello, welcome to the multiplication program!";
    }   

}
