package poly.ex6;



public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        animalSound(dog);
        animalSound(bird);
        animalSound(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);
    }
    //AbstractAnimal 사용 가능
    public static void animalSound(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    //Fly 인터페이스가 있으면 사용가능
    private static void flyAnimal(Fly fly) {
        System.out.println("날개날기 시작");
        fly.fly();
        System.out.println("날개날기 종료");
    }
}
