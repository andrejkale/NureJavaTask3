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
