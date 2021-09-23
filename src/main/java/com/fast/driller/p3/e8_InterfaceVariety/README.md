# 인터페이스의 여러가지 요소

## Abstract(추상) 메서드
모든 선언된 메서드는 추상 메서드

## Default(디폴트) 메서드
자바 8 버전부터 사용 가능한 메서드로,
- 구현을 가지는 메서드
- 인터페이스를 구현하는 클래스(특히 이 경우 디폴트 메서드 재정의 가능)

에서 공통적으로 사용할 수 있는 기본 메서드

```java
// 디폴트 메서드
default void description() {
	System.out.println("정수 계산기를 구현합니다")
	myMethod();
}

// CompleteCalc.java
@Override
public void description() {
	System.out.println("CompleteCalc에서 재정의한 default 메서드");
}
```

## Static(정적) 메서드
자바 8 버전부터 사용 가능한 메서드로, 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드

## Private 메서드
자바 9 버전부터 사용 가능한 메서드로, 인터페이스를 구현한 클래스에서 사용하거나 재정의할 수 없고 인터페이스 내부에서만 사용하기 위해 구현하는 메서드 ➡️ `default` 메서드나 `static` 메서드에서 사용

