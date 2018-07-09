package ccs.test.mvn.level1.one;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorTest {

    @Test(expected = BadArgumentException.class)
    public void testNegativeFactor() {
        Factor.getAllFactors(-1);
    }

    @Test(expected = BadArgumentException.class)
    public void testZeroFactor() {
        Factor.getAllFactors(0);
    }

    @Test
    public void testFactor_25() {
        List<Integer> factors = Factor.getAllFactors(25);
        assertThat(factors).isNotNull();
        assertThat(factors.size()).isEqualTo(3);
        assertThat(factors.get(0)).isEqualTo(1);
        assertThat(factors.get(1)).isEqualTo(5);
        assertThat(factors.get(2)).isEqualTo(25);
    }

    @Test
    public void testFactor_8() {
        List<Integer> factors = Factor.getAllFactors(8);
        assertThat(factors).isNotNull();
        assertThat(factors.size()).isEqualTo(4);
        assertThat(factors.get(0)).isEqualTo(1);
        assertThat(factors.get(1)).isEqualTo(2);
        assertThat(factors.get(2)).isEqualTo(4);
        assertThat(factors.get(3)).isEqualTo(8);
    }
    @Test
    public void testFactor_89() {
        List<Integer> factors = Factor.getAllFactors(89);
        assertThat(factors).isNotNull();
        assertThat(factors.size()).isEqualTo(2);
        assertThat(factors.get(0)).isEqualTo(1);
        assertThat(factors.get(1)).isEqualTo(89);
    }

}
