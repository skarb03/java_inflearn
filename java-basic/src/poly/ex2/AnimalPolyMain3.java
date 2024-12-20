package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animals) {
            extracted(animal);
        }
    }

    private static void extracted(Animal animal) {
        System.out.println("동물 소리 테스트  추가");
        animal.sound();
        System.out.println("동물 소리 테스트  종료");
    }

}
