import java.util.ArrayList;

public class Product {

    private int id;
    private String productName;
    private long upc;
    private String manufacturer;
    private double price;
    private int bestBefore;
    private int count;
    private static int idCount;

    public Product(String productName, long upc, String manufacturer, double price, int bestBefore, int count) {
        id = ++idCount;
        this.productName = productName;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.bestBefore = bestBefore;
        this.count = count;
    }

    public Product(String productName, long upc, String manufacturer, double price, int count) {
        id = ++idCount;
        this.productName = productName;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        bestBefore = 2147483647;
        this.count = count;
    }
    // Suppress to create empty Product
    private Product() {
    }

    public static Product createProduct(String productName,
                                        long upc, String manufacturer, double price, int bestBefore, int count) {
        return new Product(productName, upc, manufacturer, price, bestBefore, count);
    }

    public static Product createProductWithLongTermSaving(String productName,
                                                          long upc, String manufacturer, double price, int count) {
        return new Product(productName, upc, manufacturer, price, count);
    }

    public static void printProductByName(ArrayList<Product> products, String name) {
        System.out.println("List products by name = " + name);
        products
                .stream()
                .filter(s -> s.getProductName().equals(name))
                .forEach(System.out::println);
        System.out.println();
    }

    public static void printAllProduct(ArrayList<Product> products) {
        System.out.println("List of all products");
        products.forEach(System.out::println);
        System.out.println();
    }

    public static void printProductByNameAndPriceLowThan(ArrayList<Product> products, String name, double price) {
        System.out.println("List products by name = " + name + " and price low than = " + price);
        products
                .stream()
                .filter(s -> s.getProductName().equals(name))
                .filter(s -> s.getPrice() <= price)
                .forEach(System.out::println);
        System.out.println();
    }

    public static void printProductByBestBefore(ArrayList<Product> products, int bestBefore) {
        System.out.println("List products by best before more than = " + bestBefore);
        products
                .stream()
                .filter(s -> s.getBestBefore() > bestBefore)
                .forEach(System.out::println);
        System.out.println();
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public long getUpc() {
        return upc;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public int getCount() {
        return count;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUpc(long upc) {
        this.upc = upc;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBestBefore(int bestBefore) {
        this.bestBefore = bestBefore;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", upc=" + upc +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", bestBefore=" + bestBefore +
                ", count=" + count +
                '}';
    }
}
