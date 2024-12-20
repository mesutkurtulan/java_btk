package AbstractClassExample;

public class CustomerManager {

    BaseDatabaseManager databaseManager; // Strategy Patern

    public void getCustomers() {
        databaseManager.getDate();
    }
}
