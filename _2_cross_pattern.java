package pattern;

public class _2_cross_pattern {
    public static void main(String[] args) {
    

    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i==j||i+j==6)
            {
                System.out.print(i+" ");
            }
            else{
                System.err.print(" ");
            }
        }
        System.out.println();
    }
    
}
}
