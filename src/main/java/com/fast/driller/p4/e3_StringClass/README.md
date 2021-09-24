## String 클래스
힙 메모리에 인스턴스로 생성되는 경우와, 상수 풀에 있는 주소를 참조하는 두 가지 방법이 있다.
- 힙 메모리는 생성될 때마다 다른 주소값을 가지지만, 상수 풀의 문자열은 모두 같은 주소값을 가진다.
- 한번 생성된 String은 불변(immutable)이다.
- String을 연결(`concat()`)하면 기존의 String에 연결되는 것이 아니라 새로운 문자열이 생성된다.(즉, 메모리 낭비가 발생)
- 따라서 StringBuilder나 StringBuffer 클래스를 활용하는 것이 바람직한 대안이 될 수 있다.

## StringBuilder, StringBuffer 클래스
문자열을 여러 번 연결하거나 변경하는 경우 유용하다.
- 내부적으로 가변적인 `char[]`를 멤버변수로 가짐으로써, 문자열을 연결할 때 새로운 인스턴스를 생성하지 않고 이 `char[]`를 변경한다.
- 특히 **StringBuffer**는 **멀티쓰레드** 프로그래밍에서 동기화(synchronization)을 보장한다.
- 즉, **싱글쓰레드** 프로그래밍일 경우 **StringBuilder**가 더 권장된다.
- toString() 메서드를 통해 마지막에 String으로 반환하는 것이 필요하다.

### text block
자바 13 버전부터는 문자열을 `""" """` 사이에 이어서 만들 수 있다. 이를 활용하여 손쉽게 서버 사이드에서 클라이언트로 JSON이나 HTML 문자열을 만들어서 보낼 수 있다.

```java
		String strBlock = """
						<div style={{ display: 'block', padding: '10px 2px 10px 2px'}}>
              <h2>안녕하세요<h2>
						</div>""";
```