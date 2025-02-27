// ----------------------- Trade-in Vehicle Class ----------------------- //
class TradeInVehicle {
    private String name;
    private String model;
    private int year;
    private String serialNumber;

    public TradeInVehicle(String name, String model, int year, String serialNumber) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.serialNumber = serialNumber;
    }

    // Getters
    public String getName() { return name; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getSerialNumber() { return serialNumber; }
}
