import java.util.Scanner;
import java.util.Arrays;
class add_array{
    static Scanner sc=new Scanner(System.in);
    public static void main (String[]args){
        System.out.print("\t\t\tEnter the size of an array: ");
        int size=sc.nextInt();
        int[]a =new int[size];
        //Initializeing an arrys
        int sum =0;
        for (int i =0;i<a.length;i++){
            System.out.print("Enter the elements: ");
            a[i] =sc.nextInt();
            sum=sum+a[i];

        }
        System.out.println(Arrays.toString(a));
        System.out.println("arry Elements Sum:"+sum);
    }
}

