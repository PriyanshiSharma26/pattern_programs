public class _32_sq_pattern {

    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==1||j==1||i==5||j==5)
                {
                    System.out.print("1 ");
                }
                else if(i==2||j==2||j==4||i==4)
                {
                    System.out.print("2 ");
                }
                else
                {
                    System.out.print("3 ");
                }
            }
            System.out.println();
        }
    }
    
}
