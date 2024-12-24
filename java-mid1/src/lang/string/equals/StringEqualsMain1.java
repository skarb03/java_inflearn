package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2= new String("hello");
        System.out.println("new String() == 비교: " + (s1 == s2));
        System.out.println("new String() eqauls 비교: " + (s1.equals(s2)));

        String s3 = "hello";
        String s4 = "hello";

        System.out.println("new String() == 비교: " + (s3 == s4));
        System.out.println("new String() eqauls 비교: " + (s3.equals(s4)));

    }
}
