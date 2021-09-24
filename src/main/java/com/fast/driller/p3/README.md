# 지금까지 남았던 궁금즘 해결
## 주소값 비교와 Value 비교
다음과 같이 변수에 값이 대입되었을 때, `equals()` 메서드와 `==` 연산자의 결과는 각각 아래와 같다.
```java
String a = "111";
String b = a;
String c = new String("111");
```

```java
System.out.println(a.equals(b)); // true
System.out.println(a.equals(c)); // true

System.out.println(a == b); // true
System.out.println(a == c); // false
```

이를 정리하면 다음과 같다.

|`equals()`|`==`|
|---|---|
|Call By Value|Call By Reference|
|Value를 할당받은 primitive type 그 자체|선언과 함께 주소값이 부여된 객체|

따라서 클래스나 객체를 비교할 때에는 `==` 연산자를, 객체의 key:value를 비교할 때에는 `equals()` 메서드가 유용할 수 있다. 물론 이것은 절대적인 것이 아니라 상황에 따라 다르다,


## Abstract 클래스와 인터페이스의 차이
인터페이스는 Abstract 클래스보다 한단계 더 추상화한 것이라고 생각하는 것이 낫다. =

|-|Abstract 클래스|인터페이스|
|----|----|----|
|목적|동일부모를 갖는 클래스를 하나로 묶기위함|구현객체가 같은 동작을 행함을 보장하기 위함|
|`new` 키워드로 객체생성|가능|불가|
|상속|단일상속만 가능 (ex) `public class Level1 extends PlayerLevel {}`|다중상속가능 (ex) `interface Attack extends Strike, Spell {}`|
|속성(멤버변수)|-|아무 인스턴스도 존재할 수 없으므로, 임의로 마치 구현객체 같은 상태를 보장하기 위해 모든 필드는 `public static final`을 함의|
|메서드|`public abstract`, `final public void` 등|`public abstract`, `public default` 등|
|조건|`abstract`로 선언한 메서드는 반드시 자식클래스가 구현해야함(`@Override`)|Abstract 클래스의 경우와 동일|