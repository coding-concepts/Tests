package ccs.test.mvn.level1.one;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibbonacciNthNumberTest {

    @Test(expected = BadArgumentException.class)
    public void testNegativeFibonacci() {
        FibbonacciNthNumber.findFibbonacci(-1);
    }

    @Test(expected = BadArgumentException.class)
    public void testzeroFibonacci() {
        FibbonacciNthNumber.findFibbonacci(0);
    }

    @Test
    public void testOneFibonacci() {
        assertThat(FibbonacciNthNumber.findFibbonacci(1)).isEqualTo(1);
    }

    @Test
    public void test17Fibonacci() {
        assertThat(FibbonacciNthNumber.findFibbonacci(17)).isEqualTo(1597);
    }

    @Test
    public void test31Fibonacci() {
        assertThat(FibbonacciNthNumber.findFibbonacci(31)).isEqualTo(1346269);
    }
    @Test
    public void testRandom() {
        for (int key: DataFactory.map.keySet())
        assertThat(FibbonacciNthNumber.findFibbonacci(key)).isEqualTo(DataFactory.map.get(key));
    }
}
