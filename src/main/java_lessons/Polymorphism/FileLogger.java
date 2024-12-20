package Polymorphism;

public class FileLogger extends BaseLogger {

    @Override
    public void Log(String message) {
        System.out.println("File Logger: " + message);
    }
}
