package enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        int price = 1000;

        DiscountService discountService = new DiscountService();
        int basic =  discountService.disCount(ClassGrade.BASIC, price);
        int gold = discountService.disCount(ClassGrade.GOLD, price);
        int diamond = discountService.disCount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
