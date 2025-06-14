import java.util.*;
class BuyingAndSellingStock{
    public static double maximizeProfit1(int[]a)
    {
        double maximum=0;
        for (int i=0;i<a.length-1; i++)
        {
            double profit =a [j]-a[i];
            maximum=Math.max(profit,maximum);
        }
    }
    return maximum;
}
public static void main(String[]args)
{
    int []a={7,1,5,3,6,4};
    System.out.println(Arrays.toStriing(a));
    System.out.println("Maximum Profit")
}
