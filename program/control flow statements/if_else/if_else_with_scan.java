import java.util.Scanner;
class if_else_with_scan{
    static Scanner sc = new Scanner (System.in);
    public static void main(String[]args){
        System.out.println("enter the first number");

        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        if (a < b){
            System.out.println(a+" is greater then "+b);
        }
        if (a > b){
            System.out.println(b+" is greater then "+a);
        }
        if (a == b){
            System.out.println(b+" is greater then "+a);
        }

    }
}