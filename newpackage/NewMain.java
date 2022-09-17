package newpackage;
import java.util.Scanner;
import Converter.*;
public class NewMain {

    public static void main(String[] args) {
          int a;
          double num;
          Scanner sc=new Scanner(System.in);
          boolean x=true;
          while(x)
                  {
                      System.out.println("Enter the choice:\n1.Meter to Kilometer\n2.Kilometer to Meter\n3.Mile to Kilometer\n4.Kilometer to Mile\n5.Exit");
                      a=sc.nextInt();
                      switch(a)
                      {
                          case 1:
                          {
                             System.out.println("Enter the distance in Meter:");
                             num=sc.nextDouble();
                             MtoKm obj=new MtoKm();
                             System.out.println("Distance in Kilometer:"+obj.MtoKm(num)+"Kms");
                             break;
                          }
                          case 2:
                          {
                             System.out.println("Enter the distance in KiloMeter:");
                             num=sc.nextDouble();
                             KmtoM obj=new KmtoM();
                             System.out.println("Distance in Kilometer:"+obj.KmtoM(num)+"Ms");
                             break;
                          }
                          case 3:
                          {
                             System.out.println("Enter the distance in Miles:");
                             num=sc.nextDouble();
                             MitoKm obj=new MitoKm();
                             System.out.println("Distance in Kilometer:"+obj.MitoKm(num)+"Kms");
                             break;
                          }
                          case 4:
                          {
                             System.out.println("Enter the distance in KiloMeter:");
                             num=sc.nextDouble();
                             KmtoMi obj=new KmtoMi();
                             System.out.println("Distance in Kilometer:"+obj.KmtoMi(num)+"Miles");
                             break;
                          }
                          case 5:
                          {
                              x=false;
                              break;
                          }
                          default:
                          {
                              System.out.println("Enter correct choice!");
                              break;
                          }
                      }
                  }
    }
    
}
