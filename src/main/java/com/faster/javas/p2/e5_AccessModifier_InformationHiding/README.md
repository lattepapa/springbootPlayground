## 접근제어 지시자(Access Modifier)
클래스 외부에서 클래스의 속성, 메서드 생성자를 사용할 수 있는지 여부를 지정하는 키워드

### private
**같은 클래스 내부에서만 접근 가능** (외부는 물론이고 상속관계에서도 접근 불가)  
➡️ `get()` 메서드를 통해 접근할 수 있도록 보완할 수 있음

### default
아무 명시가 안된 상태로, **같은 패키지 내부에서 접근 가능**  (패키지가 다르면 상속관계라도 접근 불가)

### protected
**같은 패키지 또는 상속관계에서 접근 가능** (외부에서는 접근 불가)

### public
클래스 내, 외부를 가리지 않고 어디에서나 접근 가능


## 정보은닉(Information Hiding)
`private`으로 제어한 멤버변수도 `public` 메서드가 제공되면 접근 가능해지지만, 애초에 `public`으로 멤버변수를 운용할 때보다 훨씬 안정적이라고 할 수 있다.