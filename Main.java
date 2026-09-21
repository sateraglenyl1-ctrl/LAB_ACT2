public class Main {

   public static void main(String[] args) {
   
   vehicle v1 = new vehicle();
   v1.brand = "Ford";
   v1.model = "Mustang";
   v1.year = 1965;
   
   vehicle v2 = new vehicle();
   v2.brand = "Toyota";
   v2.model = "Corolla";
   v2.year = 1998;
   
   vehicle v3 = new vehicle();
   v3.brand = "Porsche";
   v3.model = "911 Carrera";
   v3.year = 2025;
   
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
}// IT-OOPROG21 Main class activity
