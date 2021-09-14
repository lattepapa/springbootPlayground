## 가상 메서드(Virtual Method)

### 일반적인 메서드 호출 상황
이 코드는 다음과 같이 생각할 수 있다.

```java
public class Test {
	int num;
	void aaa() { System.out.println("aaa() 호출") }

public static void main(String[] args) {
		Test a1 = new Test();
		a1.aaa();
		
		Test a2 = new Test();
		a2.aaa();
	}
}
```

|힙 메모리|스택 메모리|메서드 영역|
|---|---|---|
|각 인스턴스(참조변수)|`main()`의 지역변수|`aaa()`|
|---|---|---|
|`a1`의 `num`|`a1`||
|`a2`의 `num`|`a2`||
|-|`args`||

### 가상 메서드(Virtual Method)
가상 메서드 테이블이 메서드들에 대한 주소(address)를 가지고 있으면서, 어떤 메서드가 상속 관계 속에서 **재정의(override)** 되는 경우 해당 재정의 메서드의 새 주소를 맵핑하는 원리를 의미한다.

|클래스|메서드|메서드 주소|
|---|---|---|
|`Customer`|`salePrice`|0xFF00FFAA|
|`Customer`|`showMembershipInfo`|0x112233AA|
|`CustomerVip`|`salePrice`(`@Override`)|0x00335577|
|`CustomerVip`|`showMembershipInfo`|0x112233AA|
|`CustomerVip`|`getPrivateAgencyId`|0x8899BB33|