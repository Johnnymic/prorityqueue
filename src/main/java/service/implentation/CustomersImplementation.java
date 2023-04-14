package service.implentation;

import org.example.Customers;
import model.Product;
import model.Stores;
import service.CustomerService;

public class CustomersImplementation implements CustomerService {

    public double customerWallet;



    public double checkBalance() {
        return customerWallet;
    }

    @Override
    public void setBalance(double amount) {

    }

    @Override
    public void purchaseProduct(Stores store, Product product, int quantity) {

    }

    public void setBalance(double amount, Customers customers) {
        this.customerWallet -= amount;
       // System.out.println( customers. +" you have been debited " + amount + " balance is "+ customerWallet);
    }

    public void purchaseProduct(Stores store, Product product, int quantity, Customers customers) {
        Product order = new Product(product.getProduct_name() , product.getPrice(), product.getQuantity(), "ALL");
       customers.add(order);
       // System.out.println( customers.getName() + " has added " + product.getProduct_name()+ " to his cart" );
        for(Product c : store.getProducts()){
            if(c.getProduct_name().equals(order.getProduct_name())){
                System.out.println(" OUT OF STOCK");

            }


        }


    }

}
