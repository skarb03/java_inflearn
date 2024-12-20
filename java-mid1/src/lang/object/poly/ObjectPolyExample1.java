package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        if(obj instanceof Car car) {
            car.move();
        } else if(obj instanceof Dog dog) {
            dog.sound();
        }
    }
}
