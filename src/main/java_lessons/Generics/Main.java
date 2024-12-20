package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>(); // <String> generic classes -> Type
        cities.add("Istanbul");
        cities.add("Ankara");
        cities.add("Izmir");

        MyList<String> cityList = new MyList<String>();
        cityList.add("Istanbul");
        cityList.add("Ankara");
        cityList.add("Izmir");

        MyList<Customer> customerList = new MyList<Customer>();
        Customer customer = new Customer();
        customer.id = 1;
        customer.firstName = "John";
        customerList.add(customer);
        System.out.println(customerList.toString());

    }
}
