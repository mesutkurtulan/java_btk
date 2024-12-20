package Interface;

public class OracleCustomerDataAccessLayer implements ICustomerDataAccessLayer{
    @Override
    public void Add() {
        System.out.println("Oracle Eklendi");
    }
}
