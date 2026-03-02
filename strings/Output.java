package strings;
import java.net.Socket;
import java.util.*;

import arrays.Array;

public class Output {
    public static void main(String[] args ){
        //for Arrays.toString() method 
        String[] arr = {"Java", "Python", "JavaScript"};
        System.out.println(java.util.Arrays.toString(arr)); // it will print the elements of the array in a readable format     
        System.out.println(arr);//oin output it will print the address of the array or reference of the array

        Integer num = new Integer(56); //this is wrapper class for int primitive type, we cant directly use int primitive for to string method 
    Integer num2 = 56; // autoboxing, it will automatically convert int primitive to Integer object 
        System.out.println(num); // it will print 56 because Integer class has overridden toString() method 
        System.out.println(num.toString()); // it will also print 56
               float pi=22/7f; // we need to use f to indicate that it's a float literal, otherwise it will be treated as double
        System.out.println(pi); // it will print 3.142857 because 22/7f is a float division and it will give us a float result
        
        //PRETTY PRINTING 
        
        System.out.printf("Value of pi: %.2f", pi); // it will print Value of pi: 3.14 because we are formatting the output to 2 decimal places using printf method
         System.out.printf("value of pi: %.3f",Math.PI);

         System.out.printf("hello my name is %s and i am %d years old", "John", 25); // it will print hello my name is John and i am 25 years old, we are using %s for string and %d for integer in printf method    
              

          System.out.println('a'+'b'); // outputwill be 195
          System.out.println("a"+"b"); // output will be "ab"
          System.out.println('a'+3);// output will be 100
           System.out.println((char)('a'+3)); // output will be 'd'
           System.out.println('a'+"b");// output will be "a"+"b" = "ab" because when we add a char and a string, the char will be converted to a string and then concatenated with the other string
           

           System.out.println("kunal"+new ArrayList<>()); // output will be "kunal[]" 
           System.out.println("kunal"+new Integer(565));//output will be kunal565 

           //System.out.println(new ArrayList<>()+new Integer(56)); this is will give us error because + operator is only define for primitives or any of two operand should be of string type 
        }
    
}
