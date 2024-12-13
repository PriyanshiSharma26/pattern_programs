class Triangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=5;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++)
            {
                if(i==1||j==5||i==j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
