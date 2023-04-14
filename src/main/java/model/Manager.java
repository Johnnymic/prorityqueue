package model;

import java.util.ArrayList;

public class Manager extends  Person{
    private Stores store;


    private ArrayList<Cashier> cashiers;
    public Manager(String name,Stores stores,ArrayList<Cashier> cashiers) {
        super(name);
        this.store = stores;
        this.cashiers = new ArrayList<>();
    }


    public ArrayList<Cashier> getCashiers() {
        return cashiers;
    }

    public int CashiersAbsenceCount(int count) {
        return count ;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "store=" + store +
                ", cashiers=" + cashiers +
                '}';
    }
}

