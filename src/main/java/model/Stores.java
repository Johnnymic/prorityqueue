package model;

import org.apache.log4j.helpers.DateTimeDateFormat;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Stores {
    private  String Store_name;
    private  double StoreAccount;

    private int applicant_required_maxAge;
    private int applicant_required_minAge;

   public List<Product> products;
    private Queue<Product> productQueue;
    public  ArrayList<Cashier> cashiers;

    private DateFormat dateFormat;




    public Stores(String store_name, List<Product> products, Queue<Product> productQueue,  DateFormat dateFormat) {
        Store_name = store_name;
        this.products = products;
        this.productQueue = productQueue;
       // this.cashiers = cashiers;
        this.dateFormat = new DateTimeDateFormat();;
    }




    public Stores(String store_name, double storeAccount, int applicant_required_maxAge, int applicant_required_minAge, List<Product> products) {
        Store_name = store_name;
        StoreAccount = storeAccount;
        this.applicant_required_maxAge = applicant_required_maxAge;
        this.applicant_required_minAge = applicant_required_minAge;
        this.products = products;

    }




    public String getStore_name() {
        return Store_name;
    }

    public int getApplicant_required_maxAge() {
        return applicant_required_maxAge;
    }

    public int getApplicant_required_minAge() {
        return applicant_required_minAge;
    }

    public void setApplicant_required_maxAge(int applicant_required_maxAge) {
        this.applicant_required_maxAge = applicant_required_maxAge;
    }

    public void setApplicant_required_minAge(int applicant_required_minAge) {
        this.applicant_required_minAge = applicant_required_minAge;
    }

    public void upDateBalance(double amount){
        StoreAccount += amount;
    }

//    @Override
   public double checkBalance() {
      return StoreAccount;
  }

    public void addProduct(Product item){
        products.add(item);
        this.StoreAccount+=item.getPrice()*item.getQuantity();
    }

    public void setStore_name(String store_name) {
       Store_name = store_name;
    }

    public double getStoreAccount() {
        return StoreAccount;
    }

    public void setStoreAccount(double storeAccount) {
        StoreAccount = storeAccount;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(Product product) {
        this.products.add(product);
    }
}
