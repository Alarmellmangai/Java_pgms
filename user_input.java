import java.util.Scanner;
// import java.io.IOException;
// import java.io.BufferedReader;
//Note: ascii value for 0 is 48

public class user_input {
    // public static void main(String[] args) throws IOException {
    // Scanner scanner  = new Scanner(System.in);
    // System.out.println("Enter username: ");

    // String username = scanner.next();
    // System.out.println("username is:" + username);
    // }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //string input
        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        
        //Numerical input[after getting a numerical input if we try to get a string as a input it wont shows because 'enter' will be stored as a character hence it won't print 
        //any thing, therefore in order to avoid that after getting a numerical input scann nextline()]
        System.out.println("enter your age: ");
        int age= scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter your email: ");
        String email=scanner.nextLine();

        System.out.println("Your name is " + name);
        System.out.println("your age is" + age);
        System.out.println("your email is: "+ email);
    }
    
}



// ----- In python to get user input---
//x = input("Enter username: ")

