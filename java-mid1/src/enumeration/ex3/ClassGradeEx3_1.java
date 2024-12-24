package enumeration.ex3;

public class ClassGradeEx3_1 {

    public static void main(String[] args) {
        int price = 1000;
        DiscountService discountService = new DiscountService();
        int basic =  discountService.disCount(Grade.BASIC, price);
        int gold = discountService.disCount(Grade.GOLD, price);
        int diamond = discountService.disCount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}