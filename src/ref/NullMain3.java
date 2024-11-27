package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bd = new BigData();
        bd.data = new Data();
        System.out.println(bd.count);
        System.out.println(bd.data);

        System.out.println(bd.data.value);
    }
}
