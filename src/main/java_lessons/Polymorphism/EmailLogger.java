package Polymorphism;

public class EmailLogger extends BaseLogger {

    @Override
    public void Log(String message) {
        System.out.println("Non Static Email Logger: " + message);
    }
}
