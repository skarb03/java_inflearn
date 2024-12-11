package static2.ex;

public class CarMine {
    private static String[] names = new String[10];
    public static int count;

    public CarMine(String name) {
        names[count] = name;
        count++;
    }

    public static void showTotalCars() {
        for(int i = 0; i < count; i++) {
            System.out.println("차량 구입, 이름: " + names[i]);
        }
        System.out.println("구매한 차량 수 : " + count);
    }
}
