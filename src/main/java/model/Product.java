package model;

public class Product {
    private String Product_name;
    private double price;

    private  int Quantity;

    private  String categories;

    public Product(String product_name, double price, int quantity, String category) {
        Product_name = product_name;
        this.price = price;
        Quantity = quantity;
    }


    public String getProduct_name() {
        return Product_name;
    }

    public void setProduct_name(String product_name) {
        Product_name = product_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Product_name='" + Product_name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", categories='" + categories + '\'' +
                '}';
    }
}
