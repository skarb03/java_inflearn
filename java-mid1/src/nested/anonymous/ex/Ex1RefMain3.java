package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain3 {

    public static void hello(Proccess proccess) {
        System.out.println("프로그램 시작");
        //코드 조각 시작
        proccess.run();
        //코드 조각 종료
        System.out.println("프로그램 종료");
    }



    public static void main(String[] args) {

        hello(new Proccess() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });
        hello(new Proccess() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}
