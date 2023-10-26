import java.util.Calendar;

class calculator{
    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
    
}


public class OOPS{
    public static void main(String[] args){
        int n1 = 4;
        int n2 = 5;
        calculator calc = new calculator();
        int result = calc.add(n1,n2);
        System.out.println(result);

        Calculator calc1 = new calculator(calc);
    }
}