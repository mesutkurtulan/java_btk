package Interface;

public class MySqlCustomerDataAccessLayer  implements ICustomerDataAccessLayer, IRepository{
    @Override
    public void Add() {
        System.out.println("MySql Eklendi");
    }

    @Override
    public void Remove() {

    }
}
