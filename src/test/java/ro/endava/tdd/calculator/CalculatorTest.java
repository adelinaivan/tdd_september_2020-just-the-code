package ro.endava.tdd.calculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertThat(new Calculator().add(2, 3)).isEqualTo(5);
    }

}
