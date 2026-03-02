package strings;
import java.util.*;

public class Methods {
    public static void main(String[] args) {
        String name = "Piyush Lakhwani";
        System.out.println(Arrays.toString(name.toCharArray()));//toCharArray method converts string into char array
        System.out.println(name.toString());//toString method returns the string itself
        System.out.println(name.toUpperCase());//it will creste a new string , not chnaging the original one 
          System.out.println(name.indexOf("l"));//return index of char at first occurenece 
          System.out.println(name.strip());//strip method removes leading and trailing spaces from the string
          System.out.println(name.substring(0,6));//substring method returns a new string that is
          System.out.println(Arrays.toString(name.split(" ")));//split method splits the string into an array of substrings based on the specified delimiter (in this case, a space)     
    }
}
