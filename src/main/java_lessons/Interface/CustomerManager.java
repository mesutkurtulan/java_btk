package Interface;

public class CustomerManager {
    private ICustomerDataAccessLayer customerDataAccessLayer;

    public CustomerManager(ICustomerDataAccessLayer customerDataAccessLayer) {
        this.customerDataAccessLayer = customerDataAccessLayer;
    }
    public void add(){
        customerDataAccessLayer.Add();
    }
}
