public class ElectronicDevice extends Product {
    private String brand;
    private String model;
    private int warrantyMonths;
    
    public ElectronicDevice(String id, String name, double price, int quantity, 
                            String brand, String model, int warrantyMonths) {
        super(id, name, price, quantity);
        this.brand = brand;
        this.model = model;
        this.warrantyMonths = warrantyMonths;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getWarrantyMonths() {
        return warrantyMonths;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("ELECTRONIC DEVICE: " + getName());
        System.out.println("  Brand: " + brand);
        System.out.println("  Model: " + model);
        System.out.println("  Warranty: " + warrantyMonths + " months");
        System.out.println("  Price: $" + getPrice());
        System.out.println("  Stock: " + getQuantity());
        System.out.println();
    }
}
