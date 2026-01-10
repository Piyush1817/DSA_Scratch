import java.util.Scanner;
public class parameter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String naam =sc.next();
        String greet=greetuser(naam);
        System.out.println(greet);


        String name="kush sharma";
        chnageName(name);
        System.out.println(name);
    }
    static String greetuser(String naam){
        String message="Hello "+naam+" , have a good day!";
        return message;
    }
    static void chnageName(String naam1){
        naam1="raj soni";  //creating new object sdo original name will not change
    }
}
