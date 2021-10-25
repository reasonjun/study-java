package ex;

import org.junit.jupiter.api.Test;

public class OverFlowTest {
    @Test
    void 오버플로우() {
        int a = Integer.MAX_VALUE;
        System.out.println(a); //최대값
        System.out.println(a + 1); //1더하면 보수에 의한 오버플로우
    }

}
