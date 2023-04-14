package service;

import model.Product;
import model.Stores;

public interface CustomerService {

      double checkBalance();
      void setBalance(double amount);

      void purchaseProduct(Stores store, Product product, int quantity);


}
