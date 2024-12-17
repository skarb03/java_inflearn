package poly.ex3;

public class Dog extends AbstractAnimal {

    @Override
    public void move() {
        System.out.println("개이동");
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
