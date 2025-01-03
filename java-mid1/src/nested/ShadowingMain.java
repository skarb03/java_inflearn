package nested;

public class ShadowingMain {

    private int value = 1;

    class Inner {
        private int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShadowingMain.value = " + ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain m = new ShadowingMain();
        Inner inner = m.new Inner();
        inner.go();
    }
}
