public class Accessory extends Product {
    private String type;
    private String compatibleWith;
    private String color;
    
    public Accessory(String id, String name, double price, int quantity, 
                    String type, String compatibleWith, String color) {
        super(id, name, price, quantity);
        this.type = type;
        this.compatibleWith = compatibleWith;
        this.color = color;
    }
    
    public String getType() {
        return type;
    }
    
    public String getCompatibleWith() {
        return compatibleWith;
    }
    
    public String getColor() {
        return color;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("ACCESSORY: " + getName());
        System.out.println("  Type: " + type);
        System.out.println("  Compatible with: " + compatibleWith);
        System.out.println("  Color: " + color);
        System.out.println("  Price: $" + getPrice());
        System.out.println("  Stock: " + getQuantity());
        System.out.println();
    }
}
