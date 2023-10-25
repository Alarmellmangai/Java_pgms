public class methodoverloading {
    
    //Method Overloading it means we can have a same method name and datatypes can be changed 
    public static int add(int x,int y,int z){
        return x+y+z;
    }

    public static int add(int x,int y){
        return x+y;
    }
    public static void main(String[] args) {

        System.out.println(add(3,4));
        System.out.println(add(3,4,5));

        
    }
}
