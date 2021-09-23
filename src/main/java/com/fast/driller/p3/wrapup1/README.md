# SR1 - Abstract 클래스와 Template 메서드
GameLevel 속성을 가진 Player가 존재할 때,
- 각 GameLevel 단계마다 `run()`, `jump()`, `turn()`의 기능이 업그레이드된다.
- BeginnerLevel : 천천히 달림(`run()`만 가능)
- AdvancedLevel : 빠르게 달리고 점프도 가능(`run()`, `jump()`)
- SuperLevel : 엄청 빨리 다리고 높게 점프도 하며 방향전환도 가능(`run()`, `jump()`, `turn()`)

이때, Player는 한번에 하나의 GameLevel 상태만 가질 수 있다. Player가 `play()` 중에,
- `go(int count)`를 호출하면 `run()`
- `count`만큼 `jump()`
- `count`만큼 `turn()`
- `showLevelMessage()`를 호출하면 현재 GameLevel 상태 출력
이 가능하도록 클래스를 구현하라.

![IMG_FB64BF0184E5-1](https://user-images.githubusercontent.com/67884699/134446824-4b918962-4594-49df-9a2f-cc5350bc46e1.jpeg)

--------------

# SR2 - 인터페이스를 활용한 정책 프로그래밍
고객센터에 전화상담을 하는 상담원들이 있다. 고객 콜이 들어오면 일단 대기열에 저장되고, 각 상담원에게 콜이 배분되는데
- 모든 상담원이 동일한 상담 건수를 처리하도록, 상담원 순서대로 배분한다.
- 쉬고 있거나 상담원에게 할당된 통화 수가 가장 적은 상담원에게 배분한다.
- 등급이 높은 고객은 업무능력이 우수한 상담원에게 배정한다.

의 정책에 따른다. 테스트 코드가 아래와 같도록 이를 구현하라.

![callers](https://user-images.githubusercontent.com/67884699/134447472-54b8858e-223b-4247-b4a9-73f72410f707.jpg)
