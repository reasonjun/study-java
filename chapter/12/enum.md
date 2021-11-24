# 열거형(Enum)

## 열거형이란?

열거형은 서로 관련된 상수를 편리하게 선언하기 위한 것

열거형은 값뿐 아니라 타입도 관리하기 때문에 논리적 오류를 줄일 수 있다.

열거형을 선언하는 것은 클래스를 정의하듯이 똑같이 한다.

열거형 클래스 안에는 메소드와 기타 필드들이 포함될 수 있다.

컴파일러는 열거형을 생성할 때 특수 메소드들을 자동으로 추가해준다.

대표적으로 `values()` 가 있다.

열거형은 기본적으로 `java.lang.Enum`을 상속받고 있기 때문에 상속을 할 수 없다.

## Enum 정의

```java
public enum Direction {
    EAST,
    WEST,
    SOUTH,
    NORTH
}
```

`enum`은 단순히 이 상수만 선언할 수 있는 것이 아니라,

이 값에 멤버를 추가해줄 수 있다.

```java
public enum Direction {
    EAST(3),
    WEST(2),
    SOUTH(1),
    NORTH(0);

    private final int move;

    Direction(final int move) {
        this.move = move;
    }

    public int getMove() {
        return move;
    }
}
```

### 열거형에 추상 메소드 정의

회원과 비회원에 따라 할인해주는게 있다면

```java
public enum Discount {
    MEMBER {
        @Override
        int discount(final int money) {
            money -= money * 0.1;
            return money;
        }
    },
    GUEST {
        @Override
        int discount(final int money) {
            money -= money * 0.05
            return money;
        }
    };

    abstract int discount(final int money);
    
}
```
```java
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
```