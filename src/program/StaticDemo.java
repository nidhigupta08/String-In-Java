package program;

class Logger {
    private static Logger instance = new Logger();

    private Logger() {} // Private constructor to prevent external instantiation

    public static Logger getInstance() {
        return instance;
    }

    public void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance(); // Access the single instance
        logger.logMessage("Hello, world!");
    }
}