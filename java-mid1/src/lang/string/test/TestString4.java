package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String fileName = str.substring(0, str.indexOf(".txt"));
        String extName = str.substring(str.lastIndexOf(".txt"));
        System.out.println(fileName);
        System.out.println(extName);
    }
}
