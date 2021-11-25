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