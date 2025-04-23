public abstract class Product implements IDiscountable {

    private double price;
    private String name;
    public static int counter;


    public void setPrice(double price) {
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        counter++;
    }
    public Product(String name) {
        this.name = name;
        this.price = 0;
        counter ++;
    }
    public static int counter (){
        return counter;
    }
    public void applyDiscount(double discount) {
        discount = discount/100;
        double discountPrice = discount * price;
        this.price = price - discountPrice;
    }

    public abstract void displayInfo();
}
