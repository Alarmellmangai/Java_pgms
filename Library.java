public class Library{
    // String name; //instance variables
    // String city;
    // int mobileNo;

    //Constructor:
    // Library(String n,String c,int m){
    //     name = n;
    //     city=c;
    //     mobileNo=m;
    // }

    //method- some action to perform
    //Parameter-method input
    public String login(String name,int mobileno,String city){ //method definition
        return("Hi " + name);

    /*
     * static void printLine(){
     * System.out.println("Hi this file is about Methods")}
     */


    }
    public static void main(String[] args) {
        Library user1 = new Library();

        // user1.name= "Nithya";
        // System.out.println(user1.name);

        System.out.println(user1.login("Nithya", 8480583, "Chennai")); //passing Arguments;

        
    }
}

 