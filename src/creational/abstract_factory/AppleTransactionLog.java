package creational.abstract_factory;

public class AppleTransactionLog implements TransactionLogger {
    @Override
    public void log(String message){
        System.out.println("AppleTransactionLogger: " + message);
    }
}
