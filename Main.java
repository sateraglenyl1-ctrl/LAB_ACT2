public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Ford", "Mustang", 1965);
        Vehicle v2 = new Vehicle("Toyota", "Corolla", 1998);
        Vehicle v3 = new Vehicle("Porsche", "911 Carrera", 2025);

        System.out.println("=== ORIGINAL VEHICLES ===");

        System.out.println("Vehicle 1:");
        v1.displayInfo();
        System.out.println("Brand: " + v1.getBrand());
        System.out.println("Model: " + v1.getModel());
        System.out.println("Year: " + v1.getYear());
        System.out.println("Car's Age: " + v1.calculateAge());
        System.out.println("Is this vehicle considered vintage? " + v1.isVintage() + "\n");

        System.out.println("Vehicle 2:");
        v2.displayInfo();
        System.out.println("Brand: " + v2.getBrand());
        System.out.println("Model: " + v2.getModel());
        System.out.println("Year: " + v2.getYear());
        System.out.println("Car's Age: " + v2.calculateAge());
        System.out.println("Is this vehicle considered vintage? " + v2.isVintage() + "\n");

        System.out.println("Vehicle 3:");
        v3.displayInfo();
        System.out.println("Brand: " + v3.getBrand());
        System.out.println("Model: " + v3.getModel());
        System.out.println("Year: " + v3.getYear());
        System.out.println("Car's Age: " + v3.calculateAge());
        System.out.println("Is this vehicle considered vintage? " + v3.isVintage() + "\n");

        System.out.println("=== SET YEAR TESTS ===");

        System.out.println("setYear(2000): " + v2.setYear(2000));
        System.out.println("Year: " + v2.getYear());
        System.out.println("Car's Age: " + v2.calculateAge());
        System.out.println("Is this vehicle considered vintage? " + v2.isVintage());

        System.out.println("\nsetYear(1885): " + v2.setYear(1885));
        System.out.println("Year remains: " + v2.getYear());

        System.out.println("\nsetYear(2027): " + v2.setYear(2027));
        System.out.println("Year remains: " + v2.getYear());

        System.out.println("\n=== CONSTRUCTOR VALIDATION TESTS ===");

        Vehicle invalidLow = new Vehicle("Test", "Low Year", 1885);
        Vehicle invalidHigh = new Vehicle("Test", "High Year", 2027);

        System.out.println("Constructor with 1885 -> Year: " + invalidLow.getYear());
        System.out.println("Constructor with 2027 -> Year: " + invalidHigh.getYear());
    }
}