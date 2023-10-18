// -----program to get a name from user-----

import java.util.Scanner;
public class input
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       /*System.out.print("what is your name: ");
        String name=sc.nextLine();
        System.out.println("hello "+ name); */

        System.out.println("Enter the name");
        String name=sc.next();
    
        System.out.println("Name :"+ name);
        

        /*
        System.out.println("Enter the number 1");
        int a = sc.nextInt();
         System.out.println("Enter the number 2");
        int b = sc.nextInt();
        
        int sum = a+b;
        System.out.println("The sum is :"+ sum);
        */


    }
}