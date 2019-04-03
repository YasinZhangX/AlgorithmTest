package fibonacciNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yasin Zhang
 */
public class MatrixTest {

    @Test
    public void testMul() {
        Matrix2 A = new Matrix2(3, 4, 6, 8);
        Matrix2 B = new Matrix2(5, 6, 7, 4);
        Matrix2 result1 = new Matrix2(43, 34, 86, 68);
        Assert.assertEquals(true, result1.equals(Matrix2.mul(A, B)));
    }

}
