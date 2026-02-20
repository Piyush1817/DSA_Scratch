package strings;

public class Output {
    public static void main(String[] args ){
        //for Arrays.toString() method 
        String[] arr = {"Java", "Python", "JavaScript"};
        System.out.println(java.util.Arrays.toString(arr)); // it will print the elements of the array in a readable format     
        System.out.println(arr);//oin output it will print the address of the array or reference of the array

        Integer num = new Integer(56);
        System.out.println(num); // it will print 56 because Integer class has overridden toString() method 
        System.out.println(num.toString()); // it will also print 56

    }
    
}
