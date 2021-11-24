package chap12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DiscountTest {

    @Test
    void test() {
        final String user = "MEMBER";
        final int money = 5000;
        int discountMoney = 0;

        if (user.equals(Discount.MEMBER.name())) {
            discountMoney = Discount.MEMBER.discount(money);
        }else if (user.equals(Discount.GUEST.name())) {
            discountMoney = Discount.GUEST.discount(money);
        }

        assertThat(discountMoney).isEqualTo(4500);
    }

}