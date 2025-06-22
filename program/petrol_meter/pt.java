import java.util.*;
class pt{
    static Scanner sc=new Scanner (System.in);
    public static int a_value(){
         System.out.println("today petrol price :");
         int a = sc.nextInt();
     return a;
    }

    
   
    public static int b_value(){
         System.out.println("bike avg millage :");
         int b = sc.nextInt();
    return b;
    }
    
    public static int c_value(){
         System.out.println("total distance to travel :");
         int c = sc.nextInt();
    return c;
    }
    
    public static int d_value(){
         System.out.println("what is the avg speed :");
         int d = sc.nextInt();
    return d;
    }
    
     public static void main(String[]args){
        int a = a_value();
        int b = b_value();
        int c = c_value();
        int d = d_value();
        
        int g = c/b ;
        int e = (c/b)*a;
        int f = c / d ;
        System.out.println("-------------");
        System.out.print("Price Usage : " +e);
        System.out.print(" Rs");
        System.out.println(" ");
        System.out.println("-------------");
        System.out.print("total time to travel : " +f);
        System.out.print(" hours");
         System.out.println(" ");
        System.out.println("-------------");
        System.out.print("total of : " +g);
        System.out.print("  Liters of Petrol");


        
    }

    

}
