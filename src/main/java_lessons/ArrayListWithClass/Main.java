package ArrayListWithClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "John", "Doe"));
        customers.add(new Customer(1, "Jane", "Doe"));
        customers.add(new Customer(1, "Jonathan", "Doe"));

        for (Customer customer : customers) {
            System.out.println(customer.id + " " + customer.firstName + " " + customer.lastName);
        }
    }
}
