package enumeration.ref3;

import enumeration.ex2.ClassGrade;
import enumeration.ex2.DiscountService;

public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 1000;

        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 금액: " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인 금액: " + Grade.DIAMOND.discount(price));
    }
}
