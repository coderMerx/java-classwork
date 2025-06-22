import java.util.*;
class RemoveDup
{
    public static int[] removeDuup (int[]a)
    {
     Arrays.sort(a);
     int []b=new int [a.length];
     int x= 0;
     for (int i=0 , x=0;i<a.length-1 ;i++)
     {
        if (a [i]!=a[i+1])
        b[x++]=a[i];
     }
     b[x++]=[a.length-1];
     int[]res=new int [x];
     for (int i=0;i<res.lenght ;i++)
     {
        res[i]=b[i];

     }
     return res;

    }
    public static void main(String[]args)
    {
        int []a={8,1,3,8,1,2,4,2,7};
        System.out.println(Arrays.toString(a));
        int []res=solve(a);
        System.out.println(Arrays.toString(res));
    }
}