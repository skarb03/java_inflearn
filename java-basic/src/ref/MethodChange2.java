package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        System.out.println("메서드 전 : " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 후 : " + dataA.value);
    }

    public static void changeReference(Data dataX){
        dataX.value = 20;
    }
}
