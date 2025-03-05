package Uge5.encapsulation.constructors.Product;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();

        product.setProductName("Acer laptop");
        product.setProductCode("ACER2024#¤");
        product.setPrice(195.99);

        System.out.println(product.getPrice());
        product.applyDiscount(35);

        System.out.println(product.getProductName());
        System.out.println(product.getProductCode());
        System.out.println(product.getPrice());

    }
}