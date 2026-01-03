package creational.factory_method;

public class ApplePaymentService implements PaymentService{
    @Override
    public void pay(){
        System.out.println("Apple Payment Service");
    }
}
