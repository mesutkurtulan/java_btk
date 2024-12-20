package Polymorphism;

public class BaseLogger {
    public void Log(String message) {
        System.out.println("Non Static Base Logger: " + message);
    }

    public static void logger(String message) {
        System.out.println("Static Base Logger: " + message);
    }
}
