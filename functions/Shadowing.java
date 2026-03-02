package functions;
public class Shadowing {
   int a= 10; // instance variable    and this object depedent  
   static int x = 10; // static variable for to use in static method , this will be shadowed by local variable            
    public static void main(String[] args ){
                 //static is object indepent thing
               // System.out.println(a);  can't use because a is instance variable
               System.out.println(x); // can use because x is static variable ,this will print 10 
            //    int x=20; // local variable  this will shadow the static variable x
            //    System.out.println(x); // this will print 20

            int x;
            // System.out.println( x);//scope will begin when value is initialized
            x=20;   
            System.out.println(x); // this will print 20

                }
    void fun(){
        System.out.println(a);//here a is accessible because fun is instance method
        System.out.println(x);// static variable is accessible everywhere
    }
}
