public class main {
    public static void main(String[] args) {
        // Creating a Vehicle object
        Vehicle myVehicle = new Vehicle("Toyota", "Supra", 1994, "Toyota", "JT2JA81L6R0009641", 30000.00);

        // Printing vehicle details
        System.out.println("Vehicle Information by Pongkrit:");
        System.out.println("Name: " + myVehicle.getName());
        System.out.println("Model: " + myVehicle.getModel());
        System.out.println("Year: " + myVehicle.getYear());
        System.out.println("Manufacturer: " + myVehicle.getManufacturer());
        System.out.println("Serial Number: " + myVehicle.getSerialNumber());
        System.out.println("Base Cost: " + myVehicle.getBaseCost() + " Baht");
    }
}
