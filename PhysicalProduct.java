public class PhysicalProduct extends Product {

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public PhysicalProduct(String productName, double price, double weight) {
        super(productName, price);
        this.weight = weight;
    }

    public PhysicalProduct(String productName, double price, double weight, double discount) {
        super(productName, price);
        this.weight = weight;
        this.applyDiscount(discount);
    }

    @Override
    public void displayInfo(){
        System.out.println("Product name :" +getName()
                + "\nProduct price :" +getPrice() +
                  "\nProduct weight :" +getWeight());

    }
}
