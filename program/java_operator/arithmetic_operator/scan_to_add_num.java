import java.util.Scanner;
class scan_to_add_num
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("enter the first num");
        int a = sc.nextInt();
        System.out.println("Enter the second num");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Answer :"+c);

    }
}