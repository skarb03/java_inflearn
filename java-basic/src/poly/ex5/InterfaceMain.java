package poly.ex5;


public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        animalSound(dog);
        animalSound(cat);
        animalSound(cow);

        animalMove(dog);
        animalMove(cat);
        animalMove(cow);
    }

    public static void animalSound(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }


    public static void animalMove(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.move();
        System.out.println("동물 소리 테스트 종료");
    }
}
