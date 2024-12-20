package ExceptionHandling;

public class Throws {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        System.out.println("Hesap " + accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("Hesap " + accountManager.getBalance());
        try {
            accountManager.withdraw(200);
        } catch (BalanceInsufficientException e) {
            e.printStackTrace();
        }
        System.out.println("Hesap " + accountManager.getBalance());
    }
}
