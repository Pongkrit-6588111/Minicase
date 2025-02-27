import java.util.List;

// ----------------------- Invoice Class ----------------------- //
class Invoice {
    private double finalPrice;
    private Vehicle vehicle;
    private Customer customer;
    private Salesperson salesperson;
    private List<DealerInstalledOption> dealerInstalledOptions;

    public Invoice(double finalPrice, Vehicle vehicle, Customer customer, Salesperson salesperson, List<DealerInstalledOption> dealerInstalledOptions) {
        this.finalPrice = finalPrice;
        this.vehicle = vehicle;
        this.customer = customer;
        this.salesperson = salesperson;
        this.dealerInstalledOptions = dealerInstalledOptions;
    }

    // Getters
    public double getFinalPrice() { return finalPrice; }
    public Vehicle getVehicle() { return vehicle; }
    public Customer getCustomer() { return customer; }
    public Salesperson getSalesperson() { return salesperson; }
    public List<DealerInstalledOption> getDealerInstalledOptions() { return dealerInstalledOptions; }
}