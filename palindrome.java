public class palindrome{
    public static void main(String[] args){
        int n=153;
        int temp=n;
        int reverse=0;
        int remainder=0;
        //int reverse=0;

        while (temp>0)
        {
            remainder=temp%10;
            reverse=(reverse*10)+remainder;
            temp /= 10;
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