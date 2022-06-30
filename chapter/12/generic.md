# 제네릭

1.5버전 부터 도입된 제네릭

## 제네릭이란?

다양한 타입의 객체들을 다루는 메소드나 컬렉션 클래스들을 컴파일 시에 타입 체크를 해주는 기능

객체의 타입 안정성을 높이고 형변환의 번거로움을 줄인다.

- 제네릭의 장점
  - 타입 안정성을 제공
  - 타입체크와 형변환을 생략할 수 있어 코드가 간결해진다.

## 제네릭 클래스 선언

```java
public class Foo {

    Object item;

    public void setItem(final Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}
```

여기서 제네릭을 쓰게 되면

```java
public class Foo<T> {
    T item;

    public void setItem(final T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
```

## 제네릭 유형 매개변수 컨벤션

이 매개변수는 보통 한글자로 된 대문자를 사용한다.

이 규칙이 없다면 이 타입변수와 클래스 이름의 차이를 구분하기 어려울 수 있다.

일반적으로 아래와 같은 변수들을 많이 사용한다

- E
  - Element (자바 Collection Framework에서 많이 사용)
- K
  - Key 
- N
  - Number
- T
  - Type
- V
  - Value
- S, U, V
  - S - 2번째 인수 
  - U - 3번째 인수
  - V - 4번째 인수

위에서 사용 예시를 들었던 `Foo` 클래스를 인스턴스화 할 때는

```java
Foo<String> foo = new Foo<String>();
```

이렇게 `new` 키워드가 붙는쪽도 제네릭을 써주어야 했다.

하지만 자바 7 버전 이상에서는 `new Foo<>()` 만 써서 할당이 가능하다.

### 제한된 제네릭 클래스

타입 매개변수에 지정할 수 있는 타입 종류를 제한하는 방법도 존재한다.

제네릭 뒤에 `extends`를 사용하면 특정 타입의 자식들만 대입하는 것이 가능해진다.

```java
class FruitBox<T extends Fruit> { //Fruit의 자손타입만 지정가능
    List<T> list = new ArrayList<>();
}
```

### 와일드카드

제네릭 타입만 같다고 메소드 오버로딩을 할 수 없다.

그래서 고안된게 바로 `와일드카드`이다. 표기법은 `<?>`로 표현하는데

와일드 카드는 어떠한 타입도 될 수 있다.

`?`만 사용하면 Object와 다를게 없다.

그래서 위에서 사용했던 `extends`나 `super`또한 사용해서 제한해줄 수 있다.

- `<? extends T>`
  - 와일드 카드의 상한 제한
  - T와 그 자식만 가능
- `<? super T>`
  - 와일드 카드의 하한 제한
  - T와 그 부모만 가능
- `<?>`
  - 제한 없음
  - 모든 타입이 가능. `<? extends Object>`과 같음

