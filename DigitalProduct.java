public class DigitalProduct extends Product{

    private double fileSize;

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public DigitalProduct(String name, double price, double fileSize ) {
        super(name,price);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo(){
        System.out.println("Product Name :" +getName()
                + "\nProduct Price :" + getPrice() +
                "\nProduct fileSize :" + getFileSize());

    }

    public DigitalProduct(String name, double price, double fileSize, double discount ) {
        super(name,price);
        this.fileSize = fileSize;
        this.applyDiscount(discount);
    }



}
