package enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int vip = discountService.disCount("VIP", 10000);
        System.out.println("VIP 등급의 할인 금액: " + vip);
    }
}