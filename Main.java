public class Main {

   public static void main(String[] args) {
   
   Vehicle v1 = new Vehicle("Ford", "Mustang", 1965);
   Vehicle v2 = new Vehicle("Toyota", "Corolla", 1998);
   Vehicle v3 = new Vehicle("Porsche", "911 Carrera", 2025);
   
   System.out.println("Vehicle 1: ");
   v1.displayInfo();
   System.out.println("Car's Age: " + v1.calculateAge());
   System.out.println("Is this vehicle considered vintage? " + v1.isVintage() + "\n");
   
   System.out.println("Vehicle 2: ");
   v2.displayInfo();
   System.out.println("Car's Age: " + v2.calculateAge());
   System.out.println("Is this vehicle considered vintage? " + v2.isVintage() + "\n");
   
   System.out.println("Vehicle 3: ");
   v3.displayInfo();
   System.out.println("Car's Age: " + v3.calculateAge());
   System.out.println("Is this vehicle considered vintage? " + v3.isVintage() + "\n");
  
}
}