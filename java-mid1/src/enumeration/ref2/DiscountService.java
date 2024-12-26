package enumeration.ref2;

public class DiscountService {

    public int disCount(Grade grade, int price){
        return grade.getDiscountPercent() * price / 100;
    }
}
