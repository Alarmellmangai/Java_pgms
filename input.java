import java.util.Scanner;
public class input
{
    public static void main(String args[])
    {
        Scanner Scanner=new Scanner(System.in);
        System.out.print("what is your name: ");
        String name=Scanner.nextLine();
        System.out.println("hello "+ name);

    }
}