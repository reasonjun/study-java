package chap3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Ex3Test {

    @ParameterizedTest
    @MethodSource
    void solution(int score, char expected) {
        Ex3 ex3 = new Ex3(score);
        assertThat(ex3.solution()).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(95, 'A'),
            Arguments.of(85, 'B'),
            Arguments.of(65, 'D'),
            Arguments.of(55, 'D')
        );
    }

    @Test
    void 문제3_2() {
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기

        int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0);

        assertThat(numOfBucket).isEqualTo(13);
    }

    @ParameterizedTest
    @MethodSource
    void 문제3_3(int num, String expected) {
        String answer = num > 0 ? "양수" : (num == 0 ? "0" : "음수");

        assertThat(answer).isEqualTo(expected);
    }

    private static Stream<Arguments> 문제3_3() {
        return Stream.of(
            Arguments.of(10, "양수"),
            Arguments.of(0, "0"),
            Arguments.of(-1, "음수")
        );
    }

    @Test
    void 문제3_4() {
        int num = 456;
        assertThat(solution3_4(num)).isEqualTo(400);
    }

    private int solution3_4(int num) {
        return num / 100 * 100;
    }

    @Test
    void 문제3_5() {
        int num = 333;
        assertThat(solution3_5(num)).isEqualTo(331);
    }

    private int solution3_5(int num) {
        return (num / 10 * 10) + 1;
    }

    @ParameterizedTest
    @MethodSource
    void 문제3_6(int num, int expected) {
        assertThat(10 - (num % 10)).isEqualTo(expected);
    }

    private static Stream<Arguments> 문제3_6() {
        return Stream.of(
            Arguments.of(24, 6),
            Arguments.of(19, 1),
            Arguments.of(81, 9)
        );
    }

    @Test
    void 문제3_7() {
        int fahrenheit = 100;
        float celcius = (int) ((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
        System.out.println(fahrenheit);
        System.out.println(celcius);
    }

    @Test
    void 문제3_8() {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);

        char ch = 'A';
        ch = (char) (ch + 2);

        float f = 3 / 2f;
        long l = 3000 * 3000 * 3000L;

        float f2 = 0.1f;
        double d = 0.1;

        boolean result = (float) d == f2;

        System.out.println("c=" + c);
        System.out.println("ch=" + ch);
        System.out.println("f=" + f);
        System.out.println("l=" + l);
        System.out.println("result=" + result);

    }





}
