## Override(메서드 재정의)
상위 클래스에 정의된 메서드 내용이 하위 클래스에는 맞지 않는 경우, 내용을 **재정의**할 수 있게 하는 어노테이션

### annotation
컴파일러에게 특별한 정보를 제공해주는 주석
- `@Override` : 재정의된 메서드라는 정보를 제공
- `@FunctionalInterface` : 함수형 인터페이스라는 정보를 제공
- `@Deprecated` : 이후 버전에서 사용되지 않을 변수라는 정보를 제공
- `@SuppressWarnings` : 특정 경고가 나타나지 않도록 함
 (ex) `@SuppressWarnings("deprecation")` : `@Deprecated` 경고를 감춰줌
