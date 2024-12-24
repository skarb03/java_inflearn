package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {

    public int disCount(Grade grade, int price){
        int discountPrice = 0;

        if (grade == BASIC) {
            discountPrice = 10;
        } else if(grade == GOLD) {
            discountPrice = 20;
        } else if (grade == DIAMOND) {
            discountPrice = 30;
        } else {
            System.out.println("할인X");
        }

        return discountPrice * price / 100;
    }
}
