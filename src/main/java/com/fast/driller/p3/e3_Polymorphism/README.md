# 다형성(Polymorphism)
하나의 코드가 여러 자료형으로 구현되고 실행됨으로써 같은 코드에서 여러 다른 실행 결과가 리턴될 수 있게 하는 Java 프로그래밍 특성이다.
- 정보은닉(encapsulation), 상속(inheritance)와 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나이다.

## 다형성을 사용하는 이유
- 상속과 메서드 재정의를 활용하여 확장성 있는 프로그램을 만들 수 있다.
- 상위 클래스에서는 공통적인 부분을 제공하고, 하위 클래스에서는 각 클래스에 맞게 개성있는 기능을 구현하는데 유리해진다.
- 여러 클래스들을 하나의 상위 클래스(즉, 타입)으로 핸들링하기 용이해진다.
- 그런데 만약 다형성을 활용하지 않는다면 `if-else` 문이나 `case` 문을 통해 여러 상속 경우들을 구현하는 수밖에 없게 되는데, 이는 해당 클래스에 대한 재사용성을 죽이는 결과를 초래한다.

-------------

# 상속은 언제 사용할까

## IS-A 관계(is a relationship : inheritance)
일반적인 개념과 구체적인 개념과의 관계인 경우이다. 이 때 상속은 클래스 간 결합도를 높일 수 있는 수단이 된다. 즉, 상위 클래스의 수정이 하위 클래스들에게 많은 영향을 미칠 수 있다. 따라서 계층구조(hierarchy)가 복잡하다면 오히려 곧이곧대로 상속을 적용하는 것이 바람직하지 않을 수 있다.
- 상위 클래스 : 하위 클래스보다 일반적인 개념 (ex) `Employee`
- 하위 클래스 : 상위 클래스보다 구체적인 개념 (ex) `Engineer`

## HAS-A 관계(composition)
클래스가 다른 클래스를 포함하는 관계인 경우이다. 코드 재사용 등을 위해 택하는 가장 일반적인 방법으로, `ArrayList`를 활용하여 라이브러리를 구현하는 식으로 상속을 우회하면서 다형성을 활용한 메서드 picking이 이 방식에 해당한다.

----------

# 다운 캐스팅과 instanceof

## 다운 캐스팅(down-casting)
다운 캐스팅은 형 변환(upcasting)된 클래스를 다시 원래의 타입으로 변환하는 것을 의미한다. 다운 캐스팅이 필요한 경우는 흔하지 않으며, 일반적으로 재정의(override) 다형성(polymorphism)을 활용하여 메서드의 다양한 변주를 사용한다. 꼭 다운 캐스팅이 필요한 경우, 하위 클래스로의 형 변환을 다음과 같이 명시적으로 해야 한다.

```java
Customer lee = new CustomerVip(1001, "이순신");
// upcasting : 묵시적
// 인스턴스 lee를 임의로 CustomerVIP로 upcasting

CustomerVip lee = (CustomerVip)customer;
// downcasting : 명시적
// 인스턴스 lee의 타입이 CustomerVip라는 것이 확실하다면, 해당 인스턴스를 CustomerVip로  downcasting
```

## 형 체크(instanceof)
다운 캐스팅하려는 타입이, 그 대상인지 사전에 체크할 수 있다. 이때 사용되는 것이 형 체크(instanceof)이다.

```java
...
public void isDownCasted(ArrayList<Customer> customerList) {
	for(let i = 0; i < customerList.size(); i++) {
		Customer customer = customerList.get(i);
		if(customer instanceof CustomerVip) {
			CustomerVip lee = (CustomerVip)customer;
			lee.showMembershipInfo();
		} else if {
		...
```