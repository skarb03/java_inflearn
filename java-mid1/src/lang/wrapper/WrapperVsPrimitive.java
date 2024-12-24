package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iteration = 1_000_000_000; //반복 횟수 설정, 10억
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간 " + (endTime - startTime) + "ms");


        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            sumWrapper += i; // 오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 long 실행 시간 " + (endTime - startTime) + "ms");


    }
}