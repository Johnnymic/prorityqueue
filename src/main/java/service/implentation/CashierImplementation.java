package service.implentation;

import model.Cashier;
import org.example.Customers;
import model.Product;
import model.Stores;
import service.CashierServices;


public class CashierImplementation implements CashierServices {



     Cashier cashier;
    Customers customers;

    public CashierImplementation(Cashier cashier) {
        this.cashier = cashier;
    }

    public void processOrders(Stores stores, Customers customer) {
        double total = 0.0;
        for (Product order : customer.getOrders()) {
            total += order.getPrice() * order.getQuantity();
             updateProductQty(stores, order, order.getQuantity());
            System.out.println(total);
        }
        if (customer.checkBalance() >= total) {
            customer.setBalance(total);
            stores.upDateBalance(stores.checkBalance()+  total);
            System.out.println("Transfer successful!");
            issueReceipt(customer, total);

        } else {
            System.out.println("Insufficient funds!");
        }
    }
    public void updateProductQty(Stores stores, Product product, int quantity) {
        for (Product storeproduct : stores.getProducts()) {
            if (storeproduct.getProduct_name().equals(product.getProduct_name())){
                storeproduct.setQuantity(storeproduct.getQuantity() - product.getQuantity());
            }
            else{
                //System.out.printf("Out of Stock");
                storeproduct.setQuantity(storeproduct.getQuantity());
            }
        }
    }


    public void issueReceipt(Customers customer, double total) {
        System.out.println();
        System.out.println("CUSTOMER RECEIPT.");
        System.out.println("Product " + "|" + " Qty");
        for (Product item : customer.getOrders()) {
            System.out.print(item.getProduct_name() + "  " + " has " + item.getQuantity()+"kg");
            System.out.println();
           System.out.println( "customer name :"+ customer.getName());
            System.out.println("Total :" + total);
            System.out.println("Attended by " +  " with StaffID " );
        }
        System.out.println("Thank you." + customer.getOrders());
    }



}

