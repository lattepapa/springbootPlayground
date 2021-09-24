# JDK와 Object 클래스
## Object 클래스
모든 클래스의 최상위 클래스로, `java.lang` 패키지에 속해있다.
- 프로그래밍 시 import 하지 않아도 자동으로 import 된다.
- 많이 사용하는 기본 클래스들이 속한 패키지
- 모든 클래스는 Object 클래스를 상속 받는다.

###  toString()
객체의 정보를 String으로 변환

### equals()
두 인스턴스의 value를 비교하여 true/false의 boolean 값을 반환하는 메서드로, 두 인스턴스가 서로 다른 주소값(reference)를 갖더라도 논리적으로 동일한지의 여부만 판단
- (ex) 같은 학번, 같은 사번, 같은 아이디 등 동일 객체를 지목하는 경우 true로 overriding 됨

### hashCode()
인스턴스의 주소값(reference)을 반환하는 메서드로, 힙 메모리에 인스턴스가 저장될 때 JVM이 해시 방식을 활용하는 것을 역으로 이용
- 위의 `equals()` 메서드를 통해 인스턴스를 비교할 때 같은 세트로...

```java
index = hash(key);
// index: 저장위치
// hash: 해시함수
// key: 객체정보
```
