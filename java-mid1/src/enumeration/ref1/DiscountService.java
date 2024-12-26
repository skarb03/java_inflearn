package enumeration.ref1;

public class DiscountService {

    public int disCount(ClassGrade grade, int price){
        return grade.getDiscountPercent() * price / 100;
    }
}
