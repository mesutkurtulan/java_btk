package Polymorphism;

public class CustomerManager extends BaseLogger {

    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void Add() {
        System.out.println("Customer Added");

        // Database'e logladığımızı düşünelim
        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.Log("Customer Added to database");
    }
}
