package Uge5.encapsulation.constructors.Product;

public class Product {
    private String productName;
    private String productCode;
    private double price;

    public String getProductName() { // i get-metoder tages der ingen parametre, fordi det eneste formål er at hente noget data
        return productName;
    }

    public void setProductName(String productName) { //i set-metoder skal den tage imod en parameter. Til forskel for get, kan man i set ændre variablen.
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double percentage) {

        double discountAmount = (price * percentage) / 100;
        price -= discountAmount;

    }
}
