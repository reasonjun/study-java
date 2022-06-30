package chap11;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class DescendingTest {

    @Test
    void test() {
        String[] arr1 = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(arr1);
        assertThat(Arrays.toString(arr1)).isEqualTo("[Dog, cat, lion, tiger]");

        Arrays.sort(arr1, String.CASE_INSENSITIVE_ORDER); //대소문자 구분 X
        assertThat(Arrays.toString(arr1)).isEqualTo("[cat, Dog, lion, tiger]");

        Arrays.sort(arr1, new Descending());
        assertThat(Arrays.toString(arr1)).isEqualTo("[tiger, lion, cat, Dog]");

    }

}