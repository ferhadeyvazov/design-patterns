package creational.abstract_factory;

import creational.factory_method.ApplePaymentService;
import creational.factory_method.PaymentService;

public class ApplePaymentFactory implements PaymentFactory {
    @Override
    public PaymentService getPaymentService() {
     return new ApplePaymentService();
    }

    @Override
    public TransactionLogger createTransactionLogger() {
        return new AppleTransactionLog();
    }
}
