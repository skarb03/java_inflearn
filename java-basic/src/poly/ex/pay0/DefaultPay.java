package poly.ex.pay0;

public class DefaultPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("결제할게 없음");
        return false;
    }
}
