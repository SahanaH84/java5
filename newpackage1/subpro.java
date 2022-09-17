package newpackage1;
import newpackage2.base;
public class subpro extends base {
    public static void main(String[] args) {
       int y=base.method();
       System.out.println("Inside protected method:"+y);
       //base obj=new base();
       //int m=obj.method1();
       //System.out.println("Inside default method:"+m);
       //we cannot access the default methods in another packages!!
    }    
}

