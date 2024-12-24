package lang.math.test;

import java.util.Arrays;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNumber = lottoGenerator.generate();
        System.out.println(Arrays.toString(lottoNumber));
    }
}
