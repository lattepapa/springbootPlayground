# Override(메서드 재정의)
상위 클래스에 정의된 메서드 내용이 하위 클래스에는 맞지 않는 경우, 내용을 **재정의**할 수 있게 하는 어노테이션

## annotation
컴파일러에게 특별한 정보를 제공해주는 주석
- `@Override` : 재정의된 메서드라는 정보를 제공
- `@FunctionalInterface` : 함수형 인터페이스라는 정보를 제공
- `@Deprecated` : 이후 버전에서 사용되지 않을 변수라는 정보를 제공
- `@SuppressWarnings` : 특정 경고가 나타나지 않도록 함
 (ex) `@SuppressWarnings("deprecation")` : `@Deprecated` 경고를 감춰줌

----

# super
- `this` : 클래스 내부에서 호출할 수 있게 함(클래스 내부에 없다면 상위 클래스 참조)
- `super()` : 하위 클래스가 상위 클래스의 인스턴스를 참조값으로 호출할 수 있게 함  
  마치 생성자가 없다면 클래스 내부에서 default 생성자를 자동으로 만들어주는 것처럼, 상속관계에서 하위 클래스 생성자 안에 상위 클래스 생성자에 대한 명시가 없으면 이 `super()` 를 하위 클래스 생성자 안에 자동으로 만들어준다.

## super 응용
만약 상위 클래스 생성자가 매개변수를 활용한 것이라면, 하위 클래스 생성자에서 이를 바로 받아쓰기 위해선 변주가 필요하다. 예를 들어 상위 클래스 생성자가
```java
public Customer(int customerId, String customerName) {
                          ...

```
와 같이 customerId, customerName을 매개변수로 활용하는 모습이라면, 하위 클래스 생성자에서는 다음과 같이 상위 클래스 생성자를 참조할 수 있다.

옵션 1 : `customerId = 0, customerName = "John Doe"`로 고정된 속성으로 하위 클래스의 인스턴스 생성

```java
public CustomerVip() {
	super(0, "John Doe");
      ...
```

옵션 2 : 하위 클래스에서도 `customerId`와 `customerName`을 자유롭게 속성에 명시하여 인스턴스 생성

```java
  public CustomerVip(int customerId, String customerName) {
      super(customerId, customerName);
      ...
```

옵션 1의 방식으로 하위 클래스의 인스턴스를 만들 경우, 생성자의 매개변수는 필요없고 default 생성자 방식을 쓰면 된다. 반면, 옵션 2의 방식으로 하위 클래스의 인스턴스를 만들 경우, 생성자의 매개변수에 `customerId`와 `customerName`을 지정해야 한다.


----

# 형 변환(Up-Casting)
하위 클래스의 인스턴스를 생성하려고 한다면, 상위 클래스의 인스턴스가 먼저 호출되어 힙 메모리에 생성된다.
- 이 말의 의미는, 상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성하는 것이 자유롭다는 의미이다.
- 이를 "up-casting" 또는 **"형 변환"**이라고 한다.

단, 이렇게 형 변환을 통해 인스턴스가 만들어진다면, 하위 클래스의 고유속성(`vipDiscountRatio`, `vipCSAgentId`)이나 기능은 해당 인스턴스에서 더이상 사용할 수 없게 된다.

(ex) CustomerVip 클래스에서 생성자를 호출할 때 메모리에 속성이 생성되는 순서  
[힙 메모리]  
1 -- `customerId`  
2 -- `customerName`  
3 -- `customerGrade`  
4 -- `bonusPoint`  
5 -- `bonusRatio`

6 -- `vipDiscountRatio`  
7 -- `vipCSAgentId`


따라서 이와 같은 형 변환 특성을 활용하여 다음과 같은 인스턴스 생성이나 변수 대입도 가능하다.
```java
Customer lee = new CustomerVip();

CustomerVip kim = new CustomerVip();
addCustomer(kim);
int addCustomer(Customer park);
```

----

# 가상 메서드(Virtual Method)

## 일반적인 메서드 호출 상황
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

## 가상 메서드(Virtual Method)
가상 메서드 테이블이 메서드들에 대한 주소(address)를 가지고 있으면서, 어떤 메서드가 상속 관계 속에서 **재정의(override)** 되는 경우 해당 재정의 메서드의 새 주소를 맵핑하는 원리를 의미한다.

|클래스|메서드|메서드 주소|
|---|---|---|
|`Customer`|`salePrice`|0xFF00FFAA|
|`Customer`|`showMembershipInfo`|0x112233AA|
|`CustomerVip`|`salePrice`(`@Override`)|0x00335577|
|`CustomerVip`|`showMembershipInfo`|0x112233AA|
|`CustomerVip`|`getPrivateAgencyId`|0x8899BB33|