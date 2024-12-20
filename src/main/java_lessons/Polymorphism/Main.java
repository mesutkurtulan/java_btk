package Polymorphism;

public class Main {
    public static void main(String[] args) {
        /*
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.Log("Email'e Loglandı");
         */
        BaseLogger[] loggers = new BaseLogger[]{new EmailLogger(), new DatabaseLogger(), new FileLogger(), new ConsoleLogger()};

        for (BaseLogger logger : loggers) {
            logger.Log("Loglandı");
        }
    }
}
