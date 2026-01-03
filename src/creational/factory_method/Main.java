package creational.factory_method;

import static creational.factory_method.PaymentType.APPLE_PAYMENT;
import static creational.factory_method.PaymentType.GOOGLE_PAYMENT;

public class Main {
    public static void main(String[] args) {
        PaymentFactory p1 = new PaymentFactory();
        System.out.println(p1.getPaymentService(GOOGLE_PAYMENT));
        System.out.println(p1.getPaymentService(APPLE_PAYMENT));


    }
}
