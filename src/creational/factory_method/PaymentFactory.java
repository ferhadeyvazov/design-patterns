package creational.factory_method;

public class PaymentFactory {
    public PaymentService getPaymentService(PaymentType paymentType){
        return switch (paymentType){
            case GOOGLE_PAYMENT -> new GooglePaymentService();
            case APPLE_PAYMENT -> new ApplePaymentService();
            default -> throw new IllegalArgumentException("Payment type not supported");
        };

    }
}
