package pack1.pack2;

import pack1.pack1class;

public class pack2 {

    public static void main(String[] args) {
       pack2class obj=new pack2class();
       System.out.println("Inside level 2 package:"+obj.display());
       
       pack1class obj1=new pack1class();
       System.out.println("Inside level 1 package:"+obj1.display());
    }
    
}
