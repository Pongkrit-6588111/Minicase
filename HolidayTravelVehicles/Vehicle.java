// ----------------------- Vehicle Class ----------------------- //
class Vehicle {
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private String serialNumber;
    private double baseCost;

    public Vehicle(String name, String model, int year, String manufacturer, String serialNumber, double baseCost) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.baseCost = baseCost;
    }

    // Getters
    public String getName() { return name; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getManufacturer() { return manufacturer; }
    public String getSerialNumber() { return serialNumber; }
    public double getBaseCost() { return baseCost; }
}