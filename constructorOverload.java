class load{
    int id;
    String name;
    String Address;

    load(){
        System.out.println("The constuctor is empty");
    }

    load(int id,String name,String Address ){
        this();
        this.id=id;
        this.name=name;
        this.Address=Address;
        System.out.println("id :" +id);
        System.out.println("name :"+ name);
        System.out.println("add :"+ Address);
        
    

    }
}

public class constructorOverload {
    public static void main(String[] args) {
        load multiple1= new load();
        load muliple =new load(1,"alar","Chennai");
        // load multiple1= new load();
    }
    
}
