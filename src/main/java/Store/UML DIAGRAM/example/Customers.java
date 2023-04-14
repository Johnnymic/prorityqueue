package org.example;

import model.Product;

import java.util.ArrayList;

public class Customers  {
    private double customerWallet;
    private ArrayList<Product> Orders;
    private int quantity;
    private int orderId;

    private String name;




    public Customers(String name, double customerWallet, ArrayList<Product> products) {
        this.name = name;
        this.orderId = orderId;
        this.customerWallet = customerWallet;
    }

    public Customers(String name, double customerWallet, int orderId) {
        this.name = name;
        this.orderId = orderId;
        this.customerWallet = customerWallet;
        this.quantity = quantity;
    }


    public ArrayList<Product> getOrders() {
        return Orders;
    }

    public double checkBalance() {
        return customerWallet;
    }

    public void setBalance(double amount) {
        this.customerWallet -= amount;

        System.out.println(getName() + " you have been debited " + amount + " balance is " + customerWallet);
    }

    public int getOrderId() {
        return orderId;
    }


    public String getName() {
        return name;
    }

    public void add(Product order) {
        Orders.add(order);
    }


//
//                ' ';
}


