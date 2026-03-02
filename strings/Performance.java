package strings;
public class Performance{
    public static void main (String[] args ){
        String series = "";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            System.out.println(ch);
            series +=ch; // this will create a new string object every time we concatenate a character to the series string, which is inefficient and can lead to performance issues when we have a large number of concatenations
        }
        System.out.println(series); // it will print the series of characters from a to z

        //everytime series will point new object and old object will be garbage collected, this is because strings are immutable in java, we cannot change the value of a string once it is created, so every time we concatenate a character to the series string, a new string object is created and the old object is discarded and eventually garbage collected by the JVM
        // O(n) time complexity for each concatenation, so overall O(n^2) time complexity for the entire loop, which is inefficient for large values of n
             
        //only solution to this is to use string builder class, which is mutable and allows us to modify the string without creating new objects, it has an internal buffer that can grow as needed, so we can append characters to the string builder without worrying about performance issues
        
         

    }

}