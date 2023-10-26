/*
 * 5!=5*4*3*2*1
 * n!=n*(n-1)!
 */
public class Recursion {
    

    static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);    

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Factorial of " + n + " is:" + fact(n));
    }
    
}
