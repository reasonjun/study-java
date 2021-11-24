package chap12;

public enum Discount {
    MEMBER {
        @Override
        int discount(final int money) {
            return (int) (money - (money * 0.1));
        }
    },
    GUEST {
        @Override
        int discount(final int money) {
            return (int) (money - (money * 0.05));
        }
    };

    abstract int discount(final int money);

}
