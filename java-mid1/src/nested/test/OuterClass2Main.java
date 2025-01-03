package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 obj = new OuterClass2();
        OuterClass2.InnerClass inner = obj.new InnerClass();
        inner.hello();
    }
}
