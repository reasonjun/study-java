package chap4;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class Ex4Test {

    Ex4 ex4 = new Ex4();

    @Test
    void 문제4_3() {
        assertThat(ex4.solution4_3()).isEqualTo(220);
    }

    @Test
    void 문제4_4() {
        ex4.solution4_4();
    }
}
