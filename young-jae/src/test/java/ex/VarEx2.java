package ex;

import org.junit.jupiter.api.Test;

public class VarEx2 {
    @Test
    void test2(){
        int x = 10, y = 20, temp;

        System.out.println("x: "+ x +" y: "+ y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+ x +" y: "+ y);
        System.out.println("x: "+ 10 +" y: "+ 20);
        // 덧셈 연산자는 두 값을 더하기도 하지만 문자열과 숫자를 하나로 결합하기도 한다
    }
}
