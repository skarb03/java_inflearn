package enumeration.ex2;

import enumeration.ex1.StringGrade;

public class DiscountService {

    public int disCount(ClassGrade grade, int price){
        int discountPrice = 0;

        if (grade == ClassGrade.BASIC) {
            discountPrice = 10;
        } else if(grade == ClassGrade.GOLD) {
            discountPrice = 20;
        } else if (grade == ClassGrade.DIAMOND) {
            discountPrice = 30;
        } else {
            System.out.println("할인X");
        }

        return discountPrice * price / 100;
    }
}
