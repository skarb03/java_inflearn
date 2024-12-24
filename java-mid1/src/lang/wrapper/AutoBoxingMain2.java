package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {

        //Primitive = Wrapper
        int value = 7;
        Integer boxedValue = value; //오토 박싱

        // Wrapper= Primitive
        int unboxedValue = boxedValue; //오토 언박싱

        System.out.println("boxed value is " + boxedValue);
        System.out.println("unboxed value is " + unboxedValue);


    }
}
