package model;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Comparable<Customer> {

    private String name;
    private int id;

    private double amount;


    private final List<String> items;


    public Customer(String name, int id, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.items = new ArrayList<>();
    }
    public String addItem(String item) {

        return      "" + items.add(item);
    }

    public int getNumItems() {
        return items.size();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void printReceipt() {
        System.out.println("Customer " + id + " bought the following items:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }

    @Override
    public int compareTo(Customer o) {
        return Integer.compare(this.getId(), o.getId());
    }


}
