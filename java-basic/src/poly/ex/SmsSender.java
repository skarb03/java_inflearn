package poly.ex;

public class SmsSender implements Sender{
    @Override
    public void SendMessage(String message) {
        System.out.println("Sms에서 발송합니다.: " + message);
    }
}
