import java.util.Scanner;


public class Functions {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        // System.out.println("Enter two numbers:");       
        // int a=sc.nextInt();
        // int b=sc.nextInt(); 
        greet();
         sum(sc);
       
    }
    
     static void sum(Scanner sc){
       
        System.out.println("Enter two numbers:");       
        int a=sc.nextInt();
        int b=sc.nextInt(); 
        sc.close();
        int sum=a+b;
        System.out.println("The sum is: "+sum);
    }

    static void greet(){
        System.out.println("Hello, welcome to the program!");
    }

}
