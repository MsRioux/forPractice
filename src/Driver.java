public class Driver
{
    public static void main (String[] args)
    {
        forSomething();
    }//end main method

    public static void forSomething()
    {
//        for(int i = 0; i < 8; i++)
//        {
//            System.out.print("*");
//        }

        final int MAX_ROWS = 10;
        for (int row = 1; row <= MAX_ROWS; row++)
        {
            for (int star = 1; star <= row; star++)
            {
                System.out.print("*");
            }//end inner for loop
            System.out.println();
        }//end outer for loop
    }//end method forSomething

}//end Driver class
