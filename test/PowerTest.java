import org.junit.Assert;
import org.junit.Test;
import powerNum.PowerNumAlg;

public class PowerTest {

    @Test
    public void testPower() {
        Integer test;
        PowerNumAlg alg = new PowerNumAlg();
        test = alg.power(5, 2);
        Assert.assertEquals(new Integer(25), test);
        test = alg.power(5, 4);
        Assert.assertEquals(new Integer(625), test);
        test = alg.power(5, 6);
        Assert.assertEquals(new Integer(15625), test);
        test = alg.power(5, 8);
        Assert.assertEquals(new Integer(390625), test);
    }

}
