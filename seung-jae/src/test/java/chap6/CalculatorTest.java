package chap6;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void 덧셈() {
        assertThat(Calculator.ADD.calculate(5, 4)).isEqualTo(9);
    }

    @Test
    void 뺄셈() {
        assertThat(Calculator.SUB.calculate(5, 3)).isEqualTo(2);
    }

    @Test
    void 곱셈() {
        assertThat(Calculator.MUL.calculate(5, 2)).isEqualTo(10);
    }

    @Test
    void 나눗셈() {
        assertThat(Calculator.DIV.calculate(4, 2)).isEqualTo(2.0);
    }

}