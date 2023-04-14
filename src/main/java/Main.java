import service.implentation.queue.priorityQueueImplentation;
import model.Customer;
import service.implentation.queue.ItemComparator;

public class Main {
    public static void main(String[] args)  {

        Customer customer1 = new Customer("Sarah",1,4000);
        ItemComparator it = new ItemComparator();
        priorityQueueImplentation cashier = new priorityQueueImplentation("mike",it);

        customer1.addItem("rice");
        customer1.addItem("beans");
        customer1.printReceipt();
        System.out.println(  cashier.addCustomer(customer1));
        System.out.println("********************************************************************************");




        Customer customer2 = new Customer("Esther", 3, 6000);
        customer2.addItem("tomato");
        customer2.addItem("fish");
        customer2.addItem("rice");
        customer2.addItem("tomato");
        customer2.addItem("yam");
        customer2.addItem("onion");
        customer2.printReceipt();
        System.out.println( cashier.addCustomer(customer2));
        System.out.println("********************************************************************************");



        Customer customer3 = new Customer("Jack", 2, 6000);
        customer3.addItem("tomato");
        customer3.addItem("fish");
        customer3.addItem("rice");
        customer3.addItem("tomato");
        customer3.printReceipt();
        System.out.println( cashier.addCustomer(customer3));
        System.out.println("********************************************************************************");


        System.out.println( cashier.serviceNextCustomer());
        System.out.println(cashier.serveCustomerWithMostItems());











    }
    }
