package fibonacciNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yasin Zhang
 */
public class FibonacciNumberTest {

    @Test
    public void testMul() {
        int result = 34;
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        Assert.assertEquals(result, fibonacciNumber.calcFibonacciNum(9));
    }

}
