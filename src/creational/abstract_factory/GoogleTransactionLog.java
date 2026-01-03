package creational.abstract_factory;

public class GoogleTransactionLog implements TransactionLogger {
    @Override
    public void log(String message) {
        System.out.println("GoogleTransactionLogger: " + message);
    }
}
