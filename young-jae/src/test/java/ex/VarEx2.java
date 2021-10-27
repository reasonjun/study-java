package ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VarEx2 {
    @Test
    void test2(){
        int x = 10;
        int y = 20;

        System.out.println("x: "+ x +" y: "+ y);

        int temp = x;
        x = y;
        y = temp;

        // 덧셈 연산자는 두 값을 더하기도 하지만 문자열과 숫자를 하나로 결합하기도 한다
        assertThat(x).isEqualTo(20);
        assertThat(y).isEqualTo(10);

    }
}
