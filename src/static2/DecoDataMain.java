package static2;

//import static static2.DecoData.staticCall;
public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 메서드 콜");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 메서드 콜");
        DecoData data1= new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 메서드 콜");
        DecoData data2 = new DecoData();
        data1.instanceCall();

        DecoData.staticCall(data2);

        //추가
        //인스턴스르 통합접근
        DecoData data3 = new DecoData();
        data3.staticCall();
    }
}
