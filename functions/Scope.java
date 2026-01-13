public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
           // int a=78;  // a is already defined in this scope(global scope for this block) so cant initialize it again
            int c = 99; // c is defined in this inner block scope
            System.out.println("Inner block:");
            System.out.println(a);  // can access a because it is defined in outer block
            a=100;  // can modify a because it is defined in outer block
        }
        System.out.println(a);//will print 100 because a was modified in the inner block
        // System.out.println(c);//error because c is defined inside the block so it cant be used outside the block
    }  
    static void num(){
        int num=10;  // this is called function scope variable can be accessed in this function only, and same for arguments
        System.out.println(num);
    }
    static void swap(int a,int b){  // a and b are parameters, they are function scope variables
        int temp=a;
        a=b;
        b=temp;

        //this swapping will be done only in this function not in main function
    }
}

