class hello_world{
    public static void main (String args[])
    {
        String str1="HELLO";
        String str2="WORLD";


        for(int i=0;i<str1.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println(str1.charAt(i));
        }

        for(int i=0;i<str2.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println(str2.charAt(i));
        }
    }
}