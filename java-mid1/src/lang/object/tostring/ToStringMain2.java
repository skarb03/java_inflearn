package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car modelY = new Car("model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 2);

        System.out.println("1 단순 toString 호출");
        System.out.println(modelY.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2 println 내부에서 toString 호출");
        System.out.println(modelY);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 활용성 출력");
        ObjectPrinter.print(modelY);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        String i = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println(i);

    }
}
