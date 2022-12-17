import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CreateProduct product = new CreateProduct();
        ArrayList <Product> products = product.createProductArrayList();

        Product.printProductByName(products, "Coffee");
        Product.printProductByNameAndPriceLowThan(products, "Apple", 35.0);
        Product.printProductByBestBefore(products, 180);

        Product.printAllProduct(products);
    }
}
