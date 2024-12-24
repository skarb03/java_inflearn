package lang.clazz;

import java.lang.reflect.Field;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception{
        //Class조회
        Class clazz = String.class;// 1. 클래스에서 조회
//        Class<? extends String> clazz1 = new String().getClass();
//        Class<?> clazz2 = Class.forName("java.lang.String");


        // 모든 필드 출력
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("field: " + declaredField.getName());
        }
        //상위 클래스 정보 출력
        System.out.println("Superclass: " + clazz.getSuperclass());

        //인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("interface: " + i);
        }
    }
}
