## 스택과 메서드

### 스택(Stack)
함수가 호출될 때 지역변수들이 사용하는 메모리로, 함수 수행이 끝나면 자동으로 반환된다.

### 메모리 생성순서와 스택
(4) add 함수 수행 후 해당 메모리 자동해제  
(3) add 함수가 사용할 메모리 공간이 스택에 생성됨  
(2) main 함수에서 add 함수를 호출함  
(1) main 함수가 사용할 메모리 공간이 스택에 생성됨  

### 메서드(method)
객체의 기능을 구현하기 위해 클래스 내부에 구현된 함수  
➡ C++에서는 멤버함수(member function)라고 부른다.

----

## 인스턴스와 힙

### 클래스(Class)
객체의 **속성(=멤버변수)**을 프로그래밍 코드로 정의(만) 해놓은 것

### 메서드(method)
클래스의 멤버변수(=속성)을 활용하여 클래스의 기능을 구현한 함수

### 인스턴스(instance)
new 키워드를 통해 클래스를 **힙에 생성해놓은 것(=참조변수)**
➡️ 서로 다른 멤버변수 값을 갖는 객체

### 참조값
생성된 인스턴스의 힙 주소값

### 힙(Heap)
**동적 메모리**(필요할 때 할당받고, 필요가 없어지면 다시 회수)를 의미하며, 생성된 인스턴스가 바로 이 힙에 할당된다.  
➡️ 하나의 클래스에서 생성된 여러 인스턴스는 각각 다른 메모리 주소(**JVM**이 부여한 가상 주소임)를 갖는다.
- C나 C++에서는 사용한 동적 메모리를 free() 또는 delete를 활용하여 개발자가 직접 해제해야 함
- Java에서는 **GC(Garbage Collector)**가 주기적으로 사용하지 않는 동적 메모리들을 해제 및 수거

### 함수(function)
함수의 반환 자료형, 함수의 이름, 매개변수, 그리고 몸체로 구성된다.
1. int형 결과값을 반환하는 함수일 경우
```java
public static int add(int num1, int num2) {  -> 지역변수 num1, 지역변수 num2
	int result;                          -> 지역변수 result
	result = num1 + num2
return result;
}
```
2. 반환 자료형이 따로 없는 함수일 경우 -> void 활용
```java
public static void sayHello(String greeting) {
	System.out.println(greeting);
}
```