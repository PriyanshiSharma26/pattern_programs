public class _14_hollow_triangle {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=i;j<=4;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                if(k==1||k==i||i==4)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
        
            }
            System.out.println();
        }
    }
    
}
