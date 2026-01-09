import java.util.Scanner;
public class parameter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String naam =sc.next();
        String greet=greetuser(naam);
        System.out.println(greet);
    }
    static String greetuser(String naam){
        String message="Hello "+naam+" , have a good day!";
        return message;
    }
}
