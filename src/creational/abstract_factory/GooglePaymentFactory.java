package creational.abstract_factory;

import creational.factory_method.GooglePaymentService;
import creational.factory_method.PaymentService;

public class GooglePaymentFactory implements PaymentFactory{
    @Override
    public PaymentService getPaymentService(){
        return new GooglePaymentService();
    }

    @Override
    public TransactionLogger createTransactionLogger() {
        return new GoogleTransactionLog();
    }
}
