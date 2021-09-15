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