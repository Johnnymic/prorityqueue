package service.implentation.queue;

import model.Customer;

import java.util.Comparator;

public class ItemComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return  Integer.compare(o2.getNumItems(),o1.getNumItems());
    }

}
