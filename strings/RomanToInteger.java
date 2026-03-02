package strings ;
import java.util.*;

public class RomanToInteger{
    public static void main(String[] args ){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();
        int result = romanToInt(roman);
        System.out.println("The integer value of " + roman + " is: " + result);
        sc.close();
    }
    static int romanToInt(String roman ){
     int integer =0;
     for(int i=0; i<roman.length(); i++){
        int current = value(roman.charAt(i));
        if(i<roman.length()-1){
            int next = value(roman.charAt(i+1));
            if(current < next){
                integer -= current;
            } else {
                integer += current;
            }
        } else {
            integer += current;
        }   
     }
     
return integer;
    }

    static int value(char r){
        switch(r){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}