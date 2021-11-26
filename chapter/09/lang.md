# java.lang 패키지

java.lang 패키지는 자바의 가장 기본이 되는 클래스들을 포함하고 있는 패키지이다.

그래서 java.lang에 있는 클래스들은 import 없이도 사용이 가능하다.

## Object

최고 부모 클래스인 `Object`

그래서 이 클래스의 멤버들은 바로 사용이 가능하다.

### equals

`equals()`는 동등성 비교이다.

동등성 비교는 단순하게 값만 비교하는 것일뿐, 주소까지 비교하지는 않는다.

예를 들어

```java
class Value {
    int value;
    
    public Value(int value) {
        this.value = value;
    }
}
```
```java
public class ValueTest {
    final Value v1 = new Value(10);
    final Value v2 = new Value(10);

    @Test
    void test() {
        assertFalse(v1.equals(v2));
    }
}
```

이 테스트 결과는 거짓이 나오므로 테스트가 통과한다.

단순히 값만 비교를 하기 때문에 주소가 다른 두 객체는 무조건 `false`로 나올 수 밖에 없다.

추가적으로 동일한 객체는 동일한 해시함수를 가져야 하기 때문에

`equals()`를 재정의 했다면 `hashCode()` 또한 재정의를 해주어야 한다.

### hashCode

hashCode 메소드에 정의되어있는 내용을 보면,

Java 응용 프로그램을 실행하는 동안 동일한 개체에서 두 번 이상 호출될 때마다 

`hashCode` 메서드는 개체에 대한 equals 비교에 사용된 정보가 수정되지 않는 한 일관되게 동일한 정수를 반환해야 한다.

이 정수는 한 애플리케이션 실행에서 동일한 애플리케이션의 다른 실행까지 일관성을 유지할 필요가 없다.

`equals(Object)` 메서드에 따라 두 객체가 같으면 두 객체 각각에 대해 `hashCode` 메서드를 호출하면

동일한 정수 결과가 생성되어야 한다.

라고 명시되어 있다.

### getClass

이 메소드는 자신이 속한 클래스의 `Class`객체를 반환해줌.

`Class`객체는 이름 자체가 `Class`인 클래스 객체이다.

이 객체는 클래스의 모든 정보를 가지고 있으며, 클래스당 1개만 존재한다.

클래스 파일이 클래스 로더에 의해 메모리에 올라갈 때, 자동으로 생성된다.

클래스 로더는 실행 시에 필요한 클래스를 동적으로 메모리에 로드하는 역할을 수행한다.

`.class` 파일 형태로 저장된 클래스를 읽어 `Class`클래스에 정의된 형식으로 변환하는 것.

클래스 파일을 읽어서 사용하기 편한 상태로 저장해 놓은 것이 바로 `클래스 객체`이다.

### 클래스 객체를 얻는 방법

클래스의 정보가 필요할 때에는, `Class`객체에 대한 참조를 얻어와야 한다.

```
Class object1 = new Card().getClass(); //생성된 객체로부터 얻는 방법
Class object2 = Card.class;            //클래스 리터럴로부터 얻는 방법
Class object3 = Class.forName("Card"); //클래스 이름으로부터 얻는 방법 
```

# String

자바에서는 문자열을 위한 클래스를 `String` 클래스로 정의하고 있다.

## 변경 불가능한 클래스

`String` 클래스에는 문자열을 저장하기 위해 `char[]`배열을 인스턴스 변수로 가지고 있다.

예를 들어,

`String str = "abc";`

라고 정의하면 내부에서 동작하는 방식은

```
char[] data = {'a', 'b', 'c'};
String str = new String(data);
```

가 된다. `String`은 불변 객체로써 생성된 후에 값을 변경할 수 없다.

`StringBuffer`는 문자열 변경이 가능하다.

불변객체니까 값을 할당하고 새로 할당하면 예전 참조를 하고있던 문자열 매핑된 주소를 끊고

새로운 주소를 `String` 클래스에 할당 해주는 것이다.

계속해서 주소를 할당하기 때문에 변경이 잦다면 `StringBuffer`를 사용해야 한다.

## 문자열 비교

문자열을 만들때에는, 2가지 방법이 있는데

```
String str1 = "abc";
String str2 = new String("abc");
```

이렇게 두가지 방법이다.

문자열을 직접할당하는 str1은 똑같이 같은 문자열을 다른 변수한테 할당을 해주어도

저 문자열을 문자열 리터럴에서 공유하기 때문에 주소값이 같다.

반면에

아래의 방법으로 생성하게 되면 `new` 키워드를 통해 인스턴스화를 시키기 때문에

매번 새로운 인스턴스를 생성하기 때문에 주소값이 달라진다.

## 문자열 리터럴

소스파일에 포함된 문자열 리터럴은 컴파일 시에 클래스 파일에 저장된다.

같은내용의 문자열은 한번만 저장이 된다.

이 리터럴도 `String` 클래스이고, 생성하면 내용을 변경할 수 없어서

이 하나의 인스턴스를 공유하면 된다.

## StringBuffer, StringBuilder

### StringBuffer
`String`은 인스턴스를 생성할 때, 불변 객체로 생성을 하지만,

`StringBuffer`는 변경 작업에 용이하다.

내부적으로 버퍼를 가지고 있는데, 크기를 지정할 수 있다.

그래서 버퍼의 길이를 충분히 잡아주는 것이 좋다.

### StringBuilder

`StringBuilder`는 멀티스레드에서 `Thread-safe`한 객체이다.

멀티스레드로 구현이 되어있지 않다면 이것을 쓰게되는것은 오히려 성능 저하의 우려가 있다.

![image](https://user-images.githubusercontent.com/74235102/143547020-bcc48a84-d1ba-4c2b-9cda-889af1952382.png)
