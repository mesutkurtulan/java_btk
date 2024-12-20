package Interface;

public class Main {

    public static void main(String[] args) {
        /*
        ICustomerDataAccessLayer customerDataAccessLayer = new OracleCustomerDataAccessLayer();
        customerDataAccessLayer.Add();

        customerDataAccessLayer = new MySqlCustomerDataAccessLayer();
        customerDataAccessLayer.Add();
         */

        CustomerManager oracleCustomerManager = new CustomerManager(new OracleCustomerDataAccessLayer());
        oracleCustomerManager.add();

        CustomerManager mysqlCustomerManager = new CustomerManager(new MySqlCustomerDataAccessLayer());
        mysqlCustomerManager.add();

    }
}
