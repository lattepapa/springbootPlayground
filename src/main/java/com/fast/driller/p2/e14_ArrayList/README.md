## ArrayList
객체 배열을 좀 더 효율적으로 관리하기 위해 java.util에서 제공하는 클래스

### 기존 배열 선언과 사용방식
배열의 길이를 정하고 엘리먼트의 개수가 배열의 길이보다 커지면 배열을 재할당 및 복사
- 따라서 엘리먼트를 추가하거나 삭제 시, 이를 반영하여 다른 엘리먼트들의 이동이 필요했음

### ArrayList의 사용방식
다음의 주요 메서드를 통해 손쉽게 최적 알고리즘으로 엘리먼트들을 제어
- `boolean add(E e)` : 엘리먼트 하나를 배열에 추가(E는 자료형)
- `int size()` : 배열 내 엘리먼트 전체 개수 반환
- `E get(int index)` : 배열 내 index 위치의 엘리먼트 반환
- `E remove(int index)` : 배열 내 index 위치의 엘리먼트 제거 맟 해당값 반환
- `boolean isEmpty()` : 빈배열인지 확인