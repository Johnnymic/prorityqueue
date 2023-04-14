package service.implentation.queue;

import model.Customer;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueueImplentation {

    String name;


    private final Queue<Customer> customersQueueFifo;
    private final Queue<Customer> itemsQueue;


    public priorityQueueImplentation(String name, ItemComparator ic) {
        this.name = name;
        this.customersQueueFifo = new PriorityQueue<>();
        this.itemsQueue = new PriorityQueue<>(ic);
    }


    public String addCustomer(Customer customers) {
        customersQueueFifo.add(customers);
        itemsQueue.offer(customers);
        return customers.getName() + " with orderId number " + customers.getId() + "  is waiting  on the queue.";

        //System.out.println();

    }

    public String serviceNextCustomer() {
        Customer customers = customersQueueFifo.poll();
        if (customers != null) {
            return "Serving customer: " + customers.getName() + " was attended to first based on  orderId";
        } else {
            return "No more customers in the FIFO queue";
        }

    }

    public String serveCustomerWithMostItems() {
        Customer customers = itemsQueue.poll();
        if (customers != null) {
            return "Serving customer: " + customers.getName() + ",  with the most items was attended to based on the number of items " + customers.getName() + " bought";

        } else {
          return   "No more customers in the FIFO queue";
        }

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cashiers{" + "name='" + name + '\'' + '}';
    }

}









