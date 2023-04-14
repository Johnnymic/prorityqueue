package service;

import org.example.Customers;
import model.Product;
import model.Stores;


public interface CashierServices {

     void processOrders(Stores stores, Customers customer);
     void updateProductQty(Stores stores, Product product, int quantity);

     void issueReceipt(Customers customer, double total);
}
