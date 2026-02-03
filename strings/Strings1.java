package strings;
           import java.util.*;
           public class Strings1{
            public static void main(String[] args ){
                     Scanner sc = new Scanner(System.in );
                     System.out.println("Enter your name :");
                     String name = sc.nextLine();
                     String lang = "java";
                     System.out.println("hello "+name+" welcome to this world "+lang);


                     String a ="Piyush ";
                     System.out.println(a);//this will print piyush

                     a="lakhwani";
                        System.out.println(a);//this will print lakhwani

                        //above we are not chnaging the string 
                        // but we are declaring new or can be said that 
                        // 'a' will point to lakhwani rather thann piyush after declaring it again .

            }
           }