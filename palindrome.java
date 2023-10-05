public class palindrome{
    public static void main(String[] args){
        int n=3553;
        int reverse=0;
        int remainder=0;
        //int reverse=0;

        while (n != 0)
        {
            remainder=n%10;
            reverse=(reverse*10)+remainder;
            n /= 10;
        }
        if (n==reverse)
        {
            System.out.println("it is palindrome");
        }
        else
        {
            System.out.println("it is not palindrome");

        }
    } 
}