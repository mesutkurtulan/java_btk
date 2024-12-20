package ExceptionHandling;

public class AccountManager {
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws BalanceInsufficientException {

        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new BalanceInsufficientException("Yetersiz bakiye.");
            //throw new Exception("Yetersiz bakiye.");
            // System.out.println("Yetersiz bakiye.");
        }
    }

    public double getBalance() {
        return balance;
    }

}
