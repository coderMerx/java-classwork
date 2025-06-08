class new1
{
    public static void main(String[] args) throws Exception
    {
        for (int i=0; i<4; i++ )
        {
            for (int j=0; j<3; j++ )
            {
                if(i==0)
                    System.out.print("* ");
                else
                    System.out.print(" ");

                Thread.sleep(50);
            }
            System.out.println();
        }
    }
}
