package enumeration.ref3;

public class DiscountService {

    public int disCount(Grade grade, int price){
        return grade.discount(price);
    }
}
