package chap7;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class SamsungTvTest {

    @Test
    void test() {
        SamsungTv samsungTv = new SamsungTv();
        samsungTv.channel = 10;
        samsungTv.channelUp();
        assertThat(samsungTv.channel).isEqualTo(11);

        samsungTv.display("hello");
        samsungTv.caption = true;
        samsungTv.display("caption true : Hello~");
    }

}