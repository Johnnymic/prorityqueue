package service.implentation.queue;

import model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashiersQueueImplementationTest {

    priorityQueueImplentation cashier;
    String cashierName;


    @BeforeEach
    public void init() {

         cashier = new priorityQueueImplentation(cashierName, new ItemComparator());
        Customer customer1 = new Customer("John Doe", 12345, 5);
        Customer customer2 = new Customer("Jane Smith", 67890, 3);
        cashier.addCustomer(customer1);
        cashier.addCustomer(customer2);



    }

    @Test
    public void testAddCustomer() {

        // add a new customer to the queue and verify that the correct message is returned
        Customer customer = new Customer("John Doe", 12345, 5);
        String expectedMessage = "John Doe with orderId number 12345  is waiting  on the queue.";
        String actualMessage = cashier.addCustomer(customer);
        assertEquals(expectedMessage, actualMessage);
    }



    @Test
    public void testServiceNextCustomer() {

        // service the next customer in the queue and verify that the correct message is returned
        String expectedMessage = "Serving customer: John Doe was attended to first based on  orderId";
        String actualMessage = cashier.serviceNextCustomer();
        assertEquals(expectedMessage, actualMessage);

        // service the next customer in the queue and verify that the correct message is returned
        expectedMessage = "Serving customer: Jane Smith was attended to first based on  orderId";
        actualMessage = cashier.serviceNextCustomer();
        assertEquals(expectedMessage, actualMessage);

        // try to service another customer, but there are none left in the queue
        expectedMessage = "No more customers in the FIFO queue";
        actualMessage = cashier.serviceNextCustomer();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testServeCustomerWithMostItems() {

       // serve the customer with the most items and verify that the correct message is returned
        String expectedMessage = "Serving customer: John Doe,  with the most items was attended to based on the number of items John Doe bought";
        String actualMessage = cashier.serveCustomerWithMostItems();
        assertEquals(expectedMessage, actualMessage);



    }
}