public class Cars {
    private static int totalCars = 0;
    public static String Cars() {
        return "raja";
    }
    public static int getTotalCars() {
        return totalCars;
    }
    
    public static void main(String[] args) {
        System.out.println("Total cars: " + Cars.getTotalCars());
        System.out.println("Total cars: " + Cars.Cars());
       

    }
}
