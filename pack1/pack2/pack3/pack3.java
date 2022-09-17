package pack1.pack2.pack3;
import pack1.pack1class;
import pack1.pack2.pack2class;

public class pack3 {
    public static void main(String[] args) {
        pack3class obj=new pack3class();
        System.out.println("Inside level 3 package:"+obj.display());
        pack2class obj1=new pack2class();
        System.out.println("Inside level 2 package:"+obj1.display());
        pack1class obj2=new pack1class();
        System.out.println("Inside level 1 package:"+obj2.display());
    }
    
}
