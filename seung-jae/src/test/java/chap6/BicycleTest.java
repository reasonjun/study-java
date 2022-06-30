package chap6;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class BicycleTest {

    private Bicycle bicycle = new Bicycle();

    @Test
    void test() {
        bicycle.setBrandName("삼천리");
        bicycle.upSpeed(50);
        bicycle.changeGear(5);
        bicycle.brake(20);

        assertThat(bicycle.brandName).isEqualTo("삼천리");
        assertThat(bicycle.speed).isEqualTo(30);
        assertThat(bicycle.gear).isEqualTo(5);
    }

}
