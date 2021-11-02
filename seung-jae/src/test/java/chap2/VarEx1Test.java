package chap2;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class VarEx1Test {

    @Test
    void test() {
        int year = 0;
        int age = 21;

        year = age + 2000; //변수 age + 2000
        age += 1; //age 저장된 값 1증가

        assertThat(year).isEqualTo(2021);
        assertThat(age).isEqualTo(22);
    }

}