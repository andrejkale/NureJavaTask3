import java.util.ArrayList;

public class CreateProduct {
    ArrayList<Product> products = new ArrayList<>();
    Product inverter = Product.createProductWithLongTermSaving("Inverter", 123456789012L, "China", 6300.0, 5);
    Product inverter_1 = Product.createProductWithLongTermSaving("Inverter", 123456789013L, "China", 6500.5, 10);
    Product inverter_2 = Product.createProductWithLongTermSaving("Inverter", 123456789014L, "China", 7450.0, 3);
    Product powerStation = Product.createProductWithLongTermSaving("Power Station", 123456789111L, "China", 60000.5, 4);
    Product powerStation_1 = Product.createProductWithLongTermSaving("Power Station", 123456789112L, "China", 61500.55, 3);
    Product powerStation_2 = Product.createProductWithLongTermSaving("Power Station", 123456789113L, "China", 62000.4, 15);
    Product apples = Product.createProduct("Apple", 173892678147L, "Ukraine", 25.34, 30, 1000);
    Product apples_1 = Product.createProduct("Apple", 183892678147L, "Ukraine", 35.40, 45, 1000);
    Product apples_2 = Product.createProduct("Apple", 193892678147L, "Ukraine", 15.40, 25, 1000);
    Product coffee = Product.createProduct("Coffee", 193892678148L, "Columbia", 250.40, 180, 250);
    Product coffee_1 = Product.createProduct("Coffee", 193892678148L, "Columbia", 220.40, 240, 300);
    Product coffee_2 = Product.createProduct("Coffee", 193892678148L, "Columbia", 300.45, 360, 300);

    public ArrayList<Product> createProductArrayList() {
        products.add(inverter);
        products.add(inverter_1);
        products.add(inverter_2);
        products.add(powerStation);
        products.add(powerStation_1);
        products.add(powerStation_2);
        products.add(apples);
        products.add(apples_1);
        products.add(apples_2);
        products.add(coffee);
        products.add(coffee_1);
        products.add(coffee_2);
        return products;
    }
}
