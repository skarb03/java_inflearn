package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis: " + currentTimeMillis);

        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano: " + currentTimeNano);

        System.out.println("getenv = "+ System.getenv());

        System.out.println("property = " + System.getProperties());
        System.out.println("Java version" + System.getProperty("java.version"));

        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copyArray = new char[originalArray.length];
        System.arraycopy(originalArray, 0, copyArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copyArray = " + Arrays.toString(copyArray));

        //프로그램종료
        System.exit(0);
    }
}
