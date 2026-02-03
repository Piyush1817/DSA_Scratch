package strings;

public class Comparison {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        // Using '==' operator
        
        System.out.println("str1 == str2: " + (str1 == str2)); // true, same reference
        System.out.println("str1 == str3: " + (str1 == str3)); // false, different references

        // Using 'equals()' method
        System.out.println("\nUsing 'equals()':");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true, same content
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true, same content

        // Using 'compareTo()' method
        System.out.println("\nUsing 'compareTo()':");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0, same content
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3)); // 0, same content


        //when you need to check by values , use .equals() or compareTo()
        //and when you need to check reference use '=='
    }
}

