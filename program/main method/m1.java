class m1{
 public static void raghu(char a, boolean b)
 {
    System.out.println("hi iam raghu");
    if(b)
    System.out.println("Jupiter :"+a);
    else
    System.out.println("Mars:"+a);
    System.out.println("bye from raghu");

 }  
 public static void ram(String s)
 {
    System.out.println("hi Iam ram");
    System.out.println("i Love:"+s);
    raghu('$',false);
    System.out.println("Bye from ram");


 } 
 public static void main(String[]args)
 {
    System.out.println("hi iam Main");
    ram("sita");
    System.out.println("bye Main method");

 }
}