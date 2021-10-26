package ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CastingEx {
    @Test
    void ex1(){
        double d = 85.4;
        int score = (int)d;

        assertThat(score).isEqualTo(85);
    }
}
