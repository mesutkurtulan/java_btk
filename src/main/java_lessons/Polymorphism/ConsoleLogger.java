package Polymorphism;

public class ConsoleLogger extends BaseLogger {

    @Override
    public void Log(String message) {
        System.out.println("Console Logger: " + message);
    }
}
