package creational.factory_method;

public class GooglePaymentService implements PaymentService{
    @Override
    public void pay(){
        System.out.println("Google Payment Service");
    }
}
