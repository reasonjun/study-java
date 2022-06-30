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

## LinkedList

배열은 기본적 형태의 자료구조로써 구조가 간단하고 사용하기가 쉽다.

데이터를 읽어오는 데에 걸리는 시간도 가장 빠르다.

단점은

1. 크기를 변경할 수 없다.
2. 비 순차적인 데이터의 추가 또는 삭제에 시간이 많이 걸린다.

|컬렉션|접근시간|추가/삭제|특징|
|:---:|:---:|:---:|:---|
|ArrayList|빠르다|느리다|순차적인 추가삭제는 더 빠름.<br> 비효율적인 메모리 사용|
|LinkedList|느리다|빠르다|데이터가 많을수록 접근성이 떨어짐|

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

## Comparator, Comparable

Arrays.sort()를 호출하면 정렬이 자동으로 되었는데,

이는 자동 정렬이 아니라 `Comparable` 의 구현에 의해 정렬이 되었던 것이다.

`Comparator`, `Comparable` 두가지는 모두 인터페이스로 컬렉션을 정렬하는데 필요한

메소드들을 정의하고 있으며, `Comparable`을 구현하고 있는 클래스들은 같은 타입의 인스턴스끼리

서로 비교할 수 없는 클래스들이고, 기본적으로 오름차순으로 정렬되도록 되어있다.

**Comparable** - 기본 정렬기준을 구현하는데 사용
**Comparator** - 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용


## HashSet

`HashSet`은 `Set`인터페이스를 구현한 대표적 클래스

중복된 요소를 저장하지 않음.

`HashSet`은 `ArrayList`와는 다르게 저장순서를 유지하지 않음.

저장한 순서가 필요하다면 `LinkedHashSet`을 사용해야 한다.

## TreeSet

`TreeSet`은 이진 검색 트리 구조의 형태로 데이터를 저장한다.

이진 검색트리는 정렬, 검색, 범위검색에 높은 성능을 보이는 자료구조이고,

`TreeSet`은 이진 검색 트리의 성능을 향상시킨 `레드-블랙 트리`로 구현되어 있다.

그러면서 `Set` 인터페이스를 구현했기 때문에

중복된 데이터의 저장은 허용하지 않고, 정렬된 위치에 저장하여 저장순서를 유지하지 않는다.

### TreeSet 저장과정

![image](https://user-images.githubusercontent.com/74235102/142801434-80ffa78d-d0c1-4444-a0cb-02460e656187.png)

## HashMap, HashTable

`HashMap`은 `null`을 허용한다.

`HashTable`은 키, 값 두개가 `null`인것을 허용하지 않는다.

`HashMap`은 키와 값을 각각 `Object`타입으로 저장한다.

그래서 어떤 객체도 저장을 할 수 있지만 키는 `String`을 주로 사용,

- 키(key)
  - 컬렉션 내의 키(key) 중에서 유일해야함.
- 값(value)
  - 키(key)와 달리 데이터의 중복을 허용한다.

부하 계수는 기본값이 0.75인데,

시간과 공간 비용 사이에 좋은 균형을 맞춘다.

갚이 높을수록 공간 오버헤드는 줄어들지만, 조회 비용이 올라가게 된다.

### 해싱과 해시함수

해싱이란 해시함수를 이용해서 데이터를 해시테이블에 저장하고 검색하는 방법을 말함.

해시함수는 데이터가 저장된 곳을 알려주기 때문에 다량의 데이터 속에서도 원하는 데이터를 빠르게 찾을 수 있다.

해싱에서 사용하는 자료구조는 배열 + `LinkedList` 로 되어있다.

## Collections

`Arrays`가 배열과 관련된 메소드를 제공한 것처럼, `Collections`는 컬렉션과 관련된

메소드들을 제공한다.

### 컬렉션의 동기화

멀티 스레드 프로그래밍에서는 하나의 객체를 여러 스레드가 동시에 접근할 수 있기 때문에

데이터의 일관성을 유지하려면 공유된 객체에 동기화가 필요하다.

`Collections`에서는 이러한 동기화메소드로

`synchronized` 가 앞에 붙은 컬렉션 메소드들을 호출할 수 있다.

`ex) synchronizedList(List list), synchronizedList(Map map), ... 등등`

### 변경불가 컬렉션

책에서는 `unmodifiable` 메소드를 사용하라고 하는데,

자바 9버전부터 나온 `Map.of()`, `List.of()` 등등 `of()` 정적 팩토리 메소드를 활용하면

불변객체를 얻을 수 있는데, 이들은 스레드에 안전하다.

