package creational.abstract_factory;

import creational.factory_method.PaymentService;

public interface PaymentFactory {
    PaymentService getPaymentService();
    TransactionLogger createTransactionLogger();

}
