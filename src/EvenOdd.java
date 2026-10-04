public class EvenOdd
{
    static void main()
    {
        int numToExamine = 2;

        if(numToExamine % 2 == 0)
        {
            IO.println(numToExamine + " is even.");
        }
        else
        {
            IO.println(numToExamine + " is odd.");
        }
    }
}