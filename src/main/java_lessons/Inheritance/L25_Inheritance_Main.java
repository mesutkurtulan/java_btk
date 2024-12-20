package Inheritance;

public class L25_Inheritance_Main {
    public static void main(String[] args) {
        L25_Inheritance_Customer customer = new L25_Inheritance_Customer();
        L25_Inheritance_Employee employee = new L25_Inheritance_Employee();

        customer.id = 1;                    // L25_Inheritance
        customer.firstName = "John";        // L25_Inheritance
        customer.lastName = "Doe";          // L25_Inheritance
        customer.age = 30;                  // L25_Inheritance
        customer.email = "test@mail.com";   // L25_Inheritance_1

        employee.id = 2;                    // L25_Inheritance
        employee.firstName = "Jane";        // L25_Inheritance
        employee.lastName = "Smith";        // L25_Inheritance
        employee.age = 40;                  // L25_Inheritance
        employee.salary = 50000;            // L25_Inheritance_2

        L25_Inheritance_EmployeeManager employeeManager = new L25_Inheritance_EmployeeManager();
        L25_Inheritance_CustomerManager customerManager = new L25_Inheritance_CustomerManager();

        employeeManager.List();
        employeeManager.Add();
        employeeManager.BestEmployee();

        customerManager.List();
        customerManager.Add();
        customerManager.BestCustomer();

    }

}
