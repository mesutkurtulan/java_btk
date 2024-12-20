package AbstractClassExample;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager1 = new CustomerManager();
        customerManager1.databaseManager = new OracleDatabaseManager();
        customerManager1.getCustomers(); // Veri Oracle'dan getirildi

        CustomerManager customerManager2 = new CustomerManager();
        customerManager2.databaseManager = new SqlServerDatabaseManager();
        customerManager2.getCustomers(); // Veri SqlServer'dan getirildi

        CustomerManager customerManager3 = new CustomerManager();
        customerManager3.databaseManager = new MySqlDatabaseManager();
        customerManager3.getCustomers(); // Veri MySql'dan getirildi
    }
}
