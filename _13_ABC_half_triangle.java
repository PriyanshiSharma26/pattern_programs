public class _13_ABC_half_triangle {
    public static void main(String[] args) {
        char rows='D';
        for(char i='A';i<=rows;i++)
        {
            for(char j='A';j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
