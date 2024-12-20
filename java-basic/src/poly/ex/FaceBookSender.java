package poly.ex;

public class FaceBookSender implements Sender{
    @Override
    public void SendMessage(String message) {
        System.out.println("페이스북에서 발송합니다.: " + message);
    }
}
