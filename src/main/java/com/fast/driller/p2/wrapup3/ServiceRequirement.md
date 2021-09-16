# 설명에 따른 객체를 구현하기

- 자동차 공장이 있다. 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는 제작될 때마다 고유한 번호가 부여된다.  
- 자동차 번호가 10001부터 시작되어, 자동차가 생산될 때마다 10002, 10003, ...으로 자동차 번호가 증가하도록 자동차 공장 클래스와 자동차 클래스를 구현해봐라.  

```java
// CarFactoryTest.java
public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car myTrailblazer = factory.createCar();
        Car yourTrailblazer = factory.createCar();
        
        System.out.println(myTrailblazer.getCarNum()); // 10001
        System.out.println(yourTrailblazer.getCarNum()); // 10002
    }
}
```