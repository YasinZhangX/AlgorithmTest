package Util;

import java.util.Random;

/**
 * @author Yasin Zhang
 */
public class RandomUtil {

    private Random random;

    public RandomUtil() {
        random = new Random();
    }

    public RandomUtil(long seed) {
        random = new Random(seed);
    }

    public int nextInt(int lowerBound, int upperBound) {
        return random.nextInt(upperBound-lowerBound+1) + lowerBound;
    }

}
