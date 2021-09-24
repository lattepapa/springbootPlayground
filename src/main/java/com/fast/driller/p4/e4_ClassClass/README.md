## Class 클래스
자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성된다.
- 이때 Class 클래스는 컴파일된 이 class 파일로부터 객체를 동적 로드하고,
- 정보를 가져오는 메서드를 제공한다.(`Class.forName("클래스명")`)

```java
// forName() 메서드를 활용하여 클래스를 동적 로드하는 방법
Class c = Class.forName("java.lang.String");

// 클래스 이름으로 직접 Class 클래스를 로드하는 방법
Class c = String.class;

// 생성된 인스턴스에서 Class 클래스를 로드하는 방법
String s = new String();
Class c = s.getClass();
```

### 동적 로드
컴파일 시에 데이터 타입이 binding 되는 것이 아닌, 실행(runtime) 중에 데이터 타입을 binding 하는 방법을 의미한다.
- 프로그래밍 시에는 문자열 변수로 처리했다가, 런타임 시에 원하는 클래스를 로딩하여 binding 할 수 있다는 것이 가장 큰 장점이다.
- 컴파일 시에 타입이 정해지지 않으므로 동적 로딩 시 오류가 바생할 경우 프로그램에 심각한 장애가 발생할 수 있는 리스크도 있다.

### newInstance() 메서드
`new` 키워드가 아니라 `newInstance()` 메서드로도 인스턴스를 생성할 수 있다.

### 클래스 정보 알아보기
