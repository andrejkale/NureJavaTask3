import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Product> products = new ArrayList<>();
        Product inverter = Product
                .createProductWithLongTermSaving("EY-3000W"
                        , 123456789012L, "China", 6300.0, 5);
        Product powerStation = Product.createProductWithLongTermSaving("EcoFlow"
                , 123456789011L, "China", 60000.5, 4);
        products.add(inverter);
        products.add(powerStation);
        products.stream().forEach(System.out::println);
    }
}
