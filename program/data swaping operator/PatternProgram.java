public class PatternProgram
{
    public static final String RED = "\u001D[31m";
    public static void main(String[]args)
    {  
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==0||i==n-1||j==n-1)
                {
                System.out.print("* ");
                }
                else
                System.out.print("  ");
            }
            System.out.print("\t");
            for(int j=0;j<n;j++)
            {
                if(i==0||j==0||i==n-1||j==n-1)
                {
                System.out.print(RED+"* ");
                }
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}