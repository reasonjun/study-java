# 컬렉션 프레임워크

데이터 군을 저장하는 클래스들을 표준화한 설계

## 컬렉션 프레임워크의 핵심 인터페이스

컬렉션 프레임웍에서는 컬렉션 데이터 그룹을 크게 3가지 타입이 존재한다고 했고,

그 인터페이스중 `List<T>`와 `Set<T>`의 공통된 부분을 다시 추출해 `Collection`을 추가로 정의하였다.

## 각 컬렉션 별 특징

- `List`
  - 순서가 있는 데이터 집합
  - 데이터의 중복 ⭕
- `Set`
  - 순서를 유지하지 않는 데이터 집합
  - 중복을 허용 ❌
- `Map`
  - Key, Value 쌍으로 이루어진 데이터 집합
  - 순서는 유지되지 않으며, 키는 중복 허용 ❌, 값은 중복 허용 ⭕

## ArrayList

컬렉션 프레임워크중 가장 많이 쓰는 컬렉션 클래스

ArrayList는 List인터페이스를 구현하기 때문에 데이터의 저장순서가 유지되고 중복을 허용한다

ArrayList는 Vector를 개선한 것으로 Vector의 구현원리와 기능적 측면에서 동일하다

JDK 7 이상부터는 제네릭을 사용할 수 있다.

`List<String> list = new ArrayList<>();`

jdk 8 이상부터는 `stream()`을 제공하여 스트림을 수행할 수도 있다.

컬렉션을 순회하는 방법

컬렉션을 순회하는 방법에는 집계연산, for-each, Iterator 세가지가 있다.

### 집계 작업

집계 작업은 대부분 람다식과 메소드 체이닝으로 이루어져 있다.

```
myCollection.stream()
            .filter(e -> e.getColor() == Color.RED)
            .forEach(collection -> System.out.println(collection.getName()));
```

이렇게 filter 메소드나 다른 map으로 데이터를 가공하여 forEach로 각각을 조합해주면 된다.

### for-each

인덱스 변수가 필요한 작업일 때에는 일반적 for문인

`for(int i = 0; i < length; i++)` 를 사용하면 되고,

향상된 for문으로 `for(String name : 순회할 컬렉션)` 으로 사용하면 되겠다.

### 반복자(Iterator)

```java
import java.util.Arrays;
import java.util.Iterator;

public class Foo {

  public static void main(String[] args) {
    Iterator<Integer> iterator = Arrays.asList(1, 2, 3, 4, 5).iterator();
    
    while (iterator.hasNext()) {
      //반복 연산수행
    }
  }

}

```