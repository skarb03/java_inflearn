package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random rand = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while(count < 6) {
            int number = rand.nextInt(45) + 1;
            if(checkDup(number)){
                lottoNumbers[count++] = number;
            }
        }

        return lottoNumbers;
    }

    private boolean checkDup(int target) {
        for(int i = 0; i < count; i++) {
            if(lottoNumbers[i] == target) {
                return false;
            }
        }
        return true;
    }
}
