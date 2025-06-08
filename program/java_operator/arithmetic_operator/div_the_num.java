import java.util.Scanner;
class div_the_num
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("enter the first num");
        float a = sc.nextInt();
        System.out.println("Enter the second num");
        float b = sc.nextInt();
        float c = a / b;
        System.out.println("Answer :"+c);

    }
}