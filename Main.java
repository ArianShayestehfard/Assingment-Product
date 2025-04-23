import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Product[] Product = new Product[]{
                new DigitalProduct("apple", 10, 10, 10),
                new DigitalProduct("Xiaomi", 10, 10, 25),
                new PhysicalProduct("samsung", 10, 0.2, 15),
                new PhysicalProduct("Nokia", 10, 0.2, 0),
        };

        int i=0;

        while(i<= Array.getLength(Product)) {
            Product[i].displayInfo();
            i++;
            }



///*
//        Product apple = new Product("Apple", 10);
//        Product samsung = new Product("samsung", 20);
//        Product xiaomi = new Product("xiaomi", 30);
//        Product nokia = new Product("nokia");
//        System.out.println("Product Quantity :" +Product.counter);
//
//        apple.applyDiscount(10);
//        System.out.println("Price after discount :" +apple.getPrice());
//
//        samsung.applyDiscount(25);
//        System.out.println("Price after discount :" +samsung.getPrice());
//*/
//
//        DigitalProduct asus = new DigitalProduct( "Asus", 50, 10);
//        asus.displayInfo();
//
//        Product sss = new DigitalProduct( "Ssss", 50, 10);
//        sss.displayInfo();
//
//        PhysicalProduct ppp = new PhysicalProduct( "ppp", 50, 10);
//        Product product = ppp;
//        product.displayInfo();
//
//        PhysicalProduct downCastedProduct = (PhysicalProduct) product;
//        System.out.println("weight of Product :" downCastedProduct.getWeight());


    }
}