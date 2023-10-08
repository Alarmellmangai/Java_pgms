public class Loops
{
    public static void main (String args[])
    {
        int i=1;
        // for loop syntax (initialization;condition;inc/decr)

        for(int i=1;i<=5;i++)
        {
            System.out.print("* ");
        }


        // while loop or entry-controlled loop

        while(i<=5)
        {
            System.out.print(i);
            i++;
        }

        // do-while in this the statements under the loop will be executed atleast once after that atlast it checks the condition.
        // It is also known as exist-controlled loop.

        do{
            System.out.print(i);
            i++;
        }while(i<=5);
    }
}