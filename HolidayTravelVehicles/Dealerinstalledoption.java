// ----------------------- Dealer Installed Option Class ----------------------- //
class DealerInstalledOption {
    private double price;
    private String description;
    private String optionCode;

    public DealerInstalledOption(double price, String description, String optionCode) {
        this.price = price;
        this.description = description;
        this.optionCode = optionCode;
    }

    // Getters
    public double getPrice() { return price; }
    public String getDescription() { return description; }
    public String getOptionCode() { return optionCode; }
}
